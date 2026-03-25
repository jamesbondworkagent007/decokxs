package com.okinc.unify_trade.biz.bot;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class AiBotDto$$serializer implements GeneratedSerializer<AiBotDto> {
    public static final int $stable;
    public static final AiBotDto$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AiBotDto$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AiBotDto$$serializer aiBotDto$$serializer = new AiBotDto$$serializer();
        INSTANCE = aiBotDto$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.bot.AiBotDto", aiBotDto$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("investAmount", true);
        pluginGeneratedSerialDescriptor.addElement("investAmountCcy", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnl", true);
        pluginGeneratedSerialDescriptor.addElement("totalPnlRate", true);
        pluginGeneratedSerialDescriptor.addElement("realizedPnl", true);
        pluginGeneratedSerialDescriptor.addElement("realizedPnlRate", true);
        pluginGeneratedSerialDescriptor.addElement("upl", true);
        pluginGeneratedSerialDescriptor.addElement("uplRate", true);
        pluginGeneratedSerialDescriptor.addElement("totalApy", true);
        pluginGeneratedSerialDescriptor.addElement("winRate", true);
        pluginGeneratedSerialDescriptor.addElement("profitLossRatio", true);
        pluginGeneratedSerialDescriptor.addElement("maxDrawDown", true);
        pluginGeneratedSerialDescriptor.addElement("sharpeRatio", true);
        pluginGeneratedSerialDescriptor.addElement("aiModel", true);
        pluginGeneratedSerialDescriptor.addElement("instIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AiBotDto.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, AiModelDto$$serializer.INSTANCE, kSerializerArr[14]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AiBotDto deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AiModelDto aiModelDto;
        String str7;
        String str8;
        List list;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AiBotDto.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            AiModelDto aiModelDto2 = (AiModelDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, AiModelDto$$serializer.INSTANCE, null);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            aiModelDto = aiModelDto2;
            str11 = strDecodeStringElement12;
            str13 = strDecodeStringElement11;
            str = strDecodeStringElement10;
            str12 = strDecodeStringElement8;
            str9 = strDecodeStringElement7;
            str3 = strDecodeStringElement6;
            str7 = strDecodeStringElement9;
            str2 = strDecodeStringElement13;
            str10 = strDecodeStringElement3;
            str6 = strDecodeStringElement;
            str5 = strDecodeStringElement2;
            i = 32767;
            str4 = strDecodeStringElement4;
            str8 = strDecodeStringElement5;
        } else {
            int i2 = 14;
            int i3 = 0;
            boolean z = true;
            List list2 = null;
            AiModelDto aiModelDto3 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 14;
                        break;
                    case 0:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 14;
                        break;
                    case 1:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 14;
                        break;
                    case 2:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 14;
                        break;
                    case 3:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 14;
                        break;
                    case 4:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 14;
                        break;
                    case 5:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 14;
                        break;
                    case 6:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 14;
                        break;
                    case 7:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 14;
                        break;
                    case 8:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 14;
                        break;
                    case 9:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 14;
                        break;
                    case 10:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 14;
                        break;
                    case 11:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 14;
                        break;
                    case 12:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 14;
                        break;
                    case 13:
                        aiModelDto3 = (AiModelDto) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, AiModelDto$$serializer.INSTANCE, aiModelDto3);
                        i3 |= 8192;
                        i2 = 14;
                        break;
                    case 14:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i2, kSerializerArr[i2], list2);
                        i3 |= 16384;
                        i2 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = strDecodeStringElement16;
            str2 = strDecodeStringElement19;
            str3 = strDecodeStringElement22;
            str4 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            aiModelDto = aiModelDto3;
            str7 = strDecodeStringElement15;
            str8 = strDecodeStringElement23;
            list = list2;
            String str14 = strDecodeStringElement17;
            str9 = strDecodeStringElement14;
            str10 = strDecodeStringElement21;
            str11 = strDecodeStringElement18;
            str12 = strDecodeStringElement20;
            str13 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AiBotDto(i, str6, str5, str10, str4, str8, str3, str9, str12, str7, str, str13, str11, str2, aiModelDto, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AiBotDto aiBotDto) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aiBotDto, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AiBotDto.write$Self$OKTradeCore_trade_core(aiBotDto, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
