package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class DexOrderDetailResponseBean$$serializer implements GeneratedSerializer<DexOrderDetailResponseBean> {
    public static final int $stable;
    public static final DexOrderDetailResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexOrderDetailResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexOrderDetailResponseBean$$serializer dexOrderDetailResponseBean$$serializer = new DexOrderDetailResponseBean$$serializer();
        INSTANCE = dexOrderDetailResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.DexOrderDetailResponseBean", dexOrderDetailResponseBean$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("networkFee", false);
        pluginGeneratedSerialDescriptor.addElement("networkFeeCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("network", false);
        pluginGeneratedSerialDescriptor.addElement("networkIconUrl", false);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeAmount", false);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeRate", false);
        pluginGeneratedSerialDescriptor.addElement("totalFeeAmount", false);
        pluginGeneratedSerialDescriptor.addElement("totalFeeCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("refundAmount", false);
        pluginGeneratedSerialDescriptor.addElement("refundCurrency", false);
        pluginGeneratedSerialDescriptor.addElement("dexCryptoIconNightUrl", false);
        pluginGeneratedSerialDescriptor.addElement("dexCryptoIconDayUrl", false);
        pluginGeneratedSerialDescriptor.addElement("fiatOrderStatus", true);
        pluginGeneratedSerialDescriptor.addElement("disclaimerDesc", false);
        pluginGeneratedSerialDescriptor.addElement("disclaimerLearnMoreUrl", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexOrderDetailResponseBean deserialize(@NotNull Decoder decoder) {
        int i;
        Integer num;
        String strDecodeStringElement;
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
        String str12;
        String str13;
        String str14;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        String strDecodeStringElement3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            String strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            String strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            String strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 16);
            str6 = strDecodeStringElement17;
            str4 = strDecodeStringElement15;
            str13 = strDecodeStringElement4;
            num = num2;
            str = strDecodeStringElement12;
            str11 = strDecodeStringElement7;
            i = 131071;
            str3 = strDecodeStringElement14;
            str12 = strDecodeStringElement5;
            str2 = strDecodeStringElement13;
            str14 = strDecodeStringElement6;
            str5 = strDecodeStringElement16;
            str7 = strDecodeStringElement11;
            str10 = strDecodeStringElement8;
            str8 = strDecodeStringElement10;
            str9 = strDecodeStringElement9;
        } else {
            int i2 = 16;
            boolean z = true;
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
            i = 0;
            Integer num3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 16;
                        break;
                    case 0:
                        i |= 1;
                        strDecodeStringElement31 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 = 16;
                        break;
                    case 1:
                        i |= 2;
                        strDecodeStringElement30 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 = 16;
                        break;
                    case 2:
                        i |= 4;
                        strDecodeStringElement32 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 = 16;
                        break;
                    case 3:
                        i |= 8;
                        strDecodeStringElement29 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 = 16;
                        break;
                    case 4:
                        i |= 16;
                        strDecodeStringElement28 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 = 16;
                        break;
                    case 5:
                        i |= 32;
                        strDecodeStringElement27 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 = 16;
                        break;
                    case 6:
                        i |= 64;
                        strDecodeStringElement26 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 = 16;
                        break;
                    case 7:
                        i |= 128;
                        strDecodeStringElement25 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 = 16;
                        break;
                    case 8:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i |= 256;
                        i2 = 16;
                        break;
                    case 9:
                        i |= 512;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 = 16;
                        break;
                    case 10:
                        i |= 1024;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 = 16;
                        break;
                    case 11:
                        i |= 2048;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i2 = 16;
                        break;
                    case 12:
                        i |= 4096;
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i2 = 16;
                        break;
                    case 13:
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, num3);
                        i |= 8192;
                        i2 = 16;
                        break;
                    case 14:
                        i |= 16384;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i2 = 16;
                        break;
                    case 15:
                        i |= 32768;
                        strDecodeStringElement23 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 15);
                        i2 = 16;
                        break;
                    case 16:
                        i |= 65536;
                        strDecodeStringElement24 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i2 = 16;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num3;
            strDecodeStringElement = strDecodeStringElement3;
            str = strDecodeStringElement18;
            str2 = strDecodeStringElement19;
            str3 = strDecodeStringElement20;
            str4 = strDecodeStringElement21;
            str5 = strDecodeStringElement22;
            str6 = strDecodeStringElement23;
            strDecodeStringElement2 = strDecodeStringElement24;
            str7 = strDecodeStringElement25;
            str8 = strDecodeStringElement26;
            str9 = strDecodeStringElement27;
            str10 = strDecodeStringElement28;
            str11 = strDecodeStringElement29;
            str12 = strDecodeStringElement30;
            str13 = strDecodeStringElement31;
            str14 = strDecodeStringElement32;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexOrderDetailResponseBean(i, str13, str12, str14, str11, str10, str9, str8, str7, strDecodeStringElement, str, str2, str3, str4, num, str5, str6, strDecodeStringElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexOrderDetailResponseBean dexOrderDetailResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexOrderDetailResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexOrderDetailResponseBean.write$Self$OKCRCore_cr_core(dexOrderDetailResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
