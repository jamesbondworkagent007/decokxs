package com.okinc.business.data.model.market;

import java.util.List;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class HolderRankingResponseData$$serializer implements GeneratedSerializer<HolderRankingResponseData> {
    public static final int $stable;
    public static final HolderRankingResponseData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HolderRankingResponseData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HolderRankingResponseData$$serializer holderRankingResponseData$$serializer = new HolderRankingResponseData$$serializer();
        INSTANCE = holderRankingResponseData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.data.model.market.HolderRankingResponseData", holderRankingResponseData$$serializer, 23);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("holdAmount", true);
        pluginGeneratedSerialDescriptor.addElement("holdAmountPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("holderWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("holdVolume", true);
        pluginGeneratedSerialDescriptor.addElement("holderTagVO", true);
        pluginGeneratedSerialDescriptor.addElement("holdAmount24HChange", true);
        pluginGeneratedSerialDescriptor.addElement("fundingSourceAddress", true);
        pluginGeneratedSerialDescriptor.addElement("fundingSourceTime", true);
        pluginGeneratedSerialDescriptor.addElement("lastTradeTime", true);
        pluginGeneratedSerialDescriptor.addElement("explorerUrl", true);
        pluginGeneratedSerialDescriptor.addElement("extraOne", true);
        pluginGeneratedSerialDescriptor.addElement("fundingSourceAddressShowName", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenPrice", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenBalance", true);
        pluginGeneratedSerialDescriptor.addElement("totalProfit", true);
        pluginGeneratedSerialDescriptor.addElement("totalProfitPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("inFlowAmount", true);
        pluginGeneratedSerialDescriptor.addElement("inFlowValue", true);
        pluginGeneratedSerialDescriptor.addElement("holdCreateTime", true);
        pluginGeneratedSerialDescriptor.addElement("holdingTime", true);
        pluginGeneratedSerialDescriptor.addElement("t", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = HolderRankingResponseData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(HolderTagResponseData$$serializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[22]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HolderRankingResponseData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        HolderTagResponseData holderTagResponseData;
        String str;
        String str2;
        String str3;
        String str4;
        String strDecodeStringElement2;
        String str5;
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
        List list;
        String str16;
        String str17;
        String str18;
        String str19;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = HolderRankingResponseData.$childSerializers;
        int i4 = 5;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            HolderTagResponseData holderTagResponseData2 = (HolderTagResponseData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, HolderTagResponseData$$serializer.INSTANCE, null);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            strDecodeStringElement = strDecodeStringElement20;
            list = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 22, kSerializerArr[22], null);
            str16 = strDecodeStringElement22;
            str8 = strDecodeStringElement6;
            str2 = strDecodeStringElement18;
            str18 = strDecodeStringElement21;
            str12 = strDecodeStringElement11;
            str3 = strDecodeStringElement17;
            str6 = strDecodeStringElement8;
            str5 = strDecodeStringElement12;
            str7 = strDecodeStringElement7;
            i = 8388607;
            str15 = strDecodeStringElement5;
            str10 = strDecodeStringElement3;
            str4 = strDecodeStringElement15;
            str11 = strDecodeStringElement14;
            str9 = strDecodeStringElement4;
            str19 = strDecodeStringElement19;
            str13 = strDecodeStringElement10;
            str14 = strDecodeStringElement9;
            holderTagResponseData = holderTagResponseData2;
            str17 = strDecodeStringElement16;
            str = strDecodeStringElement13;
        } else {
            int i5 = 22;
            String strDecodeStringElement23 = null;
            int i6 = 0;
            boolean z = true;
            List list2 = null;
            HolderTagResponseData holderTagResponseData3 = null;
            String strDecodeStringElement24 = null;
            String strDecodeStringElement25 = null;
            strDecodeStringElement = null;
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
            String strDecodeStringElement42 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 5;
                        i5 = 22;
                        break;
                    case 0:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 |= 1;
                        i4 = 5;
                        i5 = 22;
                        break;
                    case 1:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 |= 2;
                        i4 = 5;
                        i5 = 22;
                        break;
                    case 2:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 |= 4;
                        i4 = 5;
                        i5 = 22;
                        break;
                    case 3:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 |= 8;
                        i5 = 22;
                        break;
                    case 4:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = i6 | 16;
                        i6 = i2;
                        i5 = 22;
                        break;
                    case 5:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i2 = i6 | 32;
                        i6 = i2;
                        i5 = 22;
                        break;
                    case 6:
                        holderTagResponseData3 = (HolderTagResponseData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, HolderTagResponseData$$serializer.INSTANCE, holderTagResponseData3);
                        i2 = i6 | 64;
                        i6 = i2;
                        i5 = 22;
                        break;
                    case 7:
                        i6 |= 128;
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 = 22;
                        break;
                    case 8:
                        i6 |= 256;
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 = 22;
                        break;
                    case 9:
                        i6 |= 512;
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 = 22;
                        break;
                    case 10:
                        i6 |= 1024;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i5 = 22;
                        break;
                    case 11:
                        i6 |= 2048;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 = 22;
                        break;
                    case 12:
                        i6 |= 4096;
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 = 22;
                        break;
                    case 13:
                        i6 |= 8192;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 = 22;
                        break;
                    case 14:
                        i6 |= 16384;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i5 = 22;
                        break;
                    case 15:
                        i6 |= 32768;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i5 = 22;
                        break;
                    case 16:
                        i6 |= 65536;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 = 22;
                        break;
                    case 17:
                        i6 |= 131072;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i5 = 22;
                        break;
                    case 18:
                        i6 |= 262144;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i5 = 22;
                        break;
                    case 19:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i6 |= 524288;
                        i5 = 22;
                        break;
                    case 20:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i3 = 1048576;
                        i6 = i3 | i6;
                        i5 = 22;
                        break;
                    case 21:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = 2097152;
                        i6 = i3 | i6;
                        i5 = 22;
                        break;
                    case 22:
                        list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list2);
                        i3 = 4194304;
                        i6 = i3 | i6;
                        i5 = 22;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i6;
            holderTagResponseData = holderTagResponseData3;
            str = strDecodeStringElement23;
            str2 = strDecodeStringElement27;
            str3 = strDecodeStringElement28;
            str4 = strDecodeStringElement30;
            strDecodeStringElement2 = strDecodeStringElement31;
            str5 = strDecodeStringElement32;
            str6 = strDecodeStringElement33;
            str7 = strDecodeStringElement34;
            str8 = strDecodeStringElement35;
            str9 = strDecodeStringElement36;
            str10 = strDecodeStringElement37;
            str11 = strDecodeStringElement38;
            str12 = strDecodeStringElement39;
            str13 = strDecodeStringElement40;
            str14 = strDecodeStringElement41;
            str15 = strDecodeStringElement42;
            list = list2;
            str16 = strDecodeStringElement24;
            str17 = strDecodeStringElement29;
            String str20 = strDecodeStringElement26;
            str18 = strDecodeStringElement25;
            str19 = str20;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HolderRankingResponseData(i, str10, str9, str15, str8, str7, str6, holderTagResponseData, str14, str13, str12, str5, str, str11, strDecodeStringElement2, str4, str17, str3, str2, str19, strDecodeStringElement, str18, str16, list, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HolderRankingResponseData holderRankingResponseData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(holderRankingResponseData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HolderRankingResponseData.write$Self$OKDex_dex_impl(holderRankingResponseData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
