package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SimpleBuySellInputPageParameters implements Parcelable {
    public static final Parcelable.Creator<SimpleBuySellInputPageParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public String EZpvd;
    public String KWHzl;
    public TradeType OLrzqt;
    public String copydefault;

    public static final class Creator implements Parcelable.Creator<SimpleBuySellInputPageParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleBuySellInputPageParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleBuySellInputPageParameters(TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleBuySellInputPageParameters[] newArray(int i) {
            return new SimpleBuySellInputPageParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleBuySellInputPageParameters() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleBuySellInputPageParameters copy$default(SimpleBuySellInputPageParameters simpleBuySellInputPageParameters, TradeType tradeType, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeType = simpleBuySellInputPageParameters.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = simpleBuySellInputPageParameters.KWHzl;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = simpleBuySellInputPageParameters.copydefault;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = simpleBuySellInputPageParameters.AEQbTJ;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = simpleBuySellInputPageParameters.EZpvd;
        }
        return simpleBuySellInputPageParameters.OLrzqt(tradeType, str5, str6, str7, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleBuySellInputPageParameters OLrzqt(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SimpleBuySellInputPageParameters(tradeType, str, str2, str3, str4);
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
        if (!(obj instanceof SimpleBuySellInputPageParameters)) {
            return false;
        }
        SimpleBuySellInputPageParameters simpleBuySellInputPageParameters = (SimpleBuySellInputPageParameters) obj;
        return this.OLrzqt == simpleBuySellInputPageParameters.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) simpleBuySellInputPageParameters.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) simpleBuySellInputPageParameters.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) simpleBuySellInputPageParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) simpleBuySellInputPageParameters.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleBuySellInputPageParameters(tradeType=" + this.OLrzqt + ", quoteAmount=" + this.KWHzl + ", quoteCurrency=" + this.copydefault + ", baseAmount=" + this.AEQbTJ + ", baseCurrency=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.OLrzqt.writeToParcel(parcel, i);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
    }

    public SimpleBuySellInputPageParameters(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.OLrzqt = tradeType;
        this.KWHzl = str;
        this.copydefault = str2;
        this.AEQbTJ = str3;
        this.EZpvd = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:0x0004: SGET  A[WRAPPED] (LINE:880) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r4v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:879) call: com.okinc.okx.paymentapi.service.SimpleBuySellInputPageParameters.<init>(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SimpleBuySellInputPageParameters(TradeType tradeType, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TradeType.BUY : tradeType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) == 0 ? str4 : "");
    }
}
