package com.bytedance.applog;

import com.bytedance.bdtracker.b;
import com.bytedance.bdtracker.r;

/* JADX INFO: loaded from: classes14.dex */
public final class AppLogManager {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static IAppLogInstance getInstance(String str) {
        if (r.c(str)) {
            return null;
        }
        return b.a(str);
    }
}
