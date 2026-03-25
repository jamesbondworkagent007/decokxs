package com.okinc.unify_trade.biz;

import java.util.List;
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
public final /* synthetic */ class AiOrderReq$$serializer implements GeneratedSerializer<AiOrderReq> {
    public static final int $stable;
    public static final AiOrderReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AiOrderReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AiOrderReq$$serializer aiOrderReq$$serializer = new AiOrderReq$$serializer();
        INSTANCE = aiOrderReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.AiOrderReq", aiOrderReq$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("aiModel", true);
        pluginGeneratedSerialDescriptor.addElement("instIds", true);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("ordType", true);
        pluginGeneratedSerialDescriptor.addElement("tdMode", true);
        pluginGeneratedSerialDescriptor.addElement("dataSetting", true);
        pluginGeneratedSerialDescriptor.addElement("userPrompt", true);
        pluginGeneratedSerialDescriptor.addElement("userPromptEn", true);
        pluginGeneratedSerialDescriptor.addElement("totalAmt", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("tpRatio", true);
        pluginGeneratedSerialDescriptor.addElement("slRatio", true);
        pluginGeneratedSerialDescriptor.addElement("systemPromptVersion", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AiOrderReq.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, stringSerializer, DataSetting$$serializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AiOrderReq deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        DataSetting dataSetting;
        String str4;
        String str5;
        List list;
        String str6;
        String str7;
        String str8;
        String str9;
        String strDecodeStringElement;
        String str10;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AiOrderReq.$childSerializers;
        int i3 = 10;
        int i4 = 9;
        String str11 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            DataSetting dataSetting2 = (DataSetting) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, DataSetting$$serializer.INSTANCE, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str2 = strDecodeStringElement3;
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str4 = str12;
            str = strDecodeStringElement9;
            str6 = strDecodeStringElement7;
            str10 = strDecodeStringElement6;
            dataSetting = dataSetting2;
            str7 = strDecodeStringElement4;
            str8 = strDecodeStringElement8;
            str9 = strDecodeStringElement5;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            i = 8191;
            list = list2;
            str3 = strDecodeStringElement2;
        } else {
            int i5 = 12;
            boolean z = true;
            DataSetting dataSetting3 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            List list3 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            int i6 = 0;
            String str13 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 0:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 1:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list3);
                        i6 |= 2;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 2:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        i6 |= 16;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 = 12;
                        break;
                    case 5:
                        dataSetting3 = (DataSetting) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, DataSetting$$serializer.INSTANCE, dataSetting3);
                        i6 |= 32;
                        i5 = 12;
                        break;
                    case 6:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = i6 | 64;
                        i6 = i2;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 7:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = i6 | 128;
                        i6 = i2;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 8:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = i6 | 256;
                        i6 = i2;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 9:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i2 = i6 | 512;
                        i6 = i2;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 10:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str11);
                        i2 = i6 | 1024;
                        i6 = i2;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 11:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str13);
                        i2 = i6 | 2048;
                        i6 = i2;
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 12:
                        i6 |= 4096;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i5 = 12;
                        i3 = 10;
                        i4 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            List list4 = list3;
            i = i6;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement17;
            dataSetting = dataSetting3;
            str4 = str11;
            str5 = str13;
            list = list4;
            String str14 = strDecodeStringElement14;
            str6 = strDecodeStringElement10;
            str7 = strDecodeStringElement15;
            str8 = strDecodeStringElement11;
            str9 = strDecodeStringElement18;
            strDecodeStringElement = strDecodeStringElement13;
            str10 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AiOrderReq(i, str3, list, str2, str7, str9, dataSetting, str10, str6, str8, str, str4, str5, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AiOrderReq aiOrderReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aiOrderReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AiOrderReq.write$Self$OKTradeCore_trade_core(aiOrderReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
