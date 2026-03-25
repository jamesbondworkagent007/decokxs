package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class AddressWithMemo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressWithMemo> CREATOR = new Creator();
    private String address;
    private final int index;
    private final boolean isExchangeMemo;
    private String memo;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<AddressWithMemo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressWithMemo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressWithMemo(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressWithMemo[] newArray(int i) {
            return new AddressWithMemo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddressWithMemo copy$default(AddressWithMemo addressWithMemo, String str, String str2, boolean z, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = addressWithMemo.address;
        }
        if ((i2 & 2) != 0) {
            str2 = addressWithMemo.memo;
        }
        if ((i2 & 4) != 0) {
            z = addressWithMemo.isExchangeMemo;
        }
        if ((i2 & 8) != 0) {
            i = addressWithMemo.index;
        }
        return addressWithMemo.copy(str, str2, z, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isExchangeMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressWithMemo copy(@NotNull String str, @NotNull String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddressWithMemo(str, str2, z, i);
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
        if (!(obj instanceof AddressWithMemo)) {
            return false;
        }
        AddressWithMemo addressWithMemo = (AddressWithMemo) obj;
        return Intrinsics.EZpvd((Object) this.address, (Object) addressWithMemo.address) && Intrinsics.EZpvd((Object) this.memo, (Object) addressWithMemo.memo) && this.isExchangeMemo == addressWithMemo.isExchangeMemo && this.index == addressWithMemo.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getIndex() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMemo() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.address.hashCode() * 31) + this.memo.hashCode()) * 31) + Boolean.hashCode(this.isExchangeMemo)) * 31) + Integer.hashCode(this.index);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isExchangeMemo() {
        return this.isExchangeMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressWithMemo(address=" + this.address + ", memo=" + this.memo + ", isExchangeMemo=" + this.isExchangeMemo + ", index=" + this.index + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.address);
        parcel.writeString(this.memo);
        parcel.writeInt(this.isExchangeMemo ? 1 : 0);
        parcel.writeInt(this.index);
    }

    public AddressWithMemo(@NotNull String str, @NotNull String str2, boolean z, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.address = str;
        this.memo = str2;
        this.isExchangeMemo = z;
        this.index = i;
    }
}
