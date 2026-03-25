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
public final class EvaluationDistribution {
    public final List<Integer> range;
    public final String variant;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(IntSerializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplitude.experiment.evaluation.EvaluationDistribution */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationDistribution copy$default(EvaluationDistribution evaluationDistribution, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = evaluationDistribution.variant;
        }
        if ((i & 2) != 0) {
            list = evaluationDistribution.range;
        }
        return evaluationDistribution.KWHzl(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationDistribution KWHzl(@NotNull String str, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EvaluationDistribution(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> OLrzqt() {
        return this.range;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.variant;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationDistribution)) {
            return false;
        }
        EvaluationDistribution evaluationDistribution = (EvaluationDistribution) obj;
        return Intrinsics.EZpvd((Object) this.variant, (Object) evaluationDistribution.variant) && Intrinsics.EZpvd(this.range, evaluationDistribution.range);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.variant.hashCode() * 31) + this.range.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvaluationDistribution(variant=" + this.variant + ", range=" + this.range + ')';
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationDistribution.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationDistribution> serializer() {
            return EvaluationDistribution$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvaluationDistribution(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EvaluationDistribution$$serializer.INSTANCE.getDescriptor());
        }
        this.variant = str;
        this.range = list;
    }

    public EvaluationDistribution(@NotNull String str, @NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.variant = str;
        this.range = list;
    }

    public static final /* synthetic */ void copydefault(EvaluationDistribution evaluationDistribution, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, evaluationDistribution.variant);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], evaluationDistribution.range);
    }
}
