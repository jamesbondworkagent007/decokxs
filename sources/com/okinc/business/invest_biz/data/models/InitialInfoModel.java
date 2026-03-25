package com.okinc.business.invest_biz.data.models;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestOrder$$serializer;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems;
import com.okinc.business.invest_biz.data.bean.InvestValidatorListItems$$serializer;
import com.okinc.business.invest_biz.data.bean.PointInfo;
import com.okinc.business.invest_biz.data.bean.PointInfo$$serializer;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.PromptInformation$$serializer;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public interface InitialInfoModel {

    @Serializable
    public static final class InvestInitialInfo implements InitialInfoModel {
        public static final KSerializer<Object>[] $childSerializers;
        public final long analysisPlatformId;
        public final BTCMode btcMode;
        public final long chainId;
        public final CollateralRatioInfo collateralRatioInfo;
        public final List<InvestTokenWithAmount> gainsTokenList;
        public final int inputPrecision;
        public final InvestType investType;
        public final List<InvestTokenWithAmount> investWithTokenList;
        public final long investmentId;
        public final String investmentName;
        public final boolean isLp;
        public final boolean isSingleValidator;
        public final boolean isSupportSwap;
        public final String lockRedeemTip;
        public final int mode;
        public final String network;
        public final String networkLogo;
        public final String platformLogo;
        public final String platformName;
        public final List<PointInfo> pointsList;
        public final PromptInformation promptInformation;
        public final String rateDesc;
        public final InvestTokenWithAmount receiveTokenInfo;
        public final String reserveFee;
        public final InvestValidatorListItems selectedValidator;
        public final long sourceInvestmentId;
        public final TransactionMethod subscriptionMethod;
        public final List<InvestTokenWithAmount> swapToTokenList;
        public final String tvl;
        public final List<InvestValidatorListItems> validatorList;
        public final String validatorName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InvestInitialInfo() {
            this(0L, (InvestType) null, 0L, (String) null, 0L, false, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (InvestTokenWithAmount) null, (String) null, 0L, (List) null, (TransactionMethod) null, false, (String) null, (PromptInformation) null, 0, false, (String) null, 0, (CollateralRatioInfo) null, (BTCMode) null, (List) null, (InvestValidatorListItems) null, (List) null, (String) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.analysisPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestInitialInfo AEQbTJ(long j, @NotNull InvestType investType, long j2, @NotNull String str, long j3, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull List<InvestTokenWithAmount> list, @NotNull List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount, @NotNull String str7, long j4, @NotNull List<InvestTokenWithAmount> list3, @NotNull TransactionMethod transactionMethod, boolean z2, @NotNull String str8, @NotNull PromptInformation promptInformation, int i, boolean z3, @NotNull String str9, int i2, @NotNull CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, @NotNull List<InvestValidatorListItems> list4, InvestValidatorListItems investValidatorListItems, @NotNull List<PointInfo> list5, @NotNull String str10) {
            Intrinsics.checkNotNullParameter(investType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(transactionMethod, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(promptInformation, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(list5, "");
            Intrinsics.checkNotNullParameter(str10, "");
            return new InvestInitialInfo(j, investType, j2, str, j3, z, str2, str3, str4, str5, str6, list, list2, investTokenWithAmount, str7, j4, list3, transactionMethod, z2, str8, promptInformation, i, z3, str9, i2, collateralRatioInfo, bTCMode, list4, investValidatorListItems, list5, str10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestTokenWithAmount> AYXKKw() {
            return this.investWithTokenList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestType AhwBna() {
            return this.investType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AkhnZx() {
            return this.networkLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<PointInfo> AuCTel() {
            return this.pointsList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AuCTelauCTel() {
            return this.isLp;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AubY() {
            return this.validatorName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AwvSrB() {
            return this.isSupportSwap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String DbNXlk() {
            return this.investmentName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long KWHzl() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BTCMode OLrzqt() {
            return this.btcMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CollateralRatioInfo copydefault() {
            return this.collateralRatioInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.inputPrecision;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String ejfBZ() {
            return this.reserveFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InvestInitialInfo)) {
                return false;
            }
            InvestInitialInfo investInitialInfo = (InvestInitialInfo) obj;
            return this.chainId == investInitialInfo.chainId && this.investType == investInitialInfo.investType && this.investmentId == investInitialInfo.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) investInitialInfo.investmentName) && this.analysisPlatformId == investInitialInfo.analysisPlatformId && this.isSupportSwap == investInitialInfo.isSupportSwap && Intrinsics.EZpvd((Object) this.network, (Object) investInitialInfo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) investInitialInfo.networkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) investInitialInfo.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) investInitialInfo.platformName) && Intrinsics.EZpvd((Object) this.rateDesc, (Object) investInitialInfo.rateDesc) && Intrinsics.EZpvd(this.gainsTokenList, investInitialInfo.gainsTokenList) && Intrinsics.EZpvd(this.investWithTokenList, investInitialInfo.investWithTokenList) && Intrinsics.EZpvd(this.receiveTokenInfo, investInitialInfo.receiveTokenInfo) && Intrinsics.EZpvd((Object) this.reserveFee, (Object) investInitialInfo.reserveFee) && this.sourceInvestmentId == investInitialInfo.sourceInvestmentId && Intrinsics.EZpvd(this.swapToTokenList, investInitialInfo.swapToTokenList) && this.subscriptionMethod == investInitialInfo.subscriptionMethod && this.isLp == investInitialInfo.isLp && Intrinsics.EZpvd((Object) this.lockRedeemTip, (Object) investInitialInfo.lockRedeemTip) && Intrinsics.EZpvd(this.promptInformation, investInitialInfo.promptInformation) && this.inputPrecision == investInitialInfo.inputPrecision && this.isSingleValidator == investInitialInfo.isSingleValidator && Intrinsics.EZpvd((Object) this.validatorName, (Object) investInitialInfo.validatorName) && this.mode == investInitialInfo.mode && Intrinsics.EZpvd(this.collateralRatioInfo, investInitialInfo.collateralRatioInfo) && this.btcMode == investInitialInfo.btcMode && Intrinsics.EZpvd(this.validatorList, investInitialInfo.validatorList) && Intrinsics.EZpvd(this.selectedValidator, investInitialInfo.selectedValidator) && Intrinsics.EZpvd(this.pointsList, investInitialInfo.pointsList) && Intrinsics.EZpvd((Object) this.tvl, (Object) investInitialInfo.tvl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount fARcdN() {
            return this.receiveTokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String fIwbmz() {
            return this.rateDesc;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PromptInformation fJNWhG() {
            return this.promptInformation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String fetchVPNInfo() {
            return this.platformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long gEmmrt() {
            return this.investmentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestValidatorListItems getFieldNames() {
            return this.selectedValidator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getNewProxyInstance() {
            return this.sourceInvestmentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String hDKMBd() {
            return this.tvl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.chainId);
            int iHashCode2 = this.investType.hashCode();
            int iHashCode3 = Long.hashCode(this.investmentId);
            int iHashCode4 = this.investmentName.hashCode();
            int iHashCode5 = Long.hashCode(this.analysisPlatformId);
            int iHashCode6 = Boolean.hashCode(this.isSupportSwap);
            int iHashCode7 = this.network.hashCode();
            int iHashCode8 = this.networkLogo.hashCode();
            int iHashCode9 = this.platformLogo.hashCode();
            int iHashCode10 = this.platformName.hashCode();
            String str = this.rateDesc;
            int iHashCode11 = str == null ? 0 : str.hashCode();
            int iHashCode12 = this.gainsTokenList.hashCode();
            int iHashCode13 = this.investWithTokenList.hashCode();
            InvestTokenWithAmount investTokenWithAmount = this.receiveTokenInfo;
            int iHashCode14 = investTokenWithAmount == null ? 0 : investTokenWithAmount.hashCode();
            int iHashCode15 = this.reserveFee.hashCode();
            int i = iHashCode14;
            int iHashCode16 = Long.hashCode(this.sourceInvestmentId);
            int iHashCode17 = this.swapToTokenList.hashCode();
            int iHashCode18 = this.subscriptionMethod.hashCode();
            int iHashCode19 = Boolean.hashCode(this.isLp);
            int iHashCode20 = this.lockRedeemTip.hashCode();
            int iHashCode21 = this.promptInformation.hashCode();
            int iHashCode22 = Integer.hashCode(this.inputPrecision);
            int iHashCode23 = Boolean.hashCode(this.isSingleValidator);
            int iHashCode24 = this.validatorName.hashCode();
            int iHashCode25 = Integer.hashCode(this.mode);
            int iHashCode26 = this.collateralRatioInfo.hashCode();
            BTCMode bTCMode = this.btcMode;
            int iHashCode27 = bTCMode == null ? 0 : bTCMode.hashCode();
            int iHashCode28 = this.validatorList.hashCode();
            InvestValidatorListItems investValidatorListItems = this.selectedValidator;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + i) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (investValidatorListItems == null ? 0 : investValidatorListItems.hashCode())) * 31) + this.pointsList.hashCode()) * 31) + this.tvl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String isConnected() {
            return this.network;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionMethod iwGUEr() {
            return this.subscriptionMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "InvestInitialInfo(chainId=" + this.chainId + ", investType=" + this.investType + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", analysisPlatformId=" + this.analysisPlatformId + ", isSupportSwap=" + this.isSupportSwap + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", rateDesc=" + this.rateDesc + ", gainsTokenList=" + this.gainsTokenList + ", investWithTokenList=" + this.investWithTokenList + ", receiveTokenInfo=" + this.receiveTokenInfo + ", reserveFee=" + this.reserveFee + ", sourceInvestmentId=" + this.sourceInvestmentId + ", swapToTokenList=" + this.swapToTokenList + ", subscriptionMethod=" + this.subscriptionMethod + ", isLp=" + this.isLp + ", lockRedeemTip=" + this.lockRedeemTip + ", promptInformation=" + this.promptInformation + ", inputPrecision=" + this.inputPrecision + ", isSingleValidator=" + this.isSingleValidator + ", validatorName=" + this.validatorName + ", mode=" + this.mode + ", collateralRatioInfo=" + this.collateralRatioInfo + ", btcMode=" + this.btcMode + ", validatorList=" + this.validatorList + ", selectedValidator=" + this.selectedValidator + ", pointsList=" + this.pointsList + ", tvl=" + this.tvl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestTokenWithAmount> uzCIH() {
            return this.swapToTokenList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestTokenWithAmount> valueOf() {
            return this.gainsTokenList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String values() {
            return this.platformLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestValidatorListItems> zLjUOn() {
            return this.validatorList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean zuBGHE() {
            return this.isSingleValidator;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.InitialInfoModel.InvestInitialInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<InvestInitialInfo> serializer() {
                return InitialInfoModel$InvestInitialInfo$$serializer.INSTANCE;
            }
        }

        static {
            InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
            $childSerializers = new KSerializer[]{null, InvestType.Companion.serializer(), null, null, null, null, null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), TransactionMethod.Companion.serializer(), null, null, null, null, null, null, null, null, BTCMode.Companion.serializer(), new ArrayListSerializer(InvestValidatorListItems$$serializer.INSTANCE), null, new ArrayListSerializer(PointInfo$$serializer.INSTANCE), null};
        }

        public /* synthetic */ InvestInitialInfo(int i, long j, InvestType investType, long j2, String str, long j3, boolean z, String str2, String str3, String str4, String str5, String str6, List list, List list2, InvestTokenWithAmount investTokenWithAmount, String str7, long j4, List list3, TransactionMethod transactionMethod, boolean z2, String str8, PromptInformation promptInformation, int i2, boolean z3, String str9, int i3, CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, List list4, InvestValidatorListItems investValidatorListItems, List list5, String str10, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.chainId = 0L;
            } else {
                this.chainId = j;
            }
            this.investType = (i & 2) == 0 ? InvestType.Save : investType;
            if ((i & 4) == 0) {
                this.investmentId = 0L;
            } else {
                this.investmentId = j2;
            }
            if ((i & 8) == 0) {
                this.investmentName = "";
            } else {
                this.investmentName = str;
            }
            if ((i & 16) == 0) {
                this.analysisPlatformId = 0L;
            } else {
                this.analysisPlatformId = j3;
            }
            if ((i & 32) == 0) {
                this.isSupportSwap = false;
            } else {
                this.isSupportSwap = z;
            }
            if ((i & 64) == 0) {
                this.network = "";
            } else {
                this.network = str2;
            }
            if ((i & 128) == 0) {
                this.networkLogo = "";
            } else {
                this.networkLogo = str3;
            }
            if ((i & 256) == 0) {
                this.platformLogo = "";
            } else {
                this.platformLogo = str4;
            }
            if ((i & 512) == 0) {
                this.platformName = "";
            } else {
                this.platformName = str5;
            }
            if ((i & 1024) == 0) {
                this.rateDesc = "";
            } else {
                this.rateDesc = str6;
            }
            this.gainsTokenList = (i & 2048) == 0 ? yDY.AhwBna() : list;
            this.investWithTokenList = (i & 4096) == 0 ? yDY.AhwBna() : list2;
            if ((i & 8192) == 0) {
                this.receiveTokenInfo = null;
            } else {
                this.receiveTokenInfo = investTokenWithAmount;
            }
            if ((i & 16384) == 0) {
                this.reserveFee = "";
            } else {
                this.reserveFee = str7;
            }
            if ((32768 & i) == 0) {
                this.sourceInvestmentId = 0L;
            } else {
                this.sourceInvestmentId = j4;
            }
            this.swapToTokenList = (65536 & i) == 0 ? yDY.AhwBna() : list3;
            this.subscriptionMethod = (131072 & i) == 0 ? TransactionMethod.SINGLE : transactionMethod;
            if ((262144 & i) == 0) {
                this.isLp = false;
            } else {
                this.isLp = z2;
            }
            if ((524288 & i) == 0) {
                this.lockRedeemTip = "";
            } else {
                this.lockRedeemTip = str8;
            }
            this.promptInformation = (1048576 & i) == 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
            if ((2097152 & i) == 0) {
                this.inputPrecision = -1;
            } else {
                this.inputPrecision = i2;
            }
            if ((4194304 & i) == 0) {
                this.isSingleValidator = false;
            } else {
                this.isSingleValidator = z3;
            }
            if ((8388608 & i) == 0) {
                this.validatorName = "";
            } else {
                this.validatorName = str9;
            }
            if ((16777216 & i) == 0) {
                this.mode = -1;
            } else {
                this.mode = i3;
            }
            this.collateralRatioInfo = (33554432 & i) == 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo;
            this.btcMode = (67108864 & i) == 0 ? BTCMode.DEFAULT : bTCMode;
            this.validatorList = (134217728 & i) == 0 ? yDY.AhwBna() : list4;
            if ((268435456 & i) == 0) {
                this.selectedValidator = null;
            } else {
                this.selectedValidator = investValidatorListItems;
            }
            this.pointsList = (536870912 & i) == 0 ? yDY.AhwBna() : list5;
            if ((i & 1073741824) == 0) {
                this.tvl = "";
            } else {
                this.tvl = str10;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [21=11] */
        public static final /* synthetic */ void AEQbTJ(InvestInitialInfo investInitialInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investInitialInfo.chainId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 0, investInitialInfo.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investInitialInfo.investType != InvestType.Save) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], investInitialInfo.investType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investInitialInfo.investmentId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 2, investInitialInfo.investmentId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investInitialInfo.investmentName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, investInitialInfo.investmentName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investInitialInfo.analysisPlatformId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 4, investInitialInfo.analysisPlatformId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investInitialInfo.isSupportSwap) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 5, investInitialInfo.isSupportSwap);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investInitialInfo.network, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 6, investInitialInfo.network);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investInitialInfo.networkLogo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 7, investInitialInfo.networkLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investInitialInfo.platformLogo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 8, investInitialInfo.platformLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investInitialInfo.platformName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 9, investInitialInfo.platformName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investInitialInfo.rateDesc, (Object) "")) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, investInitialInfo.rateDesc);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(investInitialInfo.gainsTokenList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], investInitialInfo.gainsTokenList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(investInitialInfo.investWithTokenList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], investInitialInfo.investWithTokenList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || investInitialInfo.receiveTokenInfo != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, InvestTokenWithAmount$$serializer.INSTANCE, investInitialInfo.receiveTokenInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) investInitialInfo.reserveFee, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 14, investInitialInfo.reserveFee);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || investInitialInfo.sourceInvestmentId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 15, investInitialInfo.sourceInvestmentId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd(investInitialInfo.swapToTokenList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], investInitialInfo.swapToTokenList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || investInitialInfo.subscriptionMethod != TransactionMethod.SINGLE) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 17, kSerializerArr[17], investInitialInfo.subscriptionMethod);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || investInitialInfo.isLp) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 18, investInitialInfo.isLp);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) investInitialInfo.lockRedeemTip, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 19, investInitialInfo.lockRedeemTip);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd(investInitialInfo.promptInformation, new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null))) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 20, PromptInformation$$serializer.INSTANCE, investInitialInfo.promptInformation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || investInitialInfo.inputPrecision != -1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 21, investInitialInfo.inputPrecision);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || investInitialInfo.isSingleValidator) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 22, investInitialInfo.isSingleValidator);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) investInitialInfo.validatorName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 23, investInitialInfo.validatorName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || investInitialInfo.mode != -1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 24, investInitialInfo.mode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd(investInitialInfo.collateralRatioInfo, new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null))) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 25, CollateralRatioInfo$$serializer.INSTANCE, investInitialInfo.collateralRatioInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || investInitialInfo.btcMode != BTCMode.DEFAULT) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, kSerializerArr[26], investInitialInfo.btcMode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd(investInitialInfo.validatorList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 27, kSerializerArr[27], investInitialInfo.validatorList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || investInitialInfo.selectedValidator != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, InvestValidatorListItems$$serializer.INSTANCE, investInitialInfo.selectedValidator);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd(investInitialInfo.pointsList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 29, kSerializerArr[29], investInitialInfo.pointsList);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) && Intrinsics.EZpvd((Object) investInitialInfo.tvl, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 30, investInitialInfo.tvl);
        }

        public InvestInitialInfo(long j, @NotNull InvestType investType, long j2, @NotNull String str, long j3, boolean z, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull List<InvestTokenWithAmount> list, @NotNull List<InvestTokenWithAmount> list2, InvestTokenWithAmount investTokenWithAmount, @NotNull String str7, long j4, @NotNull List<InvestTokenWithAmount> list3, @NotNull TransactionMethod transactionMethod, boolean z2, @NotNull String str8, @NotNull PromptInformation promptInformation, int i, boolean z3, @NotNull String str9, int i2, @NotNull CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, @NotNull List<InvestValidatorListItems> list4, InvestValidatorListItems investValidatorListItems, @NotNull List<PointInfo> list5, @NotNull String str10) {
            Intrinsics.checkNotNullParameter(investType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(transactionMethod, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(promptInformation, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(list5, "");
            Intrinsics.checkNotNullParameter(str10, "");
            this.chainId = j;
            this.investType = investType;
            this.investmentId = j2;
            this.investmentName = str;
            this.analysisPlatformId = j3;
            this.isSupportSwap = z;
            this.network = str2;
            this.networkLogo = str3;
            this.platformLogo = str4;
            this.platformName = str5;
            this.rateDesc = str6;
            this.gainsTokenList = list;
            this.investWithTokenList = list2;
            this.receiveTokenInfo = investTokenWithAmount;
            this.reserveFee = str7;
            this.sourceInvestmentId = j4;
            this.swapToTokenList = list3;
            this.subscriptionMethod = transactionMethod;
            this.isLp = z2;
            this.lockRedeemTip = str8;
            this.promptInformation = promptInformation;
            this.inputPrecision = i;
            this.isSingleValidator = z3;
            this.validatorName = str9;
            this.mode = i2;
            this.collateralRatioInfo = collateralRatioInfo;
            this.btcMode = bTCMode;
            this.validatorList = list4;
            this.selectedValidator = investValidatorListItems;
            this.pointsList = list5;
            this.tvl = str10;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01dd: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r74v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r39v0 long))
  (wrap:com.okinc.business.invest_biz.data.models.InvestType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r74v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:26) com.okinc.business.invest_biz.data.models.InvestType.Save com.okinc.business.invest_biz.data.models.InvestType) : (r41v0 com.okinc.business.invest_biz.data.models.InvestType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r74v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r42v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r74v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0027: ARITH (r74v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r45v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0030: ARITH (r74v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r47v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r74v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r74v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r74v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r74v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0058: ARITH (r74v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.util.List:0x006d: TERNARY null = ((wrap:int:0x0062: ARITH (r74v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:46)) : (r53v0 java.util.List))
  (wrap:java.util.List:0x007a: TERNARY null = ((wrap:int:0x006f: ARITH (r74v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0073: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:48)) : (r54v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:0x0087: TERNARY null = ((wrap:int:0x007c: ARITH (r74v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.models.InvestTokenWithAmount) : (r55v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r74v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0095: ARITH (r74v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r57v0 long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x00a0: ARITH (r74v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a4: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:56)) : (r59v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.TransactionMethod:?: TERNARY null = ((wrap:int:0x00ad: ARITH (r74v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b1: SGET  A[WRAPPED] (LINE:58) com.okinc.business.invest_biz.data.bean.TransactionMethod.SINGLE com.okinc.business.invest_biz.data.bean.TransactionMethod) : (r60v0 com.okinc.business.invest_biz.data.bean.TransactionMethod))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00b8: ARITH (r74v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r61v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c3: ARITH (r74v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x00ce: ARITH (r74v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0106: CONSTRUCTOR 
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
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:64) call: com.okinc.business.invest_biz.data.bean.PromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r63v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:int:?: TERNARY null = ((wrap:int:0x010e: ARITH (r74v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r64v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x011b: ARITH (r74v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? false : (r65v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0126: ARITH (r74v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0131: ARITH (r74v0 int) & (16777216 int) A[WRAPPED]) == (0 int)) ? (r67v0 int) : (-1 int))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x013a: ARITH (r74v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015e: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:74) call: com.okinc.business.invest_biz.data.bean.CollateralRatioInfo.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r68v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:com.okinc.business.invest_biz.data.contants.BTCMode:?: TERNARY null = ((wrap:int:0x0166: ARITH (r74v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x016a: SGET  A[WRAPPED] (LINE:76) com.okinc.business.invest_biz.data.contants.BTCMode.DEFAULT com.okinc.business.invest_biz.data.contants.BTCMode) : (r69v0 com.okinc.business.invest_biz.data.contants.BTCMode))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0171: ARITH (r74v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0175: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:78)) : (r70v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestValidatorListItems:?: TERNARY null = ((wrap:int:0x017e: ARITH (r74v0 int) & (268435456 int) A[WRAPPED]) == (0 int)) ? (r71v0 com.okinc.business.invest_biz.data.bean.InvestValidatorListItems) : (null com.okinc.business.invest_biz.data.bean.InvestValidatorListItems))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0187: ARITH (r74v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x018b: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:82)) : (r72v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0194: ARITH (r74v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
 A[MD:(long, com.okinc.business.invest_biz.data.models.InvestType, long, java.lang.String, long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, long, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.TransactionMethod, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, int, boolean, java.lang.String, int, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.contants.BTCMode, java.util.List<com.okinc.business.invest_biz.data.bean.InvestValidatorListItems>, com.okinc.business.invest_biz.data.bean.InvestValidatorListItems, java.util.List<com.okinc.business.invest_biz.data.bean.PointInfo>, java.lang.String):void (m)] (LINE:22) call: com.okinc.business.invest_biz.data.models.InitialInfoModel.InvestInitialInfo.<init>(long, com.okinc.business.invest_biz.data.models.InvestType, long, java.lang.String, long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, long, java.util.List, com.okinc.business.invest_biz.data.bean.TransactionMethod, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, int, boolean, java.lang.String, int, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, com.okinc.business.invest_biz.data.contants.BTCMode, java.util.List, com.okinc.business.invest_biz.data.bean.InvestValidatorListItems, java.util.List, java.lang.String):void type: THIS */
        public /* synthetic */ InvestInitialInfo(long j, InvestType investType, long j2, String str, long j3, boolean z, String str2, String str3, String str4, String str5, String str6, List list, List list2, InvestTokenWithAmount investTokenWithAmount, String str7, long j4, List list3, TransactionMethod transactionMethod, boolean z2, String str8, PromptInformation promptInformation, int i, boolean z3, String str9, int i2, CollateralRatioInfo collateralRatioInfo, BTCMode bTCMode, List list4, InvestValidatorListItems investValidatorListItems, List list5, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? InvestType.Save : investType, (i3 & 4) != 0 ? 0L : j2, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? 0L : j3, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? "" : str2, (i3 & 128) != 0 ? "" : str3, (i3 & 256) != 0 ? "" : str4, (i3 & 512) != 0 ? "" : str5, (i3 & 1024) != 0 ? "" : str6, (i3 & 2048) != 0 ? yDY.AhwBna() : list, (i3 & 4096) != 0 ? yDY.AhwBna() : list2, (i3 & 8192) != 0 ? null : investTokenWithAmount, (i3 & 16384) != 0 ? "" : str7, (i3 & 32768) != 0 ? 0L : j4, (i3 & 65536) != 0 ? yDY.AhwBna() : list3, (i3 & 131072) != 0 ? TransactionMethod.SINGLE : transactionMethod, (i3 & 262144) != 0 ? false : z2, (i3 & 524288) != 0 ? "" : str8, (i3 & 1048576) != 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation, (i3 & 2097152) != 0 ? -1 : i, (i3 & 4194304) != 0 ? false : z3, (i3 & 8388608) != 0 ? "" : str9, (i3 & 16777216) == 0 ? i2 : -1, (i3 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo, (i3 & 67108864) != 0 ? BTCMode.DEFAULT : bTCMode, (i3 & 134217728) != 0 ? yDY.AhwBna() : list4, (i3 & 268435456) == 0 ? investValidatorListItems : null, (i3 & 536870912) != 0 ? yDY.AhwBna() : list5, (i3 & 1073741824) != 0 ? "" : str10);
        }

        public final boolean wlaJM() {
            return this.investType == InvestType.Pool;
        }

        public final boolean zsXlph() {
            return this.investType == InvestType.Pos;
        }
    }

    @Serializable
    public static final class RedeemInitialInfo implements InitialInfoModel {
        public static final KSerializer<Object>[] $childSerializers;
        public final long analysisPlatformId;
        public final BorrowedInfo borrowed;
        public final BTCMode btcMode;
        public final long chainId;
        public final CollateralRatioInfo collateralRatioInfo;
        public final boolean disableInput;
        public final Integer estUnbondTime;
        public final String feeRate;
        public final int inputPrecision;
        public final List<InvestOrder> investOrderList;
        public final InvestType investType;
        public final long investmentId;
        public final String investmentName;
        public final boolean isSingleValidator;
        public final boolean isSupportLock;
        public final boolean isSupportSwap;
        public final String lockRedeemTip;
        public final String lowerPrice;
        public final InvestTokenWithAmount lpTokenInfo;
        public final int mode;
        public final InvestTokenWithAmount mySupply;
        public final String network;
        public final String networkLogo;
        public final String platformLogo;
        public final String platformName;
        public final String positionStatus;
        public final PromptInformation promptInformation;
        public final List<InvestTokenWithAmount> receiveTokenList;
        public final TransactionMethod redeemMethod;
        public final int refreshTime;
        public final InvestTokenWithAmount remainingRepayment;
        public final String reserveFee;
        public final boolean supportZap;
        public final String tokenId;
        public final String tvl;
        public final List<InvestTokenWithAmount> underlyingTokenList;
        public final String upperPrice;
        public final String validatorName;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RedeemInitialInfo() {
            this(0L, (InvestType) null, 0L, (String) null, false, (InvestTokenWithAmount) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TransactionMethod) null, (List) null, (InvestTokenWithAmount) null, 0L, false, (String) null, (PromptInformation) null, 0, false, (String) null, (List) null, 0, false, (InvestTokenWithAmount) null, (CollateralRatioInfo) null, (Integer) null, (BTCMode) null, (BorrowedInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, 0, (String) null, -1, 63, (DefaultConstructorMarker) null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.analysisPlatformId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RedeemInitialInfo AEQbTJ(long j, @NotNull InvestType investType, long j2, @NotNull String str, boolean z, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<InvestTokenWithAmount> list, @NotNull TransactionMethod transactionMethod, @NotNull List<InvestTokenWithAmount> list2, @NotNull InvestTokenWithAmount investTokenWithAmount2, long j3, boolean z2, @NotNull String str6, @NotNull PromptInformation promptInformation, int i, boolean z3, @NotNull String str7, @NotNull List<InvestOrder> list3, int i2, boolean z4, @NotNull InvestTokenWithAmount investTokenWithAmount3, @NotNull CollateralRatioInfo collateralRatioInfo, Integer num, BTCMode bTCMode, BorrowedInfo borrowedInfo, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z5, int i3, @NotNull String str14) {
            Intrinsics.checkNotNullParameter(investType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(transactionMethod, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(promptInformation, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(investTokenWithAmount3, "");
            Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(str14, "");
            return new RedeemInitialInfo(j, investType, j2, str, z, investTokenWithAmount, str2, str3, str4, str5, list, transactionMethod, list2, investTokenWithAmount2, j3, z2, str6, promptInformation, i, z3, str7, list3, i2, z4, investTokenWithAmount3, collateralRatioInfo, num, bTCMode, borrowedInfo, str8, str9, str10, str11, str12, str13, z5, i3, str14);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Integer AYXKKw() {
            return this.estUnbondTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.feeRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount AkhnZx() {
            return this.lpTokenInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AuCTel() {
            return this.platformLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestTokenWithAmount> AuCTelauCTel() {
            return this.underlyingTokenList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount AubY() {
            return this.remainingRepayment;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AxsJAY() {
            return this.isSingleValidator;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String DbNXlk() {
            return this.lowerPrice;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BorrowedInfo EZpvd() {
            return this.borrowed;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final BTCMode OLrzqt() {
            return this.btcMode;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean ORxRYg() {
            return this.isSupportSwap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean QKVWgx() {
            return this.isSupportLock;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long copydefault() {
            return this.chainId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int djBIcL() {
            return this.inputPrecision;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String ejfBZ() {
            return this.platformName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedeemInitialInfo)) {
                return false;
            }
            RedeemInitialInfo redeemInitialInfo = (RedeemInitialInfo) obj;
            return this.chainId == redeemInitialInfo.chainId && this.investType == redeemInitialInfo.investType && this.investmentId == redeemInitialInfo.investmentId && Intrinsics.EZpvd((Object) this.investmentName, (Object) redeemInitialInfo.investmentName) && this.isSupportSwap == redeemInitialInfo.isSupportSwap && Intrinsics.EZpvd(this.mySupply, redeemInitialInfo.mySupply) && Intrinsics.EZpvd((Object) this.network, (Object) redeemInitialInfo.network) && Intrinsics.EZpvd((Object) this.networkLogo, (Object) redeemInitialInfo.networkLogo) && Intrinsics.EZpvd((Object) this.platformLogo, (Object) redeemInitialInfo.platformLogo) && Intrinsics.EZpvd((Object) this.platformName, (Object) redeemInitialInfo.platformName) && Intrinsics.EZpvd(this.receiveTokenList, redeemInitialInfo.receiveTokenList) && this.redeemMethod == redeemInitialInfo.redeemMethod && Intrinsics.EZpvd(this.underlyingTokenList, redeemInitialInfo.underlyingTokenList) && Intrinsics.EZpvd(this.lpTokenInfo, redeemInitialInfo.lpTokenInfo) && this.analysisPlatformId == redeemInitialInfo.analysisPlatformId && this.isSupportLock == redeemInitialInfo.isSupportLock && Intrinsics.EZpvd((Object) this.lockRedeemTip, (Object) redeemInitialInfo.lockRedeemTip) && Intrinsics.EZpvd(this.promptInformation, redeemInitialInfo.promptInformation) && this.inputPrecision == redeemInitialInfo.inputPrecision && this.isSingleValidator == redeemInitialInfo.isSingleValidator && Intrinsics.EZpvd((Object) this.validatorName, (Object) redeemInitialInfo.validatorName) && Intrinsics.EZpvd(this.investOrderList, redeemInitialInfo.investOrderList) && this.mode == redeemInitialInfo.mode && this.disableInput == redeemInitialInfo.disableInput && Intrinsics.EZpvd(this.remainingRepayment, redeemInitialInfo.remainingRepayment) && Intrinsics.EZpvd(this.collateralRatioInfo, redeemInitialInfo.collateralRatioInfo) && Intrinsics.EZpvd(this.estUnbondTime, redeemInitialInfo.estUnbondTime) && this.btcMode == redeemInitialInfo.btcMode && Intrinsics.EZpvd(this.borrowed, redeemInitialInfo.borrowed) && Intrinsics.EZpvd((Object) this.reserveFee, (Object) redeemInitialInfo.reserveFee) && Intrinsics.EZpvd((Object) this.tvl, (Object) redeemInitialInfo.tvl) && Intrinsics.EZpvd((Object) this.feeRate, (Object) redeemInitialInfo.feeRate) && Intrinsics.EZpvd((Object) this.lowerPrice, (Object) redeemInitialInfo.lowerPrice) && Intrinsics.EZpvd((Object) this.positionStatus, (Object) redeemInitialInfo.positionStatus) && Intrinsics.EZpvd((Object) this.upperPrice, (Object) redeemInitialInfo.upperPrice) && this.supportZap == redeemInitialInfo.supportZap && this.refreshTime == redeemInitialInfo.refreshTime && Intrinsics.EZpvd((Object) this.tokenId, (Object) redeemInitialInfo.tokenId);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String fARcdN() {
            return this.network;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTokenWithAmount fIwbmz() {
            return this.mySupply;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String fJNWhG() {
            return this.networkLogo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestType fetchVPNInfo() {
            return this.investType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CollateralRatioInfo gEmmrt() {
            return this.collateralRatioInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String gHZMYf() {
            return this.validatorName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PromptInformation getFieldNames() {
            return this.promptInformation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getNewProxyInstance() {
            return this.refreshTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String hDKMBd() {
            return this.positionStatus;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Long.hashCode(this.chainId);
            int iHashCode2 = this.investType.hashCode();
            int iHashCode3 = Long.hashCode(this.investmentId);
            int iHashCode4 = this.investmentName.hashCode();
            int iHashCode5 = Boolean.hashCode(this.isSupportSwap);
            int iHashCode6 = this.mySupply.hashCode();
            int iHashCode7 = this.network.hashCode();
            int iHashCode8 = this.networkLogo.hashCode();
            int iHashCode9 = this.platformLogo.hashCode();
            int iHashCode10 = this.platformName.hashCode();
            int iHashCode11 = this.receiveTokenList.hashCode();
            int iHashCode12 = this.redeemMethod.hashCode();
            int iHashCode13 = this.underlyingTokenList.hashCode();
            int iHashCode14 = this.lpTokenInfo.hashCode();
            int iHashCode15 = Long.hashCode(this.analysisPlatformId);
            int iHashCode16 = Boolean.hashCode(this.isSupportLock);
            int iHashCode17 = this.lockRedeemTip.hashCode();
            int iHashCode18 = this.promptInformation.hashCode();
            int iHashCode19 = Integer.hashCode(this.inputPrecision);
            int iHashCode20 = Boolean.hashCode(this.isSingleValidator);
            int iHashCode21 = this.validatorName.hashCode();
            int iHashCode22 = this.investOrderList.hashCode();
            int iHashCode23 = Integer.hashCode(this.mode);
            int iHashCode24 = Boolean.hashCode(this.disableInput);
            int iHashCode25 = this.remainingRepayment.hashCode();
            int iHashCode26 = this.collateralRatioInfo.hashCode();
            Integer num = this.estUnbondTime;
            int iHashCode27 = num == null ? 0 : num.hashCode();
            BTCMode bTCMode = this.btcMode;
            int iHashCode28 = bTCMode == null ? 0 : bTCMode.hashCode();
            BorrowedInfo borrowedInfo = this.borrowed;
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + (borrowedInfo != null ? borrowedInfo.hashCode() : 0)) * 31) + this.reserveFee.hashCode()) * 31) + this.tvl.hashCode()) * 31) + this.feeRate.hashCode()) * 31) + this.lowerPrice.hashCode()) * 31) + this.positionStatus.hashCode()) * 31) + this.upperPrice.hashCode()) * 31) + Boolean.hashCode(this.supportZap)) * 31) + Integer.hashCode(this.refreshTime)) * 31) + this.tokenId.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String isConnected() {
            return this.investmentName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<InvestTokenWithAmount> iwGUEr() {
            return this.receiveTokenList;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RedeemInitialInfo(chainId=" + this.chainId + ", investType=" + this.investType + ", investmentId=" + this.investmentId + ", investmentName=" + this.investmentName + ", isSupportSwap=" + this.isSupportSwap + ", mySupply=" + this.mySupply + ", network=" + this.network + ", networkLogo=" + this.networkLogo + ", platformLogo=" + this.platformLogo + ", platformName=" + this.platformName + ", receiveTokenList=" + this.receiveTokenList + ", redeemMethod=" + this.redeemMethod + ", underlyingTokenList=" + this.underlyingTokenList + ", lpTokenInfo=" + this.lpTokenInfo + ", analysisPlatformId=" + this.analysisPlatformId + ", isSupportLock=" + this.isSupportLock + ", lockRedeemTip=" + this.lockRedeemTip + ", promptInformation=" + this.promptInformation + ", inputPrecision=" + this.inputPrecision + ", isSingleValidator=" + this.isSingleValidator + ", validatorName=" + this.validatorName + ", investOrderList=" + this.investOrderList + ", mode=" + this.mode + ", disableInput=" + this.disableInput + ", remainingRepayment=" + this.remainingRepayment + ", collateralRatioInfo=" + this.collateralRatioInfo + ", estUnbondTime=" + this.estUnbondTime + ", btcMode=" + this.btcMode + ", borrowed=" + this.borrowed + ", reserveFee=" + this.reserveFee + ", tvl=" + this.tvl + ", feeRate=" + this.feeRate + ", lowerPrice=" + this.lowerPrice + ", positionStatus=" + this.positionStatus + ", upperPrice=" + this.upperPrice + ", supportZap=" + this.supportZap + ", refreshTime=" + this.refreshTime + ", tokenId=" + this.tokenId + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TransactionMethod uzCIH() {
            return this.redeemMethod;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean valueOf() {
            return this.disableInput;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long values() {
            return this.investmentId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String wlaJM() {
            return this.reserveFee;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean zLjUOn() {
            return this.supportZap;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String zsXlph() {
            return this.tvl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String zuBGHE() {
            return this.upperPrice;
        }

        public static final class Companion {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            private Companion() {
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.InitialInfoModel.RedeemInitialInfo.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<RedeemInitialInfo> serializer() {
                return InitialInfoModel$RedeemInitialInfo$$serializer.INSTANCE;
            }
        }

        static {
            InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
            $childSerializers = new KSerializer[]{null, InvestType.Companion.serializer(), null, null, null, null, null, null, null, null, new ArrayListSerializer(investTokenWithAmount$$serializer), TransactionMethod.Companion.serializer(), new ArrayListSerializer(investTokenWithAmount$$serializer), null, null, null, null, null, null, null, null, new ArrayListSerializer(InvestOrder$$serializer.INSTANCE), null, null, null, null, null, BTCMode.Companion.serializer(), null, null, null, null, null, null, null, null, null, null};
        }

        public /* synthetic */ RedeemInitialInfo(int i, int i2, long j, InvestType investType, long j2, String str, boolean z, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, String str4, String str5, List list, TransactionMethod transactionMethod, List list2, InvestTokenWithAmount investTokenWithAmount2, long j3, boolean z2, String str6, PromptInformation promptInformation, int i3, boolean z3, String str7, List list3, int i4, boolean z4, InvestTokenWithAmount investTokenWithAmount3, CollateralRatioInfo collateralRatioInfo, Integer num, BTCMode bTCMode, BorrowedInfo borrowedInfo, String str8, String str9, String str10, String str11, String str12, String str13, boolean z5, int i5, String str14, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.chainId = 0L;
            } else {
                this.chainId = j;
            }
            this.investType = (i & 2) == 0 ? InvestType.Save : investType;
            if ((i & 4) == 0) {
                this.investmentId = 0L;
            } else {
                this.investmentId = j2;
            }
            if ((i & 8) == 0) {
                this.investmentName = "";
            } else {
                this.investmentName = str;
            }
            this.isSupportSwap = (i & 16) == 0 ? true : z;
            this.mySupply = (i & 32) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount;
            if ((i & 64) == 0) {
                this.network = "";
            } else {
                this.network = str2;
            }
            if ((i & 128) == 0) {
                this.networkLogo = "";
            } else {
                this.networkLogo = str3;
            }
            if ((i & 256) == 0) {
                this.platformLogo = "";
            } else {
                this.platformLogo = str4;
            }
            if ((i & 512) == 0) {
                this.platformName = "";
            } else {
                this.platformName = str5;
            }
            this.receiveTokenList = (i & 1024) == 0 ? yDY.AhwBna() : list;
            this.redeemMethod = (i & 2048) == 0 ? TransactionMethod.SINGLE : transactionMethod;
            this.underlyingTokenList = (i & 4096) == 0 ? yDY.AhwBna() : list2;
            this.lpTokenInfo = (i & 8192) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount2;
            if ((i & 16384) == 0) {
                this.analysisPlatformId = 0L;
            } else {
                this.analysisPlatformId = j3;
            }
            if ((32768 & i) == 0) {
                this.isSupportLock = false;
            } else {
                this.isSupportLock = z2;
            }
            if ((65536 & i) == 0) {
                this.lockRedeemTip = "";
            } else {
                this.lockRedeemTip = str6;
            }
            this.promptInformation = (131072 & i) == 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation;
            if ((262144 & i) == 0) {
                this.inputPrecision = 0;
            } else {
                this.inputPrecision = i3;
            }
            if ((524288 & i) == 0) {
                this.isSingleValidator = false;
            } else {
                this.isSingleValidator = z3;
            }
            if ((1048576 & i) == 0) {
                this.validatorName = "";
            } else {
                this.validatorName = str7;
            }
            this.investOrderList = (2097152 & i) == 0 ? yDY.AhwBna() : list3;
            if ((4194304 & i) == 0) {
                this.mode = -1;
            } else {
                this.mode = i4;
            }
            if ((8388608 & i) == 0) {
                this.disableInput = false;
            } else {
                this.disableInput = z4;
            }
            this.remainingRepayment = (16777216 & i) == 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount3;
            this.collateralRatioInfo = (33554432 & i) == 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo;
            if ((67108864 & i) == 0) {
                this.estUnbondTime = null;
            } else {
                this.estUnbondTime = num;
            }
            this.btcMode = (134217728 & i) == 0 ? BTCMode.DEFAULT : bTCMode;
            if ((268435456 & i) == 0) {
                this.borrowed = null;
            } else {
                this.borrowed = borrowedInfo;
            }
            if ((536870912 & i) == 0) {
                this.reserveFee = "";
            } else {
                this.reserveFee = str8;
            }
            if ((1073741824 & i) == 0) {
                this.tvl = "";
            } else {
                this.tvl = str9;
            }
            if ((i & Integer.MIN_VALUE) == 0) {
                this.feeRate = "";
            } else {
                this.feeRate = str10;
            }
            if ((i2 & 1) == 0) {
                this.lowerPrice = "";
            } else {
                this.lowerPrice = str11;
            }
            if ((i2 & 2) == 0) {
                this.positionStatus = "";
            } else {
                this.positionStatus = str12;
            }
            if ((i2 & 4) == 0) {
                this.upperPrice = "";
            } else {
                this.upperPrice = str13;
            }
            if ((i2 & 8) == 0) {
                this.supportZap = false;
            } else {
                this.supportZap = z5;
            }
            if ((i2 & 16) == 0) {
                this.refreshTime = -1;
            } else {
                this.refreshTime = i5;
            }
            if ((i2 & 32) == 0) {
                this.tokenId = "";
            } else {
                this.tokenId = str14;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [102=12] */
        public static final /* synthetic */ void KWHzl(RedeemInitialInfo redeemInitialInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || redeemInitialInfo.chainId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 0, redeemInitialInfo.chainId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || redeemInitialInfo.investType != InvestType.Save) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], redeemInitialInfo.investType);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || redeemInitialInfo.investmentId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 2, redeemInitialInfo.investmentId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) redeemInitialInfo.investmentName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 3, redeemInitialInfo.investmentName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !redeemInitialInfo.isSupportSwap) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 4, redeemInitialInfo.isSupportSwap);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(redeemInitialInfo.mySupply, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 5, InvestTokenWithAmount$$serializer.INSTANCE, redeemInitialInfo.mySupply);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) redeemInitialInfo.network, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 6, redeemInitialInfo.network);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) redeemInitialInfo.networkLogo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 7, redeemInitialInfo.networkLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) redeemInitialInfo.platformLogo, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 8, redeemInitialInfo.platformLogo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) redeemInitialInfo.platformName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 9, redeemInitialInfo.platformName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd(redeemInitialInfo.receiveTokenList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], redeemInitialInfo.receiveTokenList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || redeemInitialInfo.redeemMethod != TransactionMethod.SINGLE) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], redeemInitialInfo.redeemMethod);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd(redeemInitialInfo.underlyingTokenList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], redeemInitialInfo.underlyingTokenList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd(redeemInitialInfo.lpTokenInfo, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 13, InvestTokenWithAmount$$serializer.INSTANCE, redeemInitialInfo.lpTokenInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || redeemInitialInfo.analysisPlatformId != 0) {
                compositeEncoder.encodeLongElement(serialDescriptor, 14, redeemInitialInfo.analysisPlatformId);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || redeemInitialInfo.isSupportLock) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 15, redeemInitialInfo.isSupportLock);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) redeemInitialInfo.lockRedeemTip, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 16, redeemInitialInfo.lockRedeemTip);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd(redeemInitialInfo.promptInformation, new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null))) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 17, PromptInformation$$serializer.INSTANCE, redeemInitialInfo.promptInformation);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || redeemInitialInfo.inputPrecision != 0) {
                compositeEncoder.encodeIntElement(serialDescriptor, 18, redeemInitialInfo.inputPrecision);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || redeemInitialInfo.isSingleValidator) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 19, redeemInitialInfo.isSingleValidator);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) redeemInitialInfo.validatorName, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 20, redeemInitialInfo.validatorName);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd(redeemInitialInfo.investOrderList, yDY.AhwBna())) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 21, kSerializerArr[21], redeemInitialInfo.investOrderList);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || redeemInitialInfo.mode != -1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 22, redeemInitialInfo.mode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || redeemInitialInfo.disableInput) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 23, redeemInitialInfo.disableInput);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd(redeemInitialInfo.remainingRepayment, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null))) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 24, InvestTokenWithAmount$$serializer.INSTANCE, redeemInitialInfo.remainingRepayment);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd(redeemInitialInfo.collateralRatioInfo, new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null))) {
                compositeEncoder.encodeSerializableElement(serialDescriptor, 25, CollateralRatioInfo$$serializer.INSTANCE, redeemInitialInfo.collateralRatioInfo);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || redeemInitialInfo.estUnbondTime != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, IntSerializer.INSTANCE, redeemInitialInfo.estUnbondTime);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || redeemInitialInfo.btcMode != BTCMode.DEFAULT) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, kSerializerArr[27], redeemInitialInfo.btcMode);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || redeemInitialInfo.borrowed != null) {
                compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, BorrowedInfo$$serializer.INSTANCE, redeemInitialInfo.borrowed);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) redeemInitialInfo.reserveFee, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 29, redeemInitialInfo.reserveFee);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) redeemInitialInfo.tvl, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 30, redeemInitialInfo.tvl);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) redeemInitialInfo.feeRate, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 31, redeemInitialInfo.feeRate);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) redeemInitialInfo.lowerPrice, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 32, redeemInitialInfo.lowerPrice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) redeemInitialInfo.positionStatus, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 33, redeemInitialInfo.positionStatus);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) redeemInitialInfo.upperPrice, (Object) "")) {
                compositeEncoder.encodeStringElement(serialDescriptor, 34, redeemInitialInfo.upperPrice);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || redeemInitialInfo.supportZap) {
                compositeEncoder.encodeBooleanElement(serialDescriptor, 35, redeemInitialInfo.supportZap);
            }
            if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || redeemInitialInfo.refreshTime != -1) {
                compositeEncoder.encodeIntElement(serialDescriptor, 36, redeemInitialInfo.refreshTime);
            }
            if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) && Intrinsics.EZpvd((Object) redeemInitialInfo.tokenId, (Object) "")) {
                return;
            }
            compositeEncoder.encodeStringElement(serialDescriptor, 37, redeemInitialInfo.tokenId);
        }

        public RedeemInitialInfo(long j, @NotNull InvestType investType, long j2, @NotNull String str, boolean z, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<InvestTokenWithAmount> list, @NotNull TransactionMethod transactionMethod, @NotNull List<InvestTokenWithAmount> list2, @NotNull InvestTokenWithAmount investTokenWithAmount2, long j3, boolean z2, @NotNull String str6, @NotNull PromptInformation promptInformation, int i, boolean z3, @NotNull String str7, @NotNull List<InvestOrder> list3, int i2, boolean z4, @NotNull InvestTokenWithAmount investTokenWithAmount3, @NotNull CollateralRatioInfo collateralRatioInfo, Integer num, BTCMode bTCMode, BorrowedInfo borrowedInfo, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, boolean z5, int i3, @NotNull String str14) {
            Intrinsics.checkNotNullParameter(investType, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(transactionMethod, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(investTokenWithAmount2, "");
            Intrinsics.checkNotNullParameter(str6, "");
            Intrinsics.checkNotNullParameter(promptInformation, "");
            Intrinsics.checkNotNullParameter(str7, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(investTokenWithAmount3, "");
            Intrinsics.checkNotNullParameter(collateralRatioInfo, "");
            Intrinsics.checkNotNullParameter(str8, "");
            Intrinsics.checkNotNullParameter(str9, "");
            Intrinsics.checkNotNullParameter(str10, "");
            Intrinsics.checkNotNullParameter(str11, "");
            Intrinsics.checkNotNullParameter(str12, "");
            Intrinsics.checkNotNullParameter(str13, "");
            Intrinsics.checkNotNullParameter(str14, "");
            this.chainId = j;
            this.investType = investType;
            this.investmentId = j2;
            this.investmentName = str;
            this.isSupportSwap = z;
            this.mySupply = investTokenWithAmount;
            this.network = str2;
            this.networkLogo = str3;
            this.platformLogo = str4;
            this.platformName = str5;
            this.receiveTokenList = list;
            this.redeemMethod = transactionMethod;
            this.underlyingTokenList = list2;
            this.lpTokenInfo = investTokenWithAmount2;
            this.analysisPlatformId = j3;
            this.isSupportLock = z2;
            this.lockRedeemTip = str6;
            this.promptInformation = promptInformation;
            this.inputPrecision = i;
            this.isSingleValidator = z3;
            this.validatorName = str7;
            this.investOrderList = list3;
            this.mode = i2;
            this.disableInput = z4;
            this.remainingRepayment = investTokenWithAmount3;
            this.collateralRatioInfo = collateralRatioInfo;
            this.estUnbondTime = num;
            this.btcMode = bTCMode;
            this.borrowed = borrowedInfo;
            this.reserveFee = str8;
            this.tvl = str9;
            this.feeRate = str10;
            this.lowerPrice = str11;
            this.positionStatus = str12;
            this.upperPrice = str13;
            this.supportZap = z5;
            this.refreshTime = i3;
            this.tokenId = str14;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x02ea: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r104v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r63v0 long))
  (wrap:com.okinc.business.invest_biz.data.models.InvestType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r104v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000f: SGET  A[WRAPPED] (LINE:107) com.okinc.business.invest_biz.data.models.InvestType.Save com.okinc.business.invest_biz.data.models.InvestType) : (r65v0 com.okinc.business.invest_biz.data.models.InvestType))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0014: ARITH (r104v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r66v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r104v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0027: ARITH (r104v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r69v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x002f: ARITH (r104v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0072: CONSTRUCTOR 
  (0 long)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: CAST (com.okinc.business.invest_biz.data.bean.ButtonType) (null com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTokenType:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTokenType) (null com.okinc.business.invest_biz.data.bean.InvestTokenType))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (268435455 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:115) call: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount.<init>(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r70v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r104v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0080: ARITH (r104v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0088: ARITH (r104v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0090: ARITH (r104v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0098: ARITH (r104v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x009c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:125)) : (r75v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.bean.TransactionMethod:?: TERNARY null = ((wrap:int:0x00a3: ARITH (r104v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00a7: SGET  A[WRAPPED] (LINE:127) com.okinc.business.invest_biz.data.bean.TransactionMethod.SINGLE com.okinc.business.invest_biz.data.bean.TransactionMethod) : (r76v0 com.okinc.business.invest_biz.data.bean.TransactionMethod))
  (wrap:java.util.List:0x00b9: TERNARY null = ((wrap:int:0x00ae: ARITH (r104v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00b2: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:129)) : (r77v0 java.util.List))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:0x0106: TERNARY null = ((wrap:int:0x00bb: ARITH (r104v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0100: CONSTRUCTOR 
  (0 long)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: CAST (com.okinc.business.invest_biz.data.bean.ButtonType) (null com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTokenType:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTokenType) (null com.okinc.business.invest_biz.data.bean.InvestTokenType))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (268435455 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:131) call: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount.<init>(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r78v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0108: ARITH (r104v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r79v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0114: ARITH (32768 int) & (r104v0 int) A[WRAPPED]) != (0 int)) ? false : (r81v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0120: ARITH (r104v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.PromptInformation:?: TERNARY null = ((wrap:int:0x012b: ARITH (r104v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0163: CONSTRUCTOR 
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
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:139) call: com.okinc.business.invest_biz.data.bean.PromptInformation.<init>(com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, com.okinc.business.invest_biz.data.bean.InvestTipInfoVo, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r83v0 com.okinc.business.invest_biz.data.bean.PromptInformation))
  (wrap:int:?: TERNARY null = ((wrap:int:0x016b: ARITH (r104v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r84v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0176: ARITH (r104v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? false : (r85v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0181: ARITH (r104v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x018c: ARITH (r104v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0190: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:147)) : (r87v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0199: ARITH (r104v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r88v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x01a6: ARITH (r104v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? false : (r89v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.models.InvestTokenWithAmount:?: TERNARY null = ((wrap:int:0x01b1: ARITH (r104v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x01f6: CONSTRUCTOR 
  (0 long)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.bean.ButtonType:?: CAST (com.okinc.business.invest_biz.data.bean.ButtonType) (null com.okinc.business.invest_biz.data.bean.ButtonType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestTokenType:?: CAST (com.okinc.business.invest_biz.data.bean.InvestTokenType) (null com.okinc.business.invest_biz.data.bean.InvestTokenType))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Long:?: CAST (java.lang.Long) (null java.lang.Long))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (268435455 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:153) call: com.okinc.business.invest_biz.data.models.InvestTokenWithAmount.<init>(long, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, com.okinc.business.invest_biz.data.bean.ButtonType, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.bean.InvestTokenType, java.lang.Long, java.lang.Long, int, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r90v0 com.okinc.business.invest_biz.data.models.InvestTokenWithAmount))
  (wrap:com.okinc.business.invest_biz.data.bean.CollateralRatioInfo:?: TERNARY null = ((wrap:int:0x01fe: ARITH (r104v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0222: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.Integer:?: CAST (java.lang.Integer) (null java.lang.Integer))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (31 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:155) call: com.okinc.business.invest_biz.data.bean.CollateralRatioInfo.<init>(java.lang.String, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r91v0 com.okinc.business.invest_biz.data.bean.CollateralRatioInfo))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x022a: ARITH (r104v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r92v0 java.lang.Integer))
  (wrap:com.okinc.business.invest_biz.data.contants.BTCMode:?: TERNARY null = ((wrap:int:0x0237: ARITH (r104v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x023b: SGET  A[WRAPPED] (LINE:159) com.okinc.business.invest_biz.data.contants.BTCMode.DEFAULT com.okinc.business.invest_biz.data.contants.BTCMode) : (r93v0 com.okinc.business.invest_biz.data.contants.BTCMode))
  (wrap:com.okinc.business.invest_biz.data.bean.BorrowedInfo:?: TERNARY null = ((wrap:int:0x0242: ARITH (r104v0 int) & (268435456 int) A[WRAPPED]) == (0 int)) ? (r94v0 com.okinc.business.invest_biz.data.bean.BorrowedInfo) : (null com.okinc.business.invest_biz.data.bean.BorrowedInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x024b: ARITH (r104v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0256: ARITH (r104v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0261: ARITH (r104v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x026a: ARITH (r105v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0273: ARITH (r105v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x027c: ARITH (r105v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0285: ARITH (r105v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r101v0 boolean) : false)
  (wrap:int:?: TERNARY null = ((wrap:int:0x028c: ARITH (r105v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r102v0 int) : (-1 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0293: ARITH (r105v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r103v0 java.lang.String))
 A[MD:(long, com.okinc.business.invest_biz.data.models.InvestType, long, java.lang.String, boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.bean.TransactionMethod, java.util.List<com.okinc.business.invest_biz.data.models.InvestTokenWithAmount>, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, long, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, int, boolean, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.InvestOrder>, int, boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.lang.Integer, com.okinc.business.invest_biz.data.contants.BTCMode, com.okinc.business.invest_biz.data.bean.BorrowedInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String):void (m)] (LINE:103) call: com.okinc.business.invest_biz.data.models.InitialInfoModel.RedeemInitialInfo.<init>(long, com.okinc.business.invest_biz.data.models.InvestType, long, java.lang.String, boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.invest_biz.data.bean.TransactionMethod, java.util.List, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, long, boolean, java.lang.String, com.okinc.business.invest_biz.data.bean.PromptInformation, int, boolean, java.lang.String, java.util.List, int, boolean, com.okinc.business.invest_biz.data.models.InvestTokenWithAmount, com.okinc.business.invest_biz.data.bean.CollateralRatioInfo, java.lang.Integer, com.okinc.business.invest_biz.data.contants.BTCMode, com.okinc.business.invest_biz.data.bean.BorrowedInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.String):void type: THIS */
        public /* synthetic */ RedeemInitialInfo(long j, InvestType investType, long j2, String str, boolean z, InvestTokenWithAmount investTokenWithAmount, String str2, String str3, String str4, String str5, List list, TransactionMethod transactionMethod, List list2, InvestTokenWithAmount investTokenWithAmount2, long j3, boolean z2, String str6, PromptInformation promptInformation, int i, boolean z3, String str7, List list3, int i2, boolean z4, InvestTokenWithAmount investTokenWithAmount3, CollateralRatioInfo collateralRatioInfo, Integer num, BTCMode bTCMode, BorrowedInfo borrowedInfo, String str8, String str9, String str10, String str11, String str12, String str13, boolean z5, int i3, String str14, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? InvestType.Save : investType, (i4 & 4) != 0 ? 0L : j2, (i4 & 8) != 0 ? "" : str, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount, (i4 & 64) != 0 ? "" : str2, (i4 & 128) != 0 ? "" : str3, (i4 & 256) != 0 ? "" : str4, (i4 & 512) != 0 ? "" : str5, (i4 & 1024) != 0 ? yDY.AhwBna() : list, (i4 & 2048) != 0 ? TransactionMethod.SINGLE : transactionMethod, (i4 & 4096) != 0 ? yDY.AhwBna() : list2, (i4 & 8192) != 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount2, (i4 & 16384) != 0 ? 0L : j3, (32768 & i4) != 0 ? false : z2, (i4 & 65536) != 0 ? "" : str6, (i4 & 131072) != 0 ? new PromptInformation((InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, (InvestTipInfoVo) null, 1023, (DefaultConstructorMarker) null) : promptInformation, (i4 & 262144) != 0 ? 0 : i, (i4 & 524288) != 0 ? false : z3, (i4 & 1048576) != 0 ? "" : str7, (i4 & 2097152) != 0 ? yDY.AhwBna() : list3, (i4 & 4194304) != 0 ? -1 : i2, (i4 & 8388608) != 0 ? false : z4, (i4 & 16777216) != 0 ? new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null) : investTokenWithAmount3, (i4 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? new CollateralRatioInfo((String) null, (Integer) null, (String) null, (Integer) null, (String) null, 31, (DefaultConstructorMarker) null) : collateralRatioInfo, (i4 & 67108864) != 0 ? null : num, (i4 & 134217728) != 0 ? BTCMode.DEFAULT : bTCMode, (i4 & 268435456) == 0 ? borrowedInfo : null, (i4 & 536870912) != 0 ? "" : str8, (i4 & 1073741824) != 0 ? "" : str9, (i4 & Integer.MIN_VALUE) != 0 ? "" : str10, (i5 & 1) != 0 ? "" : str11, (i5 & 2) != 0 ? "" : str12, (i5 & 4) != 0 ? "" : str13, (i5 & 8) == 0 ? z5 : false, (i5 & 16) == 0 ? i3 : -1, (i5 & 32) != 0 ? "" : str14);
        }

        public final boolean AwvSrB() {
            return this.investType == InvestType.Pos;
        }

        public final boolean sSMYrx() {
            return this.investType == InvestType.Pool;
        }
    }
}
