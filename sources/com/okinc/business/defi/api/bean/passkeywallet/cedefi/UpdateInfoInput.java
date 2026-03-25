package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UpdateInfoInput implements Parcelable {
    public static final Parcelable.Creator<UpdateInfoInput> CREATOR = new Creator();
    public final String EZpvd;
    public final UpdateInfoSource KWHzl;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<UpdateInfoInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateInfoInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UpdateInfoInput(UpdateInfoSource.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateInfoInput[] newArray(int i) {
            return new UpdateInfoInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UpdateInfoInput copy$default(UpdateInfoInput updateInfoInput, UpdateInfoSource updateInfoSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            updateInfoSource = updateInfoInput.KWHzl;
        }
        if ((i & 2) != 0) {
            str = updateInfoInput.EZpvd;
        }
        return updateInfoInput.OLrzqt(updateInfoSource, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UpdateInfoInput OLrzqt(@NotNull UpdateInfoSource updateInfoSource, @NotNull String str) {
        Intrinsics.checkNotNullParameter(updateInfoSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new UpdateInfoInput(updateInfoSource, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof UpdateInfoInput)) {
            return false;
        }
        UpdateInfoInput updateInfoInput = (UpdateInfoInput) obj;
        return this.KWHzl == updateInfoInput.KWHzl && Intrinsics.EZpvd((Object) this.EZpvd, (Object) updateInfoInput.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UpdateInfoInput(source=" + this.KWHzl + ", chainIndex=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.EZpvd);
    }

    public UpdateInfoInput(@NotNull UpdateInfoSource updateInfoSource, @NotNull String str) {
        Intrinsics.checkNotNullParameter(updateInfoSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = updateInfoSource;
        this.EZpvd = str;
    }
}
