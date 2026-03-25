package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class EstimatedClosePnlVo$$serializer implements GeneratedSerializer<EstimatedClosePnlVo> {
    public static final int $stable;
    public static final EstimatedClosePnlVo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EstimatedClosePnlVo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EstimatedClosePnlVo$$serializer estimatedClosePnlVo$$serializer = new EstimatedClosePnlVo$$serializer();
        INSTANCE = estimatedClosePnlVo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.EstimatedClosePnlVo", estimatedClosePnlVo$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("totalPnl", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedCloseGain", true);
        pluginGeneratedSerialDescriptor.addElement("interestAmt", true);
        pluginGeneratedSerialDescriptor.addElement("openCost", true);
        pluginGeneratedSerialDescriptor.addElement("estimatedCloseCost", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        CostVo$$serializer costVo$$serializer = CostVo$$serializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(GainVo$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(costVo$$serializer), BuiltinSerializersKt.getNullable(costVo$$serializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EstimatedClosePnlVo deserialize(@NotNull Decoder decoder) {
        int i;
        CostVo costVo;
        CostVo costVo2;
        String str;
        String str2;
        GainVo gainVo;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        CostVo costVo3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            GainVo gainVo2 = (GainVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GainVo$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            CostVo$$serializer costVo$$serializer = CostVo$$serializer.INSTANCE;
            str2 = strDecodeStringElement;
            costVo = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, costVo$$serializer, null);
            costVo2 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, costVo$$serializer, null);
            str = strDecodeStringElement2;
            gainVo = gainVo2;
            i = 31;
        } else {
            int i2 = 0;
            boolean z = true;
            CostVo costVo4 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            GainVo gainVo3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i2 |= 1;
                } else if (iDecodeElementIndex == 1) {
                    gainVo3 = (GainVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, GainVo$$serializer.INSTANCE, gainVo3);
                    i2 |= 2;
                } else if (iDecodeElementIndex == 2) {
                    strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i2 |= 4;
                } else if (iDecodeElementIndex == 3) {
                    costVo3 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CostVo$$serializer.INSTANCE, costVo3);
                    i2 |= 8;
                } else {
                    if (iDecodeElementIndex != 4) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    costVo4 = (CostVo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CostVo$$serializer.INSTANCE, costVo4);
                    i2 |= 16;
                }
            }
            i = i2;
            costVo = costVo3;
            costVo2 = costVo4;
            str = strDecodeStringElement3;
            str2 = strDecodeStringElement4;
            gainVo = gainVo3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EstimatedClosePnlVo(i, str2, gainVo, str, costVo, costVo2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EstimatedClosePnlVo estimatedClosePnlVo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(estimatedClosePnlVo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EstimatedClosePnlVo.write$Self$OKTradeCore_trade_core(estimatedClosePnlVo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
