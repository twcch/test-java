package com.twcch.demo;

public class StringAndJson {

    public static void main(String[] args) {

        String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
                + "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"F\",\"shelter_name\":\"臺中市中途動物醫院\"}]";

        String[] strings = json.split("},");
        strings[0] = strings[0].replace("[{", "");
        strings[1] = strings[1].replace("{", "").replace("}]", "");

        String[] cat = strings[0].split(",");
        String[] dog = strings[1].split(",");

        System.out.println(cat[0]);
        System.out.println(dog[0]);

    }

}
