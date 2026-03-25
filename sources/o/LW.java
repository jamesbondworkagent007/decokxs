package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LW implements KSerializer<java.lang.Object> {
    public static final LW AEQbTJ = new LW();
    public static final KSerializer<JsonElement> KWHzl = JsonElement.Companion.serializer();

    private LW() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return SerialDescriptorsKt.SerialDescriptor("Any", KWHzl.getDescriptor());
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeSerializableValue(KWHzl, LU.EZpvd(obj));
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.LU.AEQbTJ(kotlinx.serialization.json.JsonElement):java.lang.Object */
    @Override // kotlinx.serialization.DeserializationStrategy
    public java.lang.Object deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return LU.AEQbTJ((JsonElement) decoder.decodeSerializableValue(KWHzl));
    }
}
