package com.okinc.business.defi.biz.net.bean;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class CeDefiPreCreateOrderReq$$serializer implements GeneratedSerializer<CeDefiPreCreateOrderReq> {
    public static final int $stable;
    public static final CeDefiPreCreateOrderReq$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CeDefiPreCreateOrderReq$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CeDefiPreCreateOrderReq$$serializer ceDefiPreCreateOrderReq$$serializer = new CeDefiPreCreateOrderReq$$serializer();
        INSTANCE = ceDefiPreCreateOrderReq$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.CeDefiPreCreateOrderReq", ceDefiPreCreateOrderReq$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("toAddress", false);
        pluginGeneratedSerialDescriptor.addElement("projectId", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        pluginGeneratedSerialDescriptor.addElement("gasFeeInfo", false);
        pluginGeneratedSerialDescriptor.addElement("accountType", false);
        pluginGeneratedSerialDescriptor.addElement("accountId", false);
        pluginGeneratedSerialDescriptor.addElement("bizExtraData", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(CeDefiEvmGasLimit$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CeDefiEvmGasPrice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CeDefiSolGas$$serializer.INSTANCE), intSerializer, stringSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CeDefiPreCreateOrderReq deserialize(@NotNull Decoder decoder) {
        int i;
        String strDecodeStringElement;
        String strDecodeStringElement2;
        int i2;
        CeDefiSolGas ceDefiSolGas;
        CeDefiEvmGasPrice ceDefiEvmGasPrice;
        CeDefiEvmGasLimit ceDefiEvmGasLimit;
        int i3;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 7;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            CeDefiEvmGasLimit ceDefiEvmGasLimit2 = (CeDefiEvmGasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CeDefiEvmGasLimit$$serializer.INSTANCE, null);
            CeDefiEvmGasPrice ceDefiEvmGasPrice2 = (CeDefiEvmGasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CeDefiEvmGasPrice$$serializer.INSTANCE, null);
            CeDefiSolGas ceDefiSolGas2 = (CeDefiSolGas) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CeDefiSolGas$$serializer.INSTANCE, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            i2 = iDecodeIntElement2;
            ceDefiSolGas = ceDefiSolGas2;
            ceDefiEvmGasLimit = ceDefiEvmGasLimit2;
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            ceDefiEvmGasPrice = ceDefiEvmGasPrice2;
            i = 511;
            str = strDecodeStringElement4;
            i3 = iDecodeIntElement;
            str2 = strDecodeStringElement3;
        } else {
            CeDefiEvmGasLimit ceDefiEvmGasLimit3 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            int iDecodeIntElement3 = 0;
            int i5 = 0;
            boolean z = true;
            CeDefiEvmGasPrice ceDefiEvmGasPrice3 = null;
            int iDecodeIntElement4 = 0;
            CeDefiSolGas ceDefiSolGas3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 7;
                        break;
                    case 0:
                        i5 |= 1;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i4 = 7;
                        break;
                    case 1:
                        i5 |= 2;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i4 = 7;
                        break;
                    case 2:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 7;
                        break;
                    case 3:
                        i5 |= 8;
                        ceDefiEvmGasLimit3 = (CeDefiEvmGasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, CeDefiEvmGasLimit$$serializer.INSTANCE, ceDefiEvmGasLimit3);
                        i4 = 7;
                        break;
                    case 4:
                        i5 |= 16;
                        ceDefiEvmGasPrice3 = (CeDefiEvmGasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, CeDefiEvmGasPrice$$serializer.INSTANCE, ceDefiEvmGasPrice3);
                        i4 = 7;
                        break;
                    case 5:
                        i5 |= 32;
                        ceDefiSolGas3 = (CeDefiSolGas) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, CeDefiSolGas$$serializer.INSTANCE, ceDefiSolGas3);
                        i4 = 7;
                        break;
                    case 6:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 7;
                        break;
                    case 7:
                        i5 |= 128;
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i4 = 7;
                        break;
                    case 8:
                        i5 |= 256;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i5;
            strDecodeStringElement = strDecodeStringElement5;
            strDecodeStringElement2 = strDecodeStringElement6;
            i2 = iDecodeIntElement3;
            ceDefiSolGas = ceDefiSolGas3;
            ceDefiEvmGasPrice = ceDefiEvmGasPrice3;
            ceDefiEvmGasLimit = ceDefiEvmGasLimit3;
            i3 = iDecodeIntElement4;
            str = strDecodeStringElement7;
            str2 = strDecodeStringElement8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CeDefiPreCreateOrderReq(i, str2, str, i3, ceDefiEvmGasLimit, ceDefiEvmGasPrice, ceDefiSolGas, i2, strDecodeStringElement, strDecodeStringElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CeDefiPreCreateOrderReq ceDefiPreCreateOrderReq) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ceDefiPreCreateOrderReq, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CeDefiPreCreateOrderReq.write$Self$OKWallet_wallet_impl(ceDefiPreCreateOrderReq, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
