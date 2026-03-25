package com.amplitude.experiment.evaluation;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class EvaluationBucket {
    public final List<EvaluationAllocation> allocations;
    public final String salt;
    public final List<String> selector;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(StringSerializer.INSTANCE), null, new ArrayListSerializer(EvaluationAllocation$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplitude.experiment.evaluation.EvaluationBucket */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationBucket copy$default(EvaluationBucket evaluationBucket, List list, String str, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = evaluationBucket.selector;
        }
        if ((i & 2) != 0) {
            str = evaluationBucket.salt;
        }
        if ((i & 4) != 0) {
            list2 = evaluationBucket.allocations;
        }
        return evaluationBucket.copydefault(list, str, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> AEQbTJ() {
        return this.selector;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EvaluationAllocation> KWHzl() {
        return this.allocations;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationBucket copydefault(@NotNull List<String> list, @NotNull String str, @NotNull List<EvaluationAllocation> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new EvaluationBucket(list, str, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.salt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationBucket)) {
            return false;
        }
        EvaluationBucket evaluationBucket = (EvaluationBucket) obj;
        return Intrinsics.EZpvd(this.selector, evaluationBucket.selector) && Intrinsics.EZpvd((Object) this.salt, (Object) evaluationBucket.salt) && Intrinsics.EZpvd(this.allocations, evaluationBucket.allocations);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.selector.hashCode() * 31) + this.salt.hashCode()) * 31) + this.allocations.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvaluationBucket(selector=" + this.selector + ", salt=" + this.salt + ", allocations=" + this.allocations + ')';
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationBucket.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationBucket> serializer() {
            return EvaluationBucket$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvaluationBucket(int i, List list, String str, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EvaluationBucket$$serializer.INSTANCE.getDescriptor());
        }
        this.selector = list;
        this.salt = str;
        this.allocations = list2;
    }

    public EvaluationBucket(@NotNull List<String> list, @NotNull String str, @NotNull List<EvaluationAllocation> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.selector = list;
        this.salt = str;
        this.allocations = list2;
    }

    public static final /* synthetic */ void EZpvd(EvaluationBucket evaluationBucket, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], evaluationBucket.selector);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, evaluationBucket.salt);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], evaluationBucket.allocations);
    }
}
