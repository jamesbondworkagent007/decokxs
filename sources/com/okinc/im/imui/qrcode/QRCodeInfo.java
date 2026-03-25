package com.okinc.im.imui.qrcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class QRCodeInfo implements Parcelable {
    public static final Parcelable.Creator<QRCodeInfo> CREATOR = new Creator();
    public String AEQbTJ;
    public String EZpvd;
    public String KWHzl;
    public OfficialTagInfo OLrzqt;
    public String copydefault;

    public static final class Creator implements Parcelable.Creator<QRCodeInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCodeInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QRCodeInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (OfficialTagInfo) parcel.readParcelable(QRCodeInfo.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QRCodeInfo[] newArray(int i) {
            return new QRCodeInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QRCodeInfo copy$default(QRCodeInfo qRCodeInfo, String str, String str2, String str3, String str4, OfficialTagInfo officialTagInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qRCodeInfo.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = qRCodeInfo.KWHzl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = qRCodeInfo.AEQbTJ;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = qRCodeInfo.copydefault;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            officialTagInfo = qRCodeInfo.OLrzqt;
        }
        return qRCodeInfo.OLrzqt(str, str5, str6, str7, officialTagInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QRCodeInfo OLrzqt(@NotNull String str, @NotNull String str2, String str3, String str4, OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new QRCodeInfo(str, str2, str3, str4, officialTagInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
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
        if (!(obj instanceof QRCodeInfo)) {
            return false;
        }
        QRCodeInfo qRCodeInfo = (QRCodeInfo) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) qRCodeInfo.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) qRCodeInfo.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) qRCodeInfo.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) qRCodeInfo.copydefault) && Intrinsics.EZpvd(this.OLrzqt, qRCodeInfo.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        String str = this.AEQbTJ;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.copydefault;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        OfficialTagInfo officialTagInfo = this.OLrzqt;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (officialTagInfo != null ? officialTagInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QRCodeInfo(avatarUrl=" + this.EZpvd + ", name=" + this.KWHzl + ", qrcodeContent=" + this.AEQbTJ + ", subtitle=" + this.copydefault + ", officialTag=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeParcelable(this.OLrzqt, i);
    }

    public QRCodeInfo(@NotNull String str, @NotNull String str2, String str3, String str4, OfficialTagInfo officialTagInfo) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.copydefault = str4;
        this.OLrzqt = officialTagInfo;
    }
}
