package com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class PayOrderApiModel$$serializer implements GeneratedSerializer<PayOrderApiModel> {
    public static final int $stable;
    public static final PayOrderApiModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private PayOrderApiModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        PayOrderApiModel$$serializer payOrderApiModel$$serializer = new PayOrderApiModel$$serializer();
        INSTANCE = payOrderApiModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.web3pay.lib.features.transactionhistory.datasource.remote.http.model.PayOrderApiModel", payOrderApiModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("orderId", false);
        pluginGeneratedSerialDescriptor.addElement("orderType", false);
        pluginGeneratedSerialDescriptor.addElement("chainIndex", false);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", false);
        pluginGeneratedSerialDescriptor.addElement("tokenAmount", false);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", false);
        pluginGeneratedSerialDescriptor.addElement("tokenDecimal", false);
        pluginGeneratedSerialDescriptor.addElement("from", false);
        pluginGeneratedSerialDescriptor.addElement("to", false);
        pluginGeneratedSerialDescriptor.addElement("areaCode", false);
        pluginGeneratedSerialDescriptor.addElement("status", false);
        pluginGeneratedSerialDescriptor.addElement("createTime", false);
        pluginGeneratedSerialDescriptor.addElement("receiverType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, intSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, stringSerializer, intSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(intSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final PayOrderApiModel deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        long j;
        Integer num;
        String str6;
        int i2;
        String str7;
        int i3;
        String str8;
        String str9;
        int i4;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 11;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            iDecodeIntElement = iDecodeIntElement4;
            str7 = str11;
            str6 = strDecodeStringElement8;
            i = iDecodeIntElement3;
            str8 = strDecodeStringElement6;
            str9 = strDecodeStringElement5;
            str5 = strDecodeStringElement4;
            str = strDecodeStringElement7;
            str2 = str10;
            j = jDecodeLongElement;
            str4 = strDecodeStringElement2;
            i2 = iDecodeIntElement2;
            i3 = 16383;
            str3 = strDecodeStringElement3;
        } else {
            int i6 = 13;
            int i7 = 0;
            int iDecodeIntElement5 = 0;
            iDecodeIntElement = 0;
            int iDecodeIntElement6 = 0;
            Integer num2 = null;
            String str12 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            String str13 = null;
            String strDecodeStringElement14 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        c = 4;
                        z = false;
                        i6 = 13;
                        i5 = 11;
                        break;
                    case 0:
                        c = 4;
                        i7 |= 1;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i6 = 13;
                        i5 = 11;
                        break;
                    case 1:
                        c = 4;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i7 |= 2;
                        i6 = 13;
                        i5 = 11;
                        break;
                    case 2:
                        c = 4;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        i6 = 13;
                        i5 = 11;
                        break;
                    case 3:
                        c = 4;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i7 |= 8;
                        i6 = 13;
                        i5 = 11;
                        break;
                    case 4:
                        c = 4;
                        i7 |= 16;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str12);
                        i6 = 13;
                        i5 = 11;
                        break;
                    case 5:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i4 = i7 | 32;
                        i7 = i4;
                        i6 = 13;
                        break;
                    case 6:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i4 = i7 | 64;
                        i7 = i4;
                        i6 = 13;
                        break;
                    case 7:
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i4 = i7 | 128;
                        i7 = i4;
                        i6 = 13;
                        break;
                    case 8:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i4 = i7 | 256;
                        i7 = i4;
                        i6 = 13;
                        break;
                    case 9:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i4 = i7 | 512;
                        i7 = i4;
                        i6 = 13;
                        break;
                    case 10:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str13);
                        i4 = i7 | 1024;
                        i7 = i4;
                        i6 = 13;
                        break;
                    case 11:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i7 |= 2048;
                        i6 = 13;
                        break;
                    case 12:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 12);
                        i7 |= 4096;
                        i6 = 13;
                        break;
                    case 13:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, IntSerializer.INSTANCE, num2);
                        i7 |= 8192;
                        i6 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement;
            str2 = str12;
            str3 = strDecodeStringElement9;
            str4 = strDecodeStringElement12;
            str5 = strDecodeStringElement13;
            i = iDecodeIntElement6;
            j = jDecodeLongElement2;
            num = num2;
            str6 = strDecodeStringElement14;
            i2 = iDecodeIntElement5;
            str7 = str13;
            i3 = i7;
            String str14 = strDecodeStringElement11;
            str8 = strDecodeStringElement10;
            str9 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new PayOrderApiModel(i3, str4, i2, str3, str5, str2, str9, str8, i, str, str6, str7, iDecodeIntElement, j, num, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull PayOrderApiModel payOrderApiModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(payOrderApiModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        PayOrderApiModel.write$Self$OKPayCore_web3pay_lib(payOrderApiModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
