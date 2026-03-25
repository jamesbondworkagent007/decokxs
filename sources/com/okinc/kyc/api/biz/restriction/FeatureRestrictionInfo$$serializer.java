package com.okinc.kyc.api.biz.restriction;

import com.appsflyer.AdRevenueScheme;
import com.okinc.kyc.api.biz.restriction.OKComplianceRestrictionService;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.unify_trade.biz.BotWebHook;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class FeatureRestrictionInfo$$serializer implements GeneratedSerializer<FeatureRestrictionInfo> {
    public static final int $stable;
    public static final FeatureRestrictionInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private FeatureRestrictionInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        FeatureRestrictionInfo$$serializer featureRestrictionInfo$$serializer = new FeatureRestrictionInfo$$serializer();
        INSTANCE = featureRestrictionInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.kyc.api.biz.restriction.FeatureRestrictionInfo", featureRestrictionInfo$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("content", true);
        pluginGeneratedSerialDescriptor.addElement(AdRevenueScheme.COUNTRY, true);
        pluginGeneratedSerialDescriptor.addElement("countryName", true);
        pluginGeneratedSerialDescriptor.addElement("feature", false);
        pluginGeneratedSerialDescriptor.addElement("hidden", true);
        pluginGeneratedSerialDescriptor.addElement("kycLevel", true);
        pluginGeneratedSerialDescriptor.addElement("provinceCode", true);
        pluginGeneratedSerialDescriptor.addElement(BotWebHook.KEY_ACTION, false);
        pluginGeneratedSerialDescriptor.addElement("province", true);
        pluginGeneratedSerialDescriptor.addElement("politStatus", true);
        pluginGeneratedSerialDescriptor.addElement("removeUserFlag", true);
        pluginGeneratedSerialDescriptor.addElement("restricted", true);
        pluginGeneratedSerialDescriptor.addElement("entityId", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.MODE, true);
        pluginGeneratedSerialDescriptor.addElement("crMarket", true);
        pluginGeneratedSerialDescriptor.addElement("isDebugMock", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = FeatureRestrictionInfo.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer kSerializer = kSerializerArr[3];
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(booleanSerializer);
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, kSerializer, nullable4, BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[7], BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[13]), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final FeatureRestrictionInfo deserialize(@NotNull Decoder decoder) {
        Long l;
        String str;
        String str2;
        Boolean bool;
        String str3;
        OKComplianceRestrictionService.FeatureAction featureAction;
        Integer num;
        Boolean bool2;
        OKComplianceRestrictionService.Feature feature;
        List list;
        Boolean bool3;
        Integer num2;
        String str4;
        Boolean bool4;
        String str5;
        int i;
        Boolean bool5;
        List list2;
        OKComplianceRestrictionService.Feature feature2;
        Boolean bool6;
        int i2;
        List list3;
        int i3;
        KSerializer[] kSerializerArr;
        Integer num3;
        Boolean bool7;
        List list4;
        OKComplianceRestrictionService.Feature feature3;
        String str6;
        Long l2;
        int i4;
        Boolean bool8;
        Boolean bool9;
        String str7;
        KSerializer[] kSerializerArr2;
        Integer num4;
        Boolean bool10;
        List list5;
        String str8;
        Boolean bool11;
        Boolean bool12;
        String str9;
        Long l3;
        int i5;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = FeatureRestrictionInfo.$childSerializers;
        Boolean bool13 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            OKComplianceRestrictionService.Feature feature4 = (OKComplianceRestrictionService.Feature) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr3[3], null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, intSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            OKComplianceRestrictionService.FeatureAction featureAction2 = (OKComplianceRestrictionService.FeatureAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr3[7], null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            Integer num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, intSerializer, null);
            Boolean bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            List list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], null);
            Boolean bool17 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, booleanSerializer, null);
            list = list6;
            str2 = str14;
            featureAction = featureAction2;
            feature = feature4;
            bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            i = 65535;
            bool2 = bool15;
            str3 = str12;
            num2 = num5;
            str5 = str13;
            bool5 = bool17;
            bool3 = bool16;
            num = num6;
            l = l4;
            str4 = str10;
            bool = bool14;
            str = str11;
        } else {
            int i6 = 0;
            boolean z = true;
            Integer num7 = null;
            Boolean bool18 = null;
            List list7 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            OKComplianceRestrictionService.FeatureAction featureAction3 = null;
            Integer num8 = null;
            OKComplianceRestrictionService.Feature feature5 = null;
            Boolean bool19 = null;
            Boolean bool20 = null;
            Boolean bool21 = null;
            String str18 = null;
            String str19 = null;
            Long l5 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr3;
                        num3 = num7;
                        bool7 = bool18;
                        list4 = list7;
                        feature3 = feature5;
                        str6 = str18;
                        l2 = l5;
                        i4 = i6;
                        bool8 = bool13;
                        bool9 = bool21;
                        str7 = str19;
                        z = false;
                        str18 = str6;
                        bool21 = bool9;
                        list7 = list4;
                        kSerializerArr3 = kSerializerArr;
                        num7 = num3;
                        str19 = str7;
                        bool13 = bool8;
                        l5 = l2;
                        i6 = i4;
                        feature5 = feature3;
                        bool18 = bool7;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        num4 = num7;
                        bool10 = bool18;
                        list5 = list7;
                        OKComplianceRestrictionService.Feature feature6 = feature5;
                        str8 = str18;
                        int i7 = i6;
                        bool11 = bool13;
                        bool12 = bool21;
                        Long l6 = l5;
                        str9 = str19;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, l6);
                        i5 = i7 | 1;
                        feature5 = feature6;
                        str18 = str8;
                        bool21 = bool12;
                        list7 = list5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str9;
                        bool13 = bool11;
                        l5 = l3;
                        i6 = i5;
                        bool18 = bool10;
                        num7 = num4;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        num4 = num7;
                        list5 = list7;
                        OKComplianceRestrictionService.Feature feature7 = feature5;
                        str8 = str18;
                        int i8 = i6;
                        bool11 = bool13;
                        bool12 = bool21;
                        bool10 = bool18;
                        i5 = i8 | 2;
                        feature5 = feature7;
                        l3 = l5;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str19);
                        str18 = str8;
                        bool21 = bool12;
                        list7 = list5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str9;
                        bool13 = bool11;
                        l5 = l3;
                        i6 = i5;
                        bool18 = bool10;
                        num7 = num4;
                        break;
                    case 2:
                        num4 = num7;
                        list5 = list7;
                        OKComplianceRestrictionService.Feature feature8 = feature5;
                        int i9 = i6;
                        bool11 = bool13;
                        bool12 = bool21;
                        kSerializerArr2 = kSerializerArr3;
                        bool10 = bool18;
                        i5 = i9 | 4;
                        feature5 = feature8;
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str18);
                        l3 = l5;
                        str9 = str19;
                        str18 = str8;
                        bool21 = bool12;
                        list7 = list5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str9;
                        bool13 = bool11;
                        l5 = l3;
                        i6 = i5;
                        bool18 = bool10;
                        num7 = num4;
                        break;
                    case 3:
                        num4 = num7;
                        list5 = list7;
                        OKComplianceRestrictionService.Feature feature9 = feature5;
                        int i10 = i6;
                        bool11 = bool13;
                        bool12 = bool21;
                        kSerializerArr2 = kSerializerArr3;
                        bool10 = bool18;
                        i5 = i10 | 8;
                        str8 = str18;
                        feature5 = (OKComplianceRestrictionService.Feature) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, kSerializerArr3[3], feature9);
                        l3 = l5;
                        str9 = str19;
                        str18 = str8;
                        bool21 = bool12;
                        list7 = list5;
                        kSerializerArr3 = kSerializerArr2;
                        str19 = str9;
                        bool13 = bool11;
                        l5 = l3;
                        i6 = i5;
                        bool18 = bool10;
                        num7 = num4;
                        break;
                    case 4:
                        list4 = list7;
                        OKComplianceRestrictionService.Feature feature10 = feature5;
                        int i11 = i6;
                        bool8 = bool13;
                        num3 = num7;
                        kSerializerArr = kSerializerArr3;
                        bool7 = bool18;
                        i4 = i11 | 16;
                        l2 = l5;
                        feature3 = feature10;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool21);
                        str6 = str18;
                        str7 = str19;
                        str18 = str6;
                        bool21 = bool9;
                        list7 = list4;
                        kSerializerArr3 = kSerializerArr;
                        num7 = num3;
                        str19 = str7;
                        bool13 = bool8;
                        l5 = l2;
                        i6 = i4;
                        feature5 = feature3;
                        bool18 = bool7;
                        break;
                    case 5:
                        List list8 = list7;
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num7);
                        bool13 = bool13;
                        feature5 = feature5;
                        i6 |= 32;
                        list7 = list8;
                        break;
                    case 6:
                        list2 = list7;
                        feature2 = feature5;
                        int i12 = i6;
                        bool6 = bool13;
                        i2 = i12 | 64;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str17);
                        list7 = list2;
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 7:
                        list2 = list7;
                        feature2 = feature5;
                        int i13 = i6;
                        bool6 = bool13;
                        i2 = i13 | 128;
                        featureAction3 = (OKComplianceRestrictionService.FeatureAction) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr3[7], featureAction3);
                        list7 = list2;
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 8:
                        feature2 = feature5;
                        int i14 = i6;
                        bool6 = bool13;
                        i2 = i14 | 256;
                        list7 = list7;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str16);
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 9:
                        feature2 = feature5;
                        int i15 = i6;
                        bool6 = bool13;
                        i2 = i15 | 512;
                        list7 = list7;
                        num8 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, IntSerializer.INSTANCE, num8);
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 10:
                        list3 = list7;
                        feature2 = feature5;
                        int i16 = i6;
                        bool6 = bool13;
                        i2 = i16 | 1024;
                        bool19 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool19);
                        list7 = list3;
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 11:
                        list3 = list7;
                        feature2 = feature5;
                        int i17 = i6;
                        bool6 = bool13;
                        bool18 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool18);
                        i3 = i17 | 2048;
                        i2 = i3;
                        list7 = list3;
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 12:
                        feature2 = feature5;
                        int i18 = i6;
                        bool6 = bool13;
                        list3 = list7;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str15);
                        i3 = i18 | 4096;
                        i2 = i3;
                        list7 = list3;
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 13:
                        feature2 = feature5;
                        int i19 = i6;
                        bool6 = bool13;
                        list7 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr3[13], list7);
                        i2 = i19 | 8192;
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 14:
                        feature2 = feature5;
                        int i20 = i6;
                        bool6 = bool13;
                        bool20 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, BooleanSerializer.INSTANCE, bool20);
                        i2 = i20 | 16384;
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    case 15:
                        feature2 = feature5;
                        i2 = i6 | 32768;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, bool13);
                        bool13 = bool6;
                        i6 = i2;
                        feature5 = feature2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool22 = bool18;
            OKComplianceRestrictionService.Feature feature11 = feature5;
            Long l7 = l5;
            String str20 = str19;
            l = l7;
            str = str18;
            str2 = str15;
            bool = bool21;
            str3 = str17;
            featureAction = featureAction3;
            num = num8;
            bool2 = bool19;
            feature = feature11;
            list = list7;
            bool3 = bool22;
            num2 = num7;
            str4 = str20;
            bool4 = bool13;
            str5 = str16;
            i = i6;
            bool5 = bool20;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new FeatureRestrictionInfo(i, l, str4, str, feature, bool, num2, str3, featureAction, str5, num, bool2, bool3, str2, list, bool5, bool4, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull FeatureRestrictionInfo featureRestrictionInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(featureRestrictionInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        FeatureRestrictionInfo.write$Self$OKFeatureRestriction_ok_feature_restriction_impl(featureRestrictionInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
