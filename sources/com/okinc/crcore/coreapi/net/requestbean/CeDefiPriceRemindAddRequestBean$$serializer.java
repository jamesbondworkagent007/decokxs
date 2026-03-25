package com.okinc.crcore.coreapi.net.requestbean;

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
public final /* synthetic */ class CeDefiPriceRemindAddRequestBean$$serializer implements GeneratedSerializer<CeDefiPriceRemindAddRequestBean> {
    public static final int $stable;
    public static final CeDefiPriceRemindAddRequestBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CeDefiPriceRemindAddRequestBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CeDefiPriceRemindAddRequestBean$$serializer ceDefiPriceRemindAddRequestBean$$serializer = new CeDefiPriceRemindAddRequestBean$$serializer();
        INSTANCE = ceDefiPriceRemindAddRequestBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.crcore.coreapi.net.requestbean.CeDefiPriceRemindAddRequestBean", ceDefiPriceRemindAddRequestBean$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("sourceType", false);
        pluginGeneratedSerialDescriptor.addElement("bizType", true);
        pluginGeneratedSerialDescriptor.addElement("instrumentName", true);
        pluginGeneratedSerialDescriptor.addElement("promptType", false);
        pluginGeneratedSerialDescriptor.addElement("repeatType", false);
        pluginGeneratedSerialDescriptor.addElement("promptThreshold", false);
        pluginGeneratedSerialDescriptor.addElement("customMsg", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("wrappedAddress", true);
        pluginGeneratedSerialDescriptor.addElement("token", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, intSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CeDefiPriceRemindAddRequestBean deserialize(@NotNull Decoder decoder) {
        int i;
        int i2;
        String str;
        String str2;
        String str3;
        int i3;
        String str4;
        String str5;
        int i4;
        String str6;
        Integer num;
        String str7;
        String str8;
        Integer num2;
        String str9;
        int iDecodeIntElement;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 10;
        int i6 = 9;
        int i7 = 7;
        int i8 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            int iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str2 = str13;
            str7 = str11;
            str5 = strDecodeStringElement2;
            str4 = strDecodeStringElement;
            str = str12;
            i3 = iDecodeIntElement4;
            i2 = 2047;
            i4 = iDecodeIntElement2;
            i = iDecodeIntElement3;
            str6 = str10;
            num = num3;
        } else {
            boolean z = true;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String str17 = null;
            Integer num4 = null;
            int iDecodeIntElement5 = 0;
            int i9 = 0;
            int iDecodeIntElement6 = 0;
            i = 0;
            String str18 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str8 = str17;
                        num2 = num4;
                        z = false;
                        str17 = str8;
                        num4 = num2;
                        i5 = 10;
                        i6 = 9;
                        i7 = 7;
                        i8 = 6;
                        break;
                    case 0:
                        str9 = str17;
                        iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i9 |= 1;
                        str17 = str9;
                        i5 = 10;
                        i6 = 9;
                        i7 = 7;
                        i8 = 6;
                        break;
                    case 1:
                        str9 = str17;
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, num4);
                        i9 |= 2;
                        str17 = str9;
                        i5 = 10;
                        i6 = 9;
                        i7 = 7;
                        i8 = 6;
                        break;
                    case 2:
                        i9 |= 4;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str17);
                        num2 = num4;
                        str17 = str8;
                        num4 = num2;
                        i5 = 10;
                        i6 = 9;
                        i7 = 7;
                        i8 = 6;
                        break;
                    case 3:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i9 |= 8;
                        i = iDecodeIntElement;
                        break;
                    case 4:
                        i9 |= 16;
                        iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
                        iDecodeIntElement = i;
                        i = iDecodeIntElement;
                        break;
                    case 5:
                        strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i9 |= 32;
                        iDecodeIntElement = i;
                        i = iDecodeIntElement;
                        break;
                    case 6:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i8);
                        i9 |= 64;
                        break;
                    case 7:
                        i9 |= 128;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, StringSerializer.INSTANCE, str14);
                        break;
                    case 8:
                        i9 |= 256;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str15);
                        break;
                    case 9:
                        i9 |= 512;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str16);
                        break;
                    case 10:
                        i9 |= 1024;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str18);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i2 = i9;
            str = str15;
            str2 = str16;
            str3 = str18;
            i3 = iDecodeIntElement6;
            str4 = strDecodeStringElement3;
            str5 = strDecodeStringElement4;
            i4 = iDecodeIntElement5;
            str6 = str17;
            num = num4;
            str7 = str14;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CeDefiPriceRemindAddRequestBean(i2, i4, num, str6, i, i3, str4, str5, str7, str, str2, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CeDefiPriceRemindAddRequestBean ceDefiPriceRemindAddRequestBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(ceDefiPriceRemindAddRequestBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CeDefiPriceRemindAddRequestBean.write$Self$OKCRCore_cr_core(ceDefiPriceRemindAddRequestBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
