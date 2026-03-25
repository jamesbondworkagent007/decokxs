package com.geetest.gtc4;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes21.dex */
public abstract class c7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(Context context, Intent intent, b7 b7Var) {
        e7 e7Var = new e7(context, b7Var, new d7());
        try {
            Application application = e7Var.f442a;
            if (application != null) {
                if (!application.bindService(intent, e7Var, 1)) {
                    throw new IllegalStateException("Service binding failed");
                }
            } else {
                b7 b7Var2 = e7Var.b;
                new IllegalStateException("Cannot get activity");
                b7Var2.b.countDown();
            }
        } catch (Exception unused) {
            e7Var.b.b.countDown();
        }
    }
}
