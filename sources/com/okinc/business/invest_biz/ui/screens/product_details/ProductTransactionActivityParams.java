package com.okinc.business.invest_biz.ui.screens.product_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.RewardType;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ProductTransactionActivityParams implements Parcelable {
    public static final Parcelable.Creator<ProductTransactionActivityParams> CREATOR = new Creator();
    public final Long AEQbTJ;
    public final RewardType AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final long OLrzqt;
    public final String copydefault;
    public final InvestmentKind gEmmrt;
    public final String valueOf;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<ProductTransactionActivityParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductTransactionActivityParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProductTransactionActivityParams(parcel.readLong(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), RewardType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), InvestmentKind.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductTransactionActivityParams[] newArray(int i) {
            return new ProductTransactionActivityParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RewardType AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductTransactionActivityParams EZpvd(long j, Long l, @NotNull RewardType rewardType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        return new ProductTransactionActivityParams(j, l, rewardType, str, str2, str3, str4, str5, investmentKind);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.OLrzqt;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTransactionActivityParams)) {
            return false;
        }
        ProductTransactionActivityParams productTransactionActivityParams = (ProductTransactionActivityParams) obj;
        return this.OLrzqt == productTransactionActivityParams.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, productTransactionActivityParams.AEQbTJ) && this.AYXKKw == productTransactionActivityParams.AYXKKw && Intrinsics.EZpvd((Object) this.copydefault, (Object) productTransactionActivityParams.copydefault) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) productTransactionActivityParams.AhwBna) && Intrinsics.EZpvd((Object) this.valueOf, (Object) productTransactionActivityParams.valueOf) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) productTransactionActivityParams.KWHzl) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) productTransactionActivityParams.EZpvd) && this.gEmmrt == productTransactionActivityParams.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.OLrzqt);
        Long l = this.AEQbTJ;
        return (((((((((((((((iHashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.AYXKKw.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductTransactionActivityParams(investmentId=" + this.OLrzqt + ", chainId=" + this.AEQbTJ + ", rewardType=" + this.AYXKKw + ", actionType=" + this.copydefault + ", symbolName=" + this.AhwBna + ", source=" + this.valueOf + ", chainName=" + this.KWHzl + ", action=" + this.EZpvd + ", kind=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.OLrzqt);
        Long l = this.AEQbTJ;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.AYXKKw.name());
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.valueOf);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.gEmmrt.name());
    }

    public ProductTransactionActivityParams(long j, Long l, @NotNull RewardType rewardType, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull InvestmentKind investmentKind) {
        Intrinsics.checkNotNullParameter(rewardType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(investmentKind, "");
        this.OLrzqt = j;
        this.AEQbTJ = l;
        this.AYXKKw = rewardType;
        this.copydefault = str;
        this.AhwBna = str2;
        this.valueOf = str3;
        this.KWHzl = str4;
        this.EZpvd = str5;
        this.gEmmrt = investmentKind;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0037: CONSTRUCTOR 
  (r14v0 long)
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (r17v0 com.okinc.business.invest_biz.data.bean.RewardType)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.data.contants.InvestmentKind:?: TERNARY null = ((wrap:int:0x0025: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002b: SGET  A[WRAPPED] (LINE:21) com.okinc.business.invest_biz.data.contants.InvestmentKind.Default com.okinc.business.invest_biz.data.contants.InvestmentKind) : (r23v0 com.okinc.business.invest_biz.data.contants.InvestmentKind))
 A[MD:(long, java.lang.Long, com.okinc.business.invest_biz.data.bean.RewardType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.InvestmentKind):void (m)] (LINE:11) call: com.okinc.business.invest_biz.ui.screens.product_details.ProductTransactionActivityParams.<init>(long, java.lang.Long, com.okinc.business.invest_biz.data.bean.RewardType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.invest_biz.data.contants.InvestmentKind):void type: THIS */
    public /* synthetic */ ProductTransactionActivityParams(long j, Long l, RewardType rewardType, String str, String str2, String str3, String str4, String str5, InvestmentKind investmentKind, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l, rewardType, str, str2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? InvestmentKind.Default : investmentKind);
    }
}
