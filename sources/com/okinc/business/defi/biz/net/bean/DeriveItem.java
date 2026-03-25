package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class DeriveItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DeriveItem> CREATOR = new Creator();
    private final int deriveIndex;
    private final String mpcId;

    public static final class Creator implements Parcelable.Creator<DeriveItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeriveItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeriveItem(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeriveItem[] newArray(int i) {
            return new DeriveItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeriveItem copy$default(DeriveItem deriveItem, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deriveItem.mpcId;
        }
        if ((i2 & 2) != 0) {
            i = deriveItem.deriveIndex;
        }
        return deriveItem.copy(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.deriveIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeriveItem copy(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DeriveItem(str, i);
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
        if (!(obj instanceof DeriveItem)) {
            return false;
        }
        DeriveItem deriveItem = (DeriveItem) obj;
        return Intrinsics.EZpvd((Object) this.mpcId, (Object) deriveItem.mpcId) && this.deriveIndex == deriveItem.deriveIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDeriveIndex() {
        return this.deriveIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpcId() {
        return this.mpcId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.mpcId.hashCode() * 31) + Integer.hashCode(this.deriveIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeriveItem(mpcId=" + this.mpcId + ", deriveIndex=" + this.deriveIndex + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.mpcId);
        parcel.writeInt(this.deriveIndex);
    }

    public DeriveItem(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpcId = str;
        this.deriveIndex = i;
    }
}
