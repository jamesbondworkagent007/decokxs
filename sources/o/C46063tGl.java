package o;

import com.okinc.planet.biz_positions.data.ClosePositionType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tGl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46063tGl implements KSerializer<ClosePositionType> {
    public static final C46063tGl KWHzl = new C46063tGl();
    public static final SerialDescriptor copydefault = ClosePositionType.Companion.serializer().getDescriptor();
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return copydefault;
    }

    private C46063tGl() {
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, ClosePositionType closePositionType) {
        Intrinsics.checkNotNullParameter(encoder, "");
        KSerializer<ClosePositionType> kSerializerSerializer = ClosePositionType.Companion.serializer();
        if (closePositionType == null) {
            closePositionType = ClosePositionType.Full;
        }
        kSerializerSerializer.serialize(encoder, closePositionType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [17=5] */
    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public ClosePositionType deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        java.lang.String strDecodeString = decoder.decodeString();
        switch (strDecodeString.hashCode()) {
            case -1835136571:
                if (strDecodeString.equals("partClose")) {
                    return ClosePositionType.Partial;
                }
                return null;
            case -1325765694:
                if (strDecodeString.equals("liquidateClose")) {
                    return ClosePositionType.Liquidated;
                }
                return null;
            case 96425:
                if (strDecodeString.equals("adl")) {
                    return ClosePositionType.ADL;
                }
                return null;
            case 1760212525:
                if (strDecodeString.equals("liquidateReceive")) {
                    return ClosePositionType.ForceReduce;
                }
                return null;
            case 1772179671:
                if (strDecodeString.equals("allClose")) {
                    return ClosePositionType.Full;
                }
                return null;
            default:
                return null;
        }
    }
}
