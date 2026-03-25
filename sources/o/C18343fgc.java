package o;

import com.okinc.business.defi.wallet.home.WcConnectExtra;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18343fgc {
    public final WcConnectExtra KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18343fgc copy$default(C18343fgc c18343fgc, java.lang.String str, WcConnectExtra wcConnectExtra, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18343fgc.copydefault;
        }
        if ((i & 2) != 0) {
            wcConnectExtra = c18343fgc.KWHzl;
        }
        return c18343fgc.EZpvd(str, wcConnectExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18343fgc EZpvd(@NotNull java.lang.String str, WcConnectExtra wcConnectExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C18343fgc(str, wcConnectExtra);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WcConnectExtra OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18343fgc)) {
            return false;
        }
        C18343fgc c18343fgc = (C18343fgc) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c18343fgc.copydefault) && Intrinsics.EZpvd(this.KWHzl, c18343fgc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        WcConnectExtra wcConnectExtra = this.KWHzl;
        return (iHashCode * 31) + (wcConnectExtra == null ? 0 : wcConnectExtra.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "DappLinkWalletConnectUrl(url=" + this.copydefault + ", extra=" + this.KWHzl + ")";
    }

    public C18343fgc(@NotNull java.lang.String str, WcConnectExtra wcConnectExtra) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.KWHzl = wcConnectExtra;
    }
}
