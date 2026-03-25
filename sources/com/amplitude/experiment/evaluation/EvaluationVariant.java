package com.amplitude.experiment.evaluation;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.InterfaceC5293Md;
import o.LW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Serializable
public final class EvaluationVariant implements InterfaceC5293Md {
    public final String key;
    public final Map<String, Object> metadata;
    public final Object payload;
    public final Object value;
    public static final Companion Companion = new Companion(null);
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(LW.AEQbTJ))};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplitude.experiment.evaluation.EvaluationVariant */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EvaluationVariant copy$default(EvaluationVariant evaluationVariant, String str, Object obj, Object obj2, Map map, int i, Object obj3) {
        if ((i & 1) != 0) {
            str = evaluationVariant.key;
        }
        if ((i & 2) != 0) {
            obj = evaluationVariant.value;
        }
        if ((i & 4) != 0) {
            obj2 = evaluationVariant.payload;
        }
        if ((i & 8) != 0) {
            map = evaluationVariant.metadata;
        }
        return evaluationVariant.OLrzqt(str, obj, obj2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, Object> EZpvd() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object KWHzl() {
        return this.payload;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EvaluationVariant OLrzqt(@NotNull String str, Object obj, Object obj2, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EvaluationVariant(str, obj, obj2, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object copydefault() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EvaluationVariant)) {
            return false;
        }
        EvaluationVariant evaluationVariant = (EvaluationVariant) obj;
        return Intrinsics.EZpvd((Object) this.key, (Object) evaluationVariant.key) && Intrinsics.EZpvd(this.value, evaluationVariant.value) && Intrinsics.EZpvd(this.payload, evaluationVariant.payload) && Intrinsics.EZpvd(this.metadata, evaluationVariant.metadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.key.hashCode();
        Object obj = this.value;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.payload;
        int iHashCode3 = obj2 == null ? 0 : obj2.hashCode();
        Map<String, Object> map = this.metadata;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EvaluationVariant(key=" + this.key + ", value=" + this.value + ", payload=" + this.payload + ", metadata=" + this.metadata + ')';
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplitude.experiment.evaluation.EvaluationVariant.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<EvaluationVariant> serializer() {
            return EvaluationVariant$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EvaluationVariant(int i, String str, Object obj, Object obj2, Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, EvaluationVariant$$serializer.INSTANCE.getDescriptor());
        }
        this.key = str;
        if ((i & 2) == 0) {
            this.value = null;
        } else {
            this.value = obj;
        }
        if ((i & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = obj2;
        }
        if ((i & 8) == 0) {
            this.metadata = null;
        } else {
            this.metadata = map;
        }
    }

    public EvaluationVariant(@NotNull String str, Object obj, Object obj2, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(str, "");
        this.key = str;
        this.value = obj;
        this.payload = obj2;
        this.metadata = map;
    }

    public static final /* synthetic */ void OLrzqt(EvaluationVariant evaluationVariant, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, evaluationVariant.key);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || evaluationVariant.value != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LW.AEQbTJ, evaluationVariant.value);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || evaluationVariant.payload != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LW.AEQbTJ, evaluationVariant.payload);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && evaluationVariant.metadata == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], evaluationVariant.metadata);
    }

    @Override // o.InterfaceC5293Md
    public Object AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != -450004177) {
            if (iHashCode != 106079) {
                if (iHashCode == 111972721 && str.equals("value")) {
                    return this.value;
                }
            } else if (str.equals(JwtUtilsKt.DID_METHOD_KEY)) {
                return this.key;
            }
        } else if (str.equals(TtmlNode.TAG_METADATA)) {
            return this.metadata;
        }
        return null;
    }
}
