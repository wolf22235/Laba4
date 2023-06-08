package com.example.demo;

import lombok.Getter; //Getter - это метод, с помощью которого получают (считывают) значение переменной
public class Games {
    @Getter private String game; //Название игры
    @Getter private String developers; //Разработчики
    @Getter private String genre; //Жанр
    @Getter private float year;//Год выпуска
    @Getter private float metacritic;//Оценка

    public Games(String game, String developers, String genre, float year, float metacritic) {
        this.game = game; //this - используется для ссылки на текущий класс с учетом метода
        this.developers = developers;
        this.genre = genre;
        this.year = year;
        this.metacritic = metacritic;
    }
    @Override
    public boolean equals(Object obj) { //Указывает, равен ли какой-либо другой объект этому объекту. Метод equals реализует отношение эквивалентности для ненулевых ссылок на объекты
        if(this==obj) return true; //Сравниваем ссылки
        if(obj==null || getClass()!=obj.getClass()) return false; //Проверка
        Games games = (Games) obj; //Новый объект
        if(!game.equals(games.game)) return false;//Проверка с параметром
        if(!developers.equals(games.developers)) return false;
        if(!genre.equals(games.genre)) return false;
        if(year != games.year) return false;
        return metacritic == games.metacritic; //Возвращаем параметр

    }
    @Override
    public int hashCode() {
        int result = (int) ((int)metacritic ^ ((int)metacritic >>> 32)); //вычисление целочисленное значение с логическим сдвигом вправо
        result = 31 * result + game.hashCode(); //вычисление целочисленное значение для конкретного элемента класса
        result = 31 * result + developers.hashCode(); //вычисление целочисленное значение для конкретного элемента класса
        result = 31 * result + genre.hashCode(); //вычисление целочисленное значение для конкретного элемента класса
        result = 31 * result + (int) year; //вычисление целочисленное значение
        return result; //Возвращаем результат
    }
}