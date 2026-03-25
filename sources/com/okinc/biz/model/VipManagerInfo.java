package com.okinc.biz.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class VipManagerInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<VipManagerInfo> CREATOR = new Creator();
    private final String agentName;
    private final String agentTitle;
    private final String avatarUrl;
    private final String dutyLabel;
    private final boolean hasUnread;
    private final boolean isOnDuty;
    private final String reminderContent;
    private final boolean reminderIsAlert;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<VipManagerInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipManagerInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VipManagerInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipManagerInfo[] newArray(int i) {
            return new VipManagerInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.agentTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.agentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.dutyLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isOnDuty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.hasUnread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.reminderIsAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VipManagerInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new VipManagerInfo(str, str2, str3, str4, z, z2, str5, z3);
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
        if (!(obj instanceof VipManagerInfo)) {
            return false;
        }
        VipManagerInfo vipManagerInfo = (VipManagerInfo) obj;
        return Intrinsics.EZpvd((Object) this.avatarUrl, (Object) vipManagerInfo.avatarUrl) && Intrinsics.EZpvd((Object) this.agentTitle, (Object) vipManagerInfo.agentTitle) && Intrinsics.EZpvd((Object) this.agentName, (Object) vipManagerInfo.agentName) && Intrinsics.EZpvd((Object) this.dutyLabel, (Object) vipManagerInfo.dutyLabel) && this.isOnDuty == vipManagerInfo.isOnDuty && this.hasUnread == vipManagerInfo.hasUnread && Intrinsics.EZpvd((Object) this.reminderContent, (Object) vipManagerInfo.reminderContent) && this.reminderIsAlert == vipManagerInfo.reminderIsAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAgentName() {
        return this.agentName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAgentTitle() {
        return this.agentTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDutyLabel() {
        return this.dutyLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasUnread() {
        return this.hasUnread;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderContent() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReminderIsAlert() {
        return this.reminderIsAlert;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((this.avatarUrl.hashCode() * 31) + this.agentTitle.hashCode()) * 31) + this.agentName.hashCode()) * 31) + this.dutyLabel.hashCode()) * 31) + Boolean.hashCode(this.isOnDuty)) * 31) + Boolean.hashCode(this.hasUnread)) * 31) + this.reminderContent.hashCode()) * 31) + Boolean.hashCode(this.reminderIsAlert);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOnDuty() {
        return this.isOnDuty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VipManagerInfo(avatarUrl=" + this.avatarUrl + ", agentTitle=" + this.agentTitle + ", agentName=" + this.agentName + ", dutyLabel=" + this.dutyLabel + ", isOnDuty=" + this.isOnDuty + ", hasUnread=" + this.hasUnread + ", reminderContent=" + this.reminderContent + ", reminderIsAlert=" + this.reminderIsAlert + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.avatarUrl);
        parcel.writeString(this.agentTitle);
        parcel.writeString(this.agentName);
        parcel.writeString(this.dutyLabel);
        parcel.writeInt(this.isOnDuty ? 1 : 0);
        parcel.writeInt(this.hasUnread ? 1 : 0);
        parcel.writeString(this.reminderContent);
        parcel.writeInt(this.reminderIsAlert ? 1 : 0);
    }

    public VipManagerInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z, boolean z2, @NotNull String str5, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.avatarUrl = str;
        this.agentTitle = str2;
        this.agentName = str3;
        this.dutyLabel = str4;
        this.isOnDuty = z;
        this.hasUnread = z2;
        this.reminderContent = str5;
        this.reminderIsAlert = z3;
    }
}
