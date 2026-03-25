package com.okinc.wallet.core.sign.ark;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class ARKSignedTx {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int amount;
    private final int expiration;
    private final int fee;
    private final String id;
    private final int network;
    private final String nonce;
    private final String recipientId;
    private final String senderPublicKey;
    private final String signature;
    private final int type;
    private final int typeGroup;
    private final int version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.senderPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.typeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.recipientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ARKSignedTx copy(int i, int i2, int i3, @NotNull String str, int i4, int i5, @NotNull String str2, int i6, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ARKSignedTx(i, i2, i3, str, i4, i5, str2, i6, str3, str4, str5, i7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ARKSignedTx)) {
            return false;
        }
        ARKSignedTx aRKSignedTx = (ARKSignedTx) obj;
        return this.version == aRKSignedTx.version && this.type == aRKSignedTx.type && this.typeGroup == aRKSignedTx.typeGroup && Intrinsics.EZpvd((Object) this.nonce, (Object) aRKSignedTx.nonce) && this.amount == aRKSignedTx.amount && this.fee == aRKSignedTx.fee && Intrinsics.EZpvd((Object) this.recipientId, (Object) aRKSignedTx.recipientId) && this.network == aRKSignedTx.network && Intrinsics.EZpvd((Object) this.signature, (Object) aRKSignedTx.signature) && Intrinsics.EZpvd((Object) this.senderPublicKey, (Object) aRKSignedTx.senderPublicKey) && Intrinsics.EZpvd((Object) this.id, (Object) aRKSignedTx.id) && this.expiration == aRKSignedTx.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getExpiration() {
        return this.expiration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecipientId() {
        return this.recipientId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSenderPublicKey() {
        return this.senderPublicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTypeGroup() {
        return this.typeGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVersion() {
        return this.version;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((Integer.hashCode(this.version) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.typeGroup)) * 31) + this.nonce.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31) + Integer.hashCode(this.fee)) * 31) + this.recipientId.hashCode()) * 31) + Integer.hashCode(this.network)) * 31) + this.signature.hashCode()) * 31) + this.senderPublicKey.hashCode()) * 31) + this.id.hashCode()) * 31) + Integer.hashCode(this.expiration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ARKSignedTx(version=" + this.version + ", type=" + this.type + ", typeGroup=" + this.typeGroup + ", nonce=" + this.nonce + ", amount=" + this.amount + ", fee=" + this.fee + ", recipientId=" + this.recipientId + ", network=" + this.network + ", signature=" + this.signature + ", senderPublicKey=" + this.senderPublicKey + ", id=" + this.id + ", expiration=" + this.expiration + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.ark.ARKSignedTx.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ARKSignedTx> serializer() {
            return ARKSignedTx$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ARKSignedTx(int i, int i2, int i3, int i4, String str, int i5, int i6, String str2, int i7, String str3, String str4, String str5, int i8, SerializationConstructorMarker serializationConstructorMarker) {
        if (4095 != (i & 4095)) {
            PluginExceptionsKt.throwMissingFieldException(i, 4095, ARKSignedTx$$serializer.INSTANCE.getDescriptor());
        }
        this.version = i2;
        this.type = i3;
        this.typeGroup = i4;
        this.nonce = str;
        this.amount = i5;
        this.fee = i6;
        this.recipientId = str2;
        this.network = i7;
        this.signature = str3;
        this.senderPublicKey = str4;
        this.id = str5;
        this.expiration = i8;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ARKSignedTx aRKSignedTx, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, aRKSignedTx.version);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, aRKSignedTx.type);
        compositeEncoder.encodeIntElement(serialDescriptor, 2, aRKSignedTx.typeGroup);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, aRKSignedTx.nonce);
        compositeEncoder.encodeIntElement(serialDescriptor, 4, aRKSignedTx.amount);
        compositeEncoder.encodeIntElement(serialDescriptor, 5, aRKSignedTx.fee);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, aRKSignedTx.recipientId);
        compositeEncoder.encodeIntElement(serialDescriptor, 7, aRKSignedTx.network);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, aRKSignedTx.signature);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, aRKSignedTx.senderPublicKey);
        compositeEncoder.encodeStringElement(serialDescriptor, 10, aRKSignedTx.id);
        compositeEncoder.encodeIntElement(serialDescriptor, 11, aRKSignedTx.expiration);
    }

    public ARKSignedTx(int i, int i2, int i3, @NotNull String str, int i4, int i5, @NotNull String str2, int i6, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.version = i;
        this.type = i2;
        this.typeGroup = i3;
        this.nonce = str;
        this.amount = i4;
        this.fee = i5;
        this.recipientId = str2;
        this.network = i6;
        this.signature = str3;
        this.senderPublicKey = str4;
        this.id = str5;
        this.expiration = i7;
    }
}
