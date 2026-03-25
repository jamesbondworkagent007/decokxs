package com.okinc.okimcore.model.room.inhouseim;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class RelationPermission$$serializer implements GeneratedSerializer<RelationPermission> {
    public static final int $stable;
    public static final RelationPermission$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private RelationPermission$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        RelationPermission$$serializer relationPermission$$serializer = new RelationPermission$$serializer();
        INSTANCE = relationPermission$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.room.inhouseim.RelationPermission", relationPermission$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("voiceCall", true);
        pluginGeneratedSerialDescriptor.addElement("addContact", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowSendMessage", true);
        pluginGeneratedSerialDescriptor.addElement("showKycBanner", true);
        pluginGeneratedSerialDescriptor.addElement("isAllowSingleChatInGroup", true);
        pluginGeneratedSerialDescriptor.addElement("showUnknownContactBanner", true);
        pluginGeneratedSerialDescriptor.addElement("allowVoice", true);
        pluginGeneratedSerialDescriptor.addElement("allowFile", true);
        pluginGeneratedSerialDescriptor.addElement("allowPlanetProfile", true);
        pluginGeneratedSerialDescriptor.addElement("allowBlockUser", true);
        pluginGeneratedSerialDescriptor.addElement("showVipPerformanceDetails", true);
        pluginGeneratedSerialDescriptor.addElement("allowRemoveGroupMember", true);
        pluginGeneratedSerialDescriptor.addElement("allowPay", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final RelationPermission deserialize(@NotNull Decoder decoder) {
        int i;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        Boolean bool15;
        Boolean bool16;
        Boolean bool17;
        Boolean bool18;
        Boolean bool19;
        Boolean bool20;
        int i2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i3 = 11;
        int i4 = 10;
        Boolean bool21 = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
            Boolean bool22 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, booleanSerializer, null);
            Boolean bool23 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, booleanSerializer, null);
            Boolean bool24 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, booleanSerializer, null);
            Boolean bool25 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, booleanSerializer, null);
            Boolean bool26 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, booleanSerializer, null);
            Boolean bool27 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, booleanSerializer, null);
            Boolean bool28 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, booleanSerializer, null);
            Boolean bool29 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, booleanSerializer, null);
            Boolean bool30 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, booleanSerializer, null);
            Boolean bool31 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, booleanSerializer, null);
            Boolean bool32 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, booleanSerializer, null);
            Boolean bool33 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, booleanSerializer, null);
            bool3 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, booleanSerializer, null);
            bool2 = bool33;
            bool = bool32;
            bool5 = bool31;
            bool13 = bool27;
            bool11 = bool30;
            bool4 = bool24;
            bool10 = bool22;
            bool8 = bool29;
            bool6 = bool26;
            bool9 = bool25;
            bool12 = bool23;
            bool7 = bool28;
            i = 8191;
        } else {
            int i5 = 12;
            i = 0;
            Boolean bool34 = null;
            Boolean bool35 = null;
            Boolean bool36 = null;
            Boolean bool37 = null;
            Boolean bool38 = null;
            Boolean bool39 = null;
            Boolean bool40 = null;
            Boolean bool41 = null;
            Boolean bool42 = null;
            Boolean bool43 = null;
            Boolean bool44 = null;
            boolean z = true;
            Boolean bool45 = null;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        bool14 = bool21;
                        bool15 = bool41;
                        bool16 = bool42;
                        bool17 = bool44;
                        bool18 = bool34;
                        z = false;
                        bool44 = bool17;
                        bool42 = bool16;
                        bool21 = bool14;
                        bool34 = bool18;
                        i3 = 11;
                        i4 = 10;
                        bool41 = bool15;
                        i5 = 12;
                        break;
                    case 0:
                        bool15 = bool41;
                        bool16 = bool42;
                        bool17 = bool44;
                        bool18 = bool34;
                        bool14 = bool21;
                        i |= 1;
                        bool43 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, bool43);
                        bool44 = bool17;
                        bool42 = bool16;
                        bool21 = bool14;
                        bool34 = bool18;
                        i3 = 11;
                        i4 = 10;
                        bool41 = bool15;
                        i5 = 12;
                        break;
                    case 1:
                        i |= 2;
                        bool34 = bool34;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        bool41 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, BooleanSerializer.INSTANCE, bool41);
                        break;
                    case 2:
                        bool19 = bool42;
                        bool20 = bool44;
                        i |= 4;
                        bool45 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, bool45);
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 3:
                        bool19 = bool42;
                        bool20 = bool44;
                        bool34 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, bool34);
                        i2 = i | 8;
                        i = i2;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 4:
                        bool20 = bool44;
                        bool19 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, bool42);
                        i2 = i | 16;
                        i = i2;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 5:
                        bool20 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, bool44);
                        i |= 32;
                        bool19 = bool42;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 6:
                        i |= 64;
                        bool36 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, BooleanSerializer.INSTANCE, bool36);
                        bool19 = bool42;
                        bool20 = bool44;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 7:
                        i |= 128;
                        bool39 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, BooleanSerializer.INSTANCE, bool39);
                        bool19 = bool42;
                        bool20 = bool44;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 8:
                        i |= 256;
                        bool37 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, BooleanSerializer.INSTANCE, bool37);
                        bool19 = bool42;
                        bool20 = bool44;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 9:
                        bool21 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, BooleanSerializer.INSTANCE, bool21);
                        i |= 512;
                        bool19 = bool42;
                        bool20 = bool44;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 10:
                        Boolean bool46 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, BooleanSerializer.INSTANCE, bool35);
                        i |= 1024;
                        bool19 = bool42;
                        bool20 = bool44;
                        bool35 = bool46;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 11:
                        i |= 2048;
                        bool38 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, BooleanSerializer.INSTANCE, bool38);
                        bool19 = bool42;
                        bool20 = bool44;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    case 12:
                        i |= 4096;
                        bool40 = (Boolean) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i5, BooleanSerializer.INSTANCE, bool40);
                        bool19 = bool42;
                        bool20 = bool44;
                        bool44 = bool20;
                        bool42 = bool19;
                        i3 = 11;
                        i4 = 10;
                        i5 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            Boolean bool47 = bool41;
            bool = bool35;
            bool2 = bool38;
            bool3 = bool40;
            bool4 = bool45;
            bool5 = bool21;
            bool6 = bool42;
            bool7 = bool36;
            bool8 = bool39;
            bool9 = bool34;
            bool10 = bool43;
            bool11 = bool37;
            bool12 = bool47;
            bool13 = bool44;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new RelationPermission(i, bool10, bool12, bool4, bool9, bool6, bool13, bool7, bool8, bool11, bool5, bool, bool2, bool3, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull RelationPermission relationPermission) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(relationPermission, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        RelationPermission.write$Self$OKIMCore_okimcore(relationPermission, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
