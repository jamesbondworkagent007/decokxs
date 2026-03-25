package com.okinc.auth.api.service;

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
public final class MfaCheckResultRequest implements java.io.Serializable {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String sessionId;
    private final String token;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MfaCheckResultRequest copy$default(MfaCheckResultRequest mfaCheckResultRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mfaCheckResultRequest.sessionId;
        }
        if ((i & 2) != 0) {
            str2 = mfaCheckResultRequest.token;
        }
        return mfaCheckResultRequest.copy(str, str2);
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
    public final MfaCheckResultRequest copy(String str, String str2) {
        return new MfaCheckResultRequest(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MfaCheckResultRequest)) {
            return false;
        }
        MfaCheckResultRequest mfaCheckResultRequest = (MfaCheckResultRequest) obj;
        return Intrinsics.EZpvd((Object) this.sessionId, (Object) mfaCheckResultRequest.sessionId) && Intrinsics.EZpvd((Object) this.token, (Object) mfaCheckResultRequest.token);
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
        return "MfaCheckResultRequest(sessionId=" + this.sessionId + ", token=" + this.token + ")";
    }

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.auth.api.service.MfaCheckResultRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MfaCheckResultRequest> serializer() {
            return MfaCheckResultRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MfaCheckResultRequest(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, MfaCheckResultRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        if ((i & 2) == 0) {
            this.token = null;
        } else {
            this.token = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKAuth_auth_api(MfaCheckResultRequest mfaCheckResultRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, mfaCheckResultRequest.sessionId);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && mfaCheckResultRequest.token == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, mfaCheckResultRequest.token);
    }

    public MfaCheckResultRequest(String str, String str2) {
        this.sessionId = str;
        this.token = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:55) call: com.okinc.auth.api.service.MfaCheckResultRequest.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MfaCheckResultRequest(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
