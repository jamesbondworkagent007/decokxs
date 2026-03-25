package com.okinc.nft.ui.mediapicker.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.okinc.nft.ui.mediapicker.data.constants.MediaPickerType;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class MediaInfo implements Parcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR = new Parcelable.Creator<MediaInfo>() { // from class: com.okinc.nft.ui.mediapicker.data.bean.MediaInfo.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaInfo createFromParcel(Parcel parcel) {
            return new MediaInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaInfo[] newArray(int i) {
            return new MediaInfo[i];
        }
    };
    public String AEQbTJ;
    public long AYXKKw;
    public String AhwBna;
    public MediaPickerType DbNXlk;
    public String EZpvd;
    public long KWHzl;
    public long OLrzqt;
    public String copydefault;
    public String djBIcL;
    public String gEmmrt;
    public String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MediaPickerType AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(MediaPickerType mediaPickerType) {
        this.DbNXlk = mediaPickerType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long copydefault() {
        return this.AYXKKw;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String gEmmrt() {
        return this.gEmmrt;
    }

    public MediaInfo() {
    }

    public MediaInfo(@NonNull Parcel parcel) {
        this.valueOf = parcel.readString();
        this.djBIcL = parcel.readString();
        this.DbNXlk = MediaPickerType.values()[parcel.readInt()];
        this.gEmmrt = parcel.readString();
        this.AEQbTJ = parcel.readString();
        this.AhwBna = parcel.readString();
        this.OLrzqt = parcel.readLong();
        this.KWHzl = parcel.readLong();
        this.AYXKKw = parcel.readLong();
        this.EZpvd = parcel.readString();
        this.copydefault = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.valueOf);
        parcel.writeString(this.djBIcL);
        parcel.writeInt(this.DbNXlk.ordinal());
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.AhwBna);
        parcel.writeLong(this.OLrzqt);
        parcel.writeLong(this.KWHzl);
        parcel.writeLong(this.AYXKKw);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MediaInfo mediaInfo = (MediaInfo) obj;
        return this.AYXKKw == mediaInfo.AYXKKw && Objects.equals(this.djBIcL, mediaInfo.djBIcL) && Objects.equals(this.AEQbTJ, mediaInfo.AEQbTJ) && Objects.equals(this.gEmmrt, mediaInfo.gEmmrt);
    }

    public int hashCode() {
        String str = this.AEQbTJ;
        String str2 = this.djBIcL;
        long j = this.AYXKKw;
        return Objects.hash(str, str2, Long.valueOf(j), this.gEmmrt);
    }

    /* JADX INFO: loaded from: classes16.dex */
    public static class ActionBar {
        public MediaInfo copydefault = new MediaInfo();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public MediaInfo OLrzqt() {
            return this.copydefault;
        }

        public ActionBar gEmmrt(String str) {
            this.copydefault.valueOf = str;
            return this;
        }

        public ActionBar AEQbTJ(String str) {
            this.copydefault.djBIcL = str;
            return this;
        }

        public ActionBar copydefault(MediaPickerType mediaPickerType) {
            this.copydefault.DbNXlk = mediaPickerType;
            return this;
        }

        public ActionBar KWHzl(String str) {
            this.copydefault.gEmmrt = str;
            return this;
        }

        public ActionBar copydefault(String str) {
            this.copydefault.AEQbTJ = str;
            return this;
        }

        public ActionBar copydefault(long j) {
            this.copydefault.OLrzqt = j;
            return this;
        }

        public ActionBar KWHzl(long j) {
            this.copydefault.KWHzl = j;
            return this;
        }

        public ActionBar OLrzqt(long j) {
            this.copydefault.AYXKKw = j;
            return this;
        }

        public ActionBar OLrzqt(String str) {
            this.copydefault.EZpvd = str;
            return this;
        }

        public ActionBar EZpvd(String str) {
            this.copydefault.copydefault = str;
            return this;
        }
    }
}
