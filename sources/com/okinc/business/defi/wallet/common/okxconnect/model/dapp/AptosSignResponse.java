package com.okinc.business.defi.wallet.common.okxconnect.model.dapp;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class AptosSignResponse {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String address;
    private final String application;
    private final long chainId;
    private final String fullMessage;
    private final String message;
    private final String nonce;
    private final String prefix;
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fullMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosSignResponse copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new AptosSignResponse(str, str2, j, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AptosSignResponse)) {
            return false;
        }
        AptosSignResponse aptosSignResponse = (AptosSignResponse) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) aptosSignResponse.address) && Intrinsics.EZpvd((Object) this.application, (Object) aptosSignResponse.application) && this.chainId == aptosSignResponse.chainId && Intrinsics.EZpvd((Object) this.fullMessage, (Object) aptosSignResponse.fullMessage) && Intrinsics.EZpvd((Object) this.message, (Object) aptosSignResponse.message) && Intrinsics.EZpvd((Object) this.nonce, (Object) aptosSignResponse.nonce) && Intrinsics.EZpvd((Object) this.prefix, (Object) aptosSignResponse.prefix) && Intrinsics.EZpvd((Object) this.signature, (Object) aptosSignResponse.signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApplication() {
        return this.application;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullMessage() {
        return this.fullMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrefix() {
        return this.prefix;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.address.hashCode() * 31) + this.application.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + this.fullMessage.hashCode()) * 31) + this.message.hashCode()) * 31) + this.nonce.hashCode()) * 31) + this.prefix.hashCode()) * 31) + this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosSignResponse(address=" + this.address + ", application=" + this.application + ", chainId=" + this.chainId + ", fullMessage=" + this.fullMessage + ", message=" + this.message + ", nonce=" + this.nonce + ", prefix=" + this.prefix + ", signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.common.okxconnect.model.dapp.AptosSignResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosSignResponse> serializer() {
            return AptosSignResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosSignResponse(int i, String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, AptosSignResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.address = str;
        this.application = str2;
        this.chainId = j;
        this.fullMessage = str3;
        this.message = str4;
        this.nonce = str5;
        this.prefix = str6;
        this.signature = str7;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(AptosSignResponse aptosSignResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aptosSignResponse.address);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aptosSignResponse.application);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, aptosSignResponse.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aptosSignResponse.fullMessage);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, aptosSignResponse.message);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, aptosSignResponse.nonce);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, aptosSignResponse.prefix);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, aptosSignResponse.signature);
    }

    public AptosSignResponse(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.address = str;
        this.application = str2;
        this.chainId = j;
        this.fullMessage = str3;
        this.message = str4;
        this.nonce = str5;
        this.prefix = str6;
        this.signature = str7;
    }
}
