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
public final /* synthetic */ class OKCRPairListItem$FuturesListItem$$serializer implements GeneratedSerializer<OKCRPairListItem.FuturesListItem> {
    public static final int $stable;
    public static final OKCRPairListItem$FuturesListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRPairListItem$FuturesListItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRPairListItem$FuturesListItem$$serializer oKCRPairListItem$FuturesListItem$$serializer = new OKCRPairListItem$FuturesListItem$$serializer();
        INSTANCE = oKCRPairListItem$FuturesListItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.FuturesListItem", oKCRPairListItem$FuturesListItem$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("baseImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("quoteImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("baseName", false);
        pluginGeneratedSerialDescriptor.addElement("quoteName", false);
        pluginGeneratedSerialDescriptor.addElement("expiryDate", false);
        pluginGeneratedSerialDescriptor.addElement("fullNameToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("volume", false);
        pluginGeneratedSerialDescriptor.addElement("turnover", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("priceToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("changePercent", false);
        pluginGeneratedSerialDescriptor.addElement("changePercentToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("showPerpTag", true);
        pluginGeneratedSerialDescriptor.addElement("isWatch", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCRPairListItem.FuturesListItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[15], booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRPairListItem.FuturesListItem deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        boolean zDecodeBooleanElement;
        String str13;
        boolean zDecodeBooleanElement2;
        String str14;
        OKCRTrend oKCRTrend;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCRPairListItem.FuturesListItem.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            oKCRTrend = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], null);
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 17);
            str14 = strDecodeStringElement10;
            str13 = strDecodeStringElement15;
            str7 = strDecodeStringElement4;
            str4 = strDecodeStringElement11;
            str11 = strDecodeStringElement3;
            str2 = strDecodeStringElement13;
            str8 = strDecodeStringElement8;
            str10 = strDecodeStringElement5;
            i = 262143;
            str5 = strDecodeStringElement9;
            str3 = strDecodeStringElement12;
            str12 = strDecodeStringElement2;
            str = strDecodeStringElement14;
            str6 = strDecodeStringElement7;
            str9 = strDecodeStringElement6;
        } else {
            int i2 = 17;
            boolean zDecodeBooleanElement3 = false;
            boolean zDecodeBooleanElement4 = false;
            boolean z = true;
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
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            i = 0;
            OKCRTrend oKCRTrend2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 17;
                        break;
                    case 0:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        i2 = 17;
                        break;
                    case 1:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        i2 = 17;
                        break;
                    case 2:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i2 = 17;
                        break;
                    case 3:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        i2 = 17;
                        break;
                    case 4:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        i2 = 17;
                        break;
                    case 5:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        i2 = 17;
                        break;
                    case 6:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i |= 64;
                        i2 = 17;
                        break;
                    case 7:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i |= 128;
                        i2 = 17;
                        break;
                    case 8:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        i2 = 17;
                        break;
                    case 9:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i |= 512;
                        i2 = 17;
                        break;
                    case 10:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i |= 1024;
                        i2 = 17;
                        break;
                    case 11:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        i2 = 17;
                        break;
                    case 12:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        i2 = 17;
                        break;
                    case 13:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i |= 8192;
                        i2 = 17;
                        break;
                    case 14:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        i2 = 17;
                        break;
                    case 15:
                        oKCRTrend2 = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 15, kSerializerArr[15], oKCRTrend2);
                        i |= 32768;
                        i2 = 17;
                        break;
                    case 16:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 16);
                        i |= 65536;
                        i2 = 17;
                        break;
                    case 17:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i = 131072 | i;
                        i2 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement19;
            str3 = strDecodeStringElement20;
            str4 = strDecodeStringElement21;
            str5 = strDecodeStringElement22;
            str6 = strDecodeStringElement23;
            strDecodeStringElement = strDecodeStringElement24;
            str7 = strDecodeStringElement25;
            str8 = strDecodeStringElement26;
            str9 = strDecodeStringElement27;
            str10 = strDecodeStringElement28;
            str11 = strDecodeStringElement29;
            str12 = strDecodeStringElement30;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            str13 = strDecodeStringElement17;
            zDecodeBooleanElement2 = zDecodeBooleanElement3;
            str14 = strDecodeStringElement16;
            oKCRTrend = oKCRTrend2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRPairListItem.FuturesListItem(i, str12, str11, str7, str10, str9, strDecodeStringElement, str6, str8, str5, str14, str4, str3, str2, str, str13, oKCRTrend, zDecodeBooleanElement2, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRPairListItem.FuturesListItem futuresListItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(futuresListItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRPairListItem.FuturesListItem.write$Self$OKCRUILib_cr_uilib(futuresListItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
