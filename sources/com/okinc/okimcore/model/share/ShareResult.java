package com.okinc.okimcore.model.share;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ShareResult implements Parcelable {
    public static final Parcelable.Creator<ShareResult> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final boolean KWHzl;
    public final int OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<ShareResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareResult(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareResult[] newArray(int i) {
            return new ShareResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareResult copy$default(ShareResult shareResult, String str, String str2, boolean z, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = shareResult.EZpvd;
        }
        if ((i2 & 2) != 0) {
            str2 = shareResult.AEQbTJ;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            z = shareResult.KWHzl;
        }
        boolean z2 = z;
        if ((i2 & 8) != 0) {
            i = shareResult.OLrzqt;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = shareResult.copydefault;
        }
        return shareResult.KWHzl(str, str4, z2, i3, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareResult KWHzl(String str, String str2, boolean z, int i, String str3) {
        return new ShareResult(str, str2, z, i, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof ShareResult)) {
            return false;
        }
        ShareResult shareResult = (ShareResult) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) shareResult.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) shareResult.AEQbTJ) && this.KWHzl == shareResult.KWHzl && this.OLrzqt == shareResult.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) shareResult.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.EZpvd;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = Boolean.hashCode(this.KWHzl);
        int iHashCode4 = Integer.hashCode(this.OLrzqt);
        String str3 = this.copydefault;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareResult(channelId=" + this.EZpvd + ", userUid=" + this.AEQbTJ + ", isSuccess=" + this.KWHzl + ", errorCode=" + this.OLrzqt + ", errorMsg=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.OLrzqt);
        parcel.writeString(this.copydefault);
    }

    public ShareResult(String str, String str2, boolean z, int i, String str3) {
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.KWHzl = z;
        this.OLrzqt = i;
        this.copydefault = str3;
    }
}
