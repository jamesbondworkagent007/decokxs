package com.okinc.unify_trade.biz;

import androidx.constraintlayout.core.motion.utils.TypedValues;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class RecurringOrderData$$serializer implements GeneratedSerializer<RecurringOrderData> {
    public static final int $stable;
    public static final RecurringOrderData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RecurringOrderData$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RecurringOrderData$$serializer recurringOrderData$$serializer = new RecurringOrderData$$serializer();
        INSTANCE = recurringOrderData$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.unify_trade.biz.RecurringOrderData", recurringOrderData$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("recurringList", true);
        pluginGeneratedSerialDescriptor.addElement("stgyName", true);
        pluginGeneratedSerialDescriptor.addElement(TypedValues.CycleType.S_WAVE_PERIOD, true);
        pluginGeneratedSerialDescriptor.addElement("recurringDay", true);
        pluginGeneratedSerialDescriptor.addElement("recurringTime", true);
        pluginGeneratedSerialDescriptor.addElement("recurringHour", true);
        pluginGeneratedSerialDescriptor.addElement("timeZone", true);
        pluginGeneratedSerialDescriptor.addElement("amt", true);
        pluginGeneratedSerialDescriptor.addElement("investCcy", true);
        pluginGeneratedSerialDescriptor.addElement("tdMode", true);
        pluginGeneratedSerialDescriptor.addElement("sourceAlgoId", true);
        pluginGeneratedSerialDescriptor.addElement("tradeQuoteCcy", true);
        pluginGeneratedSerialDescriptor.addElement("availableAccountList", true);
        pluginGeneratedSerialDescriptor.addElement("recurringTimeType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = RecurringOrderData.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(kSerializerArr[0]);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{nullable, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[12]), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RecurringOrderData deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        int i;
        List list;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        Integer num;
        String str11;
        List list2;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = RecurringOrderData.$childSerializers;
        String str19 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            String str27 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, null);
            String str28 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str29 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            String str30 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            list = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], null);
            str10 = str30;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, null);
            str2 = str29;
            str7 = str28;
            str6 = str26;
            str = str24;
            list2 = list3;
            str9 = str27;
            str4 = str21;
            str8 = str23;
            str3 = str22;
            str11 = str20;
            str5 = str25;
            i = 16383;
        } else {
            int i2 = 13;
            boolean z = true;
            String str31 = null;
            String str32 = null;
            String str33 = null;
            String str34 = null;
            Integer num2 = null;
            List list4 = null;
            String str35 = null;
            String str36 = null;
            String str37 = null;
            String str38 = null;
            String str39 = null;
            List list5 = null;
            int i3 = 0;
            str = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        str12 = str31;
                        str13 = str19;
                        str14 = str36;
                        str15 = str37;
                        str16 = str38;
                        str17 = str39;
                        z = false;
                        str31 = str12;
                        str39 = str17;
                        str38 = str16;
                        str37 = str15;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 0:
                        str12 = str31;
                        str13 = str19;
                        str14 = str36;
                        str15 = str37;
                        str16 = str38;
                        str17 = str39;
                        list5 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], list5);
                        i3 |= 1;
                        str31 = str12;
                        str39 = str17;
                        str38 = str16;
                        str37 = str15;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 1:
                        str13 = str19;
                        str14 = str36;
                        str15 = str37;
                        str16 = str38;
                        i3 |= 2;
                        str31 = str31;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str39);
                        str39 = str17;
                        str38 = str16;
                        str37 = str15;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 2:
                        str13 = str19;
                        str14 = str36;
                        str15 = str37;
                        str16 = str38;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str31);
                        i3 |= 4;
                        str17 = str39;
                        str39 = str17;
                        str38 = str16;
                        str37 = str15;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 3:
                        str13 = str19;
                        str35 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str35);
                        i3 |= 8;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 4:
                        str13 = str19;
                        str14 = str36;
                        str38 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str38);
                        i3 |= 16;
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 5:
                        str13 = str19;
                        str14 = str36;
                        i3 |= 32;
                        str = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str);
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 6:
                        str13 = str19;
                        str14 = str36;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str37);
                        i3 |= 64;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 7:
                        str13 = str19;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str36);
                        i3 |= 128;
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 8:
                        str13 = str19;
                        i3 |= 256;
                        str14 = str36;
                        str32 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str32);
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 9:
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str19);
                        i3 |= 512;
                        str14 = str36;
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 10:
                        str13 = str19;
                        i3 |= 1024;
                        str14 = str36;
                        str33 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str33);
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 11:
                        str13 = str19;
                        i3 |= 2048;
                        str14 = str36;
                        str34 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str34);
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 12:
                        i3 |= 4096;
                        list4 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, kSerializerArr[12], list4);
                        str13 = str19;
                        str14 = str36;
                        str18 = str37;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    case 13:
                        Integer num3 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, IntSerializer.INSTANCE, num2);
                        str13 = str19;
                        i3 |= 8192;
                        str14 = str36;
                        str18 = str37;
                        num2 = num3;
                        str37 = str18;
                        str36 = str14;
                        str19 = str13;
                        i2 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str2 = str33;
            i = i3;
            list = list4;
            str3 = str35;
            str4 = str31;
            str5 = str37;
            str6 = str36;
            str7 = str19;
            str8 = str38;
            str9 = str32;
            str10 = str34;
            num = num2;
            str11 = str39;
            list2 = list5;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RecurringOrderData(i, list2, str11, str4, str3, str8, str, str5, str6, str9, str7, str2, str10, list, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RecurringOrderData recurringOrderData) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(recurringOrderData, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RecurringOrderData.write$Self$OKTradeCore_trade_core(recurringOrderData, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
