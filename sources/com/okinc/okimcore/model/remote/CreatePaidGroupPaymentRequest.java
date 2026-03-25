package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class CreatePaidGroupPaymentRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long groupId;
    private final String invitationId;
    private final String reason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CreatePaidGroupPaymentRequest copy$default(CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = createPaidGroupPaymentRequest.groupId;
        }
        if ((i & 2) != 0) {
            str = createPaidGroupPaymentRequest.invitationId;
        }
        if ((i & 4) != 0) {
            str2 = createPaidGroupPaymentRequest.reason;
        }
        return createPaidGroupPaymentRequest.copy(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CreatePaidGroupPaymentRequest copy(long j, String str, String str2) {
        return new CreatePaidGroupPaymentRequest(j, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePaidGroupPaymentRequest)) {
            return false;
        }
        CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest = (CreatePaidGroupPaymentRequest) obj;
        return this.groupId == createPaidGroupPaymentRequest.groupId && Intrinsics.EZpvd((Object) this.invitationId, (Object) createPaidGroupPaymentRequest.invitationId) && Intrinsics.EZpvd((Object) this.reason, (Object) createPaidGroupPaymentRequest.reason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.groupId);
        String str = this.invitationId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.reason;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CreatePaidGroupPaymentRequest(groupId=" + this.groupId + ", invitationId=" + this.invitationId + ", reason=" + this.reason + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.CreatePaidGroupPaymentRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CreatePaidGroupPaymentRequest> serializer() {
            return CreatePaidGroupPaymentRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CreatePaidGroupPaymentRequest(int i, long j, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, CreatePaidGroupPaymentRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.groupId = j;
        if ((i & 2) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str;
        }
        if ((i & 4) == 0) {
            this.reason = null;
        } else {
            this.reason = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CreatePaidGroupPaymentRequest createPaidGroupPaymentRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, createPaidGroupPaymentRequest.groupId);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || createPaidGroupPaymentRequest.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, createPaidGroupPaymentRequest.invitationId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && createPaidGroupPaymentRequest.reason == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, createPaidGroupPaymentRequest.reason);
    }

    public CreatePaidGroupPaymentRequest(long j, String str, String str2) {
        this.groupId = j;
        this.invitationId = str;
        this.reason = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(long, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.CreatePaidGroupPaymentRequest.<init>(long, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CreatePaidGroupPaymentRequest(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
