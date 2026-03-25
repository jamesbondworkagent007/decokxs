package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class FundingFeeDetailItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<FundingFeeDetailItem> CREATOR = new Creator();
    private final String calculateCurrentFee;
    private final String cellingAndFloor;
    private final String currentFee;
    private final String dealType;
    private final String description;
    private final String expectedOffPrice;
    private final Integer feeRateDig;
    private final String forecastFee;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<FundingFeeDetailItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingFeeDetailItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FundingFeeDetailItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FundingFeeDetailItem[] newArray(int i) {
            return new FundingFeeDetailItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.calculateCurrentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.forecastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cellingAndFloor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.expectedOffPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.dealType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.feeRateDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingFeeDetailItem copy(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new FundingFeeDetailItem(str, str2, str3, str4, str5, str6, str7, num);
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
        if (!(obj instanceof FundingFeeDetailItem)) {
            return false;
        }
        FundingFeeDetailItem fundingFeeDetailItem = (FundingFeeDetailItem) obj;
        return Intrinsics.EZpvd((Object) this.currentFee, (Object) fundingFeeDetailItem.currentFee) && Intrinsics.EZpvd((Object) this.calculateCurrentFee, (Object) fundingFeeDetailItem.calculateCurrentFee) && Intrinsics.EZpvd((Object) this.forecastFee, (Object) fundingFeeDetailItem.forecastFee) && Intrinsics.EZpvd((Object) this.cellingAndFloor, (Object) fundingFeeDetailItem.cellingAndFloor) && Intrinsics.EZpvd((Object) this.description, (Object) fundingFeeDetailItem.description) && Intrinsics.EZpvd((Object) this.expectedOffPrice, (Object) fundingFeeDetailItem.expectedOffPrice) && Intrinsics.EZpvd((Object) this.dealType, (Object) fundingFeeDetailItem.dealType) && Intrinsics.EZpvd(this.feeRateDig, fundingFeeDetailItem.feeRateDig);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalculateCurrentFee() {
        return this.calculateCurrentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCellingAndFloor() {
        return this.cellingAndFloor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentFee() {
        return this.currentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDealType() {
        return this.dealType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectedOffPrice() {
        return this.expectedOffPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getFeeRateDig() {
        return this.feeRateDig;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getForecastFee() {
        return this.forecastFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.currentFee.hashCode();
        String str = this.calculateCurrentFee;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.forecastFee.hashCode();
        int iHashCode4 = this.cellingAndFloor.hashCode();
        int iHashCode5 = this.description.hashCode();
        int iHashCode6 = this.expectedOffPrice.hashCode();
        String str2 = this.dealType;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.feeRateDig;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingFeeDetailItem(currentFee=" + this.currentFee + ", calculateCurrentFee=" + this.calculateCurrentFee + ", forecastFee=" + this.forecastFee + ", cellingAndFloor=" + this.cellingAndFloor + ", description=" + this.description + ", expectedOffPrice=" + this.expectedOffPrice + ", dealType=" + this.dealType + ", feeRateDig=" + this.feeRateDig + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currentFee);
        parcel.writeString(this.calculateCurrentFee);
        parcel.writeString(this.forecastFee);
        parcel.writeString(this.cellingAndFloor);
        parcel.writeString(this.description);
        parcel.writeString(this.expectedOffPrice);
        parcel.writeString(this.dealType);
        Integer num = this.feeRateDig;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public FundingFeeDetailItem(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, String str7, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.currentFee = str;
        this.calculateCurrentFee = str2;
        this.forecastFee = str3;
        this.cellingAndFloor = str4;
        this.description = str5;
        this.expectedOffPrice = str6;
        this.dealType = str7;
        this.feeRateDig = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (r16v0 java.lang.String)
  (r17v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000c: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (5 int) : (r19v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void (m)] (LINE:4449) call: com.okinc.unify_trade.biz.FundingFeeDetailItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer):void type: THIS */
    public /* synthetic */ FundingFeeDetailItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? 5 : num);
    }
}
