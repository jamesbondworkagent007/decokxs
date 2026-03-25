package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class WithdrawWalletAccount implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<WithdrawWalletAccount> CREATOR = new Creator();
    private final String accountIcon;
    private final String accountId;
    private final String accountName;
    private final String address;
    private final int addressType;
    private final long chainIndex;
    private final boolean evmCompatible;
    private final boolean existInAddressBook;
    private Boolean isBound;
    private final String networkIcon;
    private String networkName;
    private final int walletType;
    private final Long withdrawalLockedUntil;

    public static final class Creator implements Parcelable.Creator<WithdrawWalletAccount> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawWalletAccount createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            long j = parcel.readLong();
            int i2 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new WithdrawWalletAccount(string, string2, string3, i, j, i2, z, string4, lValueOf, string5, string6, z2, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WithdrawWalletAccount[] newArray(int i) {
            return new WithdrawWalletAccount[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component13() {
        return this.isBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.accountIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.existInAddressBook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component9() {
        return this.withdrawalLockedUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WithdrawWalletAccount copy(@NotNull String str, String str2, @NotNull String str3, int i, long j, int i2, boolean z, String str4, Long l, String str5, String str6, boolean z2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new WithdrawWalletAccount(str, str2, str3, i, j, i2, z, str4, l, str5, str6, z2, bool);
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
        if (!(obj instanceof WithdrawWalletAccount)) {
            return false;
        }
        WithdrawWalletAccount withdrawWalletAccount = (WithdrawWalletAccount) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) withdrawWalletAccount.accountId) && Intrinsics.EZpvd((Object) this.accountIcon, (Object) withdrawWalletAccount.accountIcon) && Intrinsics.EZpvd((Object) this.address, (Object) withdrawWalletAccount.address) && this.walletType == withdrawWalletAccount.walletType && this.chainIndex == withdrawWalletAccount.chainIndex && this.addressType == withdrawWalletAccount.addressType && this.existInAddressBook == withdrawWalletAccount.existInAddressBook && Intrinsics.EZpvd((Object) this.accountName, (Object) withdrawWalletAccount.accountName) && Intrinsics.EZpvd(this.withdrawalLockedUntil, withdrawWalletAccount.withdrawalLockedUntil) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) withdrawWalletAccount.networkIcon) && Intrinsics.EZpvd((Object) this.networkName, (Object) withdrawWalletAccount.networkName) && this.evmCompatible == withdrawWalletAccount.evmCompatible && Intrinsics.EZpvd(this.isBound, withdrawWalletAccount.isBound);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountIcon() {
        return this.accountIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountName() {
        return this.accountName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getEvmCompatible() {
        return this.evmCompatible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getExistInAddressBook() {
        return this.existInAddressBook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIcon() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkName() {
        return this.networkName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getWithdrawalLockedUntil() {
        return this.withdrawalLockedUntil;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        String str = this.accountIcon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.address.hashCode();
        int iHashCode4 = Integer.hashCode(this.walletType);
        int iHashCode5 = Long.hashCode(this.chainIndex);
        int iHashCode6 = Integer.hashCode(this.addressType);
        int iHashCode7 = Boolean.hashCode(this.existInAddressBook);
        String str2 = this.accountName;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        Long l = this.withdrawalLockedUntil;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        String str3 = this.networkIcon;
        int iHashCode10 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.networkName;
        int iHashCode11 = str4 == null ? 0 : str4.hashCode();
        int iHashCode12 = Boolean.hashCode(this.evmCompatible);
        Boolean bool = this.isBound;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isBound() {
        return this.isBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBound(Boolean bool) {
        this.isBound = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkName(String str) {
        this.networkName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WithdrawWalletAccount(accountId=" + this.accountId + ", accountIcon=" + this.accountIcon + ", address=" + this.address + ", walletType=" + this.walletType + ", chainIndex=" + this.chainIndex + ", addressType=" + this.addressType + ", existInAddressBook=" + this.existInAddressBook + ", accountName=" + this.accountName + ", withdrawalLockedUntil=" + this.withdrawalLockedUntil + ", networkIcon=" + this.networkIcon + ", networkName=" + this.networkName + ", evmCompatible=" + this.evmCompatible + ", isBound=" + this.isBound + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.accountIcon);
        parcel.writeString(this.address);
        parcel.writeInt(this.walletType);
        parcel.writeLong(this.chainIndex);
        parcel.writeInt(this.addressType);
        parcel.writeInt(this.existInAddressBook ? 1 : 0);
        parcel.writeString(this.accountName);
        Long l = this.withdrawalLockedUntil;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.networkIcon);
        parcel.writeString(this.networkName);
        parcel.writeInt(this.evmCompatible ? 1 : 0);
        Boolean bool = this.isBound;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public WithdrawWalletAccount(@NotNull String str, String str2, @NotNull String str3, int i, long j, int i2, boolean z, String str4, Long l, String str5, String str6, boolean z2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.accountId = str;
        this.accountIcon = str2;
        this.address = str3;
        this.walletType = i;
        this.chainIndex = j;
        this.addressType = i2;
        this.existInAddressBook = z;
        this.accountName = str4;
        this.withdrawalLockedUntil = l;
        this.networkIcon = str5;
        this.networkName = str6;
        this.evmCompatible = z2;
        this.isBound = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0046: CONSTRUCTOR 
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r33v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (r21v0 java.lang.String)
  (r22v0 int)
  (r23v0 long)
  (r25v0 int)
  (r26v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r33v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r33v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r28v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r33v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r33v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (r31v0 boolean)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r33v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r32v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, long, int, boolean, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, java.lang.Boolean):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.WithdrawWalletAccount.<init>(java.lang.String, java.lang.String, java.lang.String, int, long, int, boolean, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ WithdrawWalletAccount(String str, String str2, String str3, int i, long j, int i2, boolean z, String str4, Long l, String str5, String str6, boolean z2, Boolean bool, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? null : str2, str3, i, j, i2, z, (i3 & 128) != 0 ? null : str4, (i3 & 256) != 0 ? null : l, (i3 & 512) != 0 ? null : str5, (i3 & 1024) != 0 ? null : str6, z2, (i3 & 4096) != 0 ? Boolean.FALSE : bool);
    }
}
