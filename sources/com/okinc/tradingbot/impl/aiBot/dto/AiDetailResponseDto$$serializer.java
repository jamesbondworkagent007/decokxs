package com.okinc.tradingbot.impl.aiBot.dto;

import com.okinc.unify_trade.biz.DataSetting;
import com.okinc.unify_trade.biz.DataSetting$$serializer;
import com.okinc.unify_trade.biz.bot.AiModelDto;
import com.okinc.unify_trade.biz.bot.AiModelDto$$serializer;
import java.util.List;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class AiDetailResponseDto$$serializer implements GeneratedSerializer<AiDetailResponseDto> {
    public static final int $stable;
    public static final AiDetailResponseDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AiDetailResponseDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AiDetailResponseDto$$serializer aiDetailResponseDto$$serializer = new AiDetailResponseDto$$serializer();
        INSTANCE = aiDetailResponseDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.tradingbot.impl.aiBot.dto.AiDetailResponseDto", aiDetailResponseDto$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("aiModel", false);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("instIds", true);
        pluginGeneratedSerialDescriptor.addElement("tdMode", true);
        pluginGeneratedSerialDescriptor.addElement("dataSetting", true);
        pluginGeneratedSerialDescriptor.addElement("userPrompt", true);
        pluginGeneratedSerialDescriptor.addElement("userPromptEn", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AiDetailResponseDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{AiModelDto$$serializer.INSTANCE, stringSerializer, kSerializerArr[2], stringSerializer, DataSetting$$serializer.INSTANCE, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AiDetailResponseDto deserialize(@NotNull Decoder decoder) {
        List list;
        int i;
        String strDecodeStringElement;
        String str;
        DataSetting dataSetting;
        AiModelDto aiModelDto;
        String str2;
        String str3;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AiDetailResponseDto.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        DataSetting dataSetting2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            AiModelDto aiModelDto2 = (AiModelDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AiModelDto$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            DataSetting dataSetting3 = (DataSetting) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, DataSetting$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            list = list2;
            aiModelDto = aiModelDto2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            str2 = strDecodeStringElement4;
            str = strDecodeStringElement3;
            dataSetting = dataSetting3;
            str3 = strDecodeStringElement2;
            i = 127;
        } else {
            int i4 = 0;
            boolean z2 = true;
            String strDecodeStringElement5 = null;
            list = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            AiModelDto aiModelDto3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = false;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 0:
                        z = false;
                        i4 |= 1;
                        aiModelDto3 = (AiModelDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, AiModelDto$$serializer.INSTANCE, aiModelDto3);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        i4 |= 2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        break;
                    case 2:
                        i4 |= 4;
                        list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], list);
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i4 |= 16;
                        dataSetting2 = (DataSetting) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, DataSetting$$serializer.INSTANCE, dataSetting2);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            AiModelDto aiModelDto4 = aiModelDto3;
            i = i4;
            strDecodeStringElement = strDecodeStringElement6;
            str = strDecodeStringElement7;
            dataSetting = dataSetting2;
            aiModelDto = aiModelDto4;
            String str4 = strDecodeStringElement8;
            str2 = strDecodeStringElement5;
            str3 = str4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AiDetailResponseDto(i, aiModelDto, str3, list, str, dataSetting, str2, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AiDetailResponseDto aiDetailResponseDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aiDetailResponseDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AiDetailResponseDto.AEQbTJ(aiDetailResponseDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
