package com.okinc.cruilib.model.listitem.advance;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.cruilib.model.listitem.advance.OKCRPairListItem;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
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
public final /* synthetic */ class OKCRPairListItem$PairListItem$$serializer implements GeneratedSerializer<OKCRPairListItem.PairListItem> {
    public static final int $stable;
    public static final OKCRPairListItem$PairListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRPairListItem$PairListItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRPairListItem$PairListItem$$serializer oKCRPairListItem$PairListItem$$serializer = new OKCRPairListItem$PairListItem$$serializer();
        INSTANCE = oKCRPairListItem$PairListItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.PairListItem", oKCRPairListItem$PairListItem$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("baseImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("quoteImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("baseName", false);
        pluginGeneratedSerialDescriptor.addElement("quoteName", false);
        pluginGeneratedSerialDescriptor.addElement("marginLevel", false);
        pluginGeneratedSerialDescriptor.addElement("description", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("percentage", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("isWatch", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCRPairListItem.PairListItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[10], BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRPairListItem.PairListItem deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        String str3;
        OKCRTrend oKCRTrend;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCRPairListItem.PairListItem.$childSerializers;
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
            oKCRTrend = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            str4 = strDecodeStringElement4;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            str7 = strDecodeStringElement13;
            str2 = strDecodeStringElement11;
            strDecodeStringElement2 = strDecodeStringElement10;
            str3 = strDecodeStringElement9;
            str = strDecodeStringElement7;
            str5 = strDecodeStringElement12;
            strDecodeStringElement = strDecodeStringElement8;
            str8 = strDecodeStringElement6;
            str6 = strDecodeStringElement5;
            i = 4095;
        } else {
            int i3 = 11;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement16 = null;
            strDecodeStringElement2 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            boolean zDecodeBooleanElement2 = false;
            boolean z = true;
            int i4 = 0;
            OKCRTrend oKCRTrend2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 11;
                        break;
                    case 0:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 11;
                        break;
                    case 1:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 11;
                        break;
                    case 2:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        break;
                    case 5:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = i4 | 32;
                        i4 = i2;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        break;
                    case 10:
                        i4 |= 1024;
                        oKCRTrend2 = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], oKCRTrend2);
                        break;
                    case 11:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i2 = i4 | 2048;
                        i4 = i2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = strDecodeStringElement17;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement3;
            String str9 = strDecodeStringElement20;
            oKCRTrend = oKCRTrend2;
            i = i4;
            str4 = str9;
            String str10 = strDecodeStringElement18;
            str5 = strDecodeStringElement14;
            str6 = strDecodeStringElement19;
            str7 = strDecodeStringElement15;
            str8 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRPairListItem.PairListItem(i, str4, str6, str8, str, strDecodeStringElement, str3, strDecodeStringElement2, str2, str5, str7, oKCRTrend, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRPairListItem.PairListItem pairListItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(pairListItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRPairListItem.PairListItem.write$Self$OKCRUILib_cr_uilib(pairListItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
