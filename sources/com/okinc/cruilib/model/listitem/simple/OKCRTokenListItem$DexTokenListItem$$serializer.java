package com.okinc.cruilib.model.listitem.simple;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
public final /* synthetic */ class OKCRTokenListItem$DexTokenListItem$$serializer implements GeneratedSerializer<OKCRTokenListItem.DexTokenListItem> {
    public static final int $stable;
    public static final OKCRTokenListItem$DexTokenListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OKCRTokenListItem$DexTokenListItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OKCRTokenListItem$DexTokenListItem$$serializer oKCRTokenListItem$DexTokenListItem$$serializer = new OKCRTokenListItem$DexTokenListItem$$serializer();
        INSTANCE = oKCRTokenListItem$DexTokenListItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.cruilib.model.listitem.simple.OKCRTokenListItem.DexTokenListItem", oKCRTokenListItem$DexTokenListItem$$serializer, 27);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("tokenId", false);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("chainImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("tokenFullName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenNameToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, false);
        pluginGeneratedSerialDescriptor.addElement("priceToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("changePercent", false);
        pluginGeneratedSerialDescriptor.addElement("changePercentToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("trend", false);
        pluginGeneratedSerialDescriptor.addElement("isWatch", true);
        pluginGeneratedSerialDescriptor.addElement("primarySimilarity", true);
        pluginGeneratedSerialDescriptor.addElement("secondarySimilarity", true);
        pluginGeneratedSerialDescriptor.addElement("liquidity", false);
        pluginGeneratedSerialDescriptor.addElement("liquidityToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("turnOver", false);
        pluginGeneratedSerialDescriptor.addElement("turnOverToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("marketCap", false);
        pluginGeneratedSerialDescriptor.addElement("marketCapToDisplay", false);
        pluginGeneratedSerialDescriptor.addElement("communityRecognized", false);
        pluginGeneratedSerialDescriptor.addElement("showCommunityRecognizedIcon", true);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OKCRTokenListItem.DexTokenListItem.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[14], booleanSerializer, doubleSerializer, doubleSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OKCRTokenListItem.DexTokenListItem deserialize(@NotNull Decoder decoder) {
        OKCRTrend oKCRTrend;
        int i;
        boolean z;
        String strDecodeStringElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        double d;
        boolean z2;
        boolean z3;
        String str13;
        String str14;
        String str15;
        double d2;
        String str16;
        String str17;
        String str18;
        String str19;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OKCRTokenListItem.DexTokenListItem.$childSerializers;
        int i5 = 5;
        int i6 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            OKCRTrend oKCRTrend2 = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 16);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 17);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
            str18 = strDecodeStringElement18;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            str16 = strDecodeStringElement19;
            str = strDecodeStringElement20;
            str15 = strDecodeStringElement21;
            z2 = zDecodeBooleanElement2;
            z3 = zDecodeBooleanElement3;
            str17 = strDecodeStringElement16;
            str3 = strDecodeStringElement12;
            str13 = strDecodeStringElement15;
            str9 = strDecodeStringElement9;
            d2 = dDecodeDoubleElement2;
            str5 = strDecodeStringElement7;
            str14 = strDecodeStringElement4;
            oKCRTrend = oKCRTrend2;
            d = dDecodeDoubleElement;
            str11 = strDecodeStringElement3;
            i = 134217727;
            z = zDecodeBooleanElement;
            str4 = strDecodeStringElement11;
            str2 = strDecodeStringElement14;
            str7 = strDecodeStringElement13;
            str19 = strDecodeStringElement17;
            str6 = strDecodeStringElement6;
            str12 = strDecodeStringElement5;
            str8 = strDecodeStringElement10;
            str10 = strDecodeStringElement8;
        } else {
            boolean zDecodeBooleanElement4 = false;
            boolean z4 = true;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            String strDecodeStringElement26 = null;
            String strDecodeStringElement27 = null;
            String strDecodeStringElement28 = null;
            String strDecodeStringElement29 = null;
            String strDecodeStringElement30 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            String strDecodeStringElement39 = null;
            String strDecodeStringElement40 = null;
            String strDecodeStringElement41 = null;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            int i7 = 0;
            boolean zDecodeBooleanElement5 = false;
            OKCRTrend oKCRTrend3 = null;
            String strDecodeStringElement42 = null;
            boolean zDecodeBooleanElement6 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z4 = false;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 0:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 1:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 2:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 3:
                        i7 |= 8;
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 4:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 5:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 32;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 6:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i7 |= 64;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 7:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i7 |= 128;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 8:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i7 |= 256;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 9:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i7 |= 512;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 10:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i7 |= 1024;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 11:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i7 |= 2048;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 12:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 13:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i7 |= 8192;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 14:
                        oKCRTrend3 = (OKCRTrend) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], oKCRTrend3);
                        i7 |= 16384;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 15:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 15);
                        i2 = 32768;
                        i7 |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 16:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 16);
                        i2 = 65536;
                        i7 |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 17:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 17);
                        i2 = 131072;
                        i7 |= i2;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 18:
                        i7 |= 262144;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 19:
                        i7 |= 524288;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 20:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 21:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i4 = 2097152;
                        i3 = i4;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 22:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i4 = 4194304;
                        i3 = i4;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 23:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i4 = 8388608;
                        i3 = i4;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 24:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 24);
                        i4 = 16777216;
                        i3 = i4;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 25:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
                        i4 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i3 = i4;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    case 26:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i4 = 67108864;
                        i3 = i4;
                        i7 |= i3;
                        i5 = 5;
                        i6 = 3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            oKCRTrend = oKCRTrend3;
            i = i7;
            z = zDecodeBooleanElement5;
            strDecodeStringElement = strDecodeStringElement42;
            str = strDecodeStringElement23;
            str2 = strDecodeStringElement29;
            str3 = strDecodeStringElement30;
            str4 = strDecodeStringElement31;
            str5 = strDecodeStringElement32;
            str6 = strDecodeStringElement33;
            strDecodeStringElement2 = strDecodeStringElement34;
            str7 = strDecodeStringElement35;
            str8 = strDecodeStringElement36;
            str9 = strDecodeStringElement37;
            str10 = strDecodeStringElement38;
            str11 = strDecodeStringElement40;
            str12 = strDecodeStringElement41;
            d = dDecodeDoubleElement3;
            z2 = zDecodeBooleanElement6;
            z3 = zDecodeBooleanElement4;
            str13 = strDecodeStringElement28;
            str14 = strDecodeStringElement39;
            str15 = strDecodeStringElement22;
            d2 = dDecodeDoubleElement4;
            String str20 = strDecodeStringElement27;
            str16 = strDecodeStringElement24;
            str17 = str20;
            String str21 = strDecodeStringElement26;
            str18 = strDecodeStringElement25;
            str19 = str21;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OKCRTokenListItem.DexTokenListItem(i, str11, str14, str12, str6, str5, str10, str9, str8, str4, str3, str7, str2, str13, strDecodeStringElement, oKCRTrend, z, d, d2, str17, str19, str18, str16, str, str15, z2, z3, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OKCRTokenListItem.DexTokenListItem dexTokenListItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexTokenListItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OKCRTokenListItem.DexTokenListItem.OLrzqt(dexTokenListItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
