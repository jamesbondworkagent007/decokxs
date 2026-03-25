package com.okinc.unify_trade.biz;

import androidx.autofill.HintConstants;
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

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class ThirdSignalDetail$$serializer implements GeneratedSerializer<ThirdSignalDetail> {
    public static final int $stable;
    public static final ThirdSignalDetail$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ThirdSignalDetail$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ThirdSignalDetail$$serializer thirdSignalDetail$$serializer = new ThirdSignalDetail$$serializer();
        INSTANCE = thirdSignalDetail$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.ThirdSignalDetail", thirdSignalDetail$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("signalChanId", true);
        pluginGeneratedSerialDescriptor.addElement("signalChanName", true);
        pluginGeneratedSerialDescriptor.addElement("signalSourceType", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionType", true);
        pluginGeneratedSerialDescriptor.addElement("profitSharingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionFee", true);
        pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_USERNAME, true);
        pluginGeneratedSerialDescriptor.addElement("avatar", true);
        pluginGeneratedSerialDescriptor.addElement("tickType", true);
        pluginGeneratedSerialDescriptor.addElement("instIds", true);
        pluginGeneratedSerialDescriptor.addElement("tipLever", true);
        pluginGeneratedSerialDescriptor.addElement("tipMinInvest", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ThirdSignalDetail deserialize(@NotNull Decoder decoder) {
        int i;
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
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        String str21 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str2 = str33;
            str = str32;
            str5 = str31;
            str13 = str27;
            str11 = str30;
            str4 = str24;
            str10 = str22;
            str8 = str29;
            str6 = str26;
            str9 = str25;
            str12 = str23;
            str7 = str28;
            i = 8191;
        } else {
            int i5 = 12;
            i = 0;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            boolean z = true;
            String str45 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str14 = str21;
                        str15 = str41;
                        str16 = str42;
                        str17 = str44;
                        str18 = str34;
                        z = false;
                        str44 = str17;
                        str42 = str16;
                        str21 = str14;
                        str34 = str18;
                        i3 = 11;
                        i4 = 10;
                        str41 = str15;
                        i5 = 12;
                        break;
                    case 0:
                        str15 = str41;
                        str16 = str42;
                        str17 = str44;
                        str18 = str34;
                        str14 = str21;
                        i |= 1;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str43);
                        str44 = str17;
                        str42 = str16;
                        str21 = str14;
                        str34 = str18;
                        i3 = 11;
                        i4 = 10;
                        str41 = str15;
                        i5 = 12;
                        break;
                    case 1:
                        i |= 2;
                        str34 = str34;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str41);
                        break;
                    case 2:
                        str19 = str42;
                        str20 = str44;
                        i |= 4;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str45);
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 3:
                        str19 = str42;
                        str20 = str44;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str34);
                        i2 = i | 8;
                        i = i2;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 4:
                        str20 = str44;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str42);
                        i2 = i | 16;
                        i = i2;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 5:
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str44);
                        i |= 32;
                        str19 = str42;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 6:
                        i |= 64;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str36);
                        str19 = str42;
                        str20 = str44;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 7:
                        i |= 128;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str39);
                        str19 = str42;
                        str20 = str44;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 8:
                        i |= 256;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str37);
                        str19 = str42;
                        str20 = str44;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 9:
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str21);
                        i |= 512;
                        str19 = str42;
                        str20 = str44;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 10:
                        String str46 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str35);
                        i |= 1024;
                        str19 = str42;
                        str20 = str44;
                        str35 = str46;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 11:
                        i |= 2048;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str38);
                        str19 = str42;
                        str20 = str44;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 12:
                        i |= 4096;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str40);
                        str19 = str42;
                        str20 = str44;
                        str44 = str20;
                        str42 = str19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str47 = str41;
            str = str35;
            str2 = str38;
            str3 = str40;
            str4 = str45;
            str5 = str21;
            str6 = str42;
            str7 = str36;
            str8 = str39;
            str9 = str34;
            str10 = str43;
            str11 = str37;
            str12 = str47;
            str13 = str44;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ThirdSignalDetail(i, str10, str12, str4, str9, str6, str13, str7, str8, str11, str5, str, str2, str3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ThirdSignalDetail thirdSignalDetail) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(thirdSignalDetail, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ThirdSignalDetail.write$Self$OKTradeCore_trade_core(thirdSignalDetail, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
