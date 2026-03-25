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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Processing$$serializer implements GeneratedSerializer<Processing> {
    public static final int $stable;
    public static final Processing$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Processing$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Processing$$serializer processing$$serializer = new Processing$$serializer();
        INSTANCE = processing$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("processing", processing$$serializer, 17);
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
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("title", false);
        pluginGeneratedSerialDescriptor.addElement("subtitle", false);
        pluginGeneratedSerialDescriptor.addElement("pageStack", true);
        pluginGeneratedSerialDescriptor.addElement("amplitudeParams", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.Processing.access$get$childSerializers$cp():kotlinx.serialization.KSerializer[] */
    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr = Processing.$childSerializers;
        KSerializer nullable = BuiltinSerializersKt.getNullable(JsonArraySerializer.INSTANCE);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(Cta$$serializer.INSTANCE);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(Quit$$serializer.INSTANCE);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(Exit$$serializer.INSTANCE);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(Polling$$serializer.INSTANCE);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(Onboarding$$serializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(kSerializerArr[16])};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Processing deserialize(@NotNull Decoder decoder) {
        int i;
        HashMap map;
        Boolean bool;
        String str;
        Boolean bool2;
        Exit exit;
        Polling polling;
        Onboarding onboarding;
        String str2;
        String str3;
        String str4;
        String str5;
        Boolean bool3;
        Cta cta;
        Quit quit;
        String str6;
        Long l;
        JsonArray jsonArray;
        KSerializer[] kSerializerArr;
        Polling polling2;
        String str7;
        Cta cta2;
        Quit quit2;
        Exit exit2;
        Onboarding onboarding2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr2 = Processing.$childSerializers;
        String str8 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            JsonArray jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, null);
            Cta cta3 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, null);
            Quit quit3 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Quit$$serializer.INSTANCE, null);
            Exit exit3 = (Exit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Exit$$serializer.INSTANCE, null);
            Polling polling3 = (Polling) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Polling$$serializer.INSTANCE, null);
            Onboarding onboarding3 = (Onboarding) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Onboarding$$serializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, null);
            Long l2 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, null);
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            String str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, stringSerializer, null);
            Boolean bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, booleanSerializer, null);
            map = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 16, kSerializerArr2[16], null);
            str = str14;
            cta = cta3;
            exit = exit3;
            l = l2;
            bool = bool6;
            str4 = str13;
            str5 = str12;
            str3 = str11;
            bool3 = bool5;
            polling = polling3;
            str2 = str9;
            onboarding = onboarding3;
            bool2 = bool4;
            jsonArray = jsonArray2;
            quit = quit3;
            i = 131071;
            str6 = str10;
        } else {
            int i2 = 16;
            i = 0;
            boolean z = true;
            String str15 = null;
            String str16 = null;
            HashMap map2 = null;
            Boolean bool7 = null;
            String str17 = null;
            Boolean bool8 = null;
            Long l3 = null;
            String str18 = null;
            Boolean bool9 = null;
            Polling polling4 = null;
            JsonArray jsonArray3 = null;
            String str19 = null;
            Cta cta4 = null;
            Quit quit4 = null;
            Exit exit4 = null;
            Onboarding onboarding4 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        z = false;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 0:
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta2 = cta4;
                        i |= 1;
                        jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, JsonArraySerializer.INSTANCE, jsonArray3);
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 1:
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        quit2 = quit4;
                        i |= 2;
                        cta2 = (Cta) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, Cta$$serializer.INSTANCE, cta4);
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 2:
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        onboarding2 = onboarding4;
                        exit2 = exit4;
                        i |= 4;
                        quit2 = (Quit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, Quit$$serializer.INSTANCE, quit4);
                        cta2 = cta4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 3:
                        kSerializerArr = kSerializerArr2;
                        str7 = str19;
                        onboarding2 = onboarding4;
                        polling2 = polling4;
                        i |= 8;
                        exit2 = (Exit) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, Exit$$serializer.INSTANCE, exit4);
                        cta2 = cta4;
                        quit2 = quit4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 4:
                        kSerializerArr = kSerializerArr2;
                        str7 = str19;
                        onboarding2 = onboarding4;
                        i |= 16;
                        polling2 = (Polling) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, Polling$$serializer.INSTANCE, polling4);
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 5:
                        kSerializerArr = kSerializerArr2;
                        str7 = str19;
                        i |= 32;
                        onboarding2 = (Onboarding) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, Onboarding$$serializer.INSTANCE, onboarding4);
                        polling2 = polling4;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 6:
                        kSerializerArr = kSerializerArr2;
                        i |= 64;
                        str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str19);
                        polling2 = polling4;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 7:
                        i |= 128;
                        kSerializerArr = kSerializerArr2;
                        l3 = (Long) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, l3);
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 8:
                        i |= 256;
                        kSerializerArr = kSerializerArr2;
                        bool8 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool8);
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 9:
                        str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, str8);
                        i |= 512;
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 10:
                        i |= 1024;
                        kSerializerArr = kSerializerArr2;
                        bool9 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, BooleanSerializer.INSTANCE, bool9);
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 11:
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str15);
                        i |= 2048;
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 12:
                        i |= 4096;
                        kSerializerArr = kSerializerArr2;
                        str18 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str18);
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 13:
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str16);
                        i |= 8192;
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 14:
                        str17 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, StringSerializer.INSTANCE, str17);
                        i |= 16384;
                        kSerializerArr = kSerializerArr2;
                        polling2 = polling4;
                        str7 = str19;
                        cta2 = cta4;
                        quit2 = quit4;
                        exit2 = exit4;
                        onboarding2 = onboarding4;
                        cta4 = cta2;
                        quit4 = quit2;
                        exit4 = exit2;
                        polling4 = polling2;
                        onboarding4 = onboarding2;
                        str19 = str7;
                        kSerializerArr2 = kSerializerArr;
                        i2 = 16;
                        break;
                    case 15:
                        bool7 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, BooleanSerializer.INSTANCE, bool7);
                        i |= 32768;
                        i2 = 16;
                        break;
                    case 16:
                        map2 = (HashMap) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i2, kSerializerArr2[i2], map2);
                        i |= 65536;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Polling polling5 = polling4;
            JsonArray jsonArray4 = jsonArray3;
            map = map2;
            bool = bool7;
            str = str17;
            bool2 = bool8;
            exit = exit4;
            polling = polling5;
            onboarding = onboarding4;
            str2 = str19;
            str3 = str15;
            str4 = str16;
            str5 = str18;
            bool3 = bool9;
            cta = cta4;
            quit = quit4;
            str6 = str8;
            l = l3;
            jsonArray = jsonArray4;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Processing(i, jsonArray, cta, quit, exit, polling, onboarding, str2, l, bool2, str6, bool3, str3, str5, str4, str, bool, map, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Processing processing) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(processing, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Processing.write$Self$OKCompliance_ok_compliance_impl(processing, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
