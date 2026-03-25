package com.okinc.unify_trade.bot.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class GridPendingOrderData {
    private static final KSerializer<Object>[] $childSerializers;
    private final List<GridPendingItemData> buyList;
    private final String currentPrice;
    private final String gridProfit;
    private final String instId;
    private final String instType;
    private final String priceUnit;
    private final List<GridPendingItemData> sellList;
    private final String tradeCount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GridPendingOrderData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.priceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tradeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GridPendingItemData> component7() {
        return this.buyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GridPendingItemData> component8() {
        return this.sellList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridPendingOrderData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<GridPendingItemData> list, @NotNull List<GridPendingItemData> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new GridPendingOrderData(str, str2, str3, str4, str5, str6, list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GridPendingOrderData)) {
            return false;
        }
        GridPendingOrderData gridPendingOrderData = (GridPendingOrderData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) gridPendingOrderData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) gridPendingOrderData.instType) && Intrinsics.EZpvd((Object) this.priceUnit, (Object) gridPendingOrderData.priceUnit) && Intrinsics.EZpvd((Object) this.gridProfit, (Object) gridPendingOrderData.gridProfit) && Intrinsics.EZpvd((Object) this.currentPrice, (Object) gridPendingOrderData.currentPrice) && Intrinsics.EZpvd((Object) this.tradeCount, (Object) gridPendingOrderData.tradeCount) && Intrinsics.EZpvd(this.buyList, gridPendingOrderData.buyList) && Intrinsics.EZpvd(this.sellList, gridPendingOrderData.sellList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GridPendingItemData> getBuyList() {
        return this.buyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGridProfit() {
        return this.gridProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<GridPendingItemData> getSellList() {
        return this.sellList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeCount() {
        return this.tradeCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.instId.hashCode() * 31) + this.instType.hashCode()) * 31) + this.priceUnit.hashCode()) * 31) + this.gridProfit.hashCode()) * 31) + this.currentPrice.hashCode()) * 31) + this.tradeCount.hashCode()) * 31) + this.buyList.hashCode()) * 31) + this.sellList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridPendingOrderData(instId=" + this.instId + ", instType=" + this.instType + ", priceUnit=" + this.priceUnit + ", gridProfit=" + this.gridProfit + ", currentPrice=" + this.currentPrice + ", tradeCount=" + this.tradeCount + ", buyList=" + this.buyList + ", sellList=" + this.sellList + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.bot.data.GridPendingOrderData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GridPendingOrderData> serializer() {
            return GridPendingOrderData$$serializer.INSTANCE;
        }
    }

    static {
        GridPendingItemData$$serializer gridPendingItemData$$serializer = GridPendingItemData$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, new ArrayListSerializer(gridPendingItemData$$serializer), new ArrayListSerializer(gridPendingItemData$$serializer)};
    }

    public /* synthetic */ GridPendingOrderData(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instId = "";
        } else {
            this.instId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.priceUnit = "";
        } else {
            this.priceUnit = str3;
        }
        if ((i & 8) == 0) {
            this.gridProfit = "";
        } else {
            this.gridProfit = str4;
        }
        if ((i & 16) == 0) {
            this.currentPrice = "";
        } else {
            this.currentPrice = str5;
        }
        if ((i & 32) == 0) {
            this.tradeCount = "";
        } else {
            this.tradeCount = str6;
        }
        if ((i & 64) == 0) {
            this.buyList = yDY.AhwBna();
        } else {
            this.buyList = list;
        }
        if ((i & 128) == 0) {
            this.sellList = yDY.AhwBna();
        } else {
            this.sellList = list2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(GridPendingOrderData gridPendingOrderData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) gridPendingOrderData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, gridPendingOrderData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) gridPendingOrderData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, gridPendingOrderData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) gridPendingOrderData.priceUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, gridPendingOrderData.priceUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) gridPendingOrderData.gridProfit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, gridPendingOrderData.gridProfit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) gridPendingOrderData.currentPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, gridPendingOrderData.currentPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) gridPendingOrderData.tradeCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, gridPendingOrderData.tradeCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd(gridPendingOrderData.buyList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, kSerializerArr[6], gridPendingOrderData.buyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd(gridPendingOrderData.sellList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], gridPendingOrderData.sellList);
    }

    public GridPendingOrderData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<GridPendingItemData> list, @NotNull List<GridPendingItemData> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.instId = str;
        this.instType = str2;
        this.priceUnit = str3;
        this.gridProfit = str4;
        this.currentPrice = str5;
        this.tradeCount = str6;
        this.buyList = list;
        this.sellList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1225)) : (r15v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r17v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1226)) : (r16v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.bot.data.GridPendingItemData>, java.util.List<com.okinc.unify_trade.bot.data.GridPendingItemData>):void (m)] (LINE:1218) call: com.okinc.unify_trade.bot.data.GridPendingOrderData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ GridPendingOrderData(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? yDY.AhwBna() : list, (i & 128) != 0 ? yDY.AhwBna() : list2);
    }
}
