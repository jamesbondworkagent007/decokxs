package com.okinc.business.dexlogic.bean;

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
public final /* synthetic */ class MevInfoBean$$serializer implements GeneratedSerializer<MevInfoBean> {
    public static final int $stable;
    public static final MevInfoBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MevInfoBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MevInfoBean$$serializer mevInfoBean$$serializer = new MevInfoBean$$serializer();
        INSTANCE = mevInfoBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dexlogic.bean.MevInfoBean", mevInfoBean$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("baseFee", true);
        pluginGeneratedSerialDescriptor.addElement("baseFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fastFee", true);
        pluginGeneratedSerialDescriptor.addElement("fastFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fastMaxFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fastPriority", true);
        pluginGeneratedSerialDescriptor.addElement("isDefault", true);
        pluginGeneratedSerialDescriptor.addElement("marketFee", true);
        pluginGeneratedSerialDescriptor.addElement("marketFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("marketMaxFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("marketPriority", true);
        pluginGeneratedSerialDescriptor.addElement("name", true);
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
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MevInfoBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z;
        String strDecodeStringElement3;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 3;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
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
            String strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            str14 = strDecodeStringElement16;
            str7 = strDecodeStringElement9;
            str12 = strDecodeStringElement20;
            str15 = strDecodeStringElement19;
            strDecodeStringElement = strDecodeStringElement18;
            str16 = strDecodeStringElement17;
            str4 = strDecodeStringElement11;
            str9 = strDecodeStringElement13;
            str10 = strDecodeStringElement12;
            str11 = strDecodeStringElement10;
            z = zDecodeBooleanElement;
            str2 = strDecodeStringElement7;
            str3 = strDecodeStringElement8;
            str5 = strDecodeStringElement6;
            str6 = strDecodeStringElement5;
            str13 = strDecodeStringElement15;
            i = 1048575;
            str8 = strDecodeStringElement14;
            str = strDecodeStringElement4;
        } else {
            int i3 = 0;
            int i4 = 19;
            String strDecodeStringElement21 = null;
            boolean zDecodeBooleanElement2 = false;
            boolean z2 = true;
            String strDecodeStringElement22 = null;
            String strDecodeStringElement23 = null;
            strDecodeStringElement = null;
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
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 0:
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 1:
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 2:
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 3:
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i3 |= 8;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 4:
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 5:
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 7:
                        strDecodeStringElement37 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 8:
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 9:
                        strDecodeStringElement36 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 10:
                        strDecodeStringElement35 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 11:
                        strDecodeStringElement34 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i3 |= 2048;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 12:
                        strDecodeStringElement33 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i3 |= 4096;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 13:
                        strDecodeStringElement38 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i3 |= 8192;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 14:
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i3 |= 16384;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 15:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i3 |= 32768;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 16:
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
                        i3 |= 65536;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 17:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i3 |= 131072;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 18:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i3 |= 262144;
                        i2 = 3;
                        i4 = 19;
                        break;
                    case 19:
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i3 |= 524288;
                        i2 = 3;
                        i4 = 19;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i3;
            str = strDecodeStringElement25;
            str2 = strDecodeStringElement26;
            str3 = strDecodeStringElement27;
            str4 = strDecodeStringElement28;
            str5 = strDecodeStringElement29;
            str6 = strDecodeStringElement30;
            strDecodeStringElement2 = strDecodeStringElement31;
            str7 = strDecodeStringElement32;
            str8 = strDecodeStringElement34;
            str9 = strDecodeStringElement35;
            str10 = strDecodeStringElement36;
            str11 = strDecodeStringElement37;
            z = zDecodeBooleanElement2;
            strDecodeStringElement3 = strDecodeStringElement21;
            str12 = strDecodeStringElement22;
            str13 = strDecodeStringElement33;
            str14 = strDecodeStringElement38;
            String str17 = strDecodeStringElement24;
            str15 = strDecodeStringElement23;
            str16 = str17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MevInfoBean(i, str, str6, str5, str2, str3, str7, z, str11, str4, str10, str9, str8, str13, str14, str16, strDecodeStringElement, str15, str12, strDecodeStringElement3, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MevInfoBean mevInfoBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mevInfoBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MevInfoBean.write$Self$OKDex_dex_impl(mevInfoBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
