package o;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.kvX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29537kvX {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final boolean AkhnZx;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final boolean djBIcL;
    public final boolean gEmmrt;
    public final boolean valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C29537kvX() {
        this(false, false, false, false, false, false, false, false, false, false, false, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C29537kvX OLrzqt(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return new C29537kvX(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29537kvX)) {
            return false;
        }
        C29537kvX c29537kvX = (C29537kvX) obj;
        return this.copydefault == c29537kvX.copydefault && this.AkhnZx == c29537kvX.AkhnZx && this.AEQbTJ == c29537kvX.AEQbTJ && this.gEmmrt == c29537kvX.gEmmrt && this.KWHzl == c29537kvX.KWHzl && this.valueOf == c29537kvX.valueOf && this.AYXKKw == c29537kvX.AYXKKw && this.djBIcL == c29537kvX.djBIcL && this.AhwBna == c29537kvX.AhwBna && this.OLrzqt == c29537kvX.OLrzqt && this.EZpvd == c29537kvX.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((java.lang.Boolean.hashCode(this.copydefault) * 31) + java.lang.Boolean.hashCode(this.AkhnZx)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ)) * 31) + java.lang.Boolean.hashCode(this.gEmmrt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.valueOf)) * 31) + java.lang.Boolean.hashCode(this.AYXKKw)) * 31) + java.lang.Boolean.hashCode(this.djBIcL)) * 31) + java.lang.Boolean.hashCode(this.AhwBna)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FieldValidationState(marketCapValid=" + this.copydefault + ", volumeValid=" + this.AkhnZx + ", holdersValid=" + this.AEQbTJ + ", transactionsValid=" + this.gEmmrt + ", buyTransactionsValid=" + this.KWHzl + ", sellTransactionsValid=" + this.valueOf + ", tokenAgeValid=" + this.AYXKKw + ", numAddressesValid=" + this.djBIcL + ", turnoverValid=" + this.AhwBna + ", alertMarketCapValid=" + this.OLrzqt + ", alertLiquidityValid=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.valueOf;
    }

    public C29537kvX(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.copydefault = z;
        this.AkhnZx = z2;
        this.AEQbTJ = z3;
        this.gEmmrt = z4;
        this.KWHzl = z5;
        this.valueOf = z6;
        this.AYXKKw = z7;
        this.djBIcL = z8;
        this.AhwBna = z9;
        this.OLrzqt = z10;
        this.EZpvd = z11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r13v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r14v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r15v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r17v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r18v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r19v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r20v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 boolean) : true)
 A[MD:(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void (m)] (LINE:25) call: o.kvX.<init>(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C29537kvX(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3, (i & 8) != 0 ? true : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? true : z7, (i & 128) != 0 ? true : z8, (i & 256) != 0 ? true : z9, (i & 512) != 0 ? true : z10, (i & 1024) == 0 ? z11 : true);
    }
}
