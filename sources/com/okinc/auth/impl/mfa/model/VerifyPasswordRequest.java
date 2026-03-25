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
public final class VerifyPasswordRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String hashedPwd;
    public final String pwd;
    public final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VerifyPasswordRequest copy$default(VerifyPasswordRequest verifyPasswordRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = verifyPasswordRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = verifyPasswordRequest.pwd;
        }
        if ((i & 4) != 0) {
            str3 = verifyPasswordRequest.hashedPwd;
        }
        return verifyPasswordRequest.copydefault(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VerifyPasswordRequest copydefault(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new VerifyPasswordRequest(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPasswordRequest)) {
            return false;
        }
        VerifyPasswordRequest verifyPasswordRequest = (VerifyPasswordRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) verifyPasswordRequest.sessionId) && Intrinsics.EZpvd((Object) this.pwd, (Object) verifyPasswordRequest.pwd) && Intrinsics.EZpvd((Object) this.hashedPwd, (Object) verifyPasswordRequest.hashedPwd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.sessionId.hashCode() * 31) + this.pwd.hashCode()) * 31) + this.hashedPwd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VerifyPasswordRequest(sessionId=" + this.sessionId + ", pwd=" + this.pwd + ", hashedPwd=" + this.hashedPwd + ")";
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.mfa.model.VerifyPasswordRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<VerifyPasswordRequest> serializer() {
            return VerifyPasswordRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ VerifyPasswordRequest(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, VerifyPasswordRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.pwd = str2;
        this.hashedPwd = str3;
    }

    public static final /* synthetic */ void AEQbTJ(VerifyPasswordRequest verifyPasswordRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, verifyPasswordRequest.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, verifyPasswordRequest.pwd);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, verifyPasswordRequest.hashedPwd);
    }

    public VerifyPasswordRequest(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.sessionId = str;
        this.pwd = str2;
        this.hashedPwd = str3;
    }
}
