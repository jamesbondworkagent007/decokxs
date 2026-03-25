package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gOP {
    public final Function0<Unit> AEQbTJ;
    public final Function0<Unit> AhwBna;
    public final Function0<Unit> EZpvd;
    public final Function0<Unit> KWHzl;
    public final Function0<Unit> OLrzqt;
    public final Function0<Unit> copydefault;
    public final Function0<Unit> djBIcL;
    public final Function0<Unit> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public gOP() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gOP EZpvd(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08) {
        return new gOP(function0, function02, function03, function04, function05, function06, function07, function08);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gOP)) {
            return false;
        }
        gOP gop = (gOP) obj;
        return Intrinsics.EZpvd(this.OLrzqt, gop.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, gop.EZpvd) && Intrinsics.EZpvd(this.copydefault, gop.copydefault) && Intrinsics.EZpvd(this.djBIcL, gop.djBIcL) && Intrinsics.EZpvd(this.KWHzl, gop.KWHzl) && Intrinsics.EZpvd(this.gEmmrt, gop.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, gop.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, gop.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> gEmmrt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Function0<Unit> function0 = this.OLrzqt;
        int iHashCode = function0 == null ? 0 : function0.hashCode();
        Function0<Unit> function02 = this.EZpvd;
        int iHashCode2 = function02 == null ? 0 : function02.hashCode();
        Function0<Unit> function03 = this.copydefault;
        int iHashCode3 = function03 == null ? 0 : function03.hashCode();
        Function0<Unit> function04 = this.djBIcL;
        int iHashCode4 = function04 == null ? 0 : function04.hashCode();
        Function0<Unit> function05 = this.KWHzl;
        int iHashCode5 = function05 == null ? 0 : function05.hashCode();
        Function0<Unit> function06 = this.gEmmrt;
        int iHashCode6 = function06 == null ? 0 : function06.hashCode();
        Function0<Unit> function07 = this.AhwBna;
        int iHashCode7 = function07 == null ? 0 : function07.hashCode();
        Function0<Unit> function08 = this.AEQbTJ;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (function08 != null ? function08.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ReminderActionCallbacks(onDappClick=" + this.OLrzqt + ", onLiquidityClick=" + this.EZpvd + ", onMpcClick=" + this.copydefault + ", onSwitchWalletClick=" + this.djBIcL + ", onRetryClick=" + this.KWHzl + ", onSAActionClick=" + this.gEmmrt + ", onUpgradeSAClick=" + this.AhwBna + ", onAutoRenewClick=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Function0<Unit> valueOf() {
        return this.gEmmrt;
    }

    public gOP(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08) {
        this.OLrzqt = function0;
        this.EZpvd = function02;
        this.copydefault = function03;
        this.djBIcL = function04;
        this.KWHzl = function05;
        this.gEmmrt = function06;
        this.AhwBna = function07;
        this.AEQbTJ = function08;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r10v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r11v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r12v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r13v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r14v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r15v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r16v0 kotlin.jvm.functions.Function0))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 kotlin.jvm.functions.Function0) : (null kotlin.jvm.functions.Function0))
 A[MD:(kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>):void (m)] (LINE:192) call: o.gOP.<init>(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ gOP(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function02, (i & 4) != 0 ? null : function03, (i & 8) != 0 ? null : function04, (i & 16) != 0 ? null : function05, (i & 32) != 0 ? null : function06, (i & 64) != 0 ? null : function07, (i & 128) == 0 ? function08 : null);
    }
}
