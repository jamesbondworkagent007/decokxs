package o;

import com.okinc.biz.model.RatingDisplayStatus;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aXc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6874aXc implements KSerializer<RatingDisplayStatus> {
    public final SerialDescriptor KWHzl = SerialDescriptorsKt.PrimitiveSerialDescriptor("RatingDisplayStatus", PrimitiveKind.INT.INSTANCE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public void serialize(@NotNull Encoder encoder, @NotNull RatingDisplayStatus ratingDisplayStatus) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ratingDisplayStatus, "");
        encoder.encodeInt(ratingDisplayStatus.getValue());
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public RatingDisplayStatus deserialize(@NotNull Decoder decoder) {
        RatingDisplayStatus ratingDisplayStatus;
        Intrinsics.checkNotNullParameter(decoder, "");
        int iDecodeInt = decoder.decodeInt();
        RatingDisplayStatus[] ratingDisplayStatusArrValues = RatingDisplayStatus.values();
        int length = ratingDisplayStatusArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ratingDisplayStatus = null;
                break;
            }
            ratingDisplayStatus = ratingDisplayStatusArrValues[i];
            if (ratingDisplayStatus.getValue() == iDecodeInt) {
                break;
            }
            i++;
        }
        return ratingDisplayStatus == null ? RatingDisplayStatus.Unknown : ratingDisplayStatus;
    }
}
