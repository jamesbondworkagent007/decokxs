package com.okinc.business.invest_biz.data.bean;

import com.okinc.business.invest_biz.data.bean.response.RewardCryptos;
import com.okinc.business.invest_biz.data.bean.response.RewardCryptos$$serializer;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class AggregateItem$$serializer implements GeneratedSerializer<AggregateItem> {
    public static final int $stable;
    public static final AggregateItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private AggregateItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        AggregateItem$$serializer aggregateItem$$serializer = new AggregateItem$$serializer();
        INSTANCE = aggregateItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.business.invest_biz.data.bean.AggregateItem", aggregateItem$$serializer, 22);
        pluginGeneratedSerialDescriptor.addElement("airDrop", true);
        pluginGeneratedSerialDescriptor.addElement("hasBonus", true);
        pluginGeneratedSerialDescriptor.addElement("itemType", true);
        pluginGeneratedSerialDescriptor.addElement("jumpParam", true);
        pluginGeneratedSerialDescriptor.addElement("leftTitle", true);
        pluginGeneratedSerialDescriptor.addElement("leftSubTitle", true);
        pluginGeneratedSerialDescriptor.addElement("rightTitle", true);
        pluginGeneratedSerialDescriptor.addElement("rateType", true);
        pluginGeneratedSerialDescriptor.addElement("rightSubTitle", true);
        pluginGeneratedSerialDescriptor.addElement("tvl", true);
        pluginGeneratedSerialDescriptor.addElement("tvlDisplay", true);
        pluginGeneratedSerialDescriptor.addElement("networkLogo", true);
        pluginGeneratedSerialDescriptor.addElement("investLogo", true);
        pluginGeneratedSerialDescriptor.addElement("investTagList", true);
        pluginGeneratedSerialDescriptor.addElement("pointsInfo", true);
        pluginGeneratedSerialDescriptor.addElement("rewardCryptos", true);
        pluginGeneratedSerialDescriptor.addElement("depositCryptos", true);
        pluginGeneratedSerialDescriptor.addElement("bonusSponsor", true);
        pluginGeneratedSerialDescriptor.addElement("bonusStartTime", true);
        pluginGeneratedSerialDescriptor.addElement("bonusEndTime", true);
        pluginGeneratedSerialDescriptor.addElement("displaySafeTag", true);
        pluginGeneratedSerialDescriptor.addElement("borrowableAmount", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = AggregateItem.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BackgroundImage$$serializer.INSTANCE, booleanSerializer, IntSerializer.INSTANCE, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[7], stringSerializer, stringSerializer, booleanSerializer, kSerializerArr[11], InvestPlatformLogo$$serializer.INSTANCE, kSerializerArr[13], BuiltinSerializersKt.getNullable(PointsInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RewardCryptos$$serializer.INSTANCE), kSerializerArr[16], stringSerializer, stringSerializer, stringSerializer, booleanSerializer, stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final AggregateItem deserialize(@NotNull Decoder decoder) {
        boolean zDecodeBooleanElement;
        InvestPlatformLogo investPlatformLogo;
        List list;
        RewardCryptos rewardCryptos;
        int i;
        List list2;
        BackgroundImage backgroundImage;
        List list3;
        PointsInfo pointsInfo;
        String str;
        String str2;
        String str3;
        String strDecodeStringElement;
        String str4;
        String str5;
        String str6;
        String strDecodeStringElement2;
        boolean z;
        int i2;
        AggregateItemRateType aggregateItemRateType;
        boolean z2;
        String str7;
        String strDecodeStringElement3;
        int i3;
        int i4;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = AggregateItem.$childSerializers;
        int i6 = 10;
        int i7 = 9;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BackgroundImage backgroundImage2 = (BackgroundImage) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BackgroundImage$$serializer.INSTANCE, null);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
            int iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            AggregateItemRateType aggregateItemRateType2 = (AggregateItemRateType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            boolean zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 10);
            List list4 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], null);
            InvestPlatformLogo investPlatformLogo2 = (InvestPlatformLogo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, InvestPlatformLogo$$serializer.INSTANCE, null);
            List list5 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], null);
            PointsInfo pointsInfo2 = (PointsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, PointsInfo$$serializer.INSTANCE, null);
            RewardCryptos rewardCryptos2 = (RewardCryptos) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, RewardCryptos$$serializer.INSTANCE, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], null);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement10;
            investPlatformLogo = investPlatformLogo2;
            z2 = zDecodeBooleanElement2;
            str2 = strDecodeStringElement7;
            str5 = strDecodeStringElement5;
            pointsInfo = pointsInfo2;
            list2 = list5;
            backgroundImage = backgroundImage2;
            rewardCryptos = rewardCryptos2;
            aggregateItemRateType = aggregateItemRateType2;
            list = list6;
            i2 = iDecodeIntElement;
            z = zDecodeBooleanElement3;
            i = 4194303;
            list3 = list4;
            str6 = strDecodeStringElement4;
            str7 = strDecodeStringElement9;
            str = strDecodeStringElement6;
        } else {
            boolean zDecodeBooleanElement4 = false;
            int i8 = 0;
            boolean zDecodeBooleanElement5 = false;
            boolean zDecodeBooleanElement6 = false;
            InvestPlatformLogo investPlatformLogo3 = null;
            List list7 = null;
            AggregateItemRateType aggregateItemRateType3 = null;
            List list8 = null;
            PointsInfo pointsInfo3 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            BackgroundImage backgroundImage3 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            boolean z3 = true;
            RewardCryptos rewardCryptos3 = null;
            List list9 = null;
            int iDecodeIntElement2 = 0;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 0:
                        backgroundImage3 = (BackgroundImage) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, BackgroundImage$$serializer.INSTANCE, backgroundImage3);
                        i8 |= 1;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 1:
                        zDecodeBooleanElement5 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                        i8 |= 2;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 2:
                        i8 |= 4;
                        iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 3:
                        i8 |= 8;
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 4:
                        i8 |= 16;
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 5:
                        i8 |= 32;
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 6:
                        i8 |= 64;
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 7:
                        i8 |= 128;
                        aggregateItemRateType3 = (AggregateItemRateType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], aggregateItemRateType3);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 8:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
                        i8 |= 256;
                        i7 = 9;
                        i6 = i6;
                        break;
                    case 9:
                        i3 = i6;
                        i4 = i7;
                        i8 |= 512;
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i7 = i4;
                        i6 = i3;
                        break;
                    case 10:
                        zDecodeBooleanElement6 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i6);
                        i8 |= 1024;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 11:
                        i8 |= 2048;
                        list8 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], list8);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 12:
                        investPlatformLogo3 = (InvestPlatformLogo) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, InvestPlatformLogo$$serializer.INSTANCE, investPlatformLogo3);
                        i8 |= 4096;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 13:
                        list9 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 13, kSerializerArr[13], list9);
                        i8 |= 8192;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 14:
                        i8 |= 16384;
                        pointsInfo3 = (PointsInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, PointsInfo$$serializer.INSTANCE, pointsInfo3);
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 15:
                        rewardCryptos3 = (RewardCryptos) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, RewardCryptos$$serializer.INSTANCE, rewardCryptos3);
                        i5 = 32768;
                        i8 = i5 | i8;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 16:
                        list7 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 16, kSerializerArr[16], list7);
                        i5 = 65536;
                        i8 = i5 | i8;
                        i6 = 10;
                        i7 = 9;
                        break;
                    case 17:
                        i8 |= 131072;
                        i3 = i6;
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 17);
                        i4 = 9;
                        i7 = i4;
                        i6 = i3;
                        break;
                    case 18:
                        i8 |= 262144;
                        i3 = i6;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 18);
                        i4 = 9;
                        i7 = i4;
                        i6 = i3;
                        break;
                    case 19:
                        i8 |= 524288;
                        i3 = i6;
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
                        i4 = 9;
                        i7 = i4;
                        i6 = i3;
                        break;
                    case 20:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 20);
                        i8 |= 1048576;
                        i3 = i6;
                        i4 = i7;
                        i7 = i4;
                        i6 = i3;
                        break;
                    case 21:
                        i8 |= 2097152;
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 21);
                        i3 = i6;
                        i4 = i7;
                        i7 = i4;
                        i6 = i3;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            zDecodeBooleanElement = zDecodeBooleanElement4;
            investPlatformLogo = investPlatformLogo3;
            list = list7;
            rewardCryptos = rewardCryptos3;
            i = i8;
            list2 = list9;
            backgroundImage = backgroundImage3;
            list3 = list8;
            pointsInfo = pointsInfo3;
            str = strDecodeStringElement11;
            str2 = strDecodeStringElement12;
            str3 = strDecodeStringElement13;
            strDecodeStringElement = strDecodeStringElement14;
            str4 = strDecodeStringElement15;
            str5 = strDecodeStringElement18;
            str6 = strDecodeStringElement19;
            strDecodeStringElement2 = strDecodeStringElement20;
            z = zDecodeBooleanElement6;
            i2 = iDecodeIntElement2;
            aggregateItemRateType = aggregateItemRateType3;
            z2 = zDecodeBooleanElement5;
            str7 = strDecodeStringElement16;
            strDecodeStringElement3 = strDecodeStringElement17;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new AggregateItem(i, backgroundImage, z2, i2, strDecodeStringElement2, str6, str5, strDecodeStringElement3, aggregateItemRateType, str, str2, z, list3, investPlatformLogo, list2, pointsInfo, rewardCryptos, list, str3, str7, str4, zDecodeBooleanElement, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull AggregateItem aggregateItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(aggregateItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        AggregateItem.AEQbTJ(aggregateItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
