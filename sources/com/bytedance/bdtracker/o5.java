package com.bytedance.bdtracker;

import android.os.SystemProperties;
import com.bytedance.applog.log.LoggerImpl;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class o5 {
    public static volatile Object b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<String> f238a = Collections.singletonList("SystemPropertiesProxy");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object a() {
        if (b == null) {
            synchronized (o5.class) {
                if (b == null) {
                    try {
                        b = Class.forName("android.os.SystemProperties").newInstance();
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
        }
        return b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String a(String str) {
        try {
            return SystemProperties.get(str);
        } catch (Throwable th) {
            LoggerImpl.global().error(this.f238a, "Get key:{} value failed", th, str);
            try {
                Object objA = a();
                return (String) objA.getClass().getMethod("get", String.class).invoke(objA, str);
            } catch (Throwable th2) {
                LoggerImpl.global().error(this.f238a, "Get key:{} value by reflection failed", th2, str);
                return "";
            }
        }
    }
}
