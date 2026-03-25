package com.okinc.auth.impl.reset2fa.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class PartialAuthMfaCreateSessionRequest implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String business;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PartialAuthMfaCreateSessionRequest copy$default(PartialAuthMfaCreateSessionRequest partialAuthMfaCreateSessionRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partialAuthMfaCreateSessionRequest.business;
        }
        return partialAuthMfaCreateSessionRequest.copy(str);
    }

    @SerialName("business")
    public static /* synthetic */ void getBusiness$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PartialAuthMfaCreateSessionRequest copy(String str) {
        return new PartialAuthMfaCreateSessionRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PartialAuthMfaCreateSessionRequest) && Intrinsics.EZpvd((Object) this.business, (Object) ((PartialAuthMfaCreateSessionRequest) obj).business);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBusiness() {
        return this.business;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.business;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PartialAuthMfaCreateSessionRequest(business=" + this.business + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCreateSessionRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartialAuthMfaCreateSessionRequest> serializer() {
            return PartialAuthMfaCreateSessionRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartialAuthMfaCreateSessionRequest(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PartialAuthMfaCreateSessionRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.business = str;
    }

    public PartialAuthMfaCreateSessionRequest(String str) {
        this.business = str;
    }
}
