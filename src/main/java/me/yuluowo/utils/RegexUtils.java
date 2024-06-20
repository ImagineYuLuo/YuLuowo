package me.yuluowo.utils;

public class RegexUtils {
    public static String regexMinecraftItemID(String item){
        return item.replace("minecraft:", "").replace("(", "").replace(")", "");
    }
}
