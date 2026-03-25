package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class EosMarketBean$$serializer implements GeneratedSerializer<EosMarketBean> {
    public static final int $stable;
    public static final EosMarketBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EosMarketBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EosMarketBean$$serializer eosMarketBean$$serializer = new EosMarketBean$$serializer();
        INSTANCE = eosMarketBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.EosMarketBean", eosMarketBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("ramPrice", true);
        pluginGeneratedSerialDescriptor.addElement("ramBytes", true);
        pluginGeneratedSerialDescriptor.addElement("ramAmount", true);
        pluginGeneratedSerialDescriptor.addElement("cpuAmount", true);
        pluginGeneratedSerialDescriptor.addElement("netAmount", true);
        pluginGeneratedSerialDescriptor.addElement("sumAmount", true);
        pluginGeneratedSerialDescriptor.addElement("sumCurrencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("rate", true);
        pluginGeneratedSerialDescriptor.addElement("weightAmount", true);
        pluginGeneratedSerialDescriptor.addElement("weightCurrencyAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EosMarketBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
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
            str2 = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str = strDecodeStringElement11;
            str3 = strDecodeStringElement9;
            str9 = strDecodeStringElement8;
            str6 = strDecodeStringElement7;
            str7 = strDecodeStringElement5;
            str5 = strDecodeStringElement10;
            str8 = strDecodeStringElement6;
            str10 = strDecodeStringElement4;
            str4 = strDecodeStringElement3;
            i = 2047;
        } else {
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            String strDecodeStringElement22 = null;
            boolean z2 = true;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        z2 = z;
                        break;
                    case 0:
                        i2 |= 1;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        break;
                    case 1:
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i2 |= 4;
                        z = z2;
                        z2 = z;
                        break;
                    case 3:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i2 |= 8;
                        z = z2;
                        z2 = z;
                        break;
                    case 4:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i2 |= 16;
                        z = z2;
                        z2 = z;
                        break;
                    case 5:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i2 |= 32;
                        z = z2;
                        z2 = z;
                        break;
                    case 6:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i2 |= 64;
                        z = z2;
                        z2 = z;
                        break;
                    case 7:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i2 |= 128;
                        z = z2;
                        z2 = z;
                        break;
                    case 8:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i2 |= 256;
                        z = z2;
                        z2 = z;
                        break;
                    case 9:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i2 |= 512;
                        z = z2;
                        z2 = z;
                        break;
                    case 10:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i2 |= 1024;
                        z = z2;
                        z2 = z;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement13;
            str = strDecodeStringElement14;
            str2 = strDecodeStringElement12;
            i = i2;
            String str11 = strDecodeStringElement21;
            str3 = strDecodeStringElement15;
            str4 = strDecodeStringElement22;
            str5 = strDecodeStringElement19;
            str6 = strDecodeStringElement17;
            str7 = strDecodeStringElement18;
            str8 = strDecodeStringElement20;
            str9 = strDecodeStringElement16;
            str10 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EosMarketBean(i, str2, str4, str10, str7, str8, str6, str9, str3, str5, str, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EosMarketBean eosMarketBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(eosMarketBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EosMarketBean.write$Self$OKWallet_wallet_impl(eosMarketBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
