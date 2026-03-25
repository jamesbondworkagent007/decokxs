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
public final /* synthetic */ class CustomerSignalsItem$$serializer implements GeneratedSerializer<CustomerSignalsItem> {
    public static final int $stable;
    public static final CustomerSignalsItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private CustomerSignalsItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        CustomerSignalsItem$$serializer customerSignalsItem$$serializer = new CustomerSignalsItem$$serializer();
        INSTANCE = customerSignalsItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.CustomerSignalsItem", customerSignalsItem$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("signalChanId", true);
        pluginGeneratedSerialDescriptor.addElement("signalChanName", true);
        pluginGeneratedSerialDescriptor.addElement("signalDescription", true);
        pluginGeneratedSerialDescriptor.addElement("userSubscriptionType", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionExpireTime", true);
        pluginGeneratedSerialDescriptor.addElement("totalFollowerCount", true);
        pluginGeneratedSerialDescriptor.addElement("profitSharingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionFee", true);
        pluginGeneratedSerialDescriptor.addElement("autoRenewal", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_USERNAME, true);
        pluginGeneratedSerialDescriptor.addElement("avatar", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final CustomerSignalsItem deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        int i;
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
        String str22;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 7;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 8);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str3 = str31;
            str4 = str30;
            str2 = str29;
            str6 = str28;
            str9 = str27;
            z = zDecodeBooleanElement;
            str = str23;
            str10 = str25;
            i = 4095;
            str11 = str26;
            str8 = str24;
        } else {
            int i7 = 0;
            boolean z2 = true;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            String str41 = null;
            String str42 = null;
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str12 = str37;
                        str13 = str38;
                        str14 = str40;
                        str15 = str41;
                        str16 = str39;
                        z2 = false;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 0:
                        str18 = str37;
                        str19 = str38;
                        str20 = str40;
                        String str43 = str41;
                        str21 = str39;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str43);
                        i7 |= 1;
                        str40 = str20;
                        str37 = str18;
                        str38 = str19;
                        str39 = str21;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str41 = str22;
                        break;
                    case 1:
                        str12 = str37;
                        str17 = str39;
                        str14 = str40;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str38);
                        i7 |= 2;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 2:
                        str17 = str39;
                        str14 = str40;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str37);
                        i7 |= 4;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 3:
                        str17 = str39;
                        str14 = str40;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str36);
                        i7 |= 8;
                        str12 = str37;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 4:
                        str17 = str39;
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str40);
                        i7 |= 16;
                        str12 = str37;
                        str14 = str40;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 5:
                        str17 = str39;
                        str42 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str42);
                        i7 |= 32;
                        str12 = str37;
                        str14 = str40;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 6:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str39);
                        i7 |= 64;
                        str12 = str37;
                        str14 = str40;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 7:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str32);
                        i7 |= 128;
                        str12 = str37;
                        str17 = str39;
                        str14 = str40;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 8:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i7 |= 256;
                        str12 = str37;
                        str17 = str39;
                        str14 = str40;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 9:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str34);
                        i7 |= 512;
                        str12 = str37;
                        str17 = str39;
                        str14 = str40;
                        str13 = str38;
                        str15 = str41;
                        str16 = str17;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    case 10:
                        i7 |= 1024;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str33);
                        str18 = str37;
                        str19 = str38;
                        str20 = str40;
                        str22 = str41;
                        str21 = str39;
                        str40 = str20;
                        str37 = str18;
                        str38 = str19;
                        str39 = str21;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        i6 = 8;
                        str41 = str22;
                        break;
                    case 11:
                        i7 |= 2048;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str35);
                        str12 = str37;
                        str13 = str38;
                        str14 = str40;
                        str15 = str41;
                        str16 = str39;
                        str40 = str14;
                        str37 = str12;
                        str38 = str13;
                        str39 = str16;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        i5 = 7;
                        str41 = str15;
                        i6 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str44 = str37;
            String str45 = str38;
            str = str41;
            str2 = str32;
            str3 = str33;
            str4 = str34;
            str5 = str35;
            z = zDecodeBooleanElement2;
            str6 = str39;
            i = i7;
            str7 = str44;
            str8 = str45;
            str9 = str42;
            str10 = str36;
            str11 = str40;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new CustomerSignalsItem(i, str, str8, str7, str10, str11, str9, str6, str2, z, str4, str3, str5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull CustomerSignalsItem customerSignalsItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(customerSignalsItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        CustomerSignalsItem.write$Self$OKTradeCore_trade_core(customerSignalsItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
