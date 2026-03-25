package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bmT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10331bmT {
    public final int AEQbTJ;
    public java.lang.String AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final int copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C10331bmT() {
        this(null, null, null, null, null, 0, 0, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C10331bmT copy$default(C10331bmT c10331bmT, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = c10331bmT.KWHzl;
        }
        if ((i3 & 2) != 0) {
            str2 = c10331bmT.gEmmrt;
        }
        java.lang.String str6 = str2;
        if ((i3 & 4) != 0) {
            str3 = c10331bmT.EZpvd;
        }
        java.lang.String str7 = str3;
        if ((i3 & 8) != 0) {
            str4 = c10331bmT.AhwBna;
        }
        java.lang.String str8 = str4;
        if ((i3 & 16) != 0) {
            str5 = c10331bmT.OLrzqt;
        }
        java.lang.String str9 = str5;
        if ((i3 & 32) != 0) {
            i = c10331bmT.AEQbTJ;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = c10331bmT.copydefault;
        }
        return c10331bmT.KWHzl(str, str6, str7, str8, str9, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10331bmT KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new C10331bmT(str, str2, str3, str4, str5, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10331bmT)) {
            return false;
        }
        C10331bmT c10331bmT = (C10331bmT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c10331bmT.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) c10331bmT.gEmmrt) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c10331bmT.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c10331bmT.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c10331bmT.OLrzqt) && this.AEQbTJ == c10331bmT.AEQbTJ && this.copydefault == c10331bmT.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.KWHzl.hashCode() * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Integer.hashCode(this.AEQbTJ)) * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PipViewData(tokenName=" + this.KWHzl + ", tvPercent=" + this.gEmmrt + ", tokenAmount=" + this.EZpvd + ", tvCurrency=" + this.AhwBna + ", currencyAmount=" + this.OLrzqt + ", precision=" + this.AEQbTJ + ", drawColor=" + this.copydefault + ")";
    }

    public C10331bmT(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.KWHzl = str;
        this.gEmmrt = str2;
        this.EZpvd = str3;
        this.AhwBna = str4;
        this.OLrzqt = str5;
        this.AEQbTJ = i;
        this.copydefault = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0051: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0.00") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: INVOKE 
  ("0.00")
  (null com.okinc.wallet.core.formatter.WalletCurrencyBean)
  false
  (0 int)
  false
  (15 int)
  (null java.lang.Object)
 STATIC call: o.xYt.formatValuationFromAsset$default(java.lang.String, com.okinc.wallet.core.formatter.WalletCurrencyBean, boolean, int, boolean, int, java.lang.Object):java.lang.String A[MD:(java.lang.String, com.okinc.wallet.core.formatter.WalletCurrencyBean, boolean, int, boolean, int, java.lang.Object):java.lang.String (m), WRAPPED] (LINE:9)) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : ("0.00"))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (4 int) : (r18v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003c: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r19v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):void (m)] (LINE:5) call: o.bmT.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):void type: THIS */
    public /* synthetic */ C10331bmT(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "0" : str2, (i3 & 4) != 0 ? "0.00" : str3, (i3 & 8) != 0 ? C54880xYt.formatValuationFromAsset$default("0.00", null, false, 0, false, 15, null) : str4, (i3 & 16) == 0 ? str5 : "0.00", (i3 & 32) != 0 ? 4 : i, (i3 & 64) != 0 ? -1 : i2);
    }
}
