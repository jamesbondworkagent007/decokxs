package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class RemainingRepaymentInfo$$serializer implements GeneratedSerializer<RemainingRepaymentInfo> {
    public static final int $stable;
    public static final RemainingRepaymentInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RemainingRepaymentInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RemainingRepaymentInfo$$serializer remainingRepaymentInfo$$serializer = new RemainingRepaymentInfo$$serializer();
        INSTANCE = remainingRepaymentInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.RemainingRepaymentInfo", remainingRepaymentInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("remainingRepayment", true);
        pluginGeneratedSerialDescriptor.addElement("realRemainingRepayment", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
        return new KSerializer[]{investTokenWithAmount$$serializer, investTokenWithAmount$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RemainingRepaymentInfo deserialize(@NotNull Decoder decoder) {
        InvestTokenWithAmount investTokenWithAmount;
        InvestTokenWithAmount investTokenWithAmount2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            InvestTokenWithAmount$$serializer investTokenWithAmount$$serializer = InvestTokenWithAmount$$serializer.INSTANCE;
            investTokenWithAmount2 = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, investTokenWithAmount$$serializer, null);
            investTokenWithAmount = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, investTokenWithAmount$$serializer, null);
            i = 3;
        } else {
            investTokenWithAmount = null;
            InvestTokenWithAmount investTokenWithAmount3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    investTokenWithAmount3 = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, InvestTokenWithAmount$$serializer.INSTANCE, investTokenWithAmount3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    investTokenWithAmount = (InvestTokenWithAmount) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, InvestTokenWithAmount$$serializer.INSTANCE, investTokenWithAmount);
                    i2 |= 2;
                }
            }
            investTokenWithAmount2 = investTokenWithAmount3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RemainingRepaymentInfo(i, investTokenWithAmount2, investTokenWithAmount, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RemainingRepaymentInfo remainingRepaymentInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(remainingRepaymentInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RemainingRepaymentInfo.write$Self$OKDeFi_invest_biz(remainingRepaymentInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
