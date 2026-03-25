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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OKCRTokenListItem$SimpleCategoryCardItem$$serializer implements GeneratedSerializer<OKCRTokenListItem.SimpleCategoryCardItem> {
    public static final int $stable;
    public static final OKCRTokenListItem$SimpleCategoryCardItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRTokenListItem$SimpleCategoryCardItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRTokenListItem$SimpleCategoryCardItem$$serializer oKCRTokenListItem$SimpleCategoryCardItem$$serializer = new OKCRTokenListItem$SimpleCategoryCardItem$$serializer();
        INSTANCE = oKCRTokenListItem$SimpleCategoryCardItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.SimpleCategoryCardItem", oKCRTokenListItem$SimpleCategoryCardItem$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("categoryId", false);
        pluginGeneratedSerialDescriptor.addElement("categoryTitle", false);
        pluginGeneratedSerialDescriptor.addElement("categoryDescription", false);
        pluginGeneratedSerialDescriptor.addElement("categoryShortDescription", false);
        pluginGeneratedSerialDescriptor.addElement("categoryDarkIcon", true);
        pluginGeneratedSerialDescriptor.addElement("categoryLightIcon", true);
        pluginGeneratedSerialDescriptor.addElement("categoryPriceChange", false);
        pluginGeneratedSerialDescriptor.addElement("tokenList", false);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCRTokenListItem.SimpleCategoryCardItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[8], stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRTokenListItem.SimpleCategoryCardItem deserialize(@NotNull Decoder decoder) {
        List list;
        String strDecodeStringElement;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCRTokenListItem.SimpleCategoryCardItem.$childSerializers;
        int i2 = 9;
        String strDecodeStringElement2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            str4 = strDecodeStringElement3;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str5 = strDecodeStringElement10;
            str7 = strDecodeStringElement9;
            str3 = strDecodeStringElement8;
            str = strDecodeStringElement6;
            str2 = strDecodeStringElement7;
            str6 = strDecodeStringElement5;
            str8 = strDecodeStringElement4;
            i = 1023;
        } else {
            int i3 = 0;
            boolean z = true;
            List list2 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 9;
                        break;
                    case 0:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 9;
                        break;
                    case 1:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 9;
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 9;
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 9;
                        break;
                    case 5:
                        i3 |= 32;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = 9;
                        break;
                    case 6:
                        i3 |= 64;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 9;
                        break;
                    case 7:
                        i3 |= 128;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = 9;
                        break;
                    case 8:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], list2);
                        i3 |= 256;
                        i2 = 9;
                        break;
                    case 9:
                        i3 |= 512;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list2;
            strDecodeStringElement = strDecodeStringElement14;
            str = strDecodeStringElement15;
            str2 = strDecodeStringElement2;
            i = i3;
            String str9 = strDecodeStringElement16;
            str3 = strDecodeStringElement11;
            str4 = strDecodeStringElement18;
            str5 = strDecodeStringElement13;
            str6 = str9;
            String str10 = strDecodeStringElement17;
            str7 = strDecodeStringElement12;
            str8 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRTokenListItem.SimpleCategoryCardItem(i, str4, str8, str6, str, str2, str3, str7, str5, list, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRTokenListItem.SimpleCategoryCardItem simpleCategoryCardItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(simpleCategoryCardItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRTokenListItem.SimpleCategoryCardItem.copydefault(simpleCategoryCardItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
