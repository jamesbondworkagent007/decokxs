package com.geetest.gtc4;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import com.google.common.primitives.UnsignedBytes;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes21.dex */
public class m6 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f478a;
    public String b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public m6(Context context) {
        if (context instanceof Application) {
            this.f478a = context;
        } else {
            this.f478a = context.getApplicationContext();
        }
    }

    @Override // com.geetest.gtc4.x4
    public boolean a() {
        Context context = this.f478a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo("com.heytap.openid", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public void a(i3 i3Var) {
        if (this.f478a != null) {
            Intent intent = new Intent("action.com.heytap.openid.OPEN_ID_SERVICE");
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            i6.a(this.f478a, intent, i3Var, new l6(this));
        }
    }

    public final String a(IBinder iBinder) {
        String packageName = this.f478a.getPackageName();
        String str = this.b;
        if (str == null) {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(this.f478a.getPackageManager().getPackageInfo(packageName, 64).signatures[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & UnsignedBytes.MAX_VALUE) | 256).substring(1, 3));
            }
            String string = sb.toString();
            this.b = string;
            return a(iBinder, packageName, string);
        }
        return a(iBinder, packageName, str);
    }

    public String a(IBinder iBinder, String str, String str2) {
        z4 y4Var;
        int i = e5.f441a;
        if (iBinder == null) {
            y4Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.heytap.openid.IOpenID");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof z4)) {
                y4Var = (z4) iInterfaceQueryLocalInterface;
            } else {
                y4Var = new y4(iBinder);
            }
        }
        if (y4Var != null) {
            return y4Var.a(str, str2);
        }
        throw new e6("IOpenID is null");
    }
}
