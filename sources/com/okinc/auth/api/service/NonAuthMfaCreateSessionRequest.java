package com.okinc.auth.api.service;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class NonAuthMfaCreateSessionRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NonAuthMfaCreateSessionRequest copy$default(NonAuthMfaCreateSessionRequest nonAuthMfaCreateSessionRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonAuthMfaCreateSessionRequest.token;
        }
        return nonAuthMfaCreateSessionRequest.KWHzl(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NonAuthMfaCreateSessionRequest KWHzl(String str) {
        return new NonAuthMfaCreateSessionRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NonAuthMfaCreateSessionRequest) && Intrinsics.EZpvd((Object) this.token, (Object) ((NonAuthMfaCreateSessionRequest) obj).token);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.token;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NonAuthMfaCreateSessionRequest(token=" + this.token + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.service.NonAuthMfaCreateSessionRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NonAuthMfaCreateSessionRequest> serializer() {
            return NonAuthMfaCreateSessionRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NonAuthMfaCreateSessionRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, NonAuthMfaCreateSessionRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.token = str;
    }

    public NonAuthMfaCreateSessionRequest(String str) {
        this.token = str;
    }
}
