package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class EscapedWalletLoadUIData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapedWalletLoadUIData> CREATOR = new Creator();
    private final EscapedWalletListUIData escapedWalletListUIData;
    private final boolean isFirstLoad;
    private final boolean isLoadMore;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<EscapedWalletLoadUIData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedWalletLoadUIData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapedWalletLoadUIData(parcel.readInt() != 0, parcel.readInt() != 0, EscapedWalletListUIData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedWalletLoadUIData[] newArray(int i) {
            return new EscapedWalletLoadUIData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapedWalletLoadUIData copy$default(EscapedWalletLoadUIData escapedWalletLoadUIData, boolean z, boolean z2, EscapedWalletListUIData escapedWalletListUIData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = escapedWalletLoadUIData.isFirstLoad;
        }
        if ((i & 2) != 0) {
            z2 = escapedWalletLoadUIData.isLoadMore;
        }
        if ((i & 4) != 0) {
            escapedWalletListUIData = escapedWalletLoadUIData.escapedWalletListUIData;
        }
        return escapedWalletLoadUIData.copy(z, z2, escapedWalletListUIData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isFirstLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isLoadMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedWalletListUIData component3() {
        return this.escapedWalletListUIData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedWalletLoadUIData copy(boolean z, boolean z2, @NotNull EscapedWalletListUIData escapedWalletListUIData) {
        Intrinsics.checkNotNullParameter(escapedWalletListUIData, "");
        return new EscapedWalletLoadUIData(z, z2, escapedWalletListUIData);
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
        if (!(obj instanceof EscapedWalletLoadUIData)) {
            return false;
        }
        EscapedWalletLoadUIData escapedWalletLoadUIData = (EscapedWalletLoadUIData) obj;
        return this.isFirstLoad == escapedWalletLoadUIData.isFirstLoad && this.isLoadMore == escapedWalletLoadUIData.isLoadMore && Intrinsics.EZpvd(this.escapedWalletListUIData, escapedWalletLoadUIData.escapedWalletListUIData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedWalletListUIData getEscapedWalletListUIData() {
        return this.escapedWalletListUIData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.isFirstLoad) * 31) + Boolean.hashCode(this.isLoadMore)) * 31) + this.escapedWalletListUIData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFirstLoad() {
        return this.isFirstLoad;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLoadMore() {
        return this.isLoadMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapedWalletLoadUIData(isFirstLoad=" + this.isFirstLoad + ", isLoadMore=" + this.isLoadMore + ", escapedWalletListUIData=" + this.escapedWalletListUIData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isFirstLoad ? 1 : 0);
        parcel.writeInt(this.isLoadMore ? 1 : 0);
        this.escapedWalletListUIData.writeToParcel(parcel, i);
    }

    public EscapedWalletLoadUIData(boolean z, boolean z2, @NotNull EscapedWalletListUIData escapedWalletListUIData) {
        Intrinsics.checkNotNullParameter(escapedWalletListUIData, "");
        this.isFirstLoad = z;
        this.isLoadMore = z2;
        this.escapedWalletListUIData = escapedWalletListUIData;
    }
}
