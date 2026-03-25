package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C54589xNz;
import o.C54606xOp;
import o.InterfaceC54581xNr;
import o.TaskDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class FutureInstrument extends BizInstrument {
    private final String alias;
    private final BaseInstrument baseInfo;
    private final String closeMaxThresholdRateWeek;
    private final String ctMult;
    private final String ctType;
    private final String ctVal;
    private final String ctValCcy;
    private final boolean enableFilter;
    private final String expTime;
    private final String expiryDisplay;
    private final boolean futureSettlement;
    private final String indexMaxThresholdRate;
    private final String instFly;
    private final String level;
    private final String listTime;
    private final String lpC1;
    private final String lpC2;
    private final String lpX1;
    private final String lpX2;
    private final String lpY1;
    private final String lpY2;
    private final String lpZ1;
    private final String lpZ2;
    private boolean mIsPreMarket;
    private boolean mIsRebase;
    private final String maxLmtAmt;
    private final String maxLmtSz;
    private final String maxMktAmt;
    private final String maxMktSz;
    private final String nextSettleTime;
    private final String platformSidePositionMaxValueUSD;
    private final String settleCcy;
    private final String tenMinsAfterContractGeneration;
    private final String uly;
    private final String userPositionMaxPercent;
    private final String userPositionMaxValueUSD;
    private final String withinTenMinsOfContractGeneration;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseInstrument component1() {
        return this.baseInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.level;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.enableFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.closeMaxThresholdRateWeek;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.indexMaxThresholdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tenMinsAfterContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.withinTenMinsOfContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.maxLmtSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.maxMktSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.maxLmtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.maxMktAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.expiryDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component23() {
        return this.futureSettlement;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.nextSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.userPositionMaxPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.userPositionMaxValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.platformSidePositionMaxValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component28() {
        return this.lpX1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.lpX2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instFly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.lpY1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.lpY2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.lpZ1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component33() {
        return this.lpZ2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component34() {
        return this.lpC1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.lpC2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.ctMult;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.ctValCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FutureInstrument copy(@NotNull BaseInstrument baseInstrument, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, boolean z2, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32) {
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
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        return new FutureInstrument(baseInstrument, str, str2, str3, str4, str5, str6, str7, str8, str9, z, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, z2, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean enableFilter() {
        return this.enableFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseInstrument getBaseInfo() {
        return this.baseInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizContinuousStatus() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizPreQuoteStatus() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getBizStatus() {
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseMaxThresholdRateWeek() {
        return this.closeMaxThresholdRateWeek;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public CountDownInfo getCountDownInfo() {
        return null;
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
    public final boolean getEnableFilter() {
        return this.enableFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Possible override for method com.okinc.unify_trade.biz.BizInstrument.getExpiryDisplay()Z */
    public final String getExpiryDisplay() {
        return this.expiryDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getFutureContractVal() {
        return this.ctVal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getFutureMult() {
        return this.ctMult;
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
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getInstFamily() {
        return this.instFly;
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
    public final String getListTime() {
        return this.listTime;
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
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getMarketInfoSettleCcy() {
        return this.settleCcy;
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
    public final String getNextSettleTime() {
        return this.nextSettleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPlatformSidePositionMaxValueUSD() {
        return this.platformSidePositionMaxValueUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleCcy() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTenMinsAfterContractGeneration() {
        return this.tenMinsAfterContractGeneration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUly() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getUnderlying() {
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
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isPreMarketPair() {
        return this.mIsPreMarket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isRebasePair() {
        return this.mIsRebase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreMarket(boolean z) {
        this.mIsPreMarket = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRebasePair(boolean z) {
        this.mIsRebase = z;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.FutureInstrument.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FutureInstrument> serializer() {
            return FutureInstrument$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FutureInstrument(int i, int i2, String str, String str2, BaseInstrument baseInstrument, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, boolean z2, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, boolean z3, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{7, 0}, FutureInstrument$$serializer.INSTANCE.getDescriptor());
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
            this.settleCcy = "";
        } else {
            this.settleCcy = str5;
        }
        if ((i & 64) == 0) {
            this.ctVal = "";
        } else {
            this.ctVal = str6;
        }
        if ((i & 128) == 0) {
            this.ctMult = "";
        } else {
            this.ctMult = str7;
        }
        if ((i & 256) == 0) {
            this.ctValCcy = "";
        } else {
            this.ctValCcy = str8;
        }
        if ((i & 512) == 0) {
            this.listTime = "";
        } else {
            this.listTime = str9;
        }
        if ((i & 1024) == 0) {
            this.expTime = "";
        } else {
            this.expTime = str10;
        }
        if ((i & 2048) == 0) {
            this.level = "";
        } else {
            this.level = str11;
        }
        if ((i & 4096) == 0) {
            this.enableFilter = true;
        } else {
            this.enableFilter = z;
        }
        if ((i & 8192) == 0) {
            this.ctType = "";
        } else {
            this.ctType = str12;
        }
        if ((i & 16384) == 0) {
            this.alias = "";
        } else {
            this.alias = str13;
        }
        if ((32768 & i) == 0) {
            this.closeMaxThresholdRateWeek = "";
        } else {
            this.closeMaxThresholdRateWeek = str14;
        }
        if ((65536 & i) == 0) {
            this.indexMaxThresholdRate = "";
        } else {
            this.indexMaxThresholdRate = str15;
        }
        if ((131072 & i) == 0) {
            this.tenMinsAfterContractGeneration = "";
        } else {
            this.tenMinsAfterContractGeneration = str16;
        }
        if ((262144 & i) == 0) {
            this.withinTenMinsOfContractGeneration = "";
        } else {
            this.withinTenMinsOfContractGeneration = str17;
        }
        if ((524288 & i) == 0) {
            this.maxLmtSz = "";
        } else {
            this.maxLmtSz = str18;
        }
        if ((1048576 & i) == 0) {
            this.maxMktSz = "";
        } else {
            this.maxMktSz = str19;
        }
        if ((2097152 & i) == 0) {
            this.maxLmtAmt = "";
        } else {
            this.maxLmtAmt = str20;
        }
        if ((4194304 & i) == 0) {
            this.maxMktAmt = "";
        } else {
            this.maxMktAmt = str21;
        }
        if ((8388608 & i) == 0) {
            this.expiryDisplay = "";
        } else {
            this.expiryDisplay = str22;
        }
        if ((16777216 & i) == 0) {
            this.futureSettlement = false;
        } else {
            this.futureSettlement = z2;
        }
        if ((33554432 & i) == 0) {
            this.nextSettleTime = "";
        } else {
            this.nextSettleTime = str23;
        }
        if ((67108864 & i) == 0) {
            this.userPositionMaxPercent = "";
        } else {
            this.userPositionMaxPercent = str24;
        }
        if ((134217728 & i) == 0) {
            this.userPositionMaxValueUSD = "";
        } else {
            this.userPositionMaxValueUSD = str25;
        }
        if ((268435456 & i) == 0) {
            this.platformSidePositionMaxValueUSD = "";
        } else {
            this.platformSidePositionMaxValueUSD = str26;
        }
        if ((536870912 & i) == 0) {
            this.lpX1 = "";
        } else {
            this.lpX1 = str27;
        }
        if ((1073741824 & i) == 0) {
            this.lpX2 = "";
        } else {
            this.lpX2 = str28;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.lpY1 = "";
        } else {
            this.lpY1 = str29;
        }
        if ((i2 & 1) == 0) {
            this.lpY2 = "";
        } else {
            this.lpY2 = str30;
        }
        if ((i2 & 2) == 0) {
            this.lpZ1 = "";
        } else {
            this.lpZ1 = str31;
        }
        if ((i2 & 4) == 0) {
            this.lpZ2 = "";
        } else {
            this.lpZ2 = str32;
        }
        if ((i2 & 8) == 0) {
            this.lpC1 = "";
        } else {
            this.lpC1 = str33;
        }
        if ((i2 & 16) == 0) {
            this.lpC2 = "";
        } else {
            this.lpC2 = str34;
        }
        if ((i2 & 32) == 0) {
            this.mIsPreMarket = false;
        } else {
            this.mIsPreMarket = z3;
        }
        if ((i2 & 64) == 0) {
            this.mIsRebase = false;
        } else {
            this.mIsRebase = z4;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FutureInstrument futureInstrument, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BizInstrument.write$Self(futureInstrument, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, futureInstrument.baseInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) futureInstrument.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, futureInstrument.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) futureInstrument.instFly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, futureInstrument.instFly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) futureInstrument.settleCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, futureInstrument.settleCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) futureInstrument.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, futureInstrument.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) futureInstrument.ctMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, futureInstrument.ctMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) futureInstrument.ctValCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, futureInstrument.ctValCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) futureInstrument.listTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, futureInstrument.listTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) futureInstrument.expTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, futureInstrument.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) futureInstrument.level, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, futureInstrument.level);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !futureInstrument.enableFilter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, futureInstrument.enableFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) futureInstrument.ctType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, futureInstrument.ctType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) futureInstrument.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, futureInstrument.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) futureInstrument.closeMaxThresholdRateWeek, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, futureInstrument.closeMaxThresholdRateWeek);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) futureInstrument.indexMaxThresholdRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, futureInstrument.indexMaxThresholdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) futureInstrument.tenMinsAfterContractGeneration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, futureInstrument.tenMinsAfterContractGeneration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) futureInstrument.withinTenMinsOfContractGeneration, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, futureInstrument.withinTenMinsOfContractGeneration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) futureInstrument.maxLmtSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, futureInstrument.maxLmtSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) futureInstrument.maxMktSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, futureInstrument.maxMktSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) futureInstrument.maxLmtAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, futureInstrument.maxLmtAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) futureInstrument.maxMktAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, futureInstrument.maxMktAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) futureInstrument.expiryDisplay, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, futureInstrument.expiryDisplay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || futureInstrument.futureSettlement) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 24, futureInstrument.futureSettlement);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) futureInstrument.nextSettleTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, futureInstrument.nextSettleTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) futureInstrument.userPositionMaxPercent, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, futureInstrument.userPositionMaxPercent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) futureInstrument.userPositionMaxValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, futureInstrument.userPositionMaxValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) futureInstrument.platformSidePositionMaxValueUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, futureInstrument.platformSidePositionMaxValueUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) futureInstrument.lpX1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, futureInstrument.lpX1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) futureInstrument.lpX2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, futureInstrument.lpX2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) futureInstrument.lpY1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, futureInstrument.lpY1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) futureInstrument.lpY2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, futureInstrument.lpY2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) futureInstrument.lpZ1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, futureInstrument.lpZ1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) futureInstrument.lpZ2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, futureInstrument.lpZ2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) futureInstrument.lpC1, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, futureInstrument.lpC1);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) futureInstrument.lpC2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, futureInstrument.lpC2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || futureInstrument.mIsPreMarket) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 37, futureInstrument.mIsPreMarket);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || futureInstrument.mIsRebase) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 38, futureInstrument.mIsRebase);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0190: CONSTRUCTOR 
  (r36v0 com.okinc.unify_trade.biz.BaseInstrument)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r71v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r71v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r71v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r71v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r71v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r71v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r71v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r71v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r71v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004c: ARITH (r71v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r46v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r71v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r71v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r71v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r71v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r71v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r71v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r71v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r71v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r71v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r71v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r71v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r71v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r58v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r71v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r71v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r71v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f0: ARITH (r71v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00fb: ARITH (r71v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0106: ARITH (r71v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0111: ARITH (r71v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x011c: ARITH (r71v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0127: ARITH (r71v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012f: ARITH (r72v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0138: ARITH (r72v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0141: ARITH (r72v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r70v0 java.lang.String) : (""))
 A[MD:(com.okinc.unify_trade.biz.BaseInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:663) call: com.okinc.unify_trade.biz.FutureInstrument.<init>(com.okinc.unify_trade.biz.BaseInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FutureInstrument(BaseInstrument baseInstrument, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, boolean z2, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseInstrument, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? true : z, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? false : z2, (i & 8388608) != 0 ? "" : str21, (i & 16777216) != 0 ? "" : str22, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str23, (i & 67108864) != 0 ? "" : str24, (i & 134217728) != 0 ? "" : str25, (i & 268435456) != 0 ? "" : str26, (i & 536870912) != 0 ? "" : str27, (i & 1073741824) != 0 ? "" : str28, (i & Integer.MIN_VALUE) != 0 ? "" : str29, (i2 & 1) != 0 ? "" : str30, (i2 & 2) != 0 ? "" : str31, (i2 & 4) == 0 ? str32 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureInstrument(@NotNull BaseInstrument baseInstrument, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, boolean z, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, boolean z2, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32) {
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
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        this.baseInfo = baseInstrument;
        this.uly = str;
        this.instFly = str2;
        this.settleCcy = str3;
        this.ctVal = str4;
        this.ctMult = str5;
        this.ctValCcy = str6;
        this.listTime = str7;
        this.expTime = str8;
        this.level = str9;
        this.enableFilter = z;
        this.ctType = str10;
        this.alias = str11;
        this.closeMaxThresholdRateWeek = str12;
        this.indexMaxThresholdRate = str13;
        this.tenMinsAfterContractGeneration = str14;
        this.withinTenMinsOfContractGeneration = str15;
        this.maxLmtSz = str16;
        this.maxMktSz = str17;
        this.maxLmtAmt = str18;
        this.maxMktAmt = str19;
        this.expiryDisplay = str20;
        this.futureSettlement = z2;
        this.nextSettleTime = str21;
        this.userPositionMaxPercent = str22;
        this.userPositionMaxValueUSD = str23;
        this.platformSidePositionMaxValueUSD = str24;
        this.lpX1 = str25;
        this.lpX2 = str26;
        this.lpY1 = str27;
        this.lpY2 = str28;
        this.lpZ1 = str29;
        this.lpZ2 = str30;
        this.lpC1 = str31;
        this.lpC2 = str32;
    }

    public String toString() {
        return "FutureInstrument(baseInfo=" + this.baseInfo + ", uly=" + this.uly + ", instFly=" + this.instFly + ", ctVal=" + this.ctVal + ", expTime=" + this.expTime + ", ctType=" + this.ctType;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FutureInstrument) {
            FutureInstrument futureInstrument = (FutureInstrument) obj;
            return Intrinsics.EZpvd(this.baseInfo, futureInstrument.baseInfo) && Intrinsics.EZpvd((Object) this.alias, (Object) futureInstrument.alias) && Intrinsics.EZpvd((Object) this.ctMult, (Object) futureInstrument.ctMult) && Intrinsics.EZpvd((Object) this.ctVal, (Object) futureInstrument.ctVal) && Intrinsics.EZpvd((Object) this.ctValCcy, (Object) futureInstrument.ctValCcy) && Intrinsics.EZpvd((Object) this.expTime, (Object) futureInstrument.expTime) && Intrinsics.EZpvd((Object) this.settleCcy, (Object) futureInstrument.settleCcy) && Intrinsics.EZpvd((Object) this.ctType, (Object) futureInstrument.ctType);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isPositiveContract() {
        return Intrinsics.EZpvd((Object) this.ctType, (Object) "linear");
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public Boolean isNegativeContract() {
        return Boolean.valueOf(Intrinsics.EZpvd((Object) this.ctType, (Object) "inverse"));
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getProfitSymbol() {
        return getCompatibleSymbol(this.settleCcy);
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getTradeSymbol() {
        String strCopydefault = TaskDescription.AEQbTJ(this.instFly).copydefault();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strCopydefault.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getQuoteSymbol() {
        if (isUSDUMContract()) {
            return "USD";
        }
        String strAEQbTJ = TaskDescription.AEQbTJ(this.instFly).AEQbTJ();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String fullCoinName() {
        return this.baseInfo.getCoinName();
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
    public String getMarginSymbol() {
        return getCompatibleSymbol(this.settleCcy);
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    /* JADX INFO: renamed from: getExpiryDisplay, reason: collision with other method in class */
    public boolean mo7129getExpiryDisplay() {
        return Intrinsics.EZpvd((Object) this.expiryDisplay, (Object) "show");
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getCcyType() {
        String strAEQbTJ = TaskDescription.AEQbTJ(this.instFly).AEQbTJ();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isUSDUMContract() {
        return StringsKt__StringsKt.AhwBna((CharSequence) this.baseInfo.getInstId(), (CharSequence) "_UM", true);
    }

    private final String getCompatibleSymbol(String str) {
        String strRcXXUw;
        C54606xOp c54606xOpOcIXYQ;
        if (isUSDUMContract()) {
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null || (c54606xOpOcIXYQ = interfaceC54581xNrOLrzqt.OcIXYQ()) == null || (strRcXXUw = c54606xOpOcIXYQ.RcXXUw()) == null) {
                strRcXXUw = "";
            }
        } else {
            strRcXXUw = str;
        }
        return (strRcXXUw == null || strRcXXUw.length() == 0) ? str : strRcXXUw;
    }
}
