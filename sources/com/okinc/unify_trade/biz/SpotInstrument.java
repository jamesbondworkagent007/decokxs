package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.AbstractC54531xLw;
import o.C54589xNz;
import o.InterfaceC54581xNr;
import o.pUU;
import o.xLL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class SpotInstrument extends BizInstrument {
    private String baseCcy;
    private final BaseInstrument baseInfo;
    private final String coinLever;
    private final String continuous;
    private final String displayId;
    private final String displayQuoteCcy;
    private final boolean enableFilter;
    private final String indexMaxThresholdRate;
    private final String instFly;
    private final String level;
    private final String listStage;
    private final String listTime;
    private final String lpX1;
    private final String lpX2;
    private final String lpY1;
    private final String lpY2;
    private final String lpZ1;
    private final String lpZ2;
    private final String maxLmtAmt;
    private final String maxMktAmt;
    private final String preQuote;
    private final String priceLimitStatus;
    private String quoteCcy;
    private final String spotLpH1;
    private final String spotLpH2;
    private final String spotLpH3;
    private final String spotLpJ1;
    private final String spotLpJ2;
    private final String status;
    private final String tenMinsAfterContractGeneration;
    private final List<String> tradeQuoteCcyList;
    private final String uly;
    private final String withinTenMinsOfContractGeneration;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component30() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component31() {
        return this.displayQuoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final List<String> component32() {
        return this.tradeQuoteCcyList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final String component33() {
        return this.listStage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseInstrument component1() {
        return this.baseInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.enableFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.maxLmtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.maxMktAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.withinTenMinsOfContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tenMinsAfterContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.indexMaxThresholdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.priceLimitStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.spotLpH1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.spotLpH2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.spotLpH3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.spotLpJ1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.spotLpJ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.lpX1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.lpX2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.lpY1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.lpY2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.lpZ1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.lpZ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instFly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.coinLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.preQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.continuous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotInstrument copy(@NotNull BaseInstrument baseInstrument, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, List<String> list, @NotNull String str30) {
        Intrinsics.checkNotNullParameter(baseInstrument, "");
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
        return new SpotInstrument(baseInstrument, str, str2, str3, str4, str5, str6, str7, str8, z, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, list, str30);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean enableFilter() {
        return this.enableFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCcy() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseInstrument getBaseInfo() {
        return this.baseInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizContinuousStatus() {
        return this.continuous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizPreQuoteListStage() {
        return "PRE_QUOTE_IND";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizPreQuoteStatus() {
        return this.preQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getCcyType() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinLever() {
        return this.coinLever;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContinuous() {
        return this.continuous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEnableFilter() {
        return this.enableFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getFutureContractVal() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getFutureMult() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIndexMaxThresholdRate() {
        return this.indexMaxThresholdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFly() {
        return this.instFly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLevel() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getListStage() {
        return this.listStage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListTime() {
        return this.listTime;
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
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getMarginSymbol() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxLmtAmt() {
        return this.maxLmtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxMktAmt() {
        return this.maxMktAmt;
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
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getProfitSymbol() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteCcy() {
        return this.quoteCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getQuoteSymbol() {
        return this.quoteCcy;
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
    public final String getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTenMinsAfterContractGeneration() {
        return this.tenMinsAfterContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getTradeSymbol() {
        return this.baseCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWithinTenMinsOfContractGeneration() {
        return this.withinTenMinsOfContractGeneration;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public Boolean isNegativeContract() {
        return null;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isPositiveContract() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isPreMarketPair() {
        return false;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isRebasePair() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCcy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteCcy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteCcy = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.SpotInstrument.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotInstrument> serializer() {
            return SpotInstrument$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SpotInstrument(int i, int i2, String str, String str2, BaseInstrument baseInstrument, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, List list, String str32, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{7, 0}, SpotInstrument$$serializer.INSTANCE.getDescriptor());
        }
        this.baseInfo = baseInstrument;
        if ((i & 8) == 0) {
            this.uly = "";
        } else {
            this.uly = str3;
        }
        if ((i & 16) == 0) {
            this.instFly = "";
        } else {
            this.instFly = str4;
        }
        if ((i & 32) == 0) {
            this.baseCcy = "";
        } else {
            this.baseCcy = str5;
        }
        if ((i & 64) == 0) {
            this.quoteCcy = "";
        } else {
            this.quoteCcy = str6;
        }
        if ((i & 128) == 0) {
            this.level = "";
        } else {
            this.level = str7;
        }
        if ((i & 256) == 0) {
            this.coinLever = "";
        } else {
            this.coinLever = str8;
        }
        if ((i & 512) == 0) {
            this.preQuote = "";
        } else {
            this.preQuote = str9;
        }
        if ((i & 1024) == 0) {
            this.continuous = "";
        } else {
            this.continuous = str10;
        }
        if ((i & 2048) == 0) {
            this.enableFilter = true;
        } else {
            this.enableFilter = z;
        }
        if ((i & 4096) == 0) {
            this.status = "";
        } else {
            this.status = str11;
        }
        if ((i & 8192) == 0) {
            this.listTime = "";
        } else {
            this.listTime = str12;
        }
        if ((i & 16384) == 0) {
            this.maxLmtAmt = "";
        } else {
            this.maxLmtAmt = str13;
        }
        if ((32768 & i) == 0) {
            this.maxMktAmt = "";
        } else {
            this.maxMktAmt = str14;
        }
        if ((65536 & i) == 0) {
            this.withinTenMinsOfContractGeneration = "";
        } else {
            this.withinTenMinsOfContractGeneration = str15;
        }
        if ((131072 & i) == 0) {
            this.tenMinsAfterContractGeneration = "";
        } else {
            this.tenMinsAfterContractGeneration = str16;
        }
        if ((262144 & i) == 0) {
            this.indexMaxThresholdRate = "";
        } else {
            this.indexMaxThresholdRate = str17;
        }
        if ((524288 & i) == 0) {
            this.priceLimitStatus = "";
        } else {
            this.priceLimitStatus = str18;
        }
        if ((1048576 & i) == 0) {
            this.spotLpH1 = "";
        } else {
            this.spotLpH1 = str19;
        }
        if ((2097152 & i) == 0) {
            this.spotLpH2 = "";
        } else {
            this.spotLpH2 = str20;
        }
        if ((4194304 & i) == 0) {
            this.spotLpH3 = "";
        } else {
            this.spotLpH3 = str21;
        }
        if ((8388608 & i) == 0) {
            this.spotLpJ1 = "";
        } else {
            this.spotLpJ1 = str22;
        }
        if ((16777216 & i) == 0) {
            this.spotLpJ2 = "";
        } else {
            this.spotLpJ2 = str23;
        }
        if ((33554432 & i) == 0) {
            this.lpX1 = "";
        } else {
            this.lpX1 = str24;
        }
        if ((67108864 & i) == 0) {
            this.lpX2 = "";
        } else {
            this.lpX2 = str25;
        }
        if ((134217728 & i) == 0) {
            this.lpY1 = "";
        } else {
            this.lpY1 = str26;
        }
        if ((268435456 & i) == 0) {
            this.lpY2 = "";
        } else {
            this.lpY2 = str27;
        }
        if ((536870912 & i) == 0) {
            this.lpZ1 = "";
        } else {
            this.lpZ1 = str28;
        }
        if ((1073741824 & i) == 0) {
            this.lpZ2 = "";
        } else {
            this.lpZ2 = str29;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.displayId = "";
        } else {
            this.displayId = str30;
        }
        if ((i2 & 1) == 0) {
            this.displayQuoteCcy = "";
        } else {
            this.displayQuoteCcy = str31;
        }
        this.tradeQuoteCcyList = (i2 & 2) == 0 ? null : list;
        if ((i2 & 4) == 0) {
            this.listStage = "";
        } else {
            this.listStage = str32;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(SpotInstrument spotInstrument, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BizInstrument.write$Self(spotInstrument, compositeEncoder, serialDescriptor);
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, spotInstrument.baseInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) spotInstrument.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, spotInstrument.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) spotInstrument.instFly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, spotInstrument.instFly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) spotInstrument.baseCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, spotInstrument.baseCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) spotInstrument.quoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, spotInstrument.quoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) spotInstrument.level, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, spotInstrument.level);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) spotInstrument.coinLever, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, spotInstrument.coinLever);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) spotInstrument.preQuote, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, spotInstrument.preQuote);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) spotInstrument.continuous, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, spotInstrument.continuous);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !spotInstrument.enableFilter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, spotInstrument.enableFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) spotInstrument.status, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, spotInstrument.status);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) spotInstrument.listTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, spotInstrument.listTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) spotInstrument.maxLmtAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, spotInstrument.maxLmtAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) spotInstrument.maxMktAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, spotInstrument.maxMktAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) spotInstrument.withinTenMinsOfContractGeneration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, spotInstrument.withinTenMinsOfContractGeneration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) spotInstrument.tenMinsAfterContractGeneration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, spotInstrument.tenMinsAfterContractGeneration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) spotInstrument.indexMaxThresholdRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, spotInstrument.indexMaxThresholdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) spotInstrument.priceLimitStatus, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, spotInstrument.priceLimitStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) spotInstrument.spotLpH1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, spotInstrument.spotLpH1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) spotInstrument.spotLpH2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, spotInstrument.spotLpH2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) spotInstrument.spotLpH3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, spotInstrument.spotLpH3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) spotInstrument.spotLpJ1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, spotInstrument.spotLpJ1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) spotInstrument.spotLpJ2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, spotInstrument.spotLpJ2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) spotInstrument.lpX1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, spotInstrument.lpX1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) spotInstrument.lpX2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, spotInstrument.lpX2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) spotInstrument.lpY1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, spotInstrument.lpY1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) spotInstrument.lpY2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, spotInstrument.lpY2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) spotInstrument.lpZ1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, spotInstrument.lpZ1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) spotInstrument.lpZ2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, spotInstrument.lpZ2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) spotInstrument.displayId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, spotInstrument.displayId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) spotInstrument.displayQuoteCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, spotInstrument.displayQuoteCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || spotInstrument.tradeQuoteCcyList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, kSerializerArr[33], spotInstrument.tradeQuoteCcyList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) && Intrinsics.EZpvd((Object) spotInstrument.listStage, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 34, spotInstrument.listStage);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x017c: CONSTRUCTOR 
  (r34v0 com.okinc.unify_trade.biz.BaseInstrument)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r67v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r67v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r67v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r67v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r67v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r67v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r67v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r67v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r67v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r43v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r67v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r67v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r67v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r67v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r67v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r67v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r67v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r67v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r67v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r67v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r67v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r67v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r67v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r67v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r67v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r67v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r67v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r67v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r67v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r67v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r67v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0127: ARITH (r67v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r65v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0131: ARITH (r68v0 int) & (1 int) A[WRAPPED]) == (0 int)) ? (r66v0 java.lang.String) : (""))
 A[MD:(com.okinc.unify_trade.biz.BaseInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String):void (m)] (LINE:184) call: com.okinc.unify_trade.biz.SpotInstrument.<init>(com.okinc.unify_trade.biz.BaseInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SpotInstrument(BaseInstrument baseInstrument, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, List list, String str30, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseInstrument, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? "" : str21, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str24, (i & 67108864) != 0 ? "" : str25, (i & 134217728) != 0 ? "" : str26, (i & 268435456) != 0 ? "" : str27, (i & 536870912) != 0 ? "" : str28, (i & 1073741824) != 0 ? "" : str29, (i & Integer.MIN_VALUE) != 0 ? null : list, (i2 & 1) == 0 ? str30 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotInstrument(@NotNull BaseInstrument baseInstrument, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, List<String> list, @NotNull String str30) {
        super(baseInstrument.getInstId(), baseInstrument.getInstType());
        Intrinsics.checkNotNullParameter(baseInstrument, "");
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
        this.baseInfo = baseInstrument;
        this.uly = str;
        this.instFly = str2;
        this.baseCcy = str3;
        this.quoteCcy = str4;
        this.level = str5;
        this.coinLever = str6;
        this.preQuote = str7;
        this.continuous = str8;
        this.enableFilter = z;
        this.status = str9;
        this.listTime = str10;
        this.maxLmtAmt = str11;
        this.maxMktAmt = str12;
        this.withinTenMinsOfContractGeneration = str13;
        this.tenMinsAfterContractGeneration = str14;
        this.indexMaxThresholdRate = str15;
        this.priceLimitStatus = str16;
        this.spotLpH1 = str17;
        this.spotLpH2 = str18;
        this.spotLpH3 = str19;
        this.spotLpJ1 = str20;
        this.spotLpJ2 = str21;
        this.lpX1 = str22;
        this.lpX2 = str23;
        this.lpY1 = str24;
        this.lpY2 = str25;
        this.lpZ1 = str26;
        this.lpZ2 = str27;
        this.displayId = str28;
        this.displayQuoteCcy = str29;
        this.tradeQuoteCcyList = list;
        this.listStage = str30;
    }

    public String toString() {
        return "SpotInstrument(baseInfo=" + this.baseInfo + ", uly=" + this.uly + ", instFly=" + this.instFly + ", baseCcy=" + this.baseCcy + ", quoteCcy=" + this.quoteCcy + ", level=" + this.level + ", continuous=" + this.continuous + ", status=" + this.status + ")";
    }

    public final boolean compare(Object obj) {
        if (obj instanceof SpotInstrument) {
            SpotInstrument spotInstrument = (SpotInstrument) obj;
            if (Intrinsics.EZpvd((Object) this.baseInfo.getInstId(), (Object) spotInstrument.baseInfo.getInstId()) && Intrinsics.EZpvd((Object) this.level, (Object) spotInstrument.level) && Intrinsics.EZpvd((Object) this.listTime, (Object) spotInstrument.listTime) && Intrinsics.EZpvd((Object) this.status, (Object) spotInstrument.status)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof SpotInstrument) {
            SpotInstrument spotInstrument = (SpotInstrument) obj;
            return Intrinsics.EZpvd(this.baseInfo, spotInstrument.baseInfo) && Intrinsics.EZpvd((Object) this.level, (Object) spotInstrument.level) && Intrinsics.EZpvd((Object) this.preQuote, (Object) spotInstrument.preQuote) && Intrinsics.EZpvd((Object) this.continuous, (Object) spotInstrument.continuous) && Intrinsics.EZpvd((Object) spotInstrument.status, (Object) this.status);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getUnderlying() {
        return Intrinsics.EZpvd((Object) getInstType(), (Object) "SPOT") ? getInstId() : this.uly;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getInstFamily() {
        return Intrinsics.EZpvd((Object) getInstType(), (Object) "SPOT") ? getInstId() : this.instFly;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String fullCoinName() {
        return this.baseInfo.getCoinName();
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public CountDownInfo getCountDownInfo() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.OLrzqt("SPOT") : null;
        if (abstractC54531xLwOLrzqt instanceof xLL) {
            return ((xLL) abstractC54531xLwOLrzqt).values(getInstId());
        }
        return null;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isOnLine() {
        String state = this.baseInfo.getState();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = state.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return Intrinsics.EZpvd((Object) upperCase, (Object) "LIVE");
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isNewTag() {
        return Intrinsics.EZpvd((Object) this.baseInfo.getNewTag(), (Object) "1");
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isNewLabel() {
        return Intrinsics.EZpvd((Object) this.baseInfo.getNewLabel(), (Object) "1");
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getTickerSize() {
        return this.baseInfo.getTickSz();
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getLotSize() {
        return this.baseInfo.getLotSz();
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getMinSize() {
        return this.baseInfo.getMinSz();
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getDisplayId() {
        return this.displayId.length() == 0 ? getInstId() : this.displayId;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getDisplayQuoteSymbol() {
        return this.displayId.length() == 0 ? getQuoteSymbol() : this.displayQuoteCcy;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isDisplayTradeReceive() {
        pUU.KWHzl("SpotInstrument", "isDisplayTradeReceive instId = " + getInstId() + " tradeQuoteCcyList = " + this.tradeQuoteCcyList);
        List<String> list = this.tradeQuoteCcyList;
        return list != null && list.size() > 1;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isSupportTradeReceive() {
        pUU.KWHzl("SpotInstrument", "isSupportTradeReceive instId = " + getInstId() + " tradeQuoteCcyList = " + this.tradeQuoteCcyList);
        List<String> list = this.tradeQuoteCcyList;
        return list != null && list.size() >= 1;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public List<String> getTradeQuoteCcyList() {
        pUU.KWHzl("SpotInstrument", "getTradeQuoteCcyList instId = " + getInstId() + " tradeQuoteCcyList = " + this.tradeQuoteCcyList);
        return this.tradeQuoteCcyList;
    }
}
