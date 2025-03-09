package org.knit.lab9.task17;

import java.lang.reflect.Field;

public class Validator {
    public static void validate(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            //разрешает доступ к private переменным
            field.setAccessible(true);
            Object value = field.get(obj);

            // Проверка @NotNull
            if (field.isAnnotationPresent(NotNull.class) && value == null) {
                System.out.println("Поле " + field.getName() + " не должно быть null.");
            }


            // Проверка @MaxLength
            // пример получения значения value из Аннотации
            // int maxLength = field.getAnnotation(MaxLength.class).value();


            if (field.isAnnotationPresent(MaxLength.class)) {
                int maxLength = field.getAnnotation(MaxLength.class).value();
                if (value instanceof String && maxLength < ((String)value).length()) {
                    System.out.println("Поле " + field.getName() + " превышает максимальную длину 10");
                }

            }

            // Проверка @Min
            if (field.isAnnotationPresent(MinLeght.class)) {
                int minLeght = field.getAnnotation(MinLeght.class).value();
                if (value instanceof Integer && minLeght > ((Integer)value)) {
                    System.out.println("Поле " + field.getName() + " должно быть не меньше 18.");
                }

            }
        }
    }
}
