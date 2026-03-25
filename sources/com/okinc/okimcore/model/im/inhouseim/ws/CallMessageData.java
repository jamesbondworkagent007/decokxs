package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class CallMessageData {
    public static final int $stable = 0;
    public static final int CALL_SIGNAL_ACCEPT = 4;
    public static final int CALL_SIGNAL_CANCEL = 2;
    public static final int CALL_SIGNAL_COMPLETE = 8;
    public static final int CALL_SIGNAL_INIT = 1;
    public static final int CALL_SIGNAL_NO_ANSWER = 3;
    public static final int CALL_SIGNAL_REJECT = 5;
    public static final int CALL_SIGNAL_TERMINATE = 7;
    public static final Companion Companion = new Companion(null);
    private final Integer callType;
    private final String callerUid;
    private final Long duration;
    private final Integer errorCode;
    private final Integer signalType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CallMessageData() {
        this((Integer) null, (Integer) null, (Long) null, (String) null, (Integer) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CallMessageData copy$default(CallMessageData callMessageData, Integer num, Integer num2, Long l, String str, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = callMessageData.callType;
        }
        if ((i & 2) != 0) {
            num2 = callMessageData.signalType;
        }
        Integer num4 = num2;
        if ((i & 4) != 0) {
            l = callMessageData.duration;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str = callMessageData.callerUid;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            num3 = callMessageData.errorCode;
        }
        return callMessageData.copy(num, num4, l2, str2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.callerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CallMessageData copy(Integer num, Integer num2, Long l, String str, Integer num3) {
        return new CallMessageData(num, num2, l, str, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallMessageData)) {
            return false;
        }
        CallMessageData callMessageData = (CallMessageData) obj;
        return Intrinsics.EZpvd(this.callType, callMessageData.callType) && Intrinsics.EZpvd(this.signalType, callMessageData.signalType) && Intrinsics.EZpvd(this.duration, callMessageData.duration) && Intrinsics.EZpvd((Object) this.callerUid, (Object) callMessageData.callerUid) && Intrinsics.EZpvd(this.errorCode, callMessageData.errorCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCallType() {
        return this.callType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallerUid() {
        return this.callerUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSignalType() {
        return this.signalType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.callType;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.signalType;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        Long l = this.duration;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        String str = this.callerUid;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Integer num3 = this.errorCode;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CallMessageData(callType=" + this.callType + ", signalType=" + this.signalType + ", duration=" + this.duration + ", callerUid=" + this.callerUid + ", errorCode=" + this.errorCode + ")";
    }

    public /* synthetic */ CallMessageData(int i, Integer num, Integer num2, Long l, String str, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.callType = null;
        } else {
            this.callType = num;
        }
        if ((i & 2) == 0) {
            this.signalType = null;
        } else {
            this.signalType = num2;
        }
        if ((i & 4) == 0) {
            this.duration = null;
        } else {
            this.duration = l;
        }
        if ((i & 8) == 0) {
            this.callerUid = null;
        } else {
            this.callerUid = str;
        }
        if ((i & 16) == 0) {
            this.errorCode = null;
        } else {
            this.errorCode = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(CallMessageData callMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || callMessageData.callType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, callMessageData.callType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || callMessageData.signalType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, callMessageData.signalType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || callMessageData.duration != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, callMessageData.duration);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || callMessageData.callerUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, callMessageData.callerUid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && callMessageData.errorCode == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, IntSerializer.INSTANCE, callMessageData.errorCode);
    }

    public CallMessageData(Integer num, Integer num2, Long l, String str, Integer num3) {
        this.callType = num;
        this.signalType = num2;
        this.duration = l;
        this.callerUid = str;
        this.errorCode = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r9v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Integer):void (m)] (LINE:8) call: com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData.<init>(java.lang.Integer, java.lang.Integer, java.lang.Long, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ CallMessageData(Integer num, Integer num2, Long l, String str, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : num3);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.CallMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CallMessageData> serializer() {
            return CallMessageData$$serializer.INSTANCE;
        }
    }
}
