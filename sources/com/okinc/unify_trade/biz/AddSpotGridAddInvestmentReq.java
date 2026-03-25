package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class AddSpotGridAddInvestmentReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddSpotGridAddInvestmentReq> CREATOR = new Creator();
    private String additionalInvestmentAmount;
    private String algoId;
    private String shouldReinvestProfits;

    public static final class Creator implements Parcelable.Creator<AddSpotGridAddInvestmentReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddSpotGridAddInvestmentReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AddSpotGridAddInvestmentReq(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddSpotGridAddInvestmentReq[] newArray(int i) {
            return new AddSpotGridAddInvestmentReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AddSpotGridAddInvestmentReq copy$default(AddSpotGridAddInvestmentReq addSpotGridAddInvestmentReq, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addSpotGridAddInvestmentReq.algoId;
        }
        if ((i & 2) != 0) {
            str2 = addSpotGridAddInvestmentReq.additionalInvestmentAmount;
        }
        if ((i & 4) != 0) {
            str3 = addSpotGridAddInvestmentReq.shouldReinvestProfits;
        }
        return addSpotGridAddInvestmentReq.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.additionalInvestmentAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.shouldReinvestProfits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddSpotGridAddInvestmentReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new AddSpotGridAddInvestmentReq(str, str2, str3);
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
        if (!(obj instanceof AddSpotGridAddInvestmentReq)) {
            return false;
        }
        AddSpotGridAddInvestmentReq addSpotGridAddInvestmentReq = (AddSpotGridAddInvestmentReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) addSpotGridAddInvestmentReq.algoId) && Intrinsics.EZpvd((Object) this.additionalInvestmentAmount, (Object) addSpotGridAddInvestmentReq.additionalInvestmentAmount) && Intrinsics.EZpvd((Object) this.shouldReinvestProfits, (Object) addSpotGridAddInvestmentReq.shouldReinvestProfits);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalInvestmentAmount() {
        return this.additionalInvestmentAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShouldReinvestProfits() {
        return this.shouldReinvestProfits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.algoId.hashCode() * 31) + this.additionalInvestmentAmount.hashCode()) * 31) + this.shouldReinvestProfits.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdditionalInvestmentAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalInvestmentAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShouldReinvestProfits(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.shouldReinvestProfits = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddSpotGridAddInvestmentReq(algoId=" + this.algoId + ", additionalInvestmentAmount=" + this.additionalInvestmentAmount + ", shouldReinvestProfits=" + this.shouldReinvestProfits + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.additionalInvestmentAmount);
        parcel.writeString(this.shouldReinvestProfits);
    }

    public AddSpotGridAddInvestmentReq(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.algoId = str;
        this.additionalInvestmentAmount = str2;
        this.shouldReinvestProfits = str3;
    }
}
