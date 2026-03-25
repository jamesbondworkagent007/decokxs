package com.okinc.okimcore.model.remote;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class SetGroupSettingsReq {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long allowMembersSendMessage;
    private final Long allowMembersToAddMembers;
    private final Long allowMentionOthers;
    private final Long allowMentionRobot;
    private final Long allowPrivateChat;
    private final Long allowSendLink;
    private final Long allowSharingInvitationQrCode;
    private final Long allowViewHistory;
    private final String bizGroupName;
    private final Integer disbandGroup;
    private final String groupAvatar;
    private final String groupDescription;
    private final Long groupId;
    private final String groupName;
    private final Long publicType;
    private final Integer requireAdminApprovalToJoin;
    private final Integer upgradeToSuperGroup;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SetGroupSettingsReq() {
        this((Long) null, (Long) null, (String) null, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, (Integer) null, (String) null, (Integer) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.allowMembersSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.allowViewHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.disbandGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component13() {
        return this.allowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component14() {
        return this.allowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component15() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component17() {
        return this.upgradeToSuperGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.allowMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.publicType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.allowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.allowPrivateChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.allowMentionRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SetGroupSettingsReq copy(Long l, Long l2, String str, String str2, String str3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num, Long l9, Long l10, Integer num2, String str4, Integer num3) {
        return new SetGroupSettingsReq(l, l2, str, str2, str3, l3, l4, l5, l6, l7, l8, num, l9, l10, num2, str4, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetGroupSettingsReq)) {
            return false;
        }
        SetGroupSettingsReq setGroupSettingsReq = (SetGroupSettingsReq) obj;
        return Intrinsics.EZpvd(this.groupId, setGroupSettingsReq.groupId) && Intrinsics.EZpvd(this.allowMentionOthers, setGroupSettingsReq.allowMentionOthers) && Intrinsics.EZpvd((Object) this.groupName, (Object) setGroupSettingsReq.groupName) && Intrinsics.EZpvd((Object) this.bizGroupName, (Object) setGroupSettingsReq.bizGroupName) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) setGroupSettingsReq.groupAvatar) && Intrinsics.EZpvd(this.publicType, setGroupSettingsReq.publicType) && Intrinsics.EZpvd(this.allowSendLink, setGroupSettingsReq.allowSendLink) && Intrinsics.EZpvd(this.allowPrivateChat, setGroupSettingsReq.allowPrivateChat) && Intrinsics.EZpvd(this.allowMentionRobot, setGroupSettingsReq.allowMentionRobot) && Intrinsics.EZpvd(this.allowMembersSendMessage, setGroupSettingsReq.allowMembersSendMessage) && Intrinsics.EZpvd(this.allowViewHistory, setGroupSettingsReq.allowViewHistory) && Intrinsics.EZpvd(this.disbandGroup, setGroupSettingsReq.disbandGroup) && Intrinsics.EZpvd(this.allowMembersToAddMembers, setGroupSettingsReq.allowMembersToAddMembers) && Intrinsics.EZpvd(this.allowSharingInvitationQrCode, setGroupSettingsReq.allowSharingInvitationQrCode) && Intrinsics.EZpvd(this.requireAdminApprovalToJoin, setGroupSettingsReq.requireAdminApprovalToJoin) && Intrinsics.EZpvd((Object) this.groupDescription, (Object) setGroupSettingsReq.groupDescription) && Intrinsics.EZpvd(this.upgradeToSuperGroup, setGroupSettingsReq.upgradeToSuperGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowMembersSendMessage() {
        return this.allowMembersSendMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowMembersToAddMembers() {
        return this.allowMembersToAddMembers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowMentionOthers() {
        return this.allowMentionOthers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowMentionRobot() {
        return this.allowMentionRobot;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowPrivateChat() {
        return this.allowPrivateChat;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowSendLink() {
        return this.allowSendLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowSharingInvitationQrCode() {
        return this.allowSharingInvitationQrCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getAllowViewHistory() {
        return this.allowViewHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBizGroupName() {
        return this.bizGroupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getDisbandGroup() {
        return this.disbandGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupDescription() {
        return this.groupDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupName() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPublicType() {
        return this.publicType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRequireAdminApprovalToJoin() {
        return this.requireAdminApprovalToJoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getUpgradeToSuperGroup() {
        return this.upgradeToSuperGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.groupId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.allowMentionOthers;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.groupName;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.bizGroupName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.groupAvatar;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Long l3 = this.publicType;
        int iHashCode6 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.allowSendLink;
        int iHashCode7 = l4 == null ? 0 : l4.hashCode();
        Long l5 = this.allowPrivateChat;
        int iHashCode8 = l5 == null ? 0 : l5.hashCode();
        Long l6 = this.allowMentionRobot;
        int iHashCode9 = l6 == null ? 0 : l6.hashCode();
        Long l7 = this.allowMembersSendMessage;
        int iHashCode10 = l7 == null ? 0 : l7.hashCode();
        Long l8 = this.allowViewHistory;
        int iHashCode11 = l8 == null ? 0 : l8.hashCode();
        Integer num = this.disbandGroup;
        int iHashCode12 = num == null ? 0 : num.hashCode();
        Long l9 = this.allowMembersToAddMembers;
        int iHashCode13 = l9 == null ? 0 : l9.hashCode();
        Long l10 = this.allowSharingInvitationQrCode;
        int iHashCode14 = l10 == null ? 0 : l10.hashCode();
        Integer num2 = this.requireAdminApprovalToJoin;
        int iHashCode15 = num2 == null ? 0 : num2.hashCode();
        String str4 = this.groupDescription;
        int iHashCode16 = str4 == null ? 0 : str4.hashCode();
        Integer num3 = this.upgradeToSuperGroup;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SetGroupSettingsReq(groupId=" + this.groupId + ", allowMentionOthers=" + this.allowMentionOthers + ", groupName=" + this.groupName + ", bizGroupName=" + this.bizGroupName + ", groupAvatar=" + this.groupAvatar + ", publicType=" + this.publicType + ", allowSendLink=" + this.allowSendLink + ", allowPrivateChat=" + this.allowPrivateChat + ", allowMentionRobot=" + this.allowMentionRobot + ", allowMembersSendMessage=" + this.allowMembersSendMessage + ", allowViewHistory=" + this.allowViewHistory + ", disbandGroup=" + this.disbandGroup + ", allowMembersToAddMembers=" + this.allowMembersToAddMembers + ", allowSharingInvitationQrCode=" + this.allowSharingInvitationQrCode + ", requireAdminApprovalToJoin=" + this.requireAdminApprovalToJoin + ", groupDescription=" + this.groupDescription + ", upgradeToSuperGroup=" + this.upgradeToSuperGroup + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.SetGroupSettingsReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SetGroupSettingsReq> serializer() {
            return SetGroupSettingsReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SetGroupSettingsReq(int i, Long l, Long l2, String str, String str2, String str3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num, Long l9, Long l10, Integer num2, String str4, Integer num3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 2) == 0) {
            this.allowMentionOthers = null;
        } else {
            this.allowMentionOthers = l2;
        }
        if ((i & 4) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str;
        }
        if ((i & 8) == 0) {
            this.bizGroupName = null;
        } else {
            this.bizGroupName = str2;
        }
        if ((i & 16) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str3;
        }
        if ((i & 32) == 0) {
            this.publicType = null;
        } else {
            this.publicType = l3;
        }
        if ((i & 64) == 0) {
            this.allowSendLink = null;
        } else {
            this.allowSendLink = l4;
        }
        if ((i & 128) == 0) {
            this.allowPrivateChat = null;
        } else {
            this.allowPrivateChat = l5;
        }
        if ((i & 256) == 0) {
            this.allowMentionRobot = null;
        } else {
            this.allowMentionRobot = l6;
        }
        if ((i & 512) == 0) {
            this.allowMembersSendMessage = null;
        } else {
            this.allowMembersSendMessage = l7;
        }
        if ((i & 1024) == 0) {
            this.allowViewHistory = null;
        } else {
            this.allowViewHistory = l8;
        }
        if ((i & 2048) == 0) {
            this.disbandGroup = null;
        } else {
            this.disbandGroup = num;
        }
        if ((i & 4096) == 0) {
            this.allowMembersToAddMembers = null;
        } else {
            this.allowMembersToAddMembers = l9;
        }
        if ((i & 8192) == 0) {
            this.allowSharingInvitationQrCode = null;
        } else {
            this.allowSharingInvitationQrCode = l10;
        }
        if ((i & 16384) == 0) {
            this.requireAdminApprovalToJoin = null;
        } else {
            this.requireAdminApprovalToJoin = num2;
        }
        if ((32768 & i) == 0) {
            this.groupDescription = null;
        } else {
            this.groupDescription = str4;
        }
        if ((i & 65536) == 0) {
            this.upgradeToSuperGroup = null;
        } else {
            this.upgradeToSuperGroup = num3;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(SetGroupSettingsReq setGroupSettingsReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || setGroupSettingsReq.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, setGroupSettingsReq.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || setGroupSettingsReq.allowMentionOthers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, setGroupSettingsReq.allowMentionOthers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || setGroupSettingsReq.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, setGroupSettingsReq.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || setGroupSettingsReq.bizGroupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, setGroupSettingsReq.bizGroupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || setGroupSettingsReq.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, setGroupSettingsReq.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || setGroupSettingsReq.publicType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, setGroupSettingsReq.publicType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || setGroupSettingsReq.allowSendLink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, LongSerializer.INSTANCE, setGroupSettingsReq.allowSendLink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || setGroupSettingsReq.allowPrivateChat != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, setGroupSettingsReq.allowPrivateChat);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || setGroupSettingsReq.allowMentionRobot != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, LongSerializer.INSTANCE, setGroupSettingsReq.allowMentionRobot);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || setGroupSettingsReq.allowMembersSendMessage != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, setGroupSettingsReq.allowMembersSendMessage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || setGroupSettingsReq.allowViewHistory != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, setGroupSettingsReq.allowViewHistory);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || setGroupSettingsReq.disbandGroup != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, IntSerializer.INSTANCE, setGroupSettingsReq.disbandGroup);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || setGroupSettingsReq.allowMembersToAddMembers != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, LongSerializer.INSTANCE, setGroupSettingsReq.allowMembersToAddMembers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || setGroupSettingsReq.allowSharingInvitationQrCode != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, LongSerializer.INSTANCE, setGroupSettingsReq.allowSharingInvitationQrCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || setGroupSettingsReq.requireAdminApprovalToJoin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, setGroupSettingsReq.requireAdminApprovalToJoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || setGroupSettingsReq.groupDescription != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, setGroupSettingsReq.groupDescription);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && setGroupSettingsReq.upgradeToSuperGroup == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, IntSerializer.INSTANCE, setGroupSettingsReq.upgradeToSuperGroup);
    }

    public SetGroupSettingsReq(Long l, Long l2, String str, String str2, String str3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num, Long l9, Long l10, Integer num2, String str4, Integer num3) {
        this.groupId = l;
        this.allowMentionOthers = l2;
        this.groupName = str;
        this.bizGroupName = str2;
        this.groupAvatar = str3;
        this.publicType = l3;
        this.allowSendLink = l4;
        this.allowPrivateChat = l5;
        this.allowMentionRobot = l6;
        this.allowMembersSendMessage = l7;
        this.allowViewHistory = l8;
        this.disbandGroup = num;
        this.allowMembersToAddMembers = l9;
        this.allowSharingInvitationQrCode = l10;
        this.requireAdminApprovalToJoin = num2;
        this.groupDescription = str4;
        this.upgradeToSuperGroup = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r24v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r25v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r26v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r27v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r29v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r30v0 java.lang.Integer))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r31v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r32v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r33v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r35v0 java.lang.Integer))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer):void (m)] (LINE:75) call: com.okinc.okimcore.model.remote.SetGroupSettingsReq.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ SetGroupSettingsReq(Long l, Long l2, String str, String str2, String str3, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Integer num, Long l9, Long l10, Integer num2, String str4, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : l4, (i & 128) != 0 ? null : l5, (i & 256) != 0 ? null : l6, (i & 512) != 0 ? null : l7, (i & 1024) != 0 ? null : l8, (i & 2048) != 0 ? null : num, (i & 4096) != 0 ? null : l9, (i & 8192) != 0 ? null : l10, (i & 16384) != 0 ? null : num2, (i & 32768) != 0 ? null : str4, (i & 65536) != 0 ? null : num3);
    }
}
