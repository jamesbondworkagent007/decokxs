package com.amplitude.experiment.evaluation;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class EvaluationAllocation {
    public final List<EvaluationDistribution> distributions;
    public final List<Integer> range;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), new ArrayListSerializer(EvaluationDistribution$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplitude.experiment.evaluation.EvaluationAllocation */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationAllocation copy$default(EvaluationAllocation evaluationAllocation, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = evaluationAllocation.range;
        }
        if ((i & 2) != 0) {
            list2 = evaluationAllocation.distributions;
        }
        return evaluationAllocation.EZpvd(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationAllocation EZpvd(@NotNull List<Integer> list, @NotNull List<EvaluationDistribution> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new EvaluationAllocation(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EvaluationDistribution> KWHzl() {
        return this.distributions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> copydefault() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationAllocation)) {
            return false;
        }
        EvaluationAllocation evaluationAllocation = (EvaluationAllocation) obj;
        return Intrinsics.EZpvd(this.range, evaluationAllocation.range) && Intrinsics.EZpvd(this.distributions, evaluationAllocation.distributions);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.range.hashCode() * 31) + this.distributions.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvaluationAllocation(range=" + this.range + ", distributions=" + this.distributions + ')';
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationAllocation.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationAllocation> serializer() {
            return EvaluationAllocation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvaluationAllocation(int i, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EvaluationAllocation$$serializer.INSTANCE.getDescriptor());
        }
        this.range = list;
        this.distributions = list2;
    }

    public EvaluationAllocation(@NotNull List<Integer> list, @NotNull List<EvaluationDistribution> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.range = list;
        this.distributions = list2;
    }

    public static final /* synthetic */ void OLrzqt(EvaluationAllocation evaluationAllocation, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], evaluationAllocation.range);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], evaluationAllocation.distributions);
    }
}
