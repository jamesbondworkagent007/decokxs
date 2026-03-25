package com.okinc.business.web3pay.lib.features.uop.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasToken;
import com.okinc.business.web3pay.lib.core.model.GasToken$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class CreateOnChainTransferUopRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final String feeTokenAddress;
    private final GasLimit gasLimit;
    private final GasPrice gasPrice;
    private final GasToken gasToken;
    private final String masterCurrencyId;
    private final int orderType;
    private final int projectId;
    private final String to;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final String travelRuleId;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasToken component11() {
        return this.gasToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit component12() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice component13() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreateOnChainTransferUopRequest copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, int i2, String str6, String str7, @NotNull String str8, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new CreateOnChainTransferUopRequest(str, i, str2, str3, str4, str5, i2, str6, str7, str8, gasToken, gasLimit, gasPrice, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateOnChainTransferUopRequest)) {
            return false;
        }
        CreateOnChainTransferUopRequest createOnChainTransferUopRequest = (CreateOnChainTransferUopRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) createOnChainTransferUopRequest.chainIndex) && this.projectId == createOnChainTransferUopRequest.projectId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) createOnChainTransferUopRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) createOnChainTransferUopRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) createOnChainTransferUopRequest.usdAmount) && Intrinsics.EZpvd((Object) this.to, (Object) createOnChainTransferUopRequest.to) && this.orderType == createOnChainTransferUopRequest.orderType && Intrinsics.EZpvd((Object) this.feeTokenAddress, (Object) createOnChainTransferUopRequest.feeTokenAddress) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) createOnChainTransferUopRequest.masterCurrencyId) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) createOnChainTransferUopRequest.tokenCoinTypeNo) && Intrinsics.EZpvd(this.gasToken, createOnChainTransferUopRequest.gasToken) && Intrinsics.EZpvd(this.gasLimit, createOnChainTransferUopRequest.gasLimit) && Intrinsics.EZpvd(this.gasPrice, createOnChainTransferUopRequest.gasPrice) && Intrinsics.EZpvd((Object) this.travelRuleId, (Object) createOnChainTransferUopRequest.travelRuleId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenAddress() {
        return this.feeTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasToken getGasToken() {
        return this.gasToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getOrderType() {
        return this.orderType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
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
    public final String getTravelRuleId() {
        return this.travelRuleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = Integer.hashCode(this.projectId);
        int iHashCode3 = this.tokenAddress.hashCode();
        int iHashCode4 = this.tokenAmount.hashCode();
        int iHashCode5 = this.usdAmount.hashCode();
        String str = this.to;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Integer.hashCode(this.orderType);
        String str2 = this.feeTokenAddress;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.masterCurrencyId;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        int iHashCode10 = this.tokenCoinTypeNo.hashCode();
        GasToken gasToken = this.gasToken;
        int iHashCode11 = gasToken == null ? 0 : gasToken.hashCode();
        GasLimit gasLimit = this.gasLimit;
        int iHashCode12 = gasLimit == null ? 0 : gasLimit.hashCode();
        GasPrice gasPrice = this.gasPrice;
        int iHashCode13 = gasPrice == null ? 0 : gasPrice.hashCode();
        String str4 = this.travelRuleId;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreateOnChainTransferUopRequest(chainIndex=" + this.chainIndex + ", projectId=" + this.projectId + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", to=" + this.to + ", orderType=" + this.orderType + ", feeTokenAddress=" + this.feeTokenAddress + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", gasToken=" + this.gasToken + ", gasLimit=" + this.gasLimit + ", gasPrice=" + this.gasPrice + ", travelRuleId=" + this.travelRuleId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreateOnChainTransferUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreateOnChainTransferUopRequest> serializer() {
            return CreateOnChainTransferUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreateOnChainTransferUopRequest(int i, String str, int i2, String str2, String str3, String str4, String str5, int i3, String str6, String str7, String str8, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if (16383 != (i & 16383)) {
            PluginExceptionsKt.throwMissingFieldException(i, 16383, CreateOnChainTransferUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.projectId = i2;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.usdAmount = str4;
        this.to = str5;
        this.orderType = i3;
        this.feeTokenAddress = str6;
        this.masterCurrencyId = str7;
        this.tokenCoinTypeNo = str8;
        this.gasToken = gasToken;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
        this.travelRuleId = str9;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreateOnChainTransferUopRequest createOnChainTransferUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createOnChainTransferUopRequest.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createOnChainTransferUopRequest.projectId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, createOnChainTransferUopRequest.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, createOnChainTransferUopRequest.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, createOnChainTransferUopRequest.usdAmount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, createOnChainTransferUopRequest.to);
        compositeEncoder.encodeIntElement(serialDescriptor, 6, createOnChainTransferUopRequest.orderType);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, createOnChainTransferUopRequest.feeTokenAddress);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, createOnChainTransferUopRequest.masterCurrencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, createOnChainTransferUopRequest.tokenCoinTypeNo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, GasToken$$serializer.INSTANCE, createOnChainTransferUopRequest.gasToken);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, GasLimit$$serializer.INSTANCE, createOnChainTransferUopRequest.gasLimit);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, GasPrice$$serializer.INSTANCE, createOnChainTransferUopRequest.gasPrice);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, createOnChainTransferUopRequest.travelRuleId);
    }

    public CreateOnChainTransferUopRequest(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, int i2, String str6, String str7, @NotNull String str8, GasToken gasToken, GasLimit gasLimit, GasPrice gasPrice, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.chainIndex = str;
        this.projectId = i;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.usdAmount = str4;
        this.to = str5;
        this.orderType = i2;
        this.feeTokenAddress = str6;
        this.masterCurrencyId = str7;
        this.tokenCoinTypeNo = str8;
        this.gasToken = gasToken;
        this.gasLimit = gasLimit;
        this.gasPrice = gasPrice;
        this.travelRuleId = str9;
    }
}
