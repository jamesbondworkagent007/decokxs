package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.alibaba.sdk.android.oss.common.RequestParameters;
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

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class SubInput$$serializer implements GeneratedSerializer<SubInput> {
    public static final int $stable;
    public static final SubInput$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private SubInput$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SubInput$$serializer subInput$$serializer = new SubInput$$serializer();
        INSTANCE = subInput$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.SubInput", subInput$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("type", true);
        pluginGeneratedSerialDescriptor.addElement("label", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("hint", true);
        pluginGeneratedSerialDescriptor.addElement("placeholder", true);
        pluginGeneratedSerialDescriptor.addElement(RequestParameters.PREFIX, true);
        pluginGeneratedSerialDescriptor.addElement("suffix", true);
        pluginGeneratedSerialDescriptor.addElement("rules", false);
        pluginGeneratedSerialDescriptor.addElement("warningRule", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("isNumber", true);
        pluginGeneratedSerialDescriptor.addElement("precision", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = SubInput.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(kSerializerArr[8]);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(Rule$$serializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final SubInput deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Rule rule;
        List list;
        Boolean bool;
        Boolean bool2;
        Integer num;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        int i;
        KSerializer[] kSerializerArr;
        String str9;
        String str10;
        KSerializer[] kSerializerArr2;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = SubInput.$childSerializers;
        int i2 = 10;
        String str16 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            String str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            String str21 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String str22 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, stringSerializer, null);
            String str23 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            String str24 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, stringSerializer, null);
            List list2 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr3[8], null);
            Rule rule2 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Rule$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            list = list2;
            str8 = str24;
            rule = rule2;
            num = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, null);
            bool2 = bool3;
            bool = bool4;
            str = str21;
            str3 = str19;
            str4 = str20;
            str5 = str18;
            str7 = str22;
            str6 = str17;
            str2 = str23;
            i = 8191;
        } else {
            int i3 = 12;
            int i4 = 0;
            String str25 = null;
            Rule rule3 = null;
            String str26 = null;
            List list3 = null;
            Boolean bool5 = null;
            Boolean bool6 = null;
            Integer num2 = null;
            String str27 = null;
            String str28 = null;
            String str29 = null;
            String str30 = null;
            boolean z = true;
            String str31 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        str11 = str28;
                        str12 = str29;
                        String str32 = str27;
                        str13 = str25;
                        str14 = str30;
                        str15 = str32;
                        z = false;
                        str28 = str11;
                        str29 = str12;
                        kSerializerArr3 = kSerializerArr2;
                        i2 = 10;
                        i3 = 12;
                        String str33 = str15;
                        str30 = str14;
                        str25 = str13;
                        str27 = str33;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        String str34 = str27;
                        str11 = str28;
                        str12 = str29;
                        str13 = str25;
                        String str35 = str30;
                        str15 = str34;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str35);
                        i4 |= 1;
                        str28 = str11;
                        str29 = str12;
                        kSerializerArr3 = kSerializerArr2;
                        i2 = 10;
                        i3 = 12;
                        String str332 = str15;
                        str30 = str14;
                        str25 = str13;
                        str27 = str332;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        str11 = str28;
                        str12 = str29;
                        String str36 = str27;
                        str13 = str25;
                        i4 |= 2;
                        str14 = str30;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str36);
                        str28 = str11;
                        str29 = str12;
                        kSerializerArr3 = kSerializerArr2;
                        i2 = 10;
                        i3 = 12;
                        String str3322 = str15;
                        str30 = str14;
                        str25 = str13;
                        str27 = str3322;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr3;
                        str31 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str31);
                        i4 |= 4;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr3;
                        str9 = str28;
                        str10 = str29;
                        str25 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str25);
                        i4 |= 8;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 4:
                        str9 = str28;
                        kSerializerArr = kSerializerArr3;
                        i4 |= 16;
                        str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str29);
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 5:
                        str9 = str28;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, str16);
                        i4 |= 32;
                        kSerializerArr = kSerializerArr3;
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 6:
                        i4 |= 64;
                        kSerializerArr = kSerializerArr3;
                        str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str28);
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 7:
                        i4 |= 128;
                        kSerializerArr = kSerializerArr3;
                        str26 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, str26);
                        str9 = str28;
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 8:
                        i4 |= 256;
                        kSerializerArr = kSerializerArr3;
                        list3 = (List) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, kSerializerArr3[8], list3);
                        str9 = str28;
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 9:
                        i4 |= 512;
                        kSerializerArr = kSerializerArr3;
                        rule3 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, Rule$$serializer.INSTANCE, rule3);
                        str9 = str28;
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 10:
                        i4 |= 1024;
                        kSerializerArr = kSerializerArr3;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, BooleanSerializer.INSTANCE, bool6);
                        str9 = str28;
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 11:
                        i4 |= 2048;
                        kSerializerArr = kSerializerArr3;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool5);
                        str9 = str28;
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    case 12:
                        i4 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        num2 = (Integer) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, IntSerializer.INSTANCE, num2);
                        str9 = str28;
                        str10 = str29;
                        str28 = str9;
                        str29 = str10;
                        kSerializerArr3 = kSerializerArr;
                        i2 = 10;
                        i3 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = str29;
            str2 = str28;
            rule = rule3;
            list = list3;
            bool = bool5;
            bool2 = bool6;
            num = num2;
            str3 = str31;
            str4 = str25;
            str5 = str27;
            str6 = str30;
            str7 = str16;
            str8 = str26;
            i = i4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new SubInput(i, str6, str5, str3, str4, str, str7, str2, str8, list, rule, bool2, bool, num, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull SubInput subInput) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(subInput, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        SubInput.write$Self$OKCompliance_ok_compliance_impl(subInput, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
