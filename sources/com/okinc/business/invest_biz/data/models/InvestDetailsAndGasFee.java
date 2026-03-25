package com.okinc.business.invest_biz.data.models;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.BoostParameters;
import com.okinc.business.invest_biz.data.bean.BoostParameters$$serializer;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.HeathFactorInfo;
import com.okinc.business.invest_biz.data.bean.HeathFactorInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.NetworkFee;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.bean.PointInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.PromptInformation$$serializer;
import com.okinc.business.invest_biz.data.bean.SwapSlippageConfig;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep$$serializer;
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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestDetailsAndGasFee {
    public static final KSerializer<Object>[] $childSerializers;
    public final BoostParameters boostParameters;
    public final InvestTokenWithAmount borrowFee;
    public final String collateral;
    public final CollateralRatioInfo collateralRatioInfo;
    public final String deadline;
    public final String estimateGasFee;
    public final String exchangeRate;
    public final String fixedApy;
    public final List<InvestTokenWithAmount> gainsTokenList;
    public final InvestGasPriceConfig gasPriceConfig;
    public final HeathFactorInfo healthFactorInfo;
    public final List<InvestTokenWithAmount> investWithTokenList;
    public final boolean isAllowSubscribe;
    public final String maturityTime;
    public final List<PointInfo> pointsList;
    public final List<InvestTipInfoVo> productExtInfoList;
    public final PromptInformation promptInformation;
    public final InvestTokenWithAmount receiveTokenInfo;
    public final List<InvestTokenWithAmount> safeMoonTokenList;
    public final String settlementTime;
    public final String subscribeCallDataExtInfo;
    public final List<InvestTokenWithAmount> swapToTokenList;
    public final List<ExpectTokenInfo> tokenInfoList;
    public final String totalGainsCurrencyAmount;
    public final InvestTransactionLossInfo transactionLossInfo;
    public final List<TransactionStep> transactionStepList;
    public final String valueDeviationPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestDetailsAndGasFee() {
        this((InvestGasPriceConfig) null, (List) null, (List) null, (String) null, (InvestTokenWithAmount) null, (List) null, (String) null, (String) null, (List) null, (List) null, (String) null, (PromptInformation) null, (InvestTransactionLossInfo) null, (String) null, (String) null, (CollateralRatioInfo) null, (List) null, false, (String) null, (String) null, (List) null, (String) null, (List) null, (String) null, (HeathFactorInfo) null, (InvestTokenWithAmount) null, (BoostParameters) null, 134217727, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CollateralRatioInfo AEQbTJ() {
        return this.collateralRatioInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.exchangeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.deadline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.maturityTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.settlementTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTipInfoVo> DbNXlk() {
        return this.productExtInfoList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoostParameters EZpvd() {
        return this.boostParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.collateral;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailsAndGasFee OLrzqt(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull List<InvestTokenWithAmount> list, @NotNull List<InvestTokenWithAmount> list2, String str, InvestTokenWithAmount investTokenWithAmount, @NotNull List<InvestTokenWithAmount> list3, @NotNull String str2, @NotNull String str3, @NotNull List<ExpectTokenInfo> list4, @NotNull List<InvestTokenWithAmount> list5, @NotNull String str4, @NotNull PromptInformation promptInformation, @NotNull InvestTransactionLossInfo investTransactionLossInfo, @NotNull String str5, @NotNull String str6, @NotNull CollateralRatioInfo collateralRatioInfo, @NotNull List<TransactionStep> list6, boolean z, @NotNull String str7, @NotNull String str8, List<InvestTipInfoVo> list7, String str9, @NotNull List<PointInfo> list8, String str10, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, BoostParameters boostParameters) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(promptInformation, "");
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list8, "");
        return new InvestDetailsAndGasFee(investGasPriceConfig, list, list2, str, investTokenWithAmount, list3, str2, str3, list4, list5, str4, promptInformation, investTransactionLossInfo, str5, str6, collateralRatioInfo, list6, z, str7, str8, list7, str9, list8, str10, heathFactorInfo, investTokenWithAmount2, boostParameters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount copydefault() {
        return this.borrowFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> djBIcL() {
        return this.gainsTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.subscribeCallDataExtInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InvestDetailsAndGasFee)) {
            return false;
        }
        InvestDetailsAndGasFee investDetailsAndGasFee = (InvestDetailsAndGasFee) obj;
        return Intrinsics.EZpvd(this.gasPriceConfig, investDetailsAndGasFee.gasPriceConfig) && Intrinsics.EZpvd(this.investWithTokenList, investDetailsAndGasFee.investWithTokenList) && Intrinsics.EZpvd(this.gainsTokenList, investDetailsAndGasFee.gainsTokenList) && Intrinsics.EZpvd((Object) this.totalGainsCurrencyAmount, (Object) investDetailsAndGasFee.totalGainsCurrencyAmount) && Intrinsics.EZpvd(this.receiveTokenInfo, investDetailsAndGasFee.receiveTokenInfo) && Intrinsics.EZpvd(this.swapToTokenList, investDetailsAndGasFee.swapToTokenList) && Intrinsics.EZpvd((Object) this.valueDeviationPercentage, (Object) investDetailsAndGasFee.valueDeviationPercentage) && Intrinsics.EZpvd((Object) this.estimateGasFee, (Object) investDetailsAndGasFee.estimateGasFee) && Intrinsics.EZpvd(this.tokenInfoList, investDetailsAndGasFee.tokenInfoList) && Intrinsics.EZpvd(this.safeMoonTokenList, investDetailsAndGasFee.safeMoonTokenList) && Intrinsics.EZpvd((Object) this.exchangeRate, (Object) investDetailsAndGasFee.exchangeRate) && Intrinsics.EZpvd(this.promptInformation, investDetailsAndGasFee.promptInformation) && Intrinsics.EZpvd(this.transactionLossInfo, investDetailsAndGasFee.transactionLossInfo) && Intrinsics.EZpvd((Object) this.fixedApy, (Object) investDetailsAndGasFee.fixedApy) && Intrinsics.EZpvd((Object) this.maturityTime, (Object) investDetailsAndGasFee.maturityTime) && Intrinsics.EZpvd(this.collateralRatioInfo, investDetailsAndGasFee.collateralRatioInfo) && Intrinsics.EZpvd(this.transactionStepList, investDetailsAndGasFee.transactionStepList) && this.isAllowSubscribe == investDetailsAndGasFee.isAllowSubscribe && Intrinsics.EZpvd((Object) this.deadline, (Object) investDetailsAndGasFee.deadline) && Intrinsics.EZpvd((Object) this.settlementTime, (Object) investDetailsAndGasFee.settlementTime) && Intrinsics.EZpvd(this.productExtInfoList, investDetailsAndGasFee.productExtInfoList) && Intrinsics.EZpvd((Object) this.subscribeCallDataExtInfo, (Object) investDetailsAndGasFee.subscribeCallDataExtInfo) && Intrinsics.EZpvd(this.pointsList, investDetailsAndGasFee.pointsList) && Intrinsics.EZpvd((Object) this.collateral, (Object) investDetailsAndGasFee.collateral) && Intrinsics.EZpvd(this.healthFactorInfo, investDetailsAndGasFee.healthFactorInfo) && Intrinsics.EZpvd(this.borrowFee, investDetailsAndGasFee.borrowFee) && Intrinsics.EZpvd(this.boostParameters, investDetailsAndGasFee.boostParameters);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> fARcdN() {
        return this.safeMoonTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount fIwbmz() {
        return this.receiveTokenInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PromptInformation fJNWhG() {
        return this.promptInformation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PointInfo> fetchVPNInfo() {
        return this.pointsList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestGasPriceConfig gEmmrt() {
        return this.gasPriceConfig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransactionStep> getFieldNames() {
        return this.transactionStepList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTransactionLossInfo getNewProxyInstance() {
        return this.transactionLossInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> hDKMBd() {
        return this.swapToTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gasPriceConfig.hashCode();
        int iHashCode2 = this.investWithTokenList.hashCode();
        int iHashCode3 = this.gainsTokenList.hashCode();
        String str = this.totalGainsCurrencyAmount;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
        int iHashCode5 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
        int iHashCode6 = this.swapToTokenList.hashCode();
        int iHashCode7 = this.valueDeviationPercentage.hashCode();
        int iHashCode8 = this.estimateGasFee.hashCode();
        int iHashCode9 = this.tokenInfoList.hashCode();
        int iHashCode10 = this.safeMoonTokenList.hashCode();
        int iHashCode11 = this.exchangeRate.hashCode();
        int iHashCode12 = this.promptInformation.hashCode();
        int iHashCode13 = this.transactionLossInfo.hashCode();
        int iHashCode14 = this.fixedApy.hashCode();
        int iHashCode15 = this.maturityTime.hashCode();
        int iHashCode16 = this.collateralRatioInfo.hashCode();
        int iHashCode17 = this.transactionStepList.hashCode();
        int iHashCode18 = Boolean.hashCode(this.isAllowSubscribe);
        int iHashCode19 = this.deadline.hashCode();
        int iHashCode20 = this.settlementTime.hashCode();
        List<InvestTipInfoVo> list = this.productExtInfoList;
        int iHashCode21 = list == null ? 0 : list.hashCode();
        String str2 = this.subscribeCallDataExtInfo;
        int iHashCode22 = str2 == null ? 0 : str2.hashCode();
        int iHashCode23 = this.pointsList.hashCode();
        String str3 = this.collateral;
        int iHashCode24 = str3 == null ? 0 : str3.hashCode();
        HeathFactorInfo heathFactorInfo = this.healthFactorInfo;
        int iHashCode25 = heathFactorInfo == null ? 0 : heathFactorInfo.hashCode();
        InvestTokenWithAmount investTokenWithAmount2 = this.borrowFee;
        int iHashCode26 = investTokenWithAmount2 == null ? 0 : investTokenWithAmount2.hashCode();
        BoostParameters boostParameters = this.boostParameters;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + (boostParameters == null ? 0 : boostParameters.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HeathFactorInfo isConnected() {
        return this.healthFactorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.valueDeviationPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestDetailsAndGasFee(gasPriceConfig=" + this.gasPriceConfig + ", investWithTokenList=" + this.investWithTokenList + ", gainsTokenList=" + this.gainsTokenList + ", totalGainsCurrencyAmount=" + this.totalGainsCurrencyAmount + ", receiveTokenInfo=" + this.receiveTokenInfo + ", swapToTokenList=" + this.swapToTokenList + ", valueDeviationPercentage=" + this.valueDeviationPercentage + ", estimateGasFee=" + this.estimateGasFee + ", tokenInfoList=" + this.tokenInfoList + ", safeMoonTokenList=" + this.safeMoonTokenList + ", exchangeRate=" + this.exchangeRate + ", promptInformation=" + this.promptInformation + ", transactionLossInfo=" + this.transactionLossInfo + ", fixedApy=" + this.fixedApy + ", maturityTime=" + this.maturityTime + ", collateralRatioInfo=" + this.collateralRatioInfo + ", transactionStepList=" + this.transactionStepList + ", isAllowSubscribe=" + this.isAllowSubscribe + ", deadline=" + this.deadline + ", settlementTime=" + this.settlementTime + ", productExtInfoList=" + this.productExtInfoList + ", subscribeCallDataExtInfo=" + this.subscribeCallDataExtInfo + ", pointsList=" + this.pointsList + ", collateral=" + this.collateral + ", healthFactorInfo=" + this.healthFactorInfo + ", borrowFee=" + this.borrowFee + ", boostParameters=" + this.boostParameters + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.totalGainsCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.fixedApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestTokenWithAmount> values() {
        return this.investWithTokenList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zLjUOn() {
        return this.isAllowSubscribe;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestDetailsAndGasFee> serializer() {
            return InvestDetailsAndGasFee$$serializer.INSTANCE;
        }
    }

    static {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, new ArrayListSerializer(ExpectTokenInfo$$serializer.INSTANCE), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, new ArrayListSerializer(TransactionStep$$serializer.INSTANCE), null, null, null, new ArrayListSerializer(InvestTipInfoVo$$serializer.INSTANCE), null, new ArrayListSerializer(PointInfo$$serializer.INSTANCE), null, null, null, null};
    }

    public /* synthetic */ InvestDetailsAndGasFee(int i, InvestGasPriceConfig investGasPriceConfig, List list, List list2, String str, InvestTokenWithAmount investTokenWithAmount, List list3, String str2, String str3, List list4, List list5, String str4, PromptInformation promptInformation, InvestTransactionLossInfo investTransactionLossInfo, String str5, String str6, CollateralRatioInfo collateralRatioInfo, List list6, boolean z, String str7, String str8, List list7, String str9, List list8, String str10, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, BoostParameters boostParameters, SerializationConstructorMarker serializationConstructorMarker) {
        this.gasPriceConfig = (i & 1) == 0 ? new InvestGasPriceConfig((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null) : investGasPriceConfig;
        this.investWithTokenList = (i & 2) == 0 ? yDY.AhwBna() : list;
        this.gainsTokenList = (i & 4) == 0 ? yDY.AhwBna() : list2;
        if ((i & 8) == 0) {
            this.totalGainsCurrencyAmount = "";
        } else {
            this.totalGainsCurrencyAmount = str;
        }
        if ((i & 16) == 0) {
            this.receiveTokenInfo = null;
        } else {
            this.receiveTokenInfo = investTokenWithAmount;
        }
        this.swapToTokenList = (i & 32) == 0 ? yDY.AhwBna() : list3;
        if ((i & 64) == 0) {
            this.valueDeviationPercentage = "";
        } else {
            this.valueDeviationPercentage = str2;
        }
        if ((i & 128) == 0) {
            this.estimateGasFee = "";
        } else {
            this.estimateGasFee = str3;
        }
        this.tokenInfoList = (i & 256) == 0 ? yDY.AhwBna() : list4;
        this.safeMoonTokenList = (i & 512) == 0 ? yDY.AhwBna() : list5;
        if ((i & 1024) == 0) {
            this.exchangeRate = "";
        } else {
            this.exchangeRate = str4;
        }
        this.promptInformation = (i & 2048) == 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
        this.transactionLossInfo = (i & 4096) == 0 ? new InvestTransactionLossInfo((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : investTransactionLossInfo;
        if ((i & 8192) == 0) {
            this.fixedApy = "";
        } else {
            this.fixedApy = str5;
        }
        if ((i & 16384) == 0) {
            this.maturityTime = "";
        } else {
            this.maturityTime = str6;
        }
        this.collateralRatioInfo = (32768 & i) == 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo;
        this.transactionStepList = (65536 & i) == 0 ? yDY.AhwBna() : list6;
        this.isAllowSubscribe = (131072 & i) == 0 ? true : z;
        if ((262144 & i) == 0) {
            this.deadline = "";
        } else {
            this.deadline = str7;
        }
        if ((524288 & i) == 0) {
            this.settlementTime = "";
        } else {
            this.settlementTime = str8;
        }
        if ((1048576 & i) == 0) {
            this.productExtInfoList = null;
        } else {
            this.productExtInfoList = list7;
        }
        if ((2097152 & i) == 0) {
            this.subscribeCallDataExtInfo = null;
        } else {
            this.subscribeCallDataExtInfo = str9;
        }
        this.pointsList = (4194304 & i) == 0 ? yDY.AhwBna() : list8;
        if ((8388608 & i) == 0) {
            this.collateral = null;
        } else {
            this.collateral = str10;
        }
        if ((16777216 & i) == 0) {
            this.healthFactorInfo = null;
        } else {
            this.healthFactorInfo = heathFactorInfo;
        }
        if ((33554432 & i) == 0) {
            this.borrowFee = null;
        } else {
            this.borrowFee = investTokenWithAmount2;
        }
        if ((i & 67108864) == 0) {
            this.boostParameters = null;
        } else {
            this.boostParameters = boostParameters;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [16=12] */
    public static final /* synthetic */ void AEQbTJ(InvestDetailsAndGasFee investDetailsAndGasFee, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(investDetailsAndGasFee.gasPriceConfig, new InvestGasPriceConfig((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, InvestGasPriceConfig$$serializer.INSTANCE, investDetailsAndGasFee.gasPriceConfig);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(investDetailsAndGasFee.investWithTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investDetailsAndGasFee.investWithTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(investDetailsAndGasFee.gainsTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investDetailsAndGasFee.gainsTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.totalGainsCurrencyAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investDetailsAndGasFee.totalGainsCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investDetailsAndGasFee.receiveTokenInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, InvestTokenWithAmount$$serializer.INSTANCE, investDetailsAndGasFee.receiveTokenInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(investDetailsAndGasFee.swapToTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], investDetailsAndGasFee.swapToTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.valueDeviationPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investDetailsAndGasFee.valueDeviationPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.estimateGasFee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investDetailsAndGasFee.estimateGasFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd(investDetailsAndGasFee.tokenInfoList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], investDetailsAndGasFee.tokenInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd(investDetailsAndGasFee.safeMoonTokenList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], investDetailsAndGasFee.safeMoonTokenList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.exchangeRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investDetailsAndGasFee.exchangeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(investDetailsAndGasFee.promptInformation, new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, PromptInformation$$serializer.INSTANCE, investDetailsAndGasFee.promptInformation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(investDetailsAndGasFee.transactionLossInfo, new InvestTransactionLossInfo((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 12, InvestTransactionLossInfo$$serializer.INSTANCE, investDetailsAndGasFee.transactionLossInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.fixedApy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, investDetailsAndGasFee.fixedApy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.maturityTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, investDetailsAndGasFee.maturityTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd(investDetailsAndGasFee.collateralRatioInfo, new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null))) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 15, CollateralRatioInfo$$serializer.INSTANCE, investDetailsAndGasFee.collateralRatioInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(investDetailsAndGasFee.transactionStepList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], investDetailsAndGasFee.transactionStepList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !investDetailsAndGasFee.isAllowSubscribe) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 17, investDetailsAndGasFee.isAllowSubscribe);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.deadline, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, investDetailsAndGasFee.deadline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) investDetailsAndGasFee.settlementTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, investDetailsAndGasFee.settlementTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || investDetailsAndGasFee.productExtInfoList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, kSerializerArr[20], investDetailsAndGasFee.productExtInfoList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investDetailsAndGasFee.subscribeCallDataExtInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, investDetailsAndGasFee.subscribeCallDataExtInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd(investDetailsAndGasFee.pointsList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], investDetailsAndGasFee.pointsList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || investDetailsAndGasFee.collateral != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, investDetailsAndGasFee.collateral);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investDetailsAndGasFee.healthFactorInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, HeathFactorInfo$$serializer.INSTANCE, investDetailsAndGasFee.healthFactorInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || investDetailsAndGasFee.borrowFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, InvestTokenWithAmount$$serializer.INSTANCE, investDetailsAndGasFee.borrowFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) && investDetailsAndGasFee.boostParameters == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, BoostParameters$$serializer.INSTANCE, investDetailsAndGasFee.boostParameters);
    }

    public InvestDetailsAndGasFee(@NotNull InvestGasPriceConfig investGasPriceConfig, @NotNull List<InvestTokenWithAmount> list, @NotNull List<InvestTokenWithAmount> list2, String str, InvestTokenWithAmount investTokenWithAmount, @NotNull List<InvestTokenWithAmount> list3, @NotNull String str2, @NotNull String str3, @NotNull List<ExpectTokenInfo> list4, @NotNull List<InvestTokenWithAmount> list5, @NotNull String str4, @NotNull PromptInformation promptInformation, @NotNull InvestTransactionLossInfo investTransactionLossInfo, @NotNull String str5, @NotNull String str6, @NotNull CollateralRatioInfo collateralRatioInfo, @NotNull List<TransactionStep> list6, boolean z, @NotNull String str7, @NotNull String str8, List<InvestTipInfoVo> list7, String str9, @NotNull List<PointInfo> list8, String str10, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, BoostParameters boostParameters) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list5, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(promptInformation, "");
        Intrinsics.checkNotNullParameter(investTransactionLossInfo, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
        Intrinsics.checkNotNullParameter(list6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(list8, "");
        this.gasPriceConfig = investGasPriceConfig;
        this.investWithTokenList = list;
        this.gainsTokenList = list2;
        this.totalGainsCurrencyAmount = str;
        this.receiveTokenInfo = investTokenWithAmount;
        this.swapToTokenList = list3;
        this.valueDeviationPercentage = str2;
        this.estimateGasFee = str3;
        this.tokenInfoList = list4;
        this.safeMoonTokenList = list5;
        this.exchangeRate = str4;
        this.promptInformation = promptInformation;
        this.transactionLossInfo = investTransactionLossInfo;
        this.fixedApy = str5;
        this.maturityTime = str6;
        this.collateralRatioInfo = collateralRatioInfo;
        this.transactionStepList = list6;
        this.isAllowSubscribe = z;
        this.deadline = str7;
        this.settlementTime = str8;
        this.productExtInfoList = list7;
        this.subscribeCallDataExtInfo = str9;
        this.pointsList = list8;
        this.collateral = str10;
        this.healthFactorInfo = heathFactorInfo;
        this.borrowFee = investTokenWithAmount2;
        this.boostParameters = boostParameters;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01ba: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig:?: TERNARY null = ((wrap:int:0x0002: ARITH (r56v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestSlippageConfig:?: CAST (com.okinc.business.invest_biz.data.bean.InvestSlippageConfig) (null com.okinc.business.invest_biz.data.bean.InvestSlippageConfig))
  (wrap:com.okinc.business.invest_biz.data.bean.NetworkFee:?: CAST (com.okinc.business.invest_biz.data.bean.NetworkFee) (null com.okinc.business.invest_biz.data.bean.NetworkFee))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.SwapSlippageConfig:?: CAST (com.okinc.business.invest_biz.data.bean.SwapSlippageConfig) (null com.okinc.business.invest_biz.data.bean.SwapSlippageConfig))
  (15 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestSlippageConfig, com.okinc.business.invest_biz.data.bean.NetworkFee, java.lang.String, com.okinc.business.invest_biz.data.bean.SwapSlippageConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:19) call: com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig.<init>(com.okinc.business.invest_biz.data.bean.InvestSlippageConfig, com.okinc.business.invest_biz.data.bean.NetworkFee, java.lang.String, com.okinc.business.invest_biz.data.bean.SwapSlippageConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r29v0 com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r56v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r30v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0021: ARITH (r56v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r31v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r56v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x0036: ARITH (r56v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r33v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003e: ARITH (r56v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:29)) : (r34v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r56v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r56v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0059: ARITH (r56v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:35)) : (r37v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0064: ARITH (r56v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0068: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:37)) : (r38v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006f: ARITH (r56v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x0077: ARITH (r56v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0096: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTipInfoVo:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTipInfoVo) (null com.okinc.business.invest_biz.data.bean.InvestTipInfoVo))
  (1023 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:41) call: com.okinc.business.invest_biz.data.bean.PromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r40v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo:?: TERNARY null = ((wrap:int:0x009c: ARITH (r56v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c0: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:43) call: com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r41v0 com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c6: ARITH (r56v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d0: ARITH (r56v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x00dc: ARITH (r56v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0100: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:49) call: com.okinc.business.invest_biz.data.bean.CollateralRatioInfo.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r44v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0108: ARITH (r56v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x010c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:51)) : (r45v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0115: ARITH (r56v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? true : (r46v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0120: ARITH (r56v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012b: ARITH (r56v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0136: ARITH (r56v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r49v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0141: ARITH (r56v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r50v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x014c: ARITH (r56v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0150: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:63)) : (r51v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0159: ARITH (r56v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.HeathFactorInfo:?: TERNARY null = ((wrap:int:0x0164: ARITH (r56v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.HeathFactorInfo) : (r53v0 com.okinc.business.invest_biz.data.bean.HeathFactorInfo))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x016f: ARITH (r56v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r54v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.data.bean.BoostParameters:?: TERNARY null = ((wrap:int:0x017a: ARITH (r56v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.BoostParameters) : (r55v0 com.okinc.business.invest_biz.data.bean.BoostParameters))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.ExpectTokenInfo>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.util.List<com.okinc.business.invest_biz.data.bean.response.TransactionStep>, boolean, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestTipInfoVo>, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.PointInfo>, java.lang.String, com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.BoostParameters):void (m)] (LINE:17) call: com.okinc.business.invest_biz.data.models.InvestDetailsAndGasFee.<init>(com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig, java.util.List, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.util.List, boolean, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String, com.okinc.business.invest_biz.data.bean.HeathFactorInfo, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.BoostParameters):void type: THIS */
    public /* synthetic */ InvestDetailsAndGasFee(InvestGasPriceConfig investGasPriceConfig, List list, List list2, String str, InvestTokenWithAmount investTokenWithAmount, List list3, String str2, String str3, List list4, List list5, String str4, PromptInformation promptInformation, InvestTransactionLossInfo investTransactionLossInfo, String str5, String str6, CollateralRatioInfo collateralRatioInfo, List list6, boolean z, String str7, String str8, List list7, String str9, List list8, String str10, HeathFactorInfo heathFactorInfo, InvestTokenWithAmount investTokenWithAmount2, BoostParameters boostParameters, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new InvestGasPriceConfig((InvestSlippageConfig) null, (NetworkFee) null, (String) null, (SwapSlippageConfig) null, 15, (DefaultConstructorMarker) null) : investGasPriceConfig, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : investTokenWithAmount, (i & 32) != 0 ? yDY.AhwBna() : list3, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? yDY.AhwBna() : list4, (i & 512) != 0 ? yDY.AhwBna() : list5, (i & 1024) != 0 ? "" : str4, (i & 2048) != 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation, (i & 4096) != 0 ? new InvestTransactionLossInfo((String) null, 0, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null) : investTransactionLossInfo, (i & 8192) != 0 ? "" : str5, (i & 16384) != 0 ? "" : str6, (i & 32768) != 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo, (i & 65536) != 0 ? yDY.AhwBna() : list6, (i & 131072) != 0 ? true : z, (i & 262144) != 0 ? "" : str7, (i & 524288) != 0 ? "" : str8, (i & 1048576) != 0 ? null : list7, (i & 2097152) != 0 ? null : str9, (i & 4194304) != 0 ? yDY.AhwBna() : list8, (i & 8388608) != 0 ? null : str10, (i & 16777216) != 0 ? null : heathFactorInfo, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : investTokenWithAmount2, (i & 67108864) != 0 ? null : boostParameters);
    }
}
