package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rvn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43784rvn<T> implements KSerializer<T> {
    public final SerialDescriptor AEQbTJ;
    public final KSerializer<T> AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.AEQbTJ;
    }

    public C43784rvn(@NotNull KSerializer<T> kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.AYXKKw = kSerializer;
        this.AEQbTJ = kSerializer.getDescriptor();
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        KSerializer<T> kSerializer = this.AYXKKw;
        Intrinsics.copydefault(t);
        encoder.encodeSerializableValue(kSerializer, t);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        try {
            return (T) decoder.decodeSerializableValue(this.AYXKKw);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
