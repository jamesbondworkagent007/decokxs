package com.okinc.auth.impl.passkey.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class FinishInHouseAuthenticationRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String crossDevicePasskeySessionId;
    public final UnlockTokenWithFidoRequestBody passkeyString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FinishInHouseAuthenticationRequest copy$default(FinishInHouseAuthenticationRequest finishInHouseAuthenticationRequest, String str, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, int i, Object obj) {
        if ((i & 1) != 0) {
            str = finishInHouseAuthenticationRequest.crossDevicePasskeySessionId;
        }
        if ((i & 2) != 0) {
            unlockTokenWithFidoRequestBody = finishInHouseAuthenticationRequest.passkeyString;
        }
        return finishInHouseAuthenticationRequest.AEQbTJ(str, unlockTokenWithFidoRequestBody);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FinishInHouseAuthenticationRequest AEQbTJ(@NotNull String str, @NotNull UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(unlockTokenWithFidoRequestBody, "");
        return new FinishInHouseAuthenticationRequest(str, unlockTokenWithFidoRequestBody);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinishInHouseAuthenticationRequest)) {
            return false;
        }
        FinishInHouseAuthenticationRequest finishInHouseAuthenticationRequest = (FinishInHouseAuthenticationRequest) obj;
        return Intrinsics.EZpvd((Object) this.crossDevicePasskeySessionId, (Object) finishInHouseAuthenticationRequest.crossDevicePasskeySessionId) && Intrinsics.EZpvd(this.passkeyString, finishInHouseAuthenticationRequest.passkeyString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.crossDevicePasskeySessionId.hashCode() * 31) + this.passkeyString.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FinishInHouseAuthenticationRequest(crossDevicePasskeySessionId=" + this.crossDevicePasskeySessionId + ", passkeyString=" + this.passkeyString + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.passkey.model.FinishInHouseAuthenticationRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinishInHouseAuthenticationRequest> serializer() {
            return FinishInHouseAuthenticationRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinishInHouseAuthenticationRequest(int i, String str, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FinishInHouseAuthenticationRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.crossDevicePasskeySessionId = str;
        this.passkeyString = unlockTokenWithFidoRequestBody;
    }

    public static final /* synthetic */ void AEQbTJ(FinishInHouseAuthenticationRequest finishInHouseAuthenticationRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, finishInHouseAuthenticationRequest.crossDevicePasskeySessionId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE, finishInHouseAuthenticationRequest.passkeyString);
    }

    public FinishInHouseAuthenticationRequest(@NotNull String str, @NotNull UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(unlockTokenWithFidoRequestBody, "");
        this.crossDevicePasskeySessionId = str;
        this.passkeyString = unlockTokenWithFidoRequestBody;
    }
}
