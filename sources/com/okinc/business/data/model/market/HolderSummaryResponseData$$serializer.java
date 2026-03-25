package com.okinc.business.data.model.market;

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

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class HolderSummaryResponseData$$serializer implements GeneratedSerializer<HolderSummaryResponseData> {
    public static final int $stable;
    public static final HolderSummaryResponseData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private HolderSummaryResponseData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        HolderSummaryResponseData$$serializer holderSummaryResponseData$$serializer = new HolderSummaryResponseData$$serializer();
        INSTANCE = holderSummaryResponseData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.data.model.market.HolderSummaryResponseData", holderSummaryResponseData$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("totalHolderAmount", true);
        pluginGeneratedSerialDescriptor.addElement("top10HoldAmountPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("top100HoldAmountPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("suspiciousTagHolderAmount", true);
        pluginGeneratedSerialDescriptor.addElement("sniperTagHolderAmount", true);
        pluginGeneratedSerialDescriptor.addElement("avgHoldValue", true);
        pluginGeneratedSerialDescriptor.addElement("devHoldPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("isPnlSupported", true);
        pluginGeneratedSerialDescriptor.addElement("suspectedRatTradingHoldPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("suspiciousHoldPercentage", true);
        pluginGeneratedSerialDescriptor.addElement("top100BoughtAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("top100BoughtAvgPricePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("top100SoldAvgPrice", true);
        pluginGeneratedSerialDescriptor.addElement("top100SoldAvgPricePercentage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final HolderSummaryResponseData deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String strDecodeStringElement2;
        String strDecodeStringElement3;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z;
        String str8;
        String str9;
        String str10;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            str = strDecodeStringElement4;
            str3 = strDecodeStringElement5;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            str2 = strDecodeStringElement14;
            str4 = strDecodeStringElement13;
            str6 = strDecodeStringElement12;
            z = zDecodeBooleanElement;
            str9 = strDecodeStringElement10;
            str10 = strDecodeStringElement9;
            str7 = strDecodeStringElement7;
            strDecodeStringElement = strDecodeStringElement11;
            str8 = strDecodeStringElement8;
            str5 = strDecodeStringElement6;
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            i = 16383;
        } else {
            int i3 = 13;
            String strDecodeStringElement15 = null;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
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
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i3 = 13;
                        break;
                    case 0:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        i3 = 13;
                        break;
                    case 1:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        break;
                    case 6:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i2 |= 128;
                        break;
                    case 8:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 |= 256;
                        break;
                    case 9:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 |= 512;
                        break;
                    case 10:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 |= 1024;
                        break;
                    case 11:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 |= 2048;
                        break;
                    case 12:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i2 |= 4096;
                        break;
                    case 13:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i2 |= 8192;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement2 = strDecodeStringElement17;
            strDecodeStringElement3 = strDecodeStringElement26;
            str = strDecodeStringElement15;
            str2 = strDecodeStringElement18;
            str3 = strDecodeStringElement16;
            i = i2;
            String str11 = strDecodeStringElement25;
            str4 = strDecodeStringElement19;
            str5 = str11;
            String str12 = strDecodeStringElement24;
            str6 = strDecodeStringElement20;
            str7 = strDecodeStringElement23;
            z = zDecodeBooleanElement2;
            str8 = str12;
            String str13 = strDecodeStringElement22;
            str9 = strDecodeStringElement21;
            str10 = str13;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new HolderSummaryResponseData(i, str, str3, str5, str7, str8, str10, str9, z, strDecodeStringElement, str6, str4, str2, strDecodeStringElement2, strDecodeStringElement3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull HolderSummaryResponseData holderSummaryResponseData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(holderSummaryResponseData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        HolderSummaryResponseData.write$Self$OKDex_dex_impl(holderSummaryResponseData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
