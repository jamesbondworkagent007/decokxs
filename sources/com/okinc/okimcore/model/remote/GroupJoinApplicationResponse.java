package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class GroupJoinApplicationResponse {
    public static final int $stable = 0;
    private final GroupApplicationStatus applicationStatus;
    private final String avatar;
    private final Long createTime;
    private final Long groupId;
    private final String id;
    private final String invitationId;
    private final Long inviterUid;
    private final Long memberUid;
    private final String nickname;
    private final String reason;
    private final Long updateTime;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, GroupApplicationStatus.Companion.serializer(), null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component10() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component11() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationStatus component8() {
        return this.applicationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupJoinApplicationResponse copy(String str, Long l, Long l2, String str2, String str3, Long l3, String str4, GroupApplicationStatus groupApplicationStatus, String str5, Long l4, Long l5) {
        return new GroupJoinApplicationResponse(str, l, l2, str2, str3, l3, str4, groupApplicationStatus, str5, l4, l5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupJoinApplicationResponse)) {
            return false;
        }
        GroupJoinApplicationResponse groupJoinApplicationResponse = (GroupJoinApplicationResponse) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) groupJoinApplicationResponse.id) && Intrinsics.EZpvd(this.groupId, groupJoinApplicationResponse.groupId) && Intrinsics.EZpvd(this.memberUid, groupJoinApplicationResponse.memberUid) && Intrinsics.EZpvd((Object) this.nickname, (Object) groupJoinApplicationResponse.nickname) && Intrinsics.EZpvd((Object) this.avatar, (Object) groupJoinApplicationResponse.avatar) && Intrinsics.EZpvd(this.inviterUid, groupJoinApplicationResponse.inviterUid) && Intrinsics.EZpvd((Object) this.invitationId, (Object) groupJoinApplicationResponse.invitationId) && this.applicationStatus == groupJoinApplicationResponse.applicationStatus && Intrinsics.EZpvd((Object) this.reason, (Object) groupJoinApplicationResponse.reason) && Intrinsics.EZpvd(this.createTime, groupJoinApplicationResponse.createTime) && Intrinsics.EZpvd(this.updateTime, groupJoinApplicationResponse.updateTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupApplicationStatus getApplicationStatus() {
        return this.applicationStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvitationId() {
        return this.invitationId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getInviterUid() {
        return this.inviterUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getMemberUid() {
        return this.memberUid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        Long l = this.groupId;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.memberUid;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        String str2 = this.nickname;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.avatar;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        Long l3 = this.inviterUid;
        int iHashCode6 = l3 == null ? 0 : l3.hashCode();
        String str4 = this.invitationId;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        GroupApplicationStatus groupApplicationStatus = this.applicationStatus;
        int iHashCode8 = groupApplicationStatus == null ? 0 : groupApplicationStatus.hashCode();
        String str5 = this.reason;
        int iHashCode9 = str5 == null ? 0 : str5.hashCode();
        Long l4 = this.createTime;
        int iHashCode10 = l4 == null ? 0 : l4.hashCode();
        Long l5 = this.updateTime;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (l5 != null ? l5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupJoinApplicationResponse(id=" + this.id + ", groupId=" + this.groupId + ", memberUid=" + this.memberUid + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", inviterUid=" + this.inviterUid + ", invitationId=" + this.invitationId + ", applicationStatus=" + this.applicationStatus + ", reason=" + this.reason + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupJoinApplicationResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupJoinApplicationResponse> serializer() {
            return GroupJoinApplicationResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupJoinApplicationResponse(int i, String str, Long l, Long l2, String str2, String str3, Long l3, String str4, GroupApplicationStatus groupApplicationStatus, String str5, Long l4, Long l5, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, GroupJoinApplicationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i & 2) == 0) {
            this.groupId = null;
        } else {
            this.groupId = l;
        }
        if ((i & 4) == 0) {
            this.memberUid = null;
        } else {
            this.memberUid = l2;
        }
        if ((i & 8) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str2;
        }
        if ((i & 16) == 0) {
            this.avatar = null;
        } else {
            this.avatar = str3;
        }
        if ((i & 32) == 0) {
            this.inviterUid = null;
        } else {
            this.inviterUid = l3;
        }
        if ((i & 64) == 0) {
            this.invitationId = null;
        } else {
            this.invitationId = str4;
        }
        if ((i & 128) == 0) {
            this.applicationStatus = null;
        } else {
            this.applicationStatus = groupApplicationStatus;
        }
        if ((i & 256) == 0) {
            this.reason = null;
        } else {
            this.reason = str5;
        }
        if ((i & 512) == 0) {
            this.createTime = null;
        } else {
            this.createTime = l4;
        }
        if ((i & 1024) == 0) {
            this.updateTime = null;
        } else {
            this.updateTime = l5;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupJoinApplicationResponse groupJoinApplicationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, groupJoinApplicationResponse.id);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupJoinApplicationResponse.groupId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, groupJoinApplicationResponse.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || groupJoinApplicationResponse.memberUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, groupJoinApplicationResponse.memberUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || groupJoinApplicationResponse.nickname != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, stringSerializer, groupJoinApplicationResponse.nickname);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupJoinApplicationResponse.avatar != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, stringSerializer, groupJoinApplicationResponse.avatar);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupJoinApplicationResponse.inviterUid != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, groupJoinApplicationResponse.inviterUid);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || groupJoinApplicationResponse.invitationId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, stringSerializer, groupJoinApplicationResponse.invitationId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || groupJoinApplicationResponse.applicationStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, kSerializerArr[7], groupJoinApplicationResponse.applicationStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || groupJoinApplicationResponse.reason != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, stringSerializer, groupJoinApplicationResponse.reason);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || groupJoinApplicationResponse.createTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, LongSerializer.INSTANCE, groupJoinApplicationResponse.createTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && groupJoinApplicationResponse.updateTime == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, LongSerializer.INSTANCE, groupJoinApplicationResponse.updateTime);
    }

    public GroupJoinApplicationResponse(String str, Long l, Long l2, String str2, String str3, Long l3, String str4, GroupApplicationStatus groupApplicationStatus, String str5, Long l4, Long l5) {
        this.id = str;
        this.groupId = l;
        this.memberUid = l2;
        this.nickname = str2;
        this.avatar = str3;
        this.inviterUid = l3;
        this.invitationId = str4;
        this.applicationStatus = groupApplicationStatus;
        this.reason = str5;
        this.createTime = l4;
        this.updateTime = l5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:com.okinc.okimcore.model.im.group.GroupApplicationStatus:?: TERNARY null = ((wrap:int:0x0030: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.GroupApplicationStatus) : (r19v0 com.okinc.okimcore.model.im.group.GroupApplicationStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r23v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0040: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r21v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0048: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.Long) : (null java.lang.Long))
 A[MD:(java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.okinc.okimcore.model.im.group.GroupApplicationStatus, java.lang.String, java.lang.Long, java.lang.Long):void (m)] (LINE:31) call: com.okinc.okimcore.model.remote.GroupJoinApplicationResponse.<init>(java.lang.String, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, com.okinc.okimcore.model.im.group.GroupApplicationStatus, java.lang.String, java.lang.Long, java.lang.Long):void type: THIS */
    public /* synthetic */ GroupJoinApplicationResponse(String str, Long l, Long l2, String str2, String str3, Long l3, String str4, GroupApplicationStatus groupApplicationStatus, String str5, Long l4, Long l5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : groupApplicationStatus, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : l4, (i & 1024) == 0 ? l5 : null);
    }
}
