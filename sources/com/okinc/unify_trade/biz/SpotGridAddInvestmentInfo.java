package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotGridAddInvestmentInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotGridAddInvestmentInfo> CREATOR = new Creator();
    private String maxAdditionalInvestment;
    private String minAdditionalInvestment;
    private String profit;
    private String trailingDownFund;

    public static final class Creator implements Parcelable.Creator<SpotGridAddInvestmentInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotGridAddInvestmentInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotGridAddInvestmentInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotGridAddInvestmentInfo[] newArray(int i) {
            return new SpotGridAddInvestmentInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotGridAddInvestmentInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotGridAddInvestmentInfo copy$default(SpotGridAddInvestmentInfo spotGridAddInvestmentInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotGridAddInvestmentInfo.minAdditionalInvestment;
        }
        if ((i & 2) != 0) {
            str2 = spotGridAddInvestmentInfo.profit;
        }
        if ((i & 4) != 0) {
            str3 = spotGridAddInvestmentInfo.trailingDownFund;
        }
        if ((i & 8) != 0) {
            str4 = spotGridAddInvestmentInfo.maxAdditionalInvestment;
        }
        return spotGridAddInvestmentInfo.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotGridAddInvestmentInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SpotGridAddInvestmentInfo(str, str2, str3, str4);
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
        if (!(obj instanceof SpotGridAddInvestmentInfo)) {
            return false;
        }
        SpotGridAddInvestmentInfo spotGridAddInvestmentInfo = (SpotGridAddInvestmentInfo) obj;
        return Intrinsics.EZpvd((Object) this.minAdditionalInvestment, (Object) spotGridAddInvestmentInfo.minAdditionalInvestment) && Intrinsics.EZpvd((Object) this.profit, (Object) spotGridAddInvestmentInfo.profit) && Intrinsics.EZpvd((Object) this.trailingDownFund, (Object) spotGridAddInvestmentInfo.trailingDownFund) && Intrinsics.EZpvd((Object) this.maxAdditionalInvestment, (Object) spotGridAddInvestmentInfo.maxAdditionalInvestment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAdditionalInvestment() {
        return this.maxAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAdditionalInvestment() {
        return this.minAdditionalInvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrailingDownFund() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.minAdditionalInvestment.hashCode() * 31) + this.profit.hashCode()) * 31) + this.trailingDownFund.hashCode()) * 31) + this.maxAdditionalInvestment.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxAdditionalInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxAdditionalInvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAdditionalInvestment(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minAdditionalInvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProfit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.profit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingDownFund(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.trailingDownFund = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotGridAddInvestmentInfo(minAdditionalInvestment=" + this.minAdditionalInvestment + ", profit=" + this.profit + ", trailingDownFund=" + this.trailingDownFund + ", maxAdditionalInvestment=" + this.maxAdditionalInvestment + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minAdditionalInvestment);
        parcel.writeString(this.profit);
        parcel.writeString(this.trailingDownFund);
        parcel.writeString(this.maxAdditionalInvestment);
    }

    public SpotGridAddInvestmentInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.minAdditionalInvestment = str;
        this.profit = str2;
        this.trailingDownFund = str3;
        this.maxAdditionalInvestment = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4658) call: com.okinc.unify_trade.biz.SpotGridAddInvestmentInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotGridAddInvestmentInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
