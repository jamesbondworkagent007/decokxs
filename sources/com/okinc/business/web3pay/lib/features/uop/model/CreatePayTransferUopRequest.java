package com.okinc.business.web3pay.lib.features.uop.model;

import androidx.core.app.FrameMetricsAggregator;
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
public final class CreatePayTransferUopRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String areaCode;
    private final String chainIndex;
    private final int projectId;
    private final String receiverInfo;
    private final int receiverType;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;
    private final String usdAmount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.receiverType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.receiverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.areaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreatePayTransferUopRequest copy(@NotNull String str, int i, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new CreatePayTransferUopRequest(str, i, str2, str3, str4, str5, str6, str7, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePayTransferUopRequest)) {
            return false;
        }
        CreatePayTransferUopRequest createPayTransferUopRequest = (CreatePayTransferUopRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) createPayTransferUopRequest.chainIndex) && this.receiverType == createPayTransferUopRequest.receiverType && Intrinsics.EZpvd((Object) this.receiverInfo, (Object) createPayTransferUopRequest.receiverInfo) && Intrinsics.EZpvd((Object) this.areaCode, (Object) createPayTransferUopRequest.areaCode) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) createPayTransferUopRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) createPayTransferUopRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) createPayTransferUopRequest.usdAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) createPayTransferUopRequest.tokenCoinTypeNo) && this.projectId == createPayTransferUopRequest.projectId;
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
    public final int getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReceiverInfo() {
        return this.receiverInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getReceiverType() {
        return this.receiverType;
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
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = Integer.hashCode(this.receiverType);
        int iHashCode3 = this.receiverInfo.hashCode();
        String str = this.areaCode;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + this.usdAmount.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + Integer.hashCode(this.projectId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreatePayTransferUopRequest(chainIndex=" + this.chainIndex + ", receiverType=" + this.receiverType + ", receiverInfo=" + this.receiverInfo + ", areaCode=" + this.areaCode + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", projectId=" + this.projectId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.CreatePayTransferUopRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreatePayTransferUopRequest> serializer() {
            return CreatePayTransferUopRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreatePayTransferUopRequest(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, String str7, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i, FrameMetricsAggregator.EVERY_DURATION, CreatePayTransferUopRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.receiverType = i2;
        this.receiverInfo = str2;
        this.areaCode = str3;
        this.tokenAddress = str4;
        this.tokenAmount = str5;
        this.usdAmount = str6;
        this.tokenCoinTypeNo = str7;
        this.projectId = i3;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(CreatePayTransferUopRequest createPayTransferUopRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, createPayTransferUopRequest.chainIndex);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, createPayTransferUopRequest.receiverType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, createPayTransferUopRequest.receiverInfo);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, createPayTransferUopRequest.areaCode);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, createPayTransferUopRequest.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, createPayTransferUopRequest.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, createPayTransferUopRequest.usdAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, createPayTransferUopRequest.tokenCoinTypeNo);
        compositeEncoder.encodeIntElement(serialDescriptor, 8, createPayTransferUopRequest.projectId);
    }

    public CreatePayTransferUopRequest(@NotNull String str, int i, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.chainIndex = str;
        this.receiverType = i;
        this.receiverInfo = str2;
        this.areaCode = str3;
        this.tokenAddress = str4;
        this.tokenAmount = str5;
        this.usdAmount = str6;
        this.tokenCoinTypeNo = str7;
        this.projectId = i2;
    }
}
