package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.HashMap;
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
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Info$$serializer implements GeneratedSerializer<Info> {
    public static final int $stable;
    public static final Info$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Info$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Info$$serializer info$$serializer = new Info$$serializer();
        INSTANCE = info$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("info", info$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("step", true);
        pluginGeneratedSerialDescriptor.addElement("canGoBack", false);
        pluginGeneratedSerialDescriptor.addElement("pageTitle", true);
        pluginGeneratedSerialDescriptor.addElement("canClose", false);
        pluginGeneratedSerialDescriptor.addElement("quit", true);
        pluginGeneratedSerialDescriptor.addElement("richTitle", true);
        pluginGeneratedSerialDescriptor.addElement("richSubtitle", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("pageStack", true);
        pluginGeneratedSerialDescriptor.addElement("toast", true);
        pluginGeneratedSerialDescriptor.addElement("amplitudeParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.Info.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = Info.$childSerializers;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{JsonArraySerializer.INSTANCE, BuiltinSerializersKt.getNullable(Cta$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(Stepper$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(Quit$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RichTitle$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(RichSubtitleData$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(ToastModel$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[17])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Info deserialize(@NotNull Decoder decoder) {
        JsonArray jsonArray;
        String str;
        RichTitle richTitle;
        ToastModel toastModel;
        Boolean bool;
        Cta cta;
        Stepper stepper;
        Boolean bool2;
        String str2;
        Boolean bool3;
        Quit quit;
        HashMap map;
        RichSubtitleData richSubtitleData;
        String str3;
        String str4;
        String str5;
        Boolean bool4;
        String str6;
        int i;
        KSerializer[] kSerializerArr;
        Quit quit2;
        String str7;
        Boolean bool5;
        Cta cta2;
        Stepper stepper2;
        Boolean bool6;
        RichTitle richTitle2;
        HashMap map2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = Info.$childSerializers;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            JsonArray jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, null);
            Cta cta3 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, null);
            Stepper stepper3 = (Stepper) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Stepper$$serializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            Boolean bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Quit quit3 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Quit$$serializer.INSTANCE, null);
            RichTitle richTitle3 = (RichTitle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, RichTitle$$serializer.INSTANCE, null);
            RichSubtitleData richSubtitleData2 = (RichSubtitleData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, RichSubtitleData$$serializer.INSTANCE, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Boolean bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            ToastModel toastModel2 = (ToastModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, ToastModel$$serializer.INSTANCE, null);
            map = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, kSerializerArr2[17], null);
            toastModel = toastModel2;
            cta = cta3;
            bool = bool10;
            richSubtitleData = richSubtitleData2;
            bool2 = bool7;
            str6 = str10;
            str = str14;
            str4 = str13;
            str5 = str12;
            str3 = str11;
            bool4 = bool9;
            jsonArray = jsonArray2;
            str2 = str9;
            stepper = stepper3;
            i = 262143;
            quit = quit3;
            richTitle = richTitle3;
            bool3 = bool8;
        } else {
            int i2 = 17;
            int i3 = 0;
            boolean z = true;
            HashMap map3 = null;
            RichSubtitleData richSubtitleData3 = null;
            String str15 = null;
            String str16 = null;
            String str17 = null;
            ToastModel toastModel3 = null;
            Boolean bool11 = null;
            RichTitle richTitle4 = null;
            Boolean bool12 = null;
            String str18 = null;
            Quit quit4 = null;
            String str19 = null;
            JsonArray jsonArray3 = null;
            Boolean bool13 = null;
            Cta cta4 = null;
            Stepper stepper4 = null;
            Boolean bool14 = null;
            while (z) {
                RichTitle richTitle5 = richTitle4;
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle2 = richTitle5;
                        map2 = map3;
                        z = false;
                        richTitle4 = richTitle2;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle2 = richTitle5;
                        map2 = map3;
                        cta2 = cta4;
                        i3 |= 1;
                        jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, jsonArray3);
                        richTitle4 = richTitle2;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        bool6 = bool14;
                        map2 = map3;
                        stepper2 = stepper4;
                        i3 |= 2;
                        cta2 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, cta4);
                        richTitle4 = richTitle5;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        map2 = map3;
                        bool6 = bool14;
                        i3 |= 4;
                        stepper2 = (Stepper) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Stepper$$serializer.INSTANCE, stepper4);
                        richTitle4 = richTitle5;
                        cta2 = cta4;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        bool5 = bool13;
                        map2 = map3;
                        str7 = str19;
                        i3 |= 8;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool14);
                        richTitle4 = richTitle5;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        map2 = map3;
                        bool5 = bool13;
                        i3 |= 16;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str19);
                        richTitle4 = richTitle5;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        Quit quit5 = quit4;
                        map2 = map3;
                        quit2 = quit5;
                        i3 |= 32;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool13);
                        richTitle4 = richTitle5;
                        str7 = str19;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        Quit quit6 = quit4;
                        map2 = map3;
                        i3 |= 64;
                        quit2 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, Quit$$serializer.INSTANCE, quit6);
                        richTitle4 = richTitle5;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 7:
                        kSerializerArr = kSerializerArr2;
                        i3 |= 128;
                        richTitle4 = (RichTitle) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, RichTitle$$serializer.INSTANCE, richTitle5);
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 8:
                        richSubtitleData3 = (RichSubtitleData) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, RichSubtitleData$$serializer.INSTANCE, richSubtitleData3);
                        i3 |= 256;
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 9:
                        i3 |= 512;
                        kSerializerArr = kSerializerArr2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str18);
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 10:
                        i3 |= 1024;
                        kSerializerArr = kSerializerArr2;
                        bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool12);
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 11:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str15);
                        i3 |= 2048;
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 12:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str8);
                        i3 |= 4096;
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 13:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str17);
                        i3 |= 8192;
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 14:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str16);
                        i3 |= 16384;
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 15:
                        bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, bool11);
                        i3 |= 32768;
                        kSerializerArr = kSerializerArr2;
                        quit2 = quit4;
                        str7 = str19;
                        bool5 = bool13;
                        cta2 = cta4;
                        stepper2 = stepper4;
                        bool6 = bool14;
                        richTitle4 = richTitle5;
                        map2 = map3;
                        cta4 = cta2;
                        stepper4 = stepper2;
                        bool14 = bool6;
                        str19 = str7;
                        bool13 = bool5;
                        map3 = map2;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 17;
                        quit4 = quit2;
                        break;
                    case 16:
                        toastModel3 = (ToastModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, ToastModel$$serializer.INSTANCE, toastModel3);
                        i3 |= 65536;
                        richTitle4 = richTitle5;
                        i2 = 17;
                        break;
                    case 17:
                        map3 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kSerializerArr2[i2], map3);
                        i3 |= 131072;
                        richTitle4 = richTitle5;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str20 = str19;
            jsonArray = jsonArray3;
            str = str16;
            richTitle = richTitle4;
            toastModel = toastModel3;
            bool = bool11;
            cta = cta4;
            stepper = stepper4;
            bool2 = bool14;
            str2 = str20;
            bool3 = bool13;
            quit = quit4;
            map = map3;
            richSubtitleData = richSubtitleData3;
            str3 = str15;
            str4 = str17;
            str5 = str8;
            bool4 = bool12;
            str6 = str18;
            i = i3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Info(i, jsonArray, cta, stepper, bool2, str2, bool3, quit, richTitle, richSubtitleData, str6, bool4, str3, str5, str4, str, bool, toastModel, map, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Info info) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(info, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Info.write$Self$OKCompliance_ok_compliance_impl(info, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
