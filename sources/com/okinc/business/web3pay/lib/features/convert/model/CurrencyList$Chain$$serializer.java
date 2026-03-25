package com.okinc.business.web3pay.lib.features.convert.model;

import com.okinc.business.web3pay.lib.features.convert.model.CurrencyList;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CurrencyList$Chain$$serializer implements GeneratedSerializer<CurrencyList.Chain> {
    public static final int $stable;
    public static final CurrencyList$Chain$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CurrencyList$Chain$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CurrencyList$Chain$$serializer currencyList$Chain$$serializer = new CurrencyList$Chain$$serializer();
        INSTANCE = currencyList$Chain$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.convert.model.CurrencyList.Chain", currencyList$Chain$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("underMaintenance", false);
        pluginGeneratedSerialDescriptor.addElement("chainLogo", false);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("chainName", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("pay", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{booleanSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, booleanSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CurrencyList.Chain deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        String str;
        boolean z;
        int i;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        String str7;
        boolean z3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 0;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            z = zDecodeBooleanElement;
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            str = strDecodeStringElement8;
            i2 = iDecodeIntElement;
            z2 = zDecodeBooleanElement2;
            str4 = strDecodeStringElement6;
            str5 = strDecodeStringElement4;
            str3 = strDecodeStringElement7;
            str6 = strDecodeStringElement5;
            str7 = strDecodeStringElement3;
            str2 = strDecodeStringElement2;
            i = 2047;
        } else {
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            boolean z4 = true;
            boolean zDecodeBooleanElement3 = false;
            int iDecodeIntElement2 = 0;
            boolean zDecodeBooleanElement4 = false;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        z4 = z3;
                        break;
                    case 0:
                        i3 |= 1;
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 0);
                        break;
                    case 1:
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        break;
                    case 2:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 3:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i3 |= 8;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 4:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i3 |= 16;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 5:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i3 |= 32;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 6:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i3 |= 64;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 7:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i3 |= 128;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 8:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i3 |= 256;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 9:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i3 |= 512;
                        z3 = z4;
                        z4 = z3;
                        break;
                    case 10:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
                        i3 |= 1024;
                        z3 = z4;
                        z4 = z3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            strDecodeStringElement = strDecodeStringElement9;
            str = strDecodeStringElement10;
            z = zDecodeBooleanElement3;
            i = i3;
            String str8 = strDecodeStringElement15;
            i2 = iDecodeIntElement2;
            str2 = strDecodeStringElement16;
            str3 = strDecodeStringElement13;
            str4 = strDecodeStringElement11;
            str5 = strDecodeStringElement12;
            str6 = strDecodeStringElement14;
            z2 = zDecodeBooleanElement4;
            str7 = str8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CurrencyList.Chain(i, z, str2, str7, str5, str6, str4, z2, i2, str3, str, strDecodeStringElement, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CurrencyList.Chain chain) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(chain, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CurrencyList.Chain.write$Self$OKPayCore_web3pay_lib(chain, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
