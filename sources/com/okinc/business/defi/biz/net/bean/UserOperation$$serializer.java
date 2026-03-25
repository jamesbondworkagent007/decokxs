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
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class UserOperation$$serializer implements GeneratedSerializer<UserOperation> {
    public static final int $stable;
    public static final UserOperation$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UserOperation$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UserOperation$$serializer userOperation$$serializer = new UserOperation$$serializer();
        INSTANCE = userOperation$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.UserOperation", userOperation$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("sender", true);
        pluginGeneratedSerialDescriptor.addElement("nonce", true);
        pluginGeneratedSerialDescriptor.addElement("initCode", true);
        pluginGeneratedSerialDescriptor.addElement("factory", true);
        pluginGeneratedSerialDescriptor.addElement("factoryData", true);
        pluginGeneratedSerialDescriptor.addElement("callData", true);
        pluginGeneratedSerialDescriptor.addElement("callGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("verificationGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("preVerificationGas", true);
        pluginGeneratedSerialDescriptor.addElement("maxFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("maxPriorityFeePerGas", true);
        pluginGeneratedSerialDescriptor.addElement("paymasterAndData", true);
        pluginGeneratedSerialDescriptor.addElement("paymaster", true);
        pluginGeneratedSerialDescriptor.addElement("paymasterVerificationGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("paymasterPostOpGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("paymasterData", true);
        pluginGeneratedSerialDescriptor.addElement("signature", true);
        pluginGeneratedSerialDescriptor.addElement("paymasterType", true);
        pluginGeneratedSerialDescriptor.addElement("uopHash", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UserOperation deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Integer num;
        String str14;
        String str15;
        String str16;
        String str17;
        int i;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 11;
        String str26 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            str2 = str38;
            str15 = str37;
            str4 = str30;
            str13 = str43;
            str14 = str42;
            str16 = str41;
            str8 = str40;
            str3 = str39;
            str5 = str31;
            str9 = str35;
            str17 = str29;
            str12 = str36;
            str = str34;
            str7 = str33;
            str6 = str32;
            str11 = str27;
            str10 = str28;
            i = 524287;
        } else {
            int i6 = 18;
            int i7 = 0;
            boolean z = true;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            Integer num2 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String strDecodeStringElement2 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        str52 = str52;
                        i6 = 18;
                        i5 = 11;
                        str59 = str59;
                        str44 = str44;
                        break;
                    case 0:
                        str18 = str44;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        i7 |= 1;
                        str24 = str58;
                        str52 = str52;
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str59);
                        str44 = str18;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 1:
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        i7 |= 2;
                        str24 = str58;
                        str44 = str44;
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str52);
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 2:
                        str18 = str44;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str25 = str58;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str47);
                        i2 = i7 | 4;
                        i7 = i2;
                        str24 = str25;
                        str44 = str18;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 3:
                        str18 = str44;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str58);
                        i2 = i7 | 8;
                        i7 = i2;
                        str24 = str25;
                        str44 = str18;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 4:
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str57);
                        i7 |= 16;
                        str44 = str44;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 5:
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str56);
                        i7 |= 32;
                        str44 = str44;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 6:
                        str19 = str53;
                        str20 = str54;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str55);
                        i7 |= 64;
                        str44 = str44;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 7:
                        str19 = str53;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str54);
                        i7 |= 128;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 8:
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str53);
                        i7 |= 256;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 9:
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str45);
                        i3 = i7 | 512;
                        i7 = i3;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 10:
                        i7 |= 1024;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str48);
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 11:
                        i7 |= 2048;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str49);
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 12:
                        i7 |= 4096;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str50);
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 13:
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str44);
                        i3 = i7 | 8192;
                        i7 = i3;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 14:
                        i7 |= 16384;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str51);
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 15:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str26);
                        i4 = 32768;
                        i3 = i4 | i7;
                        i7 = i3;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 16:
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str46);
                        i4 = 65536;
                        i3 = i4 | i7;
                        i7 = i3;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 17:
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, IntSerializer.INSTANCE, num2);
                        i4 = 131072;
                        i3 = i4 | i7;
                        i7 = i3;
                        str19 = str53;
                        str20 = str54;
                        str21 = str55;
                        str22 = str56;
                        str23 = str57;
                        str24 = str58;
                        str54 = str20;
                        str58 = str24;
                        str57 = str23;
                        str56 = str22;
                        str55 = str21;
                        str53 = str19;
                        i6 = 18;
                        i5 = 11;
                        break;
                    case 18:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i7 |= 262144;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str60 = str44;
            str = str54;
            str2 = str49;
            str3 = str50;
            strDecodeStringElement = strDecodeStringElement2;
            str4 = str58;
            str5 = str57;
            str6 = str56;
            str7 = str55;
            str8 = str60;
            str9 = str53;
            str10 = str52;
            str11 = str59;
            str12 = str45;
            str13 = str46;
            num = num2;
            str14 = str26;
            str15 = str48;
            str16 = str51;
            str17 = str47;
            i = i7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UserOperation(i, str11, str10, str17, str4, str5, str6, str7, str, str9, str12, str15, str2, str3, str8, str16, str14, str13, num, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UserOperation userOperation) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(userOperation, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UserOperation.write$Self$OKWallet_wallet_impl(userOperation, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
