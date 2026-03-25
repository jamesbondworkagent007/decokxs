package o;

import com.okinc.okimcore.model.im.inhouseim.ws.SendReactionAction;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sQc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44446sQc implements KSerializer<SendReactionAction> {
    public static final C44446sQc OLrzqt = new C44446sQc();
    public static final SerialDescriptor KWHzl = SerialDescriptorsKt.PrimitiveSerialDescriptor("SendReactionAction", PrimitiveKind.INT.INSTANCE);
    public static final int EZpvd = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return KWHzl;
    }

    private C44446sQc() {
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull SendReactionAction sendReactionAction) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(sendReactionAction, "");
        encoder.encodeInt(sendReactionAction.getValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public SendReactionAction deserialize(@NotNull Decoder decoder) {
        SendReactionAction sendReactionAction;
        Intrinsics.checkNotNullParameter(decoder, "");
        int iDecodeInt = decoder.decodeInt();
        SendReactionAction[] sendReactionActionArrValues = SendReactionAction.values();
        int length = sendReactionActionArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                sendReactionAction = null;
                break;
            }
            sendReactionAction = sendReactionActionArrValues[i];
            if (sendReactionAction.getValue() == iDecodeInt) {
                break;
            }
            i++;
        }
        return sendReactionAction == null ? SendReactionAction.REMOVE : sendReactionAction;
    }
}
