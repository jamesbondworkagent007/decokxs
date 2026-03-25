package com.okinc.buysell.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class ProBuySellCryptoListParameters implements Parcelable {
    public static final Parcelable.Creator<ProBuySellCryptoListParameters> CREATOR = new Creator();
    public final BuySellTradeType AEQbTJ;

    public static final class Creator implements Parcelable.Creator<ProBuySellCryptoListParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProBuySellCryptoListParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProBuySellCryptoListParameters(BuySellTradeType.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProBuySellCryptoListParameters[] newArray(int i) {
            return new ProBuySellCryptoListParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ProBuySellCryptoListParameters() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ProBuySellCryptoListParameters copy$default(ProBuySellCryptoListParameters proBuySellCryptoListParameters, BuySellTradeType buySellTradeType, int i, Object obj) {
        if ((i & 1) != 0) {
            buySellTradeType = proBuySellCryptoListParameters.AEQbTJ;
        }
        return proBuySellCryptoListParameters.EZpvd(buySellTradeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProBuySellCryptoListParameters EZpvd(@NotNull BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        return new ProBuySellCryptoListParameters(buySellTradeType);
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
        return (obj instanceof ProBuySellCryptoListParameters) && this.AEQbTJ == ((ProBuySellCryptoListParameters) obj).AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProBuySellCryptoListParameters(tradeType=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.AEQbTJ.writeToParcel(parcel, i);
    }

    public ProBuySellCryptoListParameters(@NotNull BuySellTradeType buySellTradeType) {
        Intrinsics.checkNotNullParameter(buySellTradeType, "");
        this.AEQbTJ = buySellTradeType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:com.okinc.buysell.api.BuySellTradeType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.buysell.api.BuySellTradeType:0x0004: SGET  A[WRAPPED] (LINE:183) com.okinc.buysell.api.BuySellTradeType.BUY com.okinc.buysell.api.BuySellTradeType) : (r1v0 com.okinc.buysell.api.BuySellTradeType))
 A[MD:(com.okinc.buysell.api.BuySellTradeType):void (m)] (LINE:182) call: com.okinc.buysell.api.ProBuySellCryptoListParameters.<init>(com.okinc.buysell.api.BuySellTradeType):void type: THIS */
    public /* synthetic */ ProBuySellCryptoListParameters(BuySellTradeType buySellTradeType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? BuySellTradeType.BUY : buySellTradeType);
    }
}
