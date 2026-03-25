package com.okinc.okx.paymentapi.uv;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import com.okinc.okx.paymentapi.service.TargetTab;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class PreloadResult implements Parcelable {
    public static final Parcelable.Creator<PreloadResult> CREATOR = new Creator();
    public String AEQbTJ;
    public TargetTab AYXKKw;
    public String EZpvd;
    public LandingPageType KWHzl;
    public String OLrzqt;
    public String copydefault;
    public TradeType djBIcL;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<PreloadResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreloadResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PreloadResult(TradeType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LandingPageType.valueOf(parcel.readString()), TargetTab.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreloadResult[] newArray(int i) {
            return new PreloadResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreloadResult() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PreloadResult copy$default(PreloadResult preloadResult, TradeType tradeType, String str, String str2, String str3, String str4, LandingPageType landingPageType, TargetTab targetTab, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeType = preloadResult.djBIcL;
        }
        if ((i & 2) != 0) {
            str = preloadResult.EZpvd;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = preloadResult.AEQbTJ;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = preloadResult.copydefault;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = preloadResult.OLrzqt;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            landingPageType = preloadResult.KWHzl;
        }
        LandingPageType landingPageType2 = landingPageType;
        if ((i & 64) != 0) {
            targetTab = preloadResult.AYXKKw;
        }
        return preloadResult.EZpvd(tradeType, str5, str6, str7, str8, landingPageType2, targetTab);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreloadResult EZpvd(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, String str3, String str4, LandingPageType landingPageType, @NotNull TargetTab targetTab) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        return new PreloadResult(tradeType, str, str2, str3, str4, landingPageType, targetTab);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
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
        if (!(obj instanceof PreloadResult)) {
            return false;
        }
        PreloadResult preloadResult = (PreloadResult) obj;
        return this.djBIcL == preloadResult.djBIcL && Intrinsics.EZpvd((Object) this.EZpvd, (Object) preloadResult.EZpvd) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) preloadResult.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) preloadResult.copydefault) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) preloadResult.OLrzqt) && this.KWHzl == preloadResult.KWHzl && this.AYXKKw == preloadResult.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.djBIcL.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        String str = this.copydefault;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.OLrzqt;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        LandingPageType landingPageType = this.KWHzl;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (landingPageType != null ? landingPageType.hashCode() : 0)) * 31) + this.AYXKKw.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreloadResult(tradeType=" + this.djBIcL + ", quoteCurrency=" + this.EZpvd + ", baseCurrency=" + this.AEQbTJ + ", canNotBuyReason=" + this.copydefault + ", canNotSellReason=" + this.OLrzqt + ", pageType=" + this.KWHzl + ", targetTab=" + this.AYXKKw + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.djBIcL.writeToParcel(parcel, i);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt);
        LandingPageType landingPageType = this.KWHzl;
        if (landingPageType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(landingPageType.name());
        }
        parcel.writeString(this.AYXKKw.name());
    }

    public PreloadResult(@NotNull TradeType tradeType, @NotNull String str, @NotNull String str2, String str3, String str4, LandingPageType landingPageType, @NotNull TargetTab targetTab) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        this.djBIcL = tradeType;
        this.EZpvd = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.OLrzqt = str4;
        this.KWHzl = landingPageType;
        this.AYXKKw = targetTab;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003a: CONSTRUCTOR 
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okpaymentapi.data.remote.model.management.TradeType:0x0004: SGET  A[WRAPPED] (LINE:13) com.okinc.okpaymentapi.data.remote.model.management.TradeType.BUY com.okinc.okpaymentapi.data.remote.model.management.TradeType) : (r6v0 com.okinc.okpaymentapi.data.remote.model.management.TradeType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:com.okinc.okx.paymentapi.uv.LandingPageType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.uv.LandingPageType) : (r11v0 com.okinc.okx.paymentapi.uv.LandingPageType))
  (wrap:com.okinc.okx.paymentapi.service.TargetTab:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.okx.paymentapi.service.TargetTab:0x002f: SGET  A[WRAPPED] (LINE:19) com.okinc.okx.paymentapi.service.TargetTab.BUY com.okinc.okx.paymentapi.service.TargetTab) : (r12v0 com.okinc.okx.paymentapi.service.TargetTab))
 A[MD:(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.uv.LandingPageType, com.okinc.okx.paymentapi.service.TargetTab):void (m)] (LINE:12) call: com.okinc.okx.paymentapi.uv.PreloadResult.<init>(com.okinc.okpaymentapi.data.remote.model.management.TradeType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.uv.LandingPageType, com.okinc.okx.paymentapi.service.TargetTab):void type: THIS */
    public /* synthetic */ PreloadResult(TradeType tradeType, String str, String str2, String str3, String str4, LandingPageType landingPageType, TargetTab targetTab, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TradeType.BUY : tradeType, (i & 2) != 0 ? "" : str, (i & 4) == 0 ? str2 : "", (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : landingPageType, (i & 64) != 0 ? TargetTab.BUY : targetTab);
    }
}
