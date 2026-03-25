package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class ConfirmInfoForSpotGridAddInvestment implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ConfirmInfoForSpotGridAddInvestment> CREATOR = new Creator();
    private String algoId;
    private String reinvestProfitsQuoteAmount;
    private String topUpQuoteAmount;
    private String totalAddQuoteAmount;
    private String trailingDownFund;

    public static final class Creator implements Parcelable.Creator<ConfirmInfoForSpotGridAddInvestment> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmInfoForSpotGridAddInvestment createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ConfirmInfoForSpotGridAddInvestment(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmInfoForSpotGridAddInvestment[] newArray(int i) {
            return new ConfirmInfoForSpotGridAddInvestment[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ConfirmInfoForSpotGridAddInvestment() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConfirmInfoForSpotGridAddInvestment copy$default(ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestment, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = confirmInfoForSpotGridAddInvestment.algoId;
        }
        if ((i & 2) != 0) {
            str2 = confirmInfoForSpotGridAddInvestment.totalAddQuoteAmount;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = confirmInfoForSpotGridAddInvestment.topUpQuoteAmount;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = confirmInfoForSpotGridAddInvestment.reinvestProfitsQuoteAmount;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = confirmInfoForSpotGridAddInvestment.trailingDownFund;
        }
        return confirmInfoForSpotGridAddInvestment.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalAddQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.topUpQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.reinvestProfitsQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConfirmInfoForSpotGridAddInvestment copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ConfirmInfoForSpotGridAddInvestment(str, str2, str3, str4, str5);
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
        if (!(obj instanceof ConfirmInfoForSpotGridAddInvestment)) {
            return false;
        }
        ConfirmInfoForSpotGridAddInvestment confirmInfoForSpotGridAddInvestment = (ConfirmInfoForSpotGridAddInvestment) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) confirmInfoForSpotGridAddInvestment.algoId) && Intrinsics.EZpvd((Object) this.totalAddQuoteAmount, (Object) confirmInfoForSpotGridAddInvestment.totalAddQuoteAmount) && Intrinsics.EZpvd((Object) this.topUpQuoteAmount, (Object) confirmInfoForSpotGridAddInvestment.topUpQuoteAmount) && Intrinsics.EZpvd((Object) this.reinvestProfitsQuoteAmount, (Object) confirmInfoForSpotGridAddInvestment.reinvestProfitsQuoteAmount) && Intrinsics.EZpvd((Object) this.trailingDownFund, (Object) confirmInfoForSpotGridAddInvestment.trailingDownFund);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReinvestProfitsQuoteAmount() {
        return this.reinvestProfitsQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopUpQuoteAmount() {
        return this.topUpQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAddQuoteAmount() {
        return this.totalAddQuoteAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrailingDownFund() {
        return this.trailingDownFund;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.algoId.hashCode() * 31) + this.totalAddQuoteAmount.hashCode()) * 31) + this.topUpQuoteAmount.hashCode()) * 31) + this.reinvestProfitsQuoteAmount.hashCode()) * 31) + this.trailingDownFund.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvestProfitsQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.reinvestProfitsQuoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTopUpQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.topUpQuoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalAddQuoteAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalAddQuoteAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTrailingDownFund(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.trailingDownFund = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConfirmInfoForSpotGridAddInvestment(algoId=" + this.algoId + ", totalAddQuoteAmount=" + this.totalAddQuoteAmount + ", topUpQuoteAmount=" + this.topUpQuoteAmount + ", reinvestProfitsQuoteAmount=" + this.reinvestProfitsQuoteAmount + ", trailingDownFund=" + this.trailingDownFund + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.totalAddQuoteAmount);
        parcel.writeString(this.topUpQuoteAmount);
        parcel.writeString(this.reinvestProfitsQuoteAmount);
        parcel.writeString(this.trailingDownFund);
    }

    public ConfirmInfoForSpotGridAddInvestment(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.algoId = str;
        this.totalAddQuoteAmount = str2;
        this.topUpQuoteAmount = str3;
        this.reinvestProfitsQuoteAmount = str4;
        this.trailingDownFund = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:4674) call: com.okinc.unify_trade.biz.ConfirmInfoForSpotGridAddInvestment.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ConfirmInfoForSpotGridAddInvestment(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
