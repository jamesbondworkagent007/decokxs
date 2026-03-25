package com.okinc.business.dexlogic.bean;

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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class NonMevPriorityFeeInfo$$serializer implements GeneratedSerializer<NonMevPriorityFeeInfo> {
    public static final int $stable;
    public static final NonMevPriorityFeeInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private NonMevPriorityFeeInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        NonMevPriorityFeeInfo$$serializer nonMevPriorityFeeInfo$$serializer = new NonMevPriorityFeeInfo$$serializer();
        INSTANCE = nonMevPriorityFeeInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo", nonMevPriorityFeeInfo$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("baseFee", true);
        pluginGeneratedSerialDescriptor.addElement("baseFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fastFee", true);
        pluginGeneratedSerialDescriptor.addElement("fastFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fastMaxFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fastPriority", true);
        pluginGeneratedSerialDescriptor.addElement("marketFee", true);
        pluginGeneratedSerialDescriptor.addElement("marketFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("marketMaxFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("marketPriority", true);
        pluginGeneratedSerialDescriptor.addElement("turboFee", true);
        pluginGeneratedSerialDescriptor.addElement("turboFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("turboMaxFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("turboPriority", true);
        pluginGeneratedSerialDescriptor.addElement("marketGasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("fastGasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("turboGasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("maxBaseFee", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final NonMevPriorityFeeInfo deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
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
        String strDecodeStringElement3;
        String str11;
        String strDecodeStringElement4;
        String str12;
        String str13;
        String str14;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            str14 = strDecodeStringElement17;
            str12 = strDecodeStringElement19;
            strDecodeStringElement = strDecodeStringElement18;
            str7 = strDecodeStringElement14;
            str8 = strDecodeStringElement13;
            str9 = strDecodeStringElement11;
            str5 = strDecodeStringElement8;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement6;
            str13 = strDecodeStringElement16;
            i = 262143;
            str6 = strDecodeStringElement15;
            str = strDecodeStringElement5;
            str10 = strDecodeStringElement10;
            str11 = strDecodeStringElement9;
        } else {
            int i3 = 0;
            int i4 = 17;
            String strDecodeStringElement20 = null;
            boolean z = true;
            String strDecodeStringElement21 = null;
            strDecodeStringElement = null;
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
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 0:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 1:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 2:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 3:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 4:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 5:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 6:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 7:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 8:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 256;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 9:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 10:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 11:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 12:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 13:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 14:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 15:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 |= 32768;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 16:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 |= 65536;
                        i2 = 8;
                        i4 = 17;
                        break;
                    case 17:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 |= 131072;
                        i2 = 8;
                        i4 = 17;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = strDecodeStringElement22;
            str2 = strDecodeStringElement23;
            str3 = strDecodeStringElement24;
            str4 = strDecodeStringElement25;
            strDecodeStringElement2 = strDecodeStringElement26;
            str5 = strDecodeStringElement27;
            str6 = strDecodeStringElement29;
            str7 = strDecodeStringElement30;
            str8 = strDecodeStringElement31;
            str9 = strDecodeStringElement32;
            str10 = strDecodeStringElement33;
            strDecodeStringElement3 = strDecodeStringElement34;
            str11 = strDecodeStringElement35;
            strDecodeStringElement4 = strDecodeStringElement20;
            str12 = strDecodeStringElement21;
            str13 = strDecodeStringElement28;
            str14 = strDecodeStringElement36;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new NonMevPriorityFeeInfo(i, str, str4, str3, str5, str11, strDecodeStringElement3, str10, str9, str2, str8, str7, str6, str13, str14, strDecodeStringElement, str12, strDecodeStringElement4, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull NonMevPriorityFeeInfo nonMevPriorityFeeInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(nonMevPriorityFeeInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        NonMevPriorityFeeInfo.write$Self$OKDex_dex_impl(nonMevPriorityFeeInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
