package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class cSQ {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public cSQ() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ cSQ copy$default(cSQ csq, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = csq.gEmmrt;
        }
        if ((i & 2) != 0) {
            str2 = csq.KWHzl;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = csq.OLrzqt;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = csq.EZpvd;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = csq.AEQbTJ;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = csq.copydefault;
        }
        return csq.AEQbTJ(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cSQ AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        return new cSQ(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cSQ)) {
            return false;
        }
        cSQ csq = (cSQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) csq.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) csq.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) csq.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) csq.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) csq.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) csq.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        java.lang.String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AEQbTJ;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CustomChainCoinBalanceView(walletId=" + this.gEmmrt + ", coinIds=" + this.KWHzl + ", amounts=" + this.OLrzqt + ", ccyAmounts=" + this.EZpvd + ", orderValues=" + this.AEQbTJ + ", createAts=" + this.copydefault + ")";
    }

    public cSQ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
        this.KWHzl = str2;
        this.OLrzqt = str3;
        this.EZpvd = str4;
        this.AEQbTJ = str5;
        this.copydefault = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: o.cSQ.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ cSQ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) == 0 ? str6 : null);
    }
}
