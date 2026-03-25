package com.okinc.business.defi.wallet.passkey.common.bean;

import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest$$serializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class PasskeyWalletCreateUopRes {
    private final Integer promptType;
    private final PasskeyAuthenticateRequest serverOption;
    private final String uopHash;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = PasskeyAuthenticateRequest.$stable;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyWalletCreateUopRes copy$default(PasskeyWalletCreateUopRes passkeyWalletCreateUopRes, PasskeyAuthenticateRequest passkeyAuthenticateRequest, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyAuthenticateRequest = passkeyWalletCreateUopRes.serverOption;
        }
        if ((i & 2) != 0) {
            str = passkeyWalletCreateUopRes.uopHash;
        }
        if ((i & 4) != 0) {
            num = passkeyWalletCreateUopRes.promptType;
        }
        return passkeyWalletCreateUopRes.copy(passkeyAuthenticateRequest, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateRequest component1() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyWalletCreateUopRes copy(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new PasskeyWalletCreateUopRes(passkeyAuthenticateRequest, str, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyWalletCreateUopRes)) {
            return false;
        }
        PasskeyWalletCreateUopRes passkeyWalletCreateUopRes = (PasskeyWalletCreateUopRes) obj;
        return Intrinsics.EZpvd(this.serverOption, passkeyWalletCreateUopRes.serverOption) && Intrinsics.EZpvd((Object) this.uopHash, (Object) passkeyWalletCreateUopRes.uopHash) && Intrinsics.EZpvd(this.promptType, passkeyWalletCreateUopRes.promptType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPromptType() {
        return this.promptType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateRequest getServerOption() {
        return this.serverOption;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUopHash() {
        return this.uopHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.serverOption.hashCode();
        int iHashCode2 = this.uopHash.hashCode();
        Integer num = this.promptType;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyWalletCreateUopRes(serverOption=" + this.serverOption + ", uopHash=" + this.uopHash + ", promptType=" + this.promptType + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyWalletCreateUopRes> serializer() {
            return PasskeyWalletCreateUopRes$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyWalletCreateUopRes(int i, PasskeyAuthenticateRequest passkeyAuthenticateRequest, String str, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PasskeyWalletCreateUopRes$$serializer.INSTANCE.getDescriptor());
        }
        this.serverOption = passkeyAuthenticateRequest;
        this.uopHash = str;
        if ((i & 4) == 0) {
            this.promptType = 0;
        } else {
            this.promptType = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(PasskeyWalletCreateUopRes passkeyWalletCreateUopRes, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, PasskeyAuthenticateRequest$$serializer.INSTANCE, passkeyWalletCreateUopRes.serverOption);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, passkeyWalletCreateUopRes.uopHash);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (num = passkeyWalletCreateUopRes.promptType) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, passkeyWalletCreateUopRes.promptType);
        }
    }

    public PasskeyWalletCreateUopRes(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull String str, Integer num) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.serverOption = passkeyAuthenticateRequest;
        this.uopHash = str;
        this.promptType = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 com.okinc.auth.api.passkey.PasskeyAuthenticateRequest)
  (r2v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 java.lang.Integer))
 A[MD:(com.okinc.auth.api.passkey.PasskeyAuthenticateRequest, java.lang.String, java.lang.Integer):void (m)] (LINE:120) call: com.okinc.business.defi.wallet.passkey.common.bean.PasskeyWalletCreateUopRes.<init>(com.okinc.auth.api.passkey.PasskeyAuthenticateRequest, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ PasskeyWalletCreateUopRes(PasskeyAuthenticateRequest passkeyAuthenticateRequest, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(passkeyAuthenticateRequest, str, (i & 4) != 0 ? 0 : num);
    }
}
