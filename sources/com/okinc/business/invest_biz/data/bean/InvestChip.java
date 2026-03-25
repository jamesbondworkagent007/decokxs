package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27276jsD;
import o.C25493ixk;
import o.C33070mpX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestChip extends AbstractC27276jsD implements Parcelable {
    public static final Parcelable.Creator<InvestChip> CREATOR = new Creator();
    public InvestSearchData AEQbTJ;
    public InvestSearchData EZpvd;

    public static final class Creator implements Parcelable.Creator<InvestChip> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestChip createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestChip(parcel.readInt() == 0 ? null : InvestSearchData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InvestSearchData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestChip[] newArray(int i) {
            return new InvestChip[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestChip() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSearchData AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSearchData OLrzqt() {
        return this.EZpvd;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        InvestSearchData investSearchData = this.EZpvd;
        if (investSearchData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investSearchData.writeToParcel(parcel, i);
        }
        InvestSearchData investSearchData2 = this.AEQbTJ;
        if (investSearchData2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            investSearchData2.writeToParcel(parcel, i);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.invest_biz.data.bean.InvestSearchData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestSearchData) : (r2v0 com.okinc.business.invest_biz.data.bean.InvestSearchData))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestSearchData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestSearchData) : (r3v0 com.okinc.business.invest_biz.data.bean.InvestSearchData))
 A[MD:(com.okinc.business.invest_biz.data.bean.InvestSearchData, com.okinc.business.invest_biz.data.bean.InvestSearchData):void (m)] (LINE:10) call: com.okinc.business.invest_biz.data.bean.InvestChip.<init>(com.okinc.business.invest_biz.data.bean.InvestSearchData, com.okinc.business.invest_biz.data.bean.InvestSearchData):void type: THIS */
    public /* synthetic */ InvestChip(InvestSearchData investSearchData, InvestSearchData investSearchData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : investSearchData, (i & 2) != 0 ? null : investSearchData2);
    }

    public InvestChip(InvestSearchData investSearchData, InvestSearchData investSearchData2) {
        super(false, 1, null);
        this.EZpvd = investSearchData;
        this.AEQbTJ = investSearchData2;
    }

    @Override // o.AbstractC27276jsD
    public String KWHzl() {
        String symbol;
        InvestSearchData investSearchData = this.AEQbTJ;
        if (investSearchData != null && (symbol = investSearchData.getSymbol()) != null) {
            return symbol;
        }
        InvestSearchData investSearchData2 = this.EZpvd;
        String symbol2 = investSearchData2 != null ? investSearchData2.getSymbol() : null;
        return symbol2 == null ? "" : symbol2;
    }

    public final String EZpvd() {
        if (this.AEQbTJ != null) {
            return C33070mpX.AYXKKw(C25493ixk.FragmentManager.fhUrPt);
        }
        return C33070mpX.AYXKKw(C25493ixk.FragmentManager.GiPPlLRPuVlr);
    }
}
