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

/* JADX INFO: renamed from: o.sPz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C44442sPz<T extends java.lang.Enum<?>> implements KSerializer<T> {
    public final T[] AEQbTJ;
    public final Function1<java.lang.Integer, T> EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final Function1<T, java.lang.Integer> OLrzqt;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super T extends java.lang.Enum<?>, java.lang.Integer> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends T extends java.lang.Enum<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C44442sPz(@NotNull final java.lang.String str, @NotNull T[] tArr, @NotNull Function1<? super T, java.lang.Integer> function1, @NotNull Function1<? super java.lang.Integer, ? extends T> function12) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = tArr;
        this.OLrzqt = function1;
        this.EZpvd = function12;
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.sPA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44442sPz.copydefault(str);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.sPy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44442sPz.KWHzl(this.OLrzqt);
            }
        });
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor copydefault(java.lang.String str) {
        return SerialDescriptorsKt.PrimitiveSerialDescriptor(str, PrimitiveKind.INT.INSTANCE);
    }

    private final java.util.Map<java.lang.Integer, T> AEQbTJ() {
        return (java.util.Map) this.copydefault.getValue();
    }

    public static final java.util.Map KWHzl(C44442sPz c44442sPz) {
        T[] tArr = c44442sPz.AEQbTJ;
        Function1<T, java.lang.Integer> function1 = c44442sPz.OLrzqt;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(tArr.length), 16));
        for (T t : tArr) {
            linkedHashMap.put(function1.invoke(t), t);
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(t, "");
        encoder.encodeInt(this.OLrzqt.invoke(t).intValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        int iDecodeInt = decoder.decodeInt();
        T t = AEQbTJ().get(java.lang.Integer.valueOf(iDecodeInt));
        return t == null ? this.EZpvd.invoke(java.lang.Integer.valueOf(iDecodeInt)) : t;
    }
}
