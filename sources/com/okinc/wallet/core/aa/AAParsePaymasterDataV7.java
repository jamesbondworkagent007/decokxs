package com.okinc.wallet.core.aa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAParsePaymasterDataV7 {
    private String paymaster;
    private String paymasterData;
    private String paymasterPostOpGasLimit;
    private String paymasterVerificationGasLimit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAParsePaymasterDataV7 copy$default(AAParsePaymasterDataV7 aAParsePaymasterDataV7, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAParsePaymasterDataV7.paymaster;
        }
        if ((i & 2) != 0) {
            str2 = aAParsePaymasterDataV7.paymasterPostOpGasLimit;
        }
        if ((i & 4) != 0) {
            str3 = aAParsePaymasterDataV7.paymasterVerificationGasLimit;
        }
        if ((i & 8) != 0) {
            str4 = aAParsePaymasterDataV7.paymasterData;
        }
        return aAParsePaymasterDataV7.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAParsePaymasterDataV7 copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new AAParsePaymasterDataV7(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AAParsePaymasterDataV7)) {
            return false;
        }
        AAParsePaymasterDataV7 aAParsePaymasterDataV7 = (AAParsePaymasterDataV7) obj;
        return Intrinsics.EZpvd((Object) this.paymaster, (Object) aAParsePaymasterDataV7.paymaster) && Intrinsics.EZpvd((Object) this.paymasterPostOpGasLimit, (Object) aAParsePaymasterDataV7.paymasterPostOpGasLimit) && Intrinsics.EZpvd((Object) this.paymasterVerificationGasLimit, (Object) aAParsePaymasterDataV7.paymasterVerificationGasLimit) && Intrinsics.EZpvd((Object) this.paymasterData, (Object) aAParsePaymasterDataV7.paymasterData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymaster() {
        return this.paymaster;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterData() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterPostOpGasLimit() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterVerificationGasLimit() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.paymaster.hashCode() * 31) + this.paymasterPostOpGasLimit.hashCode()) * 31) + this.paymasterVerificationGasLimit.hashCode()) * 31) + this.paymasterData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymaster(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymaster = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymasterData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterPostOpGasLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymasterPostOpGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterVerificationGasLimit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymasterVerificationGasLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAParsePaymasterDataV7(paymaster=" + this.paymaster + ", paymasterPostOpGasLimit=" + this.paymasterPostOpGasLimit + ", paymasterVerificationGasLimit=" + this.paymasterVerificationGasLimit + ", paymasterData=" + this.paymasterData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.aa.AAParsePaymasterDataV7.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAParsePaymasterDataV7> serializer() {
            return AAParsePaymasterDataV7$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAParsePaymasterDataV7(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, AAParsePaymasterDataV7$$serializer.INSTANCE.getDescriptor());
        }
        this.paymaster = str;
        this.paymasterPostOpGasLimit = str2;
        this.paymasterVerificationGasLimit = str3;
        this.paymasterData = str4;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(AAParsePaymasterDataV7 aAParsePaymasterDataV7, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aAParsePaymasterDataV7.paymaster);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aAParsePaymasterDataV7.paymasterPostOpGasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, aAParsePaymasterDataV7.paymasterVerificationGasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aAParsePaymasterDataV7.paymasterData);
    }

    public AAParsePaymasterDataV7(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.paymaster = str;
        this.paymasterPostOpGasLimit = str2;
        this.paymasterVerificationGasLimit = str3;
        this.paymasterData = str4;
    }
}
