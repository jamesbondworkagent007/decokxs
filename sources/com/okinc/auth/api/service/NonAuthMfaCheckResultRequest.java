package com.okinc.auth.api.service;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class NonAuthMfaCheckResultRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String sessionId;
    public final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NonAuthMfaCheckResultRequest copy$default(NonAuthMfaCheckResultRequest nonAuthMfaCheckResultRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonAuthMfaCheckResultRequest.token;
        }
        if ((i & 2) != 0) {
            str2 = nonAuthMfaCheckResultRequest.sessionId;
        }
        return nonAuthMfaCheckResultRequest.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonAuthMfaCheckResultRequest EZpvd(String str, String str2) {
        return new NonAuthMfaCheckResultRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NonAuthMfaCheckResultRequest)) {
            return false;
        }
        NonAuthMfaCheckResultRequest nonAuthMfaCheckResultRequest = (NonAuthMfaCheckResultRequest) obj;
        return Intrinsics.EZpvd((Object) this.token, (Object) nonAuthMfaCheckResultRequest.token) && Intrinsics.EZpvd((Object) this.sessionId, (Object) nonAuthMfaCheckResultRequest.sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.token;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sessionId;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NonAuthMfaCheckResultRequest(token=" + this.token + ", sessionId=" + this.sessionId + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.service.NonAuthMfaCheckResultRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NonAuthMfaCheckResultRequest> serializer() {
            return NonAuthMfaCheckResultRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NonAuthMfaCheckResultRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, NonAuthMfaCheckResultRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
        this.sessionId = str2;
    }

    public static final /* synthetic */ void OLrzqt(NonAuthMfaCheckResultRequest nonAuthMfaCheckResultRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, nonAuthMfaCheckResultRequest.token);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, nonAuthMfaCheckResultRequest.sessionId);
    }

    public NonAuthMfaCheckResultRequest(String str, String str2) {
        this.token = str;
        this.sessionId = str2;
    }
}
