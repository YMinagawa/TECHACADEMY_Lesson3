package jp.techacademy.taro.kirameki.javalog;

import android.util.Log;

/**
 * Created by ym on 16/08/20.
 */

public class Dog extends Animal{

    //クラス変数
    static String to_jp = "犬";

    //メンバ
    //String name;
    //int age;


    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    //クラス関す
    public static void introduce(){
        Log.d("javatest", "これは犬クラスです");
    }

    public void say(){
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }


}
