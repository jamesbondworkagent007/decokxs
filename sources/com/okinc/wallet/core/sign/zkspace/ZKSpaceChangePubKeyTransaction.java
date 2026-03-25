package com.okinc.wallet.core.sign.zkspace;

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
public final class ZKSpaceChangePubKeyTransaction {
    private String accountId;
    private String from;
    private String nonce;
    private String type;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ZKSpaceChangePubKeyTransaction copy$default(ZKSpaceChangePubKeyTransaction zKSpaceChangePubKeyTransaction, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = zKSpaceChangePubKeyTransaction.type;
        }
        if ((i & 2) != 0) {
            str2 = zKSpaceChangePubKeyTransaction.accountId;
        }
        if ((i & 4) != 0) {
            str3 = zKSpaceChangePubKeyTransaction.from;
        }
        if ((i & 8) != 0) {
            str4 = zKSpaceChangePubKeyTransaction.nonce;
        }
        return zKSpaceChangePubKeyTransaction.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ZKSpaceChangePubKeyTransaction copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ZKSpaceChangePubKeyTransaction(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZKSpaceChangePubKeyTransaction)) {
            return false;
        }
        ZKSpaceChangePubKeyTransaction zKSpaceChangePubKeyTransaction = (ZKSpaceChangePubKeyTransaction) obj;
        return Intrinsics.EZpvd((Object) this.type, (Object) zKSpaceChangePubKeyTransaction.type) && Intrinsics.EZpvd((Object) this.accountId, (Object) zKSpaceChangePubKeyTransaction.accountId) && Intrinsics.EZpvd((Object) this.from, (Object) zKSpaceChangePubKeyTransaction.from) && Intrinsics.EZpvd((Object) this.nonce, (Object) zKSpaceChangePubKeyTransaction.nonce);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrom() {
        return this.from;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNonce() {
        return this.nonce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.type.hashCode() * 31) + this.accountId.hashCode()) * 31) + this.from.hashCode()) * 31) + this.nonce.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFrom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.from = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNonce(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nonce = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.type = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ZKSpaceChangePubKeyTransaction(type=" + this.type + ", accountId=" + this.accountId + ", from=" + this.from + ", nonce=" + this.nonce + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.zkspace.ZKSpaceChangePubKeyTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ZKSpaceChangePubKeyTransaction> serializer() {
            return ZKSpaceChangePubKeyTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ZKSpaceChangePubKeyTransaction(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, ZKSpaceChangePubKeyTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.type = str;
        this.accountId = str2;
        this.from = str3;
        this.nonce = str4;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(ZKSpaceChangePubKeyTransaction zKSpaceChangePubKeyTransaction, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, zKSpaceChangePubKeyTransaction.type);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, zKSpaceChangePubKeyTransaction.accountId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, zKSpaceChangePubKeyTransaction.from);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, zKSpaceChangePubKeyTransaction.nonce);
    }

    public ZKSpaceChangePubKeyTransaction(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.type = str;
        this.accountId = str2;
        this.from = str3;
        this.nonce = str4;
    }
}
