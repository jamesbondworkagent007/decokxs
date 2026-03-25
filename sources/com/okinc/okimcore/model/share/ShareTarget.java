package com.okinc.okimcore.model.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareTarget implements Parcelable {
    public static final Parcelable.Creator<ShareTarget> CREATOR = new Creator();
    public static final int copydefault = 8;
    public final String AEQbTJ;
    public final OfficialTagInfo AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final OKConversationType KWHzl;
    public final String OLrzqt;
    public final String gEmmrt;
    public final ShareTargetType valueOf;

    public static final class Creator implements Parcelable.Creator<ShareTarget> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareTarget createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareTarget(ShareTargetType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OfficialTagInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? OKConversationType.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareTarget[] newArray(int i) {
            return new ShareTarget[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareTarget AEQbTJ(@NotNull ShareTargetType shareTargetType, String str, String str2, String str3, String str4, String str5, OfficialTagInfo officialTagInfo, OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(shareTargetType, "");
        return new ShareTarget(shareTargetType, str, str2, str3, str4, str5, officialTagInfo, oKConversationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKConversationType KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareTargetType djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareTarget)) {
            return false;
        }
        ShareTarget shareTarget = (ShareTarget) obj;
        return this.valueOf == shareTarget.valueOf && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) shareTarget.OLrzqt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) shareTarget.EZpvd) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) shareTarget.AhwBna) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) shareTarget.AEQbTJ) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) shareTarget.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, shareTarget.AYXKKw) && this.KWHzl == shareTarget.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.valueOf.hashCode();
        String str = this.OLrzqt;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.EZpvd;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.AhwBna;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.AEQbTJ;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.gEmmrt;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        OfficialTagInfo officialTagInfo = this.AYXKKw;
        int iHashCode7 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        OKConversationType oKConversationType = this.KWHzl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (oKConversationType != null ? oKConversationType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareTarget(targetType=" + this.valueOf + ", channelId=" + this.OLrzqt + ", contactId=" + this.EZpvd + ", name=" + this.AhwBna + ", avatar=" + this.AEQbTJ + ", phoneNumber=" + this.gEmmrt + ", tagInfo=" + this.AYXKKw + ", conversationType=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.valueOf.name());
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.gEmmrt);
        OfficialTagInfo officialTagInfo = this.AYXKKw;
        if (officialTagInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            officialTagInfo.writeToParcel(parcel, i);
        }
        OKConversationType oKConversationType = this.KWHzl;
        if (oKConversationType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oKConversationType.writeToParcel(parcel, i);
        }
    }

    public ShareTarget(@NotNull ShareTargetType shareTargetType, String str, String str2, String str3, String str4, String str5, OfficialTagInfo officialTagInfo, OKConversationType oKConversationType) {
        Intrinsics.checkNotNullParameter(shareTargetType, "");
        this.valueOf = shareTargetType;
        this.OLrzqt = str;
        this.EZpvd = str2;
        this.AhwBna = str3;
        this.AEQbTJ = str4;
        this.gEmmrt = str5;
        this.AYXKKw = officialTagInfo;
        this.KWHzl = oKConversationType;
    }
}
