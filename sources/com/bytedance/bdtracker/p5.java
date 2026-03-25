package com.bytedance.bdtracker;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes14.dex */
public class p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o5 f242a = new o5();
    public static final Map<String, String> b = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static String a(String str) {
        Map<String, String> map = b;
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        String strA = f242a.a(str);
        if (strA != null) {
            map.put(str, strA);
        }
        return strA;
    }
}
