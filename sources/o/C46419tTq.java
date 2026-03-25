package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tTq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C46419tTq implements KSerializer<java.lang.Float> {
    public static final C46419tTq EZpvd = new C46419tTq();
    public static final SerialDescriptor AEQbTJ = SerialDescriptorsKt.PrimitiveSerialDescriptor("com.okinc.planet.serializer.FloatAsStringSerializer", PrimitiveKind.STRING.INSTANCE);
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return AEQbTJ;
    }

    private C46419tTq() {
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, java.lang.Object obj) {
        copydefault(encoder, ((java.lang.Number) obj).floatValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public java.lang.Float deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return java.lang.Float.valueOf(C33129mqd.djBIcL(decoder.decodeString()));
    }

    public void copydefault(@NotNull Encoder encoder, float f) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeString(java.lang.String.valueOf(f));
    }
}
