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
public final class PartialAuthMfaCheckResultResponse implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String nextStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PartialAuthMfaCheckResultResponse copy$default(PartialAuthMfaCheckResultResponse partialAuthMfaCheckResultResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = partialAuthMfaCheckResultResponse.nextStep;
        }
        return partialAuthMfaCheckResultResponse.copy(str);
    }

    @SerialName("nextStep")
    public static /* synthetic */ void getNextStep$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PartialAuthMfaCheckResultResponse copy(String str) {
        return new PartialAuthMfaCheckResultResponse(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PartialAuthMfaCheckResultResponse) && Intrinsics.EZpvd((Object) this.nextStep, (Object) ((PartialAuthMfaCheckResultResponse) obj).nextStep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nextStep;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PartialAuthMfaCheckResultResponse(nextStep=" + this.nextStep + ")";
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.impl.reset2fa.data.model.PartialAuthMfaCheckResultResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PartialAuthMfaCheckResultResponse> serializer() {
            return PartialAuthMfaCheckResultResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PartialAuthMfaCheckResultResponse(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, PartialAuthMfaCheckResultResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.nextStep = str;
    }

    public PartialAuthMfaCheckResultResponse(String str) {
        this.nextStep = str;
    }
}
