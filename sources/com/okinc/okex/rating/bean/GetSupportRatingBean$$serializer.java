package com.okinc.okex.rating.bean;

import com.okinc.biz.model.RatingDisplayStatus;
import com.okinc.okex.rating.bean.GetSupportRatingBean;
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
public final /* synthetic */ class GetSupportRatingBean$$serializer implements GeneratedSerializer<GetSupportRatingBean> {
    public static final int $stable;
    public static final GetSupportRatingBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GetSupportRatingBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GetSupportRatingBean$$serializer getSupportRatingBean$$serializer = new GetSupportRatingBean$$serializer();
        INSTANCE = getSupportRatingBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.rating.bean.GetSupportRatingBean", getSupportRatingBean$$serializer, 12);
        pluginGeneratedSerialDescriptor.addElement("appLayoutType", true);
        pluginGeneratedSerialDescriptor.addElement("bizType", true);
        pluginGeneratedSerialDescriptor.addElement("checkbox", true);
        pluginGeneratedSerialDescriptor.addElement("fullLayout", true);
        pluginGeneratedSerialDescriptor.addElement("halfLayout", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("labelsWithStarRating", true);
        pluginGeneratedSerialDescriptor.addElement("labelsWithoutStarRating", true);
        pluginGeneratedSerialDescriptor.addElement("moduleTitle", true);
        pluginGeneratedSerialDescriptor.addElement("moduleType", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("genericRequiredFeedbackContent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = GetSupportRatingBean.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[0]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        GetSupportRatingBean$Layout$$serializer getSupportRatingBean$Layout$$serializer = GetSupportRatingBean$Layout$$serializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, BuiltinSerializersKt.getNullable(getSupportRatingBean$Layout$$serializer), BuiltinSerializersKt.getNullable(getSupportRatingBean$Layout$$serializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[6]), BuiltinSerializersKt.getNullable(GetSupportRatingBean$Label$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[10]), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GetSupportRatingBean deserialize(@NotNull Decoder decoder) {
        String str;
        GetSupportRatingBean.Label label;
        String str2;
        RatingDisplayStatus ratingDisplayStatus;
        Long l;
        String str3;
        String str4;
        String str5;
        int i;
        GetSupportRatingBean.AppLayoutType appLayoutType;
        GetSupportRatingBean.Layout layout;
        GetSupportRatingBean.Layout layout2;
        List list;
        KSerializer[] kSerializerArr;
        Long l2;
        String str6;
        String str7;
        Long l3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = GetSupportRatingBean.$childSerializers;
        int i2 = 9;
        int i3 = 8;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            GetSupportRatingBean.AppLayoutType appLayoutType2 = (GetSupportRatingBean.AppLayoutType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr2[0], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            str3 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            GetSupportRatingBean$Layout$$serializer getSupportRatingBean$Layout$$serializer = GetSupportRatingBean$Layout$$serializer.INSTANCE;
            GetSupportRatingBean.Layout layout3 = (GetSupportRatingBean.Layout) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, getSupportRatingBean$Layout$$serializer, null);
            GetSupportRatingBean.Layout layout4 = (GetSupportRatingBean.Layout) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, getSupportRatingBean$Layout$$serializer, null);
            Long l4 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], null);
            GetSupportRatingBean.Label label2 = (GetSupportRatingBean.Label) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, GetSupportRatingBean$Label$$serializer.INSTANCE, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            ratingDisplayStatus = (RatingDisplayStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], null);
            str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            str2 = str11;
            label = label2;
            str4 = str10;
            list = list2;
            appLayoutType = appLayoutType2;
            layout2 = layout3;
            i = 4095;
            layout = layout4;
            str5 = str9;
            l = l4;
        } else {
            int i4 = 11;
            List list3 = null;
            String str12 = null;
            GetSupportRatingBean.Label label3 = null;
            String str13 = null;
            GetSupportRatingBean.Layout layout5 = null;
            Long l5 = null;
            String str14 = null;
            String str15 = null;
            GetSupportRatingBean.AppLayoutType appLayoutType3 = null;
            boolean z = true;
            int i5 = 0;
            RatingDisplayStatus ratingDisplayStatus2 = null;
            GetSupportRatingBean.Layout layout6 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        l2 = l5;
                        str6 = str14;
                        str7 = str15;
                        z = false;
                        kSerializerArr2 = kSerializerArr;
                        str14 = str6;
                        str15 = str7;
                        l5 = l2;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 0:
                        l2 = l5;
                        str6 = str14;
                        str7 = str15;
                        kSerializerArr = kSerializerArr2;
                        i5 |= 1;
                        appLayoutType3 = (GetSupportRatingBean.AppLayoutType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr2[0], appLayoutType3);
                        kSerializerArr2 = kSerializerArr;
                        str14 = str6;
                        str15 = str7;
                        l5 = l2;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 1:
                        l2 = l5;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str15);
                        i5 |= 2;
                        l5 = l2;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 2:
                        l3 = l5;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str14);
                        i5 |= 4;
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 3:
                        l3 = l5;
                        i5 |= 8;
                        layout6 = (GetSupportRatingBean.Layout) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, GetSupportRatingBean$Layout$$serializer.INSTANCE, layout6);
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 4:
                        l3 = l5;
                        i5 |= 16;
                        layout5 = (GetSupportRatingBean.Layout) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GetSupportRatingBean$Layout$$serializer.INSTANCE, layout5);
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 5:
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, l5);
                        i5 |= 32;
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 6:
                        i5 |= 64;
                        l3 = l5;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr2[6], list3);
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 7:
                        i5 |= 128;
                        label3 = (GetSupportRatingBean.Label) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, GetSupportRatingBean$Label$$serializer.INSTANCE, label3);
                        l3 = l5;
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 8:
                        i5 |= 256;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str12);
                        l3 = l5;
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 9:
                        i5 |= 512;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, StringSerializer.INSTANCE, str13);
                        l3 = l5;
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 10:
                        i5 |= 1024;
                        ratingDisplayStatus2 = (RatingDisplayStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, kSerializerArr2[10], ratingDisplayStatus2);
                        l3 = l5;
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    case 11:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str8);
                        i5 |= 2048;
                        l3 = l5;
                        l5 = l3;
                        i4 = 11;
                        i2 = 9;
                        i3 = 8;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str8;
            label = label3;
            str2 = str13;
            ratingDisplayStatus = ratingDisplayStatus2;
            l = l5;
            str3 = str14;
            str4 = str12;
            str5 = str15;
            i = i5;
            appLayoutType = appLayoutType3;
            layout = layout5;
            layout2 = layout6;
            list = list3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GetSupportRatingBean(i, appLayoutType, str5, str3, layout2, layout, l, list, label, str4, str2, ratingDisplayStatus, str, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GetSupportRatingBean getSupportRatingBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(getSupportRatingBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GetSupportRatingBean.write$Self$OKSupport_support_impl(getSupportRatingBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
