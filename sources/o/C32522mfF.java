package o;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.mfF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32522mfF implements InterfaceC2322AHh {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC2322AHh
    public java.lang.String copydefault() {
        return "Android";
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String AEQbTJ() {
        java.lang.String strCopydefault = xVW.copydefault();
        Intrinsics.checkNotNullExpressionValue(strCopydefault, "");
        return strCopydefault;
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String OLrzqt() {
        return android.os.Build.DEVICE;
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String EZpvd() {
        return android.os.Build.MODEL;
    }

    @Override // o.InterfaceC2322AHh
    public java.lang.String KWHzl() {
        return Build.VERSION.RELEASE;
    }
}
