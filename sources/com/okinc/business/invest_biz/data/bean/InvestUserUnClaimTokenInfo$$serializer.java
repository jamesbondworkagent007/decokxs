package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestUserUnClaimTokenInfo$$serializer implements GeneratedSerializer<InvestUserUnClaimTokenInfo> {
    public static final int $stable;
    public static final InvestUserUnClaimTokenInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUserUnClaimTokenInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUserUnClaimTokenInfo$$serializer investUserUnClaimTokenInfo$$serializer = new InvestUserUnClaimTokenInfo$$serializer();
        INSTANCE = investUserUnClaimTokenInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestUserUnClaimTokenInfo", investUserUnClaimTokenInfo$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("buttonType", true);
        pluginGeneratedSerialDescriptor.addElement("callDataExtJson", true);
        pluginGeneratedSerialDescriptor.addElement("callDataRewardType", true);
        pluginGeneratedSerialDescriptor.addElement("claimIndex", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("extraData", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(InvestUserRewardDetailPromptInformation$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUserUnClaimTokenInfo deserialize(@NotNull Decoder decoder) {
        Integer num;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num2;
        String str5;
        String str6;
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation;
        int i;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation2;
        InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i2 = 10;
        int i3 = 9;
        int i4 = 7;
        int i5 = 8;
        String str13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, intSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, intSerializer, null);
            String str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation4 = (InvestUserRewardDetailPromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, InvestUserRewardDetailPromptInformation$$serializer.INSTANCE, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str4 = str21;
            str2 = str20;
            str = str18;
            investUserRewardDetailPromptInformation = investUserRewardDetailPromptInformation4;
            str7 = str17;
            str3 = str19;
            num = num3;
            str6 = str15;
            i = 4095;
            num2 = num4;
            str8 = str16;
            str9 = str14;
        } else {
            int i6 = 11;
            int i7 = 0;
            boolean z = true;
            String str22 = null;
            String str23 = null;
            String str24 = null;
            String str25 = null;
            Integer num5 = null;
            String str26 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            Integer num6 = null;
            InvestUserRewardDetailPromptInformation investUserRewardDetailPromptInformation5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        num6 = num6;
                        i5 = 8;
                        break;
                    case 0:
                        str10 = str27;
                        str11 = str28;
                        str12 = str29;
                        i7 |= 1;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, num6);
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation5;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 1:
                        str11 = str28;
                        str12 = str29;
                        investUserRewardDetailPromptInformation3 = investUserRewardDetailPromptInformation5;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str27);
                        i7 |= 2;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation3;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 2:
                        str11 = str28;
                        str12 = str29;
                        investUserRewardDetailPromptInformation3 = investUserRewardDetailPromptInformation5;
                        i7 |= 4;
                        num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, IntSerializer.INSTANCE, num5);
                        str10 = str27;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation3;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 3:
                        str11 = str28;
                        str12 = str29;
                        investUserRewardDetailPromptInformation3 = investUserRewardDetailPromptInformation5;
                        i7 |= 8;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str13);
                        str10 = str27;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation3;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 4:
                        str11 = str28;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str29);
                        i7 |= 16;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation5;
                        str10 = str27;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 5:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str28);
                        i7 |= 32;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation5;
                        str10 = str27;
                        str12 = str29;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 6:
                        i7 |= 64;
                        investUserRewardDetailPromptInformation2 = (InvestUserRewardDetailPromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, InvestUserRewardDetailPromptInformation$$serializer.INSTANCE, investUserRewardDetailPromptInformation5);
                        str10 = str27;
                        str11 = str28;
                        str12 = str29;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 7:
                        i7 |= 128;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str22);
                        str10 = str27;
                        str11 = str28;
                        str12 = str29;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation5;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 8:
                        i7 |= 256;
                        str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str24);
                        str10 = str27;
                        str11 = str28;
                        str12 = str29;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation5;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 9:
                        i7 |= 512;
                        str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str23);
                        str10 = str27;
                        str11 = str28;
                        str12 = str29;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation5;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    case 10:
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str25);
                        i7 |= 1024;
                        break;
                    case 11:
                        i7 |= 2048;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i6, StringSerializer.INSTANCE, str26);
                        str10 = str27;
                        str11 = str28;
                        str12 = str29;
                        investUserRewardDetailPromptInformation2 = investUserRewardDetailPromptInformation5;
                        str28 = str11;
                        str29 = str12;
                        str27 = str10;
                        investUserRewardDetailPromptInformation5 = investUserRewardDetailPromptInformation2;
                        i6 = 11;
                        i2 = 10;
                        i3 = 9;
                        i4 = 7;
                        i5 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str30 = str27;
            num = num6;
            str = str22;
            str2 = str23;
            str3 = str24;
            str4 = str25;
            num2 = num5;
            str5 = str26;
            str6 = str13;
            investUserRewardDetailPromptInformation = investUserRewardDetailPromptInformation5;
            i = i7;
            str7 = str28;
            str8 = str29;
            str9 = str30;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUserUnClaimTokenInfo(i, num, str9, num2, str6, str8, str7, investUserRewardDetailPromptInformation, str, str3, str2, str4, str5, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUserUnClaimTokenInfo investUserUnClaimTokenInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUserUnClaimTokenInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUserUnClaimTokenInfo.write$Self$OKDeFi_invest_biz(investUserUnClaimTokenInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
