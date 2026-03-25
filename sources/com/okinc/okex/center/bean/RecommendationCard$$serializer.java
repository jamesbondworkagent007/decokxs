package com.okinc.okex.center.bean;

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

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class RecommendationCard$$serializer implements GeneratedSerializer<RecommendationCard> {
    public static final int $stable;
    public static final RecommendationCard$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecommendationCard$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecommendationCard$$serializer recommendationCard$$serializer = new RecommendationCard$$serializer();
        INSTANCE = recommendationCard$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.RecommendationCard", recommendationCard$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("dataTrackingKey", true);
        pluginGeneratedSerialDescriptor.addElement("iconBright", true);
        pluginGeneratedSerialDescriptor.addElement("iconDark", true);
        pluginGeneratedSerialDescriptor.addElement("scenario", true);
        pluginGeneratedSerialDescriptor.addElement("slug", true);
        pluginGeneratedSerialDescriptor.addElement("tags", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("titleListMode", true);
        pluginGeneratedSerialDescriptor.addElement("description", true);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("typeIconBright", true);
        pluginGeneratedSerialDescriptor.addElement("typeIconDark", true);
        pluginGeneratedSerialDescriptor.addElement("labels", true);
        pluginGeneratedSerialDescriptor.addElement("createdDate", true);
        pluginGeneratedSerialDescriptor.addElement("primaryAction", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RecommendationCard.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[13]), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(SelfServiceToolBean$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecommendationCard deserialize(@NotNull Decoder decoder) {
        String str;
        List list;
        String str2;
        SelfServiceToolBean selfServiceToolBean;
        String str3;
        List list2;
        Long l;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        String str9;
        String str10;
        String str11;
        String str12;
        Long l2;
        String str13;
        String str14;
        String str15;
        Long l3;
        int i2;
        String str16;
        String str17;
        Long l4;
        String str18;
        String str19;
        String str20;
        String str21;
        KSerializer[] kSerializerArr;
        String str22;
        String str23;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = RecommendationCard.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            List list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr2[13], null);
            l = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, null);
            str2 = str35;
            selfServiceToolBean = (SelfServiceToolBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, SelfServiceToolBean$$serializer.INSTANCE, null);
            list2 = list3;
            str11 = str32;
            str6 = str33;
            str12 = str25;
            list = list4;
            str5 = str34;
            str4 = str30;
            str9 = str29;
            str3 = str28;
            str10 = str26;
            i = 65535;
            str8 = str27;
            str7 = str24;
            str = str31;
        } else {
            int i3 = 15;
            boolean z = true;
            String str36 = null;
            Long l5 = null;
            List list5 = null;
            String str37 = null;
            SelfServiceToolBean selfServiceToolBean2 = null;
            String str38 = null;
            String str39 = null;
            String str40 = null;
            List list6 = null;
            String str41 = null;
            String str42 = null;
            String str43 = null;
            String str44 = null;
            String str45 = null;
            String str46 = null;
            int i4 = 0;
            String str47 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str16 = str36;
                        str17 = str47;
                        l4 = l5;
                        str18 = str41;
                        str19 = str42;
                        str20 = str43;
                        str21 = str44;
                        kSerializerArr = kSerializerArr2;
                        str22 = str46;
                        str23 = str45;
                        z = false;
                        str42 = str19;
                        l5 = l4;
                        str44 = str21;
                        str43 = str20;
                        str47 = str17;
                        str36 = str16;
                        str45 = str23;
                        str46 = str22;
                        kSerializerArr2 = kSerializerArr;
                        str41 = str18;
                        i3 = 15;
                        break;
                    case 0:
                        str16 = str36;
                        str17 = str47;
                        l4 = l5;
                        str18 = str41;
                        str19 = str42;
                        str20 = str43;
                        str21 = str44;
                        kSerializerArr = kSerializerArr2;
                        String str48 = str46;
                        str23 = str45;
                        str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str48);
                        i4 |= 1;
                        str42 = str19;
                        l5 = l4;
                        str44 = str21;
                        str43 = str20;
                        str47 = str17;
                        str36 = str16;
                        str45 = str23;
                        str46 = str22;
                        kSerializerArr2 = kSerializerArr;
                        str41 = str18;
                        i3 = 15;
                        break;
                    case 1:
                        str16 = str36;
                        str17 = str47;
                        l4 = l5;
                        str18 = str41;
                        str19 = str42;
                        str20 = str43;
                        kSerializerArr = kSerializerArr2;
                        str21 = str44;
                        str45 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str45);
                        i4 |= 2;
                        str22 = str46;
                        str23 = str45;
                        str42 = str19;
                        l5 = l4;
                        str44 = str21;
                        str43 = str20;
                        str47 = str17;
                        str36 = str16;
                        str45 = str23;
                        str46 = str22;
                        kSerializerArr2 = kSerializerArr;
                        str41 = str18;
                        i3 = 15;
                        break;
                    case 2:
                        str16 = str36;
                        str17 = str47;
                        l4 = l5;
                        str18 = str41;
                        str19 = str42;
                        kSerializerArr = kSerializerArr2;
                        str20 = str43;
                        str44 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str44);
                        i4 |= 4;
                        str21 = str44;
                        str22 = str46;
                        str23 = str45;
                        str42 = str19;
                        l5 = l4;
                        str44 = str21;
                        str43 = str20;
                        str47 = str17;
                        str36 = str16;
                        str45 = str23;
                        str46 = str22;
                        kSerializerArr2 = kSerializerArr;
                        str41 = str18;
                        i3 = 15;
                        break;
                    case 3:
                        str16 = str36;
                        str17 = str47;
                        l4 = l5;
                        str19 = str42;
                        String str49 = str41;
                        kSerializerArr = kSerializerArr2;
                        i4 |= 8;
                        str20 = str43;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str49);
                        str21 = str44;
                        str22 = str46;
                        str23 = str45;
                        str42 = str19;
                        l5 = l4;
                        str44 = str21;
                        str43 = str20;
                        str47 = str17;
                        str36 = str16;
                        str45 = str23;
                        str46 = str22;
                        kSerializerArr2 = kSerializerArr;
                        str41 = str18;
                        i3 = 15;
                        break;
                    case 4:
                        str16 = str36;
                        str17 = str47;
                        l4 = l5;
                        str19 = str42;
                        i4 |= 16;
                        str20 = str43;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str38);
                        str18 = str41;
                        str21 = str44;
                        kSerializerArr = kSerializerArr2;
                        str22 = str46;
                        str23 = str45;
                        str42 = str19;
                        l5 = l4;
                        str44 = str21;
                        str43 = str20;
                        str47 = str17;
                        str36 = str16;
                        str45 = str23;
                        str46 = str22;
                        kSerializerArr2 = kSerializerArr;
                        str41 = str18;
                        i3 = 15;
                        break;
                    case 5:
                        str40 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str40);
                        i4 |= 32;
                        l5 = l5;
                        str47 = str47;
                        str36 = str36;
                        i3 = 15;
                        break;
                    case 6:
                        l2 = l5;
                        str13 = str42;
                        i4 |= 64;
                        list6 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], list6);
                        str47 = str47;
                        str36 = str36;
                        Long l6 = l2;
                        str15 = str13;
                        l5 = l6;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 7:
                        str14 = str36;
                        l2 = l5;
                        str13 = str42;
                        str43 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str43);
                        i4 |= 128;
                        str47 = str47;
                        str36 = str14;
                        Long l62 = l2;
                        str15 = str13;
                        l5 = l62;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 8:
                        l2 = l5;
                        str14 = str36;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str42);
                        i4 |= 256;
                        str36 = str14;
                        Long l622 = l2;
                        str15 = str13;
                        l5 = l622;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 9:
                        l3 = l5;
                        i4 |= 512;
                        str39 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str39);
                        l5 = l3;
                        str15 = str42;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 10:
                        l3 = l5;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str36);
                        i2 = i4 | 1024;
                        i4 = i2;
                        l5 = l3;
                        str15 = str42;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 11:
                        l3 = l5;
                        str47 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str47);
                        i2 = i4 | 2048;
                        i4 = i2;
                        l5 = l3;
                        str15 = str42;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 12:
                        l3 = l5;
                        i4 |= 4096;
                        str37 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str37);
                        l5 = l3;
                        str15 = str42;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 13:
                        i4 |= 8192;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, kSerializerArr2[13], list5);
                        str15 = str42;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 14:
                        l5 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, LongSerializer.INSTANCE, l5);
                        i4 |= 16384;
                        str15 = str42;
                        str42 = str15;
                        i3 = 15;
                        break;
                    case 15:
                        i4 |= 32768;
                        selfServiceToolBean2 = (SelfServiceToolBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, SelfServiceToolBean$$serializer.INSTANCE, selfServiceToolBean2);
                        str15 = str42;
                        str42 = str15;
                        i3 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str50 = str41;
            str = str42;
            list = list5;
            str2 = str37;
            selfServiceToolBean = selfServiceToolBean2;
            str3 = str38;
            list2 = list6;
            l = l5;
            str4 = str43;
            str5 = str47;
            str6 = str36;
            str7 = str46;
            str8 = str50;
            i = i4;
            str9 = str40;
            str10 = str44;
            str11 = str39;
            str12 = str45;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecommendationCard(i, str7, str12, str10, str8, str3, str9, list2, str4, str, str11, str6, str5, str2, list, l, selfServiceToolBean, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecommendationCard recommendationCard) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recommendationCard, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecommendationCard.write$Self$OKSupport_support_impl(recommendationCard, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
