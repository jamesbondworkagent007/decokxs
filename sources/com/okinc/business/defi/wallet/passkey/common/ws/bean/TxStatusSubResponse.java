package com.okinc.business.defi.wallet.passkey.common.ws.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C17659fNn;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class TxStatusSubResponse extends C17659fNn {
    private final String areaCode;
    private final String chainIndex;
    private final Integer code;
    private final ConvertInfoWS convertInfo;
    private final List<Stage> convertStages;
    private final Long createTime;
    private final String currencyAmount;
    private final Integer failedType;
    private final Long firstPackTime;
    private final String from;
    private final Integer gasFeeType;
    private final String merchantId;
    private final int msgType;
    private final String orderId;
    private final int orderType;
    private final String parentOrderId;
    private final String productCode;
    private final Integer receiverType;
    private final int status;
    private final Integer subStatus;
    private final Long timeToCancel;
    private final String to;
    private final String toTokenAmount;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final Integer tokenDecimal;
    private final String tokenSymbol;
    private final String txHash;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(Stage$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component10() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Stage> component11() {
        return this.convertStages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component16() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component20() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component22() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component23() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component24() {
        return this.receiverType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component27() {
        return this.firstPackTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component28() {
        return this.gasFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertInfoWS component30() {
        return this.convertInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.timeToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxStatusSubResponse copy(@NotNull String str, @NotNull String str2, int i, String str3, @NotNull String str4, Long l, int i2, String str5, String str6, Integer num, List<Stage> list, Integer num2, String str7, int i3, String str8, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, Integer num4, String str15, Integer num5, Long l3, Integer num6, String str16, ConvertInfoWS convertInfoWS) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new TxStatusSubResponse(str, str2, i, str3, str4, l, i2, str5, str6, num, list, num2, str7, i3, str8, num3, str9, str10, str11, str12, str13, str14, l2, num4, str15, num5, l3, num6, str16, convertInfoWS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxStatusSubResponse)) {
            return false;
        }
        TxStatusSubResponse txStatusSubResponse = (TxStatusSubResponse) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) txStatusSubResponse.orderId) && Intrinsics.EZpvd((Object) this.parentOrderId, (Object) txStatusSubResponse.parentOrderId) && this.status == txStatusSubResponse.status && Intrinsics.EZpvd((Object) this.uopHash, (Object) txStatusSubResponse.uopHash) && Intrinsics.EZpvd((Object) this.txHash, (Object) txStatusSubResponse.txHash) && Intrinsics.EZpvd(this.timeToCancel, txStatusSubResponse.timeToCancel) && this.orderType == txStatusSubResponse.orderType && Intrinsics.EZpvd((Object) this.productCode, (Object) txStatusSubResponse.productCode) && Intrinsics.EZpvd((Object) this.merchantId, (Object) txStatusSubResponse.merchantId) && Intrinsics.EZpvd(this.code, txStatusSubResponse.code) && Intrinsics.EZpvd(this.convertStages, txStatusSubResponse.convertStages) && Intrinsics.EZpvd(this.failedType, txStatusSubResponse.failedType) && Intrinsics.EZpvd((Object) this.toTokenAmount, (Object) txStatusSubResponse.toTokenAmount) && this.msgType == txStatusSubResponse.msgType && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) txStatusSubResponse.tokenSymbol) && Intrinsics.EZpvd(this.tokenDecimal, txStatusSubResponse.tokenDecimal) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) txStatusSubResponse.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) txStatusSubResponse.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) txStatusSubResponse.tokenAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) txStatusSubResponse.currencyAmount) && Intrinsics.EZpvd((Object) this.from, (Object) txStatusSubResponse.from) && Intrinsics.EZpvd((Object) this.to, (Object) txStatusSubResponse.to) && Intrinsics.EZpvd(this.createTime, txStatusSubResponse.createTime) && Intrinsics.EZpvd(this.receiverType, txStatusSubResponse.receiverType) && Intrinsics.EZpvd((Object) this.areaCode, (Object) txStatusSubResponse.areaCode) && Intrinsics.EZpvd(this.subStatus, txStatusSubResponse.subStatus) && Intrinsics.EZpvd(this.firstPackTime, txStatusSubResponse.firstPackTime) && Intrinsics.EZpvd(this.gasFeeType, txStatusSubResponse.gasFeeType) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) txStatusSubResponse.tokenCoinTypeNo) && Intrinsics.EZpvd(this.convertInfo, txStatusSubResponse.convertInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAreaCode() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConvertInfoWS getConvertInfo() {
        return this.convertInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Stage> getConvertStages() {
        return this.convertStages;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFailedType() {
        return this.failedType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getFirstPackTime() {
        return this.firstPackTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getGasFeeType() {
        return this.gasFeeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMsgType() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getParentOrderId() {
        return this.parentOrderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProductCode() {
        return this.productCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getReceiverType() {
        return this.receiverType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubStatus() {
        return this.subStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimeToCancel() {
        return this.timeToCancel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAmount() {
        return this.toTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCoinTypeNo() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.orderId.hashCode();
        int iHashCode2 = this.parentOrderId.hashCode();
        int iHashCode3 = Integer.hashCode(this.status);
        String str = this.uopHash;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.txHash.hashCode();
        Long l = this.timeToCancel;
        int iHashCode6 = l == null ? 0 : l.hashCode();
        int iHashCode7 = Integer.hashCode(this.orderType);
        String str2 = this.productCode;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.merchantId;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.code;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        List<Stage> list = this.convertStages;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        Integer num2 = this.failedType;
        int iHashCode12 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.toTokenAmount;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        int iHashCode14 = Integer.hashCode(this.msgType);
        String str5 = this.tokenSymbol;
        int iHashCode15 = str5 == null ? 0 : str5.hashCode();
        Integer num3 = this.tokenDecimal;
        int iHashCode16 = num3 == null ? 0 : num3.hashCode();
        String str6 = this.chainIndex;
        int iHashCode17 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.tokenAddress;
        int iHashCode18 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.tokenAmount;
        int iHashCode19 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.currencyAmount;
        int iHashCode20 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.from;
        int iHashCode21 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.to;
        int iHashCode22 = str11 == null ? 0 : str11.hashCode();
        Long l2 = this.createTime;
        int iHashCode23 = l2 == null ? 0 : l2.hashCode();
        Integer num4 = this.receiverType;
        int iHashCode24 = num4 == null ? 0 : num4.hashCode();
        String str12 = this.areaCode;
        int iHashCode25 = str12 == null ? 0 : str12.hashCode();
        Integer num5 = this.subStatus;
        int iHashCode26 = num5 == null ? 0 : num5.hashCode();
        Long l3 = this.firstPackTime;
        int iHashCode27 = l3 == null ? 0 : l3.hashCode();
        Integer num6 = this.gasFeeType;
        int iHashCode28 = num6 == null ? 0 : num6.hashCode();
        String str13 = this.tokenCoinTypeNo;
        int iHashCode29 = str13 == null ? 0 : str13.hashCode();
        ConvertInfoWS convertInfoWS = this.convertInfo;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + (convertInfoWS == null ? 0 : convertInfoWS.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxStatusSubResponse(orderId=" + this.orderId + ", parentOrderId=" + this.parentOrderId + ", status=" + this.status + ", uopHash=" + this.uopHash + ", txHash=" + this.txHash + ", timeToCancel=" + this.timeToCancel + ", orderType=" + this.orderType + ", productCode=" + this.productCode + ", merchantId=" + this.merchantId + ", code=" + this.code + ", convertStages=" + this.convertStages + ", failedType=" + this.failedType + ", toTokenAmount=" + this.toTokenAmount + ", msgType=" + this.msgType + ", tokenSymbol=" + this.tokenSymbol + ", tokenDecimal=" + this.tokenDecimal + ", chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", currencyAmount=" + this.currencyAmount + ", from=" + this.from + ", to=" + this.to + ", createTime=" + this.createTime + ", receiverType=" + this.receiverType + ", areaCode=" + this.areaCode + ", subStatus=" + this.subStatus + ", firstPackTime=" + this.firstPackTime + ", gasFeeType=" + this.gasFeeType + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", convertInfo=" + this.convertInfo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TxStatusSubResponse> serializer() {
            return TxStatusSubResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TxStatusSubResponse(int i, String str, String str2, int i2, String str3, String str4, Long l, int i3, String str5, String str6, Integer num, List list, Integer num2, String str7, int i4, String str8, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, Integer num4, String str15, Integer num5, Long l3, Integer num6, String str16, ConvertInfoWS convertInfoWS, SerializationConstructorMarker serializationConstructorMarker) {
        if (87 != (i & 87)) {
            PluginExceptionsKt.throwMissingFieldException(i, 87, TxStatusSubResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.orderId = str;
        this.parentOrderId = str2;
        this.status = i2;
        if ((i & 8) == 0) {
            this.uopHash = null;
        } else {
            this.uopHash = str3;
        }
        this.txHash = str4;
        if ((i & 32) == 0) {
            this.timeToCancel = null;
        } else {
            this.timeToCancel = l;
        }
        this.orderType = i3;
        if ((i & 128) == 0) {
            this.productCode = null;
        } else {
            this.productCode = str5;
        }
        if ((i & 256) == 0) {
            this.merchantId = null;
        } else {
            this.merchantId = str6;
        }
        if ((i & 512) == 0) {
            this.code = null;
        } else {
            this.code = num;
        }
        if ((i & 1024) == 0) {
            this.convertStages = null;
        } else {
            this.convertStages = list;
        }
        if ((i & 2048) == 0) {
            this.failedType = null;
        } else {
            this.failedType = num2;
        }
        if ((i & 4096) == 0) {
            this.toTokenAmount = null;
        } else {
            this.toTokenAmount = str7;
        }
        this.msgType = (i & 8192) == 0 ? MsgType.UNKNOWN_TYPE.getValue() : i4;
        if ((i & 16384) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str8;
        }
        if ((32768 & i) == 0) {
            this.tokenDecimal = null;
        } else {
            this.tokenDecimal = num3;
        }
        if ((65536 & i) == 0) {
            this.chainIndex = null;
        } else {
            this.chainIndex = str9;
        }
        if ((131072 & i) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str10;
        }
        if ((262144 & i) == 0) {
            this.tokenAmount = null;
        } else {
            this.tokenAmount = str11;
        }
        if ((524288 & i) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str12;
        }
        if ((1048576 & i) == 0) {
            this.from = null;
        } else {
            this.from = str13;
        }
        if ((2097152 & i) == 0) {
            this.to = null;
        } else {
            this.to = str14;
        }
        if ((4194304 & i) == 0) {
            this.createTime = null;
        } else {
            this.createTime = l2;
        }
        if ((8388608 & i) == 0) {
            this.receiverType = null;
        } else {
            this.receiverType = num4;
        }
        if ((16777216 & i) == 0) {
            this.areaCode = null;
        } else {
            this.areaCode = str15;
        }
        if ((33554432 & i) == 0) {
            this.subStatus = null;
        } else {
            this.subStatus = num5;
        }
        if ((67108864 & i) == 0) {
            this.firstPackTime = null;
        } else {
            this.firstPackTime = l3;
        }
        if ((134217728 & i) == 0) {
            this.gasFeeType = null;
        } else {
            this.gasFeeType = num6;
        }
        if ((268435456 & i) == 0) {
            this.tokenCoinTypeNo = null;
        } else {
            this.tokenCoinTypeNo = str16;
        }
        if ((i & 536870912) == 0) {
            this.convertInfo = null;
        } else {
            this.convertInfo = convertInfoWS;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TxStatusSubResponse txStatusSubResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, txStatusSubResponse.orderId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, txStatusSubResponse.parentOrderId);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, txStatusSubResponse.status);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || txStatusSubResponse.uopHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, txStatusSubResponse.uopHash);
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, txStatusSubResponse.txHash);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || txStatusSubResponse.timeToCancel != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, txStatusSubResponse.timeToCancel);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, txStatusSubResponse.orderType);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || txStatusSubResponse.productCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, txStatusSubResponse.productCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || txStatusSubResponse.merchantId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, txStatusSubResponse.merchantId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || txStatusSubResponse.code != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, txStatusSubResponse.code);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || txStatusSubResponse.convertStages != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr[10], txStatusSubResponse.convertStages);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || txStatusSubResponse.failedType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, txStatusSubResponse.failedType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || txStatusSubResponse.toTokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, txStatusSubResponse.toTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || txStatusSubResponse.msgType != MsgType.UNKNOWN_TYPE.getValue()) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, txStatusSubResponse.msgType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || txStatusSubResponse.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, txStatusSubResponse.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || txStatusSubResponse.tokenDecimal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, IntSerializer.INSTANCE, txStatusSubResponse.tokenDecimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || txStatusSubResponse.chainIndex != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, txStatusSubResponse.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || txStatusSubResponse.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, txStatusSubResponse.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || txStatusSubResponse.tokenAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, txStatusSubResponse.tokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || txStatusSubResponse.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, StringSerializer.INSTANCE, txStatusSubResponse.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || txStatusSubResponse.from != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, StringSerializer.INSTANCE, txStatusSubResponse.from);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || txStatusSubResponse.to != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, StringSerializer.INSTANCE, txStatusSubResponse.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || txStatusSubResponse.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, LongSerializer.INSTANCE, txStatusSubResponse.createTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || txStatusSubResponse.receiverType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, IntSerializer.INSTANCE, txStatusSubResponse.receiverType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || txStatusSubResponse.areaCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, StringSerializer.INSTANCE, txStatusSubResponse.areaCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || txStatusSubResponse.subStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, txStatusSubResponse.subStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || txStatusSubResponse.firstPackTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, LongSerializer.INSTANCE, txStatusSubResponse.firstPackTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || txStatusSubResponse.gasFeeType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, IntSerializer.INSTANCE, txStatusSubResponse.gasFeeType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || txStatusSubResponse.tokenCoinTypeNo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, StringSerializer.INSTANCE, txStatusSubResponse.tokenCoinTypeNo);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) && txStatusSubResponse.convertInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, ConvertInfoWS$$serializer.INSTANCE, txStatusSubResponse.convertInfo);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ff: CONSTRUCTOR 
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r65v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (r39v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000b: ARITH (r65v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r40v0 java.lang.Long))
  (r41v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r65v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r65v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r43v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0023: ARITH (r65v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r44v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r65v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r45v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0033: ARITH (r65v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r46v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r65v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r47v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r65v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: INVOKE 
  (wrap:com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse$MsgType:0x0048: SGET  A[WRAPPED] (LINE:26) com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse.MsgType.UNKNOWN_TYPE com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse$MsgType)
 VIRTUAL call: com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse.MsgType.getValue():int A[MD:():int (m), WRAPPED] (LINE:26)) : (r48v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r65v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r49v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005f: ARITH (32768 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r50v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0069: ARITH (65536 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0073: ARITH (131072 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (262144 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (524288 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0091: ARITH (1048576 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009b: ARITH (2097152 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00a5: ARITH (4194304 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r57v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00af: ARITH (8388608 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r58v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b9: ARITH (16777216 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r59v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00c3: ARITH (33554432 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r60v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x00cd: ARITH (67108864 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r61v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00d7: ARITH (134217728 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r62v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00e1: ARITH (268435456 int) & (r65v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r63v0 java.lang.String))
  (wrap:com.okinc.business.defi.wallet.passkey.common.ws.bean.ConvertInfoWS:?: TERNARY null = ((wrap:int:0x00eb: ARITH (r65v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.passkey.common.ws.bean.ConvertInfoWS) : (r64v0 com.okinc.business.defi.wallet.passkey.common.ws.bean.ConvertInfoWS))
 A[MD:(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.Integer, java.util.List<com.okinc.business.defi.wallet.passkey.common.ws.bean.Stage>, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.String, com.okinc.business.defi.wallet.passkey.common.ws.bean.ConvertInfoWS):void (m)] (LINE:12) call: com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.Long, int, java.lang.String, java.lang.String, java.lang.Integer, java.util.List, java.lang.Integer, java.lang.String, int, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Integer, java.lang.String, com.okinc.business.defi.wallet.passkey.common.ws.bean.ConvertInfoWS):void type: THIS */
    public /* synthetic */ TxStatusSubResponse(String str, String str2, int i, String str3, String str4, Long l, int i2, String str5, String str6, Integer num, List list, Integer num2, String str7, int i3, String str8, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, Integer num4, String str15, Integer num5, Long l3, Integer num6, String str16, ConvertInfoWS convertInfoWS, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i4 & 8) != 0 ? null : str3, str4, (i4 & 32) != 0 ? null : l, i2, (i4 & 128) != 0 ? null : str5, (i4 & 256) != 0 ? null : str6, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : list, (i4 & 2048) != 0 ? null : num2, (i4 & 4096) != 0 ? null : str7, (i4 & 8192) != 0 ? MsgType.UNKNOWN_TYPE.getValue() : i3, (i4 & 16384) != 0 ? null : str8, (32768 & i4) != 0 ? null : num3, (65536 & i4) != 0 ? null : str9, (131072 & i4) != 0 ? null : str10, (262144 & i4) != 0 ? null : str11, (524288 & i4) != 0 ? null : str12, (1048576 & i4) != 0 ? null : str13, (2097152 & i4) != 0 ? null : str14, (4194304 & i4) != 0 ? null : l2, (8388608 & i4) != 0 ? null : num4, (16777216 & i4) != 0 ? null : str15, (33554432 & i4) != 0 ? null : num5, (67108864 & i4) != 0 ? null : l3, (134217728 & i4) != 0 ? null : num6, (268435456 & i4) != 0 ? null : str16, (i4 & 536870912) != 0 ? null : convertInfoWS);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MsgType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ MsgType[] $VALUES;
        public static final StateListAnimator Companion;
        private final int value;
        public static final MsgType NEW_ORDER = new MsgType("NEW_ORDER", 0, 0);
        public static final MsgType UPDATED_ORDER = new MsgType("UPDATED_ORDER", 1, 1);
        public static final MsgType UNKNOWN_TYPE = new MsgType("UNKNOWN_TYPE", 2, -1);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ MsgType[] $values() {
            return new MsgType[]{NEW_ORDER, UPDATED_ORDER, UNKNOWN_TYPE};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<MsgType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private MsgType(String str, int i, int i2) {
            this.value = i2;
        }

        static {
            MsgType[] msgTypeArr$values = $values();
            $VALUES = msgTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(msgTypeArr$values);
            Companion = new StateListAnimator(null);
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse.MsgType.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }

        public static MsgType valueOf(String str) {
            return (MsgType) Enum.valueOf(MsgType.class, str);
        }

        public static MsgType[] values() {
            return (MsgType[]) $VALUES.clone();
        }
    }

    public TxStatusSubResponse(@NotNull String str, @NotNull String str2, int i, String str3, @NotNull String str4, Long l, int i2, String str5, String str6, Integer num, List<Stage> list, Integer num2, String str7, int i3, String str8, Integer num3, String str9, String str10, String str11, String str12, String str13, String str14, Long l2, Integer num4, String str15, Integer num5, Long l3, Integer num6, String str16, ConvertInfoWS convertInfoWS) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.orderId = str;
        this.parentOrderId = str2;
        this.status = i;
        this.uopHash = str3;
        this.txHash = str4;
        this.timeToCancel = l;
        this.orderType = i2;
        this.productCode = str5;
        this.merchantId = str6;
        this.code = num;
        this.convertStages = list;
        this.failedType = num2;
        this.toTokenAmount = str7;
        this.msgType = i3;
        this.tokenSymbol = str8;
        this.tokenDecimal = num3;
        this.chainIndex = str9;
        this.tokenAddress = str10;
        this.tokenAmount = str11;
        this.currencyAmount = str12;
        this.from = str13;
        this.to = str14;
        this.createTime = l2;
        this.receiverType = num4;
        this.areaCode = str15;
        this.subStatus = num5;
        this.firstPackTime = l3;
        this.gasFeeType = num6;
        this.tokenCoinTypeNo = str16;
        this.convertInfo = convertInfoWS;
    }
}
