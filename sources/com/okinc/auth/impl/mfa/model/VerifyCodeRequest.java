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
public final class VerifyCodeRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String code;
    public final String sendType;
    public final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyCodeRequest copy$default(VerifyCodeRequest verifyCodeRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyCodeRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = verifyCodeRequest.code;
        }
        if ((i & 4) != 0) {
            str3 = verifyCodeRequest.sendType;
        }
        return verifyCodeRequest.EZpvd(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyCodeRequest EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new VerifyCodeRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyCodeRequest)) {
            return false;
        }
        VerifyCodeRequest verifyCodeRequest = (VerifyCodeRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) verifyCodeRequest.sessionId) && Intrinsics.EZpvd((Object) this.code, (Object) verifyCodeRequest.code) && Intrinsics.EZpvd((Object) this.sendType, (Object) verifyCodeRequest.sendType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + this.code.hashCode()) * 31) + this.sendType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyCodeRequest(sessionId=" + this.sessionId + ", code=" + this.code + ", sendType=" + this.sendType + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.VerifyCodeRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VerifyCodeRequest> serializer() {
            return VerifyCodeRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerifyCodeRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, VerifyCodeRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.code = str2;
        this.sendType = str3;
    }

    public static final /* synthetic */ void AEQbTJ(VerifyCodeRequest verifyCodeRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, verifyCodeRequest.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, verifyCodeRequest.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, verifyCodeRequest.sendType);
    }

    public VerifyCodeRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sessionId = str;
        this.code = str2;
        this.sendType = str3;
    }
}
