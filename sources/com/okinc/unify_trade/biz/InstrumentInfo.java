package com.okinc.unify_trade.biz;

import androidx.core.app.FrameMetricsAggregator;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
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

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class InstrumentInfo {
    private final String alias;
    private final String baseCcy;
    private final String category;
    private final String closeMaxThresholdRateWeek;
    private final String coinLever;
    private final String coinName;
    private final String continuous;
    private final String ctMult;
    private final String ctType;
    private final String ctVal;
    private final String ctValCcy;
    private final String displayId;
    private final String expTime;
    private final String expiryDisplay;
    private final boolean futureSettlement;
    private final String indexMaxThresholdRate;
    private final String instFamily;
    private final String instId;
    private final String instType;
    private final String isoFlag;
    private final String lever;
    private final String listStage;
    private final String listTime;
    private final String lotSz;
    private final String lpC1;
    private final String lpC2;
    private final String lpX1;
    private final String lpX2;
    private final String lpY1;
    private final String lpY2;
    private final String lpZ1;
    private final String lpZ2;
    private final String masPaDeltaThreshold;
    private final String maxLmtAmt;
    private final String maxLmtSz;
    private final String maxMktAmt;
    private final String maxMktSz;
    private final String minSz;
    private final String newLabel;
    private final String newTag;
    private final String nextSettleTime;
    private final String onlineTime;
    private final String optType;
    private final String platformSidePositionMaxValueUSD;
    private final String preQuote;
    private final String priceLimitStatus;
    private final String pxLimitFactor;
    private final String quoteCcy;
    private final String ruleType;
    private final String settleCcy;
    private final String spotLpH1;
    private final String spotLpH2;
    private final String spotLpH3;
    private final String spotLpJ1;
    private final String spotLpJ2;
    private final String spreadWidthOblDeltaFactor;
    private final String spreadWidthOblDeltaFactorGtHaftV2;
    private final String spreadWidthOblDeltaFactorGtHaftV3;
    private final String spreadWidthOblDeltaFactorLtHaftV2;
    private final String spreadWidthOblDeltaFactorLtHaftV3;
    private final String spreadWidthOblMinBaseSpread;
    private final String spreadWidthOblMinBaseSpreadV2;
    private final String spreadWidthOblMinBaseSpreadV3;
    private final String state;
    private final String status;
    private final String stk;
    private final String tenMinsAfterContractGeneration;
    private final String tickSz;
    private final List<String> tradeQuoteCcyList;
    private final String uly;
    private final String userPositionMaxPercent;
    private final String userPositionMaxValueUSD;
    private final String withinTenMinsOfContractGeneration;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InstrumentInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, -1, -1, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.coinLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tickSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.lotSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.minSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.newTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.newLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.isoFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.onlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.continuous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.preQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.closeMaxThresholdRateWeek;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.indexMaxThresholdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.tenMinsAfterContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.withinTenMinsOfContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component36() {
        return this.maxLmtSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component37() {
        return this.maxMktSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component38() {
        return this.spreadWidthOblMinBaseSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component39() {
        return this.spreadWidthOblDeltaFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component40() {
        return this.pxLimitFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component41() {
        return this.masPaDeltaThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component42() {
        return this.spreadWidthOblMinBaseSpreadV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component43() {
        return this.spreadWidthOblDeltaFactorGtHaftV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component44() {
        return this.spreadWidthOblDeltaFactorLtHaftV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component45() {
        return this.spreadWidthOblMinBaseSpreadV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component46() {
        return this.spreadWidthOblDeltaFactorGtHaftV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component47() {
        return this.spreadWidthOblDeltaFactorLtHaftV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component48() {
        return this.maxLmtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component49() {
        return this.maxMktAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component50() {
        return this.expiryDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component51() {
        return this.priceLimitStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component52() {
        return this.spotLpH1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component53() {
        return this.spotLpH2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component54() {
        return this.spotLpH3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component55() {
        return this.spotLpJ1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component56() {
        return this.spotLpJ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component57() {
        return this.lpX1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component58() {
        return this.lpX2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component59() {
        return this.lpY1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component60() {
        return this.lpY2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component61() {
        return this.lpZ1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component62() {
        return this.lpZ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component63() {
        return this.lpC1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component64() {
        return this.lpC2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component65() {
        return this.futureSettlement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component66() {
        return this.nextSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component67() {
        return this.userPositionMaxPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component68() {
        return this.userPositionMaxValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component69() {
        return this.platformSidePositionMaxValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component70() {
        return this.instFamily;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component71() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component72() {
        return this.tradeQuoteCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component73() {
        return this.listStage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ctMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ctValCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InstrumentInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, boolean z, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, List<String> list, @NotNull String str71) {
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
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        return new InstrumentInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63, str64, z, str65, str66, str67, str68, str69, str70, list, str71);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentInfo)) {
            return false;
        }
        InstrumentInfo instrumentInfo = (InstrumentInfo) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) instrumentInfo.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) instrumentInfo.instId) && Intrinsics.EZpvd((Object) this.uly, (Object) instrumentInfo.uly) && Intrinsics.EZpvd((Object) this.baseCcy, (Object) instrumentInfo.baseCcy) && Intrinsics.EZpvd((Object) this.quoteCcy, (Object) instrumentInfo.quoteCcy) && Intrinsics.EZpvd((Object) this.settleCcy, (Object) instrumentInfo.settleCcy) && Intrinsics.EZpvd((Object) this.ctVal, (Object) instrumentInfo.ctVal) && Intrinsics.EZpvd((Object) this.ctMult, (Object) instrumentInfo.ctMult) && Intrinsics.EZpvd((Object) this.ctValCcy, (Object) instrumentInfo.ctValCcy) && Intrinsics.EZpvd((Object) this.optType, (Object) instrumentInfo.optType) && Intrinsics.EZpvd((Object) this.stk, (Object) instrumentInfo.stk) && Intrinsics.EZpvd((Object) this.listTime, (Object) instrumentInfo.listTime) && Intrinsics.EZpvd((Object) this.expTime, (Object) instrumentInfo.expTime) && Intrinsics.EZpvd((Object) this.lever, (Object) instrumentInfo.lever) && Intrinsics.EZpvd((Object) this.coinLever, (Object) instrumentInfo.coinLever) && Intrinsics.EZpvd((Object) this.tickSz, (Object) instrumentInfo.tickSz) && Intrinsics.EZpvd((Object) this.lotSz, (Object) instrumentInfo.lotSz) && Intrinsics.EZpvd((Object) this.minSz, (Object) instrumentInfo.minSz) && Intrinsics.EZpvd((Object) this.ctType, (Object) instrumentInfo.ctType) && Intrinsics.EZpvd((Object) this.alias, (Object) instrumentInfo.alias) && Intrinsics.EZpvd((Object) this.state, (Object) instrumentInfo.state) && Intrinsics.EZpvd((Object) this.status, (Object) instrumentInfo.status) && Intrinsics.EZpvd((Object) this.newTag, (Object) instrumentInfo.newTag) && Intrinsics.EZpvd((Object) this.newLabel, (Object) instrumentInfo.newLabel) && Intrinsics.EZpvd((Object) this.category, (Object) instrumentInfo.category) && Intrinsics.EZpvd((Object) this.coinName, (Object) instrumentInfo.coinName) && Intrinsics.EZpvd((Object) this.ruleType, (Object) instrumentInfo.ruleType) && Intrinsics.EZpvd((Object) this.isoFlag, (Object) instrumentInfo.isoFlag) && Intrinsics.EZpvd((Object) this.onlineTime, (Object) instrumentInfo.onlineTime) && Intrinsics.EZpvd((Object) this.continuous, (Object) instrumentInfo.continuous) && Intrinsics.EZpvd((Object) this.preQuote, (Object) instrumentInfo.preQuote) && Intrinsics.EZpvd((Object) this.closeMaxThresholdRateWeek, (Object) instrumentInfo.closeMaxThresholdRateWeek) && Intrinsics.EZpvd((Object) this.indexMaxThresholdRate, (Object) instrumentInfo.indexMaxThresholdRate) && Intrinsics.EZpvd((Object) this.tenMinsAfterContractGeneration, (Object) instrumentInfo.tenMinsAfterContractGeneration) && Intrinsics.EZpvd((Object) this.withinTenMinsOfContractGeneration, (Object) instrumentInfo.withinTenMinsOfContractGeneration) && Intrinsics.EZpvd((Object) this.maxLmtSz, (Object) instrumentInfo.maxLmtSz) && Intrinsics.EZpvd((Object) this.maxMktSz, (Object) instrumentInfo.maxMktSz) && Intrinsics.EZpvd((Object) this.spreadWidthOblMinBaseSpread, (Object) instrumentInfo.spreadWidthOblMinBaseSpread) && Intrinsics.EZpvd((Object) this.spreadWidthOblDeltaFactor, (Object) instrumentInfo.spreadWidthOblDeltaFactor) && Intrinsics.EZpvd((Object) this.pxLimitFactor, (Object) instrumentInfo.pxLimitFactor) && Intrinsics.EZpvd((Object) this.masPaDeltaThreshold, (Object) instrumentInfo.masPaDeltaThreshold) && Intrinsics.EZpvd((Object) this.spreadWidthOblMinBaseSpreadV2, (Object) instrumentInfo.spreadWidthOblMinBaseSpreadV2) && Intrinsics.EZpvd((Object) this.spreadWidthOblDeltaFactorGtHaftV2, (Object) instrumentInfo.spreadWidthOblDeltaFactorGtHaftV2) && Intrinsics.EZpvd((Object) this.spreadWidthOblDeltaFactorLtHaftV2, (Object) instrumentInfo.spreadWidthOblDeltaFactorLtHaftV2) && Intrinsics.EZpvd((Object) this.spreadWidthOblMinBaseSpreadV3, (Object) instrumentInfo.spreadWidthOblMinBaseSpreadV3) && Intrinsics.EZpvd((Object) this.spreadWidthOblDeltaFactorGtHaftV3, (Object) instrumentInfo.spreadWidthOblDeltaFactorGtHaftV3) && Intrinsics.EZpvd((Object) this.spreadWidthOblDeltaFactorLtHaftV3, (Object) instrumentInfo.spreadWidthOblDeltaFactorLtHaftV3) && Intrinsics.EZpvd((Object) this.maxLmtAmt, (Object) instrumentInfo.maxLmtAmt) && Intrinsics.EZpvd((Object) this.maxMktAmt, (Object) instrumentInfo.maxMktAmt) && Intrinsics.EZpvd((Object) this.expiryDisplay, (Object) instrumentInfo.expiryDisplay) && Intrinsics.EZpvd((Object) this.priceLimitStatus, (Object) instrumentInfo.priceLimitStatus) && Intrinsics.EZpvd((Object) this.spotLpH1, (Object) instrumentInfo.spotLpH1) && Intrinsics.EZpvd((Object) this.spotLpH2, (Object) instrumentInfo.spotLpH2) && Intrinsics.EZpvd((Object) this.spotLpH3, (Object) instrumentInfo.spotLpH3) && Intrinsics.EZpvd((Object) this.spotLpJ1, (Object) instrumentInfo.spotLpJ1) && Intrinsics.EZpvd((Object) this.spotLpJ2, (Object) instrumentInfo.spotLpJ2) && Intrinsics.EZpvd((Object) this.lpX1, (Object) instrumentInfo.lpX1) && Intrinsics.EZpvd((Object) this.lpX2, (Object) instrumentInfo.lpX2) && Intrinsics.EZpvd((Object) this.lpY1, (Object) instrumentInfo.lpY1) && Intrinsics.EZpvd((Object) this.lpY2, (Object) instrumentInfo.lpY2) && Intrinsics.EZpvd((Object) this.lpZ1, (Object) instrumentInfo.lpZ1) && Intrinsics.EZpvd((Object) this.lpZ2, (Object) instrumentInfo.lpZ2) && Intrinsics.EZpvd((Object) this.lpC1, (Object) instrumentInfo.lpC1) && Intrinsics.EZpvd((Object) this.lpC2, (Object) instrumentInfo.lpC2) && this.futureSettlement == instrumentInfo.futureSettlement && Intrinsics.EZpvd((Object) this.nextSettleTime, (Object) instrumentInfo.nextSettleTime) && Intrinsics.EZpvd((Object) this.userPositionMaxPercent, (Object) instrumentInfo.userPositionMaxPercent) && Intrinsics.EZpvd((Object) this.userPositionMaxValueUSD, (Object) instrumentInfo.userPositionMaxValueUSD) && Intrinsics.EZpvd((Object) this.platformSidePositionMaxValueUSD, (Object) instrumentInfo.platformSidePositionMaxValueUSD) && Intrinsics.EZpvd((Object) this.instFamily, (Object) instrumentInfo.instFamily) && Intrinsics.EZpvd((Object) this.displayId, (Object) instrumentInfo.displayId) && Intrinsics.EZpvd(this.tradeQuoteCcyList, instrumentInfo.tradeQuoteCcyList) && Intrinsics.EZpvd((Object) this.listStage, (Object) instrumentInfo.listStage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseMaxThresholdRateWeek() {
        return this.closeMaxThresholdRateWeek;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinLever() {
        return this.coinLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinName() {
        return this.coinName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContinuous() {
        return this.continuous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtMult() {
        return this.ctMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtType() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCtValCcy() {
        return this.ctValCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpiryDisplay() {
        return this.expiryDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFutureSettlement() {
        return this.futureSettlement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndexMaxThresholdRate() {
        return this.indexMaxThresholdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFamily() {
        return this.instFamily;
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
    public final String getIsoFlag() {
        return this.isoFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLever() {
        return this.lever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListStage() {
        return this.listStage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListTime() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLotSz() {
        return this.lotSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpC1() {
        return this.lpC1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpC2() {
        return this.lpC2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpX1() {
        return this.lpX1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpX2() {
        return this.lpX2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpY1() {
        return this.lpY1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpY2() {
        return this.lpY2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpZ1() {
        return this.lpZ1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLpZ2() {
        return this.lpZ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasPaDeltaThreshold() {
        return this.masPaDeltaThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLmtAmt() {
        return this.maxLmtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLmtSz() {
        return this.maxLmtSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxMktAmt() {
        return this.maxMktAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxMktSz() {
        return this.maxMktSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinSz() {
        return this.minSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewLabel() {
        return this.newLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewTag() {
        return this.newTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextSettleTime() {
        return this.nextSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOnlineTime() {
        return this.onlineTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptType() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformSidePositionMaxValueUSD() {
        return this.platformSidePositionMaxValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreQuote() {
        return this.preQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceLimitStatus() {
        return this.priceLimitStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimitFactor() {
        return this.pxLimitFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRuleType() {
        return this.ruleType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleCcy() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotLpH1() {
        return this.spotLpH1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotLpH2() {
        return this.spotLpH2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotLpH3() {
        return this.spotLpH3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotLpJ1() {
        return this.spotLpJ1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpotLpJ2() {
        return this.spotLpJ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblDeltaFactor() {
        return this.spreadWidthOblDeltaFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblDeltaFactorGtHaftV2() {
        return this.spreadWidthOblDeltaFactorGtHaftV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblDeltaFactorGtHaftV3() {
        return this.spreadWidthOblDeltaFactorGtHaftV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblDeltaFactorLtHaftV2() {
        return this.spreadWidthOblDeltaFactorLtHaftV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblDeltaFactorLtHaftV3() {
        return this.spreadWidthOblDeltaFactorLtHaftV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblMinBaseSpread() {
        return this.spreadWidthOblMinBaseSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblMinBaseSpreadV2() {
        return this.spreadWidthOblMinBaseSpreadV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSpreadWidthOblMinBaseSpreadV3() {
        return this.spreadWidthOblMinBaseSpreadV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getState() {
        return this.state;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStk() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTenMinsAfterContractGeneration() {
        return this.tenMinsAfterContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTickSz() {
        return this.tickSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTradeQuoteCcyList() {
        return this.tradeQuoteCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserPositionMaxPercent() {
        return this.userPositionMaxPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserPositionMaxValueUSD() {
        return this.userPositionMaxValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithinTenMinsOfContractGeneration() {
        return this.withinTenMinsOfContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instType.hashCode();
        int iHashCode2 = this.instId.hashCode();
        int iHashCode3 = this.uly.hashCode();
        int iHashCode4 = this.baseCcy.hashCode();
        int iHashCode5 = this.quoteCcy.hashCode();
        int iHashCode6 = this.settleCcy.hashCode();
        int iHashCode7 = this.ctVal.hashCode();
        int iHashCode8 = this.ctMult.hashCode();
        int iHashCode9 = this.ctValCcy.hashCode();
        int iHashCode10 = this.optType.hashCode();
        int iHashCode11 = this.stk.hashCode();
        int iHashCode12 = this.listTime.hashCode();
        int iHashCode13 = this.expTime.hashCode();
        int iHashCode14 = this.lever.hashCode();
        int iHashCode15 = this.coinLever.hashCode();
        int iHashCode16 = this.tickSz.hashCode();
        int iHashCode17 = this.lotSz.hashCode();
        int iHashCode18 = this.minSz.hashCode();
        int iHashCode19 = this.ctType.hashCode();
        int iHashCode20 = this.alias.hashCode();
        int iHashCode21 = this.state.hashCode();
        int iHashCode22 = this.status.hashCode();
        int iHashCode23 = this.newTag.hashCode();
        int iHashCode24 = this.newLabel.hashCode();
        int iHashCode25 = this.category.hashCode();
        int iHashCode26 = this.coinName.hashCode();
        int iHashCode27 = this.ruleType.hashCode();
        int iHashCode28 = this.isoFlag.hashCode();
        int iHashCode29 = this.onlineTime.hashCode();
        int iHashCode30 = this.continuous.hashCode();
        int iHashCode31 = this.preQuote.hashCode();
        int iHashCode32 = this.closeMaxThresholdRateWeek.hashCode();
        int iHashCode33 = this.indexMaxThresholdRate.hashCode();
        int iHashCode34 = this.tenMinsAfterContractGeneration.hashCode();
        int iHashCode35 = this.withinTenMinsOfContractGeneration.hashCode();
        int iHashCode36 = this.maxLmtSz.hashCode();
        int iHashCode37 = this.maxMktSz.hashCode();
        int iHashCode38 = this.spreadWidthOblMinBaseSpread.hashCode();
        int iHashCode39 = this.spreadWidthOblDeltaFactor.hashCode();
        int iHashCode40 = this.pxLimitFactor.hashCode();
        int iHashCode41 = this.masPaDeltaThreshold.hashCode();
        int iHashCode42 = this.spreadWidthOblMinBaseSpreadV2.hashCode();
        int iHashCode43 = this.spreadWidthOblDeltaFactorGtHaftV2.hashCode();
        int iHashCode44 = this.spreadWidthOblDeltaFactorLtHaftV2.hashCode();
        int iHashCode45 = this.spreadWidthOblMinBaseSpreadV3.hashCode();
        int iHashCode46 = this.spreadWidthOblDeltaFactorGtHaftV3.hashCode();
        int iHashCode47 = this.spreadWidthOblDeltaFactorLtHaftV3.hashCode();
        int iHashCode48 = this.maxLmtAmt.hashCode();
        int iHashCode49 = this.maxMktAmt.hashCode();
        int iHashCode50 = this.expiryDisplay.hashCode();
        int iHashCode51 = this.priceLimitStatus.hashCode();
        int iHashCode52 = this.spotLpH1.hashCode();
        int iHashCode53 = this.spotLpH2.hashCode();
        int iHashCode54 = this.spotLpH3.hashCode();
        int iHashCode55 = this.spotLpJ1.hashCode();
        int iHashCode56 = this.spotLpJ2.hashCode();
        int iHashCode57 = this.lpX1.hashCode();
        int iHashCode58 = this.lpX2.hashCode();
        int iHashCode59 = this.lpY1.hashCode();
        int iHashCode60 = this.lpY2.hashCode();
        int iHashCode61 = this.lpZ1.hashCode();
        int iHashCode62 = this.lpZ2.hashCode();
        int iHashCode63 = this.lpC1.hashCode();
        int iHashCode64 = this.lpC2.hashCode();
        int iHashCode65 = Boolean.hashCode(this.futureSettlement);
        int iHashCode66 = this.nextSettleTime.hashCode();
        int iHashCode67 = this.userPositionMaxPercent.hashCode();
        int iHashCode68 = this.userPositionMaxValueUSD.hashCode();
        int iHashCode69 = this.platformSidePositionMaxValueUSD.hashCode();
        int iHashCode70 = this.instFamily.hashCode();
        int iHashCode71 = this.displayId.hashCode();
        List<String> list = this.tradeQuoteCcyList;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + iHashCode35) * 31) + iHashCode36) * 31) + iHashCode37) * 31) + iHashCode38) * 31) + iHashCode39) * 31) + iHashCode40) * 31) + iHashCode41) * 31) + iHashCode42) * 31) + iHashCode43) * 31) + iHashCode44) * 31) + iHashCode45) * 31) + iHashCode46) * 31) + iHashCode47) * 31) + iHashCode48) * 31) + iHashCode49) * 31) + iHashCode50) * 31) + iHashCode51) * 31) + iHashCode52) * 31) + iHashCode53) * 31) + iHashCode54) * 31) + iHashCode55) * 31) + iHashCode56) * 31) + iHashCode57) * 31) + iHashCode58) * 31) + iHashCode59) * 31) + iHashCode60) * 31) + iHashCode61) * 31) + iHashCode62) * 31) + iHashCode63) * 31) + iHashCode64) * 31) + iHashCode65) * 31) + iHashCode66) * 31) + iHashCode67) * 31) + iHashCode68) * 31) + iHashCode69) * 31) + iHashCode70) * 31) + iHashCode71) * 31) + (list == null ? 0 : list.hashCode())) * 31) + this.listStage.hashCode();
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.InstrumentInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InstrumentInfo> serializer() {
            return InstrumentInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InstrumentInfo(int i, int i2, int i3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, boolean z, String str65, String str66, String str67, String str68, String str69, String str70, List list, String str71, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.uly = "";
        } else {
            this.uly = str3;
        }
        if ((i & 8) == 0) {
            this.baseCcy = "";
        } else {
            this.baseCcy = str4;
        }
        if ((i & 16) == 0) {
            this.quoteCcy = "";
        } else {
            this.quoteCcy = str5;
        }
        if ((i & 32) == 0) {
            this.settleCcy = "";
        } else {
            this.settleCcy = str6;
        }
        if ((i & 64) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str7;
        }
        if ((i & 128) == 0) {
            this.ctMult = "";
        } else {
            this.ctMult = str8;
        }
        if ((i & 256) == 0) {
            this.ctValCcy = "";
        } else {
            this.ctValCcy = str9;
        }
        if ((i & 512) == 0) {
            this.optType = "";
        } else {
            this.optType = str10;
        }
        if ((i & 1024) == 0) {
            this.stk = "";
        } else {
            this.stk = str11;
        }
        if ((i & 2048) == 0) {
            this.listTime = "";
        } else {
            this.listTime = str12;
        }
        if ((i & 4096) == 0) {
            this.expTime = "";
        } else {
            this.expTime = str13;
        }
        if ((i & 8192) == 0) {
            this.lever = "";
        } else {
            this.lever = str14;
        }
        if ((i & 16384) == 0) {
            this.coinLever = "";
        } else {
            this.coinLever = str15;
        }
        if ((i & 32768) == 0) {
            this.tickSz = "";
        } else {
            this.tickSz = str16;
        }
        if ((i & 65536) == 0) {
            this.lotSz = "";
        } else {
            this.lotSz = str17;
        }
        if ((i & 131072) == 0) {
            this.minSz = "";
        } else {
            this.minSz = str18;
        }
        if ((i & 262144) == 0) {
            this.ctType = "";
        } else {
            this.ctType = str19;
        }
        if ((i & 524288) == 0) {
            this.alias = "";
        } else {
            this.alias = str20;
        }
        if ((i & 1048576) == 0) {
            this.state = "";
        } else {
            this.state = str21;
        }
        if ((2097152 & i) == 0) {
            this.status = "";
        } else {
            this.status = str22;
        }
        if ((4194304 & i) == 0) {
            this.newTag = "";
        } else {
            this.newTag = str23;
        }
        if ((8388608 & i) == 0) {
            this.newLabel = "";
        } else {
            this.newLabel = str24;
        }
        if ((16777216 & i) == 0) {
            this.category = "";
        } else {
            this.category = str25;
        }
        if ((33554432 & i) == 0) {
            this.coinName = "";
        } else {
            this.coinName = str26;
        }
        if ((67108864 & i) == 0) {
            this.ruleType = "";
        } else {
            this.ruleType = str27;
        }
        this.isoFlag = (134217728 & i) == 0 ? "1" : str28;
        if ((268435456 & i) == 0) {
            this.onlineTime = "";
        } else {
            this.onlineTime = str29;
        }
        if ((536870912 & i) == 0) {
            this.continuous = "";
        } else {
            this.continuous = str30;
        }
        if ((1073741824 & i) == 0) {
            this.preQuote = "";
        } else {
            this.preQuote = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.closeMaxThresholdRateWeek = "";
        } else {
            this.closeMaxThresholdRateWeek = str32;
        }
        if ((i2 & 1) == 0) {
            this.indexMaxThresholdRate = "";
        } else {
            this.indexMaxThresholdRate = str33;
        }
        if ((i2 & 2) == 0) {
            this.tenMinsAfterContractGeneration = "";
        } else {
            this.tenMinsAfterContractGeneration = str34;
        }
        if ((i2 & 4) == 0) {
            this.withinTenMinsOfContractGeneration = "";
        } else {
            this.withinTenMinsOfContractGeneration = str35;
        }
        if ((i2 & 8) == 0) {
            this.maxLmtSz = "";
        } else {
            this.maxLmtSz = str36;
        }
        if ((i2 & 16) == 0) {
            this.maxMktSz = "";
        } else {
            this.maxMktSz = str37;
        }
        if ((i2 & 32) == 0) {
            this.spreadWidthOblMinBaseSpread = "";
        } else {
            this.spreadWidthOblMinBaseSpread = str38;
        }
        if ((i2 & 64) == 0) {
            this.spreadWidthOblDeltaFactor = "";
        } else {
            this.spreadWidthOblDeltaFactor = str39;
        }
        if ((i2 & 128) == 0) {
            this.pxLimitFactor = "";
        } else {
            this.pxLimitFactor = str40;
        }
        if ((i2 & 256) == 0) {
            this.masPaDeltaThreshold = "";
        } else {
            this.masPaDeltaThreshold = str41;
        }
        if ((i2 & 512) == 0) {
            this.spreadWidthOblMinBaseSpreadV2 = "";
        } else {
            this.spreadWidthOblMinBaseSpreadV2 = str42;
        }
        if ((i2 & 1024) == 0) {
            this.spreadWidthOblDeltaFactorGtHaftV2 = "";
        } else {
            this.spreadWidthOblDeltaFactorGtHaftV2 = str43;
        }
        if ((i2 & 2048) == 0) {
            this.spreadWidthOblDeltaFactorLtHaftV2 = "";
        } else {
            this.spreadWidthOblDeltaFactorLtHaftV2 = str44;
        }
        if ((i2 & 4096) == 0) {
            this.spreadWidthOblMinBaseSpreadV3 = "";
        } else {
            this.spreadWidthOblMinBaseSpreadV3 = str45;
        }
        if ((i2 & 8192) == 0) {
            this.spreadWidthOblDeltaFactorGtHaftV3 = "";
        } else {
            this.spreadWidthOblDeltaFactorGtHaftV3 = str46;
        }
        if ((i2 & 16384) == 0) {
            this.spreadWidthOblDeltaFactorLtHaftV3 = "";
        } else {
            this.spreadWidthOblDeltaFactorLtHaftV3 = str47;
        }
        if ((i2 & 32768) == 0) {
            this.maxLmtAmt = "";
        } else {
            this.maxLmtAmt = str48;
        }
        if ((i2 & 65536) == 0) {
            this.maxMktAmt = "";
        } else {
            this.maxMktAmt = str49;
        }
        if ((i2 & 131072) == 0) {
            this.expiryDisplay = "";
        } else {
            this.expiryDisplay = str50;
        }
        if ((i2 & 262144) == 0) {
            this.priceLimitStatus = "";
        } else {
            this.priceLimitStatus = str51;
        }
        if ((i2 & 524288) == 0) {
            this.spotLpH1 = "";
        } else {
            this.spotLpH1 = str52;
        }
        if ((i2 & 1048576) == 0) {
            this.spotLpH2 = "";
        } else {
            this.spotLpH2 = str53;
        }
        if ((2097152 & i2) == 0) {
            this.spotLpH3 = "";
        } else {
            this.spotLpH3 = str54;
        }
        if ((4194304 & i2) == 0) {
            this.spotLpJ1 = "";
        } else {
            this.spotLpJ1 = str55;
        }
        if ((8388608 & i2) == 0) {
            this.spotLpJ2 = "";
        } else {
            this.spotLpJ2 = str56;
        }
        if ((16777216 & i2) == 0) {
            this.lpX1 = "";
        } else {
            this.lpX1 = str57;
        }
        if ((33554432 & i2) == 0) {
            this.lpX2 = "";
        } else {
            this.lpX2 = str58;
        }
        if ((67108864 & i2) == 0) {
            this.lpY1 = "";
        } else {
            this.lpY1 = str59;
        }
        if ((134217728 & i2) == 0) {
            this.lpY2 = "";
        } else {
            this.lpY2 = str60;
        }
        if ((268435456 & i2) == 0) {
            this.lpZ1 = "";
        } else {
            this.lpZ1 = str61;
        }
        if ((536870912 & i2) == 0) {
            this.lpZ2 = "";
        } else {
            this.lpZ2 = str62;
        }
        if ((1073741824 & i2) == 0) {
            this.lpC1 = "";
        } else {
            this.lpC1 = str63;
        }
        if ((Integer.MIN_VALUE & i2) == 0) {
            this.lpC2 = "";
        } else {
            this.lpC2 = str64;
        }
        this.futureSettlement = (i3 & 1) == 0 ? false : z;
        if ((i3 & 2) == 0) {
            this.nextSettleTime = "";
        } else {
            this.nextSettleTime = str65;
        }
        if ((i3 & 4) == 0) {
            this.userPositionMaxPercent = "";
        } else {
            this.userPositionMaxPercent = str66;
        }
        if ((i3 & 8) == 0) {
            this.userPositionMaxValueUSD = "";
        } else {
            this.userPositionMaxValueUSD = str67;
        }
        if ((i3 & 16) == 0) {
            this.platformSidePositionMaxValueUSD = "";
        } else {
            this.platformSidePositionMaxValueUSD = str68;
        }
        if ((i3 & 32) == 0) {
            this.instFamily = "";
        } else {
            this.instFamily = str69;
        }
        if ((i3 & 64) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str70;
        }
        this.tradeQuoteCcyList = (i3 & 128) == 0 ? null : list;
        if ((i3 & 256) == 0) {
            this.listStage = "";
        } else {
            this.listStage = str71;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(InstrumentInfo instrumentInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) instrumentInfo.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, instrumentInfo.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) instrumentInfo.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, instrumentInfo.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) instrumentInfo.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, instrumentInfo.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) instrumentInfo.baseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, instrumentInfo.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) instrumentInfo.quoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, instrumentInfo.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) instrumentInfo.settleCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, instrumentInfo.settleCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) instrumentInfo.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, instrumentInfo.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) instrumentInfo.ctMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, instrumentInfo.ctMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) instrumentInfo.ctValCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, instrumentInfo.ctValCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) instrumentInfo.optType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, instrumentInfo.optType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) instrumentInfo.stk, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, instrumentInfo.stk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) instrumentInfo.listTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, instrumentInfo.listTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) instrumentInfo.expTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, instrumentInfo.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) instrumentInfo.lever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, instrumentInfo.lever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) instrumentInfo.coinLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, instrumentInfo.coinLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) instrumentInfo.tickSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, instrumentInfo.tickSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) instrumentInfo.lotSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, instrumentInfo.lotSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) instrumentInfo.minSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, instrumentInfo.minSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) instrumentInfo.ctType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, instrumentInfo.ctType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) instrumentInfo.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, instrumentInfo.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) instrumentInfo.state, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, instrumentInfo.state);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) instrumentInfo.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, instrumentInfo.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) instrumentInfo.newTag, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, instrumentInfo.newTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) instrumentInfo.newLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, instrumentInfo.newLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) instrumentInfo.category, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, instrumentInfo.category);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) instrumentInfo.coinName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, instrumentInfo.coinName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) instrumentInfo.ruleType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, instrumentInfo.ruleType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) instrumentInfo.isoFlag, (Object) "1")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, instrumentInfo.isoFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) instrumentInfo.onlineTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, instrumentInfo.onlineTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) instrumentInfo.continuous, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, instrumentInfo.continuous);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) instrumentInfo.preQuote, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, instrumentInfo.preQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) instrumentInfo.closeMaxThresholdRateWeek, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, instrumentInfo.closeMaxThresholdRateWeek);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) instrumentInfo.indexMaxThresholdRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, instrumentInfo.indexMaxThresholdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) instrumentInfo.tenMinsAfterContractGeneration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, instrumentInfo.tenMinsAfterContractGeneration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) instrumentInfo.withinTenMinsOfContractGeneration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, instrumentInfo.withinTenMinsOfContractGeneration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) instrumentInfo.maxLmtSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, instrumentInfo.maxLmtSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) instrumentInfo.maxMktSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, instrumentInfo.maxMktSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblMinBaseSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, instrumentInfo.spreadWidthOblMinBaseSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblDeltaFactor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, instrumentInfo.spreadWidthOblDeltaFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) instrumentInfo.pxLimitFactor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, instrumentInfo.pxLimitFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) instrumentInfo.masPaDeltaThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, instrumentInfo.masPaDeltaThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblMinBaseSpreadV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, instrumentInfo.spreadWidthOblMinBaseSpreadV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblDeltaFactorGtHaftV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, instrumentInfo.spreadWidthOblDeltaFactorGtHaftV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblDeltaFactorLtHaftV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, instrumentInfo.spreadWidthOblDeltaFactorLtHaftV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblMinBaseSpreadV3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, instrumentInfo.spreadWidthOblMinBaseSpreadV3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblDeltaFactorGtHaftV3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, instrumentInfo.spreadWidthOblDeltaFactorGtHaftV3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) instrumentInfo.spreadWidthOblDeltaFactorLtHaftV3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, instrumentInfo.spreadWidthOblDeltaFactorLtHaftV3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) instrumentInfo.maxLmtAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, instrumentInfo.maxLmtAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) instrumentInfo.maxMktAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, instrumentInfo.maxMktAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) instrumentInfo.expiryDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, instrumentInfo.expiryDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) instrumentInfo.priceLimitStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, instrumentInfo.priceLimitStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) instrumentInfo.spotLpH1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, instrumentInfo.spotLpH1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) instrumentInfo.spotLpH2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, instrumentInfo.spotLpH2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) instrumentInfo.spotLpH3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, instrumentInfo.spotLpH3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) instrumentInfo.spotLpJ1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, instrumentInfo.spotLpJ1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) instrumentInfo.spotLpJ2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, instrumentInfo.spotLpJ2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) instrumentInfo.lpX1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, instrumentInfo.lpX1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) instrumentInfo.lpX2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, instrumentInfo.lpX2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) instrumentInfo.lpY1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, instrumentInfo.lpY1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) instrumentInfo.lpY2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, instrumentInfo.lpY2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) instrumentInfo.lpZ1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, instrumentInfo.lpZ1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) instrumentInfo.lpZ2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, instrumentInfo.lpZ2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) || !Intrinsics.EZpvd((Object) instrumentInfo.lpC1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 62, instrumentInfo.lpC1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 63) || !Intrinsics.EZpvd((Object) instrumentInfo.lpC2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 63, instrumentInfo.lpC2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 64) || instrumentInfo.futureSettlement) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 64, instrumentInfo.futureSettlement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 65) || !Intrinsics.EZpvd((Object) instrumentInfo.nextSettleTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 65, instrumentInfo.nextSettleTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 66) || !Intrinsics.EZpvd((Object) instrumentInfo.userPositionMaxPercent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 66, instrumentInfo.userPositionMaxPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 67) || !Intrinsics.EZpvd((Object) instrumentInfo.userPositionMaxValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 67, instrumentInfo.userPositionMaxValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 68) || !Intrinsics.EZpvd((Object) instrumentInfo.platformSidePositionMaxValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 68, instrumentInfo.platformSidePositionMaxValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 69) || !Intrinsics.EZpvd((Object) instrumentInfo.instFamily, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 69, instrumentInfo.instFamily);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 70) || !Intrinsics.EZpvd((Object) instrumentInfo.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 70, instrumentInfo.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 71) || instrumentInfo.tradeQuoteCcyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 71, kSerializerArr[71], instrumentInfo.tradeQuoteCcyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 72) && Intrinsics.EZpvd((Object) instrumentInfo.listStage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 72, instrumentInfo.listStage);
    }

    public InstrumentInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63, @NotNull String str64, boolean z, @NotNull String str65, @NotNull String str66, @NotNull String str67, @NotNull String str68, @NotNull String str69, @NotNull String str70, List<String> list, @NotNull String str71) {
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
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str69, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str71, "");
        this.instType = str;
        this.instId = str2;
        this.uly = str3;
        this.baseCcy = str4;
        this.quoteCcy = str5;
        this.settleCcy = str6;
        this.ctVal = str7;
        this.ctMult = str8;
        this.ctValCcy = str9;
        this.optType = str10;
        this.stk = str11;
        this.listTime = str12;
        this.expTime = str13;
        this.lever = str14;
        this.coinLever = str15;
        this.tickSz = str16;
        this.lotSz = str17;
        this.minSz = str18;
        this.ctType = str19;
        this.alias = str20;
        this.state = str21;
        this.status = str22;
        this.newTag = str23;
        this.newLabel = str24;
        this.category = str25;
        this.coinName = str26;
        this.ruleType = str27;
        this.isoFlag = str28;
        this.onlineTime = str29;
        this.continuous = str30;
        this.preQuote = str31;
        this.closeMaxThresholdRateWeek = str32;
        this.indexMaxThresholdRate = str33;
        this.tenMinsAfterContractGeneration = str34;
        this.withinTenMinsOfContractGeneration = str35;
        this.maxLmtSz = str36;
        this.maxMktSz = str37;
        this.spreadWidthOblMinBaseSpread = str38;
        this.spreadWidthOblDeltaFactor = str39;
        this.pxLimitFactor = str40;
        this.masPaDeltaThreshold = str41;
        this.spreadWidthOblMinBaseSpreadV2 = str42;
        this.spreadWidthOblDeltaFactorGtHaftV2 = str43;
        this.spreadWidthOblDeltaFactorLtHaftV2 = str44;
        this.spreadWidthOblMinBaseSpreadV3 = str45;
        this.spreadWidthOblDeltaFactorGtHaftV3 = str46;
        this.spreadWidthOblDeltaFactorLtHaftV3 = str47;
        this.maxLmtAmt = str48;
        this.maxMktAmt = str49;
        this.expiryDisplay = str50;
        this.priceLimitStatus = str51;
        this.spotLpH1 = str52;
        this.spotLpH2 = str53;
        this.spotLpH3 = str54;
        this.spotLpJ1 = str55;
        this.spotLpJ2 = str56;
        this.lpX1 = str57;
        this.lpX2 = str58;
        this.lpY1 = str59;
        this.lpY2 = str60;
        this.lpZ1 = str61;
        this.lpZ2 = str62;
        this.lpC1 = str63;
        this.lpC2 = str64;
        this.futureSettlement = z;
        this.nextSettleTime = str65;
        this.userPositionMaxPercent = str66;
        this.userPositionMaxValueUSD = str67;
        this.platformSidePositionMaxValueUSD = str68;
        this.instFamily = str69;
        this.displayId = str70;
        this.tradeQuoteCcyList = list;
        this.listStage = str71;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InstrumentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, boolean z, String str65, String str66, String str67, String str68, String str69, String str70, List list, String str71, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str72 = (i & 1) != 0 ? "" : str;
        String str73 = (i & 2) != 0 ? "" : str2;
        String str74 = (i & 4) != 0 ? "" : str3;
        String str75 = (i & 8) != 0 ? "" : str4;
        String str76 = (i & 16) != 0 ? "" : str5;
        String str77 = (i & 32) != 0 ? "" : str6;
        String str78 = (i & 64) != 0 ? "" : str7;
        String str79 = (i & 128) != 0 ? "" : str8;
        String str80 = (i & 256) != 0 ? "" : str9;
        String str81 = (i & 512) != 0 ? "" : str10;
        String str82 = (i & 1024) != 0 ? "" : str11;
        String str83 = (i & 2048) != 0 ? "" : str12;
        String str84 = (i & 4096) != 0 ? "" : str13;
        String str85 = (i & 8192) != 0 ? "" : str14;
        String str86 = (i & 16384) != 0 ? "" : str15;
        String str87 = (i & 32768) != 0 ? "" : str16;
        String str88 = (i & 65536) != 0 ? "" : str17;
        String str89 = (i & 131072) != 0 ? "" : str18;
        String str90 = (i & 262144) != 0 ? "" : str19;
        String str91 = (i & 524288) != 0 ? "" : str20;
        String str92 = (i & 1048576) != 0 ? "" : str21;
        String str93 = (i & 2097152) != 0 ? "" : str22;
        String str94 = (i & 4194304) != 0 ? "" : str23;
        String str95 = (i & 8388608) != 0 ? "" : str24;
        String str96 = (i & 16777216) != 0 ? "" : str25;
        String str97 = (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26;
        String str98 = (i & 67108864) != 0 ? "" : str27;
        String str99 = (i & 134217728) != 0 ? "1" : str28;
        String str100 = (i & 268435456) != 0 ? "" : str29;
        String str101 = (i & 536870912) != 0 ? "" : str30;
        String str102 = (i & 1073741824) != 0 ? "" : str31;
        String str103 = (i & Integer.MIN_VALUE) != 0 ? "" : str32;
        this(str72, str73, str74, str75, str76, str77, str78, str79, str80, str81, str82, str83, str84, str85, str86, str87, str88, str89, str90, str91, str92, str93, str94, str95, str96, str97, str98, str99, str100, str101, str102, str103, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? "" : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38, (i2 & 64) != 0 ? "" : str39, (i2 & 128) != 0 ? "" : str40, (i2 & 256) != 0 ? "" : str41, (i2 & 512) != 0 ? "" : str42, (i2 & 1024) != 0 ? "" : str43, (i2 & 2048) != 0 ? "" : str44, (i2 & 4096) != 0 ? "" : str45, (i2 & 8192) != 0 ? "" : str46, (i2 & 16384) != 0 ? "" : str47, (i2 & 32768) != 0 ? "" : str48, (i2 & 65536) != 0 ? "" : str49, (i2 & 131072) != 0 ? "" : str50, (i2 & 262144) != 0 ? "" : str51, (i2 & 524288) != 0 ? "" : str52, (i2 & 1048576) != 0 ? "" : str53, (i2 & 2097152) != 0 ? "" : str54, (i2 & 4194304) != 0 ? "" : str55, (i2 & 8388608) != 0 ? "" : str56, (i2 & 16777216) != 0 ? "" : str57, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str58, (i2 & 67108864) != 0 ? "" : str59, (i2 & 134217728) != 0 ? "" : str60, (i2 & 268435456) != 0 ? "" : str61, (i2 & 536870912) != 0 ? "" : str62, (i2 & 1073741824) != 0 ? "" : str63, (i2 & Integer.MIN_VALUE) != 0 ? "" : str64, (i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? "" : str65, (i3 & 4) != 0 ? "" : str66, (i3 & 8) != 0 ? "" : str67, (i3 & 16) != 0 ? "" : str68, (i3 & 32) != 0 ? "" : str69, (i3 & 64) != 0 ? "" : str70, (i3 & 128) != 0 ? null : list, (i3 & 256) != 0 ? "" : str71);
    }

    public String toString() {
        return "[instId:" + this.instId + ", instType:" + this.instType + "]";
    }
}
