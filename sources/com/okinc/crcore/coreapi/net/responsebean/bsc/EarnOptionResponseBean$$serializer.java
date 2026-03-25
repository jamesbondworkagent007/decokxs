package com.okinc.crcore.coreapi.net.responsebean.bsc;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class EarnOptionResponseBean$$serializer implements GeneratedSerializer<EarnOptionResponseBean> {
    public static final int $stable;
    public static final EarnOptionResponseBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EarnOptionResponseBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EarnOptionResponseBean$$serializer earnOptionResponseBean$$serializer = new EarnOptionResponseBean$$serializer();
        INSTANCE = earnOptionResponseBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.responsebean.bsc.EarnOptionResponseBean", earnOptionResponseBean$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("currencyId", false);
        pluginGeneratedSerialDescriptor.addElement("productTypeId", false);
        pluginGeneratedSerialDescriptor.addElement("productTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("savingTypeId", false);
        pluginGeneratedSerialDescriptor.addElement("savingTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("eligibleAmountMax", true);
        pluginGeneratedSerialDescriptor.addElement("eligibleAmountMin", true);
        pluginGeneratedSerialDescriptor.addElement("earnMaxUnlimited", true);
        pluginGeneratedSerialDescriptor.addElement("toggle", true);
        pluginGeneratedSerialDescriptor.addElement("autoEarnEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("earnRate", true);
        pluginGeneratedSerialDescriptor.addElement("localizedText", true);
        pluginGeneratedSerialDescriptor.addElement("earnAgreementContext", false);
        pluginGeneratedSerialDescriptor.addElement("rewardType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, doubleSerializer, doubleSerializer, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, LocalizedTextResponseBean$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EarnOptionResponseBean deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Long l;
        Long l2;
        String str;
        double d;
        double d2;
        Integer num;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        LocalizedTextResponseBean localizedTextResponseBean;
        Long l3;
        int i;
        Long l4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        String str4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Long l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            LocalizedTextResponseBean localizedTextResponseBean2 = (LocalizedTextResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, LocalizedTextResponseBean$$serializer.INSTANCE, null);
            l3 = l7;
            l2 = l5;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            localizedTextResponseBean = localizedTextResponseBean2;
            str3 = strDecodeStringElement4;
            z = zDecodeBooleanElement3;
            z2 = zDecodeBooleanElement;
            d = dDecodeDoubleElement2;
            str = strDecodeStringElement3;
            z3 = zDecodeBooleanElement2;
            d2 = dDecodeDoubleElement;
            strDecodeStringElement = strDecodeStringElement2;
            l = l6;
            i = 16383;
        } else {
            int i6 = 13;
            int i7 = 0;
            boolean zDecodeBooleanElement4 = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            Integer num2 = null;
            LocalizedTextResponseBean localizedTextResponseBean3 = null;
            String strDecodeStringElement5 = null;
            Long l8 = null;
            Long l9 = null;
            String strDecodeStringElement6 = null;
            boolean z4 = true;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            Long l10 = null;
            strDecodeStringElement = null;
            while (z4) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l4 = l8;
                        z4 = false;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        l4 = l8;
                        l9 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l9);
                        i7 |= 1;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        l8 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, l8);
                        i2 = i7 | 2;
                        i7 = i2;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 2:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 3:
                        l10 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l10);
                        i2 = i7 | 8;
                        i7 = i2;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 4:
                        i7 |= 16;
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 5:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i7 |= 32;
                        i6 = 13;
                        break;
                    case 6:
                        dDecodeDoubleElement3 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 6);
                        i7 |= 64;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 7:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
                        i7 |= 128;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 8:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
                        i7 |= 256;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 9:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
                        i7 |= 512;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 10:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i7 |= 1024;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 11:
                        localizedTextResponseBean3 = (LocalizedTextResponseBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, LocalizedTextResponseBean$$serializer.INSTANCE, localizedTextResponseBean3);
                        i7 |= 2048;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 12:
                        str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str4);
                        i7 |= 4096;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 13:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, IntSerializer.INSTANCE, num2);
                        i7 |= 8192;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            l = l8;
            l2 = l9;
            str = strDecodeStringElement6;
            d = dDecodeDoubleElement3;
            d2 = dDecodeDoubleElement4;
            num = num2;
            str2 = str4;
            str3 = strDecodeStringElement5;
            z = zDecodeBooleanElement4;
            z2 = zDecodeBooleanElement5;
            z3 = zDecodeBooleanElement6;
            localizedTextResponseBean = localizedTextResponseBean3;
            l3 = l10;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EarnOptionResponseBean(i, l2, l, strDecodeStringElement, l3, str, d2, d, z2, z3, z, str3, localizedTextResponseBean, str2, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EarnOptionResponseBean earnOptionResponseBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(earnOptionResponseBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EarnOptionResponseBean.write$Self$OKCRCore_cr_core(earnOptionResponseBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
