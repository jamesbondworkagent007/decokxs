package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
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
public final /* synthetic */ class UnifiedRewardInfoByInvestment$$serializer implements GeneratedSerializer<UnifiedRewardInfoByInvestment> {
    public static final int $stable;
    public static final UnifiedRewardInfoByInvestment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private UnifiedRewardInfoByInvestment$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        UnifiedRewardInfoByInvestment$$serializer unifiedRewardInfoByInvestment$$serializer = new UnifiedRewardInfoByInvestment$$serializer();
        INSTANCE = unifiedRewardInfoByInvestment$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.UnifiedRewardInfoByInvestment", unifiedRewardInfoByInvestment$$serializer, 12);
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
        pluginGeneratedSerialDescriptor.addElement("investmentId", true);
        pluginGeneratedSerialDescriptor.addElement("investmentCategory", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = UnifiedRewardInfoByInvestment.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(kSerializerArr[0]), kSerializerArr[1], kSerializerArr[2], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE), kSerializerArr[5], BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[7], stringSerializer, BuiltinSerializersKt.getNullable(longSerializer), longSerializer, kSerializerArr[11]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final UnifiedRewardInfoByInvestment deserialize(@NotNull Decoder decoder) {
        String str;
        InvestUserRewardsAction investUserRewardsAction;
        Long l;
        ButtonType buttonType;
        String str2;
        List list;
        InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation;
        String str3;
        long j;
        InvestmentKind investmentKind;
        RewardType rewardType;
        int i;
        List list2;
        InvestUserRewardsAction investUserRewardsAction2;
        RewardType rewardType2;
        ButtonType buttonType2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = UnifiedRewardInfoByInvestment.$childSerializers;
        int i2 = 9;
        int i3 = 6;
        int i4 = 8;
        int i5 = 7;
        Long l2 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            ButtonType buttonType3 = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            InvestUserRewardsAction investUserRewardsAction3 = (InvestUserRewardsAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str4 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation2 = (InvestUserAssetDetailClaimPromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE, null);
            RewardType rewardType3 = (RewardType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, null);
            long jDecodeLongElement = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
            investmentKind = (InvestmentKind) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            investUserAssetDetailClaimPromptInformation = investUserAssetDetailClaimPromptInformation2;
            l = l3;
            str = str5;
            str2 = str4;
            str3 = strDecodeStringElement;
            rewardType = rewardType3;
            list = list4;
            investUserRewardsAction = investUserRewardsAction3;
            j = jDecodeLongElement;
            list2 = list3;
            buttonType = buttonType3;
            i = 4095;
        } else {
            int i6 = 11;
            InvestmentKind investmentKind2 = null;
            String str6 = null;
            String str7 = null;
            InvestUserRewardsAction investUserRewardsAction4 = null;
            String strDecodeStringElement2 = null;
            RewardType rewardType4 = null;
            ButtonType buttonType4 = null;
            List list5 = null;
            int i7 = 0;
            boolean z = true;
            long jDecodeLongElement2 = 0;
            List list6 = null;
            InvestUserAssetDetailClaimPromptInformation investUserAssetDetailClaimPromptInformation3 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        buttonType2 = buttonType4;
                        z = false;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 0:
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        buttonType2 = buttonType4;
                        i7 |= 1;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list5);
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 1:
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        i7 |= 2;
                        buttonType2 = (ButtonType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], buttonType4);
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 2:
                        rewardType2 = rewardType4;
                        i7 |= 4;
                        investUserRewardsAction2 = (InvestUserRewardsAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], investUserRewardsAction4);
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 3:
                        rewardType2 = rewardType4;
                        i7 |= 8;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str7);
                        investUserRewardsAction2 = investUserRewardsAction4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 4:
                        rewardType2 = rewardType4;
                        i7 |= 16;
                        investUserAssetDetailClaimPromptInformation3 = (InvestUserAssetDetailClaimPromptInformation) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, InvestUserAssetDetailClaimPromptInformation$$serializer.INSTANCE, investUserAssetDetailClaimPromptInformation3);
                        investUserRewardsAction2 = investUserRewardsAction4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 5:
                        i7 |= 32;
                        rewardType2 = (RewardType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], rewardType4);
                        investUserRewardsAction2 = investUserRewardsAction4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 6:
                        i7 |= 64;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str6);
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 7:
                        i7 |= 128;
                        list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i5, kSerializerArr[i5], list6);
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 8:
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i7 |= 256;
                        i6 = 11;
                        break;
                    case 9:
                        i7 |= 512;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, LongSerializer.INSTANCE, l2);
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 10:
                        jDecodeLongElement2 = compositeDecoderBeginStructure.decodeLongElement(serialDescriptor, 10);
                        i7 |= 1024;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    case 11:
                        investmentKind2 = (InvestmentKind) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, i6, kSerializerArr[i6], investmentKind2);
                        i7 |= 2048;
                        investUserRewardsAction2 = investUserRewardsAction4;
                        rewardType2 = rewardType4;
                        buttonType2 = buttonType4;
                        rewardType4 = rewardType2;
                        investUserRewardsAction4 = investUserRewardsAction2;
                        buttonType4 = buttonType2;
                        i6 = 11;
                        i2 = 9;
                        i3 = 6;
                        i4 = 8;
                        i5 = 7;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            RewardType rewardType5 = rewardType4;
            ButtonType buttonType5 = buttonType4;
            List list7 = list5;
            str = str6;
            investUserRewardsAction = investUserRewardsAction4;
            l = l2;
            buttonType = buttonType5;
            str2 = str7;
            list = list6;
            investUserAssetDetailClaimPromptInformation = investUserAssetDetailClaimPromptInformation3;
            str3 = strDecodeStringElement2;
            j = jDecodeLongElement2;
            investmentKind = investmentKind2;
            rewardType = rewardType5;
            i = i7;
            list2 = list7;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new UnifiedRewardInfoByInvestment(i, list2, buttonType, investUserRewardsAction, str2, investUserAssetDetailClaimPromptInformation, rewardType, str, list, str3, l, j, investmentKind, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull UnifiedRewardInfoByInvestment unifiedRewardInfoByInvestment) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(unifiedRewardInfoByInvestment, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        UnifiedRewardInfoByInvestment.write$Self$OKDeFi_invest_biz(unifiedRewardInfoByInvestment, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
