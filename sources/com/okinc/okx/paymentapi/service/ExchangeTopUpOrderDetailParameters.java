package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ExchangeTopUpOrderDetailParameters implements Parcelable {
    public static final Parcelable.Creator<ExchangeTopUpOrderDetailParameters> CREATOR = new Creator();
    public final OKPaymentSource AEQbTJ;
    public final String KWHzl;

    public static final class Creator implements Parcelable.Creator<ExchangeTopUpOrderDetailParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeTopUpOrderDetailParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeTopUpOrderDetailParameters(parcel.readString(), parcel.readInt() == 0 ? null : OKPaymentSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeTopUpOrderDetailParameters[] newArray(int i) {
            return new ExchangeTopUpOrderDetailParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeTopUpOrderDetailParameters copy$default(ExchangeTopUpOrderDetailParameters exchangeTopUpOrderDetailParameters, String str, OKPaymentSource oKPaymentSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeTopUpOrderDetailParameters.KWHzl;
        }
        if ((i & 2) != 0) {
            oKPaymentSource = exchangeTopUpOrderDetailParameters.AEQbTJ;
        }
        return exchangeTopUpOrderDetailParameters.copydefault(str, oKPaymentSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeTopUpOrderDetailParameters copydefault(@NotNull String str, OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ExchangeTopUpOrderDetailParameters(str, oKPaymentSource);
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
        if (!(obj instanceof ExchangeTopUpOrderDetailParameters)) {
            return false;
        }
        ExchangeTopUpOrderDetailParameters exchangeTopUpOrderDetailParameters = (ExchangeTopUpOrderDetailParameters) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) exchangeTopUpOrderDetailParameters.KWHzl) && this.AEQbTJ == exchangeTopUpOrderDetailParameters.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        OKPaymentSource oKPaymentSource = this.AEQbTJ;
        return (iHashCode * 31) + (oKPaymentSource == null ? 0 : oKPaymentSource.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeTopUpOrderDetailParameters(orderId=" + this.KWHzl + ", source=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        OKPaymentSource oKPaymentSource = this.AEQbTJ;
        if (oKPaymentSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(oKPaymentSource.name());
        }
    }

    public ExchangeTopUpOrderDetailParameters(@NotNull String str, OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = oKPaymentSource;
    }
}
