package o;

import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.TargetTab;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47313tng {
    public java.lang.String AEQbTJ;
    public java.lang.String EZpvd;
    public final TargetTab KWHzl;
    public final boolean OLrzqt;
    public java.lang.String copydefault;
    public final TradeType djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47313tng() {
        this(null, null, null, null, null, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47313tng copy$default(C47313tng c47313tng, TradeType tradeType, java.lang.String str, java.lang.String str2, java.lang.String str3, TargetTab targetTab, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tradeType = c47313tng.djBIcL;
        }
        if ((i & 2) != 0) {
            str = c47313tng.AEQbTJ;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = c47313tng.copydefault;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c47313tng.EZpvd;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            targetTab = c47313tng.KWHzl;
        }
        TargetTab targetTab2 = targetTab;
        if ((i & 32) != 0) {
            z = c47313tng.OLrzqt;
        }
        return c47313tng.EZpvd(tradeType, str4, str5, str6, targetTab2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47313tng EZpvd(@NotNull TradeType tradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TargetTab targetTab, boolean z) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        return new C47313tng(tradeType, str, str2, str3, targetTab, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47313tng)) {
            return false;
        }
        C47313tng c47313tng = (C47313tng) obj;
        return this.djBIcL == c47313tng.djBIcL && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c47313tng.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c47313tng.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c47313tng.EZpvd) && this.KWHzl == c47313tng.KWHzl && this.OLrzqt == c47313tng.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.djBIcL.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UVPreLoadParameter(tradeType=" + this.djBIcL + ", quoteCurrency=" + this.AEQbTJ + ", baseCurrency=" + this.copydefault + ", topUpCurrency=" + this.EZpvd + ", targetTab=" + this.KWHzl + ", isDexTrade=" + this.OLrzqt + ")";
    }

    public C47313tng(@NotNull TradeType tradeType, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull TargetTab targetTab, boolean z) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        this.djBIcL = tradeType;
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.EZpvd = str3;
        this.KWHzl = targetTab;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:0x0004: SGET  A[WRAPPED] (LINE:8) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r5v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:com.okinc.okx.paymentapi.service.TargetTab:0x0022: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okx.paymentapi.service.TargetTab:0x0020: SGET  A[WRAPPED] (LINE:12) com.okinc.okx.paymentapi.service.TargetTab.BUY com.okinc.okx.paymentapi.service.TargetTab) : (r9v0 com.okinc.okx.paymentapi.service.TargetTab))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.TargetTab, boolean):void (m)] (LINE:7) call: o.tng.<init>(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.TargetTab, boolean):void type: THIS */
    public /* synthetic */ C47313tng(TradeType tradeType, java.lang.String str, java.lang.String str2, java.lang.String str3, TargetTab targetTab, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TradeType.BUY : tradeType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : "", (i & 16) != 0 ? TargetTab.BUY : targetTab, (i & 32) != 0 ? false : z);
    }
}
