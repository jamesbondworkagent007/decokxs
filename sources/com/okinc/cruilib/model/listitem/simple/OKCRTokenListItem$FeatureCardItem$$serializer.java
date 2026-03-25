package com.okinc.cruilib.model.listitem.simple;

import com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OKCRTokenListItem$FeatureCardItem$$serializer implements GeneratedSerializer<OKCRTokenListItem.FeatureCardItem> {
    public static final int $stable;
    public static final OKCRTokenListItem$FeatureCardItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRTokenListItem$FeatureCardItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRTokenListItem$FeatureCardItem$$serializer oKCRTokenListItem$FeatureCardItem$$serializer = new OKCRTokenListItem$FeatureCardItem$$serializer();
        INSTANCE = oKCRTokenListItem$FeatureCardItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.FeatureCardItem", oKCRTokenListItem$FeatureCardItem$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("cardName", false);
        pluginGeneratedSerialDescriptor.addElement("restrictionTag", false);
        pluginGeneratedSerialDescriptor.addElement("preHeader", false);
        pluginGeneratedSerialDescriptor.addElement("cardTitle", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement("darkBackground", false);
        pluginGeneratedSerialDescriptor.addElement("lightBackground", false);
        pluginGeneratedSerialDescriptor.addElement("ctaContent", false);
        pluginGeneratedSerialDescriptor.addElement("ctaDeeplink", false);
        pluginGeneratedSerialDescriptor.addElement("iconList", false);
        pluginGeneratedSerialDescriptor.addElement("submode", false);
        pluginGeneratedSerialDescriptor.addElement("isFrHide", false);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCRTokenListItem.FeatureCardItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[10], stringSerializer, BooleanSerializer.INSTANCE, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRTokenListItem.FeatureCardItem deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        String strDecodeStringElement;
        String str;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement2;
        String str7;
        String str8;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCRTokenListItem.FeatureCardItem.$childSerializers;
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            i = 16383;
            list = list2;
            str2 = strDecodeStringElement4;
            str4 = strDecodeStringElement5;
            str6 = strDecodeStringElement6;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str5 = strDecodeStringElement13;
            str8 = strDecodeStringElement11;
            str10 = strDecodeStringElement10;
            str9 = strDecodeStringElement9;
            str = strDecodeStringElement7;
            str3 = strDecodeStringElement12;
            str7 = strDecodeStringElement8;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
        } else {
            int i2 = 13;
            zDecodeBooleanElement = false;
            boolean z = true;
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
            int i3 = 0;
            List list3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 13;
                        break;
                    case 0:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 13;
                        break;
                    case 1:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 13;
                        break;
                    case 2:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 13;
                        break;
                    case 3:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 13;
                        break;
                    case 4:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 13;
                        break;
                    case 5:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 13;
                        break;
                    case 6:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 13;
                        break;
                    case 7:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 13;
                        break;
                    case 8:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 13;
                        break;
                    case 9:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 13;
                        break;
                    case 10:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], list3);
                        i3 |= 1024;
                        i2 = 13;
                        break;
                    case 11:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 13;
                        break;
                    case 12:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 13;
                        break;
                    case 13:
                        i3 |= 8192;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            strDecodeStringElement = strDecodeStringElement16;
            str = strDecodeStringElement21;
            str2 = strDecodeStringElement23;
            list = list3;
            str3 = strDecodeStringElement14;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement15;
            str6 = strDecodeStringElement24;
            strDecodeStringElement2 = strDecodeStringElement17;
            str7 = strDecodeStringElement20;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement19;
            str10 = strDecodeStringElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRTokenListItem.FeatureCardItem(i, str2, str4, str6, str, str7, str9, str10, str8, str3, str5, list, strDecodeStringElement2, zDecodeBooleanElement, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRTokenListItem.FeatureCardItem featureCardItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(featureCardItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRTokenListItem.FeatureCardItem.KWHzl(featureCardItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
