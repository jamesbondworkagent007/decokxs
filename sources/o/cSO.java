package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class cSO {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public cSO() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ cSO copy$default(cSO cso, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cso.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = cso.EZpvd;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = cso.AEQbTJ;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = cso.copydefault;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = cso.OLrzqt;
        }
        return cso.KWHzl(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final cSO KWHzl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new cSO(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cSO)) {
            return false;
        }
        cSO cso = (cSO) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) cso.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) cso.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) cso.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) cso.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) cso.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.lang.String str = this.EZpvd;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.copydefault;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CustomChainAddressView(walletId=" + this.KWHzl + ", coinIds=" + this.EZpvd + ", addresses=" + this.AEQbTJ + ", publicKeys=" + this.copydefault + ", derivePaths=" + this.OLrzqt + ")";
    }

    public cSO(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = str3;
        this.copydefault = str4;
        this.OLrzqt = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: o.cSO.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ cSO(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
