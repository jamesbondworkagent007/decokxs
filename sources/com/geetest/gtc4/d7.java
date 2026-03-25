package com.geetest.gtc4;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Base64;

/* JADX INFO: loaded from: classes21.dex */
public final class d7 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String a(IBinder iBinder) {
        c5 a5Var;
        try {
            int i = b5.f426a;
            if (iBinder == null) {
                a5Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.tencent.soter.soterserver.ISoterService");
                a5Var = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c5)) ? new a5(iBinder) : (c5) iInterfaceQueryLocalInterface;
            }
            return Base64.encodeToString(((a5) a5Var).a().b, 0).trim();
        } catch (Exception unused) {
            return "";
        }
    }
}
