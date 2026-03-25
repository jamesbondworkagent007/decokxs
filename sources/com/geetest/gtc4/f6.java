package com.geetest.gtc4;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes21.dex */
public abstract class f6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static x4 f449a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static x4 a(Context context) {
        x4 n5Var;
        if (context != null && !(context instanceof Application)) {
            context = context.getApplicationContext();
        }
        x4 x4Var = f449a;
        if (x4Var != null) {
            return x4Var;
        }
        if (g6.d() || g6.f()) {
            n5Var = new n5(context);
        } else if (g6.e()) {
            n5Var = new s5(context);
        } else if (g6.g()) {
            n5Var = new c6(context);
        } else if (g6.l() || !TextUtils.isEmpty(g6.a("ro.miui.ui.version.name", "")) || g6.b()) {
            n5Var = new x7(context);
        } else if (g6.j()) {
            n5Var = new t6(context);
        } else if (g6.k()) {
            n5Var = new w7(context);
        } else if (g6.a()) {
            n5Var = new s0(context);
        } else if (g6.i() || g6.h()) {
            n5Var = new m6(context);
            if (!n5Var.a()) {
                n5Var = new k6(context);
            }
        } else {
            try {
                context.getPackageManager().getPackageInfo("com.coolpad.deviceidsupport", 0);
                n5Var = new w1(context);
            } catch (Exception unused) {
                n5Var = g6.a("ro.odm.manufacturer", "").equalsIgnoreCase("PRIZE") ? new x1(context) : !TextUtils.isEmpty(g6.a("ro.build.freeme.label", "")) ? new o3(context) : null;
            }
        }
        f449a = n5Var;
        if (n5Var != null && n5Var.a()) {
            f449a.getClass();
            return f449a;
        }
        x4 x5Var = new x5(context);
        if (!x5Var.a()) {
            x5Var = new y3(context);
            if (!x5Var.a()) {
                x5Var = new g3();
            }
        }
        f449a = x5Var;
        return x5Var;
    }
}
