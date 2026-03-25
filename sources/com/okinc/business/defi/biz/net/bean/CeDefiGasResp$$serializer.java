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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class CeDefiGasResp$$serializer implements GeneratedSerializer<CeDefiGasResp> {
    public static final int $stable;
    public static final CeDefiGasResp$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CeDefiGasResp$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CeDefiGasResp$$serializer ceDefiGasResp$$serializer = new CeDefiGasResp$$serializer();
        INSTANCE = ceDefiGasResp$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.CeDefiGasResp", ceDefiGasResp$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("gasPayType", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenImageUrl", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDecimalNum", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenDisplayPrecision", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenStableCoin", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterName", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenBalance", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenPrice", false);
        pluginGeneratedSerialDescriptor.addElement("nativeTokenPrice", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        pluginGeneratedSerialDescriptor.addElement("gasFeeInfo", false);
        pluginGeneratedSerialDescriptor.addElement("minTransferAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, intSerializer, intSerializer, BooleanSerializer.INSTANCE, stringSerializer, intSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(CeDefiEvmGasLimit$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CeDefiEvmGasPrice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(CeDefiSolGas$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CeDefiGasResp deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        int i3;
        String str;
        String str2;
        String str3;
        String str4;
        int i4;
        int i5;
        int i6;
        int i7;
        CeDefiEvmGasPrice ceDefiEvmGasPrice;
        CeDefiEvmGasLimit ceDefiEvmGasLimit;
        String str5;
        String str6;
        boolean z;
        String str7;
        CeDefiSolGas ceDefiSolGas;
        String str8;
        String str9;
        int i8;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i9 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
            str4 = strDecodeStringElement3;
            CeDefiEvmGasLimit ceDefiEvmGasLimit2 = (CeDefiEvmGasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, CeDefiEvmGasLimit$$serializer.INSTANCE, null);
            CeDefiEvmGasPrice ceDefiEvmGasPrice2 = (CeDefiEvmGasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, CeDefiEvmGasPrice$$serializer.INSTANCE, null);
            ceDefiSolGas = (CeDefiSolGas) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, CeDefiSolGas$$serializer.INSTANCE, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, null);
            z = zDecodeBooleanElement;
            str9 = strDecodeStringElement7;
            i4 = iDecodeIntElement6;
            i5 = iDecodeIntElement5;
            str6 = strDecodeStringElement5;
            i6 = iDecodeIntElement4;
            i7 = iDecodeIntElement3;
            str = strDecodeStringElement6;
            ceDefiEvmGasPrice = ceDefiEvmGasPrice2;
            str8 = strDecodeStringElement8;
            i = iDecodeIntElement;
            ceDefiEvmGasLimit = ceDefiEvmGasLimit2;
            str2 = strDecodeStringElement2;
            str7 = strDecodeStringElement4;
            i3 = iDecodeIntElement2;
            str3 = strDecodeStringElement;
            i2 = 524287;
        } else {
            int i10 = 0;
            int i11 = 18;
            boolean z2 = true;
            CeDefiEvmGasPrice ceDefiEvmGasPrice3 = null;
            CeDefiEvmGasLimit ceDefiEvmGasLimit3 = null;
            String str10 = null;
            CeDefiSolGas ceDefiSolGas2 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            int iDecodeIntElement7 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement8 = 0;
            int iDecodeIntElement9 = 0;
            int iDecodeIntElement10 = 0;
            int iDecodeIntElement11 = 0;
            int iDecodeIntElement12 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 0:
                        i10 |= 1;
                        iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 1:
                        i10 |= 2;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 2:
                        i10 |= 4;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 3:
                        iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i10 |= 8;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 4:
                        i10 |= 16;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 5:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i10 |= 32;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 6:
                        iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i10 |= 64;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 7:
                        iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i10 |= 128;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i9);
                        i10 |= 256;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 9:
                        i10 |= 512;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 10:
                        iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i10 |= 1024;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 11:
                        iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i10 |= 2048;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 12:
                        i10 |= 4096;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 13:
                        i10 |= 8192;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 14:
                        i10 |= 16384;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 15:
                        ceDefiEvmGasLimit3 = (CeDefiEvmGasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, CeDefiEvmGasLimit$$serializer.INSTANCE, ceDefiEvmGasLimit3);
                        i8 = 32768;
                        i10 |= i8;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 16:
                        ceDefiEvmGasPrice3 = (CeDefiEvmGasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, CeDefiEvmGasPrice$$serializer.INSTANCE, ceDefiEvmGasPrice3);
                        i8 = 65536;
                        i10 |= i8;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 17:
                        ceDefiSolGas2 = (CeDefiSolGas) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, CeDefiSolGas$$serializer.INSTANCE, ceDefiSolGas2);
                        i8 = 131072;
                        i10 |= i8;
                        i9 = 8;
                        i11 = 18;
                        break;
                    case 18:
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i11, StringSerializer.INSTANCE, str10);
                        i8 = 262144;
                        i10 |= i8;
                        i9 = 8;
                        i11 = 18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = iDecodeIntElement7;
            i2 = i10;
            i3 = iDecodeIntElement8;
            str = strDecodeStringElement10;
            str2 = strDecodeStringElement13;
            str3 = strDecodeStringElement14;
            str4 = strDecodeStringElement16;
            i4 = iDecodeIntElement9;
            i5 = iDecodeIntElement10;
            i6 = iDecodeIntElement11;
            i7 = iDecodeIntElement12;
            ceDefiEvmGasPrice = ceDefiEvmGasPrice3;
            ceDefiEvmGasLimit = ceDefiEvmGasLimit3;
            str5 = str10;
            str6 = strDecodeStringElement9;
            z = zDecodeBooleanElement2;
            str7 = strDecodeStringElement15;
            ceDefiSolGas = ceDefiSolGas2;
            String str11 = strDecodeStringElement12;
            str8 = strDecodeStringElement11;
            str9 = str11;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CeDefiGasResp(i2, i, str3, str2, i3, str4, str7, i7, i6, z, str6, i5, i4, str, str9, str8, ceDefiEvmGasLimit, ceDefiEvmGasPrice, ceDefiSolGas, str5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CeDefiGasResp ceDefiGasResp) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ceDefiGasResp, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CeDefiGasResp.write$Self$OKWallet_wallet_impl(ceDefiGasResp, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
