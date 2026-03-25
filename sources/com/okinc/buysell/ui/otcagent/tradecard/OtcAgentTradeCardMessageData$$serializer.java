package com.okinc.buysell.ui.otcagent.tradecard;

import com.google.firebase.analytics.FirebaseAnalytics;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class OtcAgentTradeCardMessageData$$serializer implements GeneratedSerializer<OtcAgentTradeCardMessageData> {
    public static final int $stable;
    public static final OtcAgentTradeCardMessageData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OtcAgentTradeCardMessageData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OtcAgentTradeCardMessageData$$serializer otcAgentTradeCardMessageData$$serializer = new OtcAgentTradeCardMessageData$$serializer();
        INSTANCE = otcAgentTradeCardMessageData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.buysell.ui.otcagent.tradecard.OtcAgentTradeCardMessageData", otcAgentTradeCardMessageData$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("orderId", true);
        pluginGeneratedSerialDescriptor.addElement("requestId", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("baseAmount", true);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencyIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("baseCurrencyDarkIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrencyDarkIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("quoteToken", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("paymentChannel", true);
        pluginGeneratedSerialDescriptor.addElement("feeAmount", true);
        pluginGeneratedSerialDescriptor.addElement("quoteTime", true);
        pluginGeneratedSerialDescriptor.addElement("quoteExpireMs", true);
        pluginGeneratedSerialDescriptor.addElement("isStablecoin", true);
        pluginGeneratedSerialDescriptor.addElement("isPegged", true);
        pluginGeneratedSerialDescriptor.addElement("peggedCurrency", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OtcAgentTradeCardMessageData.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, booleanSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OtcAgentTradeCardMessageData deserialize(@NotNull Decoder decoder) {
        int i;
        OtcAgentTradeCardStatus otcAgentTradeCardStatus;
        OtcAgentTradeCardType otcAgentTradeCardType;
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
        boolean zDecodeBooleanElement;
        String strDecodeStringElement;
        String str15;
        String str16;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OtcAgentTradeCardMessageData.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        int i4 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            OtcAgentTradeCardType otcAgentTradeCardType2 = (OtcAgentTradeCardType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            OtcAgentTradeCardStatus otcAgentTradeCardStatus2 = (OtcAgentTradeCardStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 20);
            str11 = strDecodeStringElement12;
            str16 = strDecodeStringElement13;
            z = zDecodeBooleanElement2;
            str15 = strDecodeStringElement17;
            str4 = strDecodeStringElement16;
            str3 = strDecodeStringElement15;
            str5 = strDecodeStringElement14;
            otcAgentTradeCardType = otcAgentTradeCardType2;
            str8 = strDecodeStringElement6;
            str9 = strDecodeStringElement5;
            str10 = strDecodeStringElement3;
            str7 = strDecodeStringElement8;
            str14 = strDecodeStringElement2;
            str12 = strDecodeStringElement7;
            str6 = strDecodeStringElement9;
            i = 2097151;
            str2 = strDecodeStringElement11;
            otcAgentTradeCardStatus = otcAgentTradeCardStatus2;
            str = strDecodeStringElement10;
            str13 = strDecodeStringElement4;
        } else {
            int i5 = 20;
            boolean zDecodeBooleanElement3 = false;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
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
            OtcAgentTradeCardType otcAgentTradeCardType3 = null;
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            String strDecodeStringElement33 = null;
            String strDecodeStringElement34 = null;
            boolean z2 = true;
            i = 0;
            OtcAgentTradeCardStatus otcAgentTradeCardStatus3 = null;
            boolean zDecodeBooleanElement4 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 0:
                        otcAgentTradeCardType3 = (OtcAgentTradeCardType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], otcAgentTradeCardType3);
                        i |= 1;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 1:
                        otcAgentTradeCardStatus3 = (OtcAgentTradeCardStatus) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], otcAgentTradeCardStatus3);
                        i |= 2;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 2:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        i2 = 6;
                        i5 = 20;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i3);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 8:
                        i |= 256;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 11:
                        i |= 2048;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 12:
                        i |= 4096;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 13:
                        i |= 8192;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 17:
                        i |= 131072;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 18:
                        i |= 262144;
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 18);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 19:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 19);
                        i |= 524288;
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    case 20:
                        i |= 1048576;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i2 = 6;
                        i3 = 5;
                        i4 = 3;
                        i5 = 20;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            otcAgentTradeCardStatus = otcAgentTradeCardStatus3;
            otcAgentTradeCardType = otcAgentTradeCardType3;
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement19;
            str3 = strDecodeStringElement20;
            str4 = strDecodeStringElement23;
            str5 = strDecodeStringElement24;
            str6 = strDecodeStringElement26;
            str7 = strDecodeStringElement27;
            str8 = strDecodeStringElement28;
            str9 = strDecodeStringElement29;
            str10 = strDecodeStringElement30;
            str11 = strDecodeStringElement31;
            str12 = strDecodeStringElement32;
            str13 = strDecodeStringElement33;
            str14 = strDecodeStringElement34;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            strDecodeStringElement = strDecodeStringElement21;
            str15 = strDecodeStringElement22;
            str16 = strDecodeStringElement25;
            z = zDecodeBooleanElement4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OtcAgentTradeCardMessageData(i, otcAgentTradeCardType, otcAgentTradeCardStatus, str14, str10, str13, str9, str8, str12, str7, str6, str, str2, str11, str16, str5, str3, str4, str15, z, zDecodeBooleanElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OtcAgentTradeCardMessageData otcAgentTradeCardMessageData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(otcAgentTradeCardMessageData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OtcAgentTradeCardMessageData.write$Self$OKBuySell_buysell_impl(otcAgentTradeCardMessageData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
