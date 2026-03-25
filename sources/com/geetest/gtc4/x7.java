package com.geetest.gtc4;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
public final class x7 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f534a;
    public final Class b;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x7(Context context) {
        this.f534a = context;
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            this.b = cls;
            this.c = cls.newInstance();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        return this.c != null;
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f534a != null) {
            Class cls = this.b;
            if (cls != null && this.c != null) {
                try {
                    String str = (String) cls.getMethod("getOAID", Context.class).invoke(this.c, this.f534a);
                    if (str != null && !str.isEmpty()) {
                        i3Var.f460a.set(str);
                        i3Var.b.countDown();
                        return;
                    }
                    throw new e6("OAID query failed");
                } catch (Exception unused) {
                    i3Var.b.countDown();
                    return;
                }
            }
            new e6("Xiaomi IdProvider not exists");
            i3Var.b.countDown();
        }
    }
}
