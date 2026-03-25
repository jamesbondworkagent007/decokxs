package o;

import java.lang.Enum;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C45303snJ<T extends java.lang.Enum<?>> implements KSerializer<T> {
    public final Function1<java.lang.Integer, T> AEQbTJ;
    public final SerialDescriptor EZpvd;
    public final Function1<T, java.lang.Integer> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T extends java.lang.Enum<?>, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T extends java.lang.Enum<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C45303snJ(@NotNull java.lang.String str, @NotNull Function1<? super T, java.lang.Integer> function1, @NotNull Function1<? super java.lang.Integer, ? extends T> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.KWHzl = function1;
        this.AEQbTJ = function12;
        this.EZpvd = SerialDescriptorsKt.PrimitiveSerialDescriptor(str, PrimitiveKind.INT.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        encoder.encodeInt(this.KWHzl.invoke(t).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return this.AEQbTJ.invoke(java.lang.Integer.valueOf(decoder.decodeInt()));
    }
}
