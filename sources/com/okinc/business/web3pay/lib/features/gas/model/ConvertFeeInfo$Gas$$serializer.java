package com.okinc.business.web3pay.lib.features.gas.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.PaymasterNameType;
import com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
public final /* synthetic */ class ConvertFeeInfo$Gas$$serializer implements GeneratedSerializer<ConvertFeeInfo.Gas> {
    public static final int $stable;
    public static final ConvertFeeInfo$Gas$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ConvertFeeInfo$Gas$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ConvertFeeInfo$Gas$$serializer convertFeeInfo$Gas$$serializer = new ConvertFeeInfo$Gas$$serializer();
        INSTANCE = convertFeeInfo$Gas$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.gas.model.ConvertFeeInfo.Gas", convertFeeInfo$Gas$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("gasPayType", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterName", false);
        pluginGeneratedSerialDescriptor.addElement("needToDeployContract", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenBalance", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ConvertFeeInfo.Gas.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[7]), BooleanSerializer.INSTANCE, stringSerializer, GasLimit$$serializer.INSTANCE, GasPrice$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ConvertFeeInfo.Gas deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        int i;
        GasLimit gasLimit;
        String str;
        String str2;
        String str3;
        boolean z;
        GasPayType gasPayType;
        PaymasterNameType paymasterNameType;
        String str4;
        int i2;
        int i3;
        GasPrice gasPrice;
        GasPayType gasPayType2;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = ConvertFeeInfo.Gas.$childSerializers;
        int i5 = 10;
        int i6 = 9;
        GasPrice gasPrice2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GasPayType gasPayType3 = (GasPayType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            PaymasterNameType paymasterNameType2 = (PaymasterNameType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            GasLimit gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, null);
            paymasterNameType = paymasterNameType2;
            gasPrice = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, GasPrice$$serializer.INSTANCE, null);
            gasLimit = gasLimit2;
            str4 = strDecodeStringElement6;
            i2 = iDecodeIntElement2;
            str = strDecodeStringElement5;
            i3 = iDecodeIntElement;
            z = zDecodeBooleanElement;
            strDecodeStringElement = strDecodeStringElement4;
            i = 4095;
            str3 = strDecodeStringElement2;
            str2 = strDecodeStringElement3;
            gasPayType = gasPayType3;
        } else {
            int i7 = 11;
            strDecodeStringElement = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            GasPayType gasPayType4 = null;
            boolean z2 = true;
            int i8 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean zDecodeBooleanElement2 = false;
            GasLimit gasLimit3 = null;
            PaymasterNameType paymasterNameType3 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        gasPayType2 = gasPayType4;
                        z2 = false;
                        gasPayType4 = gasPayType2;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 0:
                        gasPayType4 = (GasPayType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], gasPayType4);
                        i8 |= 1;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 1:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        gasPayType2 = gasPayType4;
                        gasPayType4 = gasPayType2;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 2:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        gasPayType2 = gasPayType4;
                        gasPayType4 = gasPayType2;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 3:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i8 |= 8;
                        gasPayType2 = gasPayType4;
                        gasPayType4 = gasPayType2;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 4:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 |= 16;
                        break;
                    case 5:
                        i8 |= 32;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 6:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i4 = i8 | 64;
                        i8 = i4;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 7:
                        paymasterNameType3 = (PaymasterNameType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], paymasterNameType3);
                        i4 = i8 | 128;
                        i8 = i4;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i4 = i8 | 256;
                        i8 = i4;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 9:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i4 = i8 | 512;
                        i8 = i4;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 10:
                        gasLimit3 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, GasLimit$$serializer.INSTANCE, gasLimit3);
                        i4 = i8 | 1024;
                        i8 = i4;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 11:
                        gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, GasPrice$$serializer.INSTANCE, gasPrice2);
                        i4 = i8 | 2048;
                        i8 = i4;
                        i7 = 11;
                        i5 = 10;
                        i6 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            GasPayType gasPayType5 = gasPayType4;
            i = i8;
            gasLimit = gasLimit3;
            str = strDecodeStringElement8;
            str2 = strDecodeStringElement9;
            str3 = strDecodeStringElement10;
            z = zDecodeBooleanElement2;
            gasPayType = gasPayType5;
            paymasterNameType = paymasterNameType3;
            str4 = strDecodeStringElement7;
            i2 = iDecodeIntElement3;
            i3 = iDecodeIntElement4;
            gasPrice = gasPrice2;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ConvertFeeInfo.Gas(i, gasPayType, str3, str2, i3, strDecodeStringElement, str, i2, paymasterNameType, z, str4, gasLimit, gasPrice, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ConvertFeeInfo.Gas gas) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(gas, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ConvertFeeInfo.Gas.write$Self$OKPayCore_web3pay_lib(gas, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
