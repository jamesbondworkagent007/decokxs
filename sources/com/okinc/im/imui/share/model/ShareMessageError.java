package com.okinc.im.imui.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.share.ShareTarget;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class ShareMessageError implements Parcelable {
    public final String AEQbTJ;
    public final ShareTarget EZpvd;
    public static final int KWHzl = ShareTarget.copydefault;
    public static final Parcelable.Creator<ShareMessageError> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ShareMessageError> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareMessageError createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShareMessageError((ShareTarget) parcel.readParcelable(ShareMessageError.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShareMessageError[] newArray(int i) {
            return new ShareMessageError[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ShareMessageError copy$default(ShareMessageError shareMessageError, ShareTarget shareTarget, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            shareTarget = shareMessageError.EZpvd;
        }
        if ((i & 2) != 0) {
            str = shareMessageError.AEQbTJ;
        }
        return shareMessageError.copydefault(shareTarget, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareTarget KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareMessageError copydefault(@NotNull ShareTarget shareTarget, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shareTarget, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new ShareMessageError(shareTarget, str);
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
        if (!(obj instanceof ShareMessageError)) {
            return false;
        }
        ShareMessageError shareMessageError = (ShareMessageError) obj;
        return Intrinsics.EZpvd(this.EZpvd, shareMessageError.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) shareMessageError.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShareMessageError(shareTarget=" + this.EZpvd + ", errorMsg=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.EZpvd, i);
        parcel.writeString(this.AEQbTJ);
    }

    public ShareMessageError(@NotNull ShareTarget shareTarget, @NotNull String str) {
        Intrinsics.checkNotNullParameter(shareTarget, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = shareTarget;
        this.AEQbTJ = str;
    }
}
