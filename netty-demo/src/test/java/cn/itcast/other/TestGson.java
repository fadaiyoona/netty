package cn.itcast.other;

import cn.itcast.protocol.Serializer;
import com.google.gson.*;

import java.lang.reflect.Type;

/**
 * @author zhanglin
 * @description 测试Gson序列化，自定义类型序列化器使用
 */
public class TestGson {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().registerTypeAdapter(Class.class, new Serializer.ClassCodec()).create();
        System.out.println(gson.toJson(String.class));
    }
}
