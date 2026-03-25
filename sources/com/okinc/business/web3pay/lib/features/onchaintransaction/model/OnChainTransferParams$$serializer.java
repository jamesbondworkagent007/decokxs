package com.okinc.business.web3pay.lib.features.onchaintransaction.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.OrderType;
import com.okinc.business.web3pay.lib.core.model.PaymasterNameType;
import com.okinc.business.web3pay.lib.core.model.ProjectId;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class OnChainTransferParams$$serializer implements GeneratedSerializer<OnChainTransferParams> {
    public static final int $stable;
    public static final OnChainTransferParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private OnChainTransferParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        OnChainTransferParams$$serializer onChainTransferParams$$serializer = new OnChainTransferParams$$serializer();
        INSTANCE = onChainTransferParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferParams", onChainTransferParams$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("projectId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("masterCurrencyId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("orderType", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterNameType", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        pluginGeneratedSerialDescriptor.addElement("travelRuleId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = OnChainTransferParams.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, kSerializerArr[10], BuiltinSerializersKt.getNullable(kSerializerArr[11]), GasLimit$$serializer.INSTANCE, GasPrice$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final OnChainTransferParams deserialize(@NotNull Decoder decoder) {
        GasLimit gasLimit;
        PaymasterNameType paymasterNameType;
        String str;
        String str2;
        ProjectId projectId;
        OrderType orderType;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        GasPrice gasPrice;
        String str9;
        String str10;
        int i;
        String str11;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = OnChainTransferParams.$childSerializers;
        int i2 = 9;
        int i3 = 7;
        GasLimit gasLimit2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            ProjectId projectId2 = (ProjectId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            OrderType orderType2 = (OrderType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], null);
            PaymasterNameType paymasterNameType2 = (PaymasterNameType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            GasLimit gasLimit3 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, GasLimit$$serializer.INSTANCE, null);
            gasPrice = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, GasPrice$$serializer.INSTANCE, null);
            orderType = orderType2;
            str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str5 = strDecodeStringElement7;
            str10 = strDecodeStringElement3;
            i = 32767;
            str6 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            gasLimit = gasLimit3;
            paymasterNameType = paymasterNameType2;
            str8 = strDecodeStringElement;
            projectId = projectId2;
            str7 = strDecodeStringElement2;
            str = str13;
            str4 = strDecodeStringElement5;
            str2 = str12;
        } else {
            int i4 = 14;
            GasPrice gasPrice2 = null;
            OrderType orderType3 = null;
            String str14 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String str15 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            ProjectId projectId3 = null;
            String strDecodeStringElement14 = null;
            int i5 = 0;
            boolean z = true;
            PaymasterNameType paymasterNameType3 = null;
            String str16 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str15;
                        z = false;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 0:
                        str11 = str15;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 1:
                        str11 = str15;
                        projectId3 = (ProjectId) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], projectId3);
                        i5 |= 2;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 2:
                        str11 = str15;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 3:
                        str11 = str15;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 4:
                        str11 = str15;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i5 |= 16;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 5:
                        i5 |= 32;
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str15);
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 6:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i5 |= 64;
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 7:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str16);
                        i5 |= 128;
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 8:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i5 |= 256;
                        i4 = 14;
                        break;
                    case 9:
                        i5 |= 512;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 10:
                        orderType3 = (OrderType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 10, kSerializerArr[10], orderType3);
                        i5 |= 1024;
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 11:
                        paymasterNameType3 = (PaymasterNameType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, kSerializerArr[11], paymasterNameType3);
                        i5 |= 2048;
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 12:
                        gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, GasLimit$$serializer.INSTANCE, gasLimit2);
                        i5 |= 4096;
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 13:
                        gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, GasPrice$$serializer.INSTANCE, gasPrice2);
                        i5 |= 8192;
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    case 14:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str14);
                        i5 |= 16384;
                        str11 = str15;
                        str15 = str11;
                        i4 = 14;
                        i2 = 9;
                        i3 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            gasLimit = gasLimit2;
            paymasterNameType = paymasterNameType3;
            str = str16;
            str2 = str15;
            projectId = projectId3;
            orderType = orderType3;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement10;
            str6 = strDecodeStringElement11;
            str7 = strDecodeStringElement13;
            str8 = strDecodeStringElement14;
            gasPrice = gasPrice2;
            str9 = str14;
            str10 = strDecodeStringElement12;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new OnChainTransferParams(i, str8, projectId, str7, str10, str3, str2, str4, str, str6, str5, orderType, paymasterNameType, gasLimit, gasPrice, str9, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull OnChainTransferParams onChainTransferParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(onChainTransferParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        OnChainTransferParams.write$Self$OKPayCore_web3pay_lib(onChainTransferParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
