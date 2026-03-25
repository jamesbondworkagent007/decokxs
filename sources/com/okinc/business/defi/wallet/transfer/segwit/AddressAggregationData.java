package com.okinc.business.defi.wallet.transfer.segwit;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressAggregationData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressAggregationData> CREATOR = new Creator();
    private String address;
    private String addressTipsContent;
    private String addressTypeStr;
    private String amount;
    private long coinId;
    private int coinMetaPosition;
    private String currencyAmount;
    private String displayAmount;
    private String displayCurrencyAmount;
    private String imageUrl;
    private boolean isAddressEmpty;
    private boolean isChosenGenerateButton;
    private boolean isSupported;
    private boolean showRightArrow;
    private String tokenType;

    public static final class Creator implements Parcelable.Creator<AddressAggregationData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAggregationData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddressAggregationData(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressAggregationData[] newArray(int i) {
            return new AddressAggregationData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.addressTipsContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.coinMetaPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.isChosenGenerateButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.showRightArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isAddressEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.displayCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.addressTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressAggregationData copy(long j, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new AddressAggregationData(j, z, str, str2, str3, str4, str5, z2, str6, str7, str8, str9, i, z3, z4);
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
        if (!(obj instanceof AddressAggregationData)) {
            return false;
        }
        AddressAggregationData addressAggregationData = (AddressAggregationData) obj;
        return this.coinId == addressAggregationData.coinId && this.isAddressEmpty == addressAggregationData.isAddressEmpty && Intrinsics.EZpvd((Object) this.address, (Object) addressAggregationData.address) && Intrinsics.EZpvd((Object) this.displayAmount, (Object) addressAggregationData.displayAmount) && Intrinsics.EZpvd((Object) this.displayCurrencyAmount, (Object) addressAggregationData.displayCurrencyAmount) && Intrinsics.EZpvd((Object) this.tokenType, (Object) addressAggregationData.tokenType) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) addressAggregationData.imageUrl) && this.isSupported == addressAggregationData.isSupported && Intrinsics.EZpvd((Object) this.addressTypeStr, (Object) addressAggregationData.addressTypeStr) && Intrinsics.EZpvd((Object) this.addressTipsContent, (Object) addressAggregationData.addressTipsContent) && Intrinsics.EZpvd((Object) this.amount, (Object) addressAggregationData.amount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) addressAggregationData.currencyAmount) && this.coinMetaPosition == addressAggregationData.coinMetaPosition && this.isChosenGenerateButton == addressAggregationData.isChosenGenerateButton && this.showRightArrow == addressAggregationData.showRightArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressTipsContent() {
        return this.addressTipsContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressTypeStr() {
        return this.addressTypeStr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCoinMetaPosition() {
        return this.coinMetaPosition;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayAmount() {
        return this.displayAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayCurrencyAmount() {
        return this.displayCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowRightArrow() {
        return this.showRightArrow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((Long.hashCode(this.coinId) * 31) + Boolean.hashCode(this.isAddressEmpty)) * 31) + this.address.hashCode()) * 31) + this.displayAmount.hashCode()) * 31) + this.displayCurrencyAmount.hashCode()) * 31) + this.tokenType.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + Boolean.hashCode(this.isSupported)) * 31) + this.addressTypeStr.hashCode()) * 31) + this.addressTipsContent.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.currencyAmount.hashCode()) * 31) + Integer.hashCode(this.coinMetaPosition)) * 31) + Boolean.hashCode(this.isChosenGenerateButton)) * 31) + Boolean.hashCode(this.showRightArrow);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAddressEmpty() {
        return this.isAddressEmpty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isChosenGenerateButton() {
        return this.isChosenGenerateButton;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSupported() {
        return this.isSupported;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressEmpty(boolean z) {
        this.isAddressEmpty = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressTipsContent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressTipsContent = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressTypeStr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.addressTypeStr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChosenGenerateButton(boolean z) {
        this.isChosenGenerateButton = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinMetaPosition(int i) {
        this.coinMetaPosition = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayCurrencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowRightArrow(boolean z) {
        this.showRightArrow = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupported(boolean z) {
        this.isSupported = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressAggregationData(coinId=" + this.coinId + ", isAddressEmpty=" + this.isAddressEmpty + ", address=" + this.address + ", displayAmount=" + this.displayAmount + ", displayCurrencyAmount=" + this.displayCurrencyAmount + ", tokenType=" + this.tokenType + ", imageUrl=" + this.imageUrl + ", isSupported=" + this.isSupported + ", addressTypeStr=" + this.addressTypeStr + ", addressTipsContent=" + this.addressTipsContent + ", amount=" + this.amount + ", currencyAmount=" + this.currencyAmount + ", coinMetaPosition=" + this.coinMetaPosition + ", isChosenGenerateButton=" + this.isChosenGenerateButton + ", showRightArrow=" + this.showRightArrow + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeInt(this.isAddressEmpty ? 1 : 0);
        parcel.writeString(this.address);
        parcel.writeString(this.displayAmount);
        parcel.writeString(this.displayCurrencyAmount);
        parcel.writeString(this.tokenType);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.isSupported ? 1 : 0);
        parcel.writeString(this.addressTypeStr);
        parcel.writeString(this.addressTipsContent);
        parcel.writeString(this.amount);
        parcel.writeString(this.currencyAmount);
        parcel.writeInt(this.coinMetaPosition);
        parcel.writeInt(this.isChosenGenerateButton ? 1 : 0);
        parcel.writeInt(this.showRightArrow ? 1 : 0);
    }

    public AddressAggregationData(long j, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.coinId = j;
        this.isAddressEmpty = z;
        this.address = str;
        this.displayAmount = str2;
        this.displayCurrencyAmount = str3;
        this.tokenType = str4;
        this.imageUrl = str5;
        this.isSupported = z2;
        this.addressTypeStr = str6;
        this.addressTipsContent = str7;
        this.amount = str8;
        this.currencyAmount = str9;
        this.coinMetaPosition = i;
        this.isChosenGenerateButton = z3;
        this.showRightArrow = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r20v0 long)
  (r22v0 boolean)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 boolean)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 int)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? true : (r35v0 boolean))
 A[MD:(long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void (m)] (LINE:9) call: com.okinc.business.defi.wallet.transfer.segwit.AddressAggregationData.<init>(long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean):void type: THIS */
    public /* synthetic */ AddressAggregationData(long j, boolean z, String str, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, String str8, String str9, int i, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, z, str, str2, str3, str4, str5, z2, str6, str7, str8, str9, i, (i2 & 8192) != 0 ? false : z3, (i2 & 16384) != 0 ? true : z4);
    }
}
