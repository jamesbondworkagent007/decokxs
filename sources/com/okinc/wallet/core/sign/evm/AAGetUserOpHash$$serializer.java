package com.okinc.wallet.core.sign.evm;

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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class AAGetUserOpHash$$serializer implements GeneratedSerializer<AAGetUserOpHash> {
    public static final int $stable;
    public static final AAGetUserOpHash$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AAGetUserOpHash$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AAGetUserOpHash$$serializer aAGetUserOpHash$$serializer = new AAGetUserOpHash$$serializer();
        INSTANCE = aAGetUserOpHash$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.core.sign.evm.AAGetUserOpHash", aAGetUserOpHash$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("chainId", false);
        pluginGeneratedSerialDescriptor.addElement("sender", false);
        pluginGeneratedSerialDescriptor.addElement("nonce", false);
        pluginGeneratedSerialDescriptor.addElement("initCode", true);
        pluginGeneratedSerialDescriptor.addElement("factory", true);
        pluginGeneratedSerialDescriptor.addElement("factoryData", true);
        pluginGeneratedSerialDescriptor.addElement("callData", false);
        pluginGeneratedSerialDescriptor.addElement("callGasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("verificationGasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterVerificationGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("paymasterPostOpGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("preVerificationGas", false);
        pluginGeneratedSerialDescriptor.addElement("maxFeePerGas", false);
        pluginGeneratedSerialDescriptor.addElement("maxPriorityFeePerGas", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterAndData", true);
        pluginGeneratedSerialDescriptor.addElement("paymaster", true);
        pluginGeneratedSerialDescriptor.addElement("paymasterData", true);
        pluginGeneratedSerialDescriptor.addElement("entryPoint", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer nullable = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AAGetUserOpHash deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l;
        int i;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        Long l2;
        String str26;
        Long l3;
        String str27;
        String str28;
        String str29;
        String str30;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            String str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            str9 = str41;
            str17 = str40;
            str10 = str45;
            str5 = str44;
            str4 = str43;
            str8 = str42;
            str7 = str38;
            str3 = str37;
            str = str36;
            str6 = str35;
            str13 = str31;
            l = l4;
            i = 262143;
            str14 = str39;
            str2 = str34;
            str16 = str33;
            str12 = str32;
        } else {
            int i4 = 17;
            boolean z = true;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            String str50 = null;
            String str51 = null;
            String str52 = null;
            String str53 = null;
            String str54 = null;
            String str55 = null;
            String str56 = null;
            String str57 = null;
            String str58 = null;
            String str59 = null;
            String str60 = null;
            String str61 = null;
            Long l5 = null;
            int i5 = 0;
            String str62 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str18 = str46;
                        str19 = str47;
                        str20 = str55;
                        str21 = str56;
                        str22 = str57;
                        str23 = str58;
                        str24 = str59;
                        str25 = str60;
                        l2 = l5;
                        str26 = str61;
                        z = false;
                        l3 = l2;
                        str46 = str18;
                        str58 = str23;
                        str56 = str21;
                        str60 = str25;
                        str59 = str24;
                        str57 = str22;
                        str55 = str20;
                        str47 = str19;
                        str61 = str26;
                        i4 = 17;
                        i3 = 11;
                        l5 = l3;
                        break;
                    case 0:
                        str18 = str46;
                        str19 = str47;
                        str20 = str55;
                        str21 = str56;
                        str22 = str57;
                        str23 = str58;
                        str24 = str59;
                        str25 = str60;
                        Long l6 = l5;
                        str26 = str61;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l6);
                        i5 |= 1;
                        l3 = l2;
                        str46 = str18;
                        str58 = str23;
                        str56 = str21;
                        str60 = str25;
                        str59 = str24;
                        str57 = str22;
                        str55 = str20;
                        str47 = str19;
                        str61 = str26;
                        i4 = 17;
                        i3 = 11;
                        l5 = l3;
                        break;
                    case 1:
                        str18 = str46;
                        str19 = str47;
                        str20 = str55;
                        str21 = str56;
                        str22 = str57;
                        str23 = str58;
                        str24 = str59;
                        str25 = str60;
                        str61 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str61);
                        i5 |= 2;
                        l2 = l5;
                        str26 = str61;
                        l3 = l2;
                        str46 = str18;
                        str58 = str23;
                        str56 = str21;
                        str60 = str25;
                        str59 = str24;
                        str57 = str22;
                        str55 = str20;
                        str47 = str19;
                        str61 = str26;
                        i4 = 17;
                        i3 = 11;
                        l5 = l3;
                        break;
                    case 2:
                        str18 = str46;
                        str19 = str47;
                        str20 = str55;
                        str21 = str56;
                        str22 = str57;
                        str23 = str58;
                        str24 = str59;
                        str60 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str60);
                        i5 |= 4;
                        str25 = str60;
                        l2 = l5;
                        str26 = str61;
                        l3 = l2;
                        str46 = str18;
                        str58 = str23;
                        str56 = str21;
                        str60 = str25;
                        str59 = str24;
                        str57 = str22;
                        str55 = str20;
                        str47 = str19;
                        str61 = str26;
                        i4 = 17;
                        i3 = 11;
                        l5 = l3;
                        break;
                    case 3:
                        str19 = str47;
                        str20 = str55;
                        str21 = str56;
                        str22 = str57;
                        str23 = str58;
                        str18 = str46;
                        str59 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str59);
                        i5 |= 8;
                        str24 = str59;
                        str25 = str60;
                        l2 = l5;
                        str26 = str61;
                        l3 = l2;
                        str46 = str18;
                        str58 = str23;
                        str56 = str21;
                        str60 = str25;
                        str59 = str24;
                        str57 = str22;
                        str55 = str20;
                        str47 = str19;
                        str61 = str26;
                        i4 = 17;
                        i3 = 11;
                        l5 = l3;
                        break;
                    case 4:
                        str19 = str47;
                        str20 = str55;
                        str21 = str56;
                        str22 = str57;
                        str23 = str58;
                        str62 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str62);
                        i5 |= 16;
                        str18 = str46;
                        str24 = str59;
                        str25 = str60;
                        l2 = l5;
                        str26 = str61;
                        l3 = l2;
                        str46 = str18;
                        str58 = str23;
                        str56 = str21;
                        str60 = str25;
                        str59 = str24;
                        str57 = str22;
                        str55 = str20;
                        str47 = str19;
                        str61 = str26;
                        i4 = 17;
                        i3 = 11;
                        l5 = l3;
                        break;
                    case 5:
                        str19 = str47;
                        str20 = str55;
                        str21 = str56;
                        str22 = str57;
                        str23 = str58;
                        str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str46);
                        i5 |= 32;
                        str24 = str59;
                        str25 = str60;
                        l3 = l5;
                        str26 = str61;
                        str58 = str23;
                        str56 = str21;
                        str60 = str25;
                        str59 = str24;
                        str57 = str22;
                        str55 = str20;
                        str47 = str19;
                        str61 = str26;
                        i4 = 17;
                        i3 = 11;
                        l5 = l3;
                        break;
                    case 6:
                        str27 = str47;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str48);
                        i5 |= 64;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 7:
                        str27 = str47;
                        str28 = str56;
                        str29 = str57;
                        i5 |= 128;
                        str58 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str58);
                        str30 = str55;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 8:
                        str27 = str47;
                        str28 = str56;
                        i5 |= 256;
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str57);
                        str30 = str55;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 9:
                        str30 = str55;
                        str27 = str47;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str56);
                        i5 |= 512;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 10:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str55);
                        i5 |= 1024;
                        str27 = str47;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 11:
                        i5 |= 2048;
                        str27 = str47;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str49);
                        str30 = str55;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 12:
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str47);
                        i5 |= 4096;
                        str27 = str47;
                        str30 = str55;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 13:
                        i5 |= 8192;
                        str27 = str47;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str50);
                        str30 = str55;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 14:
                        i5 |= 16384;
                        str27 = str47;
                        str51 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str51);
                        str30 = str55;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 15:
                        str52 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str52);
                        i2 = 32768;
                        i5 |= i2;
                        str27 = str47;
                        str30 = str55;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 16:
                        str54 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, str54);
                        i2 = 65536;
                        i5 |= i2;
                        str27 = str47;
                        str30 = str55;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    case 17:
                        str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str53);
                        i2 = 131072;
                        i5 |= i2;
                        str27 = str47;
                        str30 = str55;
                        str28 = str56;
                        str29 = str57;
                        str55 = str30;
                        str56 = str28;
                        str57 = str29;
                        str47 = str27;
                        i4 = 17;
                        i3 = 11;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str48;
            str2 = str62;
            str3 = str58;
            str4 = str50;
            str5 = str51;
            str6 = str46;
            str7 = str57;
            str8 = str47;
            l = l5;
            i = i5;
            str9 = str49;
            str10 = str52;
            str11 = str53;
            str12 = str60;
            str13 = str61;
            str14 = str56;
            str15 = str54;
            str16 = str59;
            str17 = str55;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AAGetUserOpHash(i, l, str13, str12, str16, str2, str6, str, str3, str7, str14, str17, str9, str8, str4, str5, str10, str15, str11, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AAGetUserOpHash aAGetUserOpHash) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aAGetUserOpHash, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AAGetUserOpHash.write$Self$OKWalletCore_wallet_lib(aAGetUserOpHash, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
