package com.okinc.cruilib.model.listitem;

import com.okinc.cruilib.model.tokenpair.OKCRTokenPairItem;
import com.okinc.cruilib.model.tokenpair.OKCRTokenPairItem$$serializer;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OKCRPostCardItem$$serializer implements GeneratedSerializer<OKCRPostCardItem> {
    public static final int $stable;
    public static final OKCRPostCardItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRPostCardItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRPostCardItem$$serializer oKCRPostCardItem$$serializer = new OKCRPostCardItem$$serializer();
        INSTANCE = oKCRPostCardItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.OKCRPostCardItem", oKCRPostCardItem$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("authorId", false);
        pluginGeneratedSerialDescriptor.addElement("authorPortrait", false);
        pluginGeneratedSerialDescriptor.addElement("authorNickname", false);
        pluginGeneratedSerialDescriptor.addElement("content", false);
        pluginGeneratedSerialDescriptor.addElement("formatType", false);
        pluginGeneratedSerialDescriptor.addElement("token", false);
        pluginGeneratedSerialDescriptor.addElement("publishTime", false);
        pluginGeneratedSerialDescriptor.addElement("raw", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(OKCRTokenPairItem$$serializer.INSTANCE), LongSerializer.INSTANCE, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRPostCardItem deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        long j;
        int i;
        OKCRTokenPairItem oKCRTokenPairItem;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            OKCRTokenPairItem oKCRTokenPairItem2 = (OKCRTokenPairItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, OKCRTokenPairItem$$serializer.INSTANCE, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
            str = strDecodeStringElement3;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            oKCRTokenPairItem = oKCRTokenPairItem2;
            i = iDecodeIntElement;
            str3 = strDecodeStringElement6;
            str2 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement5;
            str4 = strDecodeStringElement4;
            j = jDecodeLongElement;
            i2 = 511;
        } else {
            String strDecodeStringElement8 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            int iDecodeIntElement2 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String strDecodeStringElement12 = null;
            OKCRTokenPairItem oKCRTokenPairItem3 = null;
            int i3 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        continue;
                    case 1:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        i3 |= 4;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        break;
                    case 3:
                        i3 |= 8;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i3 |= 16;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i3 |= 32;
                        break;
                    case 6:
                        i3 |= 64;
                        oKCRTokenPairItem3 = (OKCRTokenPairItem) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, OKCRTokenPairItem$$serializer.INSTANCE, oKCRTokenPairItem3);
                        break;
                    case 7:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 7);
                        i3 |= 128;
                        break;
                    case 8:
                        i3 |= 256;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement2 = strDecodeStringElement11;
            j = jDecodeLongElement2;
            i = iDecodeIntElement2;
            oKCRTokenPairItem = oKCRTokenPairItem3;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement12;
            i2 = i3;
            String str5 = strDecodeStringElement9;
            str3 = strDecodeStringElement8;
            str4 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRPostCardItem(i2, str, str4, strDecodeStringElement, str3, str2, i, oKCRTokenPairItem, j, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRPostCardItem oKCRPostCardItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(oKCRPostCardItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRPostCardItem.copydefault(oKCRPostCardItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
