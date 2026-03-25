package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class GridTipsItemData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GridTipsItemData> CREATOR = new Creator();
    private final float marginTop;
    private final String text;

    public static final class Creator implements Parcelable.Creator<GridTipsItemData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridTipsItemData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GridTipsItemData(parcel.readString(), parcel.readFloat());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GridTipsItemData[] newArray(int i) {
            return new GridTipsItemData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GridTipsItemData copy$default(GridTipsItemData gridTipsItemData, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gridTipsItemData.text;
        }
        if ((i & 2) != 0) {
            f = gridTipsItemData.marginTop;
        }
        return gridTipsItemData.copy(str, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GridTipsItemData copy(@NotNull String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        return new GridTipsItemData(str, f);
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
        if (!(obj instanceof GridTipsItemData)) {
            return false;
        }
        GridTipsItemData gridTipsItemData = (GridTipsItemData) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) gridTipsItemData.text) && Float.compare(this.marginTop, gridTipsItemData.marginTop) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getMarginTop() {
        return this.marginTop;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.text.hashCode() * 31) + Float.hashCode(this.marginTop);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GridTipsItemData(text=" + this.text + ", marginTop=" + this.marginTop + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeFloat(this.marginTop);
    }

    public GridTipsItemData(@NotNull String str, float f) {
        Intrinsics.checkNotNullParameter(str, "");
        this.text = str;
        this.marginTop = f;
    }
}
