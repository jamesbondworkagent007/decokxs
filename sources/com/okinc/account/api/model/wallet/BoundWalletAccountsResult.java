package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BoundWalletAccountsResult implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BoundWalletAccountsResult> CREATOR = new Creator();
    private final List<BoundWalletAccount> walletAccounts;
    private final int withdrawLimit;

    public static final class Creator implements Parcelable.Creator<BoundWalletAccountsResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundWalletAccountsResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BoundWalletAccount.CREATOR.createFromParcel(parcel));
            }
            return new BoundWalletAccountsResult(arrayList, parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundWalletAccountsResult[] newArray(int i) {
            return new BoundWalletAccountsResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.account.api.model.wallet.BoundWalletAccountsResult */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoundWalletAccountsResult copy$default(BoundWalletAccountsResult boundWalletAccountsResult, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = boundWalletAccountsResult.walletAccounts;
        }
        if ((i2 & 2) != 0) {
            i = boundWalletAccountsResult.withdrawLimit;
        }
        return boundWalletAccountsResult.copy(list, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BoundWalletAccount> component1() {
        return this.walletAccounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.withdrawLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundWalletAccountsResult copy(@NotNull List<BoundWalletAccount> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        return new BoundWalletAccountsResult(list, i);
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
        if (!(obj instanceof BoundWalletAccountsResult)) {
            return false;
        }
        BoundWalletAccountsResult boundWalletAccountsResult = (BoundWalletAccountsResult) obj;
        return Intrinsics.EZpvd(this.walletAccounts, boundWalletAccountsResult.walletAccounts) && this.withdrawLimit == boundWalletAccountsResult.withdrawLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BoundWalletAccount> getWalletAccounts() {
        return this.walletAccounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWithdrawLimit() {
        return this.withdrawLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.walletAccounts.hashCode() * 31) + Integer.hashCode(this.withdrawLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BoundWalletAccountsResult(walletAccounts=" + this.walletAccounts + ", withdrawLimit=" + this.withdrawLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<BoundWalletAccount> list = this.walletAccounts;
        parcel.writeInt(list.size());
        Iterator<BoundWalletAccount> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.withdrawLimit);
    }

    public BoundWalletAccountsResult(@NotNull List<BoundWalletAccount> list, int i) {
        Intrinsics.checkNotNullParameter(list, "");
        this.walletAccounts = list;
        this.withdrawLimit = i;
    }
}
