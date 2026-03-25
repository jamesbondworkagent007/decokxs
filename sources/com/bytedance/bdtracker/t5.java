package com.bytedance.bdtracker;

import android.view.View;
import com.bytedance.applog.log.LoggerImpl;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class t5 {
    public static Field b;
    public static Class c;
    public static Class d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f264a = Collections.singletonList("WindowHelper");
    public static boolean e = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static void a() {
        if (e) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            b = cls.getDeclaredField("mViews");
            Field declaredField = cls.getDeclaredField("sDefaultWindowManager");
            b.setAccessible(true);
            if (b.getType() != ArrayList.class) {
                b.getType();
            }
            declaredField.setAccessible(true);
            declaredField.get(null);
        } catch (Throwable th) {
            LoggerImpl.global().error(f264a, "Get window manager views failed", th, new Object[0]);
        }
        try {
            try {
                c = Class.forName("com.android.internal.policy.PhoneWindow$DecorView");
            } catch (ClassNotFoundException unused) {
                c = Class.forName("com.android.internal.policy.DecorView");
            }
        } catch (Throwable th2) {
            LoggerImpl.global().error(f264a, "Get DecorView failed", th2, new Object[0]);
        }
        try {
            d = Class.forName("android.widget.PopupWindow$PopupDecorView");
        } catch (Throwable th3) {
            LoggerImpl.global().error(f264a, "Get popup view failed", th3, new Object[0]);
        }
        e = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean a(View view) {
        if (!e) {
            a();
        }
        Class<?> cls = view.getClass();
        return cls == c || cls == d;
    }
}
