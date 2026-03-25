package com.okinc.business.defi.wallet.transaction.moduleModel.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class LinkItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LinkItem> CREATOR = new Creator();
    private final String href;
    private final String text;

    public static final class Creator implements Parcelable.Creator<LinkItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LinkItem(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkItem[] newArray(int i) {
            return new LinkItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LinkItem copy$default(LinkItem linkItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkItem.text;
        }
        if ((i & 2) != 0) {
            str2 = linkItem.href;
        }
        return linkItem.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkItem copy(String str, String str2) {
        return new LinkItem(str, str2);
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
        if (!(obj instanceof LinkItem)) {
            return false;
        }
        LinkItem linkItem = (LinkItem) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) linkItem.text) && Intrinsics.EZpvd((Object) this.href, (Object) linkItem.href);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHref() {
        return this.href;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.href;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinkItem(text=" + this.text + ", href=" + this.href + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeString(this.href);
    }

    public LinkItem(String str, String str2) {
        this.text = str;
        this.href = str2;
    }
}
