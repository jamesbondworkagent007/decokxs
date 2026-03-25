package com.okinc.business.web3pay.lib.features.gas.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
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
public final /* synthetic */ class UpdateAccountGasInfoApiModel$$serializer implements GeneratedSerializer<UpdateAccountGasInfoApiModel> {
    public static final int $stable;
    public static final UpdateAccountGasInfoApiModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UpdateAccountGasInfoApiModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UpdateAccountGasInfoApiModel$$serializer updateAccountGasInfoApiModel$$serializer = new UpdateAccountGasInfoApiModel$$serializer();
        INSTANCE = updateAccountGasInfoApiModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.gas.model.UpdateAccountGasInfoApiModel", updateAccountGasInfoApiModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("gasPayType", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterName", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("transactionOperations", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, GasLimit$$serializer.INSTANCE, intSerializer, GasPrice$$serializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UpdateAccountGasInfoApiModel deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        String str;
        int i3;
        GasLimit gasLimit;
        String str2;
        GasPrice gasPrice;
        int i4;
        String str3;
        int i5;
        int i6;
        String str4;
        int i7;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i8 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            GasLimit gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, GasLimit$$serializer.INSTANCE, null);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            gasPrice = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, GasPrice$$serializer.INSTANCE, null);
            i2 = iDecodeIntElement5;
            i5 = iDecodeIntElement4;
            str4 = strDecodeStringElement4;
            str3 = strDecodeStringElement3;
            i4 = iDecodeIntElement2;
            gasLimit = gasLimit2;
            i6 = iDecodeIntElement3;
            i = 2047;
            str = strDecodeStringElement;
            str2 = strDecodeStringElement2;
            i3 = iDecodeIntElement;
        } else {
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            boolean z = true;
            int iDecodeIntElement6 = 0;
            int i9 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            GasLimit gasLimit3 = null;
            int iDecodeIntElement10 = 0;
            GasPrice gasPrice2 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i8 = 10;
                        break;
                    case 0:
                        i9 |= 1;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i8 = 10;
                        break;
                    case 1:
                        i9 |= 2;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 = 10;
                        break;
                    case 2:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i9 |= 4;
                        i8 = 10;
                        break;
                    case 3:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i9 |= 8;
                        break;
                    case 4:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i7 = i9 | 16;
                        i9 = i7;
                        break;
                    case 5:
                        i9 |= 32;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        i9 |= 64;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        break;
                    case 7:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i7 = i9 | 128;
                        i9 = i7;
                        break;
                    case 8:
                        i9 |= 256;
                        gasLimit3 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 8, GasLimit$$serializer.INSTANCE, gasLimit3);
                        break;
                    case 9:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i7 = i9 | 512;
                        i9 = i7;
                        break;
                    case 10:
                        i9 |= 1024;
                        gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i8, GasPrice$$serializer.INSTANCE, gasPrice2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i9;
            i2 = iDecodeIntElement10;
            str = strDecodeStringElement8;
            i3 = iDecodeIntElement6;
            String str5 = strDecodeStringElement6;
            gasLimit = gasLimit3;
            str2 = strDecodeStringElement7;
            gasPrice = gasPrice2;
            i4 = iDecodeIntElement8;
            str3 = strDecodeStringElement5;
            i5 = iDecodeIntElement7;
            i6 = iDecodeIntElement9;
            str4 = str5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UpdateAccountGasInfoApiModel(i, i3, str, str2, i4, i6, str3, str4, i5, gasLimit, i2, gasPrice, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UpdateAccountGasInfoApiModel updateAccountGasInfoApiModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(updateAccountGasInfoApiModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UpdateAccountGasInfoApiModel.write$Self$OKPayCore_web3pay_lib(updateAccountGasInfoApiModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
