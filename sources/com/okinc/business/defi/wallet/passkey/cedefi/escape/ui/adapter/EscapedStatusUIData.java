package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapedStatusUIData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapedStatusUIData> CREATOR = new Creator();
    private final EscapedDetailStatus escapeStatus;
    private final String escapeTime;
    private final List<EscapedAddressTabItem> escapedAddressTabItem;
    private final boolean showCheckAssets;

    public static final class Creator implements Parcelable.Creator<EscapedStatusUIData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedStatusUIData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            EscapedDetailStatus escapedDetailStatusValueOf = EscapedDetailStatus.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EscapedAddressTabItem.CREATOR.createFromParcel(parcel));
            }
            return new EscapedStatusUIData(escapedDetailStatusValueOf, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedStatusUIData[] newArray(int i) {
            return new EscapedStatusUIData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedStatusUIData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapedStatusUIData copy$default(EscapedStatusUIData escapedStatusUIData, EscapedDetailStatus escapedDetailStatus, List list, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            escapedDetailStatus = escapedStatusUIData.escapeStatus;
        }
        if ((i & 2) != 0) {
            list = escapedStatusUIData.escapedAddressTabItem;
        }
        if ((i & 4) != 0) {
            str = escapedStatusUIData.escapeTime;
        }
        if ((i & 8) != 0) {
            z = escapedStatusUIData.showCheckAssets;
        }
        return escapedStatusUIData.copy(escapedDetailStatus, list, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedDetailStatus component1() {
        return this.escapeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapedAddressTabItem> component2() {
        return this.escapedAddressTabItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.escapeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.showCheckAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedStatusUIData copy(@NotNull EscapedDetailStatus escapedDetailStatus, @NotNull List<EscapedAddressTabItem> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(escapedDetailStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EscapedStatusUIData(escapedDetailStatus, list, str, z);
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
        if (!(obj instanceof EscapedStatusUIData)) {
            return false;
        }
        EscapedStatusUIData escapedStatusUIData = (EscapedStatusUIData) obj;
        return this.escapeStatus == escapedStatusUIData.escapeStatus && Intrinsics.EZpvd(this.escapedAddressTabItem, escapedStatusUIData.escapedAddressTabItem) && Intrinsics.EZpvd((Object) this.escapeTime, (Object) escapedStatusUIData.escapeTime) && this.showCheckAssets == escapedStatusUIData.showCheckAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedDetailStatus getEscapeStatus() {
        return this.escapeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeTime() {
        return this.escapeTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapedAddressTabItem> getEscapedAddressTabItem() {
        return this.escapedAddressTabItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowCheckAssets() {
        return this.showCheckAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.escapeStatus.hashCode() * 31) + this.escapedAddressTabItem.hashCode()) * 31) + this.escapeTime.hashCode()) * 31) + Boolean.hashCode(this.showCheckAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapedStatusUIData(escapeStatus=" + this.escapeStatus + ", escapedAddressTabItem=" + this.escapedAddressTabItem + ", escapeTime=" + this.escapeTime + ", showCheckAssets=" + this.showCheckAssets + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.escapeStatus.name());
        List<EscapedAddressTabItem> list = this.escapedAddressTabItem;
        parcel.writeInt(list.size());
        Iterator<EscapedAddressTabItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.escapeTime);
        parcel.writeInt(this.showCheckAssets ? 1 : 0);
    }

    public EscapedStatusUIData(@NotNull EscapedDetailStatus escapedDetailStatus, @NotNull List<EscapedAddressTabItem> list, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(escapedDetailStatus, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.escapeStatus = escapedDetailStatus;
        this.escapedAddressTabItem = list;
        this.escapeTime = str;
        this.showCheckAssets = z;
    }
}
