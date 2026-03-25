package com.just.agentweb.filechooser;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes22.dex */
public class FileParcel implements Parcelable {
    public static final Parcelable.Creator<FileParcel> CREATOR = new Parcelable.Creator<FileParcel>() { // from class: com.just.agentweb.filechooser.FileParcel.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileParcel createFromParcel(Parcel parcel) {
            return new FileParcel(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public FileParcel[] newArray(int i) {
            return new FileParcel[i];
        }
    };
    private String mContentPath;
    private String mFileBase64;
    private int mId;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getContentPath() {
        return this.mContentPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getFileBase64() {
        return this.mFileBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getId() {
        return this.mId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setContentPath(String str) {
        this.mContentPath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setFileBase64(String str) {
        this.mFileBase64 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setId(int i) {
        this.mId = i;
    }

    public FileParcel(Parcel parcel) {
        this.mId = parcel.readInt();
        this.mContentPath = parcel.readString();
        this.mFileBase64 = parcel.readString();
    }

    public FileParcel(int i, String str, String str2) {
        this.mId = i;
        this.mContentPath = str;
        this.mFileBase64 = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mId);
        parcel.writeString(this.mContentPath);
        parcel.writeString(this.mFileBase64);
    }

    public String toString() {
        return "FileParcel{mId=" + this.mId + ", mContentPath='" + this.mContentPath + "', mFileBase64='" + this.mFileBase64 + '\'' + AbstractJsonLexerKt.END_OBJ;
    }
}
