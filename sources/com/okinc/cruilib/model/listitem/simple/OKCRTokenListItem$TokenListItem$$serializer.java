package com.okinc.cruilib.model.listitem.simple;

import androidx.camera.video.AudioStats;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OKCRTokenListItem$TokenListItem$$serializer implements GeneratedSerializer<OKCRTokenListItem.TokenListItem> {
    public static final int $stable;
    public static final OKCRTokenListItem$TokenListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRTokenListItem$TokenListItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRTokenListItem$TokenListItem$$serializer oKCRTokenListItem$TokenListItem$$serializer = new OKCRTokenListItem$TokenListItem$$serializer();
        INSTANCE = oKCRTokenListItem$TokenListItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.TokenListItem", oKCRTokenListItem$TokenListItem$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("tokenId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("tokenFullName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenName", false);
        pluginGeneratedSerialDescriptor.addElement("priceAsDouble", false);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("percentage", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("isWatch", true);
        pluginGeneratedSerialDescriptor.addElement("primarySimilarity", true);
        pluginGeneratedSerialDescriptor.addElement("secondarySimilarity", true);
        pluginGeneratedSerialDescriptor.addElement("isStablecoin", false);
        pluginGeneratedSerialDescriptor.addElement("isBuidl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCRTokenListItem.TokenListItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[8], booleanSerializer, doubleSerializer, doubleSerializer, booleanSerializer, booleanSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRTokenListItem.TokenListItem deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        boolean zDecodeBooleanElement;
        double d;
        boolean zDecodeBooleanElement2;
        String str;
        String str2;
        OKCRTrend oKCRTrend;
        boolean z;
        String str3;
        String str4;
        double d2;
        String str5;
        String str6;
        String str7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCRTokenListItem.TokenListItem.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            OKCRTrend oKCRTrend2 = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], null);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 10);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 11);
            oKCRTrend = oKCRTrend2;
            str5 = strDecodeStringElement3;
            str4 = strDecodeStringElement4;
            z = zDecodeBooleanElement3;
            d2 = dDecodeDoubleElement;
            str = strDecodeStringElement9;
            str2 = strDecodeStringElement8;
            str7 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement5;
            zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
            str3 = strDecodeStringElement6;
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            d = dDecodeDoubleElement2;
            str6 = strDecodeStringElement2;
            i = 16383;
        } else {
            int i2 = 13;
            double dDecodeDoubleElement3 = AudioStats.AUDIO_AMPLITUDE_NONE;
            boolean z2 = true;
            int i3 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            String strDecodeStringElement10 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            double dDecodeDoubleElement4 = 0.0d;
            OKCRTrend oKCRTrend3 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 13;
                        break;
                    case 0:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 13;
                        break;
                    case 1:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 13;
                        break;
                    case 2:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 13;
                        break;
                    case 3:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 13;
                        break;
                    case 4:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 13;
                        break;
                    case 5:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 13;
                        break;
                    case 6:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 13;
                        break;
                    case 7:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 13;
                        break;
                    case 8:
                        oKCRTrend3 = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, kSerializerArr[8], oKCRTrend3);
                        i3 |= 256;
                        i2 = 13;
                        break;
                    case 9:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 13;
                        break;
                    case 10:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 13;
                        break;
                    case 11:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 13;
                        break;
                    case 12:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 13;
                        break;
                    case 13:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 8192;
                        i2 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            zDecodeBooleanElement = zDecodeBooleanElement5;
            d = dDecodeDoubleElement4;
            zDecodeBooleanElement2 = zDecodeBooleanElement4;
            str = strDecodeStringElement13;
            str2 = strDecodeStringElement14;
            oKCRTrend = oKCRTrend3;
            String str8 = strDecodeStringElement15;
            z = zDecodeBooleanElement6;
            String str9 = strDecodeStringElement11;
            str3 = strDecodeStringElement10;
            str4 = strDecodeStringElement16;
            d2 = dDecodeDoubleElement3;
            str5 = str9;
            str6 = strDecodeStringElement12;
            str7 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRTokenListItem.TokenListItem(i, str6, str5, str4, strDecodeStringElement, str3, str7, str2, str, oKCRTrend, z, d2, d, zDecodeBooleanElement2, zDecodeBooleanElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRTokenListItem.TokenListItem tokenListItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenListItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRTokenListItem.TokenListItem.write$Self$OKCRUILib_cr_uilib(tokenListItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
