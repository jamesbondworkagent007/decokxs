package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class FirstTimeTradeParameters implements Parcelable {
    public static final Parcelable.Creator<FirstTimeTradeParameters> CREATOR = new Creator();
    public final TradeType AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final OKPaymentSource copydefault;

    public static final class Creator implements Parcelable.Creator<FirstTimeTradeParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FirstTimeTradeParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FirstTimeTradeParameters(parcel.readString(), parcel.readString(), TradeType.CREATOR.createFromParcel(parcel), OKPaymentSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FirstTimeTradeParameters[] newArray(int i) {
            return new FirstTimeTradeParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FirstTimeTradeParameters copy$default(FirstTimeTradeParameters firstTimeTradeParameters, String str, String str2, TradeType tradeType, OKPaymentSource oKPaymentSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firstTimeTradeParameters.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = firstTimeTradeParameters.EZpvd;
        }
        if ((i & 4) != 0) {
            tradeType = firstTimeTradeParameters.AEQbTJ;
        }
        if ((i & 8) != 0) {
            oKPaymentSource = firstTimeTradeParameters.copydefault;
        }
        return firstTimeTradeParameters.AEQbTJ(str, str2, tradeType, oKPaymentSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FirstTimeTradeParameters AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull TradeType tradeType, @NotNull OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        return new FirstTimeTradeParameters(str, str2, tradeType, oKPaymentSource);
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
        if (!(obj instanceof FirstTimeTradeParameters)) {
            return false;
        }
        FirstTimeTradeParameters firstTimeTradeParameters = (FirstTimeTradeParameters) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) firstTimeTradeParameters.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) firstTimeTradeParameters.EZpvd) && this.AEQbTJ == firstTimeTradeParameters.AEQbTJ && this.copydefault == firstTimeTradeParameters.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FirstTimeTradeParameters(baseCurrency=" + this.KWHzl + ", quoteCurrency=" + this.EZpvd + ", tradeType=" + this.AEQbTJ + ", source=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        this.AEQbTJ.writeToParcel(parcel, i);
        parcel.writeString(this.copydefault.name());
    }

    public FirstTimeTradeParameters(@NotNull String str, @NotNull String str2, @NotNull TradeType tradeType, @NotNull OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        this.KWHzl = str;
        this.EZpvd = str2;
        this.AEQbTJ = tradeType;
        this.copydefault = oKPaymentSource;
    }
}
