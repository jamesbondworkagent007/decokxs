package com.okinc.business.dex.trade.swap.market.priorityfee.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MarketTransactionFeeCacheParams implements Parcelable {
    public static final Parcelable.Creator<MarketTransactionFeeCacheParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final PriorityFeeType KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<MarketTransactionFeeCacheParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketTransactionFeeCacheParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MarketTransactionFeeCacheParams(parcel.readString(), parcel.readString(), PriorityFeeType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarketTransactionFeeCacheParams[] newArray(int i) {
            return new MarketTransactionFeeCacheParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MarketTransactionFeeCacheParams copy$default(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams, String str, String str2, PriorityFeeType priorityFeeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketTransactionFeeCacheParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = marketTransactionFeeCacheParams.copydefault;
        }
        if ((i & 4) != 0) {
            priorityFeeType = marketTransactionFeeCacheParams.KWHzl;
        }
        return marketTransactionFeeCacheParams.KWHzl(str, str2, priorityFeeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFeeType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTransactionFeeCacheParams KWHzl(@NotNull String str, @NotNull String str2, @NotNull PriorityFeeType priorityFeeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(priorityFeeType, "");
        return new MarketTransactionFeeCacheParams(str, str2, priorityFeeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof MarketTransactionFeeCacheParams)) {
            return false;
        }
        MarketTransactionFeeCacheParams marketTransactionFeeCacheParams = (MarketTransactionFeeCacheParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) marketTransactionFeeCacheParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) marketTransactionFeeCacheParams.copydefault) && this.KWHzl == marketTransactionFeeCacheParams.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketTransactionFeeCacheParams(feeValue=" + this.AEQbTJ + ", feeValueUsd=" + this.copydefault + ", priorityTag=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl.name());
    }

    public MarketTransactionFeeCacheParams(@NotNull String str, @NotNull String str2, @NotNull PriorityFeeType priorityFeeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(priorityFeeType, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.KWHzl = priorityFeeType;
    }
}
