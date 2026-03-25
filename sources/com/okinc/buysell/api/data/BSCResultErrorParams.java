package com.okinc.buysell.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.buysell.api.BuySellTradeType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BSCResultErrorParams implements Parcelable {
    public static final Parcelable.Creator<BSCResultErrorParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final BuySellTradeType AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final String djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<BSCResultErrorParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCResultErrorParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BSCResultErrorParams(parcel.readInt() == 0 ? null : BuySellTradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BSCResultErrorParams[] newArray(int i) {
            return new BSCResultErrorParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BSCResultErrorParams() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BSCResultErrorParams copydefault(BuySellTradeType buySellTradeType, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new BSCResultErrorParams(buySellTradeType, str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof BSCResultErrorParams)) {
            return false;
        }
        BSCResultErrorParams bSCResultErrorParams = (BSCResultErrorParams) obj;
        return this.AhwBna == bSCResultErrorParams.AhwBna && Intrinsics.EZpvd((Object) this.EZpvd, (Object) bSCResultErrorParams.EZpvd) && Intrinsics.EZpvd((Object) this.copydefault, (Object) bSCResultErrorParams.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) bSCResultErrorParams.KWHzl) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) bSCResultErrorParams.gEmmrt) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) bSCResultErrorParams.OLrzqt) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) bSCResultErrorParams.djBIcL) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) bSCResultErrorParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        BuySellTradeType buySellTradeType = this.AhwBna;
        int iHashCode = buySellTradeType == null ? 0 : buySellTradeType.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        String str = this.KWHzl;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.gEmmrt.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BSCResultErrorParams(tradeType=" + this.AhwBna + ", depositPlatformCode=" + this.EZpvd + ", currency=" + this.copydefault + ", errorMessage=" + this.KWHzl + ", orderId=" + this.gEmmrt + ", amount=" + this.OLrzqt + ", sourceErrorCode=" + this.djBIcL + ", flow=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        BuySellTradeType buySellTradeType = this.AhwBna;
        if (buySellTradeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buySellTradeType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.djBIcL);
        parcel.writeString(this.AEQbTJ);
    }

    public BSCResultErrorParams(BuySellTradeType buySellTradeType, @NotNull String str, @NotNull String str2, String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.AhwBna = buySellTradeType;
        this.EZpvd = str;
        this.copydefault = str2;
        this.KWHzl = str3;
        this.gEmmrt = str4;
        this.OLrzqt = str5;
        this.djBIcL = str6;
        this.AEQbTJ = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0049: CONSTRUCTOR 
  (wrap:com.okinc.buysell.api.BuySellTradeType:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.buysell.api.BuySellTradeType) : (r10v0 com.okinc.buysell.api.BuySellTradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r18v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r13v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (""))
 A[MD:(com.okinc.buysell.api.BuySellTradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:28) call: com.okinc.buysell.api.data.BSCResultErrorParams.<init>(com.okinc.buysell.api.BuySellTradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BSCResultErrorParams(BuySellTradeType buySellTradeType, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : buySellTradeType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) == 0 ? str7 : "");
    }
}
