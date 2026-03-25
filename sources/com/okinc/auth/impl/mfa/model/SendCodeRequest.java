package com.okinc.auth.impl.mfa.model;

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
public final class SendCodeRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String sendType;
    public final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SendCodeRequest copy$default(SendCodeRequest sendCodeRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendCodeRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = sendCodeRequest.sendType;
        }
        return sendCodeRequest.AEQbTJ(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SendCodeRequest AEQbTJ(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SendCodeRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendCodeRequest)) {
            return false;
        }
        SendCodeRequest sendCodeRequest = (SendCodeRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) sendCodeRequest.sessionId) && Intrinsics.EZpvd((Object) this.sendType, (Object) sendCodeRequest.sendType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.sessionId.hashCode() * 31) + this.sendType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SendCodeRequest(sessionId=" + this.sessionId + ", sendType=" + this.sendType + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.SendCodeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SendCodeRequest> serializer() {
            return SendCodeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SendCodeRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, SendCodeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.sendType = str2;
    }

    public static final /* synthetic */ void copydefault(SendCodeRequest sendCodeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, sendCodeRequest.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, sendCodeRequest.sendType);
    }

    public SendCodeRequest(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.sessionId = str;
        this.sendType = str2;
    }
}
