package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public class xVI<T> implements KSerializer<T> {
    public final KSerializer<T> AEQbTJ;
    public final Function0<T> KWHzl;
    public final SerialDescriptor OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public xVI(@NotNull KSerializer<T> kSerializer, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(kSerializer, "");
        this.AEQbTJ = kSerializer;
        this.KWHzl = function0;
        this.OLrzqt = kSerializer.getDescriptor();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 kotlinx.serialization.KSerializer)
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r2v0 kotlin.jvm.functions.Function0))
 A[MD:(kotlinx.serialization.KSerializer<T>, kotlin.jvm.functions.Function0<? extends T>):void (m)] (LINE:11) call: o.xVI.<init>(kotlinx.serialization.KSerializer, kotlin.jvm.functions.Function0):void type: THIS */
    public /* synthetic */ xVI(KSerializer kSerializer, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, (i & 2) != 0 ? null : function0);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, T t) {
        Intrinsics.checkNotNullParameter(encoder, "");
        KSerializer<T> kSerializer = this.AEQbTJ;
        Intrinsics.copydefault(t);
        encoder.encodeSerializableValue(kSerializer, t);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public T deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        try {
            return (T) decoder.decodeSerializableValue(this.AEQbTJ);
        } catch (java.lang.Exception unused) {
            Function0<T> function0 = this.KWHzl;
            if (function0 != null) {
                return function0.invoke();
            }
            return null;
        }
    }
}
