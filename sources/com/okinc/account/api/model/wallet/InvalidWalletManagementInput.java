package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.account.api.model.wallet.BindWalletInput;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class InvalidWalletManagementInput implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<InvalidWalletManagementInput> CREATOR = new Creator();
    private final BindWalletInput.EntryPoint entryPoint;
    private final WalletAccount walletAccount;
    private final int withdrawLimit;

    public static final class Creator implements Parcelable.Creator<InvalidWalletManagementInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvalidWalletManagementInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvalidWalletManagementInput(parcel.readInt() == 0 ? null : WalletAccount.CREATOR.createFromParcel(parcel), parcel.readInt(), BindWalletInput.EntryPoint.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvalidWalletManagementInput[] newArray(int i) {
            return new InvalidWalletManagementInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvalidWalletManagementInput copy$default(InvalidWalletManagementInput invalidWalletManagementInput, WalletAccount walletAccount, int i, BindWalletInput.EntryPoint entryPoint, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            walletAccount = invalidWalletManagementInput.walletAccount;
        }
        if ((i2 & 2) != 0) {
            i = invalidWalletManagementInput.withdrawLimit;
        }
        if ((i2 & 4) != 0) {
            entryPoint = invalidWalletManagementInput.entryPoint;
        }
        return invalidWalletManagementInput.copy(walletAccount, i, entryPoint);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccount component1() {
        return this.walletAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.withdrawLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletInput.EntryPoint component3() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvalidWalletManagementInput copy(WalletAccount walletAccount, int i, @NotNull BindWalletInput.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "");
        return new InvalidWalletManagementInput(walletAccount, i, entryPoint);
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
        if (!(obj instanceof InvalidWalletManagementInput)) {
            return false;
        }
        InvalidWalletManagementInput invalidWalletManagementInput = (InvalidWalletManagementInput) obj;
        return Intrinsics.EZpvd(this.walletAccount, invalidWalletManagementInput.walletAccount) && this.withdrawLimit == invalidWalletManagementInput.withdrawLimit && this.entryPoint == invalidWalletManagementInput.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletInput.EntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccount getWalletAccount() {
        return this.walletAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWithdrawLimit() {
        return this.withdrawLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        WalletAccount walletAccount = this.walletAccount;
        return ((((walletAccount == null ? 0 : walletAccount.hashCode()) * 31) + Integer.hashCode(this.withdrawLimit)) * 31) + this.entryPoint.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvalidWalletManagementInput(walletAccount=" + this.walletAccount + ", withdrawLimit=" + this.withdrawLimit + ", entryPoint=" + this.entryPoint + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        WalletAccount walletAccount = this.walletAccount;
        if (walletAccount == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            walletAccount.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.withdrawLimit);
        this.entryPoint.writeToParcel(parcel, i);
    }

    public InvalidWalletManagementInput(WalletAccount walletAccount, int i, @NotNull BindWalletInput.EntryPoint entryPoint) {
        Intrinsics.checkNotNullParameter(entryPoint, "");
        this.walletAccount = walletAccount;
        this.withdrawLimit = i;
        this.entryPoint = entryPoint;
    }
}
