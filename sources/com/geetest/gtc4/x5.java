package com.geetest.gtc4;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: loaded from: classes21.dex */
public final class x5 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f533a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public x5(Context context) {
        this.f533a = context;
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        Context context = this.f533a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.mdid.msa", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f533a != null) {
            try {
                Intent intent = new Intent("com.bun.msa.action.start.service");
                intent.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaKlService");
                intent.putExtra("com.bun.msa.param.pkgname", this.f533a.getPackageName());
                if (Build.VERSION.SDK_INT < 26) {
                    this.f533a.startService(intent);
                } else {
                    this.f533a.startForegroundService(intent);
                }
            } catch (Exception unused) {
            }
            Intent intent2 = new Intent("com.bun.msa.action.bindto.service");
            intent2.setClassName("com.mdid.msa", "com.mdid.msa.service.MsaIdService");
            intent2.putExtra("com.bun.msa.param.pkgname", this.f533a.getPackageName());
            i6.a(this.f533a, intent2, i3Var, new w5());
        }
    }
}
