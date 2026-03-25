package com.okinc.business.data.model.market;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class HolderDetailResponseData$$serializer implements GeneratedSerializer<HolderDetailResponseData> {
    public static final int $stable;
    public static final HolderDetailResponseData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HolderDetailResponseData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HolderDetailResponseData$$serializer holderDetailResponseData$$serializer = new HolderDetailResponseData$$serializer();
        INSTANCE = holderDetailResponseData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.data.model.market.HolderDetailResponseData", holderDetailResponseData$$serializer, 29);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("holderAddress", true);
        pluginGeneratedSerialDescriptor.addElement("totalBuyCount", true);
        pluginGeneratedSerialDescriptor.addElement("totalBuyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("totalBuyCurrencyValue", true);
        pluginGeneratedSerialDescriptor.addElement("totalSellCount", true);
        pluginGeneratedSerialDescriptor.addElement("totalSellAmount", true);
        pluginGeneratedSerialDescriptor.addElement("totalSellCurrencyValue", true);
        pluginGeneratedSerialDescriptor.addElement("totalProfit", true);
        pluginGeneratedSerialDescriptor.addElement("totalProfitPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("realizedProfit", true);
        pluginGeneratedSerialDescriptor.addElement("unRealizedProfit", true);
        pluginGeneratedSerialDescriptor.addElement("unRealizedProfitPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("holdAmount", true);
        pluginGeneratedSerialDescriptor.addElement("holdVolume", true);
        pluginGeneratedSerialDescriptor.addElement("holdAmountPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("holdingTime", true);
        pluginGeneratedSerialDescriptor.addElement("maxHoldAmount", true);
        pluginGeneratedSerialDescriptor.addElement("lastTradeTime", true);
        pluginGeneratedSerialDescriptor.addElement("holdStatus", true);
        pluginGeneratedSerialDescriptor.addElement("addressCreateTime", true);
        pluginGeneratedSerialDescriptor.addElement("winRate7d", true);
        pluginGeneratedSerialDescriptor.addElement("pnl7d", true);
        pluginGeneratedSerialDescriptor.addElement("txs7d", true);
        pluginGeneratedSerialDescriptor.addElement("isPnlSupported", false);
        pluginGeneratedSerialDescriptor.addElement("explorerUrl", true);
        pluginGeneratedSerialDescriptor.addElement("realizedProfitPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("tradeCurrencyValue7d", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HolderDetailResponseData deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String str4;
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
        String strDecodeStringElement;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        boolean z;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        String str27;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 5;
        int i4 = 2;
        int i5 = 0;
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
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            String strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            String strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            String strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
            String strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
            String strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
            String strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
            String strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
            str24 = strDecodeStringElement22;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
            str17 = strDecodeStringElement23;
            str21 = strDecodeStringElement24;
            str19 = strDecodeStringElement25;
            str23 = strDecodeStringElement26;
            z = zDecodeBooleanElement;
            str14 = strDecodeStringElement27;
            str13 = strDecodeStringElement28;
            str15 = strDecodeStringElement14;
            str16 = strDecodeStringElement15;
            str27 = strDecodeStringElement20;
            str25 = strDecodeStringElement19;
            str18 = strDecodeStringElement18;
            str22 = strDecodeStringElement17;
            str20 = strDecodeStringElement16;
            i = 536870911;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement10;
            str8 = strDecodeStringElement8;
            str10 = strDecodeStringElement12;
            str11 = strDecodeStringElement11;
            str12 = strDecodeStringElement9;
            str26 = strDecodeStringElement21;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement5;
            str6 = strDecodeStringElement4;
            str7 = strDecodeStringElement3;
            str9 = strDecodeStringElement13;
            str = strDecodeStringElement2;
        } else {
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
            String strDecodeStringElement43 = null;
            String strDecodeStringElement44 = null;
            String strDecodeStringElement45 = null;
            String strDecodeStringElement46 = null;
            String strDecodeStringElement47 = null;
            String strDecodeStringElement48 = null;
            String strDecodeStringElement49 = null;
            String strDecodeStringElement50 = null;
            String strDecodeStringElement51 = null;
            String strDecodeStringElement52 = null;
            String strDecodeStringElement53 = null;
            String strDecodeStringElement54 = null;
            String strDecodeStringElement55 = null;
            String strDecodeStringElement56 = null;
            boolean z2 = true;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 0:
                        strDecodeStringElement43 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 1:
                        strDecodeStringElement49 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 2:
                        strDecodeStringElement48 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i5 |= 4;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 3:
                        strDecodeStringElement45 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 4:
                        strDecodeStringElement46 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 5:
                        strDecodeStringElement44 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i5 |= 32;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 6:
                        strDecodeStringElement50 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 7:
                        strDecodeStringElement55 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i5 |= 128;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 8:
                        strDecodeStringElement47 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 9:
                        strDecodeStringElement54 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i5 |= 512;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 10:
                        strDecodeStringElement53 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i5 |= 1024;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 11:
                        strDecodeStringElement52 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i5 |= 2048;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 12:
                        strDecodeStringElement51 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i5 |= 4096;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 13:
                        strDecodeStringElement56 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i5 |= 8192;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 14:
                        strDecodeStringElement42 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i5 |= 16384;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 15:
                        strDecodeStringElement41 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i5 |= 32768;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 16:
                        strDecodeStringElement40 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i5 |= 65536;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 17:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i5 |= 131072;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 18:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i5 |= 262144;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 19:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i5 |= 524288;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 20:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
                        i5 |= 1048576;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 21:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i2 = 2097152;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 22:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 22);
                        i2 = 4194304;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 23:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 23);
                        i2 = 8388608;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 24:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 24);
                        i2 = 16777216;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 25:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 25);
                        i2 = MediaHttpDownloader.MAXIMUM_CHUNK_SIZE;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 26:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 26);
                        i2 = 67108864;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 27:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 27);
                        i2 = 134217728;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    case 28:
                        strDecodeStringElement39 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 28);
                        i2 = 268435456;
                        i5 |= i2;
                        i3 = 5;
                        i4 = 2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            str = strDecodeStringElement43;
            str2 = strDecodeStringElement44;
            str3 = strDecodeStringElement45;
            str4 = strDecodeStringElement46;
            str5 = strDecodeStringElement47;
            str6 = strDecodeStringElement48;
            str7 = strDecodeStringElement49;
            str8 = strDecodeStringElement50;
            str9 = strDecodeStringElement52;
            str10 = strDecodeStringElement53;
            str11 = strDecodeStringElement54;
            str12 = strDecodeStringElement55;
            str13 = strDecodeStringElement30;
            str14 = strDecodeStringElement31;
            strDecodeStringElement = strDecodeStringElement39;
            str15 = strDecodeStringElement51;
            str16 = strDecodeStringElement56;
            str17 = strDecodeStringElement34;
            str18 = strDecodeStringElement40;
            str19 = strDecodeStringElement32;
            str20 = strDecodeStringElement42;
            z = zDecodeBooleanElement2;
            str21 = strDecodeStringElement33;
            str22 = strDecodeStringElement41;
            str23 = strDecodeStringElement29;
            String str28 = strDecodeStringElement38;
            str24 = strDecodeStringElement35;
            str25 = str28;
            String str29 = strDecodeStringElement37;
            str26 = strDecodeStringElement36;
            str27 = str29;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HolderDetailResponseData(i, str, str7, str6, str3, str4, str2, str8, str12, str5, str11, str10, str9, str15, str16, str20, str22, str18, str25, str27, str26, str24, str17, str21, str19, str23, z, str14, str13, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HolderDetailResponseData holderDetailResponseData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(holderDetailResponseData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HolderDetailResponseData.write$Self$OKDex_dex_impl(holderDetailResponseData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
