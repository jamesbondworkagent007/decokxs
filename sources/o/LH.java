package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LH {
    public final java.util.Map<java.lang.String, java.lang.Object> AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.LH */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LH copy$default(LH lh, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = lh.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = lh.copydefault;
        }
        if ((i & 4) != 0) {
            str3 = lh.EZpvd;
        }
        if ((i & 8) != 0) {
            map = lh.AEQbTJ;
        }
        return lh.OLrzqt(str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Map<java.lang.String, java.lang.Object> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LH OLrzqt(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LH(str, str2, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LH)) {
            return false;
        }
        LH lh = (LH) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) lh.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) lh.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) lh.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, lh.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.copydefault;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.util.Map<java.lang.String, java.lang.Object> map = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Exposure(flagKey=" + this.KWHzl + ", variant=" + this.copydefault + ", experimentKey=" + this.EZpvd + ", metadata=" + this.AEQbTJ + ')';
    }

    public LH(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.AEQbTJ = map;
    }
}
