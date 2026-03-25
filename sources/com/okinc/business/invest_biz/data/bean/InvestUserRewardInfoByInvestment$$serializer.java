package com.okinc.business.invest_biz.data.bean;

import java.util.List;
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

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class InvestUserRewardInfoByInvestment$$serializer implements GeneratedSerializer<InvestUserRewardInfoByInvestment> {
    public static final int $stable;
    public static final InvestUserRewardInfoByInvestment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InvestUserRewardInfoByInvestment$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InvestUserRewardInfoByInvestment$$serializer investUserRewardInfoByInvestment$$serializer = new InvestUserRewardInfoByInvestment$$serializer();
        INSTANCE = investUserRewardInfoByInvestment$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.InvestUserRewardInfoByInvestment", investUserRewardInfoByInvestment$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("baseDefiTokenInfos", true);
        pluginGeneratedSerialDescriptor.addElement("buttonType", true);
        pluginGeneratedSerialDescriptor.addElement("claimMode", true);
        pluginGeneratedSerialDescriptor.addElement("currencyAmount", true);
        pluginGeneratedSerialDescriptor.addElement("extraData", true);
        pluginGeneratedSerialDescriptor.addElement("rewardType", true);
        pluginGeneratedSerialDescriptor.addElement("callDataExtJson", true);
        pluginGeneratedSerialDescriptor.addElement("unclaimedTokenList", true);
        pluginGeneratedSerialDescriptor.addElement("network", true);
        pluginGeneratedSerialDescriptor.addElement("chainId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InvestUserRewardInfoByInvestment.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), kSerializerArr[1], kSerializerArr[2], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE), kSerializerArr[5], BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[7], stringSerializer, BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InvestUserRewardInfoByInvestment deserialize(@NotNull Decoder decoder) {
        int i;
        List list;
        String str;
        ButtonType buttonType;
        Long l;
        String str2;
        String str3;
        InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation;
        InvestUserRewardsAction investUserRewardsAction;
        RewardType rewardType;
        List list2;
        String str4;
        InvestUserRewardsAction investUserRewardsAction2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = InvestUserRewardInfoByInvestment.$childSerializers;
        int i2 = 9;
        int i3 = 6;
        int i4 = 8;
        int i5 = 7;
        ButtonType buttonType2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            buttonType = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            InvestUserRewardsAction investUserRewardsAction3 = (InvestUserRewardsAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation2 = (InvestUserAssetDetailClaimPromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE, null);
            RewardType rewardType2 = (RewardType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            list = list4;
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, null);
            str = str6;
            str3 = str5;
            str2 = strDecodeStringElement;
            investUserAssetDetailClaimPromptInformation = investUserAssetDetailClaimPromptInformation2;
            rewardType = rewardType2;
            investUserRewardsAction = investUserRewardsAction3;
            list2 = list3;
            i = 1023;
        } else {
            int i6 = 0;
            boolean z = true;
            InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation3 = null;
            RewardType rewardType3 = null;
            List list5 = null;
            String str7 = null;
            Long l2 = null;
            String strDecodeStringElement2 = null;
            String str8 = null;
            InvestUserRewardsAction investUserRewardsAction4 = null;
            List list6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str4 = str8;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        z = false;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 0:
                        str4 = str8;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list6);
                        i6 |= 1;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 1:
                        str4 = str8;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        buttonType2 = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], buttonType2);
                        i6 |= 2;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 2:
                        str4 = str8;
                        investUserRewardsAction4 = (InvestUserRewardsAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investUserRewardsAction4);
                        i6 |= 4;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 3:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str8);
                        i6 |= 8;
                        str4 = str8;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 4:
                        investUserAssetDetailClaimPromptInformation3 = (InvestUserAssetDetailClaimPromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE, investUserAssetDetailClaimPromptInformation3);
                        i6 |= 16;
                        str4 = str8;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 5:
                        rewardType3 = (RewardType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], rewardType3);
                        i6 |= 32;
                        str4 = str8;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 6:
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str7);
                        i6 |= 64;
                        str4 = str8;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        str8 = str4;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 7:
                        list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list5);
                        i6 |= 128;
                        break;
                    case 8:
                        i6 |= 256;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        break;
                    case 9:
                        i6 |= 512;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.INSTANCE, l2);
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str9 = str8;
            i = i6;
            list = list5;
            str = str7;
            buttonType = buttonType2;
            l = l2;
            str2 = strDecodeStringElement2;
            str3 = str9;
            investUserAssetDetailClaimPromptInformation = investUserAssetDetailClaimPromptInformation3;
            investUserRewardsAction = investUserRewardsAction4;
            rewardType = rewardType3;
            list2 = list6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InvestUserRewardInfoByInvestment(i, list2, buttonType, investUserRewardsAction, str3, investUserAssetDetailClaimPromptInformation, rewardType, str, list, str2, l, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InvestUserRewardInfoByInvestment investUserRewardInfoByInvestment) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(investUserRewardInfoByInvestment, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InvestUserRewardInfoByInvestment.write$Self$OKDeFi_invest_biz(investUserRewardInfoByInvestment, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
