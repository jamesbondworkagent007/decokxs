package com.okinc.business.web3pay.lib.features.convert.model;

import com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo;
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
public final /* synthetic */ class CurrencyPairInfo$From$$serializer implements GeneratedSerializer<CurrencyPairInfo.From> {
    public static final int $stable;
    public static final CurrencyPairInfo$From$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CurrencyPairInfo$From$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CurrencyPairInfo$From$$serializer currencyPairInfo$From$$serializer = new CurrencyPairInfo$From$$serializer();
        INSTANCE = currencyPairInfo$From$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.convert.model.CurrencyPairInfo.From", currencyPairInfo$From$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenPrice", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CurrencyPairInfo.From deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        String str2;
        int i;
        String str3;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        boolean z;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            str2 = strDecodeStringElement2;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str = strDecodeStringElement10;
            str3 = strDecodeStringElement8;
            str8 = strDecodeStringElement7;
            str5 = strDecodeStringElement6;
            str6 = strDecodeStringElement4;
            str4 = strDecodeStringElement9;
            str7 = strDecodeStringElement5;
            str9 = strDecodeStringElement3;
            i2 = iDecodeIntElement;
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
                        i3 |= 1;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        break;
                    case 1:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        z = z2;
                        z2 = z;
                        break;
                    case 3:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        z = z2;
                        z2 = z;
                        break;
                    case 4:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        z = z2;
                        z2 = z;
                        break;
                    case 5:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        z = z2;
                        z2 = z;
                        break;
                    case 6:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i3 |= 64;
                        z = z2;
                        z2 = z;
                        break;
                    case 7:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i3 |= 128;
                        z = z2;
                        z2 = z;
                        break;
                    case 8:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        z = z2;
                        z2 = z;
                        break;
                    case 9:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        z = z2;
                        z2 = z;
                        break;
                    case 10:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        z = z2;
                        z2 = z;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement12;
            str = strDecodeStringElement13;
            str2 = strDecodeStringElement11;
            i = i3;
            String str10 = strDecodeStringElement20;
            str3 = strDecodeStringElement14;
            i2 = iDecodeIntElement2;
            str4 = strDecodeStringElement18;
            str5 = strDecodeStringElement16;
            str6 = strDecodeStringElement17;
            str7 = strDecodeStringElement19;
            str8 = strDecodeStringElement15;
            str9 = str10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CurrencyPairInfo.From(i, str2, i2, str9, str6, str7, str5, str8, str3, str4, str, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CurrencyPairInfo.From from) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(from, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CurrencyPairInfo.From.write$Self$OKPayCore_web3pay_lib(from, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
