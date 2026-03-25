package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class DepositRecentSearchResp {
    public static final int $stable = 8;
    private int currencyId;
    private String icon;
    private String symbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DepositRecentSearchResp() {
        this(0, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositRecentSearchResp copy$default(DepositRecentSearchResp depositRecentSearchResp, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = depositRecentSearchResp.currencyId;
        }
        if ((i2 & 2) != 0) {
            str = depositRecentSearchResp.symbol;
        }
        if ((i2 & 4) != 0) {
            str2 = depositRecentSearchResp.icon;
        }
        return depositRecentSearchResp.copy(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositRecentSearchResp copy(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new DepositRecentSearchResp(i, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DepositRecentSearchResp)) {
            return false;
        }
        DepositRecentSearchResp depositRecentSearchResp = (DepositRecentSearchResp) obj;
        return this.currencyId == depositRecentSearchResp.currencyId && Intrinsics.EZpvd((Object) this.symbol, (Object) depositRecentSearchResp.symbol) && Intrinsics.EZpvd((Object) this.icon, (Object) depositRecentSearchResp.icon);
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
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Integer.hashCode(this.currencyId) * 31) + this.symbol.hashCode()) * 31) + this.icon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositRecentSearchResp(currencyId=" + this.currencyId + ", symbol=" + this.symbol + ", icon=" + this.icon + ")";
    }

    public DepositRecentSearchResp(int i, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.currencyId = i;
        this.symbol = str;
        this.icon = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (7 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("USDT") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.DepositRecentSearchResp.<init>(int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DepositRecentSearchResp(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 7 : i, (i2 & 2) != 0 ? "USDT" : str, (i2 & 4) != 0 ? "" : str2);
    }
}
