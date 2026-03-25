package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class BuySellCryptoListParameters implements Parcelable {
    public static final Parcelable.Creator<BuySellCryptoListParameters> CREATOR = new Creator();
    public final OKPaymentSource AEQbTJ;
    public final OrderType EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final OrderFrequency copydefault;
    public final TradeType gEmmrt;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<BuySellCryptoListParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellCryptoListParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellCryptoListParameters(TradeType.CREATOR.createFromParcel(parcel), OKPaymentSource.valueOf(parcel.readString()), OrderType.valueOf(parcel.readString()), OrderFrequency.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellCryptoListParameters[] newArray(int i) {
            return new BuySellCryptoListParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellCryptoListParameters copy$default(BuySellCryptoListParameters buySellCryptoListParameters, TradeType tradeType, OKPaymentSource oKPaymentSource, OrderType orderType, OrderFrequency orderFrequency, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeType = buySellCryptoListParameters.gEmmrt;
        }
        if ((i & 2) != 0) {
            oKPaymentSource = buySellCryptoListParameters.AEQbTJ;
        }
        OKPaymentSource oKPaymentSource2 = oKPaymentSource;
        if ((i & 4) != 0) {
            orderType = buySellCryptoListParameters.EZpvd;
        }
        OrderType orderType2 = orderType;
        if ((i & 8) != 0) {
            orderFrequency = buySellCryptoListParameters.copydefault;
        }
        OrderFrequency orderFrequency2 = orderFrequency;
        if ((i & 16) != 0) {
            str = buySellCryptoListParameters.KWHzl;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = buySellCryptoListParameters.OLrzqt;
        }
        return buySellCryptoListParameters.AEQbTJ(tradeType, oKPaymentSource2, orderType2, orderFrequency2, str3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellCryptoListParameters AEQbTJ(@NotNull TradeType tradeType, @NotNull OKPaymentSource oKPaymentSource, @NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BuySellCryptoListParameters(tradeType, oKPaymentSource, orderType, orderFrequency, str, str2);
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
        if (!(obj instanceof BuySellCryptoListParameters)) {
            return false;
        }
        BuySellCryptoListParameters buySellCryptoListParameters = (BuySellCryptoListParameters) obj;
        return this.gEmmrt == buySellCryptoListParameters.gEmmrt && this.AEQbTJ == buySellCryptoListParameters.AEQbTJ && this.EZpvd == buySellCryptoListParameters.EZpvd && this.copydefault == buySellCryptoListParameters.copydefault && Intrinsics.EZpvd((Object) this.KWHzl, (Object) buySellCryptoListParameters.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) buySellCryptoListParameters.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.gEmmrt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellCryptoListParameters(tradeType=" + this.gEmmrt + ", source=" + this.AEQbTJ + ", orderType=" + this.EZpvd + ", frequencyType=" + this.copydefault + ", baseCurrency=" + this.KWHzl + ", quoteCurrency=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.gEmmrt.writeToParcel(parcel, i);
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeString(this.EZpvd.name());
        parcel.writeString(this.copydefault.name());
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
    }

    public BuySellCryptoListParameters(@NotNull TradeType tradeType, @NotNull OKPaymentSource oKPaymentSource, @NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.gEmmrt = tradeType;
        this.AEQbTJ = oKPaymentSource;
        this.EZpvd = orderType;
        this.copydefault = orderFrequency;
        this.KWHzl = str;
        this.OLrzqt = str2;
    }
}
