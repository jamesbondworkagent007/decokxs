package com.okinc.okimcore.model.utility;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class GroupAnnouncementInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GroupAnnouncementInfo> CREATOR = new Creator();
    private final GroupMemberInfo announceAuthorInfo;
    private final long announceId;
    private final String content;
    private final String createBy;
    private final String createByName;
    private final long createTime;
    private final Long editTime;
    private final String groupId;
    private final boolean isPin;
    private final String updateBy;
    private final String updateByName;
    private final long updateTime;

    public static final class Creator implements Parcelable.Creator<GroupAnnouncementInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAnnouncementInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupAnnouncementInfo(parcel.readLong(), parcel.readString(), parcel.readInt() == 0 ? null : GroupMemberInfo.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAnnouncementInfo[] newArray(int i) {
            return new GroupAnnouncementInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.announceId;
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
    public final String component2() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberInfo component3() {
        return this.announceAuthorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isPin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component6() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.updateTime;
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
    public final GroupAnnouncementInfo copy(long j, @NotNull String str, GroupMemberInfo groupMemberInfo, @NotNull String str2, boolean z, long j2, long j3, Long l, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new GroupAnnouncementInfo(j, str, groupMemberInfo, str2, z, j2, j3, l, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupAnnouncementInfo)) {
            return false;
        }
        GroupAnnouncementInfo groupAnnouncementInfo = (GroupAnnouncementInfo) obj;
        return this.announceId == groupAnnouncementInfo.announceId && Intrinsics.EZpvd((Object) this.groupId, (Object) groupAnnouncementInfo.groupId) && Intrinsics.EZpvd(this.announceAuthorInfo, groupAnnouncementInfo.announceAuthorInfo) && Intrinsics.EZpvd((Object) this.content, (Object) groupAnnouncementInfo.content) && this.isPin == groupAnnouncementInfo.isPin && this.createTime == groupAnnouncementInfo.createTime && this.updateTime == groupAnnouncementInfo.updateTime && Intrinsics.EZpvd(this.editTime, groupAnnouncementInfo.editTime) && Intrinsics.EZpvd((Object) this.createBy, (Object) groupAnnouncementInfo.createBy) && Intrinsics.EZpvd((Object) this.createByName, (Object) groupAnnouncementInfo.createByName) && Intrinsics.EZpvd((Object) this.updateBy, (Object) groupAnnouncementInfo.updateBy) && Intrinsics.EZpvd((Object) this.updateByName, (Object) groupAnnouncementInfo.updateByName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberInfo getAnnounceAuthorInfo() {
        return this.announceAuthorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getAnnounceId() {
        return this.announceId;
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
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEditTime() {
        return this.editTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
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
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.announceId);
        int iHashCode2 = this.groupId.hashCode();
        GroupMemberInfo groupMemberInfo = this.announceAuthorInfo;
        int iHashCode3 = groupMemberInfo == null ? 0 : groupMemberInfo.hashCode();
        int iHashCode4 = this.content.hashCode();
        int iHashCode5 = Boolean.hashCode(this.isPin);
        int iHashCode6 = Long.hashCode(this.createTime);
        int iHashCode7 = Long.hashCode(this.updateTime);
        Long l = this.editTime;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        String str = this.createBy;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.createByName;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.updateBy;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.updateByName;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPin() {
        return this.isPin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAnnouncementInfo(announceId=" + this.announceId + ", groupId=" + this.groupId + ", announceAuthorInfo=" + this.announceAuthorInfo + ", content=" + this.content + ", isPin=" + this.isPin + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", editTime=" + this.editTime + ", createBy=" + this.createBy + ", createByName=" + this.createByName + ", updateBy=" + this.updateBy + ", updateByName=" + this.updateByName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.announceId);
        parcel.writeString(this.groupId);
        GroupMemberInfo groupMemberInfo = this.announceAuthorInfo;
        if (groupMemberInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            groupMemberInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.content);
        parcel.writeInt(this.isPin ? 1 : 0);
        parcel.writeLong(this.createTime);
        parcel.writeLong(this.updateTime);
        Long l = this.editTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.createBy);
        parcel.writeString(this.createByName);
        parcel.writeString(this.updateBy);
        parcel.writeString(this.updateByName);
    }

    public GroupAnnouncementInfo(long j, @NotNull String str, GroupMemberInfo groupMemberInfo, @NotNull String str2, boolean z, long j2, long j3, Long l, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.announceId = j;
        this.groupId = str;
        this.announceAuthorInfo = groupMemberInfo;
        this.content = str2;
        this.isPin = z;
        this.createTime = j2;
        this.updateTime = j3;
        this.editTime = l;
        this.createBy = str3;
        this.createByName = str4;
        this.updateBy = str5;
        this.updateByName = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (r20v0 long)
  (r22v0 java.lang.String)
  (r23v0 com.okinc.okimcore.model.other.GroupMemberInfo)
  (r24v0 java.lang.String)
  (r25v0 boolean)
  (r26v0 long)
  (r28v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r30v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(long, java.lang.String, com.okinc.okimcore.model.other.GroupMemberInfo, java.lang.String, boolean, long, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:16) call: com.okinc.okimcore.model.utility.GroupAnnouncementInfo.<init>(long, java.lang.String, com.okinc.okimcore.model.other.GroupMemberInfo, java.lang.String, boolean, long, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ GroupAnnouncementInfo(long j, String str, GroupMemberInfo groupMemberInfo, String str2, boolean z, long j2, long j3, Long l, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, groupMemberInfo, str2, z, j2, j3, (i & 128) != 0 ? null : l, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : str6);
    }
}
