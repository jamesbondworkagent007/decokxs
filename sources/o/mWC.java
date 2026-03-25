package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class mWC {
    public final float EZpvd;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ mWC copy$default(mWC mwc, float f, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = mwc.EZpvd;
        }
        if ((i & 2) != 0) {
            str = mwc.copydefault;
        }
        return mwc.OLrzqt(f, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final mWC OLrzqt(float f, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new mWC(f, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mWC)) {
            return false;
        }
        mWC mwc = (mWC) obj;
        return java.lang.Float.compare(this.EZpvd, mwc.EZpvd) == 0 && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) mwc.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (java.lang.Float.hashCode(this.EZpvd) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NativeTokenPrice(price=" + this.EZpvd + ", symbol=" + this.copydefault + ")";
    }

    public mWC(float f, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = f;
        this.copydefault = str;
    }
}
