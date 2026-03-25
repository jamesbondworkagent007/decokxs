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
public final class ClientSessionInformationEvent {
    public static final Companion Companion = new Companion(null);
    private final ClientChallenge challenge;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ClientSessionInformationEvent() {
        this((ClientChallenge) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ClientSessionInformationEvent copy$default(ClientSessionInformationEvent clientSessionInformationEvent, ClientChallenge clientChallenge, int i, Object obj) {
        if ((i & 1) != 0) {
            clientChallenge = clientSessionInformationEvent.challenge;
        }
        return clientSessionInformationEvent.copy(clientChallenge);
    }

    @SerialName("Challenge")
    public static /* synthetic */ void getChallenge$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientChallenge component1() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientSessionInformationEvent copy(ClientChallenge clientChallenge) {
        return new ClientSessionInformationEvent(clientChallenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClientSessionInformationEvent) && Intrinsics.EZpvd(this.challenge, ((ClientSessionInformationEvent) obj).challenge);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClientChallenge getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ClientChallenge clientChallenge = this.challenge;
        if (clientChallenge == null) {
            return 0;
        }
        return clientChallenge.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ClientSessionInformationEvent(challenge=" + this.challenge + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.models.liveness.ClientSessionInformationEvent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ClientSessionInformationEvent> serializer() {
            return ClientSessionInformationEvent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ClientSessionInformationEvent(int i, @SerialName("Challenge") ClientChallenge clientChallenge, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.challenge = null;
        } else {
            this.challenge = clientChallenge;
        }
    }

    public ClientSessionInformationEvent(ClientChallenge clientChallenge) {
        this.challenge = clientChallenge;
    }

    public static final /* synthetic */ void write$Self(ClientSessionInformationEvent clientSessionInformationEvent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && clientSessionInformationEvent.challenge == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, ClientChallenge$$serializer.INSTANCE, clientSessionInformationEvent.challenge);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.amplifyframework.predictions.aws.models.liveness.ClientChallenge:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.predictions.aws.models.liveness.ClientChallenge) : (r1v0 com.amplifyframework.predictions.aws.models.liveness.ClientChallenge))
 A[MD:(com.amplifyframework.predictions.aws.models.liveness.ClientChallenge):void (m)] (LINE:21) call: com.amplifyframework.predictions.aws.models.liveness.ClientSessionInformationEvent.<init>(com.amplifyframework.predictions.aws.models.liveness.ClientChallenge):void type: THIS */
    public /* synthetic */ ClientSessionInformationEvent(ClientChallenge clientChallenge, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : clientChallenge);
    }
}
