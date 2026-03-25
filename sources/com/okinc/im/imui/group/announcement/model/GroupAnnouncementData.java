package com.okinc.im.imui.group.announcement.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.other.GroupMemberInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class GroupAnnouncementData implements Parcelable {
    public static final int $stable = GroupMemberInfo.$stable;
    public static final Parcelable.Creator<GroupAnnouncementData> CREATOR = new Creator();
    private final GroupMemberInfo announceAuthorInfo;
    private final String content;
    private final String createByName;
    private final long createTime;
    private final String editedByName;
    private final String groupId;
    private final long id;
    private final boolean isEdit;
    private final boolean isEditedByCurrentUser;
    private final boolean isPin;

    public static final class Creator implements Parcelable.Creator<GroupAnnouncementData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAnnouncementData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupAnnouncementData(parcel.readLong(), parcel.readString(), (GroupMemberInfo) parcel.readParcelable(GroupAnnouncementData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupAnnouncementData[] newArray(int i) {
            return new GroupAnnouncementData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.createByName;
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
    public final boolean component7() {
        return this.isEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isEditedByCurrentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.editedByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupAnnouncementData copy(long j, @NotNull String str, GroupMemberInfo groupMemberInfo, @NotNull String str2, boolean z, long j2, boolean z2, boolean z3, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new GroupAnnouncementData(j, str, groupMemberInfo, str2, z, j2, z2, z3, str3, str4);
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
        if (!(obj instanceof GroupAnnouncementData)) {
            return false;
        }
        GroupAnnouncementData groupAnnouncementData = (GroupAnnouncementData) obj;
        return this.id == groupAnnouncementData.id && Intrinsics.EZpvd((Object) this.groupId, (Object) groupAnnouncementData.groupId) && Intrinsics.EZpvd(this.announceAuthorInfo, groupAnnouncementData.announceAuthorInfo) && Intrinsics.EZpvd((Object) this.content, (Object) groupAnnouncementData.content) && this.isPin == groupAnnouncementData.isPin && this.createTime == groupAnnouncementData.createTime && this.isEdit == groupAnnouncementData.isEdit && this.isEditedByCurrentUser == groupAnnouncementData.isEditedByCurrentUser && Intrinsics.EZpvd((Object) this.editedByName, (Object) groupAnnouncementData.editedByName) && Intrinsics.EZpvd((Object) this.createByName, (Object) groupAnnouncementData.createByName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupMemberInfo getAnnounceAuthorInfo() {
        return this.announceAuthorInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
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
    public final String getEditedByName() {
        return this.editedByName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.id);
        int iHashCode2 = this.groupId.hashCode();
        GroupMemberInfo groupMemberInfo = this.announceAuthorInfo;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + (groupMemberInfo == null ? 0 : groupMemberInfo.hashCode())) * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.isPin)) * 31) + Long.hashCode(this.createTime)) * 31) + Boolean.hashCode(this.isEdit)) * 31) + Boolean.hashCode(this.isEditedByCurrentUser)) * 31) + this.editedByName.hashCode()) * 31) + this.createByName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEdit() {
        return this.isEdit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isEditedByCurrentUser() {
        return this.isEditedByCurrentUser;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPin() {
        return this.isPin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupAnnouncementData(id=" + this.id + ", groupId=" + this.groupId + ", announceAuthorInfo=" + this.announceAuthorInfo + ", content=" + this.content + ", isPin=" + this.isPin + ", createTime=" + this.createTime + ", isEdit=" + this.isEdit + ", isEditedByCurrentUser=" + this.isEditedByCurrentUser + ", editedByName=" + this.editedByName + ", createByName=" + this.createByName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.id);
        parcel.writeString(this.groupId);
        parcel.writeParcelable(this.announceAuthorInfo, i);
        parcel.writeString(this.content);
        parcel.writeInt(this.isPin ? 1 : 0);
        parcel.writeLong(this.createTime);
        parcel.writeInt(this.isEdit ? 1 : 0);
        parcel.writeInt(this.isEditedByCurrentUser ? 1 : 0);
        parcel.writeString(this.editedByName);
        parcel.writeString(this.createByName);
    }

    public GroupAnnouncementData(long j, @NotNull String str, GroupMemberInfo groupMemberInfo, @NotNull String str2, boolean z, long j2, boolean z2, boolean z3, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.id = j;
        this.groupId = str;
        this.announceAuthorInfo = groupMemberInfo;
        this.content = str2;
        this.isPin = z;
        this.createTime = j2;
        this.isEdit = z2;
        this.isEditedByCurrentUser = z3;
        this.editedByName = str3;
        this.createByName = str4;
    }
}
