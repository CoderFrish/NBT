package io.github.xiefrish2021.tag.compound;

import org.jetbrains.annotations.NotNull;
import io.github.xiefrish2021.ITag;
import io.github.xiefrish2021.TagType;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Consumer;

public class CompoundTag implements Iterable<CompoundTag.Entry>, ITag {
    private final Map<String, ITag> compounds = new LinkedHashMap<>();

    public TagType type() {
        return TagType.COMPOUND;
    }

    public @NotNull Iterator<Entry> iterator() {
        List<Entry> list = new ArrayList<>();
        compounds.forEach((key, value) -> list.add(new Entry() {
            @Override
            public String key() {
                return key;
            }

            @Override
            public ITag value() {
                return value;
            }
        }));

        return list.iterator();
    }

    public void forEach(Consumer<? super Entry> action) {
        for (Map.Entry<String, ITag> entry : compounds.entrySet()) {
            action.accept(new Entry() {
                @Override
                public String key() {
                    return entry.getKey();
                }

                @Override
                public ITag value() {
                    return entry.getValue();
                }
            });
        }
    }

    public Spliterator<Entry> spliterator() {
        List<Entry> list = new ArrayList<>();
        compounds.forEach((key, value) -> list.add(new Entry() {
            @Override
            public String key() {
                return key;
            }

            @Override
            public ITag value() {
                return value;
            }
        }));

        return list.spliterator();
    }

    public @NotNull CompoundTag put(@NotNull String key, @NotNull ITag value) {
        compounds.put(key, value);
        return this;
    }

    public @NotNull CompoundTag putAll(@NotNull CompoundTag compound) {
        for (Entry entry : this) {
            if (compound.containsKey(entry.key())) {
                replace(entry.key(), entry.value());
            } else {
                put(entry.key(), entry.value());
            }
        }

        return this;
    }

    public boolean remove(String key) {
        return this.remove(key, get(key).asTag());
    }

    public boolean remove(String key, ITag value) {
        return compounds.remove(key, value);
    }

    public CompoundTag replace(String key, ITag oldValue, ITag newValue) {
        compounds.replace(key, oldValue, newValue);
        return this;
    }

    public CompoundTag replace(String key, ITag newValue) {
        this.replace(key, get(key).asTag(), newValue);
        return this;
    }

    public @NotNull NBTElement get(@NotNull String key) {
        return new NBTElement(compounds.get(key));
    }

    public @NotNull NBTElement get(@NotNull String key, @NotNull ITag defaultValue) {
        if (!containsKey(key)) return new NBTElement(defaultValue);
        return get(key);
    }

    public boolean containsKey(String key) {
        return compounds.containsKey(key);
    }

    public boolean containsValue(ITag value) {
        return compounds.containsValue(value);
    }

    public boolean isEmpty() {
        return compounds.isEmpty();
    }

    public void clear() {
        compounds.clear();
    }

    public int size() {
        return compounds.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        int i = 0;
        for (CompoundTag.Entry entry : this) {
            if (entry.key().matches("[0-9A-Za-z_\\-.+]+")) {
                builder.append(entry.key());
            } else {
                builder.append("\"").append(entry.key()).append("\"");
            }

            builder.append(":").append(" ");
            builder.append(entry.value().toString());

            if (i < size() - 1) {
                builder.append(",");
            }

            i++;
        }
        builder.append("}");

        return builder.toString();
    }

    public interface Entry {
        String key();

        ITag value();
    }
}
