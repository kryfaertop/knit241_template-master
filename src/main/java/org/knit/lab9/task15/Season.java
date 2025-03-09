package org.knit.lab9.task15;

 enum  Season {
    WINTER("Холодно", "новый год"),
    SUMMER("Жарко","каникулы"),
    AUTUMN("Тепло", "пасха"),
    SPRING("Прохладно", "хеллоин");


     private final String temperature;
     private final String holiday;

     // Конструктор для Enum
     Season(String temperature, String holiday) {
         this.temperature = temperature;
         this.holiday = holiday;
     }

     // Геттеры
     public String getTemperature() {
         return temperature;
     }

     public String getHoliday() {
         return holiday;
     }
 }



