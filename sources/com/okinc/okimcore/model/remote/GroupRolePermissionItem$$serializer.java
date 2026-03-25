package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class GroupRolePermissionItem$$serializer implements GeneratedSerializer<GroupRolePermissionItem> {
    public static final int $stable;
    public static final GroupRolePermissionItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private GroupRolePermissionItem$$serializer() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        GroupRolePermissionItem$$serializer groupRolePermissionItem$$serializer = new GroupRolePermissionItem$$serializer();
        INSTANCE = groupRolePermissionItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.okinc.okimcore.model.remote.GroupRolePermissionItem", groupRolePermissionItem$$serializer, 19);
        pluginGeneratedSerialDescriptor.addElement("isCanAddMember", true);
        pluginGeneratedSerialDescriptor.addElement("isCanDismissGroup", true);
        pluginGeneratedSerialDescriptor.addElement("isCanModifyAvatar", true);
        pluginGeneratedSerialDescriptor.addElement("isCanModifyNotice", true);
        pluginGeneratedSerialDescriptor.addElement("isCanModifyPetname", true);
        pluginGeneratedSerialDescriptor.addElement("isCanMute", true);
        pluginGeneratedSerialDescriptor.addElement("isCanQuitGroup", true);
        pluginGeneratedSerialDescriptor.addElement("isCanRemoveMember", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSendLink", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSendPrivateMessage", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSetAsset", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSetAudit", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSetManager", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSetMentionOthers", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSetMentionedRobot", true);
        pluginGeneratedSerialDescriptor.addElement("isCanSetPay", true);
        pluginGeneratedSerialDescriptor.addElement("isCanShowBlockList", true);
        pluginGeneratedSerialDescriptor.addElement("isCanAllowMembersToAddMembers", true);
        pluginGeneratedSerialDescriptor.addElement("isCanShareInvitationQrCode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        return new KSerializer[]{intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer, intSerializer};
    }

    /* JADX DEBUG: Method merged with bridge method: deserialize(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object; */
    @Override // kotlinx.serialization.DeserializationStrategy
    public final GroupRolePermissionItem deserialize(@NotNull Decoder decoder) {
        int iDecodeIntElement;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int iDecodeIntElement2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iDecodeIntElement3;
        int iDecodeIntElement4;
        int i14;
        int i15;
        int i16;
        Intrinsics.checkNotNullParameter(decoder, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(serialDescriptor);
        int i17 = 4;
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            int iDecodeIntElement5 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
            int iDecodeIntElement6 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
            int iDecodeIntElement7 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
            int iDecodeIntElement8 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
            int iDecodeIntElement9 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 4);
            iDecodeIntElement3 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
            int iDecodeIntElement10 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
            int iDecodeIntElement11 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
            int iDecodeIntElement12 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
            int iDecodeIntElement13 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
            int iDecodeIntElement14 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
            int iDecodeIntElement15 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
            int iDecodeIntElement16 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
            int iDecodeIntElement17 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
            int iDecodeIntElement18 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
            int iDecodeIntElement19 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
            int iDecodeIntElement20 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
            iDecodeIntElement4 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
            iDecodeIntElement2 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 18);
            i16 = iDecodeIntElement17;
            i14 = iDecodeIntElement20;
            iDecodeIntElement = iDecodeIntElement19;
            i3 = iDecodeIntElement18;
            i5 = iDecodeIntElement12;
            i10 = iDecodeIntElement14;
            i11 = iDecodeIntElement13;
            i13 = iDecodeIntElement10;
            i4 = iDecodeIntElement9;
            i6 = iDecodeIntElement7;
            i7 = iDecodeIntElement6;
            i15 = iDecodeIntElement16;
            i = 524287;
            i9 = iDecodeIntElement15;
            i2 = iDecodeIntElement5;
            i12 = iDecodeIntElement11;
            i8 = iDecodeIntElement8;
        } else {
            int i18 = 0;
            int i19 = 18;
            int iDecodeIntElement21 = 0;
            int iDecodeIntElement22 = 0;
            int iDecodeIntElement23 = 0;
            iDecodeIntElement = 0;
            int iDecodeIntElement24 = 0;
            int iDecodeIntElement25 = 0;
            int iDecodeIntElement26 = 0;
            int iDecodeIntElement27 = 0;
            int iDecodeIntElement28 = 0;
            int iDecodeIntElement29 = 0;
            int iDecodeIntElement30 = 0;
            int iDecodeIntElement31 = 0;
            int iDecodeIntElement32 = 0;
            int iDecodeIntElement33 = 0;
            int iDecodeIntElement34 = 0;
            int iDecodeIntElement35 = 0;
            int iDecodeIntElement36 = 0;
            int iDecodeIntElement37 = 0;
            int iDecodeIntElement38 = 0;
            boolean z = true;
            while (z) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(serialDescriptor);
                switch (iDecodeElementIndex) {
                    case -1:
                        z = false;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 0:
                        iDecodeIntElement23 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 0);
                        i18 |= 1;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 1:
                        iDecodeIntElement28 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 1);
                        i18 |= 2;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 2:
                        iDecodeIntElement27 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 2);
                        i18 |= 4;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 3:
                        iDecodeIntElement30 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 3);
                        i18 |= 8;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 4:
                        iDecodeIntElement25 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i17);
                        i18 |= 16;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 5:
                        iDecodeIntElement37 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 5);
                        i18 |= 32;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 6:
                        iDecodeIntElement36 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 6);
                        i18 |= 64;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 7:
                        iDecodeIntElement35 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 7);
                        i18 |= 128;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 8:
                        iDecodeIntElement26 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 8);
                        i18 |= 256;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 9:
                        iDecodeIntElement34 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 9);
                        i18 |= 512;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 10:
                        iDecodeIntElement33 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 10);
                        i18 |= 1024;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 11:
                        iDecodeIntElement32 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 11);
                        i18 |= 2048;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 12:
                        iDecodeIntElement31 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 12);
                        i18 |= 4096;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 13:
                        iDecodeIntElement38 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 13);
                        i18 |= 8192;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 14:
                        iDecodeIntElement24 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 14);
                        i18 |= 16384;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 15:
                        iDecodeIntElement = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 15);
                        i18 |= 32768;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 16:
                        iDecodeIntElement22 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 16);
                        i18 |= 65536;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 17:
                        iDecodeIntElement21 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, 17);
                        i18 |= 131072;
                        i17 = 4;
                        i19 = 18;
                        break;
                    case 18:
                        iDecodeIntElement29 = compositeDecoderBeginStructure.decodeIntElement(serialDescriptor, i19);
                        i18 |= 262144;
                        i17 = 4;
                        i19 = 18;
                        break;
                    default:
                        throw new UnknownFieldException(iDecodeElementIndex);
                }
            }
            i = i18;
            i2 = iDecodeIntElement23;
            i3 = iDecodeIntElement24;
            i4 = iDecodeIntElement25;
            i5 = iDecodeIntElement26;
            i6 = iDecodeIntElement27;
            i7 = iDecodeIntElement28;
            iDecodeIntElement2 = iDecodeIntElement29;
            i8 = iDecodeIntElement30;
            i9 = iDecodeIntElement32;
            i10 = iDecodeIntElement33;
            i11 = iDecodeIntElement34;
            i12 = iDecodeIntElement35;
            i13 = iDecodeIntElement36;
            iDecodeIntElement3 = iDecodeIntElement37;
            iDecodeIntElement4 = iDecodeIntElement21;
            i14 = iDecodeIntElement22;
            i15 = iDecodeIntElement31;
            i16 = iDecodeIntElement38;
        }
        compositeDecoderBeginStructure.endStructure(serialDescriptor);
        return new GroupRolePermissionItem(i, i2, i7, i6, i8, i4, iDecodeIntElement3, i13, i12, i5, i11, i10, i9, i15, i16, i3, iDecodeIntElement, i14, iDecodeIntElement4, iDecodeIntElement2, (SerializationConstructorMarker) null);
    }

    /* JADX DEBUG: Method merged with bridge method: serialize(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V */
    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(@NotNull Encoder encoder, @NotNull GroupRolePermissionItem groupRolePermissionItem) {
        Intrinsics.checkNotNullParameter(encoder, "");
        Intrinsics.checkNotNullParameter(groupRolePermissionItem, "");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
        GroupRolePermissionItem.write$Self$OKIMCore_okimcore(groupRolePermissionItem, compositeEncoderBeginStructure, serialDescriptor);
        compositeEncoderBeginStructure.endStructure(serialDescriptor);
    }
}
