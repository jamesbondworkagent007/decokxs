package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ExchangeTopUpPageParameters implements Parcelable {
    public static final Parcelable.Creator<ExchangeTopUpPageParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public final OKPaymentSource KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<ExchangeTopUpPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeTopUpPageParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ExchangeTopUpPageParameters(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : OKPaymentSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExchangeTopUpPageParameters[] newArray(int i) {
            return new ExchangeTopUpPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ExchangeTopUpPageParameters() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ExchangeTopUpPageParameters copy$default(ExchangeTopUpPageParameters exchangeTopUpPageParameters, String str, String str2, boolean z, OKPaymentSource oKPaymentSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeTopUpPageParameters.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = exchangeTopUpPageParameters.copydefault;
        }
        if ((i & 4) != 0) {
            z = exchangeTopUpPageParameters.OLrzqt;
        }
        if ((i & 8) != 0) {
            oKPaymentSource = exchangeTopUpPageParameters.KWHzl;
        }
        return exchangeTopUpPageParameters.OLrzqt(str, str2, z, oKPaymentSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeTopUpPageParameters OLrzqt(@NotNull String str, @NotNull String str2, boolean z, OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ExchangeTopUpPageParameters(str, str2, z, oKPaymentSource);
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
        if (!(obj instanceof ExchangeTopUpPageParameters)) {
            return false;
        }
        ExchangeTopUpPageParameters exchangeTopUpPageParameters = (ExchangeTopUpPageParameters) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) exchangeTopUpPageParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) exchangeTopUpPageParameters.copydefault) && this.OLrzqt == exchangeTopUpPageParameters.OLrzqt && this.KWHzl == exchangeTopUpPageParameters.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.copydefault.hashCode();
        int iHashCode3 = Boolean.hashCode(this.OLrzqt);
        OKPaymentSource oKPaymentSource = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (oKPaymentSource == null ? 0 : oKPaymentSource.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ExchangeTopUpPageParameters(baseAmount=" + this.AEQbTJ + ", baseCurrency=" + this.copydefault + ", isLoadingNeeded=" + this.OLrzqt + ", source=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        OKPaymentSource oKPaymentSource = this.KWHzl;
        if (oKPaymentSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(oKPaymentSource.name());
        }
    }

    public ExchangeTopUpPageParameters(@NotNull String str, @NotNull String str2, boolean z, OKPaymentSource oKPaymentSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.OLrzqt = z;
        this.KWHzl = oKPaymentSource;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r4v0 boolean))
  (wrap:com.okinc.okx.paymentapi.service.OKPaymentSource:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.OKPaymentSource) : (r5v0 com.okinc.okx.paymentapi.service.OKPaymentSource))
 A[MD:(java.lang.String, java.lang.String, boolean, com.okinc.okx.paymentapi.service.OKPaymentSource):void (m)] (LINE:459) call: com.okinc.okx.paymentapi.service.ExchangeTopUpPageParameters.<init>(java.lang.String, java.lang.String, boolean, com.okinc.okx.paymentapi.service.OKPaymentSource):void type: THIS */
    public /* synthetic */ ExchangeTopUpPageParameters(String str, String str2, boolean z, OKPaymentSource oKPaymentSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? null : oKPaymentSource);
    }
}
