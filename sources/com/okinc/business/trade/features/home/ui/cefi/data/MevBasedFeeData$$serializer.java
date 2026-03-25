package com.okinc.business.trade.features.home.ui.cefi.data;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class MevBasedFeeData$$serializer implements GeneratedSerializer<MevBasedFeeData> {
    public static final int $stable;
    public static final MevBasedFeeData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private MevBasedFeeData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        MevBasedFeeData$$serializer mevBasedFeeData$$serializer = new MevBasedFeeData$$serializer();
        INSTANCE = mevBasedFeeData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData", mevBasedFeeData$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("baseFee", true);
        pluginGeneratedSerialDescriptor.addElement("baseFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("fastFee", true);
        pluginGeneratedSerialDescriptor.addElement("fastFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("marketFee", true);
        pluginGeneratedSerialDescriptor.addElement("marketFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("maxFee", true);
        pluginGeneratedSerialDescriptor.addElement("maxBaseFee", true);
        pluginGeneratedSerialDescriptor.addElement("minFee", true);
        pluginGeneratedSerialDescriptor.addElement("turboFee", true);
        pluginGeneratedSerialDescriptor.addElement("turboFeeUsd", true);
        pluginGeneratedSerialDescriptor.addElement("decimals", true);
        pluginGeneratedSerialDescriptor.addElement(FirebaseAnalytics.Param.PRICE, true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final MevBasedFeeData deserialize(@NotNull Decoder decoder) {
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
        String str12;
        String str13;
        String str14;
        int i;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            str5 = str35;
            str4 = str34;
            str9 = str33;
            str10 = str31;
            str = str30;
            str7 = str29;
            str14 = str27;
            str3 = str32;
            str2 = str28;
            str6 = str36;
            str8 = str25;
            str11 = str24;
            str12 = str26;
            i = 16383;
        } else {
            int i5 = 13;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            String str47 = null;
            String str48 = null;
            boolean z = true;
            int i6 = 0;
            String str49 = null;
            String str50 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str18 = str49;
                        str19 = str43;
                        str20 = str45;
                        str21 = str46;
                        str22 = str47;
                        str23 = str44;
                        z = false;
                        str45 = str20;
                        str46 = str21;
                        str43 = str19;
                        str49 = str18;
                        str44 = str23;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str47 = str22;
                        break;
                    case 0:
                        str18 = str49;
                        str19 = str43;
                        str20 = str45;
                        str21 = str46;
                        String str51 = str47;
                        str23 = str44;
                        str22 = str51;
                        str48 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str48);
                        i6 |= 1;
                        str45 = str20;
                        str46 = str21;
                        str43 = str19;
                        str49 = str18;
                        str44 = str23;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str47 = str22;
                        break;
                    case 1:
                        str18 = str49;
                        str19 = str43;
                        str20 = str45;
                        str21 = str46;
                        String str52 = str47;
                        str23 = str44;
                        i6 |= 2;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str52);
                        str45 = str20;
                        str46 = str21;
                        str43 = str19;
                        str49 = str18;
                        str44 = str23;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str47 = str22;
                        break;
                    case 2:
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str43);
                        i6 |= 4;
                        str49 = str49;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 3:
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        i6 |= 8;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str42);
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 4:
                        str15 = str44;
                        str16 = str45;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str46);
                        i6 |= 16;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 5:
                        str15 = str44;
                        str16 = str45;
                        i6 |= 32;
                        str50 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str50);
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 6:
                        str15 = str44;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str45);
                        i6 |= 64;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 7:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str44);
                        i6 |= 128;
                        str16 = str45;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 8:
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str37);
                        i6 |= 256;
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 9:
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str49);
                        i6 |= 512;
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 10:
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str38);
                        i6 |= 1024;
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 11:
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str39);
                        i6 |= 2048;
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 12:
                        i6 |= 4096;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str41);
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    case 13:
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str40);
                        i6 |= 8192;
                        str15 = str44;
                        str16 = str45;
                        str17 = str46;
                        str44 = str15;
                        str45 = str16;
                        str46 = str17;
                        i5 = 13;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str53 = str43;
            String str54 = str47;
            String str55 = str44;
            str = str45;
            str2 = str46;
            str3 = str37;
            str4 = str38;
            str5 = str39;
            str6 = str41;
            str7 = str50;
            str8 = str54;
            str9 = str49;
            str10 = str55;
            str11 = str48;
            str12 = str53;
            str13 = str40;
            str14 = str42;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new MevBasedFeeData(i, str11, str8, str12, str14, str2, str7, str, str10, str3, str9, str4, str5, str6, str13, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull MevBasedFeeData mevBasedFeeData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(mevBasedFeeData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        MevBasedFeeData.write$Self$OKDex_dex_impl(mevBasedFeeData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
