package com.okinc.tradingbot.impl.aiBot.dto;

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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class TpSlLimitDto$$serializer implements GeneratedSerializer<TpSlLimitDto> {
    public static final int $stable;
    public static final TpSlLimitDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TpSlLimitDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TpSlLimitDto$$serializer tpSlLimitDto$$serializer = new TpSlLimitDto$$serializer();
        INSTANCE = tpSlLimitDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.tradingbot.impl.aiBot.dto.TpSlLimitDto", tpSlLimitDto$$serializer, 2);
        pluginGeneratedSerialDescriptor.addElement("tp", true);
        pluginGeneratedSerialDescriptor.addElement("sl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        MinMaxDto$$serializer minMaxDto$$serializer = MinMaxDto$$serializer.INSTANCE;
        return new KSerializer[]{minMaxDto$$serializer, minMaxDto$$serializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TpSlLimitDto deserialize(@NotNull Decoder decoder) {
        MinMaxDto minMaxDto;
        MinMaxDto minMaxDto2;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        SerializationConstructorMarker serializationConstructorMarker = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            MinMaxDto$$serializer minMaxDto$$serializer = MinMaxDto$$serializer.INSTANCE;
            minMaxDto2 = (MinMaxDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, minMaxDto$$serializer, null);
            minMaxDto = (MinMaxDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, minMaxDto$$serializer, null);
            i = 3;
        } else {
            minMaxDto = null;
            MinMaxDto minMaxDto3 = null;
            int i2 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                if (iDecodeElementIndex == -1) {
                    z = false;
                } else if (iDecodeElementIndex == 0) {
                    minMaxDto3 = (MinMaxDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, MinMaxDto$$serializer.INSTANCE, minMaxDto3);
                    i2 |= 1;
                } else {
                    if (iDecodeElementIndex != 1) {
                        throw new UnknownFieldException(iDecodeElementIndex);
                    }
                    minMaxDto = (MinMaxDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, MinMaxDto$$serializer.INSTANCE, minMaxDto);
                    i2 |= 2;
                }
            }
            minMaxDto2 = minMaxDto3;
            i = i2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TpSlLimitDto(i, minMaxDto2, minMaxDto, serializationConstructorMarker);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TpSlLimitDto tpSlLimitDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tpSlLimitDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TpSlLimitDto.KWHzl(tpSlLimitDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
