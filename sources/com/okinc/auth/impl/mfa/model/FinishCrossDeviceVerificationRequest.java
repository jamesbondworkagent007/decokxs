package com.okinc.auth.impl.mfa.model;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class FinishCrossDeviceVerificationRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String challenge;
    private final String targetCredentialId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FinishCrossDeviceVerificationRequest copy$default(FinishCrossDeviceVerificationRequest finishCrossDeviceVerificationRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = finishCrossDeviceVerificationRequest.challenge;
        }
        if ((i & 2) != 0) {
            str2 = finishCrossDeviceVerificationRequest.targetCredentialId;
        }
        return finishCrossDeviceVerificationRequest.copy(str, str2);
    }

    @SerialName(ClientData.KEY_CHALLENGE)
    public static /* synthetic */ void getChallenge$annotations() {
    }

    @SerialName("targetCredentialId")
    public static /* synthetic */ void getTargetCredentialId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.targetCredentialId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FinishCrossDeviceVerificationRequest copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FinishCrossDeviceVerificationRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinishCrossDeviceVerificationRequest)) {
            return false;
        }
        FinishCrossDeviceVerificationRequest finishCrossDeviceVerificationRequest = (FinishCrossDeviceVerificationRequest) obj;
        return Intrinsics.EZpvd((Object) this.challenge, (Object) finishCrossDeviceVerificationRequest.challenge) && Intrinsics.EZpvd((Object) this.targetCredentialId, (Object) finishCrossDeviceVerificationRequest.targetCredentialId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetCredentialId() {
        return this.targetCredentialId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.challenge.hashCode() * 31) + this.targetCredentialId.hashCode();
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.FinishCrossDeviceVerificationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinishCrossDeviceVerificationRequest> serializer() {
            return FinishCrossDeviceVerificationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinishCrossDeviceVerificationRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FinishCrossDeviceVerificationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.challenge = str;
        this.targetCredentialId = str2;
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(FinishCrossDeviceVerificationRequest finishCrossDeviceVerificationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, finishCrossDeviceVerificationRequest.challenge);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, finishCrossDeviceVerificationRequest.targetCredentialId);
    }

    public FinishCrossDeviceVerificationRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.challenge = str;
        this.targetCredentialId = str2;
    }

    public String toString() {
        return "CrossDeviceVerificationResultRequest(challenge=" + this.challenge + ", targetCredentialId=" + this.targetCredentialId + ")";
    }
}
