package com.okinc.business.invest_biz.data.repository.product_details.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class ProductDetailsByChain implements Parcelable {
    public static final Parcelable.Creator<ProductDetailsByChain> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final ProductDetailsUserTradeAction AhwBna;
    public final ChainInfo EZpvd;
    public final InvestmentKind KWHzl;
    public final long OLrzqt;
    public final boolean copydefault;
    public final String djBIcL;
    public final String gEmmrt;

    public static final class Creator implements Parcelable.Creator<ProductDetailsByChain> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsByChain createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ProductDetailsByChain(parcel.readLong(), InvestmentKind.valueOf(parcel.readString()), ChainInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), (ProductDetailsUserTradeAction) parcel.readParcelable(ProductDetailsByChain.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductDetailsByChain[] newArray(int i) {
            return new ProductDetailsByChain[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChainInfo AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsUserTradeAction AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProductDetailsByChain EZpvd(long j, @NotNull InvestmentKind investmentKind, @NotNull ChainInfo chainInfo, boolean z, @NotNull String str, ProductDetailsUserTradeAction productDetailsUserTradeAction, @NotNull String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(chainInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new ProductDetailsByChain(j, investmentKind, chainInfo, z, str, productDetailsUserTradeAction, str2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentKind KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.gEmmrt;
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
        if (!(obj instanceof ProductDetailsByChain)) {
            return false;
        }
        ProductDetailsByChain productDetailsByChain = (ProductDetailsByChain) obj;
        return this.OLrzqt == productDetailsByChain.OLrzqt && this.KWHzl == productDetailsByChain.KWHzl && Intrinsics.EZpvd(this.EZpvd, productDetailsByChain.EZpvd) && this.AEQbTJ == productDetailsByChain.AEQbTJ && Intrinsics.EZpvd((Object) this.djBIcL, (Object) productDetailsByChain.djBIcL) && Intrinsics.EZpvd(this.AhwBna, productDetailsByChain.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) productDetailsByChain.gEmmrt) && this.copydefault == productDetailsByChain.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.OLrzqt);
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = Boolean.hashCode(this.AEQbTJ);
        int iHashCode5 = this.djBIcL.hashCode();
        ProductDetailsUserTradeAction productDetailsUserTradeAction = this.AhwBna;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (productDetailsUserTradeAction == null ? 0 : productDetailsUserTradeAction.hashCode())) * 31) + this.gEmmrt.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ProductDetailsByChain(investmentId=" + this.OLrzqt + ", kind=" + this.KWHzl + ", chainInfo=" + this.EZpvd + ", hasBonus=" + this.AEQbTJ + ", specialPositionAssetKey=" + this.djBIcL + ", userAction=" + this.AhwBna + ", source=" + this.gEmmrt + ", isFromSubscription=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.OLrzqt);
        parcel.writeString(this.KWHzl.name());
        this.EZpvd.writeToParcel(parcel, i);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeString(this.djBIcL);
        parcel.writeParcelable(this.AhwBna, i);
        parcel.writeString(this.gEmmrt);
        parcel.writeInt(this.copydefault ? 1 : 0);
    }

    public ProductDetailsByChain(long j, @NotNull InvestmentKind investmentKind, @NotNull ChainInfo chainInfo, boolean z, @NotNull String str, ProductDetailsUserTradeAction productDetailsUserTradeAction, @NotNull String str2, boolean z2) {
        Intrinsics.checkNotNullParameter(investmentKind, "");
        Intrinsics.checkNotNullParameter(chainInfo, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = j;
        this.KWHzl = investmentKind;
        this.EZpvd = chainInfo;
        this.AEQbTJ = z;
        this.djBIcL = str;
        this.AhwBna = productDetailsUserTradeAction;
        this.gEmmrt = str2;
        this.copydefault = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (r14v0 long)
  (r16v0 com.okinc.business.invest_biz.data.contants.InvestmentKind)
  (r17v0 com.okinc.business.invest_biz.data.models.ChainInfo)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r18v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction:?: TERNARY null = ((wrap:int:0x0015: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction) : (r20v0 com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r22v0 boolean))
 A[MD:(long, com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.models.ChainInfo, boolean, java.lang.String, com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, java.lang.String, boolean):void (m)] (LINE:10) call: com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain.<init>(long, com.okinc.business.invest_biz.data.contants.InvestmentKind, com.okinc.business.invest_biz.data.models.ChainInfo, boolean, java.lang.String, com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ ProductDetailsByChain(long j, InvestmentKind investmentKind, ChainInfo chainInfo, boolean z, String str, ProductDetailsUserTradeAction productDetailsUserTradeAction, String str2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, investmentKind, chainInfo, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : productDetailsUserTradeAction, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? false : z2);
    }
}
