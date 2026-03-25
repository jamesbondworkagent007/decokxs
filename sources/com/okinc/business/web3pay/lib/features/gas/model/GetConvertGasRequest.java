package com.okinc.business.web3pay.lib.features.gas.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GetConvertGasRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final String toTokenCoinTypeNo;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GetConvertGasRequest copy$default(GetConvertGasRequest getConvertGasRequest, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getConvertGasRequest.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = getConvertGasRequest.tokenAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = getConvertGasRequest.tokenAmount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = getConvertGasRequest.tokenCoinTypeNo;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = getConvertGasRequest.toTokenCoinTypeNo;
        }
        return getConvertGasRequest.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GetConvertGasRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new GetConvertGasRequest(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetConvertGasRequest)) {
            return false;
        }
        GetConvertGasRequest getConvertGasRequest = (GetConvertGasRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) getConvertGasRequest.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) getConvertGasRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) getConvertGasRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) getConvertGasRequest.tokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.toTokenCoinTypeNo, (Object) getConvertGasRequest.toTokenCoinTypeNo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenCoinTypeNo() {
        return this.toTokenCoinTypeNo;
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
    public int hashCode() {
        return (((((((this.chainIndex.hashCode() * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenAmount.hashCode()) * 31) + this.tokenCoinTypeNo.hashCode()) * 31) + this.toTokenCoinTypeNo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GetConvertGasRequest(chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ", toTokenCoinTypeNo=" + this.toTokenCoinTypeNo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GetConvertGasRequest> serializer() {
            return GetConvertGasRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GetConvertGasRequest(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, GetConvertGasRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.tokenCoinTypeNo = str4;
        this.toTokenCoinTypeNo = str5;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GetConvertGasRequest getConvertGasRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, getConvertGasRequest.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, getConvertGasRequest.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, getConvertGasRequest.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, getConvertGasRequest.tokenCoinTypeNo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, getConvertGasRequest.toTokenCoinTypeNo);
    }

    public GetConvertGasRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.tokenCoinTypeNo = str4;
        this.toTokenCoinTypeNo = str5;
    }
}
