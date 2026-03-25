package com.okinc.okimcore.model.other;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class GroupUserSettingInfo$$serializer implements GeneratedSerializer<GroupUserSettingInfo> {
    public static final int $stable;
    public static final GroupUserSettingInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupUserSettingInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupUserSettingInfo$$serializer groupUserSettingInfo$$serializer = new GroupUserSettingInfo$$serializer();
        INSTANCE = groupUserSettingInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.other.GroupUserSettingInfo", groupUserSettingInfo$$serializer, 8);
        pluginGeneratedSerialDescriptor.addElement("groupId", false);
        pluginGeneratedSerialDescriptor.addElement("groupNickName", false);
        pluginGeneratedSerialDescriptor.addElement("userNickName", false);
        pluginGeneratedSerialDescriptor.addElement("userEnNickName", true);
        pluginGeneratedSerialDescriptor.addElement("role", false);
        pluginGeneratedSerialDescriptor.addElement("isNoDisturb", false);
        pluginGeneratedSerialDescriptor.addElement("isTop", false);
        pluginGeneratedSerialDescriptor.addElement("affiliateUserType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = GroupUserSettingInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), kSerializerArr[4], booleanSerializer, booleanSerializer, kSerializerArr[7]};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupUserSettingInfo deserialize(@NotNull Decoder decoder) {
        String str;
        boolean z;
        int i;
        String str2;
        GroupRole groupRole;
        String str3;
        AffiliateUserType affiliateUserType;
        String str4;
        boolean z2;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GroupUserSettingInfo.$childSerializers;
        int i2 = 6;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String str5 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, null);
            GroupRole groupRole2 = (GroupRole) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], null);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            affiliateUserType = (AffiliateUserType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            z2 = zDecodeBooleanElement2;
            z = zDecodeBooleanElement;
            str2 = str5;
            str = strDecodeStringElement3;
            i = 255;
            groupRole = groupRole2;
            str4 = strDecodeStringElement2;
            str3 = strDecodeStringElement;
        } else {
            String str6 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            boolean zDecodeBooleanElement3 = false;
            int i3 = 0;
            boolean z3 = true;
            AffiliateUserType affiliateUserType2 = null;
            boolean zDecodeBooleanElement4 = false;
            GroupRole groupRole3 = null;
            while (z3) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z3 = false;
                        i2 = 6;
                        break;
                    case 0:
                        strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 |= 1;
                        i2 = 6;
                        break;
                    case 1:
                        strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i3 |= 2;
                        i2 = 6;
                        break;
                    case 2:
                        strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i3 |= 4;
                        i2 = 6;
                        break;
                    case 3:
                        i3 |= 8;
                        str6 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, str6);
                        i2 = 6;
                        break;
                    case 4:
                        i3 |= 16;
                        groupRole3 = (GroupRole) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], groupRole3);
                        i2 = 6;
                        break;
                    case 5:
                        zDecodeBooleanElement4 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i3 |= 32;
                        i2 = 6;
                        break;
                    case 6:
                        zDecodeBooleanElement3 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, i2);
                        i3 |= 64;
                        i2 = 6;
                        break;
                    case 7:
                        i3 |= 128;
                        affiliateUserType2 = (AffiliateUserType) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], affiliateUserType2);
                        i2 = 6;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            str = strDecodeStringElement4;
            z = zDecodeBooleanElement4;
            i = i3;
            str2 = str6;
            groupRole = groupRole3;
            str3 = strDecodeStringElement6;
            affiliateUserType = affiliateUserType2;
            str4 = strDecodeStringElement5;
            z2 = zDecodeBooleanElement3;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupUserSettingInfo(i, str3, str4, str, str2, groupRole, z, z2, affiliateUserType, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupUserSettingInfo groupUserSettingInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupUserSettingInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupUserSettingInfo.write$Self$OKIMCore_okimcore(groupUserSettingInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
