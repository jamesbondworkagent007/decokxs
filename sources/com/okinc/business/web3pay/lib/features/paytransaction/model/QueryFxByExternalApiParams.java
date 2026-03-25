package com.okinc.business.web3pay.lib.features.paytransaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class QueryFxByExternalApiParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<QueryFxByExternalApiParams> CREATOR = new Creator();
    private final String fromTokenCoinTypeNo;
    private final String merchantId;
    private final String toCcySymbol;

    public static final class Creator implements Parcelable.Creator<QueryFxByExternalApiParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryFxByExternalApiParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QueryFxByExternalApiParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QueryFxByExternalApiParams[] newArray(int i) {
            return new QueryFxByExternalApiParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QueryFxByExternalApiParams copy$default(QueryFxByExternalApiParams queryFxByExternalApiParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queryFxByExternalApiParams.merchantId;
        }
        if ((i & 2) != 0) {
            str2 = queryFxByExternalApiParams.fromTokenCoinTypeNo;
        }
        if ((i & 4) != 0) {
            str3 = queryFxByExternalApiParams.toCcySymbol;
        }
        return queryFxByExternalApiParams.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fromTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.toCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QueryFxByExternalApiParams copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new QueryFxByExternalApiParams(str, str2, str3);
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
        if (!(obj instanceof QueryFxByExternalApiParams)) {
            return false;
        }
        QueryFxByExternalApiParams queryFxByExternalApiParams = (QueryFxByExternalApiParams) obj;
        return Intrinsics.EZpvd((Object) this.merchantId, (Object) queryFxByExternalApiParams.merchantId) && Intrinsics.EZpvd((Object) this.fromTokenCoinTypeNo, (Object) queryFxByExternalApiParams.fromTokenCoinTypeNo) && Intrinsics.EZpvd((Object) this.toCcySymbol, (Object) queryFxByExternalApiParams.toCcySymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromTokenCoinTypeNo() {
        return this.fromTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMerchantId() {
        return this.merchantId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToCcySymbol() {
        return this.toCcySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.merchantId.hashCode() * 31) + this.fromTokenCoinTypeNo.hashCode()) * 31) + this.toCcySymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QueryFxByExternalApiParams(merchantId=" + this.merchantId + ", fromTokenCoinTypeNo=" + this.fromTokenCoinTypeNo + ", toCcySymbol=" + this.toCcySymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.merchantId);
        parcel.writeString(this.fromTokenCoinTypeNo);
        parcel.writeString(this.toCcySymbol);
    }

    public QueryFxByExternalApiParams(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.merchantId = str;
        this.fromTokenCoinTypeNo = str2;
        this.toCcySymbol = str3;
    }
}
