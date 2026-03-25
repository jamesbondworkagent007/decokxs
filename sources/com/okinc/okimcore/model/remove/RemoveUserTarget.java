package com.okinc.okimcore.model.remove;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RemoveUserTarget implements Parcelable {
    public static final Parcelable.Creator<RemoveUserTarget> CREATOR = new Creator();
    public final String AEQbTJ;
    public final GroupRole AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final OKConversationType OLrzqt;
    public final String copydefault;
    public final OfficialTagInfo gEmmrt;

    public static final class Creator implements Parcelable.Creator<RemoveUserTarget> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoveUserTarget createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RemoveUserTarget(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OKConversationType.CREATOR.createFromParcel(parcel) : null, GroupRole.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoveUserTarget[] newArray(int i) {
            return new RemoveUserTarget[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RemoveUserTarget copy$default(RemoveUserTarget removeUserTarget, String str, String str2, String str3, String str4, OfficialTagInfo officialTagInfo, OKConversationType oKConversationType, GroupRole groupRole, int i, Object obj) {
        if ((i & 1) != 0) {
            str = removeUserTarget.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = removeUserTarget.EZpvd;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = removeUserTarget.copydefault;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = removeUserTarget.AEQbTJ;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            officialTagInfo = removeUserTarget.gEmmrt;
        }
        OfficialTagInfo officialTagInfo2 = officialTagInfo;
        if ((i & 32) != 0) {
            oKConversationType = removeUserTarget.OLrzqt;
        }
        OKConversationType oKConversationType2 = oKConversationType;
        if ((i & 64) != 0) {
            groupRole = removeUserTarget.AhwBna;
        }
        return removeUserTarget.AEQbTJ(str, str5, str6, str7, officialTagInfo2, oKConversationType2, groupRole);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RemoveUserTarget AEQbTJ(String str, String str2, String str3, String str4, OfficialTagInfo officialTagInfo, OKConversationType oKConversationType, @NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(groupRole, "");
        return new RemoveUserTarget(str, str2, str3, str4, officialTagInfo, oKConversationType, groupRole);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RemoveUserTarget(channelId=" + this.KWHzl + ", contactId=" + this.EZpvd + ", name=" + this.copydefault + ", avatar=" + this.AEQbTJ + ", tagInfo=" + this.gEmmrt + ", conversationType=" + this.OLrzqt + ", role=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        OfficialTagInfo officialTagInfo = this.gEmmrt;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        OKConversationType oKConversationType = this.OLrzqt;
        if (oKConversationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oKConversationType.writeToParcel(parcel, i);
        }
        this.AhwBna.writeToParcel(parcel, i);
    }

    public RemoveUserTarget(String str, String str2, String str3, String str4, OfficialTagInfo officialTagInfo, OKConversationType oKConversationType, @NotNull GroupRole groupRole) {
        Intrinsics.checkNotNullParameter(groupRole, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.copydefault = str3;
        this.AEQbTJ = str4;
        this.gEmmrt = officialTagInfo;
        this.OLrzqt = oKConversationType;
        this.AhwBna = groupRole;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoveUserTarget) {
            return Intrinsics.EZpvd((Object) this.EZpvd, (Object) ((RemoveUserTarget) obj).EZpvd);
        }
        return false;
    }

    public int hashCode() {
        String str = this.EZpvd;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
