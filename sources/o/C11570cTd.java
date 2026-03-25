package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.cTd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C11570cTd {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.Long KWHzl;
    public java.lang.Integer OLrzqt;
    public java.lang.Integer copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C11570cTd() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C11570cTd copy$default(C11570cTd c11570cTd, java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c11570cTd.gEmmrt;
        }
        if ((i & 2) != 0) {
            num = c11570cTd.copydefault;
        }
        java.lang.Integer num3 = num;
        if ((i & 4) != 0) {
            num2 = c11570cTd.OLrzqt;
        }
        java.lang.Integer num4 = num2;
        if ((i & 8) != 0) {
            str2 = c11570cTd.AEQbTJ;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            str3 = c11570cTd.EZpvd;
        }
        java.lang.String str5 = str3;
        if ((i & 32) != 0) {
            l = c11570cTd.KWHzl;
        }
        return c11570cTd.OLrzqt(str, num3, num4, str4, str5, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C11570cTd OLrzqt(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.lang.Long l) {
        return new C11570cTd(str, num, num2, str2, str3, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11570cTd)) {
            return false;
        }
        C11570cTd c11570cTd = (C11570cTd) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c11570cTd.gEmmrt) && Intrinsics.EZpvd(this.copydefault, c11570cTd.copydefault) && Intrinsics.EZpvd(this.OLrzqt, c11570cTd.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c11570cTd.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c11570cTd.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c11570cTd.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.gEmmrt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.copydefault;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.OLrzqt;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.Long l = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletRepairView(walletId=" + this.gEmmrt + ", identifierType=" + this.copydefault + ", repairStatus=" + this.OLrzqt + ", repairReserved=" + this.AEQbTJ + ", repairExtJson=" + this.EZpvd + ", repairTimestamp=" + this.KWHzl + ")";
    }

    public C11570cTd(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.lang.Long l) {
        this.gEmmrt = str;
        this.copydefault = num;
        this.OLrzqt = num2;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
        this.KWHzl = l;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.Integer:0x0011: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Integer:0x001a: TERNARY null = ((wrap:int:0x0012: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0028: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r10v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:16) call: o.cTd.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ C11570cTd(java.lang.String str, java.lang.Integer num, java.lang.Integer num2, java.lang.String str2, java.lang.String str3, java.lang.Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0 : num, (i & 4) != 0 ? 0 : num2, (i & 8) != 0 ? null : str2, (i & 16) == 0 ? str3 : null, (i & 32) != 0 ? 0L : l);
    }
}
