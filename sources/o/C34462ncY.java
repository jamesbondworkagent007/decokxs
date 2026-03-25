package o;

import com.okinc.dexkline.dexlogic.txs.TxType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC34635nfn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34462ncY implements InterfaceC34635nfn {
    public final java.lang.String AEQbTJ;
    public final TxType AYXKKw;
    public final long EZpvd;
    public final boolean KWHzl;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.String djBIcL;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C34462ncY() {
        this(0L, null, null, null, null, null, null, false, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxType AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34462ncY KWHzl(long j, @NotNull java.lang.String str, @NotNull TxType txType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C34462ncY(j, str, txType, str2, str3, str4, str5, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34462ncY)) {
            return false;
        }
        C34462ncY c34462ncY = (C34462ncY) obj;
        return this.EZpvd == c34462ncY.EZpvd && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c34462ncY.djBIcL) && this.AYXKKw == c34462ncY.AYXKKw && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c34462ncY.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34462ncY.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c34462ncY.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c34462ncY.OLrzqt) && this.KWHzl == c34462ncY.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((java.lang.Long.hashCode(this.EZpvd) * 31) + this.djBIcL.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PnLTransactionUiModel(id=" + this.EZpvd + ", txHashUrl=" + this.djBIcL + ", type=" + this.AYXKKw + ", timestamp=" + this.AEQbTJ + ", amount=" + this.copydefault + ", volume=" + this.gEmmrt + ", price=" + this.OLrzqt + ", showTip=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.djBIcL;
    }

    public C34462ncY(long j, @NotNull java.lang.String str, @NotNull TxType txType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(txType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.EZpvd = j;
        this.djBIcL = str;
        this.AYXKKw = txType;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.gEmmrt = str4;
        this.OLrzqt = str5;
        this.KWHzl = z;
    }

    @Override // o.InterfaceC34635nfn
    public boolean AEQbTJ(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.copydefault(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public boolean KWHzl(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.KWHzl(this, interfaceC34635nfn);
    }

    @Override // o.InterfaceC34635nfn
    public java.lang.Object copydefault(@NotNull InterfaceC34635nfn interfaceC34635nfn) {
        return InterfaceC34635nfn.Activity.AEQbTJ(this, interfaceC34635nfn);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004f: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r11v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:com.okinc.dexkline.dexlogic.txs.TxType:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0017: SGET  A[WRAPPED] (LINE:10) com.okinc.dexkline.dexlogic.txs.TxType.BUY com.okinc.dexkline.dexlogic.txs.TxType) : (r14v0 com.okinc.dexkline.dexlogic.txs.TxType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r20v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
 A[MD:(long, java.lang.String, com.okinc.dexkline.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:6) call: o.ncY.<init>(long, java.lang.String, com.okinc.dexkline.dexlogic.txs.TxType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ C34462ncY(long j, java.lang.String str, TxType txType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? TxType.BUY : txType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) == 0 ? str5 : "", (i & 128) != 0 ? false : z);
    }
}
