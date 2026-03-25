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

/* JADX INFO: renamed from: o.aZg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C6984aZg<T extends java.lang.Enum<?>> implements KSerializer<T> {
    public final SerialDescriptor AEQbTJ;
    public final Function1<T, java.lang.String> OLrzqt;
    public final Function1<java.lang.String, T> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T extends java.lang.Enum<?>, java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T extends java.lang.Enum<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C6984aZg(@NotNull java.lang.String str, @NotNull Function1<? super T, java.lang.String> function1, @NotNull Function1<? super java.lang.String, ? extends T> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.OLrzqt = function1;
        this.copydefault = function12;
        this.AEQbTJ = SerialDescriptorsKt.PrimitiveSerialDescriptor(str, PrimitiveKind.STRING.INSTANCE);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        encoder.encodeString(this.OLrzqt.invoke(t));
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        return this.copydefault.invoke(decoder.decodeString());
    }
}
