package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class DepositWithdrawPageParameters implements Parcelable {
    public static final Parcelable.Creator<DepositWithdrawPageParameters> CREATOR = new Creator();
    public final OKPaymentSource KWHzl;
    public final DepositWithdrawLandingPage OLrzqt;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<DepositWithdrawPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositWithdrawPageParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DepositWithdrawPageParameters((DepositWithdrawLandingPage) parcel.readParcelable(DepositWithdrawPageParameters.class.getClassLoader()), OKPaymentSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DepositWithdrawPageParameters[] newArray(int i) {
            return new DepositWithdrawPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DepositWithdrawPageParameters copy$default(DepositWithdrawPageParameters depositWithdrawPageParameters, DepositWithdrawLandingPage depositWithdrawLandingPage, OKPaymentSource oKPaymentSource, int i, Object obj) {
        if ((i & 1) != 0) {
            depositWithdrawLandingPage = depositWithdrawPageParameters.OLrzqt;
        }
        if ((i & 2) != 0) {
            oKPaymentSource = depositWithdrawPageParameters.KWHzl;
        }
        return depositWithdrawPageParameters.OLrzqt(depositWithdrawLandingPage, oKPaymentSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DepositWithdrawPageParameters OLrzqt(@NotNull DepositWithdrawLandingPage depositWithdrawLandingPage, @NotNull OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(depositWithdrawLandingPage, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        return new DepositWithdrawPageParameters(depositWithdrawLandingPage, oKPaymentSource);
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
        if (!(obj instanceof DepositWithdrawPageParameters)) {
            return false;
        }
        DepositWithdrawPageParameters depositWithdrawPageParameters = (DepositWithdrawPageParameters) obj;
        return Intrinsics.EZpvd(this.OLrzqt, depositWithdrawPageParameters.OLrzqt) && this.KWHzl == depositWithdrawPageParameters.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DepositWithdrawPageParameters(landingPage=" + this.OLrzqt + ", source=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.OLrzqt, i);
        parcel.writeString(this.KWHzl.name());
    }

    public DepositWithdrawPageParameters(@NotNull DepositWithdrawLandingPage depositWithdrawLandingPage, @NotNull OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(depositWithdrawLandingPage, "");
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        this.OLrzqt = depositWithdrawLandingPage;
        this.KWHzl = oKPaymentSource;
    }
}
