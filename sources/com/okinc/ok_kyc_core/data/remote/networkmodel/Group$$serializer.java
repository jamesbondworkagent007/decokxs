package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
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
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class Group$$serializer implements GeneratedSerializer<Group> {
    public static final int $stable;
    public static final Group$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private Group$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        Group$$serializer group$$serializer = new Group$$serializer();
        INSTANCE = group$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("group", group$$serializer, 16);
        pluginGeneratedSerialDescriptor.addElement("isHidden", true);
        pluginGeneratedSerialDescriptor.addElement("contentList", true);
        pluginGeneratedSerialDescriptor.addElement("backgroundType", true);
        pluginGeneratedSerialDescriptor.addElement(TtmlNode.ATTR_TTS_BACKGROUND_COLOR, true);
        pluginGeneratedSerialDescriptor.addElement("dynamic", true);
        pluginGeneratedSerialDescriptor.addElement("cornerRadius", true);
        pluginGeneratedSerialDescriptor.addElement("paddingLeft", true);
        pluginGeneratedSerialDescriptor.addElement("paddingTop", true);
        pluginGeneratedSerialDescriptor.addElement("paddingRight", true);
        pluginGeneratedSerialDescriptor.addElement("paddingBottom", true);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement("required", true);
        pluginGeneratedSerialDescriptor.addElement("version", false);
        pluginGeneratedSerialDescriptor.addElement("value", false);
        pluginGeneratedSerialDescriptor.addElement("bottomMargin", false);
        pluginGeneratedSerialDescriptor.addElement("leftMargin", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(JsonArraySerializer.INSTANCE);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(stringSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(GroupDynamic$$serializer.INSTANCE);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(floatSerializer), BuiltinSerializersKt.getNullable(floatSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final Group deserialize(@NotNull Decoder decoder) {
        Float f;
        Float f2;
        Boolean bool;
        Float f3;
        Float f4;
        String str;
        JsonArray jsonArray;
        GroupDynamic groupDynamic;
        Float f5;
        Float f6;
        int i;
        Float f7;
        String str2;
        String str3;
        Boolean bool2;
        String str4;
        String str5;
        Float f8;
        int i2;
        GroupDynamic groupDynamic2;
        Float f9;
        Float f10;
        String str6;
        JsonArray jsonArray2;
        Float f11;
        Float f12;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        Boolean bool3 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool4 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            JsonArray jsonArray3 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonArraySerializer.INSTANCE, null);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str7 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, stringSerializer, null);
            String str8 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, null);
            GroupDynamic groupDynamic3 = (GroupDynamic) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GroupDynamic$$serializer.INSTANCE, null);
            FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
            Float f13 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, floatSerializer, null);
            Float f14 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, floatSerializer, null);
            Float f15 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, floatSerializer, null);
            Float f16 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, floatSerializer, null);
            Float f17 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, floatSerializer, null);
            String str9 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, stringSerializer, null);
            Boolean bool5 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, stringSerializer, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, stringSerializer, null);
            Float f18 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, floatSerializer, null);
            str2 = str11;
            str = str10;
            f2 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 15, floatSerializer, null);
            f = f18;
            f3 = f15;
            f6 = f13;
            str5 = str8;
            bool2 = bool4;
            bool = bool5;
            str3 = str9;
            jsonArray = jsonArray3;
            groupDynamic = groupDynamic3;
            f5 = f14;
            f4 = f16;
            str4 = str7;
            i = 65535;
            f7 = f17;
        } else {
            int i3 = 15;
            int i4 = 0;
            boolean z = true;
            GroupDynamic groupDynamic4 = null;
            Float f19 = null;
            Float f20 = null;
            Float f21 = null;
            String str12 = null;
            Float f22 = null;
            Float f23 = null;
            String str13 = null;
            String str14 = null;
            String str15 = null;
            Float f24 = null;
            String str16 = null;
            JsonArray jsonArray4 = null;
            Boolean bool6 = null;
            Float f25 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        groupDynamic2 = groupDynamic4;
                        f9 = f19;
                        f10 = f24;
                        str6 = str16;
                        jsonArray2 = jsonArray4;
                        f11 = f25;
                        z = false;
                        str16 = str6;
                        groupDynamic4 = groupDynamic2;
                        f24 = f10;
                        f19 = f9;
                        f25 = f11;
                        i3 = 15;
                        jsonArray4 = jsonArray2;
                        break;
                    case 0:
                        groupDynamic2 = groupDynamic4;
                        f9 = f19;
                        f10 = f24;
                        str6 = str16;
                        JsonArray jsonArray5 = jsonArray4;
                        f11 = f25;
                        jsonArray2 = jsonArray5;
                        bool6 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool6);
                        i4 |= 1;
                        str16 = str6;
                        groupDynamic4 = groupDynamic2;
                        f24 = f10;
                        f19 = f9;
                        f25 = f11;
                        i3 = 15;
                        jsonArray4 = jsonArray2;
                        break;
                    case 1:
                        groupDynamic2 = groupDynamic4;
                        f9 = f19;
                        f10 = f24;
                        str6 = str16;
                        JsonArray jsonArray6 = jsonArray4;
                        f11 = f25;
                        i4 |= 2;
                        jsonArray2 = (JsonArray) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, JsonArraySerializer.INSTANCE, jsonArray6);
                        str16 = str6;
                        groupDynamic4 = groupDynamic2;
                        f24 = f10;
                        f19 = f9;
                        f25 = f11;
                        i3 = 15;
                        jsonArray4 = jsonArray2;
                        break;
                    case 2:
                        f9 = f19;
                        f10 = f24;
                        f12 = f25;
                        groupDynamic2 = groupDynamic4;
                        str16 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, str16);
                        i4 |= 4;
                        str6 = str16;
                        jsonArray2 = jsonArray4;
                        f11 = f12;
                        str16 = str6;
                        groupDynamic4 = groupDynamic2;
                        f24 = f10;
                        f19 = f9;
                        f25 = f11;
                        i3 = 15;
                        jsonArray4 = jsonArray2;
                        break;
                    case 3:
                        f9 = f19;
                        f10 = f24;
                        f12 = f25;
                        str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str12);
                        groupDynamic2 = groupDynamic4;
                        i4 |= 8;
                        str6 = str16;
                        jsonArray2 = jsonArray4;
                        f11 = f12;
                        str16 = str6;
                        groupDynamic4 = groupDynamic2;
                        f24 = f10;
                        f19 = f9;
                        f25 = f11;
                        i3 = 15;
                        jsonArray4 = jsonArray2;
                        break;
                    case 4:
                        groupDynamic4 = (GroupDynamic) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, GroupDynamic$$serializer.INSTANCE, groupDynamic4);
                        i4 |= 16;
                        f19 = f19;
                        i3 = 15;
                        break;
                    case 5:
                        f8 = f24;
                        f25 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, FloatSerializer.INSTANCE, f25);
                        i4 |= 32;
                        f19 = f19;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 6:
                        f8 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, FloatSerializer.INSTANCE, f24);
                        i4 |= 64;
                        f19 = f19;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 7:
                        f21 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, FloatSerializer.INSTANCE, f21);
                        i2 = i4 | 128;
                        i4 = i2;
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 8:
                        i4 |= 256;
                        f22 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, FloatSerializer.INSTANCE, f22);
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 9:
                        i4 |= 512;
                        f23 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, FloatSerializer.INSTANCE, f23);
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 10:
                        i4 |= 1024;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, str15);
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 11:
                        bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, BooleanSerializer.INSTANCE, bool3);
                        i2 = i4 | 2048;
                        i4 = i2;
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 12:
                        i4 |= 4096;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, StringSerializer.INSTANCE, str13);
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 13:
                        i4 |= 8192;
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 13, StringSerializer.INSTANCE, str14);
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 14:
                        f19 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 14, FloatSerializer.INSTANCE, f19);
                        i2 = i4 | 16384;
                        i4 = i2;
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    case 15:
                        f20 = (Float) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, FloatSerializer.INSTANCE, f20);
                        i2 = 32768 | i4;
                        i4 = i2;
                        f8 = f24;
                        f24 = f8;
                        i3 = 15;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            f = f19;
            Float f26 = f24;
            f2 = f20;
            bool = bool3;
            f3 = f21;
            f4 = f22;
            str = str13;
            jsonArray = jsonArray4;
            groupDynamic = groupDynamic4;
            f5 = f26;
            f6 = f25;
            i = i4;
            f7 = f23;
            str2 = str14;
            str3 = str15;
            bool2 = bool6;
            str4 = str16;
            str5 = str12;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new Group(i, bool2, jsonArray, str4, str5, groupDynamic, f6, f5, f3, f4, f7, str3, bool, str, str2, f, f2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.ok_kyc_core.data.remote.networkmodel.Group.write$Self$OKCompliance_ok_compliance_impl(com.okinc.ok_kyc_core.data.remote.networkmodel.Group, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void */
    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull Group group) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(group, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        Group.write$Self$OKCompliance_ok_compliance_impl(group, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
