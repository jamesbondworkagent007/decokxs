package com.okinc.business.web3pay.lib.features.gas.model;

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
public final class OnChainGasRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainIndex;
    private final String masterCurrencyId;
    private final String to;
    private final String tokenAddress;
    private final String tokenAmount;
    private final String tokenCoinTypeNo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OnChainGasRequest copy$default(OnChainGasRequest onChainGasRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onChainGasRequest.chainIndex;
        }
        if ((i & 2) != 0) {
            str2 = onChainGasRequest.tokenAddress;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = onChainGasRequest.tokenAmount;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = onChainGasRequest.to;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = onChainGasRequest.masterCurrencyId;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = onChainGasRequest.tokenCoinTypeNo;
        }
        return onChainGasRequest.copy(str, str7, str8, str9, str10, str6);
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
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OnChainGasRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new OnChainGasRequest(str, str2, str3, str4, str5, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnChainGasRequest)) {
            return false;
        }
        OnChainGasRequest onChainGasRequest = (OnChainGasRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) onChainGasRequest.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) onChainGasRequest.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) onChainGasRequest.tokenAmount) && Intrinsics.EZpvd((Object) this.to, (Object) onChainGasRequest.to) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) onChainGasRequest.masterCurrencyId) && Intrinsics.EZpvd((Object) this.tokenCoinTypeNo, (Object) onChainGasRequest.tokenCoinTypeNo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
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
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        int iHashCode2 = this.tokenAddress.hashCode();
        int iHashCode3 = this.tokenAmount.hashCode();
        String str = this.to;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.masterCurrencyId;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tokenCoinTypeNo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OnChainGasRequest(chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", tokenAmount=" + this.tokenAmount + ", to=" + this.to + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenCoinTypeNo=" + this.tokenCoinTypeNo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.gas.model.OnChainGasRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OnChainGasRequest> serializer() {
            return OnChainGasRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OnChainGasRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i, 63, OnChainGasRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.to = str4;
        this.masterCurrencyId = str5;
        this.tokenCoinTypeNo = str6;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(OnChainGasRequest onChainGasRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, onChainGasRequest.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, onChainGasRequest.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, onChainGasRequest.tokenAmount);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, onChainGasRequest.to);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, onChainGasRequest.masterCurrencyId);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, onChainGasRequest.tokenCoinTypeNo);
    }

    public OnChainGasRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.tokenAmount = str3;
        this.to = str4;
        this.masterCurrencyId = str5;
        this.tokenCoinTypeNo = str6;
    }
}
