package com.okinc.wholesale.bean;

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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class VipActivateConfig$$serializer implements GeneratedSerializer<VipActivateConfig> {
    public static final int $stable;
    public static final VipActivateConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private VipActivateConfig$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        VipActivateConfig$$serializer vipActivateConfig$$serializer = new VipActivateConfig$$serializer();
        INSTANCE = vipActivateConfig$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wholesale.bean.VipActivateConfig", vipActivateConfig$$serializer, 11);
        pluginGeneratedSerialDescriptor.addElement("inviteCode", true);
        pluginGeneratedSerialDescriptor.addElement("uid", true);
        pluginGeneratedSerialDescriptor.addElement("vipLevel", true);
        pluginGeneratedSerialDescriptor.addElement("inviterName", true);
        pluginGeneratedSerialDescriptor.addElement("feePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("trialDays", true);
        pluginGeneratedSerialDescriptor.addElement("activateState", false);
        pluginGeneratedSerialDescriptor.addElement("isFromLanding", false);
        pluginGeneratedSerialDescriptor.addElement("avatarUrl", true);
        pluginGeneratedSerialDescriptor.addElement("nickName", true);
        pluginGeneratedSerialDescriptor.addElement("qrCodeUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final VipActivateConfig deserialize(@NotNull Decoder decoder) {
        String str;
        boolean z;
        String str2;
        String str3;
        int i;
        int i2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Integer num;
        Integer num2;
        String str9;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 10;
        int i5 = 9;
        int i6 = 7;
        int i7 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 7);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str7 = str15;
            z = zDecodeBooleanElement;
            i = iDecodeIntElement;
            str8 = str13;
            str2 = str14;
            str5 = str12;
            i2 = 2047;
            str4 = strDecodeStringElement;
            num = num3;
            str6 = str10;
            str = str11;
        } else {
            boolean zDecodeBooleanElement2 = false;
            int i8 = 0;
            boolean z2 = true;
            String str16 = null;
            String str17 = null;
            String str18 = null;
            str = null;
            Integer num4 = null;
            String str19 = null;
            String strDecodeStringElement2 = null;
            String str20 = null;
            String str21 = null;
            int iDecodeIntElement2 = 0;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num2 = num4;
                        str9 = str20;
                        z2 = false;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 0:
                        num2 = num4;
                        str9 = str20;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 1:
                        num2 = num4;
                        str9 = str20;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str19);
                        i8 |= 2;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 2:
                        str9 = str20;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num4);
                        i8 |= 4;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 3:
                        str9 = str20;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str);
                        i8 |= 8;
                        num2 = num4;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 4:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str20);
                        i8 |= 16;
                        num2 = num4;
                        str9 = str20;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 5:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str21);
                        i8 |= 32;
                        num2 = num4;
                        str9 = str20;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 6:
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i7);
                        i3 = i8 | 64;
                        i8 = i3;
                        break;
                    case 7:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i3 = i8 | 128;
                        i8 = i3;
                        break;
                    case 8:
                        i8 |= 256;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str17);
                        break;
                    case 9:
                        i8 |= 512;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str16);
                        num2 = num4;
                        str9 = str20;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    case 10:
                        i8 |= 1024;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str18);
                        num2 = num4;
                        str9 = str20;
                        str20 = str9;
                        num4 = num2;
                        i4 = 10;
                        i5 = 9;
                        i6 = 7;
                        i7 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Integer num5 = num4;
            String str22 = str19;
            z = zDecodeBooleanElement2;
            str2 = str17;
            str3 = str18;
            i = iDecodeIntElement2;
            i2 = i8;
            str4 = strDecodeStringElement2;
            str5 = str20;
            str6 = str22;
            str7 = str16;
            str8 = str21;
            num = num5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new VipActivateConfig(i2, str4, str6, num, str, str5, str8, i, z, str2, str7, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull VipActivateConfig vipActivateConfig) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(vipActivateConfig, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        VipActivateConfig.write$Self$OKGrowthTools_biz_rewards(vipActivateConfig, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
