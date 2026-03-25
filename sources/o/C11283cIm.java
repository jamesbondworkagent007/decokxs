package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cIm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11283cIm {
    public final int AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.Long OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C11283cIm copy$default(C11283cIm c11283cIm, int i, long j, java.lang.String str, java.lang.Long l, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = c11283cIm.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            j = c11283cIm.copydefault;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str = c11283cIm.KWHzl;
        }
        java.lang.String str3 = str;
        if ((i2 & 8) != 0) {
            l = c11283cIm.OLrzqt;
        }
        java.lang.Long l2 = l;
        if ((i2 & 16) != 0) {
            str2 = c11283cIm.EZpvd;
        }
        return c11283cIm.AEQbTJ(i, j2, str3, l2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11283cIm AEQbTJ(int i, long j, @NotNull java.lang.String str, java.lang.Long l, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C11283cIm(i, j, str, l, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.lang.String str) {
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.lang.Long l) {
        this.OLrzqt = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11283cIm)) {
            return false;
        }
        C11283cIm c11283cIm = (C11283cIm) obj;
        return this.AEQbTJ == c11283cIm.AEQbTJ && this.copydefault == c11283cIm.copydefault && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c11283cIm.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c11283cIm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c11283cIm.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Long.hashCode(this.copydefault);
        int iHashCode3 = this.KWHzl.hashCode();
        java.lang.Long l = this.OLrzqt;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        java.lang.String str = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletAddressSignItem(addressType=" + this.AEQbTJ + ", chainIndex=" + this.copydefault + ", chainSign=" + this.KWHzl + ", baseChainIndex=" + this.OLrzqt + ", baseChainSign=" + this.EZpvd + ")";
    }

    public C11283cIm(int i, long j, @NotNull java.lang.String str, java.lang.Long l, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = i;
        this.copydefault = j;
        this.KWHzl = str;
        this.OLrzqt = l;
        this.EZpvd = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0013: CONSTRUCTOR 
  (r10v0 int)
  (r11v0 long)
  (r13v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
 A[MD:(int, long, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:14) call: o.cIm.<init>(int, long, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ C11283cIm(int i, long j, java.lang.String str, java.lang.Long l, java.lang.String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, str, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? null : str2);
    }
}
