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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class CreateConvertUopRequest$$serializer implements GeneratedSerializer<CreateConvertUopRequest> {
    public static final int $stable;
    public static final CreateConvertUopRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateConvertUopRequest$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateConvertUopRequest$$serializer createConvertUopRequest$$serializer = new CreateConvertUopRequest$$serializer();
        INSTANCE = createConvertUopRequest$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopRequest", createConvertUopRequest$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("projectId", false);
        pluginGeneratedSerialDescriptor.addElement("tokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("toTokenCoinTypeNo", false);
        pluginGeneratedSerialDescriptor.addElement("quoteId", true);
        pluginGeneratedSerialDescriptor.addElement("bidPx", true);
        pluginGeneratedSerialDescriptor.addElement("usdAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("gasToken", true);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("gasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("toAddress", true);
        pluginGeneratedSerialDescriptor.addElement("travelRuleId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(GasToken$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GasLimit$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(GasPrice$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateConvertUopRequest deserialize(@NotNull Decoder decoder) {
        String str;
        GasPrice gasPrice;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        GasToken gasToken;
        int i2;
        GasLimit gasLimit;
        String str8;
        String str9;
        String str10;
        int i3;
        String str11;
        int i4;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i7 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            GasToken gasToken2 = (GasToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, GasToken$$serializer.INSTANCE, null);
            GasLimit gasLimit2 = (GasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, GasLimit$$serializer.INSTANCE, null);
            GasPrice gasPrice2 = (GasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, GasPrice$$serializer.INSTANCE, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            gasPrice = gasPrice2;
            str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            str9 = strDecodeStringElement2;
            gasToken = gasToken2;
            str8 = str14;
            i = iDecodeIntElement2;
            str5 = strDecodeStringElement5;
            str4 = strDecodeStringElement6;
            str3 = strDecodeStringElement4;
            i2 = iDecodeIntElement;
            gasLimit = gasLimit2;
            str7 = strDecodeStringElement;
            str = str13;
            str2 = str12;
            str6 = strDecodeStringElement3;
            i3 = 32767;
        } else {
            int i8 = 14;
            int i9 = 0;
            int iDecodeIntElement3 = 0;
            boolean z = true;
            String str15 = null;
            GasPrice gasPrice3 = null;
            GasLimit gasLimit3 = null;
            String str16 = null;
            String str17 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String str18 = null;
            GasToken gasToken3 = null;
            int iDecodeIntElement4 = 0;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str18;
                        z = false;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 0:
                        str11 = str18;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i9 |= 1;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 1:
                        str11 = str18;
                        i9 |= 2;
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 2:
                        str11 = str18;
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i9 |= 4;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 3:
                        str11 = str18;
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i9 |= 8;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 4:
                        str11 = str18;
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i9 |= 16;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 5:
                        str11 = str18;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str16);
                        i4 = i9 | 32;
                        i9 = i4;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 6:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str18);
                        i4 = i9 | 64;
                        i9 = i4;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 7:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i9 |= 128;
                        i8 = 14;
                        break;
                    case 8:
                        i9 |= 256;
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        str11 = str18;
                        str18 = str11;
                        i8 = 14;
                        i7 = 10;
                        break;
                    case 9:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i5 = i9 | 512;
                        i9 = i5;
                        i8 = 14;
                        break;
                    case 10:
                        gasToken3 = (GasToken) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, GasToken$$serializer.INSTANCE, gasToken3);
                        i5 = i9 | 1024;
                        i9 = i5;
                        i8 = 14;
                        break;
                    case 11:
                        i9 |= 2048;
                        gasLimit3 = (GasLimit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, GasLimit$$serializer.INSTANCE, gasLimit3);
                        i8 = 14;
                        break;
                    case 12:
                        gasPrice3 = (GasPrice) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, GasPrice$$serializer.INSTANCE, gasPrice3);
                        i6 = i9 | 4096;
                        i9 = i6;
                        i8 = 14;
                        break;
                    case 13:
                        i9 |= 8192;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str17);
                        i8 = 14;
                        break;
                    case 14:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, StringSerializer.INSTANCE, str15);
                        i6 = i9 | 16384;
                        i9 = i6;
                        i8 = 14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str18;
            gasPrice = gasPrice3;
            str2 = str16;
            str3 = strDecodeStringElement7;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement9;
            str6 = strDecodeStringElement10;
            str7 = strDecodeStringElement12;
            i = iDecodeIntElement3;
            gasToken = gasToken3;
            i2 = iDecodeIntElement4;
            gasLimit = gasLimit3;
            str8 = str17;
            str9 = strDecodeStringElement11;
            str10 = str15;
            i3 = i9;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateConvertUopRequest(i3, str7, i2, str9, str6, str3, str2, str, str5, str4, i, gasToken, gasLimit, gasPrice, str8, str10, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateConvertUopRequest createConvertUopRequest) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createConvertUopRequest, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateConvertUopRequest.write$Self$OKPayCore_web3pay_lib(createConvertUopRequest, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
