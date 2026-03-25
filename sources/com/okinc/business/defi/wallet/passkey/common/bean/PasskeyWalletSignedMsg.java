package com.okinc.business.defi.wallet.passkey.common.bean;

import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class PasskeyWalletSignedMsg {
    private final PasskeyAuthenticateResponse responseJson;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = PasskeyAuthenticateResponse.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyWalletSignedMsg copy$default(PasskeyWalletSignedMsg passkeyWalletSignedMsg, PasskeyAuthenticateResponse passkeyAuthenticateResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyAuthenticateResponse = passkeyWalletSignedMsg.responseJson;
        }
        return passkeyWalletSignedMsg.copy(passkeyAuthenticateResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateResponse component1() {
        return this.responseJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletSignedMsg copy(PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
        return new PasskeyWalletSignedMsg(passkeyAuthenticateResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PasskeyWalletSignedMsg) && Intrinsics.EZpvd(this.responseJson, ((PasskeyWalletSignedMsg) obj).responseJson);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateResponse getResponseJson() {
        return this.responseJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PasskeyAuthenticateResponse passkeyAuthenticateResponse = this.responseJson;
        if (passkeyAuthenticateResponse == null) {
            return 0;
        }
        return passkeyAuthenticateResponse.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletSignedMsg(responseJson=" + this.responseJson + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletSignedMsg> serializer() {
            return PasskeyWalletSignedMsg$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletSignedMsg(int i, PasskeyAuthenticateResponse passkeyAuthenticateResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PasskeyWalletSignedMsg$$serializer.INSTANCE.getDescriptor());
        }
        this.responseJson = passkeyAuthenticateResponse;
    }

    public PasskeyWalletSignedMsg(PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
        this.responseJson = passkeyAuthenticateResponse;
    }
}
