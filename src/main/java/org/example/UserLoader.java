package org.example;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.example.dto.User;
import com.google.gson.stream.JsonReader;
import org.example.helpers.ResourceLoader;

import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class UserLoader {

    public static List<User> loadUsersFromJson(String filePath) throws IOException {
        // Додайте реалізацію метода, який
        // з JSON файлу який знаходиться за відносним шляхом filepath
        // з допомогою вбудованих засобів бібліотеки https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1
        // десеріалізує контент JSON файлу у список з об*єктів типу User і повертає список
        String string = new String(Files.readAllBytes(Paths.get("src/main/resources/users.json")));
        Type type = new TypeToken<List<User>>() {}.getType();

        return new Gson().fromJson(string, type);

    }
}

