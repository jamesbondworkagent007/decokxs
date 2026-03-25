package com.okinc.planet.domain.remote.dto;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ImageItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ImageItem> CREATOR = new Creator();
    private String bitmapKey;
    private String filePath;
    private String fileSize;
    private String height;
    private final String id;
    private Boolean isLoadSuccess;
    private final Uri localUri;
    private String netPathUrl;
    private String remoteUrl;
    private UploadState uploadState;
    private String width;

    public static final class Creator implements Parcelable.Creator<ImageItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Uri uri = (Uri) parcel.readParcelable(ImageItem.class.getClassLoader());
            String string2 = parcel.readString();
            UploadState uploadStateValueOf = UploadState.valueOf(parcel.readString());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ImageItem(string, uri, string2, uploadStateValueOf, string3, string4, string5, string6, boolValueOf, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ImageItem[] newArray(int i) {
            return new ImageItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ImageItem() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri component2() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bitmapKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadState component4() {
        return this.uploadState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.remoteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.netPathUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isLoadSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ImageItem copy(@NotNull String str, Uri uri, String str2, @NotNull UploadState uploadState, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uploadState, "");
        return new ImageItem(str, uri, str2, uploadState, str3, str4, str5, str6, bool, str7, str8);
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
        if (!(obj instanceof ImageItem)) {
            return false;
        }
        ImageItem imageItem = (ImageItem) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) imageItem.id) && Intrinsics.EZpvd(this.localUri, imageItem.localUri) && Intrinsics.EZpvd((Object) this.bitmapKey, (Object) imageItem.bitmapKey) && this.uploadState == imageItem.uploadState && Intrinsics.EZpvd((Object) this.remoteUrl, (Object) imageItem.remoteUrl) && Intrinsics.EZpvd((Object) this.netPathUrl, (Object) imageItem.netPathUrl) && Intrinsics.EZpvd((Object) this.width, (Object) imageItem.width) && Intrinsics.EZpvd((Object) this.height, (Object) imageItem.height) && Intrinsics.EZpvd(this.isLoadSuccess, imageItem.isLoadSuccess) && Intrinsics.EZpvd((Object) this.filePath, (Object) imageItem.filePath) && Intrinsics.EZpvd((Object) this.fileSize, (Object) imageItem.fileSize);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBitmapKey() {
        return this.bitmapKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileSize() {
        return this.fileSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHeight() {
        return this.height;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getLocalUri() {
        return this.localUri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetPathUrl() {
        return this.netPathUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemoteUrl() {
        return this.remoteUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UploadState getUploadState() {
        return this.uploadState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWidth() {
        return this.width;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.id.hashCode();
        Uri uri = this.localUri;
        int iHashCode2 = uri == null ? 0 : uri.hashCode();
        String str = this.bitmapKey;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = this.uploadState.hashCode();
        String str2 = this.remoteUrl;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.netPathUrl;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.width;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.height;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        Boolean bool = this.isLoadSuccess;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        String str6 = this.filePath;
        int iHashCode10 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.fileSize;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isLoadSuccess() {
        return this.isLoadSuccess;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBitmapKey(String str) {
        this.bitmapKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilePath(String str) {
        this.filePath = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFileSize(String str) {
        this.fileSize = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHeight(String str) {
        this.height = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLoadSuccess(Boolean bool) {
        this.isLoadSuccess = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetPathUrl(String str) {
        this.netPathUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRemoteUrl(String str) {
        this.remoteUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUploadState(@NotNull UploadState uploadState) {
        Intrinsics.checkNotNullParameter(uploadState, "");
        this.uploadState = uploadState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWidth(String str) {
        this.width = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ImageItem(id=" + this.id + ", localUri=" + this.localUri + ", bitmapKey=" + this.bitmapKey + ", uploadState=" + this.uploadState + ", remoteUrl=" + this.remoteUrl + ", netPathUrl=" + this.netPathUrl + ", width=" + this.width + ", height=" + this.height + ", isLoadSuccess=" + this.isLoadSuccess + ", filePath=" + this.filePath + ", fileSize=" + this.fileSize + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeParcelable(this.localUri, i);
        parcel.writeString(this.bitmapKey);
        parcel.writeString(this.uploadState.name());
        parcel.writeString(this.remoteUrl);
        parcel.writeString(this.netPathUrl);
        parcel.writeString(this.width);
        parcel.writeString(this.height);
        Boolean bool = this.isLoadSuccess;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.filePath);
        parcel.writeString(this.fileSize);
    }

    public ImageItem(@NotNull String str, Uri uri, String str2, @NotNull UploadState uploadState, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(uploadState, "");
        this.id = str;
        this.localUri = uri;
        this.bitmapKey = str2;
        this.uploadState = uploadState;
        this.remoteUrl = str3;
        this.netPathUrl = str4;
        this.width = str5;
        this.height = str6;
        this.isLoadSuccess = bool;
        this.filePath = str7;
        this.fileSize = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ImageItem(String str, Uri uri, String str2, UploadState uploadState, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str9;
        if ((i & 1) != 0) {
            str9 = UUID.randomUUID() + "_" + System.currentTimeMillis();
        } else {
            str9 = str;
        }
        this(str9, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? UploadState.Idle : uploadState, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? null : str7, (i & 1024) == 0 ? str8 : null);
    }
}
