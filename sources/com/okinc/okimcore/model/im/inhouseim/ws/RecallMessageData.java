package com.okinc.okimcore.model.im.inhouseim.ws;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RecallMessageData {
    private final Boolean isInternal;
    private final Long msgSeq;
    private final List<Long> msgSeqs;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(LongSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecallMessageData() {
        this((Long) null, (Boolean) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecallMessageData copy$default(RecallMessageData recallMessageData, Long l, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = recallMessageData.msgSeq;
        }
        if ((i & 2) != 0) {
            bool = recallMessageData.isInternal;
        }
        if ((i & 4) != 0) {
            list = recallMessageData.msgSeqs;
        }
        return recallMessageData.copy(l, bool, list);
    }

    @SerialName("msgSeq")
    public static /* synthetic */ void getMsgSeq$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.msgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.isInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component3() {
        return this.msgSeqs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecallMessageData copy(Long l, Boolean bool, List<Long> list) {
        return new RecallMessageData(l, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecallMessageData)) {
            return false;
        }
        RecallMessageData recallMessageData = (RecallMessageData) obj;
        return Intrinsics.EZpvd(this.msgSeq, recallMessageData.msgSeq) && Intrinsics.EZpvd(this.isInternal, recallMessageData.isInternal) && Intrinsics.EZpvd(this.msgSeqs, recallMessageData.msgSeqs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMsgSeq() {
        return this.msgSeq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getMsgSeqs() {
        return this.msgSeqs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.msgSeq;
        int iHashCode = l == null ? 0 : l.hashCode();
        Boolean bool = this.isInternal;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        List<Long> list = this.msgSeqs;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isInternal() {
        return this.isInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecallMessageData(msgSeq=" + this.msgSeq + ", isInternal=" + this.isInternal + ", msgSeqs=" + this.msgSeqs + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecallMessageData> serializer() {
            return RecallMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecallMessageData(int i, Long l, Boolean bool, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.msgSeq = null;
        } else {
            this.msgSeq = l;
        }
        if ((i & 2) == 0) {
            this.isInternal = null;
        } else {
            this.isInternal = bool;
        }
        if ((i & 4) == 0) {
            this.msgSeqs = null;
        } else {
            this.msgSeqs = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(RecallMessageData recallMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || recallMessageData.msgSeq != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, recallMessageData.msgSeq);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || recallMessageData.isInternal != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, recallMessageData.isInternal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && recallMessageData.msgSeqs == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], recallMessageData.msgSeqs);
    }

    public RecallMessageData(Long l, Boolean bool, List<Long> list) {
        this.msgSeq = l;
        this.isInternal = bool;
        this.msgSeqs = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r2v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.Long, java.lang.Boolean, java.util.List<java.lang.Long>):void (m)] (LINE:9) call: com.okinc.okimcore.model.im.inhouseim.ws.RecallMessageData.<init>(java.lang.Long, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ RecallMessageData(Long l, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : list);
    }
}
