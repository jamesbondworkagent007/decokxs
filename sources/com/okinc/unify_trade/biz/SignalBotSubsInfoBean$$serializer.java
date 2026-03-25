package com.okinc.unify_trade.biz;

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

/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class SignalBotSubsInfoBean$$serializer implements GeneratedSerializer<SignalBotSubsInfoBean> {
    public static final int $stable;
    public static final SignalBotSubsInfoBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SignalBotSubsInfoBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SignalBotSubsInfoBean$$serializer signalBotSubsInfoBean$$serializer = new SignalBotSubsInfoBean$$serializer();
        INSTANCE = signalBotSubsInfoBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.SignalBotSubsInfoBean", signalBotSubsInfoBean$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("annualizedRate", true);
        pluginGeneratedSerialDescriptor.addElement("ccy", true);
        pluginGeneratedSerialDescriptor.addElement("followerWinRate", true);
        pluginGeneratedSerialDescriptor.addElement("isSubscribed", true);
        pluginGeneratedSerialDescriptor.addElement("profitSharingRatio", true);
        pluginGeneratedSerialDescriptor.addElement("signalChanId", true);
        pluginGeneratedSerialDescriptor.addElement("signalChanName", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionFee", true);
        pluginGeneratedSerialDescriptor.addElement("subscriptionType", true);
        pluginGeneratedSerialDescriptor.addElement("totalFollowerAssets", true);
        pluginGeneratedSerialDescriptor.addElement("totalFollowerCount", true);
        pluginGeneratedSerialDescriptor.addElement("userSubscriptionType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SignalBotSubsInfoBean deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
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
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 11;
        int i3 = 10;
        int i4 = 9;
        int i5 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str3 = str30;
            str5 = str29;
            str = str27;
            str9 = str26;
            str2 = str28;
            str8 = str22;
            str11 = str25;
            i = 4095;
            z = zDecodeBooleanElement;
            str4 = str21;
            str10 = str24;
            str7 = str23;
        } else {
            int i6 = 0;
            boolean z2 = true;
            String str31 = null;
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
            boolean zDecodeBooleanElement2 = false;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str12 = str38;
                        str13 = str40;
                        str14 = str39;
                        z2 = false;
                        str15 = str37;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 0:
                        str17 = str37;
                        str18 = str38;
                        String str42 = str40;
                        str19 = str39;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str42);
                        i6 |= 1;
                        str37 = str17;
                        str38 = str18;
                        str39 = str19;
                        i2 = 11;
                        i4 = 9;
                        i5 = 8;
                        str40 = str20;
                        i3 = 10;
                        break;
                    case 1:
                        str16 = str39;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str38);
                        i6 |= 2;
                        str15 = str37;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 2:
                        str16 = str39;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str37);
                        i6 |= 4;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 3:
                        str16 = str39;
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 3);
                        i6 |= 8;
                        str15 = str37;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 4:
                        str16 = str39;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str36);
                        i6 |= 16;
                        str15 = str37;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 5:
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str39);
                        i6 |= 32;
                        str15 = str37;
                        str16 = str39;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 6:
                        str41 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str41);
                        i6 |= 64;
                        str15 = str37;
                        str16 = str39;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 7:
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str31);
                        i6 |= 128;
                        str15 = str37;
                        str16 = str39;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 8:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str32);
                        i6 |= 256;
                        str15 = str37;
                        str16 = str39;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 9:
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str34);
                        i6 |= 512;
                        str15 = str37;
                        str16 = str39;
                        str12 = str38;
                        str13 = str40;
                        str14 = str16;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    case 10:
                        i6 |= 1024;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str33);
                        str17 = str37;
                        str18 = str38;
                        str20 = str40;
                        str19 = str39;
                        str37 = str17;
                        str38 = str18;
                        str39 = str19;
                        i2 = 11;
                        i4 = 9;
                        i5 = 8;
                        str40 = str20;
                        i3 = 10;
                        break;
                    case 11:
                        i6 |= 2048;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str35);
                        str15 = str37;
                        str12 = str38;
                        str13 = str40;
                        str14 = str39;
                        str37 = str15;
                        str38 = str12;
                        str39 = str14;
                        i2 = 11;
                        i3 = 10;
                        i4 = 9;
                        str40 = str13;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str43 = str37;
            String str44 = str38;
            str = str31;
            str2 = str32;
            str3 = str33;
            str4 = str40;
            str5 = str34;
            str6 = str35;
            z = zDecodeBooleanElement2;
            i = i6;
            str7 = str43;
            str8 = str44;
            str9 = str41;
            str10 = str36;
            str11 = str39;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SignalBotSubsInfoBean(i, str4, str8, str7, z, str10, str11, str9, str, str2, str5, str3, str6, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SignalBotSubsInfoBean signalBotSubsInfoBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(signalBotSubsInfoBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SignalBotSubsInfoBean.write$Self$OKTradeCore_trade_core(signalBotSubsInfoBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
