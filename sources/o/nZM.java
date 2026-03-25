package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.okimcore.model.im.group.TransactionStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class nZM {
    public final java.lang.String AEQbTJ;
    public final TransactionStatus AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.Integer OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.Long gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public nZM() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final nZM KWHzl(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.Long l, TransactionStatus transactionStatus, java.lang.String str5, java.lang.String str6) {
        return new nZM(str, str2, num, str3, str4, l, transactionStatus, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nZM)) {
            return false;
        }
        nZM nzm = (nZM) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) nzm.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) nzm.copydefault) && Intrinsics.EZpvd(this.OLrzqt, nzm.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) nzm.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) nzm.EZpvd) && Intrinsics.EZpvd(this.gEmmrt, nzm.gEmmrt) && this.AhwBna == nzm.AhwBna && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) nzm.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) nzm.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStatus gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.valueOf;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.copydefault;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.OLrzqt;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        java.lang.String str3 = this.KWHzl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.EZpvd;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.Long l = this.gEmmrt;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        TransactionStatus transactionStatus = this.AhwBna;
        int iHashCode7 = transactionStatus == null ? 0 : transactionStatus.hashCode();
        java.lang.String str5 = this.AEQbTJ;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.djBIcL;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PaidGroupTransactionItem(transactionId=" + this.valueOf + ", amount=" + this.copydefault + ", decimalPoint=" + this.OLrzqt + ", currencySymbol=" + this.KWHzl + ", nickname=" + this.EZpvd + ", updateTime=" + this.gEmmrt + ", transactionStatus=" + this.AhwBna + ", avatarUrl=" + this.AEQbTJ + ", paymentTime=" + this.djBIcL + ")";
    }

    public nZM(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.Long l, TransactionStatus transactionStatus, java.lang.String str5, java.lang.String str6) {
        this.valueOf = str;
        this.copydefault = str2;
        this.OLrzqt = num;
        this.KWHzl = str3;
        this.EZpvd = str4;
        this.gEmmrt = l;
        this.AhwBna = transactionStatus;
        this.AEQbTJ = str5;
        this.djBIcL = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.group.TransactionStatus:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.TransactionStatus) : (r17v0 com.okinc.okimcore.model.im.group.TransactionStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.group.TransactionStatus, java.lang.String, java.lang.String):void (m)] (LINE:5) call: o.nZM.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Long, com.okinc.okimcore.model.im.group.TransactionStatus, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ nZM(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.String str3, java.lang.String str4, java.lang.Long l, TransactionStatus transactionStatus, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : transactionStatus, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null);
    }
}
