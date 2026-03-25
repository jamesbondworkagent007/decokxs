package com.okinc.ok_kyc_core.camera;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class POACameraGalleryOutputBean implements Parcelable {
    public static final String KEY = "POACameraGalleryOutputBean";
    private String fileName;
    private String fileType;
    private Uri uri;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<POACameraGalleryOutputBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<POACameraGalleryOutputBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final POACameraGalleryOutputBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new POACameraGalleryOutputBean((Uri) parcel.readParcelable(POACameraGalleryOutputBean.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final POACameraGalleryOutputBean[] newArray(int i) {
            return new POACameraGalleryOutputBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ POACameraGalleryOutputBean copy$default(POACameraGalleryOutputBean pOACameraGalleryOutputBean, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = pOACameraGalleryOutputBean.uri;
        }
        if ((i & 2) != 0) {
            str = pOACameraGalleryOutputBean.fileName;
        }
        if ((i & 4) != 0) {
            str2 = pOACameraGalleryOutputBean.fileType;
        }
        return pOACameraGalleryOutputBean.copy(uri, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri component1() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fileType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final POACameraGalleryOutputBean copy(@NotNull Uri uri, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new POACameraGalleryOutputBean(uri, str, str2);
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
        if (!(obj instanceof POACameraGalleryOutputBean)) {
            return false;
        }
        POACameraGalleryOutputBean pOACameraGalleryOutputBean = (POACameraGalleryOutputBean) obj;
        return Intrinsics.EZpvd(this.uri, pOACameraGalleryOutputBean.uri) && Intrinsics.EZpvd((Object) this.fileName, (Object) pOACameraGalleryOutputBean.fileName) && Intrinsics.EZpvd((Object) this.fileType, (Object) pOACameraGalleryOutputBean.fileType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Uri getUri() {
        return this.uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.uri.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.fileType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFileName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fileName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFileType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fileType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        this.uri = uri;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "POACameraGalleryOutputBean(uri=" + this.uri + ", fileName=" + this.fileName + ", fileType=" + this.fileType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.uri, i);
        parcel.writeString(this.fileName);
        parcel.writeString(this.fileType);
    }

    public POACameraGalleryOutputBean(@NotNull Uri uri, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(uri, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.uri = uri;
        this.fileName = str;
        this.fileType = str2;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.camera.POACameraGalleryOutputBean.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
