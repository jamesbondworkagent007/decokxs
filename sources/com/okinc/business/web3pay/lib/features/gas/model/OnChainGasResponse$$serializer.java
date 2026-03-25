package com.okinc.business.web3pay.lib.features.gas.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
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
public final /* synthetic */ class OnChainGasResponse$$serializer implements GeneratedSerializer<OnChainGasResponse> {
    public static final int $stable;
    public static final OnChainGasResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OnChainGasResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OnChainGasResponse$$serializer onChainGasResponse$$serializer = new OnChainGasResponse$$serializer();
        INSTANCE = onChainGasResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.gas.model.OnChainGasResponse", onChainGasResponse$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("gasPayType", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("transactionOperations", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterName", false);
        pluginGeneratedSerialDescriptor.addElement("minDeposit", true);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), GasLimit$$serializer.INSTANCE, GasPrice$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OnChainGasResponse deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        GasPrice gasPrice;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        GasLimit gasLimit;
        int i4;
        String str4;
        int i5;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i6 = 11;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, null);
            GasLimit gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, null);
            i3 = 4095;
            gasPrice = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, GasPrice$$serializer.INSTANCE, null);
            gasLimit = gasLimit2;
            str5 = str6;
            i = iDecodeIntElement5;
            i4 = iDecodeIntElement4;
            str2 = strDecodeStringElement4;
            iDecodeIntElement = iDecodeIntElement3;
            i2 = iDecodeIntElement6;
            str = strDecodeStringElement3;
            str4 = strDecodeStringElement2;
            str3 = strDecodeStringElement;
            i5 = iDecodeIntElement2;
        } else {
            String str7 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean z = true;
            int iDecodeIntElement7 = 0;
            int i7 = 0;
            int iDecodeIntElement8 = 0;
            iDecodeIntElement = 0;
            int iDecodeIntElement9 = 0;
            GasLimit gasLimit3 = null;
            int iDecodeIntElement10 = 0;
            GasPrice gasPrice2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i6 = 11;
                        break;
                    case 0:
                        i7 |= 1;
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i6 = 11;
                        break;
                    case 1:
                        i7 |= 2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i6 = 11;
                        break;
                    case 2:
                        i7 |= 4;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i6 = 11;
                        break;
                    case 3:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i7 |= 8;
                        i6 = 11;
                        break;
                    case 4:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        break;
                    case 5:
                        i7 |= 32;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i7 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i7 |= 128;
                        break;
                    case 8:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i7 |= 256;
                        break;
                    case 9:
                        i7 |= 512;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str7);
                        break;
                    case 10:
                        i7 |= 1024;
                        gasLimit3 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, gasLimit3);
                        break;
                    case 11:
                        i7 |= 2048;
                        gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, GasPrice$$serializer.INSTANCE, gasPrice2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement10;
            gasPrice = gasPrice2;
            i2 = iDecodeIntElement9;
            str = strDecodeStringElement5;
            str2 = strDecodeStringElement6;
            str3 = strDecodeStringElement8;
            i3 = i7;
            gasLimit = gasLimit3;
            i4 = iDecodeIntElement8;
            str4 = strDecodeStringElement7;
            i5 = iDecodeIntElement7;
            str5 = str7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OnChainGasResponse(i3, i5, str3, str4, iDecodeIntElement, str, str2, i4, i, i2, str5, gasLimit, gasPrice, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OnChainGasResponse onChainGasResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(onChainGasResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OnChainGasResponse.write$Self$OKPayCore_web3pay_lib(onChainGasResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
