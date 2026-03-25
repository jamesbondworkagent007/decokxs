package com.okinc.web3.security.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class TonAddress implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TonAddress> CREATOR = new Creator();
    private final TonAddressInfo hdTonAddress;
    private final String seedPhrase;
    private final TonAddressInfo tonAddress;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<TonAddress> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TonAddress createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            Parcelable.Creator<TonAddressInfo> creator = TonAddressInfo.CREATOR;
            return new TonAddress(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TonAddress[] newArray(int i) {
            return new TonAddress[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TonAddress copy$default(TonAddress tonAddress, String str, TonAddressInfo tonAddressInfo, TonAddressInfo tonAddressInfo2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tonAddress.seedPhrase;
        }
        if ((i & 2) != 0) {
            tonAddressInfo = tonAddress.tonAddress;
        }
        if ((i & 4) != 0) {
            tonAddressInfo2 = tonAddress.hdTonAddress;
        }
        return tonAddress.copy(str, tonAddressInfo, tonAddressInfo2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.seedPhrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonAddressInfo component2() {
        return this.tonAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonAddressInfo component3() {
        return this.hdTonAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonAddress copy(@NotNull String str, @NotNull TonAddressInfo tonAddressInfo, @NotNull TonAddressInfo tonAddressInfo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tonAddressInfo, "");
        Intrinsics.checkNotNullParameter(tonAddressInfo2, "");
        return new TonAddress(str, tonAddressInfo, tonAddressInfo2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonAddressInfo getHdTonAddress() {
        return this.hdTonAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSeedPhrase() {
        return this.seedPhrase;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TonAddressInfo getTonAddress() {
        return this.tonAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.seedPhrase.hashCode() * 31) + this.tonAddress.hashCode()) * 31) + this.hdTonAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TonAddress(seedPhrase=" + this.seedPhrase + ", tonAddress=" + this.tonAddress + ", hdTonAddress=" + this.hdTonAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.seedPhrase);
        this.tonAddress.writeToParcel(parcel, i);
        this.hdTonAddress.writeToParcel(parcel, i);
    }

    public TonAddress(@NotNull String str, @NotNull TonAddressInfo tonAddressInfo, @NotNull TonAddressInfo tonAddressInfo2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(tonAddressInfo, "");
        Intrinsics.checkNotNullParameter(tonAddressInfo2, "");
        this.seedPhrase = str;
        this.tonAddress = tonAddressInfo;
        this.hdTonAddress = tonAddressInfo2;
    }
}
