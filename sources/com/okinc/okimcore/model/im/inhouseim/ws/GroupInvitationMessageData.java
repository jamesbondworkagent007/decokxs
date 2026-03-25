package com.okinc.okimcore.model.im.inhouseim.ws;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupInvitationMessageData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Long expireTime;
    private final String groupAvatar;
    private final Long groupId;
    private final String groupName;
    private final String invitationId;
    private final String inviterUid;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupInvitationMessageData() {
        this((String) null, (Long) null, (String) null, (String) null, (String) null, (Long) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupInvitationMessageData copy$default(GroupInvitationMessageData groupInvitationMessageData, String str, Long l, String str2, String str3, String str4, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = groupInvitationMessageData.invitationId;
        }
        if ((i & 2) != 0) {
            l = groupInvitationMessageData.groupId;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            str2 = groupInvitationMessageData.groupName;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = groupInvitationMessageData.groupAvatar;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = groupInvitationMessageData.inviterUid;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            l2 = groupInvitationMessageData.expireTime;
        }
        return groupInvitationMessageData.copy(str, l3, str5, str6, str7, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.groupName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.groupAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupInvitationMessageData copy(String str, Long l, String str2, String str3, String str4, Long l2) {
        return new GroupInvitationMessageData(str, l, str2, str3, str4, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupInvitationMessageData)) {
            return false;
        }
        GroupInvitationMessageData groupInvitationMessageData = (GroupInvitationMessageData) obj;
        return Intrinsics.EZpvd((Object) this.invitationId, (Object) groupInvitationMessageData.invitationId) && Intrinsics.EZpvd(this.groupId, groupInvitationMessageData.groupId) && Intrinsics.EZpvd((Object) this.groupName, (Object) groupInvitationMessageData.groupName) && Intrinsics.EZpvd((Object) this.groupAvatar, (Object) groupInvitationMessageData.groupAvatar) && Intrinsics.EZpvd((Object) this.inviterUid, (Object) groupInvitationMessageData.inviterUid) && Intrinsics.EZpvd(this.expireTime, groupInvitationMessageData.expireTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getExpireTime() {
        return this.expireTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupAvatar() {
        return this.groupAvatar;
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
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInviterUid() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.invitationId;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.groupId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        String str2 = this.groupName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.groupAvatar;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.inviterUid;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Long l2 = this.expireTime;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupInvitationMessageData(invitationId=" + this.invitationId + ", groupId=" + this.groupId + ", groupName=" + this.groupName + ", groupAvatar=" + this.groupAvatar + ", inviterUid=" + this.inviterUid + ", expireTime=" + this.expireTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupInvitationMessageData> serializer() {
            return GroupInvitationMessageData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupInvitationMessageData(int i, String str, Long l, String str2, String str3, String str4, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str;
        }
        if ((i & 2) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 4) == 0) {
            this.groupName = null;
        } else {
            this.groupName = str2;
        }
        if ((i & 8) == 0) {
            this.groupAvatar = null;
        } else {
            this.groupAvatar = str3;
        }
        if ((i & 16) == 0) {
            this.inviterUid = null;
        } else {
            this.inviterUid = str4;
        }
        if ((i & 32) == 0) {
            this.expireTime = null;
        } else {
            this.expireTime = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupInvitationMessageData groupInvitationMessageData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || groupInvitationMessageData.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, groupInvitationMessageData.invitationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupInvitationMessageData.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, groupInvitationMessageData.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupInvitationMessageData.groupName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, groupInvitationMessageData.groupName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupInvitationMessageData.groupAvatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupInvitationMessageData.groupAvatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupInvitationMessageData.inviterUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, groupInvitationMessageData.inviterUid);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && groupInvitationMessageData.expireTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, groupInvitationMessageData.expireTime);
    }

    public GroupInvitationMessageData(String str, Long l, String str2, String str3, String str4, Long l2) {
        this.invitationId = str;
        this.groupId = l;
        this.groupName = str2;
        this.groupAvatar = str3;
        this.inviterUid = str4;
        this.expireTime = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r11v0 java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void (m)] (LINE:8) call: com.okinc.okimcore.model.im.inhouseim.ws.GroupInvitationMessageData.<init>(java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Long):void type: THIS */
    public /* synthetic */ GroupInvitationMessageData(String str, Long l, String str2, String str3, String str4, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : l2);
    }
}
