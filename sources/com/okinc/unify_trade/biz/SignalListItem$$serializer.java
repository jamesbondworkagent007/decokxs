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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class SignalListItem$$serializer implements GeneratedSerializer<SignalListItem> {
    public static final int $stable;
    public static final SignalListItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalListItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalListItem$$serializer signalListItem$$serializer = new SignalListItem$$serializer();
        INSTANCE = signalListItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SignalListItem", signalListItem$$serializer, 15);
        pluginGeneratedSerialDescriptor.addElement("signalSourceType", true);
        pluginGeneratedSerialDescriptor.addElement("signalChanId", true);
        pluginGeneratedSerialDescriptor.addElement("signalChanName", true);
        pluginGeneratedSerialDescriptor.addElement("signalDescription", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionType", true);
        pluginGeneratedSerialDescriptor.addElement("profitSharingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionFee", true);
        pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_USERNAME, true);
        pluginGeneratedSerialDescriptor.addElement("avatar", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("userSubscriptionType", true);
        pluginGeneratedSerialDescriptor.addElement("instIds", true);
        pluginGeneratedSerialDescriptor.addElement("tickType", true);
        pluginGeneratedSerialDescriptor.addElement("count", true);
        pluginGeneratedSerialDescriptor.addElement("canEdit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalListItem deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
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
        String str21;
        int i2;
        String str22;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 11;
        int i5 = 10;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 14);
            str5 = str34;
            str4 = str33;
            str3 = str32;
            str = str28;
            str12 = str31;
            str7 = str25;
            str13 = str35;
            str10 = str23;
            str2 = str29;
            str11 = str27;
            i = 32767;
            str8 = str26;
            str14 = str24;
            str9 = str30;
        } else {
            int i6 = 14;
            boolean z = true;
            String str36 = null;
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
            int i7 = 0;
            boolean zDecodeBooleanElement2 = false;
            String str49 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str15 = str43;
                        str16 = str48;
                        z = false;
                        str36 = str36;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 0:
                        str15 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str20 = str36;
                        String str50 = str48;
                        str21 = str44;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str50);
                        i7 |= 1;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 1:
                        String str51 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str20 = str36;
                        str15 = str51;
                        i7 |= 2;
                        str16 = str48;
                        str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str44);
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 2:
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        String str52 = str43;
                        str20 = str36;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str52);
                        i7 |= 4;
                        str16 = str48;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 3:
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str36);
                        i2 = i7 | 8;
                        i7 = i2;
                        str15 = str43;
                        str16 = str48;
                        str20 = str36;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 4:
                        str18 = str46;
                        str17 = str45;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str47);
                        i2 = i7 | 16;
                        i7 = i2;
                        str15 = str43;
                        str16 = str48;
                        str20 = str36;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 5:
                        str22 = str45;
                        str18 = str46;
                        str49 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str49);
                        i3 = i7 | 32;
                        str17 = str22;
                        i7 = i3;
                        str15 = str43;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 6:
                        str22 = str45;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str46);
                        i3 = i7 | 64;
                        str17 = str22;
                        i7 = i3;
                        str15 = str43;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 7:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str45);
                        i7 |= 128;
                        str15 = str43;
                        str18 = str46;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 8:
                        i7 |= 256;
                        str15 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str37);
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 9:
                        i7 |= 512;
                        str15 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str38);
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 10:
                        String str53 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str39);
                        i7 |= 1024;
                        str15 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str39 = str53;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 11:
                        i7 |= 2048;
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str41);
                        str15 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 12:
                        i7 |= 4096;
                        str15 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str40);
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 13:
                        i7 |= 8192;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str42);
                        str15 = str43;
                        str17 = str45;
                        str18 = str46;
                        str19 = str47;
                        str16 = str48;
                        str20 = str36;
                        str21 = str44;
                        str46 = str18;
                        str47 = str19;
                        str36 = str20;
                        str45 = str17;
                        str44 = str21;
                        i4 = 11;
                        i5 = 10;
                        str48 = str16;
                        str43 = str15;
                        i6 = 14;
                        break;
                    case 14:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i7 |= 16384;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str54 = str48;
            String str55 = str44;
            zDecodeBooleanElement = zDecodeBooleanElement2;
            str = str49;
            str2 = str46;
            str3 = str38;
            str4 = str39;
            i = i7;
            str5 = str41;
            str6 = str42;
            str7 = str43;
            str8 = str36;
            str9 = str45;
            str10 = str54;
            str11 = str47;
            str12 = str37;
            str13 = str40;
            str14 = str55;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalListItem(i, str10, str14, str7, str8, str11, str, str2, str9, str12, str3, str4, str5, str13, str6, zDecodeBooleanElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalListItem signalListItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalListItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalListItem.write$Self$OKTradeCore_trade_core(signalListItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
