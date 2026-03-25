package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DescItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DescItem> CREATOR = new Creator();
    private final LinkItem link;
    private final String text;

    public static final class Creator implements Parcelable.Creator<DescItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DescItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DescItem(parcel.readString(), parcel.readInt() == 0 ? null : LinkItem.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DescItem[] newArray(int i) {
            return new DescItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DescItem copy$default(DescItem descItem, String str, LinkItem linkItem, int i, Object obj) {
        if ((i & 1) != 0) {
            str = descItem.text;
        }
        if ((i & 2) != 0) {
            linkItem = descItem.link;
        }
        return descItem.copy(str, linkItem);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkItem component2() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DescItem copy(String str, LinkItem linkItem) {
        return new DescItem(str, linkItem);
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
        if (!(obj instanceof DescItem)) {
            return false;
        }
        DescItem descItem = (DescItem) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) descItem.text) && Intrinsics.EZpvd(this.link, descItem.link);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkItem getLink() {
        return this.link;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        LinkItem linkItem = this.link;
        return (iHashCode * 31) + (linkItem != null ? linkItem.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DescItem(text=" + this.text + ", link=" + this.link + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        LinkItem linkItem = this.link;
        if (linkItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkItem.writeToParcel(parcel, i);
        }
    }

    public DescItem(String str, LinkItem linkItem) {
        this.text = str;
        this.link = linkItem;
    }
}
