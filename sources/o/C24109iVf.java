package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iVf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C24109iVf {
    public final java.lang.Integer AEQbTJ;
    public final java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.Long KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C24109iVf() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C24109iVf copy$default(C24109iVf c24109iVf, java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            l = c24109iVf.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c24109iVf.valueOf;
        }
        java.lang.String str6 = str;
        if ((i & 4) != 0) {
            str2 = c24109iVf.OLrzqt;
        }
        java.lang.String str7 = str2;
        if ((i & 8) != 0) {
            num = c24109iVf.AEQbTJ;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = c24109iVf.AhwBna;
        }
        java.lang.String str8 = str3;
        if ((i & 32) != 0) {
            str4 = c24109iVf.copydefault;
        }
        java.lang.String str9 = str4;
        if ((i & 64) != 0) {
            str5 = c24109iVf.EZpvd;
        }
        return c24109iVf.OLrzqt(l, str6, str7, num2, str8, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C24109iVf OLrzqt(java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        return new C24109iVf(l, str, str2, num, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Long copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24109iVf)) {
            return false;
        }
        C24109iVf c24109iVf = (C24109iVf) obj;
        return Intrinsics.EZpvd(this.KWHzl, c24109iVf.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c24109iVf.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c24109iVf.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c24109iVf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c24109iVf.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c24109iVf.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c24109iVf.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.KWHzl;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.String str = this.valueOf;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.AEQbTJ;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        java.lang.String str3 = this.AhwBna;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.copydefault;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.EZpvd;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestValidatorData(investmentId=" + this.KWHzl + ", validatorName=" + this.valueOf + ", stakedAmount=" + this.OLrzqt + ", rateType=" + this.AEQbTJ + ", tvl=" + this.AhwBna + ", rate=" + this.copydefault + ", tokenSymbol=" + this.EZpvd + ")";
    }

    public C24109iVf(java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.KWHzl = l;
        this.valueOf = str;
        this.OLrzqt = str2;
        this.AEQbTJ = num;
        this.AhwBna = str3;
        this.copydefault = str4;
        this.EZpvd = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:120) call: o.iVf.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C24109iVf(java.lang.Long l, java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5);
    }
}
