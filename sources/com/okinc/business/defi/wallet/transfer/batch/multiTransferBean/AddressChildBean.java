package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class AddressChildBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressChildBean> CREATOR = new Creator();
    private String address;
    private final int addressGroup;
    private String addressTag;
    private int addressType;
    private String coinBalance;
    private String displayName;
    private final String exchangeMemo;
    private boolean isAccountNameShow;
    private boolean isLineShow;
    private boolean isSelected;
    private boolean isShowBalance;
    private final boolean isSmartContract;
    private boolean isVisible;
    private String name;
    private final String walletId;

    public static final class Creator implements Parcelable.Creator<AddressChildBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressChildBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressChildBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressChildBean[] newArray(int i) {
            return new AddressChildBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.addressGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.exchangeMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isShowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.coinBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isLineShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.addressTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isAccountNameShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isSmartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressChildBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i, boolean z2, boolean z3, String str5, int i2, @NotNull String str6, boolean z4, boolean z5, boolean z6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new AddressChildBean(str, str2, str3, z, str4, i, z2, z3, str5, i2, str6, z4, z5, z6, str7);
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
        if (!(obj instanceof AddressChildBean)) {
            return false;
        }
        AddressChildBean addressChildBean = (AddressChildBean) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) addressChildBean.name) && Intrinsics.EZpvd((Object) this.address, (Object) addressChildBean.address) && Intrinsics.EZpvd((Object) this.displayName, (Object) addressChildBean.displayName) && this.isLineShow == addressChildBean.isLineShow && Intrinsics.EZpvd((Object) this.addressTag, (Object) addressChildBean.addressTag) && this.addressType == addressChildBean.addressType && this.isAccountNameShow == addressChildBean.isAccountNameShow && this.isSmartContract == addressChildBean.isSmartContract && Intrinsics.EZpvd((Object) this.walletId, (Object) addressChildBean.walletId) && this.addressGroup == addressChildBean.addressGroup && Intrinsics.EZpvd((Object) this.exchangeMemo, (Object) addressChildBean.exchangeMemo) && this.isSelected == addressChildBean.isSelected && this.isVisible == addressChildBean.isVisible && this.isShowBalance == addressChildBean.isShowBalance && Intrinsics.EZpvd((Object) this.coinBalance, (Object) addressChildBean.coinBalance);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressGroup() {
        return this.addressGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressTag() {
        return this.addressTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinBalance() {
        return this.coinBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExchangeMemo() {
        return this.exchangeMemo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.address.hashCode();
        int iHashCode3 = this.displayName.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isLineShow);
        int iHashCode5 = this.addressTag.hashCode();
        int iHashCode6 = Integer.hashCode(this.addressType);
        int iHashCode7 = Boolean.hashCode(this.isAccountNameShow);
        int iHashCode8 = Boolean.hashCode(this.isSmartContract);
        String str = this.walletId;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        int iHashCode10 = Integer.hashCode(this.addressGroup);
        int iHashCode11 = this.exchangeMemo.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isSelected);
        int iHashCode13 = Boolean.hashCode(this.isVisible);
        int iHashCode14 = Boolean.hashCode(this.isShowBalance);
        String str2 = this.coinBalance;
        return (((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (str2 == null ? 0 : str2.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAccountNameShow() {
        return this.isAccountNameShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isLineShow() {
        return this.isLineShow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowBalance() {
        return this.isShowBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSmartContract() {
        return this.isSmartContract;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isVisible() {
        return this.isVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccountNameShow(boolean z) {
        this.isAccountNameShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressTag(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressTag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressType(int i) {
        this.addressType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinBalance(String str) {
        this.coinBalance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLineShow(boolean z) {
        this.isLineShow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowBalance(boolean z) {
        this.isShowBalance = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVisible(boolean z) {
        this.isVisible = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressChildBean(name=" + this.name + ", address=" + this.address + ", displayName=" + this.displayName + ", isLineShow=" + this.isLineShow + ", addressTag=" + this.addressTag + ", addressType=" + this.addressType + ", isAccountNameShow=" + this.isAccountNameShow + ", isSmartContract=" + this.isSmartContract + ", walletId=" + this.walletId + ", addressGroup=" + this.addressGroup + ", exchangeMemo=" + this.exchangeMemo + ", isSelected=" + this.isSelected + ", isVisible=" + this.isVisible + ", isShowBalance=" + this.isShowBalance + ", coinBalance=" + this.coinBalance + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.address);
        parcel.writeString(this.displayName);
        parcel.writeInt(this.isLineShow ? 1 : 0);
        parcel.writeString(this.addressTag);
        parcel.writeInt(this.addressType);
        parcel.writeInt(this.isAccountNameShow ? 1 : 0);
        parcel.writeInt(this.isSmartContract ? 1 : 0);
        parcel.writeString(this.walletId);
        parcel.writeInt(this.addressGroup);
        parcel.writeString(this.exchangeMemo);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.isVisible ? 1 : 0);
        parcel.writeInt(this.isShowBalance ? 1 : 0);
        parcel.writeString(this.coinBalance);
    }

    public AddressChildBean(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, @NotNull String str4, int i, boolean z2, boolean z3, String str5, int i2, @NotNull String str6, boolean z4, boolean z5, boolean z6, String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.name = str;
        this.address = str2;
        this.displayName = str3;
        this.isLineShow = z;
        this.addressTag = str4;
        this.addressType = i;
        this.isAccountNameShow = z2;
        this.isSmartContract = z3;
        this.walletId = str5;
        this.addressGroup = i2;
        this.exchangeMemo = str6;
        this.isSelected = z4;
        this.isVisible = z5;
        this.isShowBalance = z6;
        this.coinBalance = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0082: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r35v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r35v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r35v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002d: ARITH (r35v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r25v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0036: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (r27v0 boolean)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r35v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r35v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r29v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r35v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r35v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005f: ARITH (r35v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? true : (r32v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0068: ARITH (r35v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0071: ARITH (r35v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean, boolean, java.lang.String, int, java.lang.String, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.AddressChildBean.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, boolean, boolean, java.lang.String, int, java.lang.String, boolean, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ AddressChildBean(String str, String str2, String str3, boolean z, String str4, int i, boolean z2, boolean z3, String str5, int i2, String str6, boolean z4, boolean z5, boolean z6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? true : z, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? -1 : i, (i3 & 64) != 0 ? true : z2, z3, (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? -1 : i2, (i3 & 1024) == 0 ? str6 : "", (i3 & 2048) != 0 ? false : z4, (i3 & 4096) != 0 ? true : z5, (i3 & 8192) != 0 ? false : z6, (i3 & 16384) != 0 ? null : str7);
    }
}
