package com.okinc.okimcore.model.remote;

import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMGroupMemberEntity$$serializer;
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
public final class GroupAnnouncementEntity {
    private InHouseIMGroupMemberEntity author;
    private String content;
    private String createBy;
    private String createByName;
    private Long createDate;
    private Long editTime;
    private Long groupId;
    private Long id;
    private Integer pin;
    private String updateBy;
    private String updateByName;
    private Long updateDate;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupAnnouncementEntity() {
        this((Long) null, (InHouseIMGroupMemberEntity) null, (Long) null, (String) null, (Long) null, (Long) null, (Integer) null, (Long) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.createByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.updateBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.updateByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberEntity component2() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.updateDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.pin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.editTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.createBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupAnnouncementEntity copy(Long l, InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, Long l2, String str, Long l3, Long l4, Integer num, Long l5, String str2, String str3, String str4, String str5) {
        return new GroupAnnouncementEntity(l, inHouseIMGroupMemberEntity, l2, str, l3, l4, num, l5, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupAnnouncementEntity)) {
            return false;
        }
        GroupAnnouncementEntity groupAnnouncementEntity = (GroupAnnouncementEntity) obj;
        return Intrinsics.EZpvd(this.id, groupAnnouncementEntity.id) && Intrinsics.EZpvd(this.author, groupAnnouncementEntity.author) && Intrinsics.EZpvd(this.groupId, groupAnnouncementEntity.groupId) && Intrinsics.EZpvd((Object) this.content, (Object) groupAnnouncementEntity.content) && Intrinsics.EZpvd(this.createDate, groupAnnouncementEntity.createDate) && Intrinsics.EZpvd(this.updateDate, groupAnnouncementEntity.updateDate) && Intrinsics.EZpvd(this.pin, groupAnnouncementEntity.pin) && Intrinsics.EZpvd(this.editTime, groupAnnouncementEntity.editTime) && Intrinsics.EZpvd((Object) this.createBy, (Object) groupAnnouncementEntity.createBy) && Intrinsics.EZpvd((Object) this.createByName, (Object) groupAnnouncementEntity.createByName) && Intrinsics.EZpvd((Object) this.updateBy, (Object) groupAnnouncementEntity.updateBy) && Intrinsics.EZpvd((Object) this.updateByName, (Object) groupAnnouncementEntity.updateByName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InHouseIMGroupMemberEntity getAuthor() {
        return this.author;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateByName() {
        return this.createByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCreateDate() {
        return this.createDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEditTime() {
        return this.editTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPin() {
        return this.pin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateBy() {
        return this.updateBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpdateByName() {
        return this.updateByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getUpdateDate() {
        return this.updateDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.id;
        int iHashCode = l == null ? 0 : l.hashCode();
        InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity = this.author;
        int iHashCode2 = inHouseIMGroupMemberEntity == null ? 0 : inHouseIMGroupMemberEntity.hashCode();
        Long l2 = this.groupId;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        String str = this.content;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        Long l3 = this.createDate;
        int iHashCode5 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.updateDate;
        int iHashCode6 = l4 == null ? 0 : l4.hashCode();
        Integer num = this.pin;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Long l5 = this.editTime;
        int iHashCode8 = l5 == null ? 0 : l5.hashCode();
        String str2 = this.createBy;
        int iHashCode9 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.createByName;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.updateBy;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.updateByName;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAuthor(InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity) {
        this.author = inHouseIMGroupMemberEntity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(String str) {
        this.content = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateBy(String str) {
        this.createBy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateByName(String str) {
        this.createByName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateDate(Long l) {
        this.createDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEditTime(Long l) {
        this.editTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGroupId(Long l) {
        this.groupId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(Long l) {
        this.id = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPin(Integer num) {
        this.pin = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateBy(String str) {
        this.updateBy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateByName(String str) {
        this.updateByName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUpdateDate(Long l) {
        this.updateDate = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAnnouncementEntity(id=" + this.id + ", author=" + this.author + ", groupId=" + this.groupId + ", content=" + this.content + ", createDate=" + this.createDate + ", updateDate=" + this.updateDate + ", pin=" + this.pin + ", editTime=" + this.editTime + ", createBy=" + this.createBy + ", createByName=" + this.createByName + ", updateBy=" + this.updateBy + ", updateByName=" + this.updateByName + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.remote.GroupAnnouncementEntity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupAnnouncementEntity> serializer() {
            return GroupAnnouncementEntity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupAnnouncementEntity(int i, Long l, InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, Long l2, String str, Long l3, Long l4, Integer num, Long l5, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i & 1) == 0 ? l : l;
        if ((i & 2) == 0) {
            this.author = null;
        } else {
            this.author = inHouseIMGroupMemberEntity;
        }
        this.groupId = (i & 4) != 0 ? l2 : 0L;
        if ((i & 8) == 0) {
            this.content = "";
        } else {
            this.content = str;
        }
        if ((i & 16) == 0) {
            this.createDate = null;
        } else {
            this.createDate = l3;
        }
        if ((i & 32) == 0) {
            this.updateDate = null;
        } else {
            this.updateDate = l4;
        }
        this.pin = (i & 64) == 0 ? 0 : num;
        if ((i & 128) == 0) {
            this.editTime = null;
        } else {
            this.editTime = l5;
        }
        if ((i & 256) == 0) {
            this.createBy = "";
        } else {
            this.createBy = str2;
        }
        if ((i & 512) == 0) {
            this.createByName = "";
        } else {
            this.createByName = str3;
        }
        if ((i & 1024) == 0) {
            this.updateBy = "";
        } else {
            this.updateBy = str4;
        }
        if ((i & 2048) == 0) {
            this.updateByName = "";
        } else {
            this.updateByName = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(GroupAnnouncementEntity groupAnnouncementEntity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Long l;
        Long l2;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (l2 = groupAnnouncementEntity.id) == null || l2.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, groupAnnouncementEntity.id);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || groupAnnouncementEntity.author != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, InHouseIMGroupMemberEntity$$serializer.INSTANCE, groupAnnouncementEntity.author);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || (l = groupAnnouncementEntity.groupId) == null || l.longValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, groupAnnouncementEntity.groupId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) groupAnnouncementEntity.content, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, groupAnnouncementEntity.content);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || groupAnnouncementEntity.createDate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, LongSerializer.INSTANCE, groupAnnouncementEntity.createDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || groupAnnouncementEntity.updateDate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LongSerializer.INSTANCE, groupAnnouncementEntity.updateDate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || (num = groupAnnouncementEntity.pin) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, IntSerializer.INSTANCE, groupAnnouncementEntity.pin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || groupAnnouncementEntity.editTime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, groupAnnouncementEntity.editTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) groupAnnouncementEntity.createBy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, groupAnnouncementEntity.createBy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) groupAnnouncementEntity.createByName, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, groupAnnouncementEntity.createByName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) groupAnnouncementEntity.updateBy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, groupAnnouncementEntity.updateBy);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) groupAnnouncementEntity.updateByName, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.INSTANCE, groupAnnouncementEntity.updateByName);
    }

    public GroupAnnouncementEntity(Long l, InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, Long l2, String str, Long l3, Long l4, Integer num, Long l5, String str2, String str3, String str4, String str5) {
        this.id = l;
        this.author = inHouseIMGroupMemberEntity;
        this.groupId = l2;
        this.content = str;
        this.createDate = l3;
        this.updateDate = l4;
        this.pin = num;
        this.editTime = l5;
        this.createBy = str2;
        this.createByName = str3;
        this.updateBy = str4;
        this.updateByName = str5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GroupAnnouncementEntity(Long l, InHouseIMGroupMemberEntity inHouseIMGroupMemberEntity, Long l2, String str, Long l3, Long l4, Integer num, Long l5, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? l : l, (i & 2) != 0 ? null : inHouseIMGroupMemberEntity, (i & 4) == 0 ? l2 : 0L, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) != 0 ? 0 : num, (i & 128) == 0 ? l5 : null, (i & 256) != 0 ? "" : str2, (i & 512) != 0 ? "" : str3, (i & 1024) != 0 ? "" : str4, (i & 2048) == 0 ? str5 : "");
    }
}
