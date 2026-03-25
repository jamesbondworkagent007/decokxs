package com.okinc.business.defi.biz.core.tx.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TxReplaceSendInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TxReplaceSendInfo> CREATOR = new Creator();
    private final String currentCurrency;
    private final String currentFee;
    private final String currentGwei;
    private final String gasLimit;
    private final String maxBaseFee;
    private final String maxPriorityFee;
    private final String neededCurrency;
    private final String neededFee;
    private final String neededGwei;

    public static final class Creator implements Parcelable.Creator<TxReplaceSendInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxReplaceSendInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TxReplaceSendInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TxReplaceSendInfo[] newArray(int i) {
            return new TxReplaceSendInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currentCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currentGwei;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.neededFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.neededCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.neededGwei;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.maxBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxReplaceSendInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new TxReplaceSendInfo(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof TxReplaceSendInfo)) {
            return false;
        }
        TxReplaceSendInfo txReplaceSendInfo = (TxReplaceSendInfo) obj;
        return Intrinsics.EZpvd((Object) this.currentFee, (Object) txReplaceSendInfo.currentFee) && Intrinsics.EZpvd((Object) this.currentCurrency, (Object) txReplaceSendInfo.currentCurrency) && Intrinsics.EZpvd((Object) this.currentGwei, (Object) txReplaceSendInfo.currentGwei) && Intrinsics.EZpvd((Object) this.neededFee, (Object) txReplaceSendInfo.neededFee) && Intrinsics.EZpvd((Object) this.neededCurrency, (Object) txReplaceSendInfo.neededCurrency) && Intrinsics.EZpvd((Object) this.neededGwei, (Object) txReplaceSendInfo.neededGwei) && Intrinsics.EZpvd((Object) this.gasLimit, (Object) txReplaceSendInfo.gasLimit) && Intrinsics.EZpvd((Object) this.maxBaseFee, (Object) txReplaceSendInfo.maxBaseFee) && Intrinsics.EZpvd((Object) this.maxPriorityFee, (Object) txReplaceSendInfo.maxPriorityFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentCurrency() {
        return this.currentCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentFee() {
        return this.currentFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentGwei() {
        return this.currentGwei;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasLimit() {
        return this.gasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxBaseFee() {
        return this.maxBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFee() {
        return this.maxPriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeededCurrency() {
        return this.neededCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeededFee() {
        return this.neededFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNeededGwei() {
        return this.neededGwei;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.currentFee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currentCurrency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.currentGwei;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.neededFee;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.neededCurrency;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.neededGwei;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.gasLimit;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.maxBaseFee;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.maxPriorityFee;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxReplaceSendInfo(currentFee=" + this.currentFee + ", currentCurrency=" + this.currentCurrency + ", currentGwei=" + this.currentGwei + ", neededFee=" + this.neededFee + ", neededCurrency=" + this.neededCurrency + ", neededGwei=" + this.neededGwei + ", gasLimit=" + this.gasLimit + ", maxBaseFee=" + this.maxBaseFee + ", maxPriorityFee=" + this.maxPriorityFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currentFee);
        parcel.writeString(this.currentCurrency);
        parcel.writeString(this.currentGwei);
        parcel.writeString(this.neededFee);
        parcel.writeString(this.neededCurrency);
        parcel.writeString(this.neededGwei);
        parcel.writeString(this.gasLimit);
        parcel.writeString(this.maxBaseFee);
        parcel.writeString(this.maxPriorityFee);
    }

    public TxReplaceSendInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.currentFee = str;
        this.currentCurrency = str2;
        this.currentGwei = str3;
        this.neededFee = str4;
        this.neededCurrency = str5;
        this.neededGwei = str6;
        this.gasLimit = str7;
        this.maxBaseFee = str8;
        this.maxPriorityFee = str9;
    }
}
