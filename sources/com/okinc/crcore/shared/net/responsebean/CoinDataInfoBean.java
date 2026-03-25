package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.CoinDataInfoResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CoinDataInfoBean implements Parcelable {
    public static final int $stable = 0;
    private final String code;
    private final String flowTotal;
    private final String fullyDilutedValuation;
    private final String high_price;
    private final String holdTime;
    private final String issuePrice;
    private final Long issueTime;
    private final String marketCap;
    private final String marketCapRank;
    private final String vol;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<CoinDataInfoBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinDataInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDataInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinDataInfoBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinDataInfoBean[] newArray(int i) {
            return new CoinDataInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinDataInfoBean() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.fullyDilutedValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.vol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.high_price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.issueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.issuePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.holdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.marketCapRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinDataInfoBean copy(String str, String str2, @NotNull String str3, String str4, Long l, String str5, String str6, String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new CoinDataInfoBean(str, str2, str3, str4, l, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof CoinDataInfoBean)) {
            return false;
        }
        CoinDataInfoBean coinDataInfoBean = (CoinDataInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) coinDataInfoBean.code) && Intrinsics.EZpvd((Object) this.vol, (Object) coinDataInfoBean.vol) && Intrinsics.EZpvd((Object) this.high_price, (Object) coinDataInfoBean.high_price) && Intrinsics.EZpvd((Object) this.flowTotal, (Object) coinDataInfoBean.flowTotal) && Intrinsics.EZpvd(this.issueTime, coinDataInfoBean.issueTime) && Intrinsics.EZpvd((Object) this.issuePrice, (Object) coinDataInfoBean.issuePrice) && Intrinsics.EZpvd((Object) this.marketCap, (Object) coinDataInfoBean.marketCap) && Intrinsics.EZpvd((Object) this.holdTime, (Object) coinDataInfoBean.holdTime) && Intrinsics.EZpvd((Object) this.marketCapRank, (Object) coinDataInfoBean.marketCapRank) && Intrinsics.EZpvd((Object) this.fullyDilutedValuation, (Object) coinDataInfoBean.fullyDilutedValuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFlowTotal() {
        return this.flowTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullyDilutedValuation() {
        return this.fullyDilutedValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHigh_price() {
        return this.high_price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHoldTime() {
        return this.holdTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssuePrice() {
        return this.issuePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getIssueTime() {
        return this.issueTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCapRank() {
        return this.marketCapRank;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVol() {
        return this.vol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.code;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.vol;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.high_price.hashCode();
        String str3 = this.flowTotal;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Long l = this.issueTime;
        int iHashCode5 = l == null ? 0 : l.hashCode();
        String str4 = this.issuePrice;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.marketCap;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.holdTime;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str6 != null ? str6.hashCode() : 0)) * 31) + this.marketCapRank.hashCode()) * 31) + this.fullyDilutedValuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinDataInfoBean(code=" + this.code + ", vol=" + this.vol + ", high_price=" + this.high_price + ", flowTotal=" + this.flowTotal + ", issueTime=" + this.issueTime + ", issuePrice=" + this.issuePrice + ", marketCap=" + this.marketCap + ", holdTime=" + this.holdTime + ", marketCapRank=" + this.marketCapRank + ", fullyDilutedValuation=" + this.fullyDilutedValuation + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.vol);
        parcel.writeString(this.high_price);
        parcel.writeString(this.flowTotal);
        Long l = this.issueTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.issuePrice);
        parcel.writeString(this.marketCap);
        parcel.writeString(this.holdTime);
        parcel.writeString(this.marketCapRank);
        parcel.writeString(this.fullyDilutedValuation);
    }

    public CoinDataInfoBean(String str, String str2, @NotNull String str3, String str4, Long l, String str5, String str6, String str7, @NotNull String str8, @NotNull String str9) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.code = str;
        this.vol = str2;
        this.high_price = str3;
        this.flowTotal = str4;
        this.issueTime = l;
        this.issuePrice = str5;
        this.marketCap = str6;
        this.holdTime = str7;
        this.marketCapRank = str8;
        this.fullyDilutedValuation = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0066: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0020: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0045: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.CoinDataInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinDataInfoBean(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? 0L : l, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) == 0 ? str9 : "");
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.CoinDataInfoBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final CoinDataInfoBean OLrzqt(@NotNull CoinDataInfoResponseBean coinDataInfoResponseBean) {
            Intrinsics.checkNotNullParameter(coinDataInfoResponseBean, "");
            return new CoinDataInfoBean(coinDataInfoResponseBean.getCode(), coinDataInfoResponseBean.getVol(), coinDataInfoResponseBean.getHigh_price(), coinDataInfoResponseBean.getFlowTotal(), coinDataInfoResponseBean.getIssueTime(), coinDataInfoResponseBean.getIssuePrice(), coinDataInfoResponseBean.getMarketCap(), coinDataInfoResponseBean.getHoldTime(), coinDataInfoResponseBean.getMarketCapRank(), coinDataInfoResponseBean.getFullyDilutedValuation());
        }
    }
}
