package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class kFQ {
    public final java.lang.String KWHzl;
    public final float OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ kFQ copy$default(kFQ kfq, java.lang.String str, int i, float f, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = kfq.KWHzl;
        }
        if ((i2 & 2) != 0) {
            i = kfq.copydefault;
        }
        if ((i2 & 4) != 0) {
            f = kfq.OLrzqt;
        }
        return kfq.AEQbTJ(str, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kFQ AEQbTJ(@NotNull java.lang.String str, int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new kFQ(str, i, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kFQ)) {
            return false;
        }
        kFQ kfq = (kFQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) kfq.KWHzl) && this.copydefault == kfq.copydefault && java.lang.Float.compare(this.OLrzqt, kfq.OLrzqt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault)) * 31) + java.lang.Float.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RecyclerViewEmpty(text=" + this.KWHzl + ", marginTop=" + this.copydefault + ", padding=" + this.OLrzqt + ")";
    }

    public kFQ(@NotNull java.lang.String str, int i, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.copydefault = i;
        this.OLrzqt = f;
    }
}
