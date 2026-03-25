package com.geetest.gtc4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes21.dex */
public final class s0 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f502a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s0(Context context) {
        this.f502a = context;
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        Context context = this.f502a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.asus.msa.SupplementaryDID", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f502a != null) {
            Intent intent = new Intent("com.asus.msa.action.ACCESS_DID");
            intent.setComponent(new ComponentName("com.asus.msa.SupplementaryDID", "com.asus.msa.SupplementaryDID.SupplementaryDIDService"));
            i6.a(this.f502a, intent, i3Var, new r0());
        }
    }
}
