package com.okinc.okex.center.ui.displaymodels;

import com.okinc.okex.center.bean.CoachMarkBean;
import com.okinc.okex.center.bean.CoachMarkBean$$serializer;
import com.okinc.okex.center.bean.HighlightBean;
import com.okinc.okex.center.bean.HighlightBean$$serializer;
import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import com.okinc.okex.center.bean.enums.TransactionType;
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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class TransactionDisplayModel$$serializer implements GeneratedSerializer<TransactionDisplayModel> {
    public static final int $stable;
    public static final TransactionDisplayModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private TransactionDisplayModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TransactionDisplayModel$$serializer transactionDisplayModel$$serializer = new TransactionDisplayModel$$serializer();
        INSTANCE = transactionDisplayModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okex.center.ui.displaymodels.TransactionDisplayModel", transactionDisplayModel$$serializer, 20);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("transactionType", true);
        pluginGeneratedSerialDescriptor.addElement("displayAmount", true);
        pluginGeneratedSerialDescriptor.addElement("displayAmountHeader", true);
        pluginGeneratedSerialDescriptor.addElement("displayAmountFullColour", true);
        pluginGeneratedSerialDescriptor.addElement("currencyId", true);
        pluginGeneratedSerialDescriptor.addElement("displayDescription", true);
        pluginGeneratedSerialDescriptor.addElement("statusValue", true);
        pluginGeneratedSerialDescriptor.addElement("displayStatus", true);
        pluginGeneratedSerialDescriptor.addElement("displayDateTime", true);
        pluginGeneratedSerialDescriptor.addElement("contextualCause", true);
        pluginGeneratedSerialDescriptor.addElement("contextualIconUrl", true);
        pluginGeneratedSerialDescriptor.addElement("transactionTag", true);
        pluginGeneratedSerialDescriptor.addElement("displayTransactionTag", true);
        pluginGeneratedSerialDescriptor.addElement("transactionBanners", true);
        pluginGeneratedSerialDescriptor.addElement("coachMarkBean", true);
        pluginGeneratedSerialDescriptor.addElement("highlightBean", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("labelColor", true);
        pluginGeneratedSerialDescriptor.addElement("displayDate", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = TransactionDisplayModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, kSerializerArr[1], stringSerializer, stringSerializer, BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, stringSerializer, kSerializerArr[12], stringSerializer, kSerializerArr[14], BuiltinSerializersKt.getNullable(CoachMarkBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(HighlightBean$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final TransactionDisplayModel deserialize(@NotNull Decoder decoder) {
        Integer num;
        boolean z;
        String str;
        String str2;
        TransactionType transactionType;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        CoachMarkBean coachMarkBean;
        TransactionTagLabel transactionTagLabel;
        List list;
        String strDecodeStringElement;
        String str12;
        HighlightBean highlightBean;
        int i;
        Integer num2;
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = TransactionDisplayModel.$childSerializers;
        int i4 = 10;
        int i5 = 9;
        int i6 = 8;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            TransactionType transactionType2 = (TransactionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], null);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
            Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, null);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 8);
            String strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 9);
            String strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
            TransactionTagLabel transactionTagLabel2 = (TransactionTagLabel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            String strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], null);
            CoachMarkBean coachMarkBean2 = (CoachMarkBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, CoachMarkBean$$serializer.INSTANCE, null);
            HighlightBean highlightBean2 = (HighlightBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, HighlightBean$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, stringSerializer, null);
            str2 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, stringSerializer, null);
            strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 19);
            str6 = strDecodeStringElement11;
            transactionType = transactionType2;
            str5 = strDecodeStringElement9;
            str8 = strDecodeStringElement8;
            str7 = strDecodeStringElement10;
            str = str13;
            highlightBean = highlightBean2;
            coachMarkBean = coachMarkBean2;
            list = list2;
            transactionTagLabel = transactionTagLabel2;
            str11 = strDecodeStringElement3;
            str12 = strDecodeStringElement2;
            str4 = strDecodeStringElement7;
            z = zDecodeBooleanElement;
            str10 = strDecodeStringElement4;
            str3 = strDecodeStringElement6;
            str9 = strDecodeStringElement5;
            num = num3;
            i = 1048575;
        } else {
            int i7 = 19;
            HighlightBean highlightBean3 = null;
            CoachMarkBean coachMarkBean3 = null;
            TransactionTagLabel transactionTagLabel3 = null;
            List list3 = null;
            String strDecodeStringElement12 = null;
            String strDecodeStringElement13 = null;
            String strDecodeStringElement14 = null;
            String strDecodeStringElement15 = null;
            String strDecodeStringElement16 = null;
            String strDecodeStringElement17 = null;
            String strDecodeStringElement18 = null;
            String strDecodeStringElement19 = null;
            String strDecodeStringElement20 = null;
            String strDecodeStringElement21 = null;
            Integer num4 = null;
            String strDecodeStringElement22 = null;
            TransactionType transactionType3 = null;
            boolean z2 = true;
            int i8 = 0;
            String str14 = null;
            boolean zDecodeBooleanElement2 = false;
            String str15 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        num2 = num4;
                        z2 = false;
                        num4 = num2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 0:
                        num2 = num4;
                        strDecodeStringElement22 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i8 |= 1;
                        num4 = num2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 1:
                        num2 = num4;
                        i8 |= 2;
                        transactionType3 = (TransactionType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], transactionType3);
                        num4 = num2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        i5 = 9;
                        break;
                    case 2:
                        strDecodeStringElement21 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i8 |= 4;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 3:
                        strDecodeStringElement20 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i8 |= 8;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 4:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 4);
                        i8 |= 16;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 5:
                        num4 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, num4);
                        i8 |= 32;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 6:
                        strDecodeStringElement19 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 6);
                        i8 |= 64;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 7:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        i8 |= 128;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 8:
                        strDecodeStringElement13 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i6);
                        i8 |= 256;
                        i7 = 19;
                        break;
                    case 9:
                        strDecodeStringElement18 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i5);
                        i8 |= 512;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 10:
                        strDecodeStringElement14 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i4);
                        i8 |= 1024;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 11:
                        strDecodeStringElement17 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i8 |= 2048;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 12:
                        transactionTagLabel3 = (TransactionTagLabel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 12, kSerializerArr[12], transactionTagLabel3);
                        i2 = i8 | 4096;
                        i8 = i2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 13:
                        strDecodeStringElement15 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 13);
                        i8 |= 8192;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 14:
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 14, kSerializerArr[14], list3);
                        i8 |= 16384;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 15:
                        coachMarkBean3 = (CoachMarkBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, CoachMarkBean$$serializer.INSTANCE, coachMarkBean3);
                        i3 = 32768;
                        i2 = i3 | i8;
                        i8 = i2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 16:
                        highlightBean3 = (HighlightBean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, HighlightBean$$serializer.INSTANCE, highlightBean3);
                        i3 = 65536;
                        i2 = i3 | i8;
                        i8 = i2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 17:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, StringSerializer.INSTANCE, str14);
                        i3 = 131072;
                        i2 = i3 | i8;
                        i8 = i2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 18:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 18, StringSerializer.INSTANCE, str15);
                        i3 = 262144;
                        i2 = i3 | i8;
                        i8 = i2;
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    case 19:
                        i8 |= 524288;
                        strDecodeStringElement16 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i7);
                        i7 = 19;
                        i6 = 8;
                        i4 = 10;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            num = num4;
            z = zDecodeBooleanElement2;
            str = str14;
            str2 = str15;
            transactionType = transactionType3;
            str3 = strDecodeStringElement12;
            str4 = strDecodeStringElement13;
            str5 = strDecodeStringElement14;
            str6 = strDecodeStringElement15;
            str7 = strDecodeStringElement17;
            str8 = strDecodeStringElement18;
            str9 = strDecodeStringElement19;
            str10 = strDecodeStringElement20;
            str11 = strDecodeStringElement21;
            coachMarkBean = coachMarkBean3;
            transactionTagLabel = transactionTagLabel3;
            list = list3;
            strDecodeStringElement = strDecodeStringElement16;
            str12 = strDecodeStringElement22;
            highlightBean = highlightBean3;
            i = i8;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new TransactionDisplayModel(i, str12, transactionType, str11, str10, z, num, str9, str3, str4, str8, str5, str7, transactionTagLabel, str6, list, coachMarkBean, highlightBean, str, str2, strDecodeStringElement, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull TransactionDisplayModel transactionDisplayModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(transactionDisplayModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        TransactionDisplayModel.write$Self$OKSupport_support_impl(transactionDisplayModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
