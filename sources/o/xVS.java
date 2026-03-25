package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVS implements KSerializer<java.lang.Boolean> {
    public static final xVS AEQbTJ = new xVS();
    public static final SerialDescriptor EZpvd = SerialDescriptorsKt.PrimitiveSerialDescriptor("com.okinc.unify_trade.utils.serializer.BooleanAsStringSerializer", PrimitiveKind.STRING.INSTANCE);
    public static final int copydefault = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return EZpvd;
    }

    private xVS() {
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, java.lang.Object obj) {
        EZpvd(encoder, ((java.lang.Boolean) obj).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        try {
            return java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) decoder.decodeString(), (java.lang.Object) "true"));
        } catch (java.lang.Exception unused) {
            return java.lang.Boolean.FALSE;
        }
    }

    public void EZpvd(@NotNull Encoder encoder, boolean z) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeString(z ? "true" : "false");
    }
}
