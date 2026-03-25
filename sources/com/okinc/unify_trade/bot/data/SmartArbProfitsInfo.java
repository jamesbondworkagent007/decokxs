package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.ProfitDetailResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SmartArbProfitsInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SmartArbProfitsInfo> CREATOR = new Creator();
    private final ProfitDetailResponse arbitrageProfit;
    private final String autoStakingPos;
    private final String autoStakingPosUsdt;
    private final ProfitDetailResponse autoStakingProfit;
    private final String debtCcy;
    private final String fee;
    private final String stakePosUsdt;
    private final ProfitDetailResponse stakingProfit;
    private final String totalApy;
    private final String totalInterestAmt;
    private final String totalSpreadProfit;

    public static final class Creator implements Parcelable.Creator<SmartArbProfitsInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbProfitsInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SmartArbProfitsInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProfitDetailResponse.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ProfitDetailResponse.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SmartArbProfitsInfo[] newArray(int i) {
            return new SmartArbProfitsInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SmartArbProfitsInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.autoStakingPosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.stakePosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component6() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component7() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse component8() {
        return this.autoStakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.autoStakingPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SmartArbProfitsInfo copy(String str, String str2, String str3, String str4, String str5, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3, String str6, String str7, String str8) {
        return new SmartArbProfitsInfo(str, str2, str3, str4, str5, profitDetailResponse, profitDetailResponse2, profitDetailResponse3, str6, str7, str8);
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
        if (!(obj instanceof SmartArbProfitsInfo)) {
            return false;
        }
        SmartArbProfitsInfo smartArbProfitsInfo = (SmartArbProfitsInfo) obj;
        return Intrinsics.EZpvd((Object) this.totalSpreadProfit, (Object) smartArbProfitsInfo.totalSpreadProfit) && Intrinsics.EZpvd((Object) this.totalApy, (Object) smartArbProfitsInfo.totalApy) && Intrinsics.EZpvd((Object) this.fee, (Object) smartArbProfitsInfo.fee) && Intrinsics.EZpvd((Object) this.totalInterestAmt, (Object) smartArbProfitsInfo.totalInterestAmt) && Intrinsics.EZpvd((Object) this.debtCcy, (Object) smartArbProfitsInfo.debtCcy) && Intrinsics.EZpvd(this.arbitrageProfit, smartArbProfitsInfo.arbitrageProfit) && Intrinsics.EZpvd(this.stakingProfit, smartArbProfitsInfo.stakingProfit) && Intrinsics.EZpvd(this.autoStakingProfit, smartArbProfitsInfo.autoStakingProfit) && Intrinsics.EZpvd((Object) this.autoStakingPos, (Object) smartArbProfitsInfo.autoStakingPos) && Intrinsics.EZpvd((Object) this.autoStakingPosUsdt, (Object) smartArbProfitsInfo.autoStakingPosUsdt) && Intrinsics.EZpvd((Object) this.stakePosUsdt, (Object) smartArbProfitsInfo.stakePosUsdt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getArbitrageProfit() {
        return this.arbitrageProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingPos() {
        return this.autoStakingPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoStakingPosUsdt() {
        return this.autoStakingPosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getAutoStakingProfit() {
        return this.autoStakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDebtCcy() {
        return this.debtCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStakePosUsdt() {
        return this.stakePosUsdt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProfitDetailResponse getStakingProfit() {
        return this.stakingProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalApy() {
        return this.totalApy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalInterestAmt() {
        return this.totalInterestAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalSpreadProfit() {
        return this.totalSpreadProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalSpreadProfit;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.totalApy;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fee;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.totalInterestAmt;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.debtCcy;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        int iHashCode6 = profitDetailResponse == null ? 0 : profitDetailResponse.hashCode();
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        int iHashCode7 = profitDetailResponse2 == null ? 0 : profitDetailResponse2.hashCode();
        ProfitDetailResponse profitDetailResponse3 = this.autoStakingProfit;
        int iHashCode8 = profitDetailResponse3 == null ? 0 : profitDetailResponse3.hashCode();
        String str6 = this.autoStakingPos;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.autoStakingPosUsdt;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.stakePosUsdt;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SmartArbProfitsInfo(totalSpreadProfit=" + this.totalSpreadProfit + ", totalApy=" + this.totalApy + ", fee=" + this.fee + ", totalInterestAmt=" + this.totalInterestAmt + ", debtCcy=" + this.debtCcy + ", arbitrageProfit=" + this.arbitrageProfit + ", stakingProfit=" + this.stakingProfit + ", autoStakingProfit=" + this.autoStakingProfit + ", autoStakingPos=" + this.autoStakingPos + ", autoStakingPosUsdt=" + this.autoStakingPosUsdt + ", stakePosUsdt=" + this.stakePosUsdt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.totalSpreadProfit);
        parcel.writeString(this.totalApy);
        parcel.writeString(this.fee);
        parcel.writeString(this.totalInterestAmt);
        parcel.writeString(this.debtCcy);
        ProfitDetailResponse profitDetailResponse = this.arbitrageProfit;
        if (profitDetailResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitDetailResponse.writeToParcel(parcel, i);
        }
        ProfitDetailResponse profitDetailResponse2 = this.stakingProfit;
        if (profitDetailResponse2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitDetailResponse2.writeToParcel(parcel, i);
        }
        ProfitDetailResponse profitDetailResponse3 = this.autoStakingProfit;
        if (profitDetailResponse3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            profitDetailResponse3.writeToParcel(parcel, i);
        }
        parcel.writeString(this.autoStakingPos);
        parcel.writeString(this.autoStakingPosUsdt);
        parcel.writeString(this.stakePosUsdt);
    }

    public SmartArbProfitsInfo(String str, String str2, String str3, String str4, String str5, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3, String str6, String str7, String str8) {
        this.totalSpreadProfit = str;
        this.totalApy = str2;
        this.fee = str3;
        this.totalInterestAmt = str4;
        this.debtCcy = str5;
        this.arbitrageProfit = profitDetailResponse;
        this.stakingProfit = profitDetailResponse2;
        this.autoStakingProfit = profitDetailResponse3;
        this.autoStakingPos = str6;
        this.autoStakingPosUsdt = str7;
        this.stakePosUsdt = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ProfitDetailResponse) : (r18v0 com.okinc.unify_trade.biz.ProfitDetailResponse))
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.ProfitDetailResponse) : (r19v0 com.okinc.unify_trade.biz.ProfitDetailResponse))
  (wrap:com.okinc.unify_trade.biz.ProfitDetailResponse:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 com.okinc.unify_trade.biz.ProfitDetailResponse) : (null com.okinc.unify_trade.biz.ProfitDetailResponse))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1451) call: com.okinc.unify_trade.bot.data.SmartArbProfitsInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse, com.okinc.unify_trade.biz.ProfitDetailResponse, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SmartArbProfitsInfo(String str, String str2, String str3, String str4, String str5, ProfitDetailResponse profitDetailResponse, ProfitDetailResponse profitDetailResponse2, ProfitDetailResponse profitDetailResponse3, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : profitDetailResponse, (i & 64) != 0 ? null : profitDetailResponse2, (i & 128) == 0 ? profitDetailResponse3 : null, (i & 256) != 0 ? "" : str6, (i & 512) != 0 ? "" : str7, (i & 1024) == 0 ? str8 : "");
    }
}
