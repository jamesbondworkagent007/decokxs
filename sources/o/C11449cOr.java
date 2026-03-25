package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11449cOr {
    public final long AEQbTJ;
    public final int KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C11449cOr copy$default(C11449cOr c11449cOr, java.lang.String str, long j, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c11449cOr.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            j = c11449cOr.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            i = c11449cOr.KWHzl;
        }
        return c11449cOr.AEQbTJ(str, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11449cOr AEQbTJ(@NotNull java.lang.String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C11449cOr(str, j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11449cOr)) {
            return false;
        }
        C11449cOr c11449cOr = (C11449cOr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c11449cOr.OLrzqt) && this.AEQbTJ == c11449cOr.AEQbTJ && this.KWHzl == c11449cOr.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + java.lang.Long.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EIP7702InfoEntity(walletId=" + this.OLrzqt + ", chainIndex=" + this.AEQbTJ + ", upgradeStatus=" + this.KWHzl + ")";
    }

    public C11449cOr(@NotNull java.lang.String str, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AEQbTJ = j;
        this.KWHzl = i;
    }
}
