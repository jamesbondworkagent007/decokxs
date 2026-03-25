package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.ArrayList;
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
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class InfoFormEntryAppModel$$serializer implements GeneratedSerializer<InfoFormEntryAppModel> {
    public static final int $stable;
    public static final InfoFormEntryAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private InfoFormEntryAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        InfoFormEntryAppModel$$serializer infoFormEntryAppModel$$serializer = new InfoFormEntryAppModel$$serializer();
        INSTANCE = infoFormEntryAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntryAppModel", infoFormEntryAppModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.addElement("buttonText", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("details", true);
        pluginGeneratedSerialDescriptor.addElement("template", false);
        pluginGeneratedSerialDescriptor.addElement("fieldValue", false);
        pluginGeneratedSerialDescriptor.addElement("rule", true);
        pluginGeneratedSerialDescriptor.addElement("alertCard", true);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.InfoFormEntryAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = InfoFormEntryAppModel.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(CallApiModel$$serializer.INSTANCE), FormAppModel$$serializer.INSTANCE, kSerializerArr[4], BuiltinSerializersKt.getNullable(Rule$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(AlertCardAppModel$$serializer.INSTANCE), stringSerializer, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final InfoFormEntryAppModel deserialize(@NotNull Decoder decoder) {
        String strDecodeStringElement;
        Float f;
        String str;
        Boolean bool;
        AlertCardAppModel alertCardAppModel;
        Rule rule;
        String str2;
        Float f2;
        ArrayList arrayList;
        CallApiModel callApiModel;
        String str3;
        String str4;
        FormAppModel formAppModel;
        Boolean bool2;
        int i;
        KSerializer[] kSerializerArr;
        Rule rule2;
        ArrayList arrayList2;
        int i2;
        KSerializer[] kSerializerArr2;
        CallApiModel callApiModel2;
        Rule rule3;
        ArrayList arrayList3;
        String str5;
        FormAppModel formAppModel2;
        String str6;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr3 = InfoFormEntryAppModel.$childSerializers;
        int i3 = 9;
        int i4 = 8;
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, null);
            CallApiModel callApiModel3 = (CallApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CallApiModel$$serializer.INSTANCE, null);
            FormAppModel formAppModel3 = (FormAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, FormAppModel$$serializer.INSTANCE, null);
            ArrayList arrayList4 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr3[4], null);
            Rule rule4 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Rule$$serializer.INSTANCE, null);
            AlertCardAppModel alertCardAppModel2 = (AlertCardAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, AlertCardAppModel$$serializer.INSTANCE, null);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, floatSerializer, null);
            str2 = str10;
            f = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, floatSerializer, null);
            str = str9;
            strDecodeStringElement = strDecodeStringElement2;
            alertCardAppModel = alertCardAppModel2;
            bool = bool5;
            formAppModel = formAppModel3;
            bool2 = bool4;
            i = 16383;
            str4 = str7;
            arrayList = arrayList4;
            str3 = str8;
            rule = rule4;
            callApiModel = callApiModel3;
        } else {
            int i5 = 13;
            int i6 = 0;
            boolean z = true;
            CallApiModel callApiModel4 = null;
            Float f3 = null;
            String str11 = null;
            AlertCardAppModel alertCardAppModel3 = null;
            Boolean bool6 = null;
            String str12 = null;
            Float f4 = null;
            strDecodeStringElement = null;
            Rule rule5 = null;
            ArrayList arrayList5 = null;
            String str13 = null;
            String str14 = null;
            FormAppModel formAppModel4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr2 = kSerializerArr3;
                        callApiModel2 = callApiModel4;
                        rule3 = rule5;
                        arrayList3 = arrayList5;
                        str5 = str14;
                        formAppModel2 = formAppModel4;
                        str6 = str13;
                        z = false;
                        formAppModel4 = formAppModel2;
                        rule5 = rule3;
                        arrayList5 = arrayList3;
                        kSerializerArr3 = kSerializerArr2;
                        str13 = str6;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        str14 = str5;
                        callApiModel4 = callApiModel2;
                        break;
                    case 0:
                        kSerializerArr2 = kSerializerArr3;
                        callApiModel2 = callApiModel4;
                        rule3 = rule5;
                        arrayList3 = arrayList5;
                        formAppModel2 = formAppModel4;
                        String str15 = str14;
                        str6 = str13;
                        str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str15);
                        i6 |= 1;
                        formAppModel4 = formAppModel2;
                        rule5 = rule3;
                        arrayList5 = arrayList3;
                        kSerializerArr3 = kSerializerArr2;
                        str13 = str6;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        str14 = str5;
                        callApiModel4 = callApiModel2;
                        break;
                    case 1:
                        kSerializerArr2 = kSerializerArr3;
                        rule3 = rule5;
                        arrayList3 = arrayList5;
                        formAppModel2 = formAppModel4;
                        callApiModel2 = callApiModel4;
                        i6 |= 2;
                        str5 = str14;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str13);
                        formAppModel4 = formAppModel2;
                        rule5 = rule3;
                        arrayList5 = arrayList3;
                        kSerializerArr3 = kSerializerArr2;
                        str13 = str6;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        str14 = str5;
                        callApiModel4 = callApiModel2;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr3;
                        callApiModel4 = (CallApiModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, CallApiModel$$serializer.INSTANCE, callApiModel4);
                        i6 |= 4;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 3:
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        kSerializerArr = kSerializerArr3;
                        i6 |= 8;
                        formAppModel4 = (FormAppModel) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 3, FormAppModel$$serializer.INSTANCE, formAppModel4);
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 4:
                        rule2 = rule5;
                        i6 |= 16;
                        kSerializerArr = kSerializerArr3;
                        arrayList2 = (ArrayList) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr3[4], arrayList5);
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr3;
                        i6 |= 32;
                        arrayList2 = arrayList5;
                        rule2 = (Rule) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Rule$$serializer.INSTANCE, rule5);
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 6:
                        alertCardAppModel3 = (AlertCardAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, AlertCardAppModel$$serializer.INSTANCE, alertCardAppModel3);
                        kSerializerArr = kSerializerArr3;
                        i6 |= 64;
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 7:
                        i6 |= 128;
                        kSerializerArr = kSerializerArr3;
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 7);
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 8:
                        i6 |= 256;
                        kSerializerArr = kSerializerArr3;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool6);
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 9:
                        str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str11);
                        i2 = i6 | 512;
                        kSerializerArr = kSerializerArr3;
                        i6 = i2;
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 10:
                        i6 |= 1024;
                        kSerializerArr = kSerializerArr3;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str12);
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 11:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool3);
                        i2 = i6 | 2048;
                        kSerializerArr = kSerializerArr3;
                        i6 = i2;
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 12:
                        i6 |= 4096;
                        kSerializerArr = kSerializerArr3;
                        f4 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, FloatSerializer.INSTANCE, f4);
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    case 13:
                        f3 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, FloatSerializer.INSTANCE, f3);
                        i2 = i6 | 8192;
                        kSerializerArr = kSerializerArr3;
                        i6 = i2;
                        rule2 = rule5;
                        arrayList2 = arrayList5;
                        rule5 = rule2;
                        arrayList5 = arrayList2;
                        kSerializerArr3 = kSerializerArr;
                        i3 = 9;
                        i4 = 8;
                        i5 = 13;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Rule rule6 = rule5;
            f = f3;
            str = str11;
            bool = bool3;
            alertCardAppModel = alertCardAppModel3;
            rule = rule6;
            str2 = str12;
            f2 = f4;
            arrayList = arrayList5;
            callApiModel = callApiModel4;
            str3 = str13;
            str4 = str14;
            formAppModel = formAppModel4;
            bool2 = bool6;
            i = i6;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new InfoFormEntryAppModel(i, str4, str3, callApiModel, formAppModel, arrayList, rule, alertCardAppModel, strDecodeStringElement, bool2, str, str2, bool, f2, f, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull InfoFormEntryAppModel infoFormEntryAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(infoFormEntryAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        InfoFormEntryAppModel.write$Self$OKCompliance_ok_compliance_impl(infoFormEntryAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
