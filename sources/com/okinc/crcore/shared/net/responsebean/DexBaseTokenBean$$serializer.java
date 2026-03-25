package com.okinc.crcore.shared.net.responsebean;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class DexBaseTokenBean$$serializer implements GeneratedSerializer<DexBaseTokenBean> {
    public static final int $stable;
    public static final DexBaseTokenBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private DexBaseTokenBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        DexBaseTokenBean$$serializer dexBaseTokenBean$$serializer = new DexBaseTokenBean$$serializer();
        INSTANCE = dexBaseTokenBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.DexBaseTokenBean", dexBaseTokenBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("isNativeToken", false);
        pluginGeneratedSerialDescriptor.addElement("riskLevel", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogoUrl", false);
        pluginGeneratedSerialDescriptor.addElement("tokenName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("tokenContractAddress", false);
        pluginGeneratedSerialDescriptor.addElement("decimals", false);
        pluginGeneratedSerialDescriptor.addElement("innerOuterStatus", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, IntSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final DexBaseTokenBean deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str2 = strDecodeStringElement;
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            str = strDecodeStringElement10;
            str3 = strDecodeStringElement8;
            str9 = strDecodeStringElement7;
            str6 = strDecodeStringElement6;
            str7 = strDecodeStringElement4;
            str5 = strDecodeStringElement9;
            str8 = strDecodeStringElement5;
            str10 = strDecodeStringElement3;
            str4 = strDecodeStringElement2;
            i = 2047;
        } else {
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            boolean z2 = true;
            int iDecodeIntElement2 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = z;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        break;
                    case 1:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        z = z2;
                        z2 = z;
                        break;
                    case 3:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        z = z2;
                        z2 = z;
                        break;
                    case 4:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        z = z2;
                        z2 = z;
                        break;
                    case 5:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        z = z2;
                        z2 = z;
                        break;
                    case 6:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        z = z2;
                        z2 = z;
                        break;
                    case 7:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 |= 128;
                        z = z2;
                        z2 = z;
                        break;
                    case 8:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 |= 256;
                        z = z2;
                        z2 = z;
                        break;
                    case 9:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 |= 512;
                        z = z2;
                        z2 = z;
                        break;
                    case 10:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i2 |= 1024;
                        z = z2;
                        z2 = z;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            iDecodeIntElement = iDecodeIntElement2;
            str = strDecodeStringElement12;
            str2 = strDecodeStringElement11;
            i = i2;
            String str11 = strDecodeStringElement19;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement20;
            str5 = strDecodeStringElement17;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement16;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement14;
            str10 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new DexBaseTokenBean(i, str2, str4, str10, str7, str8, str6, str9, str3, str5, str, iDecodeIntElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull DexBaseTokenBean dexBaseTokenBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(dexBaseTokenBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        DexBaseTokenBean.write$Self$OKCRCore_cr_core(dexBaseTokenBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
