package com.okinc.biz.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class VideoCallEndMetadata implements Parcelable {
    public static final Parcelable.Creator<VideoCallEndMetadata> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;
    public final Integer OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<VideoCallEndMetadata> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoCallEndMetadata createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VideoCallEndMetadata(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VideoCallEndMetadata[] newArray(int i) {
            return new VideoCallEndMetadata[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ VideoCallEndMetadata copy$default(VideoCallEndMetadata videoCallEndMetadata, boolean z, boolean z2, boolean z3, Integer num, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = videoCallEndMetadata.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z2 = videoCallEndMetadata.copydefault;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = videoCallEndMetadata.KWHzl;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            num = videoCallEndMetadata.OLrzqt;
        }
        Integer num2 = num;
        if ((i & 16) != 0) {
            z4 = videoCallEndMetadata.EZpvd;
        }
        return videoCallEndMetadata.OLrzqt(z, z5, z6, num2, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VideoCallEndMetadata OLrzqt(boolean z, boolean z2, boolean z3, Integer num, boolean z4) {
        return new VideoCallEndMetadata(z, z2, z3, num, z4);
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
        if (!(obj instanceof VideoCallEndMetadata)) {
            return false;
        }
        VideoCallEndMetadata videoCallEndMetadata = (VideoCallEndMetadata) obj;
        return this.AEQbTJ == videoCallEndMetadata.AEQbTJ && this.copydefault == videoCallEndMetadata.copydefault && this.KWHzl == videoCallEndMetadata.KWHzl && Intrinsics.EZpvd(this.OLrzqt, videoCallEndMetadata.OLrzqt) && this.EZpvd == videoCallEndMetadata.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.AEQbTJ);
        int iHashCode2 = Boolean.hashCode(this.copydefault);
        int iHashCode3 = Boolean.hashCode(this.KWHzl);
        Integer num = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VideoCallEndMetadata(isAgentLeaveTheCall=" + this.AEQbTJ + ", isUserLeaveTheCall=" + this.copydefault + ", isAgentNotJoinExceedingFiveMinutes=" + this.KWHzl + ", errorCodeFromAgoraSDK=" + this.OLrzqt + ", isPreLogin=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        Integer num = this.OLrzqt;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public VideoCallEndMetadata(boolean z, boolean z2, boolean z3, Integer num, boolean z4) {
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.KWHzl = z3;
        this.OLrzqt = num;
        this.EZpvd = z4;
    }
}
