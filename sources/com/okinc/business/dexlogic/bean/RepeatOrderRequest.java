package com.okinc.business.dexlogic.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class RepeatOrderRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String accountId;
    private final String amount;
    private final String chainId;
    private final String fromSwapFeeUsd;
    private final String fromTokenAddress;
    private final String toTokenAddress;
    private final String userWalletAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RepeatOrderRequest copy$default(RepeatOrderRequest repeatOrderRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repeatOrderRequest.chainId;
        }
        if ((i & 2) != 0) {
            str2 = repeatOrderRequest.fromTokenAddress;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = repeatOrderRequest.amount;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = repeatOrderRequest.toTokenAddress;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = repeatOrderRequest.userWalletAddress;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = repeatOrderRequest.accountId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = repeatOrderRequest.fromSwapFeeUsd;
        }
        return repeatOrderRequest.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RepeatOrderRequest copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new RepeatOrderRequest(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepeatOrderRequest)) {
            return false;
        }
        RepeatOrderRequest repeatOrderRequest = (RepeatOrderRequest) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) repeatOrderRequest.chainId) && Intrinsics.EZpvd((Object) this.fromTokenAddress, (Object) repeatOrderRequest.fromTokenAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) repeatOrderRequest.amount) && Intrinsics.EZpvd((Object) this.toTokenAddress, (Object) repeatOrderRequest.toTokenAddress) && Intrinsics.EZpvd((Object) this.userWalletAddress, (Object) repeatOrderRequest.userWalletAddress) && Intrinsics.EZpvd((Object) this.accountId, (Object) repeatOrderRequest.accountId) && Intrinsics.EZpvd((Object) this.fromSwapFeeUsd, (Object) repeatOrderRequest.fromSwapFeeUsd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromSwapFeeUsd() {
        return this.fromSwapFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenAddress() {
        return this.fromTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToTokenAddress() {
        return this.toTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserWalletAddress() {
        return this.userWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.chainId.hashCode() * 31) + this.fromTokenAddress.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.toTokenAddress.hashCode()) * 31) + this.userWalletAddress.hashCode()) * 31) + this.accountId.hashCode()) * 31) + this.fromSwapFeeUsd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RepeatOrderRequest(chainId=" + this.chainId + ", fromTokenAddress=" + this.fromTokenAddress + ", amount=" + this.amount + ", toTokenAddress=" + this.toTokenAddress + ", userWalletAddress=" + this.userWalletAddress + ", accountId=" + this.accountId + ", fromSwapFeeUsd=" + this.fromSwapFeeUsd + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.RepeatOrderRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RepeatOrderRequest> serializer() {
            return RepeatOrderRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepeatOrderRequest(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, RepeatOrderRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.amount = str3;
        this.toTokenAddress = str4;
        this.userWalletAddress = str5;
        this.accountId = str6;
        this.fromSwapFeeUsd = str7;
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(RepeatOrderRequest repeatOrderRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, repeatOrderRequest.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, repeatOrderRequest.fromTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, repeatOrderRequest.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, repeatOrderRequest.toTokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, repeatOrderRequest.userWalletAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, repeatOrderRequest.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, repeatOrderRequest.fromSwapFeeUsd);
    }

    public RepeatOrderRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.chainId = str;
        this.fromTokenAddress = str2;
        this.amount = str3;
        this.toTokenAddress = str4;
        this.userWalletAddress = str5;
        this.accountId = str6;
        this.fromSwapFeeUsd = str7;
    }
}
