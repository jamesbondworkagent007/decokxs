package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BTCNFTDetailsReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BTCNFTDetailsReq> CREATOR = new Creator();
    private List<String> inscriptionIds;
    private String walletAddress;

    public static final class Creator implements Parcelable.Creator<BTCNFTDetailsReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BTCNFTDetailsReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BTCNFTDetailsReq(parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BTCNFTDetailsReq[] newArray(int i) {
            return new BTCNFTDetailsReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.BTCNFTDetailsReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BTCNFTDetailsReq copy$default(BTCNFTDetailsReq bTCNFTDetailsReq, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bTCNFTDetailsReq.walletAddress;
        }
        if ((i & 2) != 0) {
            list = bTCNFTDetailsReq.inscriptionIds;
        }
        return bTCNFTDetailsReq.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.inscriptionIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCNFTDetailsReq copy(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BTCNFTDetailsReq(str, list);
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
        if (!(obj instanceof BTCNFTDetailsReq)) {
            return false;
        }
        BTCNFTDetailsReq bTCNFTDetailsReq = (BTCNFTDetailsReq) obj;
        return Intrinsics.EZpvd((Object) this.walletAddress, (Object) bTCNFTDetailsReq.walletAddress) && Intrinsics.EZpvd(this.inscriptionIds, bTCNFTDetailsReq.inscriptionIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getInscriptionIds() {
        return this.inscriptionIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletAddress.hashCode() * 31) + this.inscriptionIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionIds(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.inscriptionIds = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BTCNFTDetailsReq(walletAddress=" + this.walletAddress + ", inscriptionIds=" + this.inscriptionIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletAddress);
        parcel.writeStringList(this.inscriptionIds);
    }

    public BTCNFTDetailsReq(@NotNull String str, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAddress = str;
        this.inscriptionIds = list;
    }
}
