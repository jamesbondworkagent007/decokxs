package com.okinc.business.market.data.model.position_pnl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderBalanceData {
    public static final int $stable = 0;
    private final String address;
    private final String chainId;
    private final String coinAmount;
    private final String currencyAmount;
    private final boolean isNativeToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitOrderBalanceData() {
        this(null, null, false, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitOrderBalanceData copy$default(LimitOrderBalanceData limitOrderBalanceData, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderBalanceData.coinAmount;
        }
        if ((i & 2) != 0) {
            str2 = limitOrderBalanceData.currencyAmount;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            z = limitOrderBalanceData.isNativeToken;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = limitOrderBalanceData.chainId;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = limitOrderBalanceData.address;
        }
        return limitOrderBalanceData.copy(str, str5, z2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderBalanceData copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LimitOrderBalanceData(str, str2, z, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LimitOrderBalanceData)) {
            return false;
        }
        LimitOrderBalanceData limitOrderBalanceData = (LimitOrderBalanceData) obj;
        return Intrinsics.EZpvd((Object) this.coinAmount, (Object) limitOrderBalanceData.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) limitOrderBalanceData.currencyAmount) && this.isNativeToken == limitOrderBalanceData.isNativeToken && Intrinsics.EZpvd((Object) this.chainId, (Object) limitOrderBalanceData.chainId) && Intrinsics.EZpvd((Object) this.address, (Object) limitOrderBalanceData.address);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.coinAmount.hashCode() * 31) + this.currencyAmount.hashCode()) * 31) + Boolean.hashCode(this.isNativeToken)) * 31) + this.chainId.hashCode()) * 31) + this.address.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitOrderBalanceData(coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", isNativeToken=" + this.isNativeToken + ", chainId=" + this.chainId + ", address=" + this.address + ")";
    }

    public LimitOrderBalanceData(@NotNull String str, @NotNull String str2, boolean z, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.coinAmount = str;
        this.currencyAmount = str2;
        this.isNativeToken = z;
        this.chainId = str3;
        this.address = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:boolean:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.business.market.data.model.position_pnl.LimitOrderBalanceData.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LimitOrderBalanceData(String str, String str2, boolean z, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
