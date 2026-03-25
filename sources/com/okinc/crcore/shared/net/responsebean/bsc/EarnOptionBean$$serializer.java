package com.okinc.crcore.shared.net.responsebean.bsc;

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
public final /* synthetic */ class EarnOptionBean$$serializer implements GeneratedSerializer<EarnOptionBean> {
    public static final int $stable;
    public static final EarnOptionBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private EarnOptionBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        EarnOptionBean$$serializer earnOptionBean$$serializer = new EarnOptionBean$$serializer();
        INSTANCE = earnOptionBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.shared.net.responsebean.bsc.EarnOptionBean", earnOptionBean$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("productTypeId", true);
        pluginGeneratedSerialDescriptor.addElement("productTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("savingTypeId", true);
        pluginGeneratedSerialDescriptor.addElement("savingTypeName", true);
        pluginGeneratedSerialDescriptor.addElement("eligibleAmountMax", true);
        pluginGeneratedSerialDescriptor.addElement("eligibleAmountMin", true);
        pluginGeneratedSerialDescriptor.addElement("earnMaxUnlimited", true);
        pluginGeneratedSerialDescriptor.addElement("toggle", true);
        pluginGeneratedSerialDescriptor.addElement("autoEarnEnabled", true);
        pluginGeneratedSerialDescriptor.addElement("earnRate", true);
        pluginGeneratedSerialDescriptor.addElement("localizedText", true);
        pluginGeneratedSerialDescriptor.addElement("earnAgreementContext", true);
        pluginGeneratedSerialDescriptor.addElement("rewardType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        DoubleSerializer doubleSerializer = DoubleSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(longSerializer), BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, BuiltinSerializersKt.getNullable(longSerializer), stringSerializer, doubleSerializer, doubleSerializer, booleanSerializer, booleanSerializer, booleanSerializer, stringSerializer, LocalizedTextBean$$serializer.INSTANCE, stringSerializer, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final EarnOptionBean deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        int i;
        Long l;
        String str;
        boolean z;
        double d;
        Long l2;
        LocalizedTextBean localizedTextBean;
        String str2;
        String str3;
        String str4;
        boolean z2;
        double d2;
        Integer num;
        Long l3;
        Long l4;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        int i5 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            LongSerializer longSerializer = LongSerializer.INSTANCE;
            Long l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, longSerializer, null);
            l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, longSerializer, null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            Long l6 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, longSerializer, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            double dDecodeDoubleElement = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
            double dDecodeDoubleElement2 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            boolean zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 9);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            LocalizedTextBean localizedTextBean2 = (LocalizedTextBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, LocalizedTextBean$$serializer.INSTANCE, null);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            localizedTextBean = localizedTextBean2;
            str3 = strDecodeStringElement3;
            zDecodeBooleanElement = zDecodeBooleanElement4;
            z = zDecodeBooleanElement2;
            d = dDecodeDoubleElement2;
            z2 = zDecodeBooleanElement3;
            str2 = strDecodeStringElement4;
            i = 16383;
            str4 = strDecodeStringElement2;
            l = l6;
            str = strDecodeStringElement;
            l2 = l5;
            d2 = dDecodeDoubleElement;
        } else {
            int i6 = 13;
            zDecodeBooleanElement = false;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            Long l7 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            Long l8 = null;
            Long l9 = null;
            String strDecodeStringElement7 = null;
            boolean z3 = true;
            double dDecodeDoubleElement3 = 0.0d;
            double dDecodeDoubleElement4 = 0.0d;
            Integer num2 = null;
            LocalizedTextBean localizedTextBean3 = null;
            String strDecodeStringElement8 = null;
            int i7 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        l4 = l8;
                        z3 = false;
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
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i7 |= 4;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 3:
                        l7 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, l7);
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
                        strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i7 |= 16;
                        i6 = 13;
                        break;
                    case 5:
                        dDecodeDoubleElement4 = compositeDecoderBeginStructure.decodeDoubleElement(serialDescriptor, 5);
                        i2 = i7 | 32;
                        i7 = i2;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
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
                        zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i5);
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
                        localizedTextBean3 = (LocalizedTextBean) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i3, LocalizedTextBean$$serializer.INSTANCE, localizedTextBean3);
                        i7 |= 2048;
                        l4 = l8;
                        l8 = l4;
                        i6 = 13;
                        i3 = 11;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 12:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 12);
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
            Long l10 = l9;
            i = i7;
            l = l7;
            str = strDecodeStringElement6;
            z = zDecodeBooleanElement5;
            d = dDecodeDoubleElement3;
            l2 = l10;
            localizedTextBean = localizedTextBean3;
            str2 = strDecodeStringElement8;
            str3 = strDecodeStringElement5;
            str4 = strDecodeStringElement7;
            z2 = zDecodeBooleanElement6;
            d2 = dDecodeDoubleElement4;
            num = num2;
            l3 = l8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new EarnOptionBean(i, l2, l3, str, l, str4, d2, d, z, z2, zDecodeBooleanElement, str3, localizedTextBean, str2, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull EarnOptionBean earnOptionBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(earnOptionBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        EarnOptionBean.write$Self$OKCRCore_cr_core(earnOptionBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
