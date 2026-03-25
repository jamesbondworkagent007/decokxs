package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6887aXp {
    public static InterfaceC6895aXx AEQbTJ;
    public static InterfaceC6884aXm EZpvd;
    public static InterfaceC6884aXm KWHzl;
    public static final C6887aXp copydefault = new C6887aXp();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC6884aXm AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC6884aXm OLrzqt() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC6884aXm interfaceC6884aXm) {
        EZpvd = interfaceC6884aXm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InterfaceC6895aXx interfaceC6895aXx) {
        AEQbTJ = interfaceC6895aXx;
    }

    private C6887aXp() {
    }

    public final java.lang.String EZpvd(@NotNull byte[] bArr) {
        java.lang.String strKWHzl;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(bArr, "");
            InterfaceC6884aXm interfaceC6884aXm = EZpvd;
            strKWHzl = KWHzl(bArr, interfaceC6884aXm != null ? interfaceC6884aXm.AEQbTJ() : null);
        }
        return strKWHzl;
    }

    public final java.lang.String KWHzl(@NotNull byte[] bArr, C6885aXn c6885aXn) {
        java.lang.String strEncodeToString;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(bArr, "");
            if ((c6885aXn != null ? c6885aXn.KWHzl() : null) == null) {
                return EZpvd();
            }
            try {
                java.security.Signature signature = java.security.Signature.getInstance("SHA256withECDSA");
                signature.initSign(c6885aXn.KWHzl());
                signature.update(bArr);
                strEncodeToString = android.util.Base64.encodeToString(signature.sign(), 2);
                Intrinsics.copydefault((java.lang.Object) strEncodeToString);
            } catch (java.lang.Throwable th) {
                pUU.copydefault("OKAsymmetricSignUtil", java.lang.String.valueOf(th));
                strEncodeToString = "";
            }
            return strEncodeToString;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, C6885aXn c6885aXn) {
        InterfaceC6895aXx interfaceC6895aXx;
        java.lang.String str2;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            java.lang.String strOLrzqt = null;
            if ((c6885aXn != null ? c6885aXn.AEQbTJ() : null) == null || (interfaceC6895aXx = AEQbTJ) == null) {
                return EZpvd();
            }
            if (interfaceC6895aXx != null) {
                try {
                    strOLrzqt = interfaceC6895aXx.OLrzqt(c6885aXn.AEQbTJ(), str);
                    str2 = strOLrzqt != null ? "" : strOLrzqt;
                } catch (java.lang.Throwable th) {
                    pUU.copydefault("OKAsymmetricSignUtil", java.lang.String.valueOf(th));
                    str2 = "";
                }
            } else if (strOLrzqt != null) {
            }
            return str2;
        }
    }

    public final java.lang.String EZpvd() {
        pUU.copydefault("OKAsymmetricSignUtil", "Signing failed, no sign key");
        return "";
    }
}
