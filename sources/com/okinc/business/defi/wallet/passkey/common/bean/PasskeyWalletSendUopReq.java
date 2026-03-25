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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PasskeyWalletSendUopReq {
    private final int accountType;
    private final PasskeyWalletSignedMsg signedMsg;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = PasskeyAuthenticateResponse.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyWalletSendUopReq copy$default(PasskeyWalletSendUopReq passkeyWalletSendUopReq, PasskeyWalletSignedMsg passkeyWalletSignedMsg, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            passkeyWalletSignedMsg = passkeyWalletSendUopReq.signedMsg;
        }
        if ((i2 & 2) != 0) {
            str = passkeyWalletSendUopReq.uopHash;
        }
        if ((i2 & 4) != 0) {
            i = passkeyWalletSendUopReq.accountType;
        }
        return passkeyWalletSendUopReq.copy(passkeyWalletSignedMsg, str, i);
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
    public final int component3() {
        return this.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletSendUopReq copy(PasskeyWalletSignedMsg passkeyWalletSignedMsg, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyWalletSendUopReq(passkeyWalletSignedMsg, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWalletSendUopReq)) {
            return false;
        }
        PasskeyWalletSendUopReq passkeyWalletSendUopReq = (PasskeyWalletSendUopReq) obj;
        return Intrinsics.EZpvd(this.signedMsg, passkeyWalletSendUopReq.signedMsg) && Intrinsics.EZpvd((Object) this.uopHash, (Object) passkeyWalletSendUopReq.uopHash) && this.accountType == passkeyWalletSendUopReq.accountType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAccountType() {
        return this.accountType;
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
        return ((((passkeyWalletSignedMsg == null ? 0 : passkeyWalletSignedMsg.hashCode()) * 31) + this.uopHash.hashCode()) * 31) + Integer.hashCode(this.accountType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletSendUopReq(signedMsg=" + this.signedMsg + ", uopHash=" + this.uopHash + ", accountType=" + this.accountType + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletSendUopReq> serializer() {
            return PasskeyWalletSendUopReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletSendUopReq(int i, PasskeyWalletSignedMsg passkeyWalletSignedMsg, String str, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PasskeyWalletSendUopReq$$serializer.INSTANCE.getDescriptor());
        }
        this.signedMsg = passkeyWalletSignedMsg;
        this.uopHash = str;
        if ((i & 4) == 0) {
            this.accountType = 2;
        } else {
            this.accountType = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PasskeyWalletSendUopReq passkeyWalletSendUopReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, PasskeyWalletSignedMsg$$serializer.INSTANCE, passkeyWalletSendUopReq.signedMsg);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, passkeyWalletSendUopReq.uopHash);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && passkeyWalletSendUopReq.accountType == 2) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 2, passkeyWalletSendUopReq.accountType);
    }

    public PasskeyWalletSendUopReq(PasskeyWalletSignedMsg passkeyWalletSignedMsg, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signedMsg = passkeyWalletSignedMsg;
        this.uopHash = str;
        this.accountType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg)
  (r2v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r3v0 int))
 A[MD:(com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg, java.lang.String, int):void (m)] (LINE:128) call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSendUopReq.<init>(com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletSignedMsg, java.lang.String, int):void type: THIS */
    public /* synthetic */ PasskeyWalletSendUopReq(PasskeyWalletSignedMsg passkeyWalletSignedMsg, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyWalletSignedMsg, str, (i2 & 4) != 0 ? 2 : i);
    }
}
