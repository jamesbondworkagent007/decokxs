package com.okinc.business.dex.tee.domain.model;

import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo$$serializer;
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

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class CreateOrderParams$$serializer implements GeneratedSerializer<CreateOrderParams> {
    public static final int $stable;
    public static final CreateOrderParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CreateOrderParams$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CreateOrderParams$$serializer createOrderParams$$serializer = new CreateOrderParams$$serializer();
        INSTANCE = createOrderParams$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.dex.tee.domain.model.CreateOrderParams", createOrderParams$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("userWalletAddress", true);
        pluginGeneratedSerialDescriptor.addElement("rule", true);
        pluginGeneratedSerialDescriptor.addElement("preset", true);
        pluginGeneratedSerialDescriptor.addElement("verifySignInfo", true);
        pluginGeneratedSerialDescriptor.addElement("referralCode", true);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("strategyDirection", true);
        pluginGeneratedSerialDescriptor.addElement("referrerAddress", true);
        pluginGeneratedSerialDescriptor.addElement("expireTime", true);
        pluginGeneratedSerialDescriptor.addElement("strategyType", true);
        pluginGeneratedSerialDescriptor.addElement("serviceFeeInfo", true);
        pluginGeneratedSerialDescriptor.addElement("estimateGasFee", true);
        pluginGeneratedSerialDescriptor.addElement("teeSilentSignEnabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(Rule$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(LimitPreset$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(VerifySignInfo$$serializer.INSTANCE), stringSerializer, intSerializer, BuiltinSerializersKt.getNullable(intSerializer), stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(ServiceFeeInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CreateOrderParams deserialize(@NotNull Decoder decoder) {
        ServiceFeeInfo serviceFeeInfo;
        int i;
        LimitPreset limitPreset;
        String str;
        boolean zDecodeBooleanElement;
        String str2;
        int i2;
        String str3;
        Rule rule;
        String str4;
        String str5;
        VerifySignInfo verifySignInfo;
        String str6;
        String str7;
        Integer num;
        Rule rule2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 11;
        int i5 = 10;
        ServiceFeeInfo serviceFeeInfo2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            Rule rule3 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Rule$$serializer.INSTANCE, null);
            LimitPreset limitPreset2 = (LimitPreset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LimitPreset$$serializer.INSTANCE, null);
            VerifySignInfo verifySignInfo2 = (VerifySignInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, VerifySignInfo$$serializer.INSTANCE, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            Integer num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            ServiceFeeInfo serviceFeeInfo3 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, ServiceFeeInfo$$serializer.INSTANCE, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 13);
            serviceFeeInfo = serviceFeeInfo3;
            str7 = strDecodeStringElement6;
            str = strDecodeStringElement5;
            num = num2;
            i2 = iDecodeIntElement;
            str5 = strDecodeStringElement3;
            limitPreset = limitPreset2;
            str4 = strDecodeStringElement4;
            i = 16383;
            rule = rule3;
            str6 = strDecodeStringElement2;
            verifySignInfo = verifySignInfo2;
            str2 = strDecodeStringElement;
        } else {
            int i6 = 13;
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            int iDecodeIntElement2 = 0;
            String str8 = null;
            Integer num3 = null;
            VerifySignInfo verifySignInfo3 = null;
            String strDecodeStringElement7 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            Rule rule4 = null;
            boolean z = true;
            LimitPreset limitPreset3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        rule2 = rule4;
                        z = false;
                        rule4 = rule2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 0:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i7 |= 1;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 1:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i7 |= 2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 2:
                        rule4 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Rule$$serializer.INSTANCE, rule4);
                        i7 |= 4;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 3:
                        limitPreset3 = (LimitPreset) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LimitPreset$$serializer.INSTANCE, limitPreset3);
                        i3 = i7 | 8;
                        i7 = i3;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 4:
                        verifySignInfo3 = (VerifySignInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, VerifySignInfo$$serializer.INSTANCE, verifySignInfo3);
                        i3 = i7 | 16;
                        i7 = i3;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 5:
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                        rule2 = rule4;
                        rule4 = rule2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i7 |= 64;
                        i6 = 13;
                        break;
                    case 7:
                        i7 |= 128;
                        num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, IntSerializer.INSTANCE, num3);
                        i6 = 13;
                        break;
                    case 8:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i7 |= 256;
                        rule2 = rule4;
                        rule4 = rule2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 9:
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
                        i7 |= 512;
                        rule2 = rule4;
                        rule4 = rule2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 10:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i7 |= 1024;
                        rule2 = rule4;
                        rule4 = rule2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 11:
                        serviceFeeInfo2 = (ServiceFeeInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, ServiceFeeInfo$$serializer.INSTANCE, serviceFeeInfo2);
                        i7 |= 2048;
                        rule2 = rule4;
                        rule4 = rule2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 12:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str8);
                        i7 |= 4096;
                        rule2 = rule4;
                        rule4 = rule2;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    case 13:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i7 |= 8192;
                        i6 = 13;
                        i4 = 11;
                        i5 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Rule rule5 = rule4;
            serviceFeeInfo = serviceFeeInfo2;
            i = i7;
            limitPreset = limitPreset3;
            str = strDecodeStringElement9;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str2 = strDecodeStringElement12;
            i2 = iDecodeIntElement2;
            str3 = str8;
            rule = rule5;
            str4 = strDecodeStringElement8;
            str5 = strDecodeStringElement7;
            verifySignInfo = verifySignInfo3;
            str6 = strDecodeStringElement11;
            str7 = strDecodeStringElement10;
            num = num3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CreateOrderParams(i, str2, str6, rule, limitPreset, verifySignInfo, str5, i2, num, str4, str, str7, serviceFeeInfo, str3, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CreateOrderParams createOrderParams) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(createOrderParams, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CreateOrderParams.write$Self$OKDex_dex_impl(createOrderParams, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
