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
public final /* synthetic */ class OKCRPairListItem$StockListItem$$serializer implements GeneratedSerializer<OKCRPairListItem.StockListItem> {
    public static final int $stable;
    public static final OKCRPairListItem$StockListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRPairListItem$StockListItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRPairListItem$StockListItem$$serializer oKCRPairListItem$StockListItem$$serializer = new OKCRPairListItem$StockListItem$$serializer();
        INSTANCE = oKCRPairListItem$StockListItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.advance.OKCRPairListItem.StockListItem", oKCRPairListItem$StockListItem$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("instId", false);
        pluginGeneratedSerialDescriptor.addElement("instType", true);
        pluginGeneratedSerialDescriptor.addElement("baseImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("quoteImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("baseName", false);
        pluginGeneratedSerialDescriptor.addElement("quoteName", false);
        pluginGeneratedSerialDescriptor.addElement("fullNameToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("companyName", false);
        pluginGeneratedSerialDescriptor.addElement("descriptionToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("priceToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("changePercent", false);
        pluginGeneratedSerialDescriptor.addElement("changePercentToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("isWatch", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCRPairListItem.StockListItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[14], BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRPairListItem.StockListItem deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        OKCRTrend oKCRTrend;
        String str9;
        String str10;
        String str11;
        boolean zDecodeBooleanElement;
        int i;
        String str12;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCRPairListItem.StockListItem.$childSerializers;
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            oKCRTrend = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            str8 = strDecodeStringElement6;
            i = 65535;
            str6 = strDecodeStringElement13;
            str9 = strDecodeStringElement12;
            str12 = strDecodeStringElement11;
            str10 = strDecodeStringElement9;
            str7 = strDecodeStringElement8;
            str2 = strDecodeStringElement7;
            str11 = strDecodeStringElement5;
            str13 = strDecodeStringElement10;
            strDecodeStringElement = strDecodeStringElement14;
            str5 = strDecodeStringElement15;
            str4 = strDecodeStringElement2;
            str = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
        } else {
            int i3 = 15;
            boolean z = true;
            boolean zDecodeBooleanElement2 = false;
            OKCRTrend oKCRTrend2 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i3 = 15;
                        break;
                    case 0:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        i3 = 15;
                        break;
                    case 1:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        i3 = 15;
                        break;
                    case 2:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        i3 = 15;
                        break;
                    case 3:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        i3 = 15;
                        break;
                    case 4:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        i3 = 15;
                        break;
                    case 5:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        i3 = 15;
                        break;
                    case 6:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        i3 = 15;
                        break;
                    case 7:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 |= 128;
                        i3 = 15;
                        break;
                    case 8:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 |= 256;
                        i3 = 15;
                        break;
                    case 9:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 |= 512;
                        i3 = 15;
                        break;
                    case 10:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 |= 1024;
                        i3 = 15;
                        break;
                    case 11:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 |= 2048;
                        i3 = 15;
                        break;
                    case 12:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i2 |= 4096;
                        i3 = 15;
                        break;
                    case 13:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i2 |= 8192;
                        i3 = 15;
                        break;
                    case 14:
                        oKCRTrend2 = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], oKCRTrend2);
                        i2 |= 16384;
                        i3 = 15;
                        break;
                    case 15:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i3);
                        i2 |= 32768;
                        i3 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement23;
            str2 = strDecodeStringElement24;
            str3 = strDecodeStringElement27;
            str4 = strDecodeStringElement28;
            str5 = strDecodeStringElement17;
            str6 = strDecodeStringElement18;
            str7 = strDecodeStringElement22;
            str8 = strDecodeStringElement25;
            oKCRTrend = oKCRTrend2;
            str9 = strDecodeStringElement19;
            str10 = strDecodeStringElement16;
            str11 = strDecodeStringElement26;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            i = i2;
            String str14 = strDecodeStringElement21;
            str12 = strDecodeStringElement20;
            str13 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRPairListItem.StockListItem(i, str4, str3, str, str11, str8, str2, str7, str10, str13, str12, str9, str6, strDecodeStringElement, str5, oKCRTrend, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRPairListItem.StockListItem stockListItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(stockListItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRPairListItem.StockListItem.write$Self$OKCRUILib_cr_uilib(stockListItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
