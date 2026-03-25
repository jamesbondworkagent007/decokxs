package com.okinc.business.dexlogic.bean;

import com.appsflyer.AdRevenueScheme;
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

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ServiceFeeInfo$$serializer implements GeneratedSerializer<ServiceFeeInfo> {
    public static final int $stable;
    public static final ServiceFeeInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ServiceFeeInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ServiceFeeInfo$$serializer serviceFeeInfo$$serializer = new ServiceFeeInfo$$serializer();
        INSTANCE = serviceFeeInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.ServiceFeeInfo", serviceFeeInfo$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("originalServiceFeeRate", true);
        pluginGeneratedSerialDescriptor.addElement("discountedServiceFee", true);
        pluginGeneratedSerialDescriptor.addElement("discountedServiceFeeRate", true);
        pluginGeneratedSerialDescriptor.addElement("userId", true);
        pluginGeneratedSerialDescriptor.addElement("isChargeVersion", true);
        pluginGeneratedSerialDescriptor.addElement("isDisplayServiceFee", true);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("encryptServiceFeeData", true);
        pluginGeneratedSerialDescriptor.addElement("faqUrl", true);
        pluginGeneratedSerialDescriptor.addElement("refCode", true);
        pluginGeneratedSerialDescriptor.addElement("referralCommissionRate", true);
        pluginGeneratedSerialDescriptor.addElement("referralCommissionAddress", true);
        pluginGeneratedSerialDescriptor.addElement("commissionDirection", true);
        pluginGeneratedSerialDescriptor.addElement(AdRevenueScheme.COUNTRY, true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenCostAmt", true);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeTokenSymbol", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ServiceFeeInfo deserialize(@NotNull Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String strDecodeStringElement2;
        String str10;
        String str11;
        String strDecodeStringElement3;
        String str12;
        String str13;
        boolean z;
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
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            z = zDecodeBooleanElement;
            str12 = strDecodeStringElement16;
            str6 = strDecodeStringElement13;
            str11 = strDecodeStringElement11;
            str3 = strDecodeStringElement5;
            str8 = strDecodeStringElement10;
            str4 = strDecodeStringElement7;
            str7 = strDecodeStringElement12;
            str2 = strDecodeStringElement6;
            str13 = strDecodeStringElement15;
            i = 131071;
            str5 = strDecodeStringElement14;
            str = strDecodeStringElement4;
            str9 = strDecodeStringElement9;
            str10 = strDecodeStringElement8;
        } else {
            int i3 = 0;
            int i4 = 16;
            String strDecodeStringElement17 = null;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
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
            String strDecodeStringElement31 = null;
            String strDecodeStringElement32 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 0:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 1:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 2:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 4;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 3:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 4:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 5:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 6:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 7:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 8:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 9:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 10:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 11:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 12:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 13:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 14:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 15:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 |= 32768;
                        i2 = 2;
                        i4 = 16;
                        break;
                    case 16:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 |= 65536;
                        i2 = 2;
                        i4 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = strDecodeStringElement19;
            str2 = strDecodeStringElement20;
            str3 = strDecodeStringElement21;
            strDecodeStringElement = strDecodeStringElement22;
            str4 = strDecodeStringElement23;
            str5 = strDecodeStringElement25;
            str6 = strDecodeStringElement26;
            str7 = strDecodeStringElement27;
            str8 = strDecodeStringElement28;
            str9 = strDecodeStringElement29;
            strDecodeStringElement2 = strDecodeStringElement30;
            str10 = strDecodeStringElement31;
            str11 = strDecodeStringElement32;
            strDecodeStringElement3 = strDecodeStringElement17;
            str12 = strDecodeStringElement18;
            str13 = strDecodeStringElement24;
            z = zDecodeBooleanElement2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ServiceFeeInfo(i, str, str3, str2, str4, str10, strDecodeStringElement2, str9, str8, str11, str7, str6, str5, str13, z, str12, strDecodeStringElement3, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ServiceFeeInfo serviceFeeInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(serviceFeeInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ServiceFeeInfo.write$Self$OKDex_dex_impl(serviceFeeInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
