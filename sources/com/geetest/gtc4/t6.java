package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes21.dex */
public final class t6 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f515a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t6(Context context) {
        this.f515a = context;
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        Context context = this.f515a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.samsung.android.deviceidservice", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f515a != null) {
            Intent intent = new Intent();
            intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
            i6.a(this.f515a, intent, i3Var, new s6());
        }
    }
}
