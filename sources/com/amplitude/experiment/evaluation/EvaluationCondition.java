package com.amplitude.experiment.evaluation;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class EvaluationCondition {
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    public final String op;
    public final List<String> selector;
    public final Set<String> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplitude.experiment.evaluation.EvaluationCondition */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationCondition copy$default(EvaluationCondition evaluationCondition, List list, String str, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            list = evaluationCondition.selector;
        }
        if ((i & 2) != 0) {
            str = evaluationCondition.op;
        }
        if ((i & 4) != 0) {
            set = evaluationCondition.values;
        }
        return evaluationCondition.OLrzqt(list, str, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.selector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationCondition OLrzqt(@NotNull List<String> list, @NotNull String str, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        return new EvaluationCondition(list, str, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.op;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> copydefault() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationCondition)) {
            return false;
        }
        EvaluationCondition evaluationCondition = (EvaluationCondition) obj;
        return Intrinsics.EZpvd(this.selector, evaluationCondition.selector) && Intrinsics.EZpvd((Object) this.op, (Object) evaluationCondition.op) && Intrinsics.EZpvd(this.values, evaluationCondition.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.selector.hashCode() * 31) + this.op.hashCode()) * 31) + this.values.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvaluationCondition(selector=" + this.selector + ", op=" + this.op + ", values=" + this.values + ')';
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationCondition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationCondition> serializer() {
            return EvaluationCondition$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{new ArrayListSerializer(stringSerializer), null, new LinkedHashSetSerializer(stringSerializer)};
    }

    public /* synthetic */ EvaluationCondition(int i, List list, String str, Set set, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EvaluationCondition$$serializer.INSTANCE.getDescriptor());
        }
        this.selector = list;
        this.op = str;
        this.values = set;
    }

    public EvaluationCondition(@NotNull List<String> list, @NotNull String str, @NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(set, "");
        this.selector = list;
        this.op = str;
        this.values = set;
    }

    public static final /* synthetic */ void KWHzl(EvaluationCondition evaluationCondition, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], evaluationCondition.selector);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, evaluationCondition.op);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], evaluationCondition.values);
    }
}
