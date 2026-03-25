package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tTi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46411tTi implements KSerializer<java.lang.Boolean> {
    public static final C46411tTi OLrzqt = new C46411tTi();
    public static final SerialDescriptor KWHzl = SerialDescriptorsKt.PrimitiveSerialDescriptor("com.okinc.planet.serializer.BooleanAsStringSerializer", PrimitiveKind.STRING.INSTANCE);
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return KWHzl;
    }

    private C46411tTi() {
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public /* synthetic */ void serialize(Encoder encoder, java.lang.Object obj) {
        KWHzl(encoder, ((java.lang.Boolean) obj).booleanValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public java.lang.Boolean deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        try {
            return java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) decoder.decodeString(), (java.lang.Object) "1"));
        } catch (java.lang.Exception unused) {
            return java.lang.Boolean.FALSE;
        }
    }

    public void KWHzl(@NotNull Encoder encoder, boolean z) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeString(z ? "1" : "0");
    }
}
