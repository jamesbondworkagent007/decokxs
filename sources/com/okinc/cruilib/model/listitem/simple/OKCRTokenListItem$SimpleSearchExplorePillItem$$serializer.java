package com.okinc.cruilib.model.listitem.simple;

import com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OKCRTokenListItem$SimpleSearchExplorePillItem$$serializer implements GeneratedSerializer<OKCRTokenListItem.SimpleSearchExplorePillItem> {
    public static final int $stable;
    public static final OKCRTokenListItem$SimpleSearchExplorePillItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRTokenListItem$SimpleSearchExplorePillItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRTokenListItem$SimpleSearchExplorePillItem$$serializer oKCRTokenListItem$SimpleSearchExplorePillItem$$serializer = new OKCRTokenListItem$SimpleSearchExplorePillItem$$serializer();
        INSTANCE = oKCRTokenListItem$SimpleSearchExplorePillItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.SimpleSearchExplorePillItem", oKCRTokenListItem$SimpleSearchExplorePillItem$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("categoryContentType", false);
        pluginGeneratedSerialDescriptor.addElement("categoryName", false);
        pluginGeneratedSerialDescriptor.addElement("categoryIcon", false);
        pluginGeneratedSerialDescriptor.addElement("categoryIconTint", false);
        pluginGeneratedSerialDescriptor.addElement("tokenId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRTokenListItem.SimpleSearchExplorePillItem deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            str2 = strDecodeStringElement3;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            i3 = iDecodeIntElement;
            i2 = iDecodeIntElement2;
            strDecodeStringElement = strDecodeStringElement5;
            str = strDecodeStringElement4;
            i = 63;
        } else {
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            int i5 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 = i5 | 2;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 = i5 | 4;
                        break;
                    case 3:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i4 = i5 | 8;
                        break;
                    case 4:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i4 = i5 | 16;
                        break;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 = i5 | 32;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
                i5 = i4;
            }
            strDecodeStringElement2 = strDecodeStringElement7;
            i = i5;
            i2 = iDecodeIntElement4;
            str = strDecodeStringElement8;
            i3 = iDecodeIntElement3;
            str2 = strDecodeStringElement6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRTokenListItem.SimpleSearchExplorePillItem(i, str2, str, strDecodeStringElement, i3, i2, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRTokenListItem.SimpleSearchExplorePillItem simpleSearchExplorePillItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(simpleSearchExplorePillItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRTokenListItem.SimpleSearchExplorePillItem.KWHzl(simpleSearchExplorePillItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
