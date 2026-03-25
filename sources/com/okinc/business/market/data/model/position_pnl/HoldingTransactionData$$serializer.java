package com.okinc.business.market.data.model.position_pnl;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class HoldingTransactionData$$serializer implements GeneratedSerializer<HoldingTransactionData> {
    public static final int $stable;
    public static final HoldingTransactionData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HoldingTransactionData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HoldingTransactionData$$serializer holdingTransactionData$$serializer = new HoldingTransactionData$$serializer();
        INSTANCE = holdingTransactionData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.market.data.model.position_pnl.HoldingTransactionData", holdingTransactionData$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("blockBalance", true);
        pluginGeneratedSerialDescriptor.addElement("boughtAmount", true);
        pluginGeneratedSerialDescriptor.addElement("boughtTxs", true);
        pluginGeneratedSerialDescriptor.addElement("boughtVolume", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("holdAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("realizedCost", true);
        pluginGeneratedSerialDescriptor.addElement("realizedProfit", true);
        pluginGeneratedSerialDescriptor.addElement("soldAmount", true);
        pluginGeneratedSerialDescriptor.addElement("soldAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("boughtAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("soldTxs", true);
        pluginGeneratedSerialDescriptor.addElement("soldVolume", true);
        pluginGeneratedSerialDescriptor.addElement("spotBalance", true);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", true);
        pluginGeneratedSerialDescriptor.addElement("walletAddress", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HoldingTransactionData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
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
        String strDecodeStringElement2;
        String str10;
        String str11;
        String str12;
        String strDecodeStringElement3;
        String str13;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 2;
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
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            str5 = strDecodeStringElement15;
            str12 = strDecodeStringElement16;
            i = 65535;
            str13 = strDecodeStringElement14;
            str11 = strDecodeStringElement11;
            str = strDecodeStringElement4;
            str6 = strDecodeStringElement13;
            str8 = strDecodeStringElement10;
            str4 = strDecodeStringElement7;
            str3 = strDecodeStringElement5;
            str7 = strDecodeStringElement12;
            str2 = strDecodeStringElement6;
            str9 = strDecodeStringElement9;
            str10 = strDecodeStringElement8;
        } else {
            int i3 = 0;
            int i4 = 15;
            String strDecodeStringElement17 = null;
            boolean z = true;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
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
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 0:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 2:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 4;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 3:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 4:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 5:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 6:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 7:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 8:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 9:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 10:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 11:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 12:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 13:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 14:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i2 = 2;
                        i4 = 15;
                        break;
                    case 15:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 |= 32768;
                        i2 = 2;
                        i4 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement19;
            str3 = strDecodeStringElement20;
            str4 = strDecodeStringElement21;
            str5 = strDecodeStringElement22;
            str6 = strDecodeStringElement24;
            str7 = strDecodeStringElement25;
            str8 = strDecodeStringElement26;
            str9 = strDecodeStringElement27;
            strDecodeStringElement2 = strDecodeStringElement28;
            str10 = strDecodeStringElement29;
            str11 = strDecodeStringElement30;
            str12 = strDecodeStringElement31;
            strDecodeStringElement3 = strDecodeStringElement17;
            str13 = strDecodeStringElement23;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HoldingTransactionData(i, str, str3, str2, str4, str10, strDecodeStringElement2, str9, str8, str11, str7, str6, str13, str5, str12, strDecodeStringElement3, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HoldingTransactionData holdingTransactionData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(holdingTransactionData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HoldingTransactionData.write$Self$OKDex_dex_impl(holdingTransactionData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
