package com.okinc.business.market.data.model;

import java.util.HashMap;
import java.util.List;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class DevAnalysisCreatedTokens$$serializer implements GeneratedSerializer<DevAnalysisCreatedTokens> {
    public static final int $stable;
    public static final DevAnalysisCreatedTokens$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DevAnalysisCreatedTokens$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DevAnalysisCreatedTokens$$serializer devAnalysisCreatedTokens$$serializer = new DevAnalysisCreatedTokens$$serializer();
        INSTANCE = devAnalysisCreatedTokens$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.DevAnalysisCreatedTokens", devAnalysisCreatedTokens$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("abnormalHoldingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", true);
        pluginGeneratedSerialDescriptor.addElement("devHoldingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("marketCap", true);
        pluginGeneratedSerialDescriptor.addElement("memeLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("migratedProgress", true);
        pluginGeneratedSerialDescriptor.addElement("migratedStatus", true);
        pluginGeneratedSerialDescriptor.addElement("rugDuration", true);
        pluginGeneratedSerialDescriptor.addElement("rugTime", true);
        pluginGeneratedSerialDescriptor.addElement("rugType", true);
        pluginGeneratedSerialDescriptor.addElement("rugged", true);
        pluginGeneratedSerialDescriptor.addElement("suspectedInsiderTradingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("suspiciousHoldingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("t", false);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenCreateTime", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        pluginGeneratedSerialDescriptor.addElement("tokenTagVO", true);
        pluginGeneratedSerialDescriptor.addElement("volume24H", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = DevAnalysisCreatedTokens.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, kSerializerArr[13], stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[18], stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DevAnalysisCreatedTokens deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        List list;
        String str2;
        String str3;
        String str4;
        String str5;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        boolean z;
        HashMap map;
        String str16;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = DevAnalysisCreatedTokens.$childSerializers;
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
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], null);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            map = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            str12 = strDecodeStringElement15;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            str13 = strDecodeStringElement5;
            str14 = strDecodeStringElement3;
            str4 = strDecodeStringElement17;
            str6 = strDecodeStringElement13;
            str7 = strDecodeStringElement11;
            i = 2097151;
            str = strDecodeStringElement12;
            str10 = strDecodeStringElement8;
            list = list2;
            str2 = strDecodeStringElement14;
            str15 = strDecodeStringElement6;
            str3 = strDecodeStringElement16;
            str16 = strDecodeStringElement4;
            str5 = strDecodeStringElement18;
            z = zDecodeBooleanElement;
            str11 = strDecodeStringElement7;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement9;
        } else {
            int i3 = 20;
            String strDecodeStringElement19 = null;
            int i4 = 0;
            boolean zDecodeBooleanElement2 = false;
            HashMap map2 = null;
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
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            String strDecodeStringElement35 = null;
            String strDecodeStringElement36 = null;
            boolean z2 = true;
            List list3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 20;
                        break;
                    case 0:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 |= 1;
                        i3 = 20;
                        break;
                    case 1:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 |= 2;
                        i3 = 20;
                        break;
                    case 2:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i4 |= 4;
                        i3 = 20;
                        break;
                    case 3:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i4 |= 8;
                        i3 = 20;
                        break;
                    case 4:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i4 |= 16;
                        i3 = 20;
                        break;
                    case 5:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 |= 32;
                        i3 = 20;
                        break;
                    case 6:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 |= 64;
                        i3 = 20;
                        break;
                    case 7:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i4 |= 128;
                        i3 = 20;
                        break;
                    case 8:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 |= 256;
                        i3 = 20;
                        break;
                    case 9:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 |= 512;
                        i3 = 20;
                        break;
                    case 10:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
                        i4 |= 1024;
                        i3 = 20;
                        break;
                    case 11:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i4 |= 2048;
                        i3 = 20;
                        break;
                    case 12:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i4 |= 4096;
                        i3 = 20;
                        break;
                    case 13:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], list3);
                        i4 |= 8192;
                        i3 = 20;
                        break;
                    case 14:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i4 |= 16384;
                        i3 = 20;
                        break;
                    case 15:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 32768;
                        i4 |= i2;
                        i3 = 20;
                        break;
                    case 16:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i2 = 65536;
                        i4 |= i2;
                        i3 = 20;
                        break;
                    case 17:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i2 = 131072;
                        i4 |= i2;
                        i3 = 20;
                        break;
                    case 18:
                        map2 = (HashMap) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 18, kSerializerArr[18], map2);
                        i4 |= 262144;
                        i3 = 20;
                        break;
                    case 19:
                        i4 |= 524288;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i3 = 20;
                        break;
                    case 20:
                        i4 |= 1048576;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i3 = 20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i4;
            str = strDecodeStringElement19;
            list = list3;
            str2 = strDecodeStringElement20;
            str3 = strDecodeStringElement21;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement23;
            strDecodeStringElement = strDecodeStringElement24;
            strDecodeStringElement2 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            str7 = strDecodeStringElement27;
            str8 = strDecodeStringElement28;
            str9 = strDecodeStringElement29;
            str10 = strDecodeStringElement30;
            str11 = strDecodeStringElement31;
            str12 = strDecodeStringElement32;
            str13 = strDecodeStringElement33;
            str14 = strDecodeStringElement35;
            str15 = strDecodeStringElement36;
            z = zDecodeBooleanElement2;
            map = map2;
            str16 = strDecodeStringElement34;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DevAnalysisCreatedTokens(i, str14, str16, str13, str15, str11, str10, str9, str8, str7, str, z, str6, str2, list, str12, str3, str4, str5, map, strDecodeStringElement, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DevAnalysisCreatedTokens devAnalysisCreatedTokens) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(devAnalysisCreatedTokens, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DevAnalysisCreatedTokens.OLrzqt(devAnalysisCreatedTokens, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
