package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes21.dex */
public final class n5 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f481a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n5(Context context) {
        this.f481a = context;
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        Context context = this.f481a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.zui.deviceidservice", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f481a != null) {
            Intent intent = new Intent();
            intent.setClassName("com.zui.deviceidservice", "com.zui.deviceidservice.DeviceidService");
            i6.a(this.f481a, intent, i3Var, new m5());
        }
    }
}
