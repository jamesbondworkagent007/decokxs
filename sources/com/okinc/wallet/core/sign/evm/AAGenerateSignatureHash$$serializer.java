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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class AAGenerateSignatureHash$$serializer implements GeneratedSerializer<AAGenerateSignatureHash> {
    public static final int $stable;
    public static final AAGenerateSignatureHash$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AAGenerateSignatureHash$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AAGenerateSignatureHash$$serializer aAGenerateSignatureHash$$serializer = new AAGenerateSignatureHash$$serializer();
        INSTANCE = aAGenerateSignatureHash$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.wallet.core.sign.evm.AAGenerateSignatureHash", aAGenerateSignatureHash$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("sender", false);
        pluginGeneratedSerialDescriptor.addElement("nonce", false);
        pluginGeneratedSerialDescriptor.addElement("initCode", false);
        pluginGeneratedSerialDescriptor.addElement("callData", false);
        pluginGeneratedSerialDescriptor.addElement("callGasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("verificationGasLimit", false);
        pluginGeneratedSerialDescriptor.addElement("preVerificationGas", false);
        pluginGeneratedSerialDescriptor.addElement("maxFeePerGas", false);
        pluginGeneratedSerialDescriptor.addElement("maxPriorityFeePerGas", false);
        pluginGeneratedSerialDescriptor.addElement("paymasterAndData", false);
        pluginGeneratedSerialDescriptor.addElement("entryPoint", false);
        pluginGeneratedSerialDescriptor.addElement("sigTime", false);
        pluginGeneratedSerialDescriptor.addElement("sigType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AAGenerateSignatureHash deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int iDecodeIntElement;
        int iDecodeIntElement2;
        String str7;
        String str8;
        int i;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i5 = 11;
        int i6 = 10;
        int i7 = 9;
        int i8 = 8;
        String str15 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            str4 = str25;
            str3 = str23;
            str = str22;
            str9 = str24;
            str2 = str17;
            str11 = str21;
            i = 8191;
            str6 = str19;
            str8 = str16;
            str7 = str20;
            str10 = str18;
        } else {
            int i9 = 12;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            int i10 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            boolean z = true;
            String str34 = null;
            String str35 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str12 = str30;
                        str13 = str31;
                        str14 = str32;
                        z = false;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 0:
                        str12 = str30;
                        str13 = str31;
                        str14 = str32;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str33);
                        i10 |= 1;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 1:
                        str13 = str31;
                        str14 = str32;
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str30);
                        i10 |= 2;
                        str12 = str30;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 2:
                        str13 = str31;
                        str14 = str32;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str35);
                        i2 = i10 | 4;
                        i10 = i2;
                        str12 = str30;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 3:
                        str13 = str31;
                        str14 = str32;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str34);
                        i2 = i10 | 8;
                        i10 = i2;
                        str12 = str30;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 4:
                        str13 = str31;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str32);
                        i10 |= 16;
                        str12 = str30;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 5:
                        str13 = str31;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str15);
                        i3 = i10 | 32;
                        i10 = i3;
                        str12 = str30;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 6:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str31);
                        i3 = i10 | 64;
                        i10 = i3;
                        str12 = str30;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 7:
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str26);
                        i4 = i10 | 128;
                        i10 = i4;
                        str12 = str30;
                        str13 = str31;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 8:
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i8, StringSerializer.INSTANCE, str28);
                        i4 = i10 | 256;
                        i10 = i4;
                        str12 = str30;
                        str13 = str31;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 9:
                        str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i7, StringSerializer.INSTANCE, str27);
                        i4 = i10 | 512;
                        i10 = i4;
                        str12 = str30;
                        str13 = str31;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 10:
                        str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str29);
                        i4 = i10 | 1024;
                        i10 = i4;
                        str12 = str30;
                        str13 = str31;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    case 11:
                        iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i5);
                        i10 |= 2048;
                        break;
                    case 12:
                        iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i9);
                        i10 |= 4096;
                        str12 = str30;
                        str13 = str31;
                        str14 = str32;
                        str31 = str13;
                        str32 = str14;
                        str30 = str12;
                        i9 = 12;
                        i5 = 11;
                        i6 = 10;
                        i7 = 9;
                        i8 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str31;
            str2 = str30;
            str3 = str26;
            str4 = str27;
            str5 = str29;
            str6 = str34;
            iDecodeIntElement = iDecodeIntElement3;
            iDecodeIntElement2 = iDecodeIntElement4;
            str7 = str32;
            str8 = str33;
            i = i10;
            str9 = str28;
            str10 = str35;
            str11 = str15;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AAGenerateSignatureHash(i, str8, str2, str10, str6, str7, str11, str, str3, str9, str4, str5, iDecodeIntElement, iDecodeIntElement2, null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AAGenerateSignatureHash aAGenerateSignatureHash) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aAGenerateSignatureHash, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AAGenerateSignatureHash.write$Self$OKWalletCore_wallet_lib(aAGenerateSignatureHash, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
