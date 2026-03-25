package o;

import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C55802xqn implements KSerializer<TacticsVoucherInfo> {
    public static final C55802xqn OLrzqt = new C55802xqn();
    public static final SerialDescriptor EZpvd = SerialDescriptorsKt.buildClassSerialDescriptor$default("TacticsVoucherInfo", new SerialDescriptor[0], null, 4, null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return EZpvd;
    }

    private C55802xqn() {
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, TacticsVoucherInfo tacticsVoucherInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        if (tacticsVoucherInfo != null) {
            encoder.encodeSerializableValue(TacticsVoucherInfo.Companion.serializer(), tacticsVoucherInfo);
        } else {
            encoder.encodeNull();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public TacticsVoucherInfo deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "");
        JsonObject jsonObject = (JsonObject) decoder.decodeSerializableValue(JsonObject.Companion.serializer());
        if (jsonObject.isEmpty()) {
            return null;
        }
        return (TacticsVoucherInfo) Json.Default.decodeFromJsonElement(TacticsVoucherInfo.Companion.serializer(), jsonObject);
    }
}
