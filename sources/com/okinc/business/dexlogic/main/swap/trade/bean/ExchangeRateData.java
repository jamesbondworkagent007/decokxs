package com.okinc.business.dexlogic.main.swap.trade.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ExchangeRateData {
    public static final int $stable = 8;
    private String changeRate;
    private String customRate;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeRateData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeRateData copy$default(ExchangeRateData exchangeRateData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeRateData.changeRate;
        }
        if ((i & 2) != 0) {
            str2 = exchangeRateData.customRate;
        }
        return exchangeRateData.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.customRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeRateData copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ExchangeRateData(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExchangeRateData)) {
            return false;
        }
        ExchangeRateData exchangeRateData = (ExchangeRateData) obj;
        return Intrinsics.EZpvd((Object) this.changeRate, (Object) exchangeRateData.changeRate) && Intrinsics.EZpvd((Object) this.customRate, (Object) exchangeRateData.customRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChangeRate() {
        return this.changeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCustomRate() {
        return this.customRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.changeRate.hashCode() * 31) + this.customRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChangeRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.changeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCustomRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.customRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeRateData(changeRate=" + this.changeRate + ", customRate=" + this.customRate + ")";
    }

    public ExchangeRateData(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.changeRate = str;
        this.customRate = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:91) call: com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ExchangeRateData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
