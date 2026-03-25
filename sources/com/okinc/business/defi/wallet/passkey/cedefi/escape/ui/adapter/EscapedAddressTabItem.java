package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapedAddressTabItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EscapedAddressTabItem> CREATOR = new Creator();
    private final EscapedAddressData escapedAddressData;
    private final String tabName;
    private final String tabTag;

    public static final class Creator implements Parcelable.Creator<EscapedAddressTabItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedAddressTabItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapedAddressTabItem(parcel.readString(), parcel.readString(), EscapedAddressData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedAddressTabItem[] newArray(int i) {
            return new EscapedAddressTabItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapedAddressTabItem copy$default(EscapedAddressTabItem escapedAddressTabItem, String str, String str2, EscapedAddressData escapedAddressData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapedAddressTabItem.tabName;
        }
        if ((i & 2) != 0) {
            str2 = escapedAddressTabItem.tabTag;
        }
        if ((i & 4) != 0) {
            escapedAddressData = escapedAddressTabItem.escapedAddressData;
        }
        return escapedAddressTabItem.copy(str, str2, escapedAddressData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tabTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedAddressData component3() {
        return this.escapedAddressData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedAddressTabItem copy(@NotNull String str, @NotNull String str2, @NotNull EscapedAddressData escapedAddressData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(escapedAddressData, "");
        return new EscapedAddressTabItem(str, str2, escapedAddressData);
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
        if (!(obj instanceof EscapedAddressTabItem)) {
            return false;
        }
        EscapedAddressTabItem escapedAddressTabItem = (EscapedAddressTabItem) obj;
        return Intrinsics.EZpvd((Object) this.tabName, (Object) escapedAddressTabItem.tabName) && Intrinsics.EZpvd((Object) this.tabTag, (Object) escapedAddressTabItem.tabTag) && Intrinsics.EZpvd(this.escapedAddressData, escapedAddressTabItem.escapedAddressData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedAddressData getEscapedAddressData() {
        return this.escapedAddressData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabName() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabTag() {
        return this.tabTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.tabName.hashCode() * 31) + this.tabTag.hashCode()) * 31) + this.escapedAddressData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapedAddressTabItem(tabName=" + this.tabName + ", tabTag=" + this.tabTag + ", escapedAddressData=" + this.escapedAddressData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tabName);
        parcel.writeString(this.tabTag);
        this.escapedAddressData.writeToParcel(parcel, i);
    }

    public EscapedAddressTabItem(@NotNull String str, @NotNull String str2, @NotNull EscapedAddressData escapedAddressData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(escapedAddressData, "");
        this.tabName = str;
        this.tabTag = str2;
        this.escapedAddressData = escapedAddressData;
    }
}
