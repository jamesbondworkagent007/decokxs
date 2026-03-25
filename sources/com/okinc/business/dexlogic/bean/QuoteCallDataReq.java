package com.okinc.business.dexlogic.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo$$serializer;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class QuoteCallDataReq {
    private final AccountInfo accountInfo;
    private String amount;
    private String bridgeId;
    private String calldataType;
    private String chainId;
    private final Boolean customPriorityFee;
    private String defiPlatformId;
    private List<String> dexIds;
    private DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam;
    private String fromTokenAddress;
    private String fromTokenDecimal;
    private final String gasPrice;
    private final boolean jitoEnable;
    private final String mevInfo;
    private String pmm;
    private final String priorityFee;
    private final String priorityFeeType;
    private String receiveWalletAddress;
    private final String refCode;
    private final String referralCommissionJsVersion;
    private final PresetRouteType routerModeType;
    private final ServiceFeeInfo serviceFeeInfo;
    private final String signature;
    private String slippage;
    private final SlippageMode slippageMode;
    private String toChainId;
    private String toTokenAddress;
    private String toTokenDecimal;
    private final String unsignedTx;
    private String userWalletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexlogic.bean.PresetRouteType", PresetRouteType.values()), EnumsKt.createSimpleEnumSerializer("com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode", SlippageMode.values())};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public QuoteCallDataReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (DexMultiMetaSaveOrderParam) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (Boolean) null, (ServiceFeeInfo) null, (String) null, (String) null, (String) null, (String) null, (String) null, (AccountInfo) null, (PresetRouteType) null, (SlippageMode) null, LockFreeTaskQueueCore.MAX_CAPACITY_MASK, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.pmm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiMetaSaveOrderParam component12() {
        return this.dexMultiMetaSaveOrderParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component13() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.calldataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component19() {
        return this.jitoEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component21() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo component22() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component26() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo component28() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType component29() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode component30() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteCallDataReq copy(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam, List<String> list, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, Boolean bool, ServiceFeeInfo serviceFeeInfo, String str18, String str19, String str20, String str21, String str22, AccountInfo accountInfo, PresetRouteType presetRouteType, SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new QuoteCallDataReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, dexMultiMetaSaveOrderParam, list, str12, str13, str14, str15, str16, z, str17, bool, serviceFeeInfo, str18, str19, str20, str21, str22, accountInfo, presetRouteType, slippageMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuoteCallDataReq)) {
            return false;
        }
        QuoteCallDataReq quoteCallDataReq = (QuoteCallDataReq) obj;
        return Intrinsics.EZpvd((Object) this.amount, (Object) quoteCallDataReq.amount) && Intrinsics.EZpvd((Object) this.slippage, (Object) quoteCallDataReq.slippage) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) quoteCallDataReq.userWalletAddress) && Intrinsics.EZpvd((Object) this.chainId, (Object) quoteCallDataReq.chainId) && Intrinsics.EZpvd((Object) this.toChainId, (Object) quoteCallDataReq.toChainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) quoteCallDataReq.fromTokenAddress) && Intrinsics.EZpvd((Object) this.fromTokenDecimal, (Object) quoteCallDataReq.fromTokenDecimal) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) quoteCallDataReq.toTokenAddress) && Intrinsics.EZpvd((Object) this.toTokenDecimal, (Object) quoteCallDataReq.toTokenDecimal) && Intrinsics.EZpvd((Object) this.pmm, (Object) quoteCallDataReq.pmm) && Intrinsics.EZpvd((Object) this.receiveWalletAddress, (Object) quoteCallDataReq.receiveWalletAddress) && Intrinsics.EZpvd(this.dexMultiMetaSaveOrderParam, quoteCallDataReq.dexMultiMetaSaveOrderParam) && Intrinsics.EZpvd(this.dexIds, quoteCallDataReq.dexIds) && Intrinsics.EZpvd((Object) this.calldataType, (Object) quoteCallDataReq.calldataType) && Intrinsics.EZpvd((Object) this.bridgeId, (Object) quoteCallDataReq.bridgeId) && Intrinsics.EZpvd((Object) this.defiPlatformId, (Object) quoteCallDataReq.defiPlatformId) && Intrinsics.EZpvd((Object) this.unsignedTx, (Object) quoteCallDataReq.unsignedTx) && Intrinsics.EZpvd((Object) this.signature, (Object) quoteCallDataReq.signature) && this.jitoEnable == quoteCallDataReq.jitoEnable && Intrinsics.EZpvd((Object) this.priorityFee, (Object) quoteCallDataReq.priorityFee) && Intrinsics.EZpvd(this.customPriorityFee, quoteCallDataReq.customPriorityFee) && Intrinsics.EZpvd(this.serviceFeeInfo, quoteCallDataReq.serviceFeeInfo) && Intrinsics.EZpvd((Object) this.refCode, (Object) quoteCallDataReq.refCode) && Intrinsics.EZpvd((Object) this.referralCommissionJsVersion, (Object) quoteCallDataReq.referralCommissionJsVersion) && Intrinsics.EZpvd((Object) this.mevInfo, (Object) quoteCallDataReq.mevInfo) && Intrinsics.EZpvd((Object) this.priorityFeeType, (Object) quoteCallDataReq.priorityFeeType) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) quoteCallDataReq.gasPrice) && Intrinsics.EZpvd(this.accountInfo, quoteCallDataReq.accountInfo) && this.routerModeType == quoteCallDataReq.routerModeType && this.slippageMode == quoteCallDataReq.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalldataType() {
        return this.calldataType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCustomPriorityFee() {
        return this.customPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDefiPlatformId() {
        return this.defiPlatformId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDexIds() {
        return this.dexIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiMetaSaveOrderParam getDexMultiMetaSaveOrderParam() {
        return this.dexMultiMetaSaveOrderParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenDecimal() {
        return this.fromTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getJitoEnable() {
        return this.jitoEnable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevInfo() {
        return this.mevInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPmm() {
        return this.pmm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeType() {
        return this.priorityFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiveWalletAddress() {
        return this.receiveWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefCode() {
        return this.refCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReferralCommissionJsVersion() {
        return this.referralCommissionJsVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType getRouterModeType() {
        return this.routerModeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceFeeInfo getServiceFeeInfo() {
        return this.serviceFeeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippage() {
        return this.slippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode getSlippageMode() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToChainId() {
        return this.toChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenDecimal() {
        return this.toTokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnsignedTx() {
        return this.unsignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.amount.hashCode();
        String str = this.slippage;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.userWalletAddress.hashCode();
        int iHashCode4 = this.chainId.hashCode();
        int iHashCode5 = this.toChainId.hashCode();
        int iHashCode6 = this.fromTokenAddress.hashCode();
        int iHashCode7 = this.fromTokenDecimal.hashCode();
        int iHashCode8 = this.toTokenAddress.hashCode();
        int iHashCode9 = this.toTokenDecimal.hashCode();
        int iHashCode10 = this.pmm.hashCode();
        String str2 = this.receiveWalletAddress;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam = this.dexMultiMetaSaveOrderParam;
        int iHashCode12 = dexMultiMetaSaveOrderParam == null ? 0 : dexMultiMetaSaveOrderParam.hashCode();
        List<String> list = this.dexIds;
        int iHashCode13 = list == null ? 0 : list.hashCode();
        String str3 = this.calldataType;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bridgeId;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.defiPlatformId;
        int iHashCode16 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.unsignedTx;
        int iHashCode17 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.signature;
        int iHashCode18 = str7 == null ? 0 : str7.hashCode();
        int iHashCode19 = Boolean.hashCode(this.jitoEnable);
        String str8 = this.priorityFee;
        int iHashCode20 = str8 == null ? 0 : str8.hashCode();
        Boolean bool = this.customPriorityFee;
        int iHashCode21 = bool == null ? 0 : bool.hashCode();
        ServiceFeeInfo serviceFeeInfo = this.serviceFeeInfo;
        int iHashCode22 = serviceFeeInfo == null ? 0 : serviceFeeInfo.hashCode();
        String str9 = this.refCode;
        int iHashCode23 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.referralCommissionJsVersion;
        int iHashCode24 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.mevInfo;
        int iHashCode25 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.priorityFeeType;
        int iHashCode26 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.gasPrice;
        int iHashCode27 = str13 == null ? 0 : str13.hashCode();
        AccountInfo accountInfo = this.accountInfo;
        int iHashCode28 = accountInfo == null ? 0 : accountInfo.hashCode();
        PresetRouteType presetRouteType = this.routerModeType;
        int iHashCode29 = presetRouteType == null ? 0 : presetRouteType.hashCode();
        SlippageMode slippageMode = this.slippageMode;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + (slippageMode == null ? 0 : slippageMode.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeId(String str) {
        this.bridgeId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalldataType(String str) {
        this.calldataType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefiPlatformId(String str) {
        this.defiPlatformId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexIds(List<String> list) {
        this.dexIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDexMultiMetaSaveOrderParam(DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam) {
        this.dexMultiMetaSaveOrderParam = dexMultiMetaSaveOrderParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromTokenDecimal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromTokenDecimal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPmm(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.pmm = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReceiveWalletAddress(String str) {
        this.receiveWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippage(String str) {
        this.slippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToChainId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toChainId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToTokenDecimal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toTokenDecimal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userWalletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteCallDataReq(amount=" + this.amount + ", slippage=" + this.slippage + ", userWalletAddress=" + this.userWalletAddress + ", chainId=" + this.chainId + ", toChainId=" + this.toChainId + ", fromTokenAddress=" + this.fromTokenAddress + ", fromTokenDecimal=" + this.fromTokenDecimal + ", toTokenAddress=" + this.toTokenAddress + ", toTokenDecimal=" + this.toTokenDecimal + ", pmm=" + this.pmm + ", receiveWalletAddress=" + this.receiveWalletAddress + ", dexMultiMetaSaveOrderParam=" + this.dexMultiMetaSaveOrderParam + ", dexIds=" + this.dexIds + ", calldataType=" + this.calldataType + ", bridgeId=" + this.bridgeId + ", defiPlatformId=" + this.defiPlatformId + ", unsignedTx=" + this.unsignedTx + ", signature=" + this.signature + ", jitoEnable=" + this.jitoEnable + ", priorityFee=" + this.priorityFee + ", customPriorityFee=" + this.customPriorityFee + ", serviceFeeInfo=" + this.serviceFeeInfo + ", refCode=" + this.refCode + ", referralCommissionJsVersion=" + this.referralCommissionJsVersion + ", mevInfo=" + this.mevInfo + ", priorityFeeType=" + this.priorityFeeType + ", gasPrice=" + this.gasPrice + ", accountInfo=" + this.accountInfo + ", routerModeType=" + this.routerModeType + ", slippageMode=" + this.slippageMode + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.QuoteCallDataReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<QuoteCallDataReq> serializer() {
            return QuoteCallDataReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ QuoteCallDataReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam, List list, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, Boolean bool, ServiceFeeInfo serviceFeeInfo, String str18, String str19, String str20, String str21, String str22, AccountInfo accountInfo, PresetRouteType presetRouteType, SlippageMode slippageMode, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.amount = "";
        } else {
            this.amount = str;
        }
        if ((i & 2) == 0) {
            this.slippage = null;
        } else {
            this.slippage = str2;
        }
        if ((i & 4) == 0) {
            this.userWalletAddress = "";
        } else {
            this.userWalletAddress = str3;
        }
        if ((i & 8) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str4;
        }
        if ((i & 16) == 0) {
            this.toChainId = "";
        } else {
            this.toChainId = str5;
        }
        if ((i & 32) == 0) {
            this.fromTokenAddress = "";
        } else {
            this.fromTokenAddress = str6;
        }
        if ((i & 64) == 0) {
            this.fromTokenDecimal = "";
        } else {
            this.fromTokenDecimal = str7;
        }
        if ((i & 128) == 0) {
            this.toTokenAddress = "";
        } else {
            this.toTokenAddress = str8;
        }
        if ((i & 256) == 0) {
            this.toTokenDecimal = "";
        } else {
            this.toTokenDecimal = str9;
        }
        if ((i & 512) == 0) {
            this.pmm = "";
        } else {
            this.pmm = str10;
        }
        if ((i & 1024) == 0) {
            this.receiveWalletAddress = null;
        } else {
            this.receiveWalletAddress = str11;
        }
        if ((i & 2048) == 0) {
            this.dexMultiMetaSaveOrderParam = null;
        } else {
            this.dexMultiMetaSaveOrderParam = dexMultiMetaSaveOrderParam;
        }
        if ((i & 4096) == 0) {
            this.dexIds = null;
        } else {
            this.dexIds = list;
        }
        if ((i & 8192) == 0) {
            this.calldataType = null;
        } else {
            this.calldataType = str12;
        }
        if ((i & 16384) == 0) {
            this.bridgeId = null;
        } else {
            this.bridgeId = str13;
        }
        if ((32768 & i) == 0) {
            this.defiPlatformId = null;
        } else {
            this.defiPlatformId = str14;
        }
        if ((65536 & i) == 0) {
            this.unsignedTx = null;
        } else {
            this.unsignedTx = str15;
        }
        if ((131072 & i) == 0) {
            this.signature = null;
        } else {
            this.signature = str16;
        }
        this.jitoEnable = (262144 & i) == 0 ? false : z;
        if ((524288 & i) == 0) {
            this.priorityFee = null;
        } else {
            this.priorityFee = str17;
        }
        if ((1048576 & i) == 0) {
            this.customPriorityFee = null;
        } else {
            this.customPriorityFee = bool;
        }
        if ((2097152 & i) == 0) {
            this.serviceFeeInfo = null;
        } else {
            this.serviceFeeInfo = serviceFeeInfo;
        }
        if ((4194304 & i) == 0) {
            this.refCode = null;
        } else {
            this.refCode = str18;
        }
        if ((8388608 & i) == 0) {
            this.referralCommissionJsVersion = null;
        } else {
            this.referralCommissionJsVersion = str19;
        }
        if ((16777216 & i) == 0) {
            this.mevInfo = null;
        } else {
            this.mevInfo = str20;
        }
        if ((33554432 & i) == 0) {
            this.priorityFeeType = null;
        } else {
            this.priorityFeeType = str21;
        }
        if ((67108864 & i) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str22;
        }
        if ((134217728 & i) == 0) {
            this.accountInfo = null;
        } else {
            this.accountInfo = accountInfo;
        }
        if ((268435456 & i) == 0) {
            this.routerModeType = null;
        } else {
            this.routerModeType = presetRouteType;
        }
        if ((i & 536870912) == 0) {
            this.slippageMode = null;
        } else {
            this.slippageMode = slippageMode;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(QuoteCallDataReq quoteCallDataReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) quoteCallDataReq.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, quoteCallDataReq.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || quoteCallDataReq.slippage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, quoteCallDataReq.slippage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) quoteCallDataReq.userWalletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, quoteCallDataReq.userWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) quoteCallDataReq.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, quoteCallDataReq.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) quoteCallDataReq.toChainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, quoteCallDataReq.toChainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) quoteCallDataReq.fromTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, quoteCallDataReq.fromTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) quoteCallDataReq.fromTokenDecimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, quoteCallDataReq.fromTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) quoteCallDataReq.toTokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, quoteCallDataReq.toTokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) quoteCallDataReq.toTokenDecimal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, quoteCallDataReq.toTokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) quoteCallDataReq.pmm, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, quoteCallDataReq.pmm);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || quoteCallDataReq.receiveWalletAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, quoteCallDataReq.receiveWalletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || quoteCallDataReq.dexMultiMetaSaveOrderParam != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DexMultiMetaSaveOrderParam$$serializer.INSTANCE, quoteCallDataReq.dexMultiMetaSaveOrderParam);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || quoteCallDataReq.dexIds != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], quoteCallDataReq.dexIds);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || quoteCallDataReq.calldataType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, quoteCallDataReq.calldataType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || quoteCallDataReq.bridgeId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, quoteCallDataReq.bridgeId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || quoteCallDataReq.defiPlatformId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, quoteCallDataReq.defiPlatformId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || quoteCallDataReq.unsignedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, quoteCallDataReq.unsignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || quoteCallDataReq.signature != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, quoteCallDataReq.signature);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || quoteCallDataReq.jitoEnable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 18, quoteCallDataReq.jitoEnable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || quoteCallDataReq.priorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, quoteCallDataReq.priorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || quoteCallDataReq.customPriorityFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, BooleanSerializer.INSTANCE, quoteCallDataReq.customPriorityFee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || quoteCallDataReq.serviceFeeInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, ServiceFeeInfo$$serializer.INSTANCE, quoteCallDataReq.serviceFeeInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || quoteCallDataReq.refCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, StringSerializer.INSTANCE, quoteCallDataReq.refCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || quoteCallDataReq.referralCommissionJsVersion != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, StringSerializer.INSTANCE, quoteCallDataReq.referralCommissionJsVersion);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || quoteCallDataReq.mevInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, quoteCallDataReq.mevInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || quoteCallDataReq.priorityFeeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, StringSerializer.INSTANCE, quoteCallDataReq.priorityFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || quoteCallDataReq.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, StringSerializer.INSTANCE, quoteCallDataReq.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || quoteCallDataReq.accountInfo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, AccountInfo$$serializer.INSTANCE, quoteCallDataReq.accountInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || quoteCallDataReq.routerModeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, kSerializerArr[28], quoteCallDataReq.routerModeType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && quoteCallDataReq.slippageMode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, kSerializerArr[29], quoteCallDataReq.slippageMode);
    }

    public QuoteCallDataReq(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, String str11, DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam, List<String> list, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, Boolean bool, ServiceFeeInfo serviceFeeInfo, String str18, String str19, String str20, String str21, String str22, AccountInfo accountInfo, PresetRouteType presetRouteType, SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.amount = str;
        this.slippage = str2;
        this.userWalletAddress = str3;
        this.chainId = str4;
        this.toChainId = str5;
        this.fromTokenAddress = str6;
        this.fromTokenDecimal = str7;
        this.toTokenAddress = str8;
        this.toTokenDecimal = str9;
        this.pmm = str10;
        this.receiveWalletAddress = str11;
        this.dexMultiMetaSaveOrderParam = dexMultiMetaSaveOrderParam;
        this.dexIds = list;
        this.calldataType = str12;
        this.bridgeId = str13;
        this.defiPlatformId = str14;
        this.unsignedTx = str15;
        this.signature = str16;
        this.jitoEnable = z;
        this.priorityFee = str17;
        this.customPriorityFee = bool;
        this.serviceFeeInfo = serviceFeeInfo;
        this.refCode = str18;
        this.referralCommissionJsVersion = str19;
        this.mevInfo = str20;
        this.priorityFeeType = str21;
        this.gasPrice = str22;
        this.accountInfo = accountInfo;
        this.routerModeType = presetRouteType;
        this.slippageMode = slippageMode;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x015e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r62v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r62v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r62v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r62v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r62v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r62v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r62v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r62v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r62v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r62v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r41v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r62v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam:?: TERNARY null = ((wrap:int:0x005b: ARITH (r62v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam) : (r43v0 com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0063: ARITH (r62v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r44v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r62v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (r62v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007e: ARITH (r62v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0089: ARITH (r62v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0094: ARITH (r62v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009f: ARITH (r62v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? false : (r50v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00aa: ARITH (r62v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00b5: ARITH (r62v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r52v0 java.lang.Boolean))
  (wrap:com.okinc.business.dexlogic.bean.ServiceFeeInfo:?: TERNARY null = ((wrap:int:0x00c0: ARITH (r62v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ServiceFeeInfo) : (r53v0 com.okinc.business.dexlogic.bean.ServiceFeeInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00cb: ARITH (r62v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d6: ARITH (r62v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e1: ARITH (r62v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ec: ARITH (r62v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f7: ARITH (r62v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r58v0 java.lang.String))
  (wrap:com.okinc.business.dex.trade.core.domain.model.common.AccountInfo:?: TERNARY null = ((wrap:int:0x0102: ARITH (r62v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.trade.core.domain.model.common.AccountInfo) : (r59v0 com.okinc.business.dex.trade.core.domain.model.common.AccountInfo))
  (wrap:com.okinc.business.dexlogic.bean.PresetRouteType:?: TERNARY null = ((wrap:int:0x010d: ARITH (r62v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.PresetRouteType) : (r60v0 com.okinc.business.dexlogic.bean.PresetRouteType))
  (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode:?: TERNARY null = ((wrap:int:0x0118: ARITH (r62v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode) : (r61v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Boolean, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dexlogic.bean.PresetRouteType, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode):void (m)] (LINE:2172) call: com.okinc.business.dexlogic.bean.QuoteCallDataReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiMetaSaveOrderParam, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Boolean, com.okinc.business.dexlogic.bean.ServiceFeeInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.trade.core.domain.model.common.AccountInfo, com.okinc.business.dexlogic.bean.PresetRouteType, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode):void type: THIS */
    public /* synthetic */ QuoteCallDataReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, DexMultiMetaSaveOrderParam dexMultiMetaSaveOrderParam, List list, String str12, String str13, String str14, String str15, String str16, boolean z, String str17, Boolean bool, ServiceFeeInfo serviceFeeInfo, String str18, String str19, String str20, String str21, String str22, AccountInfo accountInfo, PresetRouteType presetRouteType, SlippageMode slippageMode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) == 0 ? str10 : "", (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : dexMultiMetaSaveOrderParam, (i & 4096) != 0 ? null : list, (i & 8192) != 0 ? null : str12, (i & 16384) != 0 ? null : str13, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? null : str15, (i & 131072) != 0 ? null : str16, (i & 262144) != 0 ? false : z, (i & 524288) != 0 ? null : str17, (i & 1048576) != 0 ? null : bool, (i & 2097152) != 0 ? null : serviceFeeInfo, (i & 4194304) != 0 ? null : str18, (i & 8388608) != 0 ? null : str19, (i & 16777216) != 0 ? null : str20, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str21, (i & 67108864) != 0 ? null : str22, (i & 134217728) != 0 ? null : accountInfo, (i & 268435456) != 0 ? null : presetRouteType, (i & 536870912) != 0 ? null : slippageMode);
    }
}
