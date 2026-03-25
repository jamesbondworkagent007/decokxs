package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dbh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13921dbh implements KSerializer<java.lang.String> {
    public static final C13921dbh copydefault = new C13921dbh();
    public static final SerialDescriptor EZpvd = SerialDescriptorsKt.PrimitiveSerialDescriptor("FlexibleString", PrimitiveKind.STRING.INSTANCE);
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return EZpvd;
    }

    private C13921dbh() {
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (encoder instanceof JsonEncoder) {
            ((JsonEncoder) encoder).encodeJsonElement(JsonElementKt.JsonPrimitive(str));
        } else {
            encoder.encodeString(str);
        }
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.String deserialize(@NotNull Decoder decoder) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(decoder, "");
        if (decoder instanceof JsonDecoder) {
            JsonElement jsonElementDecodeJsonElement = ((JsonDecoder) decoder).decodeJsonElement();
            if (jsonElementDecodeJsonElement instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementDecodeJsonElement;
                if (jsonPrimitive.isString()) {
                    return jsonPrimitive.getContent();
                }
                java.lang.Double doubleOrNull = JsonElementKt.getDoubleOrNull(jsonPrimitive);
                if (doubleOrNull == null || (string = doubleOrNull.toString()) == null) {
                    java.lang.Long longOrNull = JsonElementKt.getLongOrNull(jsonPrimitive);
                    if (longOrNull != null) {
                        return longOrNull.toString();
                    }
                    java.lang.Integer intOrNull = JsonElementKt.getIntOrNull(jsonPrimitive);
                    string = intOrNull != null ? intOrNull.toString() : null;
                    if (string == null) {
                        return jsonPrimitive.getContent();
                    }
                }
                return string;
            }
            return jsonElementDecodeJsonElement.toString();
        }
        return decoder.decodeString();
    }
}
