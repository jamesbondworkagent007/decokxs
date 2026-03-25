package com.okinc.auth.impl.mfa.model;

import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody;
import com.okinc.auth.impl.passkey.model.UnlockTokenWithFidoRequestBody$$serializer;
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
public final class FinishAuthPasskeyRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final UnlockTokenWithFidoRequestBody passkeyString;
    public final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FinishAuthPasskeyRequest copy$default(FinishAuthPasskeyRequest finishAuthPasskeyRequest, String str, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, int i, Object obj) {
        if ((i & 1) != 0) {
            str = finishAuthPasskeyRequest.sessionId;
        }
        if ((i & 2) != 0) {
            unlockTokenWithFidoRequestBody = finishAuthPasskeyRequest.passkeyString;
        }
        return finishAuthPasskeyRequest.copydefault(str, unlockTokenWithFidoRequestBody);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FinishAuthPasskeyRequest copydefault(@NotNull String str, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FinishAuthPasskeyRequest(str, unlockTokenWithFidoRequestBody);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinishAuthPasskeyRequest)) {
            return false;
        }
        FinishAuthPasskeyRequest finishAuthPasskeyRequest = (FinishAuthPasskeyRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) finishAuthPasskeyRequest.sessionId) && Intrinsics.EZpvd(this.passkeyString, finishAuthPasskeyRequest.passkeyString);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.sessionId.hashCode();
        UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody = this.passkeyString;
        return (iHashCode * 31) + (unlockTokenWithFidoRequestBody == null ? 0 : unlockTokenWithFidoRequestBody.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FinishAuthPasskeyRequest(sessionId=" + this.sessionId + ", passkeyString=" + this.passkeyString + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.FinishAuthPasskeyRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FinishAuthPasskeyRequest> serializer() {
            return FinishAuthPasskeyRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FinishAuthPasskeyRequest(int i, String str, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, FinishAuthPasskeyRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.passkeyString = unlockTokenWithFidoRequestBody;
    }

    public static final /* synthetic */ void KWHzl(FinishAuthPasskeyRequest finishAuthPasskeyRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, finishAuthPasskeyRequest.sessionId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, UnlockTokenWithFidoRequestBody$$serializer.INSTANCE, finishAuthPasskeyRequest.passkeyString);
    }

    public FinishAuthPasskeyRequest(@NotNull String str, UnlockTokenWithFidoRequestBody unlockTokenWithFidoRequestBody) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
        this.passkeyString = unlockTokenWithFidoRequestBody;
    }
}
