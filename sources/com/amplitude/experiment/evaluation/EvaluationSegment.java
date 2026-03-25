package com.amplitude.experiment.evaluation;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.LW;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class EvaluationSegment {
    public final EvaluationBucket bucket;
    public final List<List<EvaluationCondition>> conditions;
    public final Map<String, Object> metadata;
    public final String variant;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(new ArrayListSerializer(EvaluationCondition$$serializer.INSTANCE)), null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(LW.AEQbTJ))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EvaluationSegment() {
        this((EvaluationBucket) null, (List) null, (String) null, (Map) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplitude.experiment.evaluation.EvaluationSegment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationSegment copy$default(EvaluationSegment evaluationSegment, EvaluationBucket evaluationBucket, List list, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            evaluationBucket = evaluationSegment.bucket;
        }
        if ((i & 2) != 0) {
            list = evaluationSegment.conditions;
        }
        if ((i & 4) != 0) {
            str = evaluationSegment.variant;
        }
        if ((i & 8) != 0) {
            map = evaluationSegment.metadata;
        }
        return evaluationSegment.copydefault(evaluationBucket, list, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<EvaluationCondition>> AEQbTJ() {
        return this.conditions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationBucket EZpvd() {
        return this.bucket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.variant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationSegment copydefault(EvaluationBucket evaluationBucket, List<? extends List<EvaluationCondition>> list, String str, Map<String, ? extends Object> map) {
        return new EvaluationSegment(evaluationBucket, list, str, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> copydefault() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationSegment)) {
            return false;
        }
        EvaluationSegment evaluationSegment = (EvaluationSegment) obj;
        return Intrinsics.EZpvd(this.bucket, evaluationSegment.bucket) && Intrinsics.EZpvd(this.conditions, evaluationSegment.conditions) && Intrinsics.EZpvd((Object) this.variant, (Object) evaluationSegment.variant) && Intrinsics.EZpvd(this.metadata, evaluationSegment.metadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        EvaluationBucket evaluationBucket = this.bucket;
        int iHashCode = evaluationBucket == null ? 0 : evaluationBucket.hashCode();
        List<List<EvaluationCondition>> list = this.conditions;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str = this.variant;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        Map<String, Object> map = this.metadata;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvaluationSegment(bucket=" + this.bucket + ", conditions=" + this.conditions + ", variant=" + this.variant + ", metadata=" + this.metadata + ')';
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationSegment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationSegment> serializer() {
            return EvaluationSegment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvaluationSegment(int i, EvaluationBucket evaluationBucket, List list, String str, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.bucket = null;
        } else {
            this.bucket = evaluationBucket;
        }
        if ((i & 2) == 0) {
            this.conditions = null;
        } else {
            this.conditions = list;
        }
        if ((i & 4) == 0) {
            this.variant = null;
        } else {
            this.variant = str;
        }
        if ((i & 8) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<com.amplitude.experiment.evaluation.EvaluationCondition>> */
    /* JADX WARN: Multi-variable type inference failed */
    public EvaluationSegment(EvaluationBucket evaluationBucket, List<? extends List<EvaluationCondition>> list, String str, Map<String, ? extends Object> map) {
        this.bucket = evaluationBucket;
        this.conditions = list;
        this.variant = str;
        this.metadata = map;
    }

    public static final /* synthetic */ void AEQbTJ(EvaluationSegment evaluationSegment, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || evaluationSegment.bucket != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, EvaluationBucket$$serializer.INSTANCE, evaluationSegment.bucket);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || evaluationSegment.conditions != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], evaluationSegment.conditions);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || evaluationSegment.variant != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, evaluationSegment.variant);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && evaluationSegment.metadata == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], evaluationSegment.metadata);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.amplitude.experiment.evaluation.EvaluationBucket:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.amplitude.experiment.evaluation.EvaluationBucket) : (r2v0 com.amplitude.experiment.evaluation.EvaluationBucket))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r5v0 java.util.Map))
 A[MD:(com.amplitude.experiment.evaluation.EvaluationBucket, java.util.List<? extends java.util.List<com.amplitude.experiment.evaluation.EvaluationCondition>>, java.lang.String, java.util.Map<java.lang.String, ? extends java.lang.Object>):void (m)] (LINE:9) call: com.amplitude.experiment.evaluation.EvaluationSegment.<init>(com.amplitude.experiment.evaluation.EvaluationBucket, java.util.List, java.lang.String, java.util.Map):void type: THIS */
    public /* synthetic */ EvaluationSegment(EvaluationBucket evaluationBucket, List list, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : evaluationBucket, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : map);
    }
}
