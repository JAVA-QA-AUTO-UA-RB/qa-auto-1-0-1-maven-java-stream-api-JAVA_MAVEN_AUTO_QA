package org.example;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.dto.User;
import java.lang.reflect.Type;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class UserLoader {

    public static List<User> loadUsersFromJson(String filePath) throws IOException {
        // Додайте реалізацію метода, який
        // з JSON файлу який знаходиться за відносним шляхом filepath
        // з допомогою вбудованих засобів бібліотеки https://mvnrepository.com/artifact/com.google.code.gson/gson/2.10.1
        // десеріалізує контент JSON файлу у список з об*єктів типу User і повертає список
        Gson gson = new Gson();
        List<User> userList;
        FileReader reader = new FileReader(filePath);
        Type userListType = new TypeToken<List<User>>() {}.getType();
        userList = gson.fromJson(reader, userListType);
        return userList;
    }
}
