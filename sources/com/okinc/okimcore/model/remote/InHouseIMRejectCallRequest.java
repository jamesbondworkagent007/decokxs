package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class InHouseIMRejectCallRequest {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final int REJECT_REASON_REJECT = 5;
    public final Integer callType;
    public final String channelId;
    public final Integer rejectReason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InHouseIMRejectCallRequest() {
        this((Integer) null, (String) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InHouseIMRejectCallRequest copy$default(InHouseIMRejectCallRequest inHouseIMRejectCallRequest, Integer num, String str, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = inHouseIMRejectCallRequest.callType;
        }
        if ((i & 2) != 0) {
            str = inHouseIMRejectCallRequest.channelId;
        }
        if ((i & 4) != 0) {
            num2 = inHouseIMRejectCallRequest.rejectReason;
        }
        return inHouseIMRejectCallRequest.OLrzqt(num, str, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMRejectCallRequest OLrzqt(Integer num, String str, Integer num2) {
        return new InHouseIMRejectCallRequest(num, str, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InHouseIMRejectCallRequest)) {
            return false;
        }
        InHouseIMRejectCallRequest inHouseIMRejectCallRequest = (InHouseIMRejectCallRequest) obj;
        return Intrinsics.EZpvd(this.callType, inHouseIMRejectCallRequest.callType) && Intrinsics.EZpvd((Object) this.channelId, (Object) inHouseIMRejectCallRequest.channelId) && Intrinsics.EZpvd(this.rejectReason, inHouseIMRejectCallRequest.rejectReason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.callType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.channelId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num2 = this.rejectReason;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InHouseIMRejectCallRequest(callType=" + this.callType + ", channelId=" + this.channelId + ", rejectReason=" + this.rejectReason + ")";
    }

    public /* synthetic */ InHouseIMRejectCallRequest(int i, Integer num, String str, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.callType = null;
        } else {
            this.callType = num;
        }
        if ((i & 2) == 0) {
            this.channelId = null;
        } else {
            this.channelId = str;
        }
        if ((i & 4) == 0) {
            this.rejectReason = null;
        } else {
            this.rejectReason = num2;
        }
    }

    public static final /* synthetic */ void AEQbTJ(InHouseIMRejectCallRequest inHouseIMRejectCallRequest, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || inHouseIMRejectCallRequest.callType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, inHouseIMRejectCallRequest.callType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || inHouseIMRejectCallRequest.channelId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, inHouseIMRejectCallRequest.channelId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && inHouseIMRejectCallRequest.rejectReason == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, inHouseIMRejectCallRequest.rejectReason);
    }

    public InHouseIMRejectCallRequest(Integer num, String str, Integer num2) {
        this.callType = num;
        this.channelId = str;
        this.rejectReason = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:8) call: com.okinc.okimcore.model.remote.InHouseIMRejectCallRequest.<init>(java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ InHouseIMRejectCallRequest(Integer num, String str, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.InHouseIMRejectCallRequest.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InHouseIMRejectCallRequest> serializer() {
            return InHouseIMRejectCallRequest$$serializer.INSTANCE;
        }
    }
}
