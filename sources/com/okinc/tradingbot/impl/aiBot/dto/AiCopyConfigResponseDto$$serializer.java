package com.okinc.tradingbot.impl.aiBot.dto;

import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AiOrderReq$$serializer;
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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class AiCopyConfigResponseDto$$serializer implements GeneratedSerializer<AiCopyConfigResponseDto> {
    public static final int $stable;
    public static final AiCopyConfigResponseDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AiCopyConfigResponseDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AiCopyConfigResponseDto$$serializer aiCopyConfigResponseDto$$serializer = new AiCopyConfigResponseDto$$serializer();
        INSTANCE = aiCopyConfigResponseDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.tradingbot.impl.aiBot.dto.AiCopyConfigResponseDto", aiCopyConfigResponseDto$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("aiBot", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{AiOrderReq$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AiCopyConfigResponseDto deserialize(@NotNull Decoder decoder) {
        AiOrderReq aiOrderReq;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i = 1;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            aiOrderReq = (AiOrderReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AiOrderReq$$serializer.INSTANCE, null);
        } else {
            aiOrderReq = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else {
                    if (iDecodeElementIndex != 0) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    aiOrderReq = (AiOrderReq) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AiOrderReq$$serializer.INSTANCE, aiOrderReq);
                    i2 = 1;
                }
            }
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AiCopyConfigResponseDto(i, aiOrderReq, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AiCopyConfigResponseDto aiCopyConfigResponseDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aiCopyConfigResponseDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, AiOrderReq$$serializer.INSTANCE, aiCopyConfigResponseDto.aiBot);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
