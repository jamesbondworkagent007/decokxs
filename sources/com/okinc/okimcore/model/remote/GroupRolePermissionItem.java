package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupRolePermissionItem {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int isCanAddMember;
    private final int isCanAllowMembersToAddMembers;
    private final int isCanDismissGroup;
    private final int isCanModifyAvatar;
    private final int isCanModifyNotice;
    private final int isCanModifyPetname;
    private final int isCanMute;
    private final int isCanQuitGroup;
    private final int isCanRemoveMember;
    private final int isCanSendLink;
    private final int isCanSendPrivateMessage;
    private final int isCanSetAsset;
    private final int isCanSetAudit;
    private final int isCanSetManager;
    private final int isCanSetMentionOthers;
    private final int isCanSetMentionedRobot;
    private final int isCanSetPay;
    private final int isCanShareInvitationQrCode;
    private final int isCanShowBlockList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupRolePermissionItem() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 524287, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.isCanAddMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.isCanSendPrivateMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.isCanSetAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.isCanSetAudit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.isCanSetManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component14() {
        return this.isCanSetMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.isCanSetMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.isCanSetPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component17() {
        return this.isCanShowBlockList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.isCanAllowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.isCanShareInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.isCanDismissGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.isCanModifyAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.isCanModifyNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.isCanModifyPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.isCanMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.isCanQuitGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component8() {
        return this.isCanRemoveMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.isCanSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupRolePermissionItem copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        return new GroupRolePermissionItem(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupRolePermissionItem)) {
            return false;
        }
        GroupRolePermissionItem groupRolePermissionItem = (GroupRolePermissionItem) obj;
        return this.isCanAddMember == groupRolePermissionItem.isCanAddMember && this.isCanDismissGroup == groupRolePermissionItem.isCanDismissGroup && this.isCanModifyAvatar == groupRolePermissionItem.isCanModifyAvatar && this.isCanModifyNotice == groupRolePermissionItem.isCanModifyNotice && this.isCanModifyPetname == groupRolePermissionItem.isCanModifyPetname && this.isCanMute == groupRolePermissionItem.isCanMute && this.isCanQuitGroup == groupRolePermissionItem.isCanQuitGroup && this.isCanRemoveMember == groupRolePermissionItem.isCanRemoveMember && this.isCanSendLink == groupRolePermissionItem.isCanSendLink && this.isCanSendPrivateMessage == groupRolePermissionItem.isCanSendPrivateMessage && this.isCanSetAsset == groupRolePermissionItem.isCanSetAsset && this.isCanSetAudit == groupRolePermissionItem.isCanSetAudit && this.isCanSetManager == groupRolePermissionItem.isCanSetManager && this.isCanSetMentionOthers == groupRolePermissionItem.isCanSetMentionOthers && this.isCanSetMentionedRobot == groupRolePermissionItem.isCanSetMentionedRobot && this.isCanSetPay == groupRolePermissionItem.isCanSetPay && this.isCanShowBlockList == groupRolePermissionItem.isCanShowBlockList && this.isCanAllowMembersToAddMembers == groupRolePermissionItem.isCanAllowMembersToAddMembers && this.isCanShareInvitationQrCode == groupRolePermissionItem.isCanShareInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((Integer.hashCode(this.isCanAddMember) * 31) + Integer.hashCode(this.isCanDismissGroup)) * 31) + Integer.hashCode(this.isCanModifyAvatar)) * 31) + Integer.hashCode(this.isCanModifyNotice)) * 31) + Integer.hashCode(this.isCanModifyPetname)) * 31) + Integer.hashCode(this.isCanMute)) * 31) + Integer.hashCode(this.isCanQuitGroup)) * 31) + Integer.hashCode(this.isCanRemoveMember)) * 31) + Integer.hashCode(this.isCanSendLink)) * 31) + Integer.hashCode(this.isCanSendPrivateMessage)) * 31) + Integer.hashCode(this.isCanSetAsset)) * 31) + Integer.hashCode(this.isCanSetAudit)) * 31) + Integer.hashCode(this.isCanSetManager)) * 31) + Integer.hashCode(this.isCanSetMentionOthers)) * 31) + Integer.hashCode(this.isCanSetMentionedRobot)) * 31) + Integer.hashCode(this.isCanSetPay)) * 31) + Integer.hashCode(this.isCanShowBlockList)) * 31) + Integer.hashCode(this.isCanAllowMembersToAddMembers)) * 31) + Integer.hashCode(this.isCanShareInvitationQrCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanAddMember() {
        return this.isCanAddMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanAllowMembersToAddMembers() {
        return this.isCanAllowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanDismissGroup() {
        return this.isCanDismissGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanModifyAvatar() {
        return this.isCanModifyAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanModifyNotice() {
        return this.isCanModifyNotice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanModifyPetname() {
        return this.isCanModifyPetname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanMute() {
        return this.isCanMute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanQuitGroup() {
        return this.isCanQuitGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanRemoveMember() {
        return this.isCanRemoveMember;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSendLink() {
        return this.isCanSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSendPrivateMessage() {
        return this.isCanSendPrivateMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSetAsset() {
        return this.isCanSetAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSetAudit() {
        return this.isCanSetAudit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSetManager() {
        return this.isCanSetManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSetMentionOthers() {
        return this.isCanSetMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSetMentionedRobot() {
        return this.isCanSetMentionedRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanSetPay() {
        return this.isCanSetPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanShareInvitationQrCode() {
        return this.isCanShareInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isCanShowBlockList() {
        return this.isCanShowBlockList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupRolePermissionItem(isCanAddMember=" + this.isCanAddMember + ", isCanDismissGroup=" + this.isCanDismissGroup + ", isCanModifyAvatar=" + this.isCanModifyAvatar + ", isCanModifyNotice=" + this.isCanModifyNotice + ", isCanModifyPetname=" + this.isCanModifyPetname + ", isCanMute=" + this.isCanMute + ", isCanQuitGroup=" + this.isCanQuitGroup + ", isCanRemoveMember=" + this.isCanRemoveMember + ", isCanSendLink=" + this.isCanSendLink + ", isCanSendPrivateMessage=" + this.isCanSendPrivateMessage + ", isCanSetAsset=" + this.isCanSetAsset + ", isCanSetAudit=" + this.isCanSetAudit + ", isCanSetManager=" + this.isCanSetManager + ", isCanSetMentionOthers=" + this.isCanSetMentionOthers + ", isCanSetMentionedRobot=" + this.isCanSetMentionedRobot + ", isCanSetPay=" + this.isCanSetPay + ", isCanShowBlockList=" + this.isCanShowBlockList + ", isCanAllowMembersToAddMembers=" + this.isCanAllowMembersToAddMembers + ", isCanShareInvitationQrCode=" + this.isCanShareInvitationQrCode + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupRolePermissionItem.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupRolePermissionItem> serializer() {
            return GroupRolePermissionItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupRolePermissionItem(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.isCanAddMember = 0;
        } else {
            this.isCanAddMember = i2;
        }
        if ((i & 2) == 0) {
            this.isCanDismissGroup = 0;
        } else {
            this.isCanDismissGroup = i3;
        }
        if ((i & 4) == 0) {
            this.isCanModifyAvatar = 0;
        } else {
            this.isCanModifyAvatar = i4;
        }
        if ((i & 8) == 0) {
            this.isCanModifyNotice = 0;
        } else {
            this.isCanModifyNotice = i5;
        }
        if ((i & 16) == 0) {
            this.isCanModifyPetname = 0;
        } else {
            this.isCanModifyPetname = i6;
        }
        if ((i & 32) == 0) {
            this.isCanMute = 0;
        } else {
            this.isCanMute = i7;
        }
        if ((i & 64) == 0) {
            this.isCanQuitGroup = 0;
        } else {
            this.isCanQuitGroup = i8;
        }
        if ((i & 128) == 0) {
            this.isCanRemoveMember = 0;
        } else {
            this.isCanRemoveMember = i9;
        }
        if ((i & 256) == 0) {
            this.isCanSendLink = 0;
        } else {
            this.isCanSendLink = i10;
        }
        if ((i & 512) == 0) {
            this.isCanSendPrivateMessage = 0;
        } else {
            this.isCanSendPrivateMessage = i11;
        }
        if ((i & 1024) == 0) {
            this.isCanSetAsset = 0;
        } else {
            this.isCanSetAsset = i12;
        }
        if ((i & 2048) == 0) {
            this.isCanSetAudit = 0;
        } else {
            this.isCanSetAudit = i13;
        }
        if ((i & 4096) == 0) {
            this.isCanSetManager = 0;
        } else {
            this.isCanSetManager = i14;
        }
        if ((i & 8192) == 0) {
            this.isCanSetMentionOthers = 0;
        } else {
            this.isCanSetMentionOthers = i15;
        }
        if ((i & 16384) == 0) {
            this.isCanSetMentionedRobot = 0;
        } else {
            this.isCanSetMentionedRobot = i16;
        }
        if ((32768 & i) == 0) {
            this.isCanSetPay = 0;
        } else {
            this.isCanSetPay = i17;
        }
        if ((65536 & i) == 0) {
            this.isCanShowBlockList = 0;
        } else {
            this.isCanShowBlockList = i18;
        }
        if ((131072 & i) == 0) {
            this.isCanAllowMembersToAddMembers = 0;
        } else {
            this.isCanAllowMembersToAddMembers = i19;
        }
        if ((i & 262144) == 0) {
            this.isCanShareInvitationQrCode = 0;
        } else {
            this.isCanShareInvitationQrCode = i20;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupRolePermissionItem groupRolePermissionItem, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupRolePermissionItem.isCanAddMember != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, groupRolePermissionItem.isCanAddMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupRolePermissionItem.isCanDismissGroup != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, groupRolePermissionItem.isCanDismissGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupRolePermissionItem.isCanModifyAvatar != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, groupRolePermissionItem.isCanModifyAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupRolePermissionItem.isCanModifyNotice != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, groupRolePermissionItem.isCanModifyNotice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupRolePermissionItem.isCanModifyPetname != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, groupRolePermissionItem.isCanModifyPetname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupRolePermissionItem.isCanMute != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 5, groupRolePermissionItem.isCanMute);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || groupRolePermissionItem.isCanQuitGroup != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, groupRolePermissionItem.isCanQuitGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || groupRolePermissionItem.isCanRemoveMember != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 7, groupRolePermissionItem.isCanRemoveMember);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || groupRolePermissionItem.isCanSendLink != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, groupRolePermissionItem.isCanSendLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || groupRolePermissionItem.isCanSendPrivateMessage != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, groupRolePermissionItem.isCanSendPrivateMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || groupRolePermissionItem.isCanSetAsset != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, groupRolePermissionItem.isCanSetAsset);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || groupRolePermissionItem.isCanSetAudit != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, groupRolePermissionItem.isCanSetAudit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || groupRolePermissionItem.isCanSetManager != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, groupRolePermissionItem.isCanSetManager);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || groupRolePermissionItem.isCanSetMentionOthers != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 13, groupRolePermissionItem.isCanSetMentionOthers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || groupRolePermissionItem.isCanSetMentionedRobot != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 14, groupRolePermissionItem.isCanSetMentionedRobot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || groupRolePermissionItem.isCanSetPay != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, groupRolePermissionItem.isCanSetPay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || groupRolePermissionItem.isCanShowBlockList != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 16, groupRolePermissionItem.isCanShowBlockList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || groupRolePermissionItem.isCanAllowMembersToAddMembers != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 17, groupRolePermissionItem.isCanAllowMembersToAddMembers);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) && groupRolePermissionItem.isCanShareInvitationQrCode == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 18, groupRolePermissionItem.isCanShareInvitationQrCode);
    }

    public GroupRolePermissionItem(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.isCanAddMember = i;
        this.isCanDismissGroup = i2;
        this.isCanModifyAvatar = i3;
        this.isCanModifyNotice = i4;
        this.isCanModifyPetname = i5;
        this.isCanMute = i6;
        this.isCanQuitGroup = i7;
        this.isCanRemoveMember = i8;
        this.isCanSendLink = i9;
        this.isCanSendPrivateMessage = i10;
        this.isCanSetAsset = i11;
        this.isCanSetAudit = i12;
        this.isCanSetManager = i13;
        this.isCanSetMentionOthers = i14;
        this.isCanSetMentionedRobot = i15;
        this.isCanSetPay = i16;
        this.isCanShowBlockList = i17;
        this.isCanAllowMembersToAddMembers = i18;
        this.isCanShareInvitationQrCode = i19;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ce: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000a: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r22v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002a: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0032: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x003a: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0042: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r29v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004a: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0052: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005a: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r32v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0062: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006a: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r34v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0072: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r35v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x007d: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0088: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r37v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0093: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r38v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009e: ARITH (r40v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r39v0 int))
 A[MD:(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int):void (m)] (LINE:108) call: com.okinc.okimcore.model.remote.GroupRolePermissionItem.<init>(int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int):void type: THIS */
    public /* synthetic */ GroupRolePermissionItem(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, DefaultConstructorMarker defaultConstructorMarker) {
        this((i20 & 1) != 0 ? 0 : i, (i20 & 2) != 0 ? 0 : i2, (i20 & 4) != 0 ? 0 : i3, (i20 & 8) != 0 ? 0 : i4, (i20 & 16) != 0 ? 0 : i5, (i20 & 32) != 0 ? 0 : i6, (i20 & 64) != 0 ? 0 : i7, (i20 & 128) != 0 ? 0 : i8, (i20 & 256) != 0 ? 0 : i9, (i20 & 512) != 0 ? 0 : i10, (i20 & 1024) != 0 ? 0 : i11, (i20 & 2048) != 0 ? 0 : i12, (i20 & 4096) != 0 ? 0 : i13, (i20 & 8192) != 0 ? 0 : i14, (i20 & 16384) != 0 ? 0 : i15, (i20 & 32768) != 0 ? 0 : i16, (i20 & 65536) != 0 ? 0 : i17, (i20 & 131072) != 0 ? 0 : i18, (i20 & 262144) != 0 ? 0 : i19);
    }
}
