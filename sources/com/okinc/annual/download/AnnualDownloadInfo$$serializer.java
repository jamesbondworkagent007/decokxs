package com.okinc.annual.download;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class AnnualDownloadInfo$$serializer implements GeneratedSerializer<AnnualDownloadInfo> {
    public static final int $stable;
    public static final AnnualDownloadInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AnnualDownloadInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AnnualDownloadInfo$$serializer annualDownloadInfo$$serializer = new AnnualDownloadInfo$$serializer();
        INSTANCE = annualDownloadInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.annual.download.AnnualDownloadInfo", annualDownloadInfo$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("saveDirectoryName", true);
        pluginGeneratedSerialDescriptor.addElement("zipFileUrl", true);
        pluginGeneratedSerialDescriptor.addElement("zipFileName", true);
        pluginGeneratedSerialDescriptor.addElement("zipMD5", true);
        pluginGeneratedSerialDescriptor.addElement("audioName", true);
        pluginGeneratedSerialDescriptor.addElement("audioMD5", true);
        pluginGeneratedSerialDescriptor.addElement("lottieFoldName", true);
        pluginGeneratedSerialDescriptor.addElement("lottieMD5List", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("imageFoldName", true);
        pluginGeneratedSerialDescriptor.addElement("imageMD5List", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AnnualDownloadInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[7], IntSerializer.INSTANCE, stringSerializer, kSerializerArr[10]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AnnualDownloadInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        List list;
        String str2;
        int i2;
        List list2;
        String strDecodeStringElement2;
        String str3;
        String str4;
        String str5;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AnnualDownloadInfo.$childSerializers;
        int i3 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            List list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str3 = strDecodeStringElement9;
            str5 = strDecodeStringElement8;
            strDecodeStringElement = strDecodeStringElement7;
            str4 = strDecodeStringElement5;
            i2 = iDecodeIntElement;
            str6 = strDecodeStringElement6;
            str2 = strDecodeStringElement4;
            i = 2047;
            list2 = list3;
            str = strDecodeStringElement3;
        } else {
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            List list4 = null;
            int i4 = 0;
            List list5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 9;
                        break;
                    case 0:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 9;
                        break;
                    case 1:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 9;
                        break;
                    case 2:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        i4 |= 128;
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], list5);
                        break;
                    case 8:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i4 |= 256;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        break;
                    case 10:
                        i4 |= 1024;
                        list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], list4);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = strDecodeStringElement16;
            list = list4;
            str2 = strDecodeStringElement14;
            i2 = iDecodeIntElement2;
            String str7 = strDecodeStringElement13;
            list2 = list5;
            strDecodeStringElement2 = strDecodeStringElement15;
            str3 = strDecodeStringElement10;
            str4 = str7;
            String str8 = strDecodeStringElement12;
            str5 = strDecodeStringElement11;
            str6 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AnnualDownloadInfo(i, str, strDecodeStringElement2, str2, str4, str6, strDecodeStringElement, str5, list2, i2, str3, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AnnualDownloadInfo annualDownloadInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(annualDownloadInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AnnualDownloadInfo.write$Self$OKGrowthTools_biz_rewards(annualDownloadInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
