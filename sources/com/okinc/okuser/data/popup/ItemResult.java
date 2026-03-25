package com.okinc.okuser.data.popup;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ItemResult implements Parcelable {
    public static final Parcelable.Creator<ItemResult> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<ItemResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ItemResult(parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemResult[] newArray(int i) {
            return new ItemResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ItemResult copy$default(ItemResult itemResult, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = itemResult.KWHzl;
        }
        if ((i & 2) != 0) {
            z = itemResult.AEQbTJ;
        }
        return itemResult.copydefault(str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ItemResult copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ItemResult(str, z);
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
        if (!(obj instanceof ItemResult)) {
            return false;
        }
        ItemResult itemResult = (ItemResult) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) itemResult.KWHzl) && this.AEQbTJ == itemResult.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ItemResult(type=" + this.KWHzl + ", result=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
    }

    public ItemResult(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = z;
    }
}
