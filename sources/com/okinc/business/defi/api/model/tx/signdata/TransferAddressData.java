package com.okinc.business.defi.api.model.tx.signdata;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TransferAddressData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransferAddressData> CREATOR = new Creator();
    private String address;
    private String exchangeDepositLimit;
    private int index;
    private String memo;
    private String okexAccount;

    public static final class Creator implements Parcelable.Creator<TransferAddressData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferAddressData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TransferAddressData(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransferAddressData[] newArray(int i) {
            return new TransferAddressData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TransferAddressData copy$default(TransferAddressData transferAddressData, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transferAddressData.index;
        }
        if ((i2 & 2) != 0) {
            str = transferAddressData.address;
        }
        String str5 = str;
        if ((i2 & 4) != 0) {
            str2 = transferAddressData.exchangeDepositLimit;
        }
        String str6 = str2;
        if ((i2 & 8) != 0) {
            str3 = transferAddressData.okexAccount;
        }
        String str7 = str3;
        if ((i2 & 16) != 0) {
            str4 = transferAddressData.memo;
        }
        return transferAddressData.copy(i, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.exchangeDepositLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.memo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransferAddressData copy(int i, @NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TransferAddressData(i, str, str2, str3, str4);
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
        if (!(obj instanceof TransferAddressData)) {
            return false;
        }
        TransferAddressData transferAddressData = (TransferAddressData) obj;
        return this.index == transferAddressData.index && Intrinsics.EZpvd((Object) this.address, (Object) transferAddressData.address) && Intrinsics.EZpvd((Object) this.exchangeDepositLimit, (Object) transferAddressData.exchangeDepositLimit) && Intrinsics.EZpvd((Object) this.okexAccount, (Object) transferAddressData.okexAccount) && Intrinsics.EZpvd((Object) this.memo, (Object) transferAddressData.memo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeDepositLimit() {
        return this.exchangeDepositLimit;
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
    public final String getOkexAccount() {
        return this.okexAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.index);
        int iHashCode2 = this.address.hashCode();
        String str = this.exchangeDepositLimit;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.okexAccount;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.memo;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeDepositLimit(String str) {
        this.exchangeDepositLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIndex(int i) {
        this.index = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMemo(String str) {
        this.memo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOkexAccount(String str) {
        this.okexAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransferAddressData(index=" + this.index + ", address=" + this.address + ", exchangeDepositLimit=" + this.exchangeDepositLimit + ", okexAccount=" + this.okexAccount + ", memo=" + this.memo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.index);
        parcel.writeString(this.address);
        parcel.writeString(this.exchangeDepositLimit);
        parcel.writeString(this.okexAccount);
        parcel.writeString(this.memo);
    }

    public TransferAddressData(int i, @NotNull String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.index = i;
        this.address = str;
        this.exchangeDepositLimit = str2;
        this.okexAccount = str3;
        this.memo = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (r8v0 int)
  (r9v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:94) call: com.okinc.business.defi.api.model.tx.signdata.TransferAddressData.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TransferAddressData(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4);
    }
}
