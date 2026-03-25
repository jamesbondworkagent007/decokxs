package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gwS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C21261gwS {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final long copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C21261gwS copy$default(C21261gwS c21261gwS, java.lang.String str, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c21261gwS.OLrzqt;
        }
        if ((i & 2) != 0) {
            j = c21261gwS.copydefault;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str2 = c21261gwS.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c21261gwS.KWHzl;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = c21261gwS.EZpvd;
        }
        return c21261gwS.OLrzqt(str, j2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
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
    public final C21261gwS OLrzqt(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C21261gwS(str, j, str2, str3, str4);
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
        if (!(obj instanceof C21261gwS)) {
            return false;
        }
        C21261gwS c21261gwS = (C21261gwS) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c21261gwS.OLrzqt) && this.copydefault == c21261gwS.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c21261gwS.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c21261gwS.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c21261gwS.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int iHashCode2 = java.lang.Long.hashCode(this.copydefault);
        int iHashCode3 = this.AEQbTJ.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PopUpWindowItemUiData(tokenName=" + this.OLrzqt + ", coinId=" + this.copydefault + ", address=" + this.AEQbTJ + ", icon=" + this.KWHzl + ", assetValue=" + this.EZpvd + ")";
    }

    public C21261gwS(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = str;
        this.copydefault = j;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
        this.EZpvd = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 long)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
 A[MD:(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:387) call: o.gwS.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C21261gwS(java.lang.String str, long j, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
