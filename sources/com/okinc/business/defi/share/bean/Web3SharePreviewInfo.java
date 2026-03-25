package com.okinc.business.defi.share.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Web3SharePreviewInfo implements Parcelable {
    private String previewContent;
    private String previewTitle;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreviewContent() {
        return this.previewContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreviewTitle() {
        return this.previewTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewContent(String str) {
        this.previewContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPreviewTitle(String str) {
        this.previewTitle = str;
    }

    public Web3SharePreviewInfo() {
    }

    public Web3SharePreviewInfo(String str, String str2) {
        this.previewTitle = str;
        this.previewContent = str2;
    }

    public Web3SharePreviewInfo(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.previewTitle = parcel.readString();
        this.previewContent = parcel.readString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.previewTitle);
        parcel.writeString(this.previewContent);
    }

    public static final class CREATOR implements Parcelable.Creator<Web3SharePreviewInfo> {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.share.bean.Web3SharePreviewInfo.CREATOR.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Web3SharePreviewInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Web3SharePreviewInfo(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Web3SharePreviewInfo[] newArray(int i) {
            return new Web3SharePreviewInfo[i];
        }
    }
}
