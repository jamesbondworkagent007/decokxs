package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Asn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C3802Asn {
    public static final int $stable = 8;
    public C3810Asv EZpvd;
    public C3810Asv KWHzl;
    public boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C3802Asn copy$default(C3802Asn c3802Asn, boolean z, C3810Asv c3810Asv, C3810Asv c3810Asv2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c3802Asn.OLrzqt;
        }
        if ((i & 2) != 0) {
            c3810Asv = c3802Asn.KWHzl;
        }
        if ((i & 4) != 0) {
            c3810Asv2 = c3802Asn.EZpvd;
        }
        return c3802Asn.AEQbTJ(z, c3810Asv, c3810Asv2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3802Asn AEQbTJ(boolean z, @NotNull C3810Asv c3810Asv, @NotNull C3810Asv c3810Asv2) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        Intrinsics.checkNotNullParameter(c3810Asv2, "");
        return new C3802Asn(z, c3810Asv, c3810Asv2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C3810Asv KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3802Asn)) {
            return false;
        }
        C3802Asn c3802Asn = (C3802Asn) obj;
        return this.OLrzqt == c3802Asn.OLrzqt && Intrinsics.EZpvd(this.KWHzl, c3802Asn.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c3802Asn.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((java.lang.Boolean.hashCode(this.OLrzqt) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LargeQuoteInfo(isEnabled=" + this.OLrzqt + ", quoteLimit=" + this.KWHzl + ", channelLimit=" + this.EZpvd + ")";
    }

    public C3802Asn(boolean z, @NotNull C3810Asv c3810Asv, @NotNull C3810Asv c3810Asv2) {
        Intrinsics.checkNotNullParameter(c3810Asv, "");
        Intrinsics.checkNotNullParameter(c3810Asv2, "");
        this.OLrzqt = z;
        this.KWHzl = c3810Asv;
        this.EZpvd = c3810Asv2;
    }
}
