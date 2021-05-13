package com.company;

public class MyString {
    public char[] myStr; // це змінна об'єкту класу
    public Integer length; // це теж

    public MyString (String str) {
        this.myStr = str.toCharArray();
        this.length = this.myStr.length;
    }

    public char[] getMyStr() {
        return this.myStr;
    } //        Оце прикда методу

    public Integer length() {
//        Оце прикда методу
        return this.myStr.length;
    }
}