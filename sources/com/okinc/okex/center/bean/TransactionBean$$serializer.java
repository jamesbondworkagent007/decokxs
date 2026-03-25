package com.okinc.okex.center.bean;

import com.okinc.okex.center.bean.enums.TransactionType;
import com.okinc.p2p.api.OtcExtraKeys;
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
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class TransactionBean$$serializer implements GeneratedSerializer<TransactionBean> {
    public static final int $stable;
    public static final TransactionBean$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TransactionBean$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransactionBean$$serializer transactionBean$$serializer = new TransactionBean$$serializer();
        INSTANCE = transactionBean$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.bean.TransactionBean", transactionBean$$serializer, 17);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("transactionType", true);
        pluginGeneratedSerialDescriptor.addElement(OtcExtraKeys.AMOUNT, true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("currency", true);
        pluginGeneratedSerialDescriptor.addElement("quoteAmount", true);
        pluginGeneratedSerialDescriptor.addElement("quoteCurrency", true);
        pluginGeneratedSerialDescriptor.addElement("displayedDescription", true);
        pluginGeneratedSerialDescriptor.addElement("status", true);
        pluginGeneratedSerialDescriptor.addElement("displayedStatus", true);
        pluginGeneratedSerialDescriptor.addElement("createdDate", true);
        pluginGeneratedSerialDescriptor.addElement("sign", true);
        pluginGeneratedSerialDescriptor.addElement("labels", true);
        pluginGeneratedSerialDescriptor.addElement("coachMark", true);
        pluginGeneratedSerialDescriptor.addElement("highlight", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("labelColor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = TransactionBean.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, BuiltinSerializersKt.getNullable(kSerializerArr[1]), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[12]), BuiltinSerializersKt.getNullable(CoachMarkBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(HighlightBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TransactionBean deserialize(@NotNull Decoder decoder) {
        HighlightBean highlightBean;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l;
        String str9;
        String str10;
        TransactionType transactionType;
        List list;
        CoachMarkBean coachMarkBean;
        Integer num;
        Integer num2;
        int i;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        Long l2;
        Integer num3;
        String str18;
        int i2;
        String str19;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TransactionBean.$childSerializers;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            TransactionType transactionType2 = (TransactionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            Integer num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, intSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Long l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, null);
            Integer num5 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, intSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            CoachMarkBean coachMarkBean2 = (CoachMarkBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, CoachMarkBean$$serializer.INSTANCE, null);
            HighlightBean highlightBean2 = (HighlightBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, HighlightBean$$serializer.INSTANCE, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, stringSerializer, null);
            highlightBean = highlightBean2;
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, stringSerializer, null);
            str3 = str27;
            str8 = str26;
            str4 = str22;
            str7 = str25;
            coachMarkBean = coachMarkBean2;
            list = list2;
            str6 = strDecodeStringElement;
            l = l3;
            str10 = str24;
            str = str23;
            num2 = num4;
            transactionType = transactionType2;
            i = 131071;
            str5 = str21;
            str9 = str20;
            num = num5;
        } else {
            int i4 = 16;
            boolean z = true;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            List list3 = null;
            CoachMarkBean coachMarkBean3 = null;
            HighlightBean highlightBean3 = null;
            String str31 = null;
            String str32 = null;
            Integer num6 = null;
            String strDecodeStringElement2 = null;
            String str33 = null;
            String str34 = null;
            String str35 = null;
            Integer num7 = null;
            String str36 = null;
            TransactionType transactionType3 = null;
            int i5 = 0;
            Long l4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str11 = str28;
                        str12 = str29;
                        str13 = str30;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        str17 = str36;
                        l2 = l4;
                        num3 = num7;
                        z = false;
                        str18 = str17;
                        str28 = str11;
                        num7 = num3;
                        str35 = str16;
                        str36 = str18;
                        str30 = str13;
                        str29 = str12;
                        str34 = str15;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 0:
                        str11 = str28;
                        str12 = str29;
                        str13 = str30;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        str17 = str36;
                        l2 = l4;
                        num3 = num7;
                        strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        str18 = str17;
                        str28 = str11;
                        num7 = num3;
                        str35 = str16;
                        str36 = str18;
                        str30 = str13;
                        str29 = str12;
                        str34 = str15;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 1:
                        str11 = str28;
                        str12 = str29;
                        str13 = str30;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        str17 = str36;
                        l2 = l4;
                        num3 = num7;
                        transactionType3 = (TransactionType) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionType3);
                        i5 |= 2;
                        str18 = str17;
                        str28 = str11;
                        num7 = num3;
                        str35 = str16;
                        str36 = str18;
                        str30 = str13;
                        str29 = str12;
                        str34 = str15;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 2:
                        str13 = str30;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        l2 = l4;
                        num3 = num7;
                        str12 = str29;
                        str36 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str36);
                        i2 = i5 | 4;
                        str28 = str28;
                        i5 = i2;
                        str18 = str36;
                        num7 = num3;
                        str35 = str16;
                        str36 = str18;
                        str30 = str13;
                        str29 = str12;
                        str34 = str15;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 3:
                        str13 = str30;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        l2 = l4;
                        num7 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, num7);
                        i2 = i5 | 8;
                        str12 = str29;
                        str28 = str28;
                        num3 = num7;
                        i5 = i2;
                        str18 = str36;
                        num7 = num3;
                        str35 = str16;
                        str36 = str18;
                        str30 = str13;
                        str29 = str12;
                        str34 = str15;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 4:
                        str13 = str30;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        l2 = l4;
                        str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str28);
                        i2 = i5 | 16;
                        str12 = str29;
                        num3 = num7;
                        i5 = i2;
                        str18 = str36;
                        num7 = num3;
                        str35 = str16;
                        str36 = str18;
                        str30 = str13;
                        str29 = str12;
                        str34 = str15;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 5:
                        str13 = str30;
                        str14 = str33;
                        str15 = str34;
                        str16 = str35;
                        l2 = l4;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str29);
                        i5 |= 32;
                        num3 = num7;
                        str18 = str36;
                        num7 = num3;
                        str35 = str16;
                        str36 = str18;
                        str30 = str13;
                        str29 = str12;
                        str34 = str15;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 6:
                        str14 = str33;
                        l2 = l4;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str31);
                        i5 |= 64;
                        str30 = str30;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 7:
                        str14 = str33;
                        l2 = l4;
                        i5 |= 128;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str35);
                        str30 = str30;
                        str19 = str34;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 8:
                        String str37 = str30;
                        String str38 = str33;
                        l2 = l4;
                        str14 = str38;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str34);
                        i5 |= 256;
                        str30 = str37;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 9:
                        String str39 = str30;
                        String str40 = str33;
                        l2 = l4;
                        i5 |= 512;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str40);
                        str30 = str39;
                        str19 = str34;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 10:
                        i5 |= 1024;
                        str30 = str30;
                        str14 = str33;
                        l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, l4);
                        str19 = str34;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 11:
                        i5 |= 2048;
                        num6 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, num6);
                        str30 = str30;
                        str14 = str33;
                        str19 = str34;
                        l2 = l4;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 12:
                        i5 |= 4096;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], list3);
                        str14 = str33;
                        str19 = str34;
                        l2 = l4;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 13:
                        i5 |= 8192;
                        coachMarkBean3 = (CoachMarkBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, CoachMarkBean$$serializer.INSTANCE, coachMarkBean3);
                        str14 = str33;
                        str19 = str34;
                        l2 = l4;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 14:
                        i5 |= 16384;
                        highlightBean3 = (HighlightBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, HighlightBean$$serializer.INSTANCE, highlightBean3);
                        str14 = str33;
                        str19 = str34;
                        l2 = l4;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 15:
                        str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, str30);
                        i3 = 32768;
                        i5 |= i3;
                        str14 = str33;
                        str19 = str34;
                        l2 = l4;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    case 16:
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str32);
                        i3 = 65536;
                        i5 |= i3;
                        str14 = str33;
                        str19 = str34;
                        l2 = l4;
                        str34 = str19;
                        l4 = l2;
                        i4 = 16;
                        str33 = str14;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            highlightBean = highlightBean3;
            str = str31;
            str2 = str32;
            str3 = str30;
            str4 = str29;
            str5 = str28;
            str6 = strDecodeStringElement2;
            str7 = str34;
            str8 = str33;
            l = l4;
            str9 = str36;
            str10 = str35;
            transactionType = transactionType3;
            list = list3;
            coachMarkBean = coachMarkBean3;
            num = num6;
            num2 = num7;
            i = i5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TransactionBean(i, str6, transactionType, str9, num2, str5, str4, str, str10, str7, str8, l, num, list, coachMarkBean, highlightBean, str3, str2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionBean transactionBean) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionBean, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TransactionBean.write$Self$OKSupport_support_impl(transactionBean, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
