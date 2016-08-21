package jp.techacademy.taro.kirameki.javalog;

import android.util.Log;

/**
 * Created by ym on 16/08/21.
 */
public class Human extends Animal implements Thinkable {

    String hobby;

    Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public void say() {
        Log.d("javatest",
                "私の名前は" + this.name + "です。年は" + this.age + "歳です。");

    }

    @Override
    public void think() {
        Log.d("javatest",
                "私は" + this.hobby + "について考える");
    }
}
