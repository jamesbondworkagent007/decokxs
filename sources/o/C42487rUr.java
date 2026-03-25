package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.rUr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C42487rUr {
    public java.lang.String AEQbTJ;
    public android.graphics.Bitmap AYXKKw;
    public boolean AhwBna;
    public java.lang.String AkhnZx;
    public java.lang.String EZpvd;
    public android.graphics.Bitmap KWHzl;
    public java.lang.String OLrzqt;
    public java.lang.String copydefault;
    public boolean djBIcL;
    public android.graphics.Bitmap gEmmrt;
    public java.lang.String valueOf;
    public java.lang.Boolean values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C42487rUr() {
        this(false, false, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42487rUr copydefault(boolean z, boolean z2, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3) {
        return new C42487rUr(z, z2, bool, str, str2, str3, str4, str5, str6, bitmap, bitmap2, bitmap3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42487rUr)) {
            return false;
        }
        C42487rUr c42487rUr = (C42487rUr) obj;
        return this.AhwBna == c42487rUr.AhwBna && this.djBIcL == c42487rUr.djBIcL && Intrinsics.EZpvd(this.values, c42487rUr.values) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) c42487rUr.valueOf) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c42487rUr.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AkhnZx, (java.lang.Object) c42487rUr.AkhnZx) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c42487rUr.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c42487rUr.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c42487rUr.copydefault) && Intrinsics.EZpvd(this.gEmmrt, c42487rUr.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, c42487rUr.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, c42487rUr.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AhwBna);
        int iHashCode2 = java.lang.Boolean.hashCode(this.djBIcL);
        java.lang.Boolean bool = this.values;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.valueOf;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.OLrzqt;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.AkhnZx;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.EZpvd;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.AEQbTJ;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.copydefault;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        android.graphics.Bitmap bitmap = this.gEmmrt;
        int iHashCode10 = bitmap == null ? 0 : bitmap.hashCode();
        android.graphics.Bitmap bitmap2 = this.KWHzl;
        int iHashCode11 = bitmap2 == null ? 0 : bitmap2.hashCode();
        android.graphics.Bitmap bitmap3 = this.AYXKKw;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (bitmap3 != null ? bitmap3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JumioUiModel(isSuccess=" + this.AhwBna + ", hasFace=" + this.djBIcL + ", passed=" + this.values + ", idType=" + this.valueOf + ", accountId=" + this.OLrzqt + ", workflowExecutionId=" + this.AkhnZx + ", credentialInfoId=" + this.EZpvd + ", errorMessage=" + this.AEQbTJ + ", errorCode=" + this.copydefault + ", frontBitmap=" + this.gEmmrt + ", backBitmap=" + this.KWHzl + ", faceBitmap=" + this.AYXKKw + ")";
    }

    public C42487rUr(boolean z, boolean z2, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3) {
        this.AhwBna = z;
        this.djBIcL = z2;
        this.values = bool;
        this.valueOf = str;
        this.OLrzqt = str2;
        this.AkhnZx = str3;
        this.EZpvd = str4;
        this.AEQbTJ = str5;
        this.copydefault = str6;
        this.gEmmrt = bitmap;
        this.KWHzl = bitmap2;
        this.AYXKKw = bitmap3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r15v0 boolean) : false)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r16v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:android.graphics.Bitmap:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.Bitmap) : (r23v0 android.graphics.Bitmap))
  (wrap:android.graphics.Bitmap:?: TERNARY null = ((wrap:int:0x0053: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null android.graphics.Bitmap) : (r24v0 android.graphics.Bitmap))
  (wrap:android.graphics.Bitmap:?: TERNARY null = ((wrap:int:0x005b: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 android.graphics.Bitmap) : (null android.graphics.Bitmap))
 A[MD:(boolean, boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap):void (m)] (LINE:5) call: o.rUr.<init>(boolean, boolean, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, android.graphics.Bitmap, android.graphics.Bitmap, android.graphics.Bitmap):void type: THIS */
    public /* synthetic */ C42487rUr(boolean z, boolean z2, java.lang.Boolean bool, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? java.lang.Boolean.FALSE : bool, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) == 0 ? str6 : "", (i & 512) != 0 ? null : bitmap, (i & 1024) != 0 ? null : bitmap2, (i & 2048) == 0 ? bitmap3 : null);
    }
}
