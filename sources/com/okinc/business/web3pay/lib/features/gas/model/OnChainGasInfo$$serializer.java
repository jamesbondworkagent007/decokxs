package com.okinc.business.web3pay.lib.features.gas.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPayType;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.PaymasterNameType;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OnChainGasInfo$$serializer implements GeneratedSerializer<OnChainGasInfo> {
    public static final int $stable;
    public static final OnChainGasInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OnChainGasInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OnChainGasInfo$$serializer onChainGasInfo$$serializer = new OnChainGasInfo$$serializer();
        INSTANCE = onChainGasInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.gas.model.OnChainGasInfo", onChainGasInfo$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("gasPayType", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("feeCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("minDeposit", true);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("transactionOperations", false);
        pluginGeneratedSerialDescriptor.addElement("shouldShowReminder", false);
        pluginGeneratedSerialDescriptor.addElement("needToDeployContract", false);
        pluginGeneratedSerialDescriptor.addElement("needAdditionalGas", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterNameType", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OnChainGasInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{kSerializerArr[0], stringSerializer, stringSerializer, intSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, intSerializer, intSerializer, booleanSerializer, booleanSerializer, booleanSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[12]), GasLimit$$serializer.INSTANCE, GasPrice$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OnChainGasInfo deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        GasPayType gasPayType;
        String str;
        String str2;
        String str3;
        String str4;
        boolean z;
        int i2;
        int i3;
        int i4;
        boolean z2;
        GasPrice gasPrice;
        PaymasterNameType paymasterNameType;
        GasLimit gasLimit;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OnChainGasInfo.$childSerializers;
        int i5 = 10;
        int i6 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GasPayType gasPayType2 = (GasPayType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
            PaymasterNameType paymasterNameType2 = (PaymasterNameType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            gasLimit = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, GasLimit$$serializer.INSTANCE, null);
            gasPrice = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, GasPrice$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement2;
            zDecodeBooleanElement = zDecodeBooleanElement3;
            z = zDecodeBooleanElement2;
            i2 = iDecodeIntElement2;
            str4 = strDecodeStringElement4;
            str5 = str6;
            i3 = iDecodeIntElement;
            i4 = iDecodeIntElement3;
            str = strDecodeStringElement3;
            z2 = zDecodeBooleanElement4;
            paymasterNameType = paymasterNameType2;
            gasPayType = gasPayType2;
            str3 = strDecodeStringElement;
            i = 32767;
        } else {
            int i7 = 14;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement5 = false;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            int iDecodeIntElement6 = 0;
            boolean zDecodeBooleanElement6 = false;
            boolean z3 = true;
            PaymasterNameType paymasterNameType3 = null;
            GasLimit gasLimit2 = null;
            String str7 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            GasPayType gasPayType3 = null;
            GasPrice gasPrice2 = null;
            int i8 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 0:
                        gasPayType3 = (GasPayType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], gasPayType3);
                        i8 |= 1;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 1:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 2:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 3:
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i8 |= 8;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 4:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 |= 16;
                        i7 = 14;
                        break;
                    case 5:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str7);
                        i8 |= 32;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 6:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 7:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i8 |= 128;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 8:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i8 |= 256;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 9:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i8 |= 512;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 10:
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i8 |= 1024;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 11:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 11);
                        i8 |= 2048;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 12:
                        paymasterNameType3 = (PaymasterNameType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], paymasterNameType3);
                        i8 |= 4096;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 13:
                        gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, GasLimit$$serializer.INSTANCE, gasLimit2);
                        i8 |= 8192;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    case 14:
                        gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, GasPrice$$serializer.INSTANCE, gasPrice2);
                        i8 |= 16384;
                        i7 = 14;
                        i5 = 10;
                        i6 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i8;
            gasPayType = gasPayType3;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            z = zDecodeBooleanElement5;
            i2 = iDecodeIntElement4;
            i3 = iDecodeIntElement5;
            i4 = iDecodeIntElement6;
            z2 = zDecodeBooleanElement6;
            gasPrice = gasPrice2;
            paymasterNameType = paymasterNameType3;
            gasLimit = gasLimit2;
            str5 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OnChainGasInfo(i, gasPayType, str3, str2, i3, str, str5, str4, i2, i4, z, zDecodeBooleanElement, z2, paymasterNameType, gasLimit, gasPrice, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OnChainGasInfo onChainGasInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(onChainGasInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OnChainGasInfo.write$Self$OKPayCore_web3pay_lib(onChainGasInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
