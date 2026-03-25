package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.veB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C50965veB<T> implements KSerializer<T> {
    public final Function0<T> AEQbTJ;
    public final SerialDescriptor EZpvd;
    public final KSerializer<T> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C50965veB(@NotNull KSerializer<T> kSerializer, @NotNull Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        Intrinsics.checkNotNullParameter(function0, "");
        this.OLrzqt = kSerializer;
        this.AEQbTJ = function0;
        this.EZpvd = kSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        encoder.encodeSerializableValue(this.OLrzqt, t);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        try {
            return (T) decoder.decodeSerializableValue(this.OLrzqt);
        } catch (java.lang.Exception unused) {
            return this.AEQbTJ.invoke();
        }
    }
}
