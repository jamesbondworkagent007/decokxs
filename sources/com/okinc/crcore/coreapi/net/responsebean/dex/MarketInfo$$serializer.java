package com.okinc.crcore.coreapi.net.responsebean.dex;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class MarketInfo$$serializer implements GeneratedSerializer<MarketInfo> {
    public static final int $stable;
    public static final MarketInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MarketInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MarketInfo$$serializer marketInfo$$serializer = new MarketInfo$$serializer();
        INSTANCE = marketInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.dex.MarketInfo", marketInfo$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("burntLiquidity", true);
        pluginGeneratedSerialDescriptor.addElement("circulatingSupply", true);
        pluginGeneratedSerialDescriptor.addElement("fdv", true);
        pluginGeneratedSerialDescriptor.addElement("holders", true);
        pluginGeneratedSerialDescriptor.addElement("lpTokenBurntRatio", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        pluginGeneratedSerialDescriptor.addElement("maxSupply", true);
        pluginGeneratedSerialDescriptor.addElement("priceChange1H", true);
        pluginGeneratedSerialDescriptor.addElement("priceChange24H", true);
        pluginGeneratedSerialDescriptor.addElement("priceChange4H", true);
        pluginGeneratedSerialDescriptor.addElement("priceChange5M", true);
        pluginGeneratedSerialDescriptor.addElement("riskControlLevel", true);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", true);
        pluginGeneratedSerialDescriptor.addElement("snipersClear", true);
        pluginGeneratedSerialDescriptor.addElement("snipersTotal", true);
        pluginGeneratedSerialDescriptor.addElement("suspiciousRatio", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCreateTime", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCreatorAddress", true);
        pluginGeneratedSerialDescriptor.addElement("totalLiquidity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MarketInfo deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String strDecodeStringElement;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            str16 = strDecodeStringElement16;
            str15 = strDecodeStringElement19;
            str12 = strDecodeStringElement18;
            str13 = strDecodeStringElement17;
            str3 = strDecodeStringElement11;
            str8 = strDecodeStringElement13;
            str9 = strDecodeStringElement12;
            str11 = strDecodeStringElement9;
            str2 = strDecodeStringElement8;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement5;
            str14 = strDecodeStringElement15;
            i = 524287;
            str7 = strDecodeStringElement14;
            str = strDecodeStringElement4;
            str10 = strDecodeStringElement10;
            str6 = strDecodeStringElement7;
        } else {
            int i3 = 0;
            int i4 = 18;
            String strDecodeStringElement20 = null;
            boolean z = true;
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
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            String strDecodeStringElement37 = null;
            String strDecodeStringElement38 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 0:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 1:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 2:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 3:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 4:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 16;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 5:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 6:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 7:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 8:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 9:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 10:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 11:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 12:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 13:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 14:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 15:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 |= 32768;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 16:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 |= 65536;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 17:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 |= 131072;
                        i2 = 4;
                        i4 = 18;
                        break;
                    case 18:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 |= 262144;
                        i2 = 4;
                        i4 = 18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = strDecodeStringElement23;
            str2 = strDecodeStringElement25;
            str3 = strDecodeStringElement26;
            str4 = strDecodeStringElement27;
            str5 = strDecodeStringElement28;
            strDecodeStringElement = strDecodeStringElement29;
            str6 = strDecodeStringElement30;
            str7 = strDecodeStringElement32;
            str8 = strDecodeStringElement33;
            str9 = strDecodeStringElement34;
            str10 = strDecodeStringElement35;
            str11 = strDecodeStringElement36;
            strDecodeStringElement2 = strDecodeStringElement37;
            strDecodeStringElement3 = strDecodeStringElement20;
            str12 = strDecodeStringElement22;
            str13 = strDecodeStringElement24;
            str14 = strDecodeStringElement31;
            str15 = strDecodeStringElement21;
            str16 = strDecodeStringElement38;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MarketInfo(i, str, str5, str4, str6, str2, strDecodeStringElement2, str11, str10, str3, str9, str8, str7, str14, str16, str13, str12, str15, strDecodeStringElement3, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MarketInfo marketInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(marketInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MarketInfo.write$Self$OKCRCore_cr_core(marketInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
