package ru.itgirl.firstspringproject.Controller;

public class DayOfWeek {

    public enum DayOfWeekEnum {
        monday("Понедельник"),
        tuesday("Вторник"),
        wednesday("Среда"),
        thursday("Четверг"),
        friday("Пятница"),
        saturday("Суббота"),
        sunday("Воскресенье");

        private String russianName;

        DayOfWeekEnum(String russianName) {
            this.russianName = russianName;
        }

        public String getRussianName() {
            return russianName;
        }
    }

}
