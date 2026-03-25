package com.okinc.assets.backend.api.model.satoshitest;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class NetworkSupportedCurrency {
    public static final int $stable = 0;
    private final int currencyId;
    private final String icon;
    private final int subCurrencyId;
    private final String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkSupportedCurrency() {
        this(0, 0, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NetworkSupportedCurrency copy$default(NetworkSupportedCurrency networkSupportedCurrency, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = networkSupportedCurrency.currencyId;
        }
        if ((i3 & 2) != 0) {
            i2 = networkSupportedCurrency.subCurrencyId;
        }
        if ((i3 & 4) != 0) {
            str = networkSupportedCurrency.icon;
        }
        if ((i3 & 8) != 0) {
            str2 = networkSupportedCurrency.symbol;
        }
        return networkSupportedCurrency.copy(i, i2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkSupportedCurrency copy(int i, int i2, String str, String str2) {
        return new NetworkSupportedCurrency(i, i2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkSupportedCurrency)) {
            return false;
        }
        NetworkSupportedCurrency networkSupportedCurrency = (NetworkSupportedCurrency) obj;
        return this.currencyId == networkSupportedCurrency.currencyId && this.subCurrencyId == networkSupportedCurrency.subCurrencyId && Intrinsics.EZpvd((Object) this.icon, (Object) networkSupportedCurrency.icon) && Intrinsics.EZpvd((Object) this.symbol, (Object) networkSupportedCurrency.symbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.currencyId);
        int iHashCode2 = Integer.hashCode(this.subCurrencyId);
        String str = this.icon;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.symbol;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkSupportedCurrency(currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", icon=" + this.icon + ", symbol=" + this.symbol + ")";
    }

    public NetworkSupportedCurrency(int i, int i2, String str, String str2) {
        this.currencyId = i;
        this.subCurrencyId = i2;
        this.icon = str;
        this.symbol = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(int, int, java.lang.String, java.lang.String):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.satoshitest.NetworkSupportedCurrency.<init>(int, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkSupportedCurrency(int i, int i2, String str, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : str, (i3 & 8) != 0 ? null : str2);
    }
}
