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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestUserRewardElementInfo$$serializer implements GeneratedSerializer<InvestUserRewardElementInfo> {
    public static final int $stable;
    public static final InvestUserRewardElementInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUserRewardElementInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUserRewardElementInfo$$serializer investUserRewardElementInfo$$serializer = new InvestUserRewardElementInfo$$serializer();
        INSTANCE = investUserRewardElementInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestUserRewardElementInfo", investUserRewardElementInfo$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("buttonType", true);
        pluginGeneratedSerialDescriptor.addElement("coinAmount", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("tokenAddress", true);
        pluginGeneratedSerialDescriptor.addElement("tokenLogo", true);
        pluginGeneratedSerialDescriptor.addElement("tokenPrecision", true);
        pluginGeneratedSerialDescriptor.addElement("tokenSymbol", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer kSerializer = InvestUserRewardElementInfo.$childSerializers[0];
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUserRewardElementInfo deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        ButtonType buttonType;
        String str5;
        String str6;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestUserRewardElementInfo.$childSerializers;
        int i2 = 6;
        int i3 = 5;
        String str7 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            ButtonType buttonType2 = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            buttonType = buttonType2;
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            i = 127;
            str2 = str12;
            str5 = str10;
            str3 = str11;
            str6 = str9;
            str4 = str8;
        } else {
            boolean z = true;
            int i4 = 0;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            ButtonType buttonType3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 0:
                        buttonType3 = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], buttonType3);
                        i4 |= 1;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 1:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str17);
                        i4 |= 2;
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 2:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str7);
                        i4 |= 4;
                        break;
                    case 3:
                        i4 |= 8;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str13);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 4:
                        i4 |= 16;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str16);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 5:
                        i4 |= 32;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str15);
                        i2 = 6;
                        i3 = 5;
                        break;
                    case 6:
                        i4 |= 64;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str14);
                        i2 = 6;
                        i3 = 5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            ButtonType buttonType4 = buttonType3;
            str = str14;
            str2 = str15;
            str3 = str16;
            str4 = str17;
            buttonType = buttonType4;
            str5 = str13;
            str6 = str7;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUserRewardElementInfo(i, buttonType, str4, str6, str5, str3, str2, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUserRewardElementInfo investUserRewardElementInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUserRewardElementInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUserRewardElementInfo.write$Self$OKDeFi_invest_biz(investUserRewardElementInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
