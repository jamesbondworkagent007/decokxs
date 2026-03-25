package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18065fbP {
    public final AbstractC12782ctV EZpvd;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C18065fbP copy$default(C18065fbP c18065fbP, AbstractC12782ctV abstractC12782ctV, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC12782ctV = c18065fbP.EZpvd;
        }
        if ((i & 2) != 0) {
            z = c18065fbP.OLrzqt;
        }
        return c18065fbP.EZpvd(abstractC12782ctV, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18065fbP EZpvd(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        return new C18065fbP(abstractC12782ctV, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18065fbP)) {
            return false;
        }
        C18065fbP c18065fbP = (C18065fbP) obj;
        return Intrinsics.EZpvd(this.EZpvd, c18065fbP.EZpvd) && this.OLrzqt == c18065fbP.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MoreSAItem(wallet=" + this.EZpvd + ", showWalletName=" + this.OLrzqt + ")";
    }

    public C18065fbP(@NotNull AbstractC12782ctV abstractC12782ctV, boolean z) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        this.EZpvd = abstractC12782ctV;
        this.OLrzqt = z;
    }
}
