package com.okinc.okimcore.model.other;

import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus;
import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus$$serializer;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo$$serializer;
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

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class GroupMemberInfo$$serializer implements GeneratedSerializer<GroupMemberInfo> {
    public static final int $stable;
    public static final GroupMemberInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupMemberInfo$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupMemberInfo$$serializer groupMemberInfo$$serializer = new GroupMemberInfo$$serializer();
        INSTANCE = groupMemberInfo$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.other.GroupMemberInfo", groupMemberInfo$$serializer, 13);
        pluginGeneratedSerialDescriptor.addElement("memberId", false);
        pluginGeneratedSerialDescriptor.addElement("groupId", false);
        pluginGeneratedSerialDescriptor.addElement("name", false);
        pluginGeneratedSerialDescriptor.addElement("nickName", false);
        pluginGeneratedSerialDescriptor.addElement("remarkName", false);
        pluginGeneratedSerialDescriptor.addElement("avatar", false);
        pluginGeneratedSerialDescriptor.addElement("isCurrentUser", true);
        pluginGeneratedSerialDescriptor.addElement("role", false);
        pluginGeneratedSerialDescriptor.addElement("officialTags", true);
        pluginGeneratedSerialDescriptor.addElement("enPetname", true);
        pluginGeneratedSerialDescriptor.addElement("displayAlphabetText", true);
        pluginGeneratedSerialDescriptor.addElement("phoneName", true);
        pluginGeneratedSerialDescriptor.addElement("paidGroupMemberStatus", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr = GroupMemberInfo.$childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new KSerializer[]{stringSerializer, stringSerializer, stringSerializer, stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BooleanSerializer.INSTANCE, kSerializerArr[7], BuiltinSerializersKt.getNullable(OfficialTagInfo$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(stringSerializer), stringSerializer, BuiltinSerializersKt.getNullable(stringSerializer), BuiltinSerializersKt.getNullable(PaidGroupMemberStatus$$serializer.INSTANCE)};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupMemberInfo deserialize(@NotNull Decoder decoder) {
        PaidGroupMemberStatus paidGroupMemberStatus;
        OfficialTagInfo officialTagInfo;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        String str7;
        String str8;
        int i;
        GroupRole groupRole;
        String str9;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        KSerializer[] kSerializerArr = GroupMemberInfo.$childSerializers;
        int i2 = 10;
        int i3 = 9;
        String strDecodeStringElement = null;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            String strDecodeStringElement2 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
            String strDecodeStringElement3 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
            String strDecodeStringElement4 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
            String strDecodeStringElement5 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            String str10 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, null);
            String strDecodeStringElement6 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
            boolean zDecodeBooleanElement = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
            GroupRole groupRole2 = (GroupRole) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], null);
            OfficialTagInfo officialTagInfo2 = (OfficialTagInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, OfficialTagInfo$$serializer.INSTANCE, null);
            String str11 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 9, stringSerializer, null);
            String strDecodeStringElement7 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 10);
            String str12 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, stringSerializer, null);
            groupRole = groupRole2;
            paidGroupMemberStatus = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 12, PaidGroupMemberStatus$$serializer.INSTANCE, null);
            str4 = strDecodeStringElement7;
            str = str11;
            z = zDecodeBooleanElement;
            officialTagInfo = officialTagInfo2;
            str2 = str12;
            str8 = str10;
            str9 = strDecodeStringElement4;
            str5 = strDecodeStringElement3;
            str6 = strDecodeStringElement2;
            str3 = strDecodeStringElement6;
            str7 = strDecodeStringElement5;
            i = 8191;
        } else {
            int i4 = 12;
            int i5 = 0;
            boolean zDecodeBooleanElement2 = false;
            PaidGroupMemberStatus paidGroupMemberStatus2 = null;
            OfficialTagInfo officialTagInfo3 = null;
            GroupRole groupRole3 = null;
            String str13 = null;
            String strDecodeStringElement8 = null;
            String strDecodeStringElement9 = null;
            String str14 = null;
            String strDecodeStringElement10 = null;
            String strDecodeStringElement11 = null;
            String strDecodeStringElement12 = null;
            boolean z2 = true;
            String str15 = null;
            while (z2) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z2 = false;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 0:
                        strDecodeStringElement12 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i5 |= 1;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 1:
                        strDecodeStringElement11 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 2:
                        strDecodeStringElement10 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i5 |= 4;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 3:
                        strDecodeStringElement = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i5 |= 8;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 4:
                        str14 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, str14);
                        i5 |= 16;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 5:
                        strDecodeStringElement8 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i5 |= 32;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 6:
                        zDecodeBooleanElement2 = compositeDecoderBeginStructure.decodeBooleanElement(serialDescriptor, 6);
                        i5 |= 64;
                        i4 = 12;
                        break;
                    case 7:
                        groupRole3 = (GroupRole) compositeDecoderBeginStructure.decodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], groupRole3);
                        i5 |= 128;
                        i4 = 12;
                        i2 = 10;
                        i3 = 9;
                        break;
                    case 8:
                        i5 |= 256;
                        officialTagInfo3 = (OfficialTagInfo) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, OfficialTagInfo$$serializer.INSTANCE, officialTagInfo3);
                        i4 = 12;
                        break;
                    case 9:
                        i5 |= 512;
                        str13 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str13);
                        i4 = 12;
                        break;
                    case 10:
                        i5 |= 1024;
                        strDecodeStringElement9 = compositeDecoderBeginStructure.decodeStringElement(serialDescriptor, i2);
                        i4 = 12;
                        break;
                    case 11:
                        i5 |= 2048;
                        str15 = (String) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, str15);
                        i4 = 12;
                        break;
                    case 12:
                        paidGroupMemberStatus2 = (PaidGroupMemberStatus) compositeDecoderBeginStructure.decodeNullableSerializableElement(serialDescriptor, i4, PaidGroupMemberStatus$$serializer.INSTANCE, paidGroupMemberStatus2);
                        i5 |= 4096;
                        i4 = 12;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            String str16 = str14;
            paidGroupMemberStatus = paidGroupMemberStatus2;
            officialTagInfo = officialTagInfo3;
            str = str13;
            str2 = str15;
            str3 = strDecodeStringElement8;
            str4 = strDecodeStringElement9;
            str5 = strDecodeStringElement11;
            str6 = strDecodeStringElement12;
            z = zDecodeBooleanElement2;
            str7 = strDecodeStringElement;
            str8 = str16;
            i = i5;
            groupRole = groupRole3;
            str9 = strDecodeStringElement10;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupMemberInfo(i, str6, str5, str9, str7, str8, str3, z, groupRole, officialTagInfo, str, str4, str2, paidGroupMemberStatus, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupMemberInfo groupMemberInfo) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupMemberInfo, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupMemberInfo.write$Self$OKIMCore_okimcore(groupMemberInfo, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
