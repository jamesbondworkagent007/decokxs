package com.okinc.okimcore.feature.notification.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class NotificationData {
    private final Integer operation;
    private final List<String> refSeqList;
    private final String seq;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationData() {
        this((String) null, (List) null, (Integer) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.feature.notification.model.NotificationData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationData copy$default(NotificationData notificationData, String str, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationData.seq;
        }
        if ((i & 2) != 0) {
            list = notificationData.refSeqList;
        }
        if ((i & 4) != 0) {
            num = notificationData.operation;
        }
        return notificationData.copy(str, list, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.refSeqList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.operation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationData copy(String str, List<String> list, Integer num) {
        return new NotificationData(str, list, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationData)) {
            return false;
        }
        NotificationData notificationData = (NotificationData) obj;
        return Intrinsics.EZpvd((Object) this.seq, (Object) notificationData.seq) && Intrinsics.EZpvd(this.refSeqList, notificationData.refSeqList) && Intrinsics.EZpvd(this.operation, notificationData.operation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getOperation() {
        return this.operation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRefSeqList() {
        return this.refSeqList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeq() {
        return this.seq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.seq;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<String> list = this.refSeqList;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        Integer num = this.operation;
        return (((iHashCode * 31) + iHashCode2) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationData(seq=" + this.seq + ", refSeqList=" + this.refSeqList + ", operation=" + this.operation + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.feature.notification.model.NotificationData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NotificationData> serializer() {
            return NotificationData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NotificationData(int i, String str, List list, Integer num, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.seq = null;
        } else {
            this.seq = str;
        }
        if ((i & 2) == 0) {
            this.refSeqList = null;
        } else {
            this.refSeqList = list;
        }
        if ((i & 4) == 0) {
            this.operation = null;
        } else {
            this.operation = num;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(NotificationData notificationData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || notificationData.seq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, notificationData.seq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || notificationData.refSeqList != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], notificationData.refSeqList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && notificationData.operation == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, notificationData.operation);
    }

    public NotificationData(String str, List<String> list, Integer num) {
        this.seq = str;
        this.refSeqList = list;
        this.operation = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
 A[MD:(java.lang.String, java.util.List<java.lang.String>, java.lang.Integer):void (m)] (LINE:8) call: com.okinc.okimcore.feature.notification.model.NotificationData.<init>(java.lang.String, java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ NotificationData(String str, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : num);
    }
}
