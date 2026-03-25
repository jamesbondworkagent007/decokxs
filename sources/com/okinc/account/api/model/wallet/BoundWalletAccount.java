package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BoundWalletAccount implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BoundWalletAccount> CREATOR = new Creator();
    private final String accountId;
    private final boolean isCurrentPayoutWallet;
    private final String payoutWalletAddress;
    private final String userName;
    private final String walletAccountName;
    private final String walletAddress;
    private final String walletIcon;

    public static final class Creator implements Parcelable.Creator<BoundWalletAccount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundWalletAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BoundWalletAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoundWalletAccount[] newArray(int i) {
            return new BoundWalletAccount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BoundWalletAccount copy$default(BoundWalletAccount boundWalletAccount, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boundWalletAccount.accountId;
        }
        if ((i & 2) != 0) {
            str2 = boundWalletAccount.userName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = boundWalletAccount.walletAccountName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = boundWalletAccount.walletIcon;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = boundWalletAccount.walletAddress;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = boundWalletAccount.payoutWalletAddress;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = boundWalletAccount.isCurrentPayoutWallet;
        }
        return boundWalletAccount.copy(str, str7, str8, str9, str10, str11, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.payoutWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isCurrentPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BoundWalletAccount copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new BoundWalletAccount(str, str2, str3, str4, str5, str6, z);
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
        if (!(obj instanceof BoundWalletAccount)) {
            return false;
        }
        BoundWalletAccount boundWalletAccount = (BoundWalletAccount) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) boundWalletAccount.accountId) && Intrinsics.EZpvd((Object) this.userName, (Object) boundWalletAccount.userName) && Intrinsics.EZpvd((Object) this.walletAccountName, (Object) boundWalletAccount.walletAccountName) && Intrinsics.EZpvd((Object) this.walletIcon, (Object) boundWalletAccount.walletIcon) && Intrinsics.EZpvd((Object) this.walletAddress, (Object) boundWalletAccount.walletAddress) && Intrinsics.EZpvd((Object) this.payoutWalletAddress, (Object) boundWalletAccount.payoutWalletAddress) && this.isCurrentPayoutWallet == boundWalletAccount.isCurrentPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayoutWalletAddress() {
        return this.payoutWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserName() {
        return this.userName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccountName() {
        return this.walletAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletIcon() {
        return this.walletIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.accountId.hashCode() * 31) + this.userName.hashCode()) * 31) + this.walletAccountName.hashCode()) * 31) + this.walletIcon.hashCode()) * 31) + this.walletAddress.hashCode()) * 31) + this.payoutWalletAddress.hashCode()) * 31) + Boolean.hashCode(this.isCurrentPayoutWallet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCurrentPayoutWallet() {
        return this.isCurrentPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BoundWalletAccount(accountId=" + this.accountId + ", userName=" + this.userName + ", walletAccountName=" + this.walletAccountName + ", walletIcon=" + this.walletIcon + ", walletAddress=" + this.walletAddress + ", payoutWalletAddress=" + this.payoutWalletAddress + ", isCurrentPayoutWallet=" + this.isCurrentPayoutWallet + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.userName);
        parcel.writeString(this.walletAccountName);
        parcel.writeString(this.walletIcon);
        parcel.writeString(this.walletAddress);
        parcel.writeString(this.payoutWalletAddress);
        parcel.writeInt(this.isCurrentPayoutWallet ? 1 : 0);
    }

    public BoundWalletAccount(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.accountId = str;
        this.userName = str2;
        this.walletAccountName = str3;
        this.walletIcon = str4;
        this.walletAddress = str5;
        this.payoutWalletAddress = str6;
        this.isCurrentPayoutWallet = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:8) call: com.okinc.account.api.model.wallet.BoundWalletAccount.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ BoundWalletAccount(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? false : z);
    }
}
