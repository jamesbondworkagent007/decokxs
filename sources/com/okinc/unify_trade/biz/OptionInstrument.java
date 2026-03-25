package com.okinc.unify_trade.biz;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.TaskDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class OptionInstrument extends BizInstrument {
    private final String alias;
    private final BaseInstrument baseInfo;
    private final String ctMult;
    private final String ctType;
    private final String ctVal;
    private final String ctValCcy;
    private final boolean enableFilter;
    private final String expTime;
    private final String instFly;
    private final String listTime;
    private final String masPaDeltaThreshold;
    private final String maxLmtAmt;
    private final String maxMktAmt;
    private final String optType;
    private final String pxLimitFactor;
    private final String settleCcy;
    private final String spreadWidthOblDeltaFactor;
    private final String spreadWidthOblDeltaFactorGtHaftV2;
    private final String spreadWidthOblDeltaFactorGtHaftV3;
    private final String spreadWidthOblDeltaFactorLtHaftV2;
    private final String spreadWidthOblDeltaFactorLtHaftV3;
    private final String spreadWidthOblMinBaseSpread;
    private final String spreadWidthOblMinBaseSpreadV2;
    private final String spreadWidthOblMinBaseSpreadV3;
    private final String stk;
    private final String uly;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

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
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.alias;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.spreadWidthOblMinBaseSpread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.spreadWidthOblDeltaFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.pxLimitFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.masPaDeltaThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.spreadWidthOblMinBaseSpreadV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.spreadWidthOblDeltaFactorGtHaftV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.spreadWidthOblDeltaFactorLtHaftV2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.spreadWidthOblMinBaseSpreadV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.spreadWidthOblDeltaFactorGtHaftV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.spreadWidthOblDeltaFactorLtHaftV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.maxLmtAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.maxMktAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.ctType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instFly;
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
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OptionInstrument copy(@NotNull BaseInstrument baseInstrument, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24) {
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
        return new OptionInstrument(baseInstrument, str, str2, str3, str4, str5, str6, str7, str8, z, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
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
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getInstFamily() {
        return this.instFly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstFly() {
        return this.instFly;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getListTime() {
        return this.listTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getMarginSymbol() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getMarketInfoSettleCcy() {
        return this.settleCcy;
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
    public final String getMaxMktAmt() {
        return this.maxMktAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptType() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptionExpTime() {
        return this.expTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptionOptType() {
        return this.optType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOptionStk() {
        return this.stk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String getProfitSymbol() {
        return this.settleCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPxLimitFactor() {
        return this.pxLimitFactor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleCcy() {
        return this.settleCcy;
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
    public final String getStk() {
        return this.stk;
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

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public boolean isNewTag() {
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

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.OptionInstrument.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OptionInstrument> serializer() {
            return OptionInstrument$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OptionInstrument(int i, String str, String str2, BaseInstrument baseInstrument, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, SerializationConstructorMarker serializationConstructorMarker) {
        super(i, str, str2, serializationConstructorMarker);
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, OptionInstrument$$serializer.INSTANCE.getDescriptor());
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
            this.optType = "";
        } else {
            this.optType = str9;
        }
        if ((i & 1024) == 0) {
            this.stk = "";
        } else {
            this.stk = str10;
        }
        this.enableFilter = (i & 2048) == 0 ? true : z;
        if ((i & 4096) == 0) {
            this.listTime = "";
        } else {
            this.listTime = str11;
        }
        if ((i & 8192) == 0) {
            this.expTime = "";
        } else {
            this.expTime = str12;
        }
        if ((i & 16384) == 0) {
            this.alias = "";
        } else {
            this.alias = str13;
        }
        if ((32768 & i) == 0) {
            this.spreadWidthOblMinBaseSpread = "";
        } else {
            this.spreadWidthOblMinBaseSpread = str14;
        }
        if ((65536 & i) == 0) {
            this.spreadWidthOblDeltaFactor = "";
        } else {
            this.spreadWidthOblDeltaFactor = str15;
        }
        if ((131072 & i) == 0) {
            this.pxLimitFactor = "";
        } else {
            this.pxLimitFactor = str16;
        }
        if ((262144 & i) == 0) {
            this.masPaDeltaThreshold = "";
        } else {
            this.masPaDeltaThreshold = str17;
        }
        if ((524288 & i) == 0) {
            this.spreadWidthOblMinBaseSpreadV2 = "";
        } else {
            this.spreadWidthOblMinBaseSpreadV2 = str18;
        }
        if ((1048576 & i) == 0) {
            this.spreadWidthOblDeltaFactorGtHaftV2 = "";
        } else {
            this.spreadWidthOblDeltaFactorGtHaftV2 = str19;
        }
        if ((2097152 & i) == 0) {
            this.spreadWidthOblDeltaFactorLtHaftV2 = "";
        } else {
            this.spreadWidthOblDeltaFactorLtHaftV2 = str20;
        }
        if ((4194304 & i) == 0) {
            this.spreadWidthOblMinBaseSpreadV3 = "";
        } else {
            this.spreadWidthOblMinBaseSpreadV3 = str21;
        }
        if ((8388608 & i) == 0) {
            this.spreadWidthOblDeltaFactorGtHaftV3 = "";
        } else {
            this.spreadWidthOblDeltaFactorGtHaftV3 = str22;
        }
        if ((16777216 & i) == 0) {
            this.spreadWidthOblDeltaFactorLtHaftV3 = "";
        } else {
            this.spreadWidthOblDeltaFactorLtHaftV3 = str23;
        }
        if ((33554432 & i) == 0) {
            this.maxLmtAmt = "";
        } else {
            this.maxLmtAmt = str24;
        }
        if ((67108864 & i) == 0) {
            this.maxMktAmt = "";
        } else {
            this.maxMktAmt = str25;
        }
        if ((i & 134217728) == 0) {
            this.ctType = "";
        } else {
            this.ctType = str26;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(OptionInstrument optionInstrument, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        BizInstrument.write$Self(optionInstrument, compositeEncoder, serialDescriptor);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, BaseInstrument$$serializer.INSTANCE, optionInstrument.baseInfo);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) optionInstrument.uly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, optionInstrument.uly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) optionInstrument.instFly, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, optionInstrument.instFly);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) optionInstrument.settleCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, optionInstrument.settleCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) optionInstrument.ctVal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, optionInstrument.ctVal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) optionInstrument.ctMult, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, optionInstrument.ctMult);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) optionInstrument.ctValCcy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, optionInstrument.ctValCcy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) optionInstrument.optType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, optionInstrument.optType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) optionInstrument.stk, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, optionInstrument.stk);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !optionInstrument.enableFilter) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, optionInstrument.enableFilter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) optionInstrument.listTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, optionInstrument.listTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) optionInstrument.expTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, optionInstrument.expTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) optionInstrument.alias, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, optionInstrument.alias);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblMinBaseSpread, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, optionInstrument.spreadWidthOblMinBaseSpread);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblDeltaFactor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, optionInstrument.spreadWidthOblDeltaFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) optionInstrument.pxLimitFactor, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, optionInstrument.pxLimitFactor);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) optionInstrument.masPaDeltaThreshold, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, optionInstrument.masPaDeltaThreshold);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblMinBaseSpreadV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, optionInstrument.spreadWidthOblMinBaseSpreadV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblDeltaFactorGtHaftV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, optionInstrument.spreadWidthOblDeltaFactorGtHaftV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblDeltaFactorLtHaftV2, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, optionInstrument.spreadWidthOblDeltaFactorLtHaftV2);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblMinBaseSpreadV3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, optionInstrument.spreadWidthOblMinBaseSpreadV3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblDeltaFactorGtHaftV3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, optionInstrument.spreadWidthOblDeltaFactorGtHaftV3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) optionInstrument.spreadWidthOblDeltaFactorLtHaftV3, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, optionInstrument.spreadWidthOblDeltaFactorLtHaftV3);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) optionInstrument.maxLmtAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, optionInstrument.maxLmtAmt);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) optionInstrument.maxMktAmt, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, optionInstrument.maxMktAmt);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) && Intrinsics.EZpvd((Object) optionInstrument.ctType, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 27, optionInstrument.ctType);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0122: CONSTRUCTOR 
  (r28v0 com.okinc.unify_trade.biz.BaseInstrument)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r54v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r54v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r54v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r54v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r54v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r54v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r54v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r54v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0044: ARITH (r54v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? true : (r37v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r54v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r54v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r54v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r54v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r54v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r54v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r54v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008d: ARITH (r54v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0098: ARITH (r54v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r54v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ae: ARITH (r54v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (r54v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c4: ARITH (r54v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cf: ARITH (r54v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00da: ARITH (r54v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e5: ARITH (r54v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) == (0 int)) ? (r53v0 java.lang.String) : (""))
 A[MD:(com.okinc.unify_trade.biz.BaseInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:862) call: com.okinc.unify_trade.biz.OptionInstrument.<init>(com.okinc.unify_trade.biz.BaseInstrument, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OptionInstrument(BaseInstrument baseInstrument, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseInstrument, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? true : z, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? "" : str11, (i & 8192) != 0 ? "" : str12, (i & 16384) != 0 ? "" : str13, (i & 32768) != 0 ? "" : str14, (i & 65536) != 0 ? "" : str15, (i & 131072) != 0 ? "" : str16, (i & 262144) != 0 ? "" : str17, (i & 524288) != 0 ? "" : str18, (i & 1048576) != 0 ? "" : str19, (i & 2097152) != 0 ? "" : str20, (i & 4194304) != 0 ? "" : str21, (i & 8388608) != 0 ? "" : str22, (i & 16777216) != 0 ? "" : str23, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) == 0 ? str24 : "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionInstrument(@NotNull BaseInstrument baseInstrument, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, boolean z, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24) {
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
        this.baseInfo = baseInstrument;
        this.uly = str;
        this.instFly = str2;
        this.settleCcy = str3;
        this.ctVal = str4;
        this.ctMult = str5;
        this.ctValCcy = str6;
        this.optType = str7;
        this.stk = str8;
        this.enableFilter = z;
        this.listTime = str9;
        this.expTime = str10;
        this.alias = str11;
        this.spreadWidthOblMinBaseSpread = str12;
        this.spreadWidthOblDeltaFactor = str13;
        this.pxLimitFactor = str14;
        this.masPaDeltaThreshold = str15;
        this.spreadWidthOblMinBaseSpreadV2 = str16;
        this.spreadWidthOblDeltaFactorGtHaftV2 = str17;
        this.spreadWidthOblDeltaFactorLtHaftV2 = str18;
        this.spreadWidthOblMinBaseSpreadV3 = str19;
        this.spreadWidthOblDeltaFactorGtHaftV3 = str20;
        this.spreadWidthOblDeltaFactorLtHaftV3 = str21;
        this.maxLmtAmt = str22;
        this.maxMktAmt = str23;
        this.ctType = str24;
    }

    public String toString() {
        return "OptionInstrument(baseInfo=" + this.baseInfo + ", uly=" + this.uly + ", instFly=" + this.instFly + ", ctVal=" + this.ctVal + ", ctMult=" + this.ctMult + ", optType=" + this.optType + ", ctType=" + this.ctType;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OptionInstrument) {
            OptionInstrument optionInstrument = (OptionInstrument) obj;
            return Intrinsics.EZpvd(this.baseInfo, optionInstrument.baseInfo) && Intrinsics.EZpvd((Object) this.ctMult, (Object) optionInstrument.ctMult) && Intrinsics.EZpvd((Object) this.ctVal, (Object) optionInstrument.ctVal) && Intrinsics.EZpvd((Object) this.ctValCcy, (Object) optionInstrument.ctValCcy) && Intrinsics.EZpvd((Object) this.expTime, (Object) optionInstrument.expTime) && Intrinsics.EZpvd((Object) this.optType, (Object) optionInstrument.optType) && Intrinsics.EZpvd((Object) this.settleCcy, (Object) optionInstrument.settleCcy) && Intrinsics.EZpvd((Object) this.stk, (Object) optionInstrument.stk);
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
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
        String strAEQbTJ = TaskDescription.AEQbTJ(this.instFly).AEQbTJ();
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String upperCase = strAEQbTJ.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "");
        return upperCase;
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
    public boolean isNewLabel() {
        return Intrinsics.EZpvd((Object) this.baseInfo.getNewLabel(), (Object) "1");
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public String fullCoinName() {
        return this.baseInfo.getCoinName();
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
    public boolean isPositiveContract() {
        return Intrinsics.EZpvd((Object) this.ctType, (Object) "linear");
    }

    @Override // com.okinc.unify_trade.biz.BizInstrument
    public Boolean isNegativeContract() {
        return Boolean.valueOf(Intrinsics.EZpvd((Object) this.ctType, (Object) "inverse"));
    }
}
