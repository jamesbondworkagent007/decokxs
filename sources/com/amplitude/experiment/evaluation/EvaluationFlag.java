package com.amplitude.experiment.evaluation;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.LW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class EvaluationFlag {
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion(null);
    public final Set<String> dependencies;
    public final String key;
    public final Map<String, Object> metadata;
    public final List<EvaluationSegment> segments;
    public final Map<String, EvaluationVariant> variants;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.amplitude.experiment.evaluation.EvaluationFlag */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationFlag copy$default(EvaluationFlag evaluationFlag, String str, Map map, List list, Set set, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = evaluationFlag.key;
        }
        if ((i & 2) != 0) {
            map = evaluationFlag.variants;
        }
        Map map3 = map;
        if ((i & 4) != 0) {
            list = evaluationFlag.segments;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            set = evaluationFlag.dependencies;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            map2 = evaluationFlag.metadata;
        }
        return evaluationFlag.KWHzl(str, map3, list2, set2, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> EZpvd() {
        return this.dependencies;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationFlag KWHzl(@NotNull String str, @NotNull Map<String, EvaluationVariant> map, @NotNull List<EvaluationSegment> list, Set<String> set, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EvaluationFlag(str, map, list, set, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> OLrzqt() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EvaluationSegment> copydefault() {
        return this.segments;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationFlag)) {
            return false;
        }
        EvaluationFlag evaluationFlag = (EvaluationFlag) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) evaluationFlag.key) && Intrinsics.EZpvd(this.variants, evaluationFlag.variants) && Intrinsics.EZpvd(this.segments, evaluationFlag.segments) && Intrinsics.EZpvd(this.dependencies, evaluationFlag.dependencies) && Intrinsics.EZpvd(this.metadata, evaluationFlag.metadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.key.hashCode();
        int iHashCode2 = this.variants.hashCode();
        int iHashCode3 = this.segments.hashCode();
        Set<String> set = this.dependencies;
        int iHashCode4 = set == null ? 0 : set.hashCode();
        Map<String, Object> map = this.metadata;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvaluationFlag(key=" + this.key + ", variants=" + this.variants + ", segments=" + this.segments + ", dependencies=" + this.dependencies + ", metadata=" + this.metadata + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, EvaluationVariant> valueOf() {
        return this.variants;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationFlag.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationFlag> serializer() {
            return EvaluationFlag$$serializer.INSTANCE;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new LinkedHashMapSerializer(stringSerializer, EvaluationVariant$$serializer.INSTANCE), new ArrayListSerializer(EvaluationSegment$$serializer.INSTANCE), new LinkedHashSetSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, BuiltinSerializersKt.getNullable(LW.AEQbTJ))};
    }

    public /* synthetic */ EvaluationFlag(int i, String str, Map map, List list, Set set, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, EvaluationFlag$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        this.variants = map;
        this.segments = list;
        if ((i & 8) == 0) {
            this.dependencies = null;
        } else {
            this.dependencies = set;
        }
        if ((i & 16) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map2;
        }
    }

    public EvaluationFlag(@NotNull String str, @NotNull Map<String, EvaluationVariant> map, @NotNull List<EvaluationSegment> list, Set<String> set, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.key = str;
        this.variants = map;
        this.segments = list;
        this.dependencies = set;
        this.metadata = map2;
    }

    public static final /* synthetic */ void AEQbTJ(EvaluationFlag evaluationFlag, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, evaluationFlag.key);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], evaluationFlag.variants);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], evaluationFlag.segments);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || evaluationFlag.dependencies != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], evaluationFlag.dependencies);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && evaluationFlag.metadata == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], evaluationFlag.metadata);
    }
}
