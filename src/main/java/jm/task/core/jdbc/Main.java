package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        UserServiceImpl userService = new UserServiceImpl();
        // Создание таблицы
            userService.createUsersTable();
        // Добавление пользователей
            userService.saveUser("Serj", "Tankian", (byte) 54);
            userService.saveUser("Till", "Lindemann", (byte) 59);
            userService.saveUser("James", "Hetfield", (byte) 58);
            userService.saveUser("Axl", "Rose", (byte) 60);
        // Удаление пользователя по Id
            userService.removeUserById(1);
        // Получение пользователей из базы данных
            userService.getAllUsers();
        // Очистка таблицы
            userService.cleanUsersTable();
        //Удаление таблицы
           userService.dropUsersTable();
    }
}
