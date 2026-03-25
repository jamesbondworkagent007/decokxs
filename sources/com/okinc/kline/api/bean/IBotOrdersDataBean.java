package com.okinc.kline.api.bean;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class IBotOrdersDataBean {
    public static final int $stable = 8;
    private ArrayList<BotOrderItem> buyList;
    private String direction;
    private String fillSafetyOrds;
    private BotOrderItem initialOrder;
    private String liqPrice;
    private ArrayList<BotOrderItem> sellList;
    private String slPrice;
    private String startTriggerPrice;
    private String stopTriggerPrice;
    private String tpPrice;
    private String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IBotOrdersDataBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
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
    public final IBotOrdersDataBean copy(@NotNull String str, @NotNull String str2, @NotNull ArrayList<BotOrderItem> arrayList, @NotNull ArrayList<BotOrderItem> arrayList2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, BotOrderItem botOrderItem, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new IBotOrdersDataBean(str, str2, arrayList, arrayList2, str3, str4, str5, str6, str7, botOrderItem, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IBotOrdersDataBean)) {
            return false;
        }
        IBotOrdersDataBean iBotOrdersDataBean = (IBotOrdersDataBean) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) iBotOrdersDataBean.type) && Intrinsics.EZpvd((Object) this.direction, (Object) iBotOrdersDataBean.direction) && Intrinsics.EZpvd(this.buyList, iBotOrdersDataBean.buyList) && Intrinsics.EZpvd(this.sellList, iBotOrdersDataBean.sellList) && Intrinsics.EZpvd((Object) this.liqPrice, (Object) iBotOrdersDataBean.liqPrice) && Intrinsics.EZpvd((Object) this.tpPrice, (Object) iBotOrdersDataBean.tpPrice) && Intrinsics.EZpvd((Object) this.slPrice, (Object) iBotOrdersDataBean.slPrice) && Intrinsics.EZpvd((Object) this.startTriggerPrice, (Object) iBotOrdersDataBean.startTriggerPrice) && Intrinsics.EZpvd((Object) this.stopTriggerPrice, (Object) iBotOrdersDataBean.stopTriggerPrice) && Intrinsics.EZpvd(this.initialOrder, iBotOrdersDataBean.initialOrder) && Intrinsics.EZpvd((Object) this.fillSafetyOrds, (Object) iBotOrdersDataBean.fillSafetyOrds);
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
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str != null ? str.hashCode() : 0);
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
        return "IBotOrdersDataBean(type=" + this.type + ", direction=" + this.direction + ", buyList=" + this.buyList + ", sellList=" + this.sellList + ", liqPrice=" + this.liqPrice + ", tpPrice=" + this.tpPrice + ", slPrice=" + this.slPrice + ", startTriggerPrice=" + this.startTriggerPrice + ", stopTriggerPrice=" + this.stopTriggerPrice + ", initialOrder=" + this.initialOrder + ", fillSafetyOrds=" + this.fillSafetyOrds + ")";
    }

    public IBotOrdersDataBean(@NotNull String str, @NotNull String str2, @NotNull ArrayList<BotOrderItem> arrayList, @NotNull ArrayList<BotOrderItem> arrayList2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, BotOrderItem botOrderItem, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
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
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0076: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("long") : (r14v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0013: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:15) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r15v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001e: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0024: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:16) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r16v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r24v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:com.okinc.kline.api.bean.BotOrderItem:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.kline.api.bean.BotOrderItem) : (r22v0 com.okinc.kline.api.bean.BotOrderItem))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.kline.api.bean.BotOrderItem>, java.util.ArrayList<com.okinc.kline.api.bean.BotOrderItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.api.bean.BotOrderItem, java.lang.String):void (m)] (LINE:12) call: com.okinc.kline.api.bean.IBotOrdersDataBean.<init>(java.lang.String, java.lang.String, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.kline.api.bean.BotOrderItem, java.lang.String):void type: THIS */
    public /* synthetic */ IBotOrdersDataBean(String str, String str2, ArrayList arrayList, ArrayList arrayList2, String str3, String str4, String str5, String str6, String str7, BotOrderItem botOrderItem, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "long" : str2, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? new ArrayList() : arrayList2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) == 0 ? str7 : "", (i & 512) != 0 ? null : botOrderItem, (i & 1024) == 0 ? str8 : null);
    }

    public final Pair<String, String> getInitialOrderPair() {
        BotOrderItem botOrderItem = this.initialOrder;
        if (botOrderItem != null) {
            return new Pair<>(botOrderItem.getPrice(), botOrderItem.getAmount());
        }
        return null;
    }

    public final ArrayList<Pair<String, String>> getBuyListPairs() {
        ArrayList<BotOrderItem> arrayList = this.buyList;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (BotOrderItem botOrderItem : arrayList) {
            arrayList2.add(new Pair(botOrderItem.getPrice(), botOrderItem.getAmount()));
        }
        return new ArrayList<>(arrayList2);
    }

    public final ArrayList<Pair<String, String>> getSellListPairs() {
        ArrayList<BotOrderItem> arrayList = this.sellList;
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (BotOrderItem botOrderItem : arrayList) {
            arrayList2.add(new Pair(botOrderItem.getPrice(), botOrderItem.getAmount()));
        }
        return new ArrayList<>(arrayList2);
    }
}
