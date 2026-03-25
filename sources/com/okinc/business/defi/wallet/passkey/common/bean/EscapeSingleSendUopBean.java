package com.okinc.business.defi.wallet.passkey.common.bean;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
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
public final class EscapeSingleSendUopBean {
    private final PasskeyWalletSignedMsg signedMsg;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = PasskeyAuthenticateResponse.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeSingleSendUopBean copy$default(EscapeSingleSendUopBean escapeSingleSendUopBean, PasskeyWalletSignedMsg passkeyWalletSignedMsg, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyWalletSignedMsg = escapeSingleSendUopBean.signedMsg;
        }
        if ((i & 2) != 0) {
            str = escapeSingleSendUopBean.uopHash;
        }
        return escapeSingleSendUopBean.copy(passkeyWalletSignedMsg, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletSignedMsg component1() {
        return this.signedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeSingleSendUopBean copy(PasskeyWalletSignedMsg passkeyWalletSignedMsg, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EscapeSingleSendUopBean(passkeyWalletSignedMsg, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EscapeSingleSendUopBean)) {
            return false;
        }
        EscapeSingleSendUopBean escapeSingleSendUopBean = (EscapeSingleSendUopBean) obj;
        return Intrinsics.EZpvd(this.signedMsg, escapeSingleSendUopBean.signedMsg) && Intrinsics.EZpvd((Object) this.uopHash, (Object) escapeSingleSendUopBean.uopHash);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletSignedMsg getSignedMsg() {
        return this.signedMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PasskeyWalletSignedMsg passkeyWalletSignedMsg = this.signedMsg;
        return ((passkeyWalletSignedMsg == null ? 0 : passkeyWalletSignedMsg.hashCode()) * 31) + this.uopHash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeSingleSendUopBean(signedMsg=" + this.signedMsg + ", uopHash=" + this.uopHash + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.EscapeSingleSendUopBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EscapeSingleSendUopBean> serializer() {
            return EscapeSingleSendUopBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EscapeSingleSendUopBean(int i, PasskeyWalletSignedMsg passkeyWalletSignedMsg, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EscapeSingleSendUopBean$$serializer.INSTANCE.getDescriptor());
        }
        this.signedMsg = passkeyWalletSignedMsg;
        this.uopHash = str;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EscapeSingleSendUopBean escapeSingleSendUopBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PasskeyWalletSignedMsg$$serializer.INSTANCE, escapeSingleSendUopBean.signedMsg);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, escapeSingleSendUopBean.uopHash);
    }

    public EscapeSingleSendUopBean(PasskeyWalletSignedMsg passkeyWalletSignedMsg, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signedMsg = passkeyWalletSignedMsg;
        this.uopHash = str;
    }
}
