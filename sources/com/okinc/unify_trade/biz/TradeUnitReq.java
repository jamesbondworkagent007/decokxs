package com.okinc.unify_trade.biz;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class TradeUnitReq {
    private final String ccy;
    private final String chasePriceConfirm;
    private final String confirm;
    private final String depthCountConfirm;
    private final String greekUnit;
    private final String inverseFuturesUnit;
    private final String invertTradeUnit;
    private final String kLineConfig;
    private final String kLineWithPriceConfig;
    private final String limitOrderNotice;
    private final String linearTradeUnit;
    private final String liqPxSwitch;
    private final String manualKLineConfig;
    private final String marketOrderNotice;
    private final String mktCloseConfirm;
    private final String orderNotice;
    private final String placeLayoutConfig;
    private final String realizedPnlSwitch;
    private final String reduceOnlyNotice;
    private final String reversePosConfirm;
    private final String reversePosEnable;
    private final String spotAverageConfig;
    private final List<String> tabCustomConfig;
    private final String type;
    private final String uplPriceType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TradeUnitReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, 33554431, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChasePriceConfirm() {
        return this.chasePriceConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getConfirm() {
        return this.confirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDepthCountConfirm() {
        return this.depthCountConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreekUnit() {
        return this.greekUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInverseFuturesUnit() {
        return this.inverseFuturesUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvertTradeUnit() {
        return this.invertTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKLineConfig() {
        return this.kLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKLineWithPriceConfig() {
        return this.kLineWithPriceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLimitOrderNotice() {
        return this.limitOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLinearTradeUnit() {
        return this.linearTradeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiqPxSwitch() {
        return this.liqPxSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getManualKLineConfig() {
        return this.manualKLineConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketOrderNotice() {
        return this.marketOrderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMktCloseConfirm() {
        return this.mktCloseConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderNotice() {
        return this.orderNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlaceLayoutConfig() {
        return this.placeLayoutConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedPnlSwitch() {
        return this.realizedPnlSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReduceOnlyNotice() {
        return this.reduceOnlyNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReversePosConfirm() {
        return this.reversePosConfirm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReversePosEnable() {
        return this.reversePosEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotAverageConfig() {
        return this.spotAverageConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTabCustomConfig() {
        return this.tabCustomConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUplPriceType() {
        return this.uplPriceType;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.TradeUnitReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TradeUnitReq> serializer() {
            return TradeUnitReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TradeUnitReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, String str21, String str22, String str23, String str24, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.type = "";
        } else {
            this.type = str;
        }
        if ((i & 2) == 0) {
            this.invertTradeUnit = "";
        } else {
            this.invertTradeUnit = str2;
        }
        if ((i & 4) == 0) {
            this.inverseFuturesUnit = "";
        } else {
            this.inverseFuturesUnit = str3;
        }
        if ((i & 8) == 0) {
            this.linearTradeUnit = "";
        } else {
            this.linearTradeUnit = str4;
        }
        if ((i & 16) == 0) {
            this.ccy = "";
        } else {
            this.ccy = str5;
        }
        if ((i & 32) == 0) {
            this.confirm = "";
        } else {
            this.confirm = str6;
        }
        if ((i & 64) == 0) {
            this.depthCountConfirm = "";
        } else {
            this.depthCountConfirm = str7;
        }
        if ((i & 128) == 0) {
            this.kLineWithPriceConfig = "";
        } else {
            this.kLineWithPriceConfig = str8;
        }
        if ((i & 256) == 0) {
            this.greekUnit = "";
        } else {
            this.greekUnit = str9;
        }
        if ((i & 512) == 0) {
            this.kLineConfig = "";
        } else {
            this.kLineConfig = str10;
        }
        if ((i & 1024) == 0) {
            this.manualKLineConfig = "";
        } else {
            this.manualKLineConfig = str11;
        }
        if ((i & 2048) == 0) {
            this.mktCloseConfirm = "";
        } else {
            this.mktCloseConfirm = str12;
        }
        if ((i & 4096) == 0) {
            this.liqPxSwitch = "";
        } else {
            this.liqPxSwitch = str13;
        }
        if ((i & 8192) == 0) {
            this.uplPriceType = "";
        } else {
            this.uplPriceType = str14;
        }
        if ((i & 16384) == 0) {
            this.orderNotice = "";
        } else {
            this.orderNotice = str15;
        }
        if ((32768 & i) == 0) {
            this.limitOrderNotice = "";
        } else {
            this.limitOrderNotice = str16;
        }
        if ((65536 & i) == 0) {
            this.reduceOnlyNotice = "";
        } else {
            this.reduceOnlyNotice = str17;
        }
        if ((131072 & i) == 0) {
            this.reversePosEnable = "";
        } else {
            this.reversePosEnable = str18;
        }
        if ((262144 & i) == 0) {
            this.reversePosConfirm = "";
        } else {
            this.reversePosConfirm = str19;
        }
        if ((524288 & i) == 0) {
            this.placeLayoutConfig = "";
        } else {
            this.placeLayoutConfig = str20;
        }
        this.tabCustomConfig = (1048576 & i) == 0 ? null : list;
        if ((2097152 & i) == 0) {
            this.marketOrderNotice = "";
        } else {
            this.marketOrderNotice = str21;
        }
        if ((4194304 & i) == 0) {
            this.spotAverageConfig = "";
        } else {
            this.spotAverageConfig = str22;
        }
        if ((8388608 & i) == 0) {
            this.chasePriceConfirm = "";
        } else {
            this.chasePriceConfirm = str23;
        }
        if ((i & 16777216) == 0) {
            this.realizedPnlSwitch = "";
        } else {
            this.realizedPnlSwitch = str24;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(TradeUnitReq tradeUnitReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tradeUnitReq.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tradeUnitReq.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tradeUnitReq.invertTradeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tradeUnitReq.invertTradeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) tradeUnitReq.inverseFuturesUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, tradeUnitReq.inverseFuturesUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) tradeUnitReq.linearTradeUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, tradeUnitReq.linearTradeUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tradeUnitReq.ccy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, tradeUnitReq.ccy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) tradeUnitReq.confirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, tradeUnitReq.confirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) tradeUnitReq.depthCountConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, tradeUnitReq.depthCountConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) tradeUnitReq.kLineWithPriceConfig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, tradeUnitReq.kLineWithPriceConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) tradeUnitReq.greekUnit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, tradeUnitReq.greekUnit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) tradeUnitReq.kLineConfig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, tradeUnitReq.kLineConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) tradeUnitReq.manualKLineConfig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, tradeUnitReq.manualKLineConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) tradeUnitReq.mktCloseConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, tradeUnitReq.mktCloseConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) tradeUnitReq.liqPxSwitch, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, tradeUnitReq.liqPxSwitch);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) tradeUnitReq.uplPriceType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, tradeUnitReq.uplPriceType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) tradeUnitReq.orderNotice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, tradeUnitReq.orderNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) tradeUnitReq.limitOrderNotice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, tradeUnitReq.limitOrderNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) tradeUnitReq.reduceOnlyNotice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, tradeUnitReq.reduceOnlyNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) tradeUnitReq.reversePosEnable, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, tradeUnitReq.reversePosEnable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) tradeUnitReq.reversePosConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, tradeUnitReq.reversePosConfirm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) tradeUnitReq.placeLayoutConfig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, tradeUnitReq.placeLayoutConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || tradeUnitReq.tabCustomConfig != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], tradeUnitReq.tabCustomConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) tradeUnitReq.marketOrderNotice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, tradeUnitReq.marketOrderNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) tradeUnitReq.spotAverageConfig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, tradeUnitReq.spotAverageConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) tradeUnitReq.chasePriceConfirm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, tradeUnitReq.chasePriceConfirm);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) && Intrinsics.EZpvd((Object) tradeUnitReq.realizedPnlSwitch, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 24, tradeUnitReq.realizedPnlSwitch);
    }

    public TradeUnitReq(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, List<String> list, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        this.type = str;
        this.invertTradeUnit = str2;
        this.inverseFuturesUnit = str3;
        this.linearTradeUnit = str4;
        this.ccy = str5;
        this.confirm = str6;
        this.depthCountConfirm = str7;
        this.kLineWithPriceConfig = str8;
        this.greekUnit = str9;
        this.kLineConfig = str10;
        this.manualKLineConfig = str11;
        this.mktCloseConfirm = str12;
        this.liqPxSwitch = str13;
        this.uplPriceType = str14;
        this.orderNotice = str15;
        this.limitOrderNotice = str16;
        this.reduceOnlyNotice = str17;
        this.reversePosEnable = str18;
        this.reversePosConfirm = str19;
        this.placeLayoutConfig = str20;
        this.tabCustomConfig = list;
        this.marketOrderNotice = str21;
        this.spotAverageConfig = str22;
        this.chasePriceConfirm = str23;
        this.realizedPnlSwitch = str24;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0122: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r52v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r52v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r52v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r52v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r52v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r52v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r52v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r52v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r52v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r52v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r52v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r52v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r52v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r52v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r52v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r52v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r52v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r52v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r52v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r52v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r52v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r47v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r52v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r52v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r52v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r52v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:35) call: com.okinc.unify_trade.biz.TradeUnitReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TradeUnitReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, List list, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? null : list, (i & 2097152) != 0 ? "" : str21, (i & 4194304) != 0 ? "" : str22, (i & 8388608) != 0 ? "" : str23, (i & 16777216) != 0 ? "" : str24);
    }

    public String toString() {
        return "type:" + this.type + " invertTradeUnit:" + this.invertTradeUnit + " linearTradeUnit:" + this.linearTradeUnit + " ccy:" + this.ccy + " confirm:" + this.confirm + " depthCountConfirm:" + this.depthCountConfirm + " kLineWithPriceConfig:" + this.kLineWithPriceConfig + " greekUnit:" + this.greekUnit + " kLineConfig:" + this.kLineConfig + " manualKLineConfig:" + this.manualKLineConfig + " mktCloseConfirm:" + this.mktCloseConfirm + " liqPxSwitch:" + this.liqPxSwitch + " uplPriceType:" + this.uplPriceType + " orderNotice:" + this.orderNotice + " limitOrderNotice:" + this.limitOrderNotice + " reduceOnlyNotice:" + this.reduceOnlyNotice + " reversePosEnable:" + this.reversePosEnable + " reversePosConfirm:" + this.reversePosConfirm + " placeLayoutConfig:" + this.placeLayoutConfig + " tabCustomConfig:" + this.tabCustomConfig + " marketOrderNotice:" + this.marketOrderNotice + " spotAverageConfig: " + this.spotAverageConfig + " chasePriceConfirm: " + this.chasePriceConfirm;
    }
}
