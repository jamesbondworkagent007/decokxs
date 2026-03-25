package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class WalletAccount implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<WalletAccount> CREATOR = new Creator();
    private final boolean isPayoutWallet;
    private final boolean isSupportPayout;
    private final String payoutWalletAddress;
    private final String serverWalletAccountId;
    private final WalletAccountStatus status;
    private final String totalAsset;
    private final String username;
    private final String walletAccountId;
    private final String walletAccountName;
    private final String walletAddress;
    private final String walletIcon;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<WalletAccount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAccount createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new WalletAccount(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), WalletAccountStatus.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WalletAccount[] newArray(int i) {
            return new WalletAccount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isSupportPayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.payoutWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.walletIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletAccountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.serverWalletAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccountStatus component6() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccount copy(@NotNull String str, String str2, @NotNull String str3, String str4, String str5, @NotNull WalletAccountStatus walletAccountStatus, String str6, String str7, boolean z, boolean z2, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(walletAccountStatus, "");
        return new WalletAccount(str, str2, str3, str4, str5, walletAccountStatus, str6, str7, z, z2, str8);
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
        if (!(obj instanceof WalletAccount)) {
            return false;
        }
        WalletAccount walletAccount = (WalletAccount) obj;
        return Intrinsics.EZpvd((Object) this.walletAccountId, (Object) walletAccount.walletAccountId) && Intrinsics.EZpvd((Object) this.walletIcon, (Object) walletAccount.walletIcon) && Intrinsics.EZpvd((Object) this.walletAccountName, (Object) walletAccount.walletAccountName) && Intrinsics.EZpvd((Object) this.serverWalletAccountId, (Object) walletAccount.serverWalletAccountId) && Intrinsics.EZpvd((Object) this.totalAsset, (Object) walletAccount.totalAsset) && this.status == walletAccount.status && Intrinsics.EZpvd((Object) this.walletAddress, (Object) walletAccount.walletAddress) && Intrinsics.EZpvd((Object) this.username, (Object) walletAccount.username) && this.isPayoutWallet == walletAccount.isPayoutWallet && this.isSupportPayout == walletAccount.isSupportPayout && Intrinsics.EZpvd((Object) this.payoutWalletAddress, (Object) walletAccount.payoutWalletAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPayoutWalletAddress() {
        return this.payoutWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServerWalletAccountId() {
        return this.serverWalletAccountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAccountStatus getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsername() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccountId() {
        return this.walletAccountId;
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
        int iHashCode = this.walletAccountId.hashCode();
        String str = this.walletIcon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.walletAccountName.hashCode();
        String str2 = this.serverWalletAccountId;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.totalAsset;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = this.status.hashCode();
        String str4 = this.walletAddress;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.username;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        int iHashCode9 = Boolean.hashCode(this.isPayoutWallet);
        int iHashCode10 = Boolean.hashCode(this.isSupportPayout);
        String str6 = this.payoutWalletAddress;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPayoutWallet() {
        return this.isPayoutWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupportPayout() {
        return this.isSupportPayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletAccountId);
        parcel.writeString(this.walletIcon);
        parcel.writeString(this.walletAccountName);
        parcel.writeString(this.serverWalletAccountId);
        parcel.writeString(this.totalAsset);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.walletAddress);
        parcel.writeString(this.username);
        parcel.writeInt(this.isPayoutWallet ? 1 : 0);
        parcel.writeInt(this.isSupportPayout ? 1 : 0);
        parcel.writeString(this.payoutWalletAddress);
    }

    public WalletAccount(@NotNull String str, String str2, @NotNull String str3, String str4, String str5, @NotNull WalletAccountStatus walletAccountStatus, String str6, String str7, boolean z, boolean z2, String str8) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(walletAccountStatus, "");
        this.walletAccountId = str;
        this.walletIcon = str2;
        this.walletAccountName = str3;
        this.serverWalletAccountId = str4;
        this.totalAsset = str5;
        this.status = walletAccountStatus;
        this.walletAddress = str6;
        this.username = str7;
        this.isPayoutWallet = z;
        this.isSupportPayout = z2;
        this.payoutWalletAddress = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004d: CONSTRUCTOR 
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:com.okinc.account.api.model.wallet.WalletAccountStatus:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: SGET  A[WRAPPED] (LINE:14) com.okinc.account.api.model.wallet.WalletAccountStatus.NOT_BOUND com.okinc.account.api.model.wallet.WalletAccountStatus) : (r21v0 com.okinc.account.api.model.wallet.WalletAccountStatus))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002d: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r27v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.account.api.model.wallet.WalletAccountStatus, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:7) call: com.okinc.account.api.model.wallet.WalletAccount.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.account.api.model.wallet.WalletAccountStatus, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ WalletAccount(String str, String str2, String str3, String str4, String str5, WalletAccountStatus walletAccountStatus, String str6, String str7, boolean z, boolean z2, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? WalletAccountStatus.NOT_BOUND : walletAccountStatus, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : str8);
    }

    public String toString() {
        return "WalletAccount(walletAccountId=" + this.walletAccountId + ", walletAccountName=" + this.walletAccountName + ", serverWalletAccountId=" + this.serverWalletAccountId + ", status=" + this.status + ", walletAddress=" + this.walletAddress + ", isPayoutWallet=" + this.isPayoutWallet + ", isSupportPayout=" + this.isSupportPayout + ", payoutWalletAddress=" + this.payoutWalletAddress + ")";
    }
}
