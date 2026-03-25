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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class WalletGasLimitRes$$serializer implements GeneratedSerializer<WalletGasLimitRes> {
    public static final int $stable;
    public static final WalletGasLimitRes$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private WalletGasLimitRes$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        WalletGasLimitRes$$serializer walletGasLimitRes$$serializer = new WalletGasLimitRes$$serializer();
        INSTANCE = walletGasLimitRes$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.defi.biz.net.bean.WalletGasLimitRes", walletGasLimitRes$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("gas_limit", true);
        pluginGeneratedSerialDescriptor.addElement("gasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("originGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("minGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("maxGasLimit", true);
        pluginGeneratedSerialDescriptor.addElement("invokeNotificationFee", true);
        pluginGeneratedSerialDescriptor.addElement("l1GasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("l1GasUsed", true);
        pluginGeneratedSerialDescriptor.addElement("l1DataGasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("l1DataGasUsed", true);
        pluginGeneratedSerialDescriptor.addElement("l2GasPrice", true);
        pluginGeneratedSerialDescriptor.addElement("l2GasUsed", true);
        pluginGeneratedSerialDescriptor.addElement("overallFee", true);
        pluginGeneratedSerialDescriptor.addElement("queryGasLimitErrorUseDefault", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(BooleanSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final WalletGasLimitRes deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        Boolean bool;
        String str12;
        String str13;
        int i;
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
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        String str25 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str11 = str27;
            str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            bool = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, BooleanSerializer.INSTANCE, null);
            str9 = str37;
            str7 = str36;
            str2 = str35;
            str3 = str33;
            str4 = str32;
            str10 = str31;
            str = str29;
            str6 = str34;
            str5 = str30;
            str13 = str26;
            str12 = str28;
            i = 16383;
        } else {
            int i5 = 13;
            boolean z = true;
            int i6 = 0;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            Boolean bool2 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            String str49 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str14 = str39;
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str18 = str47;
                        str19 = str49;
                        str20 = str38;
                        str21 = str48;
                        z = false;
                        str45 = str16;
                        str46 = str17;
                        str47 = str18;
                        str38 = str20;
                        str48 = str21;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str49 = str19;
                        str44 = str15;
                        str39 = str14;
                        i5 = 13;
                        break;
                    case 0:
                        str14 = str39;
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str18 = str47;
                        str20 = str38;
                        String str50 = str49;
                        str21 = str48;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str50);
                        i6 |= 1;
                        str45 = str16;
                        str46 = str17;
                        str47 = str18;
                        str38 = str20;
                        str48 = str21;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str49 = str19;
                        str44 = str15;
                        str39 = str14;
                        i5 = 13;
                        break;
                    case 1:
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str18 = str47;
                        str20 = str38;
                        str14 = str39;
                        i6 |= 2;
                        str19 = str49;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str48);
                        str45 = str16;
                        str46 = str17;
                        str47 = str18;
                        str38 = str20;
                        str48 = str21;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str49 = str19;
                        str44 = str15;
                        str39 = str14;
                        i5 = 13;
                        break;
                    case 2:
                        i6 |= 4;
                        str38 = str38;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str44);
                        break;
                    case 3:
                        str22 = str45;
                        str23 = str46;
                        str24 = str47;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str38);
                        i6 |= 8;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 4:
                        str22 = str45;
                        str23 = str46;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str47);
                        i6 |= 16;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 5:
                        str22 = str45;
                        str23 = str46;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str39);
                        i6 |= 32;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 6:
                        str22 = str45;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str46);
                        i6 |= 64;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 7:
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str45);
                        i6 |= 128;
                        str23 = str46;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 8:
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str40);
                        i6 |= 256;
                        str22 = str45;
                        str23 = str46;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 9:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str25);
                        i6 |= 512;
                        str22 = str45;
                        str23 = str46;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 10:
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str41);
                        i6 |= 1024;
                        str22 = str45;
                        str23 = str46;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 11:
                        i6 |= 2048;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str43);
                        str22 = str45;
                        str23 = str46;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 12:
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str42);
                        i6 |= 4096;
                        str22 = str45;
                        str23 = str46;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    case 13:
                        i6 |= 8192;
                        bool2 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool2);
                        str22 = str45;
                        str23 = str46;
                        str24 = str47;
                        str45 = str22;
                        str46 = str23;
                        str47 = str24;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str51 = str39;
            String str52 = str44;
            String str53 = str45;
            String str54 = str49;
            str = str38;
            String str55 = str48;
            str2 = str25;
            str3 = str53;
            str4 = str46;
            str5 = str47;
            str6 = str40;
            str7 = str41;
            str8 = str42;
            str9 = str43;
            str10 = str51;
            str11 = str55;
            bool = bool2;
            str12 = str52;
            str13 = str54;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new WalletGasLimitRes(i, str13, str11, str12, str, str5, str10, str4, str3, str6, str2, str7, str9, str8, bool, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull WalletGasLimitRes walletGasLimitRes) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(walletGasLimitRes, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        WalletGasLimitRes.write$Self$OKWallet_wallet_api(walletGasLimitRes, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
