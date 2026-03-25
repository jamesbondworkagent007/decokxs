package com.okinc.business.web3pay.lib.features.uop.model;

import com.okinc.business.web3pay.lib.core.model.GasLimit;
import com.okinc.business.web3pay.lib.core.model.GasLimit$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasPrice;
import com.okinc.business.web3pay.lib.core.model.GasPrice$$serializer;
import com.okinc.business.web3pay.lib.core.model.GasToken;
import com.okinc.business.web3pay.lib.core.model.GasToken$$serializer;
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

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CreateOnChainTransferUopRequest$$serializer implements GeneratedSerializer<CreateOnChainTransferUopRequest> {
    public static final int $stable;
    public static final CreateOnChainTransferUopRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateOnChainTransferUopRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateOnChainTransferUopRequest$$serializer createOnChainTransferUopRequest$$serializer = new CreateOnChainTransferUopRequest$$serializer();
        INSTANCE = createOnChainTransferUopRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.uop.model.CreateOnChainTransferUopRequest", createOnChainTransferUopRequest$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("projectId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement("orderType", false);
        pluginGeneratedSerialDescriptor.addElement("feeTokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("masterCurrencyId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("gasToken", false);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", false);
        pluginGeneratedSerialDescriptor.addElement("travelRuleId", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(GasToken$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GasLimit$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GasPrice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateOnChainTransferUopRequest deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        GasPrice gasPrice;
        int i2;
        int i3;
        GasLimit gasLimit;
        String strDecodeStringElement;
        GasToken gasToken;
        String str8;
        String str9;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i6 = 10;
        int i7 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            GasToken gasToken2 = (GasToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, GasToken$$serializer.INSTANCE, null);
            GasLimit gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, GasLimit$$serializer.INSTANCE, null);
            gasPrice = (GasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, GasPrice$$serializer.INSTANCE, null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            gasToken = gasToken2;
            str6 = strDecodeStringElement5;
            str4 = str11;
            str8 = strDecodeStringElement3;
            str3 = str12;
            str5 = strDecodeStringElement4;
            gasLimit = gasLimit2;
            str7 = strDecodeStringElement2;
            i2 = iDecodeIntElement;
            i3 = 16383;
            i = iDecodeIntElement2;
            str2 = str10;
        } else {
            int i8 = 13;
            int i9 = 0;
            int iDecodeIntElement3 = 0;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            GasLimit gasLimit3 = null;
            String strDecodeStringElement6 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String str16 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            boolean z = true;
            GasPrice gasPrice2 = null;
            GasToken gasToken3 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str9 = str16;
                        z = false;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 0:
                        str9 = str16;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i9 |= 1;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 1:
                        str9 = str16;
                        i9 |= 2;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 2:
                        str9 = str16;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i9 |= 4;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 3:
                        str9 = str16;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i9 |= 8;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 4:
                        str9 = str16;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i9 |= 16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 5:
                        i9 |= 32;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str16);
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 6:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i9 |= 64;
                        str9 = str16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 7:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str15);
                        i4 = i9 | 128;
                        i9 = i4;
                        str9 = str16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 8:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str14);
                        i9 |= 256;
                        i8 = 13;
                        break;
                    case 9:
                        i9 |= 512;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        str9 = str16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 10:
                        gasToken3 = (GasToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, GasToken$$serializer.INSTANCE, gasToken3);
                        i4 = i9 | 1024;
                        i9 = i4;
                        str9 = str16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 11:
                        gasLimit3 = (GasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, GasLimit$$serializer.INSTANCE, gasLimit3);
                        i4 = i9 | 2048;
                        i9 = i4;
                        str9 = str16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 12:
                        gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, GasPrice$$serializer.INSTANCE, gasPrice2);
                        i5 = i9 | 4096;
                        i9 = i5;
                        str9 = str16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 13:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, StringSerializer.INSTANCE, str13);
                        i5 = i9 | 8192;
                        i9 = i5;
                        str9 = str16;
                        str16 = str9;
                        i8 = 13;
                        i6 = 10;
                        i7 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str17 = str16;
            str = str13;
            str2 = str17;
            str3 = str14;
            str4 = str15;
            str5 = strDecodeStringElement7;
            str6 = strDecodeStringElement8;
            str7 = strDecodeStringElement10;
            i = iDecodeIntElement3;
            gasPrice = gasPrice2;
            i2 = iDecodeIntElement4;
            i3 = i9;
            gasLimit = gasLimit3;
            strDecodeStringElement = strDecodeStringElement9;
            String str18 = strDecodeStringElement6;
            gasToken = gasToken3;
            str8 = str18;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateOnChainTransferUopRequest(i3, str7, i2, strDecodeStringElement, str8, str5, str2, i, str4, str3, str6, gasToken, gasLimit, gasPrice, str, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateOnChainTransferUopRequest createOnChainTransferUopRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createOnChainTransferUopRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateOnChainTransferUopRequest.write$Self$OKPayCore_web3pay_lib(createOnChainTransferUopRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
