package com.amplifyframework.predictions.aws.models.liveness;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class LivenessResponseStream {
    public static final Companion Companion = new Companion(null);
    private final AccessDeniedException accessDeniedException;
    private final DisconnectionEvent disconnectionEvent;
    private final InternalServerException internalServerException;
    private final InvalidSignatureException invalidSignatureException;
    private final ServerSessionInformationEvent serverSessionInformationEvent;
    private final ServiceQuotaExceededException serviceQuotaExceededException;
    private final ServiceUnavailableException serviceUnavailableException;
    private final SessionNotFoundException sessionNotFoundException;
    private final ThrottlingException throttlingException;
    private final UnrecognizedClientException unrecognizedClientException;
    private final ValidationException validationException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LivenessResponseStream() {
        this((ServerSessionInformationEvent) null, (DisconnectionEvent) null, (ValidationException) null, (InternalServerException) null, (ThrottlingException) null, (ServiceQuotaExceededException) null, (ServiceUnavailableException) null, (SessionNotFoundException) null, (AccessDeniedException) null, (InvalidSignatureException) null, (UnrecognizedClientException) null, 2047, (DefaultConstructorMarker) null);
    }

    @SerialName("AccessDeniedException")
    public static /* synthetic */ void getAccessDeniedException$annotations() {
    }

    @SerialName("DisconnectionEvent")
    public static /* synthetic */ void getDisconnectionEvent$annotations() {
    }

    @SerialName("InternalServerException")
    public static /* synthetic */ void getInternalServerException$annotations() {
    }

    @SerialName("InvalidSignatureException")
    public static /* synthetic */ void getInvalidSignatureException$annotations() {
    }

    @SerialName("ServerSessionInformationEvent")
    public static /* synthetic */ void getServerSessionInformationEvent$annotations() {
    }

    @SerialName("ServiceQuotaExceededException")
    public static /* synthetic */ void getServiceQuotaExceededException$annotations() {
    }

    @SerialName("ServiceUnavailableException")
    public static /* synthetic */ void getServiceUnavailableException$annotations() {
    }

    @SerialName("SessionNotFoundException")
    public static /* synthetic */ void getSessionNotFoundException$annotations() {
    }

    @SerialName("ThrottlingException")
    public static /* synthetic */ void getThrottlingException$annotations() {
    }

    @SerialName("UnrecognizedClientException")
    public static /* synthetic */ void getUnrecognizedClientException$annotations() {
    }

    @SerialName("ValidationException")
    public static /* synthetic */ void getValidationException$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServerSessionInformationEvent component1() {
        return this.serverSessionInformationEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvalidSignatureException component10() {
        return this.invalidSignatureException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnrecognizedClientException component11() {
        return this.unrecognizedClientException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisconnectionEvent component2() {
        return this.disconnectionEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationException component3() {
        return this.validationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InternalServerException component4() {
        return this.internalServerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThrottlingException component5() {
        return this.throttlingException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceQuotaExceededException component6() {
        return this.serviceQuotaExceededException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceUnavailableException component7() {
        return this.serviceUnavailableException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionNotFoundException component8() {
        return this.sessionNotFoundException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessDeniedException component9() {
        return this.accessDeniedException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessResponseStream copy(ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent, ValidationException validationException, InternalServerException internalServerException, ThrottlingException throttlingException, ServiceQuotaExceededException serviceQuotaExceededException, ServiceUnavailableException serviceUnavailableException, SessionNotFoundException sessionNotFoundException, AccessDeniedException accessDeniedException, InvalidSignatureException invalidSignatureException, UnrecognizedClientException unrecognizedClientException) {
        return new LivenessResponseStream(serverSessionInformationEvent, disconnectionEvent, validationException, internalServerException, throttlingException, serviceQuotaExceededException, serviceUnavailableException, sessionNotFoundException, accessDeniedException, invalidSignatureException, unrecognizedClientException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivenessResponseStream)) {
            return false;
        }
        LivenessResponseStream livenessResponseStream = (LivenessResponseStream) obj;
        return Intrinsics.EZpvd(this.serverSessionInformationEvent, livenessResponseStream.serverSessionInformationEvent) && Intrinsics.EZpvd(this.disconnectionEvent, livenessResponseStream.disconnectionEvent) && Intrinsics.EZpvd(this.validationException, livenessResponseStream.validationException) && Intrinsics.EZpvd(this.internalServerException, livenessResponseStream.internalServerException) && Intrinsics.EZpvd(this.throttlingException, livenessResponseStream.throttlingException) && Intrinsics.EZpvd(this.serviceQuotaExceededException, livenessResponseStream.serviceQuotaExceededException) && Intrinsics.EZpvd(this.serviceUnavailableException, livenessResponseStream.serviceUnavailableException) && Intrinsics.EZpvd(this.sessionNotFoundException, livenessResponseStream.sessionNotFoundException) && Intrinsics.EZpvd(this.accessDeniedException, livenessResponseStream.accessDeniedException) && Intrinsics.EZpvd(this.invalidSignatureException, livenessResponseStream.invalidSignatureException) && Intrinsics.EZpvd(this.unrecognizedClientException, livenessResponseStream.unrecognizedClientException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AccessDeniedException getAccessDeniedException() {
        return this.accessDeniedException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DisconnectionEvent getDisconnectionEvent() {
        return this.disconnectionEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InternalServerException getInternalServerException() {
        return this.internalServerException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvalidSignatureException getInvalidSignatureException() {
        return this.invalidSignatureException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServerSessionInformationEvent getServerSessionInformationEvent() {
        return this.serverSessionInformationEvent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceQuotaExceededException getServiceQuotaExceededException() {
        return this.serviceQuotaExceededException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceUnavailableException getServiceUnavailableException() {
        return this.serviceUnavailableException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionNotFoundException getSessionNotFoundException() {
        return this.sessionNotFoundException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ThrottlingException getThrottlingException() {
        return this.throttlingException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnrecognizedClientException getUnrecognizedClientException() {
        return this.unrecognizedClientException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationException getValidationException() {
        return this.validationException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ServerSessionInformationEvent serverSessionInformationEvent = this.serverSessionInformationEvent;
        int iHashCode = serverSessionInformationEvent == null ? 0 : serverSessionInformationEvent.hashCode();
        DisconnectionEvent disconnectionEvent = this.disconnectionEvent;
        int iHashCode2 = disconnectionEvent == null ? 0 : disconnectionEvent.hashCode();
        ValidationException validationException = this.validationException;
        int iHashCode3 = validationException == null ? 0 : validationException.hashCode();
        InternalServerException internalServerException = this.internalServerException;
        int iHashCode4 = internalServerException == null ? 0 : internalServerException.hashCode();
        ThrottlingException throttlingException = this.throttlingException;
        int iHashCode5 = throttlingException == null ? 0 : throttlingException.hashCode();
        ServiceQuotaExceededException serviceQuotaExceededException = this.serviceQuotaExceededException;
        int iHashCode6 = serviceQuotaExceededException == null ? 0 : serviceQuotaExceededException.hashCode();
        ServiceUnavailableException serviceUnavailableException = this.serviceUnavailableException;
        int iHashCode7 = serviceUnavailableException == null ? 0 : serviceUnavailableException.hashCode();
        SessionNotFoundException sessionNotFoundException = this.sessionNotFoundException;
        int iHashCode8 = sessionNotFoundException == null ? 0 : sessionNotFoundException.hashCode();
        AccessDeniedException accessDeniedException = this.accessDeniedException;
        int iHashCode9 = accessDeniedException == null ? 0 : accessDeniedException.hashCode();
        InvalidSignatureException invalidSignatureException = this.invalidSignatureException;
        int iHashCode10 = invalidSignatureException == null ? 0 : invalidSignatureException.hashCode();
        UnrecognizedClientException unrecognizedClientException = this.unrecognizedClientException;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (unrecognizedClientException != null ? unrecognizedClientException.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessResponseStream(serverSessionInformationEvent=" + this.serverSessionInformationEvent + ", disconnectionEvent=" + this.disconnectionEvent + ", validationException=" + this.validationException + ", internalServerException=" + this.internalServerException + ", throttlingException=" + this.throttlingException + ", serviceQuotaExceededException=" + this.serviceQuotaExceededException + ", serviceUnavailableException=" + this.serviceUnavailableException + ", sessionNotFoundException=" + this.sessionNotFoundException + ", accessDeniedException=" + this.accessDeniedException + ", invalidSignatureException=" + this.invalidSignatureException + ", unrecognizedClientException=" + this.unrecognizedClientException + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<LivenessResponseStream> serializer() {
            return LivenessResponseStream$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LivenessResponseStream(int i, @SerialName("ServerSessionInformationEvent") ServerSessionInformationEvent serverSessionInformationEvent, @SerialName("DisconnectionEvent") DisconnectionEvent disconnectionEvent, @SerialName("ValidationException") ValidationException validationException, @SerialName("InternalServerException") InternalServerException internalServerException, @SerialName("ThrottlingException") ThrottlingException throttlingException, @SerialName("ServiceQuotaExceededException") ServiceQuotaExceededException serviceQuotaExceededException, @SerialName("ServiceUnavailableException") ServiceUnavailableException serviceUnavailableException, @SerialName("SessionNotFoundException") SessionNotFoundException sessionNotFoundException, @SerialName("AccessDeniedException") AccessDeniedException accessDeniedException, @SerialName("InvalidSignatureException") InvalidSignatureException invalidSignatureException, @SerialName("UnrecognizedClientException") UnrecognizedClientException unrecognizedClientException, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.serverSessionInformationEvent = null;
        } else {
            this.serverSessionInformationEvent = serverSessionInformationEvent;
        }
        if ((i & 2) == 0) {
            this.disconnectionEvent = null;
        } else {
            this.disconnectionEvent = disconnectionEvent;
        }
        if ((i & 4) == 0) {
            this.validationException = null;
        } else {
            this.validationException = validationException;
        }
        if ((i & 8) == 0) {
            this.internalServerException = null;
        } else {
            this.internalServerException = internalServerException;
        }
        if ((i & 16) == 0) {
            this.throttlingException = null;
        } else {
            this.throttlingException = throttlingException;
        }
        if ((i & 32) == 0) {
            this.serviceQuotaExceededException = null;
        } else {
            this.serviceQuotaExceededException = serviceQuotaExceededException;
        }
        if ((i & 64) == 0) {
            this.serviceUnavailableException = null;
        } else {
            this.serviceUnavailableException = serviceUnavailableException;
        }
        if ((i & 128) == 0) {
            this.sessionNotFoundException = null;
        } else {
            this.sessionNotFoundException = sessionNotFoundException;
        }
        if ((i & 256) == 0) {
            this.accessDeniedException = null;
        } else {
            this.accessDeniedException = accessDeniedException;
        }
        if ((i & 512) == 0) {
            this.invalidSignatureException = null;
        } else {
            this.invalidSignatureException = invalidSignatureException;
        }
        if ((i & 1024) == 0) {
            this.unrecognizedClientException = null;
        } else {
            this.unrecognizedClientException = unrecognizedClientException;
        }
    }

    public LivenessResponseStream(ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent, ValidationException validationException, InternalServerException internalServerException, ThrottlingException throttlingException, ServiceQuotaExceededException serviceQuotaExceededException, ServiceUnavailableException serviceUnavailableException, SessionNotFoundException sessionNotFoundException, AccessDeniedException accessDeniedException, InvalidSignatureException invalidSignatureException, UnrecognizedClientException unrecognizedClientException) {
        this.serverSessionInformationEvent = serverSessionInformationEvent;
        this.disconnectionEvent = disconnectionEvent;
        this.validationException = validationException;
        this.internalServerException = internalServerException;
        this.throttlingException = throttlingException;
        this.serviceQuotaExceededException = serviceQuotaExceededException;
        this.serviceUnavailableException = serviceUnavailableException;
        this.sessionNotFoundException = sessionNotFoundException;
        this.accessDeniedException = accessDeniedException;
        this.invalidSignatureException = invalidSignatureException;
        this.unrecognizedClientException = unrecognizedClientException;
    }

    public static final /* synthetic */ void write$Self(LivenessResponseStream livenessResponseStream, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || livenessResponseStream.serverSessionInformationEvent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ServerSessionInformationEvent$$serializer.INSTANCE, livenessResponseStream.serverSessionInformationEvent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || livenessResponseStream.disconnectionEvent != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, DisconnectionEvent$$serializer.INSTANCE, livenessResponseStream.disconnectionEvent);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || livenessResponseStream.validationException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, ValidationException$$serializer.INSTANCE, livenessResponseStream.validationException);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || livenessResponseStream.internalServerException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, InternalServerException$$serializer.INSTANCE, livenessResponseStream.internalServerException);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || livenessResponseStream.throttlingException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, ThrottlingException$$serializer.INSTANCE, livenessResponseStream.throttlingException);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || livenessResponseStream.serviceQuotaExceededException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, ServiceQuotaExceededException$$serializer.INSTANCE, livenessResponseStream.serviceQuotaExceededException);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || livenessResponseStream.serviceUnavailableException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, ServiceUnavailableException$$serializer.INSTANCE, livenessResponseStream.serviceUnavailableException);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || livenessResponseStream.sessionNotFoundException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, SessionNotFoundException$$serializer.INSTANCE, livenessResponseStream.sessionNotFoundException);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || livenessResponseStream.accessDeniedException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, AccessDeniedException$$serializer.INSTANCE, livenessResponseStream.accessDeniedException);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || livenessResponseStream.invalidSignatureException != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, InvalidSignatureException$$serializer.INSTANCE, livenessResponseStream.invalidSignatureException);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && livenessResponseStream.unrecognizedClientException == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, UnrecognizedClientException$$serializer.INSTANCE, livenessResponseStream.unrecognizedClientException);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent) : (r13v0 com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.DisconnectionEvent:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.DisconnectionEvent) : (r14v0 com.amplifyframework.predictions.aws.models.liveness.DisconnectionEvent))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.ValidationException:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.ValidationException) : (r15v0 com.amplifyframework.predictions.aws.models.liveness.ValidationException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.InternalServerException:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.InternalServerException) : (r16v0 com.amplifyframework.predictions.aws.models.liveness.InternalServerException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.ThrottlingException:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.ThrottlingException) : (r17v0 com.amplifyframework.predictions.aws.models.liveness.ThrottlingException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.ServiceQuotaExceededException:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.ServiceQuotaExceededException) : (r18v0 com.amplifyframework.predictions.aws.models.liveness.ServiceQuotaExceededException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.ServiceUnavailableException:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.ServiceUnavailableException) : (r19v0 com.amplifyframework.predictions.aws.models.liveness.ServiceUnavailableException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.SessionNotFoundException:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.SessionNotFoundException) : (r20v0 com.amplifyframework.predictions.aws.models.liveness.SessionNotFoundException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.AccessDeniedException:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.AccessDeniedException) : (r21v0 com.amplifyframework.predictions.aws.models.liveness.AccessDeniedException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.InvalidSignatureException:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.InvalidSignatureException) : (r22v0 com.amplifyframework.predictions.aws.models.liveness.InvalidSignatureException))
  (wrap:com.amplifyframework.predictions.aws.models.liveness.UnrecognizedClientException:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 com.amplifyframework.predictions.aws.models.liveness.UnrecognizedClientException) : (null com.amplifyframework.predictions.aws.models.liveness.UnrecognizedClientException))
 A[MD:(com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent, com.amplifyframework.predictions.aws.models.liveness.DisconnectionEvent, com.amplifyframework.predictions.aws.models.liveness.ValidationException, com.amplifyframework.predictions.aws.models.liveness.InternalServerException, com.amplifyframework.predictions.aws.models.liveness.ThrottlingException, com.amplifyframework.predictions.aws.models.liveness.ServiceQuotaExceededException, com.amplifyframework.predictions.aws.models.liveness.ServiceUnavailableException, com.amplifyframework.predictions.aws.models.liveness.SessionNotFoundException, com.amplifyframework.predictions.aws.models.liveness.AccessDeniedException, com.amplifyframework.predictions.aws.models.liveness.InvalidSignatureException, com.amplifyframework.predictions.aws.models.liveness.UnrecognizedClientException):void (m)] (LINE:21) call: com.amplifyframework.predictions.aws.models.liveness.LivenessResponseStream.<init>(com.amplifyframework.predictions.aws.models.liveness.ServerSessionInformationEvent, com.amplifyframework.predictions.aws.models.liveness.DisconnectionEvent, com.amplifyframework.predictions.aws.models.liveness.ValidationException, com.amplifyframework.predictions.aws.models.liveness.InternalServerException, com.amplifyframework.predictions.aws.models.liveness.ThrottlingException, com.amplifyframework.predictions.aws.models.liveness.ServiceQuotaExceededException, com.amplifyframework.predictions.aws.models.liveness.ServiceUnavailableException, com.amplifyframework.predictions.aws.models.liveness.SessionNotFoundException, com.amplifyframework.predictions.aws.models.liveness.AccessDeniedException, com.amplifyframework.predictions.aws.models.liveness.InvalidSignatureException, com.amplifyframework.predictions.aws.models.liveness.UnrecognizedClientException):void type: THIS */
    public /* synthetic */ LivenessResponseStream(ServerSessionInformationEvent serverSessionInformationEvent, DisconnectionEvent disconnectionEvent, ValidationException validationException, InternalServerException internalServerException, ThrottlingException throttlingException, ServiceQuotaExceededException serviceQuotaExceededException, ServiceUnavailableException serviceUnavailableException, SessionNotFoundException sessionNotFoundException, AccessDeniedException accessDeniedException, InvalidSignatureException invalidSignatureException, UnrecognizedClientException unrecognizedClientException, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverSessionInformationEvent, (i & 2) != 0 ? null : disconnectionEvent, (i & 4) != 0 ? null : validationException, (i & 8) != 0 ? null : internalServerException, (i & 16) != 0 ? null : throttlingException, (i & 32) != 0 ? null : serviceQuotaExceededException, (i & 64) != 0 ? null : serviceUnavailableException, (i & 128) != 0 ? null : sessionNotFoundException, (i & 256) != 0 ? null : accessDeniedException, (i & 512) != 0 ? null : invalidSignatureException, (i & 1024) == 0 ? unrecognizedClientException : null);
    }
}
