package o;

import java.lang.Enum;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public class rXB<T extends java.lang.Enum<?>> implements KSerializer<T> {
    public final T[] AEQbTJ;
    public final Function1<T, java.lang.Integer> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final Function1<java.lang.Integer, T> OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super T extends java.lang.Enum<?>, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T extends java.lang.Enum<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public rXB(@NotNull final java.lang.String str, @NotNull T[] tArr, @NotNull Function1<? super T, java.lang.Integer> function1, @NotNull Function1<? super java.lang.Integer, ? extends T> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = tArr;
        this.EZpvd = function1;
        this.OLrzqt = function12;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.rXF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rXB.OLrzqt(str);
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.rXG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return rXB.copydefault(this.EZpvd);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.copydefault.getValue();
    }

    public static final SerialDescriptor OLrzqt(java.lang.String str) {
        return SerialDescriptorsKt.PrimitiveSerialDescriptor(str, PrimitiveKind.INT.INSTANCE);
    }

    public final java.util.Map<java.lang.Integer, T> EZpvd() {
        return (java.util.Map) this.KWHzl.getValue();
    }

    public static final java.util.Map copydefault(rXB rxb) {
        T[] tArr = rxb.AEQbTJ;
        Function1<T, java.lang.Integer> function1 = rxb.EZpvd;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(tArr.length), 16));
        for (T t : tArr) {
            linkedHashMap.put(function1.invoke(t), t);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        encoder.encodeInt(this.EZpvd.invoke(t).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        int iDecodeInt = decoder.decodeInt();
        T t = EZpvd().get(java.lang.Integer.valueOf(iDecodeInt));
        return t == null ? this.OLrzqt.invoke(java.lang.Integer.valueOf(iDecodeInt)) : t;
    }
}
