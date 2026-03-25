package com.okinc.business.web3pay.lib.features.uop.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class PasskeyStatus {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String credentialId;
    private final boolean deployed;
    private final String passkey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyStatus copy$default(PasskeyStatus passkeyStatus, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyStatus.passkey;
        }
        if ((i & 2) != 0) {
            str2 = passkeyStatus.credentialId;
        }
        if ((i & 4) != 0) {
            z = passkeyStatus.deployed;
        }
        return passkeyStatus.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.passkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.credentialId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.deployed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyStatus copy(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new PasskeyStatus(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyStatus)) {
            return false;
        }
        PasskeyStatus passkeyStatus = (PasskeyStatus) obj;
        return Intrinsics.EZpvd((Object) this.passkey, (Object) passkeyStatus.passkey) && Intrinsics.EZpvd((Object) this.credentialId, (Object) passkeyStatus.credentialId) && this.deployed == passkeyStatus.deployed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCredentialId() {
        return this.credentialId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDeployed() {
        return this.deployed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPasskey() {
        return this.passkey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.passkey.hashCode() * 31) + this.credentialId.hashCode()) * 31) + Boolean.hashCode(this.deployed);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyStatus(passkey=" + this.passkey + ", credentialId=" + this.credentialId + ", deployed=" + this.deployed + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.uop.model.PasskeyStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PasskeyStatus> serializer() {
            return PasskeyStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PasskeyStatus(int i, String str, String str2, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, PasskeyStatus$$serializer.INSTANCE.getDescriptor());
        }
        this.passkey = str;
        this.credentialId = str2;
        this.deployed = z;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(PasskeyStatus passkeyStatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, passkeyStatus.passkey);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, passkeyStatus.credentialId);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 2, passkeyStatus.deployed);
    }

    public PasskeyStatus(@NotNull String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.passkey = str;
        this.credentialId = str2;
        this.deployed = z;
    }
}
