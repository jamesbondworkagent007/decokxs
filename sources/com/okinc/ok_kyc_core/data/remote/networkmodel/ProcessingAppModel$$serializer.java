package com.okinc.ok_kyc_core.data.remote.networkmodel;

import java.util.HashMap;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ProcessingAppModel$$serializer implements GeneratedSerializer<ProcessingAppModel> {
    public static final int $stable;
    public static final ProcessingAppModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private ProcessingAppModel$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        ProcessingAppModel$$serializer processingAppModel$$serializer = new ProcessingAppModel$$serializer();
        INSTANCE = processingAppModel$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel", processingAppModel$$serializer, 18);
        pluginGeneratedSerialDescriptor.addElement("items", false);
        pluginGeneratedSerialDescriptor.addElement("cta", true);
        pluginGeneratedSerialDescriptor.addElement("quit", true);
        pluginGeneratedSerialDescriptor.addElement("onExit", true);
        pluginGeneratedSerialDescriptor.addElement("polling", true);
        pluginGeneratedSerialDescriptor.addElement("onboarding", true);
        pluginGeneratedSerialDescriptor.addElement("pageTitle", true);
        pluginGeneratedSerialDescriptor.addElement("processTimeOut", true);
        pluginGeneratedSerialDescriptor.addElement("canClose", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", true);
        pluginGeneratedSerialDescriptor.addElement("value", true);
        pluginGeneratedSerialDescriptor.addElement("title", true);
        pluginGeneratedSerialDescriptor.addElement("subtitle", true);
        pluginGeneratedSerialDescriptor.addElement("pageStack", true);
        pluginGeneratedSerialDescriptor.addElement("amplitudeParams", true);
        pluginGeneratedSerialDescriptor.addElement("isLocalPolling", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.ProcessingAppModel.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = ProcessingAppModel.$childSerializers;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer nullable = BuiltinSerializersKt.getNullable(CtaAppModel$$serializer.INSTANCE);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(Quit$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(Exit$$serializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(Polling$$serializer.INSTANCE);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(Onboarding$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{kSerializer, nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[16]), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final ProcessingAppModel deserialize(@NotNull Decoder decoder) {
        Boolean bool;
        int i;
        String str;
        String str2;
        Long l;
        HashMap map;
        Quit quit;
        Boolean bool2;
        String str3;
        String str4;
        Onboarding onboarding;
        String str5;
        Boolean bool3;
        String str6;
        Exit exit;
        Polling polling;
        Boolean bool4;
        List list;
        CtaAppModel ctaAppModel;
        Polling polling2;
        Boolean bool5;
        Boolean bool6;
        HashMap map2;
        int i2;
        int i3;
        KSerializer[] kSerializerArr;
        Boolean bool7;
        Polling polling3;
        HashMap map3;
        String str7;
        Boolean bool8;
        Exit exit2;
        Quit quit2;
        Boolean bool9;
        String str8;
        CtaAppModel ctaAppModel2;
        int i4;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = ProcessingAppModel.$childSerializers;
        HashMap map4 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            List list2 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], null);
            ctaAppModel = (CtaAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaAppModel$$serializer.INSTANCE, null);
            Quit quit3 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Quit$$serializer.INSTANCE, null);
            Exit exit3 = (Exit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Exit$$serializer.INSTANCE, null);
            Polling polling4 = (Polling) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Polling$$serializer.INSTANCE, null);
            Onboarding onboarding2 = (Onboarding) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Onboarding$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool10 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Boolean bool11 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            Boolean bool12 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            HashMap map5 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr2[16], null);
            Boolean bool13 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, booleanSerializer, null);
            str4 = str9;
            str6 = str14;
            str3 = str11;
            bool = bool11;
            map = map5;
            l = l2;
            bool2 = bool12;
            polling = polling4;
            i = 262143;
            str5 = str10;
            onboarding = onboarding2;
            bool4 = bool10;
            exit = exit3;
            quit = quit3;
            list = list2;
            bool3 = bool13;
            str2 = str13;
            str = str12;
        } else {
            boolean z = true;
            int i5 = 0;
            String str15 = null;
            Boolean bool14 = null;
            String str16 = null;
            Onboarding onboarding3 = null;
            Polling polling5 = null;
            Boolean bool15 = null;
            String str17 = null;
            String str18 = null;
            String str19 = null;
            Long l3 = null;
            String str20 = null;
            Boolean bool16 = null;
            Exit exit4 = null;
            Quit quit4 = null;
            CtaAppModel ctaAppModel3 = null;
            List list3 = null;
            Boolean bool17 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        bool7 = bool14;
                        polling3 = polling5;
                        map3 = map4;
                        str7 = str20;
                        bool8 = bool16;
                        exit2 = exit4;
                        quit2 = quit4;
                        bool9 = bool17;
                        str8 = str15;
                        ctaAppModel2 = ctaAppModel3;
                        z = false;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 0:
                        bool7 = bool14;
                        polling3 = polling5;
                        map3 = map4;
                        str7 = str20;
                        bool8 = bool16;
                        exit2 = exit4;
                        quit2 = quit4;
                        bool9 = bool17;
                        str8 = str15;
                        ctaAppModel2 = ctaAppModel3;
                        kSerializerArr = kSerializerArr2;
                        list3 = (List) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 0, kSerializerArr2[0], list3);
                        i5 |= 1;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 1:
                        bool7 = bool14;
                        polling3 = polling5;
                        map3 = map4;
                        str7 = str20;
                        bool8 = bool16;
                        exit2 = exit4;
                        bool9 = bool17;
                        str8 = str15;
                        quit2 = quit4;
                        ctaAppModel3 = (CtaAppModel) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, CtaAppModel$$serializer.INSTANCE, ctaAppModel3);
                        i4 = i5 | 2;
                        kSerializerArr = kSerializerArr2;
                        i5 = i4;
                        ctaAppModel2 = ctaAppModel3;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 2:
                        bool7 = bool14;
                        polling3 = polling5;
                        map3 = map4;
                        str7 = str20;
                        bool8 = bool16;
                        bool9 = bool17;
                        str8 = str15;
                        exit2 = exit4;
                        quit4 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Quit$$serializer.INSTANCE, quit4);
                        i4 = i5 | 4;
                        quit2 = quit4;
                        kSerializerArr = kSerializerArr2;
                        i5 = i4;
                        ctaAppModel2 = ctaAppModel3;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 3:
                        bool7 = bool14;
                        map3 = map4;
                        str7 = str20;
                        bool8 = bool16;
                        bool9 = bool17;
                        str8 = str15;
                        polling3 = polling5;
                        i4 = i5 | 8;
                        exit2 = (Exit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Exit$$serializer.INSTANCE, exit4);
                        quit2 = quit4;
                        kSerializerArr = kSerializerArr2;
                        i5 = i4;
                        ctaAppModel2 = ctaAppModel3;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 4:
                        bool7 = bool14;
                        map3 = map4;
                        str7 = str20;
                        bool9 = bool17;
                        str8 = str15;
                        bool8 = bool16;
                        polling3 = (Polling) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Polling$$serializer.INSTANCE, polling5);
                        exit2 = exit4;
                        quit2 = quit4;
                        i4 = i5 | 16;
                        kSerializerArr = kSerializerArr2;
                        i5 = i4;
                        ctaAppModel2 = ctaAppModel3;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 5:
                        bool7 = bool14;
                        Polling polling6 = polling5;
                        map3 = map4;
                        str7 = str20;
                        bool9 = bool17;
                        str8 = str15;
                        onboarding3 = (Onboarding) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Onboarding$$serializer.INSTANCE, onboarding3);
                        i4 = i5 | 32;
                        bool8 = bool16;
                        exit2 = exit4;
                        quit2 = quit4;
                        polling3 = polling6;
                        kSerializerArr = kSerializerArr2;
                        i5 = i4;
                        ctaAppModel2 = ctaAppModel3;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 6:
                        bool7 = bool14;
                        map3 = map4;
                        str7 = str20;
                        bool9 = bool17;
                        str8 = str15;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str16);
                        kSerializerArr = kSerializerArr2;
                        bool8 = bool16;
                        i5 |= 64;
                        exit2 = exit4;
                        quit2 = quit4;
                        ctaAppModel2 = ctaAppModel3;
                        polling3 = polling5;
                        kSerializerArr2 = kSerializerArr;
                        bool17 = bool9;
                        ctaAppModel3 = ctaAppModel2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling5 = polling3;
                        bool16 = bool8;
                        bool14 = bool7;
                        str15 = str8;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 7:
                        map3 = map4;
                        str7 = str20;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, l3);
                        i5 |= 128;
                        bool14 = bool14;
                        str15 = str15;
                        polling5 = polling5;
                        str20 = str7;
                        map4 = map3;
                        break;
                    case 8:
                        polling2 = polling5;
                        HashMap map6 = map4;
                        String str21 = str20;
                        bool5 = bool17;
                        bool6 = bool14;
                        bool16 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool16);
                        i5 |= 256;
                        str15 = str15;
                        str20 = str21;
                        map4 = map6;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 9:
                        polling2 = polling5;
                        bool5 = bool17;
                        bool6 = bool14;
                        i5 |= 512;
                        map4 = map4;
                        str15 = str15;
                        str20 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str20);
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 10:
                        polling2 = polling5;
                        bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool17);
                        bool6 = bool14;
                        i5 |= 1024;
                        map4 = map4;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 11:
                        polling2 = polling5;
                        map2 = map4;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str15);
                        i2 = i5 | 2048;
                        bool6 = bool14;
                        i5 = i2;
                        map4 = map2;
                        bool5 = bool17;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 12:
                        polling2 = polling5;
                        map2 = map4;
                        i5 |= 4096;
                        bool6 = bool14;
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str17);
                        map4 = map2;
                        bool5 = bool17;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 13:
                        polling2 = polling5;
                        map2 = map4;
                        i5 |= 8192;
                        bool6 = bool14;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str18);
                        map4 = map2;
                        bool5 = bool17;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 14:
                        polling2 = polling5;
                        map2 = map4;
                        i5 |= 16384;
                        bool6 = bool14;
                        str19 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str19);
                        map4 = map2;
                        bool5 = bool17;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 15:
                        polling2 = polling5;
                        map2 = map4;
                        bool14 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, bool14);
                        i3 = 32768;
                        i2 = i3 | i5;
                        bool6 = bool14;
                        i5 = i2;
                        map4 = map2;
                        bool5 = bool17;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 16:
                        polling2 = polling5;
                        i3 = 65536;
                        map2 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr2[16], map4);
                        i2 = i3 | i5;
                        bool6 = bool14;
                        i5 = i2;
                        map4 = map2;
                        bool5 = bool17;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    case 17:
                        polling2 = polling5;
                        bool6 = bool14;
                        i5 = 131072 | i5;
                        bool15 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 17, BooleanSerializer.INSTANCE, bool15);
                        bool5 = bool17;
                        bool17 = bool5;
                        bool14 = bool6;
                        polling5 = polling2;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool18 = bool14;
            Polling polling7 = polling5;
            HashMap map7 = map4;
            bool = bool17;
            i = i5;
            str = str17;
            str2 = str18;
            l = l3;
            map = map7;
            quit = quit4;
            bool2 = bool18;
            str3 = str15;
            str4 = str16;
            onboarding = onboarding3;
            str5 = str20;
            bool3 = bool15;
            str6 = str19;
            exit = exit4;
            polling = polling7;
            bool4 = bool16;
            list = list3;
            ctaAppModel = ctaAppModel3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new ProcessingAppModel(i, list, ctaAppModel, quit, exit, polling, onboarding, str4, l, bool4, str5, bool, str3, str, str2, str6, bool2, map, bool3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull ProcessingAppModel processingAppModel) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(processingAppModel, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        ProcessingAppModel.write$Self$OKCompliance_ok_compliance_impl(processingAppModel, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
