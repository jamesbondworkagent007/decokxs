package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kPh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28111kPh implements InterfaceC28107kPd {
    public java.lang.String OLrzqt = "default_trade";
    public java.lang.String copydefault = "0";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC28107kPd
    public java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    @Override // o.InterfaceC28107kPd
    public boolean OLrzqt() {
        return Intrinsics.EZpvd((java.lang.Object) EZpvd(), (java.lang.Object) "1");
    }
}
