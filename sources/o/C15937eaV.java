package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.eaV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15937eaV {
    public final java.lang.String EZpvd;
    public final AbstractC8610bFv<?> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.eaV */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C15937eaV copy$default(C15937eaV c15937eaV, java.lang.String str, AbstractC8610bFv abstractC8610bFv, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c15937eaV.EZpvd;
        }
        if ((i & 2) != 0) {
            abstractC8610bFv = c15937eaV.KWHzl;
        }
        return c15937eaV.KWHzl(str, abstractC8610bFv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC8610bFv<?> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C15937eaV KWHzl(java.lang.String str, AbstractC8610bFv<?> abstractC8610bFv) {
        return new C15937eaV(str, abstractC8610bFv);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15937eaV)) {
            return false;
        }
        C15937eaV c15937eaV = (C15937eaV) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c15937eaV.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c15937eaV.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        AbstractC8610bFv<?> abstractC8610bFv = this.KWHzl;
        return (iHashCode * 31) + (abstractC8610bFv != null ? abstractC8610bFv.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConnectAndSignData(walletAddress=" + this.EZpvd + ", signMessage=" + this.KWHzl + ")";
    }

    public C15937eaV(java.lang.String str, AbstractC8610bFv<?> abstractC8610bFv) {
        this.EZpvd = str;
        this.KWHzl = abstractC8610bFv;
    }
}
