package me.coderfrish.test;

import me.coderfrish.nbt.NBTOutput;
import me.coderfrish.nbt.type.NBTCompound;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class OutputTest {
    @Test
    public void test() {
//        try(NBTOutput output = new NBTOutput(new FileOutputStream("D:\\NBT\\test\\src\\test\\resources\\test.nbt"))) {
//            Map<String, Object> objectMap = new HashMap<>();
//            objectMap.put("key", "value");
//            objectMap.put("safa", "dfs");
//            objectMap.put("aa", "aa");
//            objectMap.put("aas", true);
//
//            output.write(objectMap);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        try(NBTOutput output = new NBTOutput(Files.newOutputStream(Paths.get("D:\\NBT\\test\\src\\test\\resources\\test1.nbt")))) {
            NBTCompound object = new NBTCompound();
            object.put("name", "Frish2021");
            object.put("age", 15);
            object.put("test", 1156465465L);
            object.put("tests", (short) 54);
            object.put("testss", 1.5F);
            object.put("testsss", 1.5);

            output.write("hello", object);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
