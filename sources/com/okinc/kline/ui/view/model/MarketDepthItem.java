package com.okinc.kline.ui.view.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class MarketDepthItem {
    public static final int $stable = 8;
    private String buyAmount;
    private float buyAmountInt;
    private String buyId;
    private String buyPrice;
    private String buyPriceRaw;
    private String sellAmount;
    private float sellAmountInt;
    private String sellId;
    private String sellPrice;
    private String sellPriceRaw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketDepthItem() {
        this(null, null, null, null, null, null, null, null, 0.0f, 0.0f, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.buyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component10() {
        return this.sellAmountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.buyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.buyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sellPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sellId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.buyPriceRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sellPriceRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component9() {
        return this.buyAmountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketDepthItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, float f, float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new MarketDepthItem(str, str2, str3, str4, str5, str6, str7, str8, f, f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketDepthItem)) {
            return false;
        }
        MarketDepthItem marketDepthItem = (MarketDepthItem) obj;
        return Intrinsics.EZpvd((Object) this.buyId, (Object) marketDepthItem.buyId) && Intrinsics.EZpvd((Object) this.buyAmount, (Object) marketDepthItem.buyAmount) && Intrinsics.EZpvd((Object) this.buyPrice, (Object) marketDepthItem.buyPrice) && Intrinsics.EZpvd((Object) this.sellPrice, (Object) marketDepthItem.sellPrice) && Intrinsics.EZpvd((Object) this.sellAmount, (Object) marketDepthItem.sellAmount) && Intrinsics.EZpvd((Object) this.sellId, (Object) marketDepthItem.sellId) && Intrinsics.EZpvd((Object) this.buyPriceRaw, (Object) marketDepthItem.buyPriceRaw) && Intrinsics.EZpvd((Object) this.sellPriceRaw, (Object) marketDepthItem.sellPriceRaw) && Float.compare(this.buyAmountInt, marketDepthItem.buyAmountInt) == 0 && Float.compare(this.sellAmountInt, marketDepthItem.sellAmountInt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyAmount() {
        return this.buyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getBuyAmountInt() {
        return this.buyAmountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyId() {
        return this.buyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyPrice() {
        return this.buyPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBuyPriceRaw() {
        return this.buyPriceRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellAmount() {
        return this.sellAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getSellAmountInt() {
        return this.sellAmountInt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellId() {
        return this.sellId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellPrice() {
        return this.sellPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellPriceRaw() {
        return this.sellPriceRaw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((this.buyId.hashCode() * 31) + this.buyAmount.hashCode()) * 31) + this.buyPrice.hashCode()) * 31) + this.sellPrice.hashCode()) * 31) + this.sellAmount.hashCode()) * 31) + this.sellId.hashCode()) * 31) + this.buyPriceRaw.hashCode()) * 31) + this.sellPriceRaw.hashCode()) * 31) + Float.hashCode(this.buyAmountInt)) * 31) + Float.hashCode(this.sellAmountInt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyAmountInt(float f) {
        this.buyAmountInt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyPriceRaw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.buyPriceRaw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellAmountInt(float f) {
        this.sellAmountInt = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellPriceRaw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sellPriceRaw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketDepthItem(buyId=" + this.buyId + ", buyAmount=" + this.buyAmount + ", buyPrice=" + this.buyPrice + ", sellPrice=" + this.sellPrice + ", sellAmount=" + this.sellAmount + ", sellId=" + this.sellId + ", buyPriceRaw=" + this.buyPriceRaw + ", sellPriceRaw=" + this.sellPriceRaw + ", buyAmountInt=" + this.buyAmountInt + ", sellAmountInt=" + this.sellAmountInt + ")";
    }

    public MarketDepthItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, float f, float f2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.buyId = str;
        this.buyAmount = str2;
        this.buyPrice = str3;
        this.sellPrice = str4;
        this.sellAmount = str5;
        this.sellId = str6;
        this.buyPriceRaw = str7;
        this.sellPriceRaw = str8;
        this.buyAmountInt = f;
        this.sellAmountInt = f2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0061: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:float:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0.0f float) : (r20v0 float))
  (wrap:float:?: TERNARY null = ((wrap:int:0x0048: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 float) : (0.0f float))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, float):void (m)] (LINE:20) call: com.okinc.kline.ui.view.model.MarketDepthItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, float, float):void type: THIS */
    public /* synthetic */ MarketDepthItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) == 0 ? str8 : "", (i & 256) != 0 ? 0.0f : f, (i & 512) == 0 ? f2 : 0.0f);
    }
}
