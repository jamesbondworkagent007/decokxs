package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes21.dex */
public final class y3 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f538a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y3(Context context) {
        this.f538a = context;
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        Context context = this.f538a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.android.vending", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f538a != null) {
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            i6.a(this.f538a, intent, i3Var, new x3());
        }
    }
}
