package o;

import com.okinc.business.web3pay.lib.core.model.SaCardFundDirection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31267lqm implements KSerializer<SaCardFundDirection> {
    public static final C31267lqm copydefault = new C31267lqm();
    public static final SerialDescriptor KWHzl = SerialDescriptorsKt.PrimitiveSerialDescriptor("Direction", PrimitiveKind.INT.INSTANCE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return KWHzl;
    }

    private C31267lqm() {
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public SaCardFundDirection deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        try {
            return SaCardFundDirection.Companion.EZpvd(java.lang.Integer.valueOf(decoder.decodeInt()));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, SaCardFundDirection saCardFundDirection) {
        Intrinsics.checkNotNullParameter(encoder, "");
        if (saCardFundDirection != null) {
            encoder.encodeInt(saCardFundDirection.getValue());
        } else {
            encoder.encodeNull();
        }
    }
}
