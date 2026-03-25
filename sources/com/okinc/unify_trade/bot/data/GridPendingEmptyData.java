package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC55787xqY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class GridPendingEmptyData implements Parcelable, InterfaceC55787xqY {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GridPendingEmptyData> CREATOR = new Creator();
    private final String desc;
    private final boolean isLeft;
    private final float margin;

    public static final class Creator implements Parcelable.Creator<GridPendingEmptyData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridPendingEmptyData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GridPendingEmptyData(parcel.readString(), parcel.readInt() != 0, parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridPendingEmptyData[] newArray(int i) {
            return new GridPendingEmptyData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridPendingEmptyData copy$default(GridPendingEmptyData gridPendingEmptyData, String str, boolean z, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridPendingEmptyData.desc;
        }
        if ((i & 2) != 0) {
            z = gridPendingEmptyData.isLeft;
        }
        if ((i & 4) != 0) {
            f = gridPendingEmptyData.margin;
        }
        return gridPendingEmptyData.copy(str, z, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component3() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridPendingEmptyData copy(@NotNull String str, boolean z, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridPendingEmptyData(str, z, f);
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
        if (!(obj instanceof GridPendingEmptyData)) {
            return false;
        }
        GridPendingEmptyData gridPendingEmptyData = (GridPendingEmptyData) obj;
        return Intrinsics.EZpvd((Object) this.desc, (Object) gridPendingEmptyData.desc) && this.isLeft == gridPendingEmptyData.isLeft && Float.compare(this.margin, gridPendingEmptyData.margin) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMargin() {
        return this.margin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.desc.hashCode() * 31) + Boolean.hashCode(this.isLeft)) * 31) + Float.hashCode(this.margin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLeft() {
        return this.isLeft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridPendingEmptyData(desc=" + this.desc + ", isLeft=" + this.isLeft + ", margin=" + this.margin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.desc);
        parcel.writeInt(this.isLeft ? 1 : 0);
        parcel.writeFloat(this.margin);
    }

    public GridPendingEmptyData(@NotNull String str, boolean z, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.desc = str;
        this.isLeft = z;
        this.margin = f;
    }
}
