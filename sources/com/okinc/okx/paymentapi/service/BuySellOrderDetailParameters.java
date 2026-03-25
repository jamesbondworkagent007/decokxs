package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class BuySellOrderDetailParameters implements Parcelable {
    public static final Parcelable.Creator<BuySellOrderDetailParameters> CREATOR = new Creator();
    public final TradeType AEQbTJ;
    public final OKPaymentSource EZpvd;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<BuySellOrderDetailParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellOrderDetailParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellOrderDetailParameters(TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), OKPaymentSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellOrderDetailParameters[] newArray(int i) {
            return new BuySellOrderDetailParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellOrderDetailParameters copy$default(BuySellOrderDetailParameters buySellOrderDetailParameters, TradeType tradeType, String str, OKPaymentSource oKPaymentSource, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeType = buySellOrderDetailParameters.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = buySellOrderDetailParameters.KWHzl;
        }
        if ((i & 4) != 0) {
            oKPaymentSource = buySellOrderDetailParameters.EZpvd;
        }
        return buySellOrderDetailParameters.KWHzl(tradeType, str, oKPaymentSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellOrderDetailParameters KWHzl(@NotNull TradeType tradeType, @NotNull String str, @NotNull OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        return new BuySellOrderDetailParameters(tradeType, str, oKPaymentSource);
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
        if (!(obj instanceof BuySellOrderDetailParameters)) {
            return false;
        }
        BuySellOrderDetailParameters buySellOrderDetailParameters = (BuySellOrderDetailParameters) obj;
        return this.AEQbTJ == buySellOrderDetailParameters.AEQbTJ && Intrinsics.EZpvd((Object) this.KWHzl, (Object) buySellOrderDetailParameters.KWHzl) && this.EZpvd == buySellOrderDetailParameters.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellOrderDetailParameters(tradeType=" + this.AEQbTJ + ", orderId=" + this.KWHzl + ", source=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.AEQbTJ.writeToParcel(parcel, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd.name());
    }

    public BuySellOrderDetailParameters(@NotNull TradeType tradeType, @NotNull String str, @NotNull OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        this.AEQbTJ = tradeType;
        this.KWHzl = str;
        this.EZpvd = oKPaymentSource;
    }
}
