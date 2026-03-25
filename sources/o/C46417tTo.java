package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tTo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46417tTo implements KSerializer<java.lang.Long> {
    public static final C46417tTo KWHzl = new C46417tTo();
    public static final SerialDescriptor OLrzqt = SerialDescriptorsKt.PrimitiveSerialDescriptor("com.okinc.planet.serializer.LongAsStringSerializer", PrimitiveKind.STRING.INSTANCE);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return OLrzqt;
    }

    private C46417tTo() {
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, java.lang.Object obj) {
        OLrzqt(encoder, ((java.lang.Number) obj).longValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public java.lang.Long deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return java.lang.Long.valueOf(C33129mqd.valueOf(decoder.decodeString()));
    }

    public void OLrzqt(@NotNull Encoder encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeString(java.lang.String.valueOf(j));
    }
}
