package com.okinc.business.market.data.model.common;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class TokenInfo$$serializer implements GeneratedSerializer<TokenInfo> {
    public static final int $stable;
    public static final TokenInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TokenInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TokenInfo$$serializer tokenInfo$$serializer = new TokenInfo$$serializer();
        INSTANCE = tokenInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.common.TokenInfo", tokenInfo$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("buyTxs", true);
        pluginGeneratedSerialDescriptor.addElement("chainBWLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("currentHolders", true);
        pluginGeneratedSerialDescriptor.addElement("currentMcap", true);
        pluginGeneratedSerialDescriptor.addElement("currentPrice", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("protocolId", true);
        pluginGeneratedSerialDescriptor.addElement("sellTxs", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCreateTime", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenName", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("top10HoldAmountPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("txs", true);
        pluginGeneratedSerialDescriptor.addElement("volume", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TokenInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[10], stringSerializer, LongSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TokenInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        List list;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String strDecodeStringElement2;
        String str8;
        String str9;
        String str10;
        String str11;
        long jDecodeLongElement;
        String strDecodeStringElement3;
        String str12;
        String strDecodeStringElement4;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TokenInfo.$childSerializers;
        int i2 = 4;
        String strDecodeStringElement5 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            list = list2;
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            str3 = strDecodeStringElement16;
            str12 = strDecodeStringElement17;
            str10 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement19;
            str13 = strDecodeStringElement18;
            i = 524287;
            str = strDecodeStringElement13;
            str4 = strDecodeStringElement15;
            str2 = strDecodeStringElement14;
            str6 = strDecodeStringElement12;
            str7 = strDecodeStringElement11;
            str5 = strDecodeStringElement10;
            str9 = strDecodeStringElement8;
            str8 = strDecodeStringElement9;
            str11 = strDecodeStringElement6;
        } else {
            int i3 = 18;
            boolean z = true;
            String strDecodeStringElement20 = null;
            strDecodeStringElement = null;
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
            long jDecodeLongElement2 = 0;
            int i4 = 0;
            List list3 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 4;
                        i3 = 18;
                        break;
                    case 0:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i2 = 4;
                        i3 = 18;
                        break;
                    case 1:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i2 = 4;
                        i3 = 18;
                        break;
                    case 2:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 18;
                        break;
                    case 3:
                        i4 |= 8;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 = 18;
                        break;
                    case 4:
                        i4 |= 16;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 = 18;
                        break;
                    case 5:
                        i4 |= 32;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 = 18;
                        break;
                    case 6:
                        i4 |= 64;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 = 18;
                        break;
                    case 7:
                        i4 |= 128;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 = 18;
                        break;
                    case 8:
                        i4 |= 256;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 = 18;
                        break;
                    case 9:
                        i4 |= 512;
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 = 18;
                        break;
                    case 10:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], list3);
                        i4 |= 1024;
                        i3 = 18;
                        break;
                    case 11:
                        i4 |= 2048;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 = 18;
                        break;
                    case 12:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
                        i4 |= 4096;
                        i3 = 18;
                        break;
                    case 13:
                        i4 |= 8192;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 = 18;
                        break;
                    case 14:
                        i4 |= 16384;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 = 18;
                        break;
                    case 15:
                        i4 |= 32768;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 = 18;
                        break;
                    case 16:
                        i4 |= 65536;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 = 18;
                        break;
                    case 17:
                        i4 |= 131072;
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 = 18;
                        break;
                    case 18:
                        i4 |= 262144;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i3 = 18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            list = list3;
            i = i4;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement33;
            str3 = strDecodeStringElement23;
            str4 = strDecodeStringElement24;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            str7 = strDecodeStringElement27;
            strDecodeStringElement2 = strDecodeStringElement28;
            str8 = strDecodeStringElement29;
            str9 = strDecodeStringElement30;
            str10 = strDecodeStringElement31;
            str11 = strDecodeStringElement32;
            jDecodeLongElement = jDecodeLongElement2;
            String str14 = strDecodeStringElement21;
            strDecodeStringElement3 = strDecodeStringElement34;
            str12 = strDecodeStringElement22;
            strDecodeStringElement4 = strDecodeStringElement20;
            str13 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TokenInfo(i, str11, str10, str9, str8, str5, strDecodeStringElement2, str7, str6, str, str2, list, str4, jDecodeLongElement, str3, str12, str13, strDecodeStringElement, strDecodeStringElement3, strDecodeStringElement4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TokenInfo tokenInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(tokenInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TokenInfo.EZpvd(tokenInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
