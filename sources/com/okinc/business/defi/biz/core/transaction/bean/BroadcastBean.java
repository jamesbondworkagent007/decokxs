package com.okinc.business.defi.biz.core.transaction.bean;

import com.okinc.business.defi.biz.core.transaction.sign.evm.aa.bean.ApprovalForAll;
import com.okinc.business.defi.biz.core.transaction.sign.evm.aa.bean.ApprovalForAll$$serializer;
import com.okinc.business.defi.biz.net.bean.UserOperation;
import com.okinc.business.defi.biz.net.bean.UserOperation$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class BroadcastBean {
    private static final KSerializer<Object>[] $childSerializers;
    private String aaFeeToken;
    private String accountId;
    private Integer activityId;
    private String approvalAddress;
    private List<ApprovalForAll> approvalForAllList;
    private String coinAmount;
    private long coinId;
    private String dapp;
    private List<String> dependTx;
    private String domain;
    private String extJson;
    private String feeRate;
    private String fromAdr;
    private String inputData;
    private String itemId;
    private transient String jitoHash;
    private transient String jitoSignedTx;
    private String memo;
    private List<String> mevSuppliers;
    private transient String nonce;
    private transient String originData;
    private EVM5792SendCallsParams sendCallsParams;
    private String serviceCharge;
    private transient String signRawData;
    private transient Integer signType;
    private String signedTx;
    private transient String signedTxWithoutJito;
    private String toAdr;
    private String txHash;
    private int txSource;
    private String txType;
    private UserOperation uop;
    private transient String uopHash;
    private int walletType;
    private Boolean x402transfer;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.itemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.extJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component17() {
        return this.dependTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation component18() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.aaFeeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component20() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component21() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ApprovalForAll> component22() {
        return this.approvalForAllList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component23() {
        return this.signRawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component24() {
        return this.originData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component25() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component26() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component27() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792SendCallsParams component28() {
        return this.sendCallsParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component29() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component30() {
        return this.signedTxWithoutJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component31() {
        return this.jitoHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component32() {
        return this.jitoSignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component33() {
        return this.x402transfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component34() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component35() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fromAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.toAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BroadcastBean copy(@NotNull String str, int i, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, @NotNull String str9, String str10, String str11, String str12, String str13, List<String> list, UserOperation userOperation, String str14, List<String> list2, String str15, List<ApprovalForAll> list3, String str16, String str17, String str18, Integer num, String str19, EVM5792SendCallsParams eVM5792SendCallsParams, String str20, String str21, String str22, String str23, Boolean bool, Integer num2, String str24) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new BroadcastBean(str, i, str2, str3, str4, str5, j, str6, str7, i2, str8, str9, str10, str11, str12, str13, list, userOperation, str14, list2, str15, list3, str16, str17, str18, num, str19, eVM5792SendCallsParams, str20, str21, str22, str23, bool, num2, str24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BroadcastBean)) {
            return false;
        }
        BroadcastBean broadcastBean = (BroadcastBean) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) broadcastBean.accountId) && this.walletType == broadcastBean.walletType && Intrinsics.EZpvd((Object) this.signedTx, (Object) broadcastBean.signedTx) && Intrinsics.EZpvd((Object) this.txHash, (Object) broadcastBean.txHash) && Intrinsics.EZpvd((Object) this.fromAdr, (Object) broadcastBean.fromAdr) && Intrinsics.EZpvd((Object) this.toAdr, (Object) broadcastBean.toAdr) && this.coinId == broadcastBean.coinId && Intrinsics.EZpvd((Object) this.coinAmount, (Object) broadcastBean.coinAmount) && Intrinsics.EZpvd((Object) this.serviceCharge, (Object) broadcastBean.serviceCharge) && this.txSource == broadcastBean.txSource && Intrinsics.EZpvd((Object) this.itemId, (Object) broadcastBean.itemId) && Intrinsics.EZpvd((Object) this.extJson, (Object) broadcastBean.extJson) && Intrinsics.EZpvd((Object) this.txType, (Object) broadcastBean.txType) && Intrinsics.EZpvd((Object) this.inputData, (Object) broadcastBean.inputData) && Intrinsics.EZpvd((Object) this.domain, (Object) broadcastBean.domain) && Intrinsics.EZpvd((Object) this.memo, (Object) broadcastBean.memo) && Intrinsics.EZpvd(this.dependTx, broadcastBean.dependTx) && Intrinsics.EZpvd(this.uop, broadcastBean.uop) && Intrinsics.EZpvd((Object) this.aaFeeToken, (Object) broadcastBean.aaFeeToken) && Intrinsics.EZpvd(this.mevSuppliers, broadcastBean.mevSuppliers) && Intrinsics.EZpvd((Object) this.feeRate, (Object) broadcastBean.feeRate) && Intrinsics.EZpvd(this.approvalForAllList, broadcastBean.approvalForAllList) && Intrinsics.EZpvd((Object) this.signRawData, (Object) broadcastBean.signRawData) && Intrinsics.EZpvd((Object) this.originData, (Object) broadcastBean.originData) && Intrinsics.EZpvd((Object) this.approvalAddress, (Object) broadcastBean.approvalAddress) && Intrinsics.EZpvd(this.activityId, broadcastBean.activityId) && Intrinsics.EZpvd((Object) this.dapp, (Object) broadcastBean.dapp) && Intrinsics.EZpvd(this.sendCallsParams, broadcastBean.sendCallsParams) && Intrinsics.EZpvd((Object) this.nonce, (Object) broadcastBean.nonce) && Intrinsics.EZpvd((Object) this.signedTxWithoutJito, (Object) broadcastBean.signedTxWithoutJito) && Intrinsics.EZpvd((Object) this.jitoHash, (Object) broadcastBean.jitoHash) && Intrinsics.EZpvd((Object) this.jitoSignedTx, (Object) broadcastBean.jitoSignedTx) && Intrinsics.EZpvd(this.x402transfer, broadcastBean.x402transfer) && Intrinsics.EZpvd(this.signType, broadcastBean.signType) && Intrinsics.EZpvd((Object) this.uopHash, (Object) broadcastBean.uopHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAaFeeToken() {
        return this.aaFeeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getActivityId() {
        return this.activityId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApprovalAddress() {
        return this.approvalAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ApprovalForAll> getApprovalForAllList() {
        return this.approvalForAllList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDapp() {
        return this.dapp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDependTx() {
        return this.dependTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtJson() {
        return this.extJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAdr() {
        return this.fromAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJitoHash() {
        return this.jitoHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getJitoSignedTx() {
        return this.jitoSignedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMevSuppliers() {
        return this.mevSuppliers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOriginData() {
        return this.originData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792SendCallsParams getSendCallsParams() {
        return this.sendCallsParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCharge() {
        return this.serviceCharge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignRawData() {
        return this.signRawData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSignType() {
        return this.signType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignedTx() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignedTxWithoutJito() {
        return this.signedTxWithoutJito;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAdr() {
        return this.toAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxSource() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserOperation getUop() {
        return this.uop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getX402transfer() {
        return this.x402transfer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        int iHashCode2 = Integer.hashCode(this.walletType);
        int iHashCode3 = this.signedTx.hashCode();
        String str = this.txHash;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.fromAdr.hashCode();
        int iHashCode6 = this.toAdr.hashCode();
        int iHashCode7 = Long.hashCode(this.coinId);
        int iHashCode8 = this.coinAmount.hashCode();
        int iHashCode9 = this.serviceCharge.hashCode();
        int iHashCode10 = Integer.hashCode(this.txSource);
        int iHashCode11 = this.itemId.hashCode();
        int iHashCode12 = this.extJson.hashCode();
        String str2 = this.txType;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.inputData;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.domain;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.memo;
        int iHashCode16 = str5 == null ? 0 : str5.hashCode();
        List<String> list = this.dependTx;
        int iHashCode17 = list == null ? 0 : list.hashCode();
        UserOperation userOperation = this.uop;
        int iHashCode18 = userOperation == null ? 0 : userOperation.hashCode();
        String str6 = this.aaFeeToken;
        int iHashCode19 = str6 == null ? 0 : str6.hashCode();
        List<String> list2 = this.mevSuppliers;
        int iHashCode20 = list2 == null ? 0 : list2.hashCode();
        String str7 = this.feeRate;
        int iHashCode21 = str7 == null ? 0 : str7.hashCode();
        List<ApprovalForAll> list3 = this.approvalForAllList;
        int iHashCode22 = list3 == null ? 0 : list3.hashCode();
        String str8 = this.signRawData;
        int iHashCode23 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.originData;
        int iHashCode24 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.approvalAddress;
        int iHashCode25 = str10 == null ? 0 : str10.hashCode();
        Integer num = this.activityId;
        int iHashCode26 = num == null ? 0 : num.hashCode();
        String str11 = this.dapp;
        int iHashCode27 = str11 == null ? 0 : str11.hashCode();
        EVM5792SendCallsParams eVM5792SendCallsParams = this.sendCallsParams;
        int iHashCode28 = eVM5792SendCallsParams == null ? 0 : eVM5792SendCallsParams.hashCode();
        String str12 = this.nonce;
        int iHashCode29 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.signedTxWithoutJito;
        int iHashCode30 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.jitoHash;
        int iHashCode31 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.jitoSignedTx;
        int iHashCode32 = str15 == null ? 0 : str15.hashCode();
        Boolean bool = this.x402transfer;
        int iHashCode33 = bool == null ? 0 : bool.hashCode();
        Integer num2 = this.signType;
        int iHashCode34 = num2 == null ? 0 : num2.hashCode();
        String str16 = this.uopHash;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode34) * 31) + (str16 == null ? 0 : str16.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAaFeeToken(String str) {
        this.aaFeeToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActivityId(Integer num) {
        this.activityId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalAddress(String str) {
        this.approvalAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setApprovalForAllList(List<ApprovalForAll> list) {
        this.approvalForAllList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDapp(String str) {
        this.dapp = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDependTx(List<String> list) {
        this.dependTx = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDomain(String str) {
        this.domain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extJson = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAdr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAdr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(String str) {
        this.inputData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setItemId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.itemId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJitoHash(String str) {
        this.jitoHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setJitoSignedTx(String str) {
        this.jitoSignedTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMevSuppliers(List<String> list) {
        this.mevSuppliers = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(String str) {
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOriginData(String str) {
        this.originData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSendCallsParams(EVM5792SendCallsParams eVM5792SendCallsParams) {
        this.sendCallsParams = eVM5792SendCallsParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setServiceCharge(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.serviceCharge = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignRawData(String str) {
        this.signRawData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignType(Integer num) {
        this.signType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignedTx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signedTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignedTxWithoutJito(String str) {
        this.signedTxWithoutJito = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAdr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAdr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(String str) {
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxSource(int i) {
        this.txSource = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(String str) {
        this.txType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUop(UserOperation userOperation) {
        this.uop = userOperation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUopHash(String str) {
        this.uopHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletType(int i) {
        this.walletType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setX402transfer(Boolean bool) {
        this.x402transfer = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BroadcastBean(accountId=" + this.accountId + ", walletType=" + this.walletType + ", signedTx=" + this.signedTx + ", txHash=" + this.txHash + ", fromAdr=" + this.fromAdr + ", toAdr=" + this.toAdr + ", coinId=" + this.coinId + ", coinAmount=" + this.coinAmount + ", serviceCharge=" + this.serviceCharge + ", txSource=" + this.txSource + ", itemId=" + this.itemId + ", extJson=" + this.extJson + ", txType=" + this.txType + ", inputData=" + this.inputData + ", domain=" + this.domain + ", memo=" + this.memo + ", dependTx=" + this.dependTx + ", uop=" + this.uop + ", aaFeeToken=" + this.aaFeeToken + ", mevSuppliers=" + this.mevSuppliers + ", feeRate=" + this.feeRate + ", approvalForAllList=" + this.approvalForAllList + ", signRawData=" + this.signRawData + ", originData=" + this.originData + ", approvalAddress=" + this.approvalAddress + ", activityId=" + this.activityId + ", dapp=" + this.dapp + ", sendCallsParams=" + this.sendCallsParams + ", nonce=" + this.nonce + ", signedTxWithoutJito=" + this.signedTxWithoutJito + ", jitoHash=" + this.jitoHash + ", jitoSignedTx=" + this.jitoSignedTx + ", x402transfer=" + this.x402transfer + ", signType=" + this.signType + ", uopHash=" + this.uopHash + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BroadcastBean> serializer() {
            return BroadcastBean$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(stringSerializer), null, null, new ArrayListSerializer(stringSerializer), null, new ArrayListSerializer(ApprovalForAll$$serializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public /* synthetic */ BroadcastBean(int i, int i2, String str, int i3, String str2, String str3, String str4, String str5, long j, String str6, String str7, int i4, String str8, String str9, String str10, String str11, String str12, String str13, List list, UserOperation userOperation, String str14, List list2, String str15, List list3, String str16, String str17, String str18, Integer num, String str19, EVM5792SendCallsParams eVM5792SendCallsParams, String str20, String str21, String str22, String str23, Boolean bool, Integer num2, String str24, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{4095, 0}, BroadcastBean$$serializer.INSTANCE.getDescriptor());
        }
        this.accountId = str;
        this.walletType = i3;
        this.signedTx = str2;
        this.txHash = str3;
        this.fromAdr = str4;
        this.toAdr = str5;
        this.coinId = j;
        this.coinAmount = str6;
        this.serviceCharge = str7;
        this.txSource = i4;
        this.itemId = str8;
        this.extJson = str9;
        if ((i & 4096) == 0) {
            this.txType = null;
        } else {
            this.txType = str10;
        }
        if ((i & 8192) == 0) {
            this.inputData = null;
        } else {
            this.inputData = str11;
        }
        if ((i & 16384) == 0) {
            this.domain = null;
        } else {
            this.domain = str12;
        }
        if ((32768 & i) == 0) {
            this.memo = null;
        } else {
            this.memo = str13;
        }
        if ((65536 & i) == 0) {
            this.dependTx = null;
        } else {
            this.dependTx = list;
        }
        if ((131072 & i) == 0) {
            this.uop = null;
        } else {
            this.uop = userOperation;
        }
        if ((262144 & i) == 0) {
            this.aaFeeToken = null;
        } else {
            this.aaFeeToken = str14;
        }
        if ((524288 & i) == 0) {
            this.mevSuppliers = null;
        } else {
            this.mevSuppliers = list2;
        }
        if ((1048576 & i) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str15;
        }
        if ((2097152 & i) == 0) {
            this.approvalForAllList = null;
        } else {
            this.approvalForAllList = list3;
        }
        if ((4194304 & i) == 0) {
            this.signRawData = null;
        } else {
            this.signRawData = str16;
        }
        if ((8388608 & i) == 0) {
            this.originData = null;
        } else {
            this.originData = str17;
        }
        if ((16777216 & i) == 0) {
            this.approvalAddress = null;
        } else {
            this.approvalAddress = str18;
        }
        if ((33554432 & i) == 0) {
            this.activityId = null;
        } else {
            this.activityId = num;
        }
        if ((67108864 & i) == 0) {
            this.dapp = null;
        } else {
            this.dapp = str19;
        }
        if ((134217728 & i) == 0) {
            this.sendCallsParams = null;
        } else {
            this.sendCallsParams = eVM5792SendCallsParams;
        }
        if ((268435456 & i) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str20;
        }
        if ((536870912 & i) == 0) {
            this.signedTxWithoutJito = null;
        } else {
            this.signedTxWithoutJito = str21;
        }
        if ((1073741824 & i) == 0) {
            this.jitoHash = null;
        } else {
            this.jitoHash = str22;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.jitoSignedTx = null;
        } else {
            this.jitoSignedTx = str23;
        }
        if ((i2 & 1) == 0) {
            this.x402transfer = null;
        } else {
            this.x402transfer = bool;
        }
        if ((i2 & 2) == 0) {
            this.signType = null;
        } else {
            this.signType = num2;
        }
        if ((i2 & 4) == 0) {
            this.uopHash = null;
        } else {
            this.uopHash = str24;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(BroadcastBean broadcastBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, broadcastBean.accountId);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, broadcastBean.walletType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, broadcastBean.signedTx);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, broadcastBean.txHash);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, broadcastBean.fromAdr);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, broadcastBean.toAdr);
        compositeEncoder.encodeLongElement(serialDescriptor, 6, broadcastBean.coinId);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, broadcastBean.coinAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, broadcastBean.serviceCharge);
        compositeEncoder.encodeIntElement(serialDescriptor, 9, broadcastBean.txSource);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, broadcastBean.itemId);
        compositeEncoder.encodeStringElement(serialDescriptor, 11, broadcastBean.extJson);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || broadcastBean.txType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, broadcastBean.txType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || broadcastBean.inputData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, broadcastBean.inputData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || broadcastBean.domain != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, broadcastBean.domain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || broadcastBean.memo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, broadcastBean.memo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || broadcastBean.dependTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr[16], broadcastBean.dependTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || broadcastBean.uop != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 17, UserOperation$$serializer.INSTANCE, broadcastBean.uop);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || broadcastBean.aaFeeToken != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, broadcastBean.aaFeeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || broadcastBean.mevSuppliers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 19, kSerializerArr[19], broadcastBean.mevSuppliers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || broadcastBean.feeRate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 20, stringSerializer, broadcastBean.feeRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || broadcastBean.approvalForAllList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 21, kSerializerArr[21], broadcastBean.approvalForAllList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || broadcastBean.signRawData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 22, stringSerializer, broadcastBean.signRawData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || broadcastBean.originData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 23, stringSerializer, broadcastBean.originData);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || broadcastBean.approvalAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 24, stringSerializer, broadcastBean.approvalAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || broadcastBean.activityId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 25, IntSerializer.INSTANCE, broadcastBean.activityId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || broadcastBean.dapp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 26, stringSerializer, broadcastBean.dapp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || broadcastBean.sendCallsParams != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 27, EVM5792SendCallsParams$$serializer.INSTANCE, broadcastBean.sendCallsParams);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || broadcastBean.nonce != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 28, stringSerializer, broadcastBean.nonce);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || broadcastBean.signedTxWithoutJito != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, stringSerializer, broadcastBean.signedTxWithoutJito);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || broadcastBean.jitoHash != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, stringSerializer, broadcastBean.jitoHash);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || broadcastBean.jitoSignedTx != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, stringSerializer, broadcastBean.jitoSignedTx);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || broadcastBean.x402transfer != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 32, BooleanSerializer.INSTANCE, broadcastBean.x402transfer);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || broadcastBean.signType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 33, IntSerializer.INSTANCE, broadcastBean.signType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) && broadcastBean.uopHash == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 34, stringSerializer, broadcastBean.uopHash);
    }

    public BroadcastBean(@NotNull String str, int i, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, long j, @NotNull String str6, @NotNull String str7, int i2, @NotNull String str8, @NotNull String str9, String str10, String str11, String str12, String str13, List<String> list, UserOperation userOperation, String str14, List<String> list2, String str15, List<ApprovalForAll> list3, String str16, String str17, String str18, Integer num, String str19, EVM5792SendCallsParams eVM5792SendCallsParams, String str20, String str21, String str22, String str23, Boolean bool, Integer num2, String str24) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.accountId = str;
        this.walletType = i;
        this.signedTx = str2;
        this.txHash = str3;
        this.fromAdr = str4;
        this.toAdr = str5;
        this.coinId = j;
        this.coinAmount = str6;
        this.serviceCharge = str7;
        this.txSource = i2;
        this.itemId = str8;
        this.extJson = str9;
        this.txType = str10;
        this.inputData = str11;
        this.domain = str12;
        this.memo = str13;
        this.dependTx = list;
        this.uop = userOperation;
        this.aaFeeToken = str14;
        this.mevSuppliers = list2;
        this.feeRate = str15;
        this.approvalForAllList = list3;
        this.signRawData = str16;
        this.originData = str17;
        this.approvalAddress = str18;
        this.activityId = num;
        this.dapp = str19;
        this.sendCallsParams = eVM5792SendCallsParams;
        this.nonce = str20;
        this.signedTxWithoutJito = str21;
        this.jitoHash = str22;
        this.jitoSignedTx = str23;
        this.x402transfer = bool;
        this.signType = num2;
        this.uopHash = str24;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00fe: CONSTRUCTOR 
  (r41v0 java.lang.String)
  (r42v0 int)
  (r43v0 java.lang.String)
  (r44v0 java.lang.String)
  (r45v0 java.lang.String)
  (r46v0 java.lang.String)
  (r47v0 long)
  (r49v0 java.lang.String)
  (r50v0 java.lang.String)
  (r51v0 int)
  (r52v0 java.lang.String)
  (r53v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r77v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r77v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r77v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (32768 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r57v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (65536 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r58v0 java.util.List))
  (wrap:com.okinc.business.defi.biz.net.bean.UserOperation:?: TERNARY null = ((wrap:int:0x0035: ARITH (131072 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.net.bean.UserOperation) : (r59v0 com.okinc.business.defi.biz.net.bean.UserOperation))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (262144 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r60v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (524288 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r61v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (1048576 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r62v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005d: ARITH (2097152 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r63v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0067: ARITH (4194304 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (8388608 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (16777216 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r66v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0085: ARITH (33554432 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r67v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (67108864 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r68v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams:?: TERNARY null = ((wrap:int:0x0099: ARITH (134217728 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams) : (r69v0 com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a3: ARITH (268435456 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ad: ARITH (536870912 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b7: ARITH (1073741824 int) & (r77v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c1: ARITH (r77v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r73v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r78v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r74v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x00d2: ARITH (r78v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r75v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00db: ARITH (r78v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r76v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, com.okinc.business.defi.biz.net.bean.UserOperation, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.util.List<com.okinc.business.defi.biz.core.transaction.sign.evm.aa.bean.ApprovalForAll>, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.defi.biz.core.transaction.bean.BroadcastBean.<init>(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.defi.biz.net.bean.UserOperation, java.lang.String, java.util.List, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, com.okinc.business.defi.biz.core.transaction.bean.EVM5792SendCallsParams, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ BroadcastBean(String str, int i, String str2, String str3, String str4, String str5, long j, String str6, String str7, int i2, String str8, String str9, String str10, String str11, String str12, String str13, List list, UserOperation userOperation, String str14, List list2, String str15, List list3, String str16, String str17, String str18, Integer num, String str19, EVM5792SendCallsParams eVM5792SendCallsParams, String str20, String str21, String str22, String str23, Boolean bool, Integer num2, String str24, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, str4, str5, j, str6, str7, i2, str8, str9, (i3 & 4096) != 0 ? null : str10, (i3 & 8192) != 0 ? null : str11, (i3 & 16384) != 0 ? null : str12, (32768 & i3) != 0 ? null : str13, (65536 & i3) != 0 ? null : list, (131072 & i3) != 0 ? null : userOperation, (262144 & i3) != 0 ? null : str14, (524288 & i3) != 0 ? null : list2, (1048576 & i3) != 0 ? null : str15, (2097152 & i3) != 0 ? null : list3, (4194304 & i3) != 0 ? null : str16, (8388608 & i3) != 0 ? null : str17, (16777216 & i3) != 0 ? null : str18, (33554432 & i3) != 0 ? null : num, (67108864 & i3) != 0 ? null : str19, (134217728 & i3) != 0 ? null : eVM5792SendCallsParams, (268435456 & i3) != 0 ? null : str20, (536870912 & i3) != 0 ? null : str21, (1073741824 & i3) != 0 ? null : str22, (i3 & Integer.MIN_VALUE) != 0 ? null : str23, (i4 & 1) != 0 ? null : bool, (i4 & 2) != 0 ? null : num2, (i4 & 4) != 0 ? null : str24);
    }
}
