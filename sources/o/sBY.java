package o;

import com.okinc.okex.uploadlog.bean.ElementValue;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class sBY implements KSerializer<ElementValue> {
    public static final sBY KWHzl = new sBY();
    public static final SerialDescriptor copydefault = SerialDescriptorsKt.PrimitiveSerialDescriptor("ElementValue", PrimitiveKind.STRING.INSTANCE);
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return copydefault;
    }

    private sBY() {
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull ElementValue elementValue) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(elementValue, "");
        if (elementValue instanceof ElementValue.ElementString) {
            encoder.encodeString(((ElementValue.ElementString) elementValue).getData());
        } else {
            if (!(elementValue instanceof ElementValue.ElementBoolean)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.encodeBoolean(((ElementValue.ElementBoolean) elementValue).getData());
        }
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ElementValue deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        JsonDecoder jsonDecoder = decoder instanceof JsonDecoder ? (JsonDecoder) decoder : null;
        if (jsonDecoder == null) {
            throw new SerializationException("Expected JSON decoder");
        }
        JsonElement jsonElementDecodeJsonElement = jsonDecoder.decodeJsonElement();
        boolean z = jsonElementDecodeJsonElement instanceof JsonPrimitive;
        if (z) {
            JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementDecodeJsonElement;
            if (jsonPrimitive.isString()) {
                return new ElementValue.ElementString(jsonPrimitive.getContent());
            }
        }
        if (z) {
            JsonPrimitive jsonPrimitive2 = (JsonPrimitive) jsonElementDecodeJsonElement;
            if (JsonElementKt.getBooleanOrNull(jsonPrimitive2) != null) {
                return new ElementValue.ElementBoolean(JsonElementKt.getBoolean(jsonPrimitive2));
            }
        }
        throw new SerializationException("Invalid field value");
    }
}
