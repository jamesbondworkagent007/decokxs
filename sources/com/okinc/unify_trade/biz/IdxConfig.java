package com.okinc.unify_trade.biz;

import java.util.ArrayList;
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
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class IdxConfig {
    public static final String DEFAULT_SHEET_DIG = "0";
    private final String baseDig;
    private String baseDigDisplay;
    private final String contractDig;
    private final List<String> depthLvl;
    private final String displayId;
    private final String feeDig;
    private final String fundingFeeDig;
    private final String greeksDig;
    private final String instType;
    private final String marginDig;
    private final String marketEntrustMaxSz;
    private final String marketMaxSz;
    private final String marketPlanEntrustMaxSz;
    private final String marketStopMaxSz;
    private final String positionDig;
    private final String profitDig;
    private final String quoteDig;
    private final String quoteFeeDig;
    private final String referId;
    private final String sheetDig;
    private final List<TickConfig> tickConfig;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TickConfig$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.INSTANCE), null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IdxConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (String) null, (String) null, 2097151, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.referId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.sheetDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.greeksDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.fundingFeeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.positionDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.marketMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.marketStopMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.marketEntrustMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.marketPlanEntrustMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TickConfig> component18() {
        return this.tickConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component19() {
        return this.depthLvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.baseDigDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.feeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.quoteFeeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.marginDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.profitDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.contractDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IdxConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull List<TickConfig> list, @NotNull List<String> list2, @NotNull String str18, @NotNull String str19) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        return new IdxConfig(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, list, list2, str18, str19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseDig() {
        return this.baseDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseDigDisplay() {
        return this.baseDigDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractDig() {
        return this.contractDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDepthLvl() {
        return this.depthLvl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeDig() {
        return this.feeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingFeeDig() {
        return this.fundingFeeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreeksDig() {
        return this.greeksDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarginDig() {
        return this.marginDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketEntrustMaxSz() {
        return this.marketEntrustMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketMaxSz() {
        return this.marketMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketPlanEntrustMaxSz() {
        return this.marketPlanEntrustMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketStopMaxSz() {
        return this.marketStopMaxSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPositionDig() {
        return this.positionDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitDig() {
        return this.profitDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteDig() {
        return this.quoteDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteFeeDig() {
        return this.quoteFeeDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferId() {
        return this.referId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSheetDig() {
        return this.sheetDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TickConfig> getTickConfig() {
        return this.tickConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseDigDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseDigDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IdxConfig(referId=" + this.referId + ", instType=" + this.instType + ", baseDig=" + this.baseDig + ", quoteDig=" + this.quoteDig + ", feeDig=" + this.feeDig + ", quoteFeeDig=" + this.quoteFeeDig + ", marginDig=" + this.marginDig + ", profitDig=" + this.profitDig + ", contractDig=" + this.contractDig + ", sheetDig=" + this.sheetDig + ", greeksDig=" + this.greeksDig + ", fundingFeeDig=" + this.fundingFeeDig + ", positionDig=" + this.positionDig + ", marketMaxSz=" + this.marketMaxSz + ", marketStopMaxSz=" + this.marketStopMaxSz + ", marketEntrustMaxSz=" + this.marketEntrustMaxSz + ", marketPlanEntrustMaxSz=" + this.marketPlanEntrustMaxSz + ", tickConfig=" + this.tickConfig + ", depthLvl=" + this.depthLvl + ", displayId=" + this.displayId + ", baseDigDisplay=" + this.baseDigDisplay + ")";
    }

    public /* synthetic */ IdxConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, List list2, String str18, String str19, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.referId = "";
        } else {
            this.referId = str;
        }
        if ((i & 2) == 0) {
            this.instType = "";
        } else {
            this.instType = str2;
        }
        if ((i & 4) == 0) {
            this.baseDig = "";
        } else {
            this.baseDig = str3;
        }
        if ((i & 8) == 0) {
            this.quoteDig = "";
        } else {
            this.quoteDig = str4;
        }
        if ((i & 16) == 0) {
            this.feeDig = "";
        } else {
            this.feeDig = str5;
        }
        if ((i & 32) == 0) {
            this.quoteFeeDig = "";
        } else {
            this.quoteFeeDig = str6;
        }
        if ((i & 64) == 0) {
            this.marginDig = "";
        } else {
            this.marginDig = str7;
        }
        if ((i & 128) == 0) {
            this.profitDig = "";
        } else {
            this.profitDig = str8;
        }
        if ((i & 256) == 0) {
            this.contractDig = "";
        } else {
            this.contractDig = str9;
        }
        if ((i & 512) == 0) {
            this.sheetDig = "";
        } else {
            this.sheetDig = str10;
        }
        if ((i & 1024) == 0) {
            this.greeksDig = "";
        } else {
            this.greeksDig = str11;
        }
        if ((i & 2048) == 0) {
            this.fundingFeeDig = "";
        } else {
            this.fundingFeeDig = str12;
        }
        if ((i & 4096) == 0) {
            this.positionDig = "";
        } else {
            this.positionDig = str13;
        }
        if ((i & 8192) == 0) {
            this.marketMaxSz = "";
        } else {
            this.marketMaxSz = str14;
        }
        if ((i & 16384) == 0) {
            this.marketStopMaxSz = "";
        } else {
            this.marketStopMaxSz = str15;
        }
        if ((32768 & i) == 0) {
            this.marketEntrustMaxSz = "";
        } else {
            this.marketEntrustMaxSz = str16;
        }
        if ((65536 & i) == 0) {
            this.marketPlanEntrustMaxSz = "";
        } else {
            this.marketPlanEntrustMaxSz = str17;
        }
        this.tickConfig = (131072 & i) == 0 ? new ArrayList() : list;
        this.depthLvl = (262144 & i) == 0 ? new ArrayList() : list2;
        if ((524288 & i) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str18;
        }
        if ((i & 1048576) == 0) {
            this.baseDigDisplay = "";
        } else {
            this.baseDigDisplay = str19;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(IdxConfig idxConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) idxConfig.referId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, idxConfig.referId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) idxConfig.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, idxConfig.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) idxConfig.baseDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, idxConfig.baseDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) idxConfig.quoteDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, idxConfig.quoteDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) idxConfig.feeDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, idxConfig.feeDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) idxConfig.quoteFeeDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, idxConfig.quoteFeeDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) idxConfig.marginDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, idxConfig.marginDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) idxConfig.profitDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, idxConfig.profitDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) idxConfig.contractDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, idxConfig.contractDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) idxConfig.sheetDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, idxConfig.sheetDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) idxConfig.greeksDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, idxConfig.greeksDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) idxConfig.fundingFeeDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, idxConfig.fundingFeeDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) idxConfig.positionDig, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, idxConfig.positionDig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) idxConfig.marketMaxSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, idxConfig.marketMaxSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) idxConfig.marketStopMaxSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, idxConfig.marketStopMaxSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) idxConfig.marketEntrustMaxSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, idxConfig.marketEntrustMaxSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) idxConfig.marketPlanEntrustMaxSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, idxConfig.marketPlanEntrustMaxSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(idxConfig.tickConfig, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], idxConfig.tickConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd(idxConfig.depthLvl, new ArrayList())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], idxConfig.depthLvl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) idxConfig.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, idxConfig.displayId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) && Intrinsics.EZpvd((Object) idxConfig.baseDigDisplay, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 20, idxConfig.baseDigDisplay);
    }

    public IdxConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull List<TickConfig> list, @NotNull List<String> list2, @NotNull String str18, @NotNull String str19) {
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
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        this.referId = str;
        this.instType = str2;
        this.baseDig = str3;
        this.quoteDig = str4;
        this.feeDig = str5;
        this.quoteFeeDig = str6;
        this.marginDig = str7;
        this.profitDig = str8;
        this.contractDig = str9;
        this.sheetDig = str10;
        this.greeksDig = str11;
        this.fundingFeeDig = str12;
        this.positionDig = str13;
        this.marketMaxSz = str14;
        this.marketStopMaxSz = str15;
        this.marketEntrustMaxSz = str16;
        this.marketPlanEntrustMaxSz = str17;
        this.tickConfig = list;
        this.depthLvl = list2;
        this.displayId = str18;
        this.baseDigDisplay = str19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00f4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r44v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r44v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r44v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r44v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r44v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r44v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r44v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r44v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r44v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r44v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r44v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r44v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r44v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r44v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r44v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r44v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r44v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0098: ARITH (r44v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009e: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1263) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r40v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a6: ARITH (r44v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00ac: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1264) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r41v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b4: ARITH (r44v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00bf: ARITH (r44v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.TickConfig>, java.util.List<java.lang.String>, java.lang.String, java.lang.String):void (m)] (LINE:1245) call: com.okinc.unify_trade.biz.IdxConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ IdxConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, List list, List list2, String str18, String str19, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? new ArrayList() : list, (i & 262144) != 0 ? new ArrayList() : list2, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.IdxConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IdxConfig> serializer() {
            return IdxConfig$$serializer.INSTANCE;
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof IdxConfig) {
            IdxConfig idxConfig = (IdxConfig) obj;
            if (Intrinsics.EZpvd((Object) this.referId, (Object) idxConfig.referId) && Intrinsics.EZpvd((Object) this.instType, (Object) idxConfig.instType) && Intrinsics.EZpvd((Object) this.baseDig, (Object) idxConfig.baseDig) && Intrinsics.EZpvd((Object) this.quoteDig, (Object) idxConfig.quoteDig) && Intrinsics.EZpvd((Object) this.feeDig, (Object) idxConfig.feeDig) && Intrinsics.EZpvd((Object) this.quoteFeeDig, (Object) idxConfig.quoteFeeDig) && Intrinsics.EZpvd((Object) this.marginDig, (Object) idxConfig.marginDig) && Intrinsics.EZpvd((Object) this.profitDig, (Object) idxConfig.profitDig) && Intrinsics.EZpvd((Object) this.contractDig, (Object) idxConfig.contractDig) && Intrinsics.EZpvd((Object) this.greeksDig, (Object) idxConfig.greeksDig) && Intrinsics.EZpvd((Object) this.fundingFeeDig, (Object) idxConfig.fundingFeeDig)) {
                String str = this.positionDig;
                if (Intrinsics.EZpvd((Object) str, (Object) str)) {
                    String str2 = this.marketMaxSz;
                    if (Intrinsics.EZpvd((Object) str2, (Object) str2) && Intrinsics.EZpvd((Object) this.marketStopMaxSz, (Object) idxConfig.marketStopMaxSz) && Intrinsics.EZpvd((Object) this.marketEntrustMaxSz, (Object) idxConfig.marketEntrustMaxSz) && Intrinsics.EZpvd((Object) this.marketPlanEntrustMaxSz, (Object) idxConfig.marketPlanEntrustMaxSz) && Intrinsics.EZpvd((Object) this.displayId, (Object) idxConfig.displayId) && Intrinsics.EZpvd((Object) this.baseDigDisplay, (Object) idxConfig.baseDigDisplay) && compareDepthLv(this.depthLvl, idxConfig.depthLvl)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    private final boolean compareDepthLv(List<String> list, List<String> list2) {
        boolean z = false;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                yDY.AYXKKw();
            }
            z = list2.size() >= i2 && Intrinsics.EZpvd((Object) obj, (Object) list2.get(i));
            i = i2;
        }
        return z;
    }
}
