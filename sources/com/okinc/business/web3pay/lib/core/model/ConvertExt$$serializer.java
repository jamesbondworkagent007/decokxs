package com.okinc.business.web3pay.lib.core.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class ConvertExt$$serializer implements GeneratedSerializer<ConvertExt> {
    public static final int $stable;
    public static final ConvertExt$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ConvertExt$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConvertExt$$serializer convertExt$$serializer = new ConvertExt$$serializer();
        INSTANCE = convertExt$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.core.model.ConvertExt", convertExt$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("toTokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("toNetworkName", false);
        pluginGeneratedSerialDescriptor.addElement("fromChainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("toChainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("bidPx", false);
        pluginGeneratedSerialDescriptor.addElement("stages", false);
        pluginGeneratedSerialDescriptor.addElement("failedType", false);
        pluginGeneratedSerialDescriptor.addElement("convertStageFinished", false);
        pluginGeneratedSerialDescriptor.addElement("convertOrderType", false);
        pluginGeneratedSerialDescriptor.addElement("estimatedSeconds", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = ConvertExt.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[9], kSerializerArr[10], BooleanSerializer.INSTANCE, kSerializerArr[12], intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ConvertExt deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        boolean z;
        int iDecodeIntElement;
        ConvertOrderType convertOrderType;
        List list;
        ConvertFailedType convertFailedType;
        String str6;
        int i2;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ConvertExt.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            ConvertFailedType convertFailedType2 = (ConvertFailedType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            convertOrderType = (ConvertOrderType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            str4 = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
            str6 = strDecodeStringElement8;
            str8 = strDecodeStringElement4;
            str2 = strDecodeStringElement2;
            list = list2;
            convertFailedType = convertFailedType2;
            z = zDecodeBooleanElement;
            str3 = strDecodeStringElement;
            i2 = 16383;
            i = iDecodeIntElement2;
            str = strDecodeStringElement3;
        } else {
            int i3 = 13;
            List list3 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            int i4 = 0;
            int iDecodeIntElement3 = 0;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            ConvertFailedType convertFailedType3 = null;
            int iDecodeIntElement4 = 0;
            ConvertOrderType convertOrderType2 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 13;
                        break;
                    case 0:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 13;
                        break;
                    case 1:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 13;
                        break;
                    case 2:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 13;
                        break;
                    case 3:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i3 = 13;
                        break;
                    case 4:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        i3 = 13;
                        break;
                    case 5:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 13;
                        break;
                    case 6:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i3 = 13;
                        break;
                    case 7:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i3 = 13;
                        break;
                    case 8:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 |= 256;
                        i3 = 13;
                        break;
                    case 9:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], list3);
                        i4 |= 512;
                        i3 = 13;
                        break;
                    case 10:
                        convertFailedType3 = (ConvertFailedType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], convertFailedType3);
                        i4 |= 1024;
                        i3 = 13;
                        break;
                    case 11:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i4 |= 2048;
                        i3 = 13;
                        break;
                    case 12:
                        convertOrderType2 = (ConvertOrderType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], convertOrderType2);
                        i4 |= 4096;
                        i3 = 13;
                        break;
                    case 13:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i3);
                        i4 |= 8192;
                        i3 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement11;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement14;
            str5 = strDecodeStringElement15;
            i = iDecodeIntElement3;
            z = zDecodeBooleanElement2;
            iDecodeIntElement = iDecodeIntElement4;
            convertOrderType = convertOrderType2;
            list = list3;
            convertFailedType = convertFailedType3;
            str6 = strDecodeStringElement10;
            i2 = i4;
            str7 = strDecodeStringElement9;
            str8 = strDecodeStringElement16;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConvertExt(i2, str3, i, str2, str, str8, str7, str5, str4, str6, list, convertFailedType, z, convertOrderType, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ConvertExt convertExt) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(convertExt, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConvertExt.write$Self$OKPayCore_web3pay_lib(convertExt, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
