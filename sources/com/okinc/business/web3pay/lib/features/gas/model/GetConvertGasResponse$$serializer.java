package com.okinc.business.web3pay.lib.features.gas.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse;
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
public final /* synthetic */ class GetConvertGasResponse$$serializer implements GeneratedSerializer<GetConvertGasResponse> {
    public static final int $stable;
    public static final GetConvertGasResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GetConvertGasResponse$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GetConvertGasResponse$$serializer getConvertGasResponse$$serializer = new GetConvertGasResponse$$serializer();
        INSTANCE = getConvertGasResponse$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.gas.model.GetConvertGasResponse", getConvertGasResponse$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("gasPayType", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterName", false);
        pluginGeneratedSerialDescriptor.addElement("transactionOperations", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenBalance", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        pluginGeneratedSerialDescriptor.addElement("transactionFee", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, intSerializer, stringSerializer, GasLimit$$serializer.INSTANCE, GasPrice$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(GetConvertGasResponse$TransactionFee$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GetConvertGasResponse deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        GetConvertGasResponse.TransactionFee transactionFee;
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        int i3;
        int i4;
        int i5;
        GasLimit gasLimit;
        GasPrice gasPrice;
        int i6;
        boolean z;
        int iDecodeIntElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i7 = 11;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            GasLimit gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, null);
            GasPrice gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, GasPrice$$serializer.INSTANCE, null);
            str2 = strDecodeStringElement2;
            i = 8191;
            i6 = iDecodeIntElement2;
            transactionFee = (GetConvertGasResponse.TransactionFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, GetConvertGasResponse$TransactionFee$$serializer.INSTANCE, null);
            gasPrice = gasPrice2;
            gasLimit = gasLimit2;
            str4 = strDecodeStringElement6;
            i3 = iDecodeIntElement5;
            i2 = iDecodeIntElement4;
            str3 = strDecodeStringElement5;
            i4 = iDecodeIntElement3;
            i5 = iDecodeIntElement6;
            strDecodeStringElement = strDecodeStringElement4;
            str = strDecodeStringElement3;
        } else {
            int i8 = 0;
            int iDecodeIntElement7 = 0;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            GasLimit gasLimit3 = null;
            String strDecodeStringElement7 = null;
            strDecodeStringElement = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean z2 = true;
            GetConvertGasResponse.TransactionFee transactionFee2 = null;
            GasPrice gasPrice3 = null;
            int i9 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i7 = 11;
                        break;
                    case 0:
                        z = false;
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i8 |= 1;
                        i9 = iDecodeIntElement;
                        i7 = 11;
                        break;
                    case 1:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i8 |= 2;
                        iDecodeIntElement = i9;
                        z = false;
                        i9 = iDecodeIntElement;
                        i7 = 11;
                        break;
                    case 2:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        iDecodeIntElement = i9;
                        z = false;
                        i9 = iDecodeIntElement;
                        i7 = 11;
                        break;
                    case 3:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i8 |= 8;
                        i7 = 11;
                        break;
                    case 4:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i8 |= 16;
                        i7 = 11;
                        break;
                    case 5:
                        i8 |= 32;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        break;
                    case 6:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i8 |= 64;
                        break;
                    case 7:
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i8 |= 128;
                        break;
                    case 8:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i8 |= 256;
                        break;
                    case 9:
                        i8 |= 512;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        break;
                    case 10:
                        i8 |= 1024;
                        gasLimit3 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, GasLimit$$serializer.INSTANCE, gasLimit3);
                        break;
                    case 11:
                        i8 |= 2048;
                        gasPrice3 = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i7, GasPrice$$serializer.INSTANCE, gasPrice3);
                        break;
                    case 12:
                        transactionFee2 = (GetConvertGasResponse.TransactionFee) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, GetConvertGasResponse$TransactionFee$$serializer.INSTANCE, transactionFee2);
                        i8 |= 4096;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            transactionFee = transactionFee2;
            i = i8;
            str = strDecodeStringElement8;
            str2 = strDecodeStringElement9;
            i2 = iDecodeIntElement8;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement10;
            i3 = iDecodeIntElement7;
            i4 = iDecodeIntElement9;
            i5 = iDecodeIntElement10;
            gasLimit = gasLimit3;
            gasPrice = gasPrice3;
            i6 = i9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GetConvertGasResponse(i, i6, str2, str, i4, strDecodeStringElement, str3, i2, i3, i5, str4, gasLimit, gasPrice, transactionFee, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GetConvertGasResponse getConvertGasResponse) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getConvertGasResponse, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GetConvertGasResponse.write$Self$OKPayCore_web3pay_lib(getConvertGasResponse, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
