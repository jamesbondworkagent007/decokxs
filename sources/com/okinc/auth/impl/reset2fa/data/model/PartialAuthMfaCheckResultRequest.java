package com.okinc.auth.impl.reset2fa.data.model;

import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PartialAuthMfaCheckResultRequest implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sessionId;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PartialAuthMfaCheckResultRequest copy$default(PartialAuthMfaCheckResultRequest partialAuthMfaCheckResultRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partialAuthMfaCheckResultRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = partialAuthMfaCheckResultRequest.token;
        }
        return partialAuthMfaCheckResultRequest.copy(str, str2);
    }

    @SerialName(OtcExtraKeys.SESSIONID)
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @SerialName("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PartialAuthMfaCheckResultRequest copy(String str, String str2) {
        return new PartialAuthMfaCheckResultRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialAuthMfaCheckResultRequest)) {
            return false;
        }
        PartialAuthMfaCheckResultRequest partialAuthMfaCheckResultRequest = (PartialAuthMfaCheckResultRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) partialAuthMfaCheckResultRequest.sessionId) && Intrinsics.EZpvd((Object) this.token, (Object) partialAuthMfaCheckResultRequest.token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.sessionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.token;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PartialAuthMfaCheckResultRequest(sessionId=" + this.sessionId + ", token=" + this.token + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartialAuthMfaCheckResultRequest> serializer() {
            return PartialAuthMfaCheckResultRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartialAuthMfaCheckResultRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PartialAuthMfaCheckResultRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.token = str2;
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_impl(PartialAuthMfaCheckResultRequest partialAuthMfaCheckResultRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, partialAuthMfaCheckResultRequest.sessionId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, partialAuthMfaCheckResultRequest.token);
    }

    public PartialAuthMfaCheckResultRequest(String str, String str2) {
        this.sessionId = str;
        this.token = str2;
    }
}
