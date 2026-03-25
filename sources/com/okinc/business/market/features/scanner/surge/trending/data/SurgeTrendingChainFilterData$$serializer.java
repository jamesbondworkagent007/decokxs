package com.okinc.business.market.features.scanner.surge.trending.data;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class SurgeTrendingChainFilterData$$serializer implements GeneratedSerializer<SurgeTrendingChainFilterData> {
    public static final int $stable;
    public static final SurgeTrendingChainFilterData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SurgeTrendingChainFilterData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SurgeTrendingChainFilterData$$serializer surgeTrendingChainFilterData$$serializer = new SurgeTrendingChainFilterData$$serializer();
        INSTANCE = surgeTrendingChainFilterData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.features.scanner.surge.trending.data.SurgeTrendingChainFilterData", surgeTrendingChainFilterData$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("rankType", true);
        pluginGeneratedSerialDescriptor.addElement("selectedProtocols", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMin", true);
        pluginGeneratedSerialDescriptor.addElement("marketCapMax", true);
        pluginGeneratedSerialDescriptor.addElement("volumeMin", true);
        pluginGeneratedSerialDescriptor.addElement("volumeMax", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMin", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeMax", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAgeTypeValue", true);
        pluginGeneratedSerialDescriptor.addElement("keyword", true);
        pluginGeneratedSerialDescriptor.addElement("needSocialLink", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = SurgeTrendingChainFilterData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, stringSerializer, BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SurgeTrendingChainFilterData deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        String str;
        int i;
        List list;
        String str2;
        String str3;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = SurgeTrendingChainFilterData.$childSerializers;
        int i4 = 10;
        int i5 = 9;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            list = list2;
            str5 = strDecodeStringElement2;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement8;
            str6 = strDecodeStringElement7;
            str4 = strDecodeStringElement6;
            str7 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            i = iDecodeIntElement;
            str8 = strDecodeStringElement5;
            i2 = 2047;
        } else {
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            int i6 = 0;
            int iDecodeIntElement2 = 0;
            List list3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        i6 |= 2;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], list3);
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 2:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        break;
                    case 3:
                        i6 |= 8;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 = i6 | 16;
                        i6 = i3;
                        break;
                    case 5:
                        i6 |= 32;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i6 |= 64;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        break;
                    case 8:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i3 = i6 | 256;
                        i6 = i3;
                        break;
                    case 9:
                        i6 |= 512;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        break;
                    case 10:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i4);
                        i3 = i6 | 1024;
                        i6 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = strDecodeStringElement11;
            i = iDecodeIntElement2;
            list = list3;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement15;
            i2 = i6;
            str4 = strDecodeStringElement10;
            str5 = strDecodeStringElement16;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement14;
            str8 = strDecodeStringElement;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SurgeTrendingChainFilterData(i2, str5, list, str3, str7, str8, str4, str6, str2, i, str, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SurgeTrendingChainFilterData surgeTrendingChainFilterData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(surgeTrendingChainFilterData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SurgeTrendingChainFilterData.write$Self$OKDex_dex_impl(surgeTrendingChainFilterData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
