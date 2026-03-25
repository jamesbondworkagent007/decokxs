package com.okinc.business.web3pay.lib.features.paytransaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class QueryC2BExchangeRateParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<QueryC2BExchangeRateParams> CREATOR = new Creator();
    private final String fromCcySymbol;
    private final String fromTokenCoinTypeNo;
    private final String toAmount;
    private final String toCcySymbol;

    public static final class Creator implements Parcelable.Creator<QueryC2BExchangeRateParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryC2BExchangeRateParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QueryC2BExchangeRateParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryC2BExchangeRateParams[] newArray(int i) {
            return new QueryC2BExchangeRateParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QueryC2BExchangeRateParams copy$default(QueryC2BExchangeRateParams queryC2BExchangeRateParams, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryC2BExchangeRateParams.fromTokenCoinTypeNo;
        }
        if ((i & 2) != 0) {
            str2 = queryC2BExchangeRateParams.fromCcySymbol;
        }
        if ((i & 4) != 0) {
            str3 = queryC2BExchangeRateParams.toCcySymbol;
        }
        if ((i & 8) != 0) {
            str4 = queryC2BExchangeRateParams.toAmount;
        }
        return queryC2BExchangeRateParams.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fromTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QueryC2BExchangeRateParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new QueryC2BExchangeRateParams(str, str2, str3, str4);
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
        if (!(obj instanceof QueryC2BExchangeRateParams)) {
            return false;
        }
        QueryC2BExchangeRateParams queryC2BExchangeRateParams = (QueryC2BExchangeRateParams) obj;
        return Intrinsics.EZpvd((Object) this.fromTokenCoinTypeNo, (Object) queryC2BExchangeRateParams.fromTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.fromCcySymbol, (Object) queryC2BExchangeRateParams.fromCcySymbol) && Intrinsics.EZpvd((Object) this.toCcySymbol, (Object) queryC2BExchangeRateParams.toCcySymbol) && Intrinsics.EZpvd((Object) this.toAmount, (Object) queryC2BExchangeRateParams.toAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromCcySymbol() {
        return this.fromCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenCoinTypeNo() {
        return this.fromTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAmount() {
        return this.toAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCcySymbol() {
        return this.toCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.fromTokenCoinTypeNo.hashCode() * 31) + this.fromCcySymbol.hashCode()) * 31) + this.toCcySymbol.hashCode()) * 31) + this.toAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QueryC2BExchangeRateParams(fromTokenCoinTypeNo=" + this.fromTokenCoinTypeNo + ", fromCcySymbol=" + this.fromCcySymbol + ", toCcySymbol=" + this.toCcySymbol + ", toAmount=" + this.toAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fromTokenCoinTypeNo);
        parcel.writeString(this.fromCcySymbol);
        parcel.writeString(this.toCcySymbol);
        parcel.writeString(this.toAmount);
    }

    public QueryC2BExchangeRateParams(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.fromTokenCoinTypeNo = str;
        this.fromCcySymbol = str2;
        this.toCcySymbol = str3;
        this.toAmount = str4;
    }
}
