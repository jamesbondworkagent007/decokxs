package o;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tTl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46414tTl implements KSerializer<BigDecimal> {
    public static final C46414tTl KWHzl = new C46414tTl();
    public static final SerialDescriptor EZpvd = SerialDescriptorsKt.PrimitiveSerialDescriptor("com.okinc.planet.serializer.BigDecimalAsStringSerializer", PrimitiveKind.STRING.INSTANCE);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return EZpvd;
    }

    private C46414tTl() {
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public BigDecimal deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return C33129mqd.EZpvd(decoder.decodeString());
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        java.lang.String string = bigDecimal.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        encoder.encodeString(string);
    }
}
