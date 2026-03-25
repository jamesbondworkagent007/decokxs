package com.okinc.kline.data;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class BotPendingLineVo {
    public static final int $stable = 8;
    private ArrayList<BotOrderItem> buyList;
    private String direction;
    private String fillSafetyOrds;
    private BotOrderItem initialOrder;
    private String liqPrice;
    private final String maxPrice;
    private final String minPrice;
    private ArrayList<BotOrderItem> sellList;
    private String slPrice;
    private String startTriggerPrice;
    private String stopTriggerPrice;
    private String tpPrice;
    private String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotPendingLineVo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotOrderItem component10() {
        return this.initialOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BotOrderItem> component3() {
        return this.buyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BotOrderItem> component4() {
        return this.sellList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.liqPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tpPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.slPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.startTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.stopTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotPendingLineVo copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<BotOrderItem> arrayList, @NotNull ArrayList<BotOrderItem> arrayList2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, BotOrderItem botOrderItem, String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new BotPendingLineVo(str, str2, arrayList, arrayList2, str3, str4, str5, str6, str7, botOrderItem, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotPendingLineVo)) {
            return false;
        }
        BotPendingLineVo botPendingLineVo = (BotPendingLineVo) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) botPendingLineVo.type) && Intrinsics.EZpvd((Object) this.direction, (Object) botPendingLineVo.direction) && Intrinsics.EZpvd(this.buyList, botPendingLineVo.buyList) && Intrinsics.EZpvd(this.sellList, botPendingLineVo.sellList) && Intrinsics.EZpvd((Object) this.liqPrice, (Object) botPendingLineVo.liqPrice) && Intrinsics.EZpvd((Object) this.tpPrice, (Object) botPendingLineVo.tpPrice) && Intrinsics.EZpvd((Object) this.slPrice, (Object) botPendingLineVo.slPrice) && Intrinsics.EZpvd((Object) this.startTriggerPrice, (Object) botPendingLineVo.startTriggerPrice) && Intrinsics.EZpvd((Object) this.stopTriggerPrice, (Object) botPendingLineVo.stopTriggerPrice) && Intrinsics.EZpvd(this.initialOrder, botPendingLineVo.initialOrder) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) botPendingLineVo.fillSafetyOrds) && Intrinsics.EZpvd((Object) this.minPrice, (Object) botPendingLineVo.minPrice) && Intrinsics.EZpvd((Object) this.maxPrice, (Object) botPendingLineVo.maxPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BotOrderItem> getBuyList() {
        return this.buyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDirection() {
        return this.direction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFillSafetyOrds() {
        return this.fillSafetyOrds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotOrderItem getInitialOrder() {
        return this.initialOrder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPrice() {
        return this.liqPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPrice() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinPrice() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<BotOrderItem> getSellList() {
        return this.sellList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlPrice() {
        return this.slPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTriggerPrice() {
        return this.startTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStopTriggerPrice() {
        return this.stopTriggerPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTpPrice() {
        return this.tpPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.type.hashCode();
        int iHashCode2 = this.direction.hashCode();
        int iHashCode3 = this.buyList.hashCode();
        int iHashCode4 = this.sellList.hashCode();
        int iHashCode5 = this.liqPrice.hashCode();
        int iHashCode6 = this.tpPrice.hashCode();
        int iHashCode7 = this.slPrice.hashCode();
        int iHashCode8 = this.startTriggerPrice.hashCode();
        int iHashCode9 = this.stopTriggerPrice.hashCode();
        BotOrderItem botOrderItem = this.initialOrder;
        int iHashCode10 = botOrderItem == null ? 0 : botOrderItem.hashCode();
        String str = this.fillSafetyOrds;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.minPrice.hashCode()) * 31) + this.maxPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBuyList(@NotNull ArrayList<BotOrderItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.buyList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDirection(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.direction = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFillSafetyOrds(String str) {
        this.fillSafetyOrds = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInitialOrder(BotOrderItem botOrderItem) {
        this.initialOrder = botOrderItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiqPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liqPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSellList(@NotNull ArrayList<BotOrderItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.sellList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTriggerPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.startTriggerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopTriggerPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.stopTriggerPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTpPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tpPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotPendingLineVo(type=" + this.type + ", direction=" + this.direction + ", buyList=" + this.buyList + ", sellList=" + this.sellList + ", liqPrice=" + this.liqPrice + ", tpPrice=" + this.tpPrice + ", slPrice=" + this.slPrice + ", startTriggerPrice=" + this.startTriggerPrice + ", stopTriggerPrice=" + this.stopTriggerPrice + ", initialOrder=" + this.initialOrder + ", fillSafetyOrds=" + this.fillSafetyOrds + ", minPrice=" + this.minPrice + ", maxPrice=" + this.maxPrice + ")";
    }

    public BotPendingLineVo(@NotNull String str, @NotNull String str2, @NotNull ArrayList<BotOrderItem> arrayList, @NotNull ArrayList<BotOrderItem> arrayList2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, BotOrderItem botOrderItem, String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.type = str;
        this.direction = str2;
        this.buyList = arrayList;
        this.sellList = arrayList2;
        this.liqPrice = str3;
        this.tpPrice = str4;
        this.slPrice = str5;
        this.startTriggerPrice = str6;
        this.stopTriggerPrice = str7;
        this.initialOrder = botOrderItem;
        this.fillSafetyOrds = str8;
        this.minPrice = str9;
        this.maxPrice = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("long") : (r16v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0014: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:56) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r17v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0020: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0026: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:57) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r18v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:com.okinc.kline.data.BotOrderItem:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.data.BotOrderItem) : (r24v0 com.okinc.kline.data.BotOrderItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.kline.data.BotOrderItem>, java.util.ArrayList<com.okinc.kline.data.BotOrderItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.data.BotOrderItem, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:53) call: com.okinc.kline.data.BotPendingLineVo.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.data.BotOrderItem, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotPendingLineVo(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5, String str6, String str7, BotOrderItem botOrderItem, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "long" : str2, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? new ArrayList() : arrayList2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? null : botOrderItem, (i & 1024) == 0 ? str8 : null, (i & 2048) != 0 ? "" : str9, (i & 4096) == 0 ? str10 : "");
    }
}
