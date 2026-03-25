package com.okinc.business.trade.features.home.ui.advanced.swap.slippage;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams;
import com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam;
import com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvanceSlippageParams implements Parcelable {
    public static final Parcelable.Creator<AdvanceSlippageParams> CREATOR = new Creator();
    public final SlippageViewParam AEQbTJ;
    public final MinimumReceivedParam EZpvd;
    public final MevSimpleParam KWHzl;
    public final QuoteSlippageParams OLrzqt;

    public static final class Creator implements Parcelable.Creator<AdvanceSlippageParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvanceSlippageParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdvanceSlippageParams(parcel.readInt() == 0 ? null : QuoteSlippageParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : MevSimpleParam.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SlippageViewParam.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MinimumReceivedParam.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvanceSlippageParams[] newArray(int i) {
            return new AdvanceSlippageParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AdvanceSlippageParams() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvanceSlippageParams copy$default(AdvanceSlippageParams advanceSlippageParams, QuoteSlippageParams quoteSlippageParams, MevSimpleParam mevSimpleParam, SlippageViewParam slippageViewParam, MinimumReceivedParam minimumReceivedParam, int i, Object obj) {
        if ((i & 1) != 0) {
            quoteSlippageParams = advanceSlippageParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            mevSimpleParam = advanceSlippageParams.KWHzl;
        }
        if ((i & 4) != 0) {
            slippageViewParam = advanceSlippageParams.AEQbTJ;
        }
        if ((i & 8) != 0) {
            minimumReceivedParam = advanceSlippageParams.EZpvd;
        }
        return advanceSlippageParams.OLrzqt(quoteSlippageParams, mevSimpleParam, slippageViewParam, minimumReceivedParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageViewParam AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MinimumReceivedParam EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteSlippageParams KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvanceSlippageParams OLrzqt(QuoteSlippageParams quoteSlippageParams, MevSimpleParam mevSimpleParam, SlippageViewParam slippageViewParam, MinimumReceivedParam minimumReceivedParam) {
        return new AdvanceSlippageParams(quoteSlippageParams, mevSimpleParam, slippageViewParam, minimumReceivedParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevSimpleParam copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof AdvanceSlippageParams)) {
            return false;
        }
        AdvanceSlippageParams advanceSlippageParams = (AdvanceSlippageParams) obj;
        return Intrinsics.EZpvd(this.OLrzqt, advanceSlippageParams.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, advanceSlippageParams.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, advanceSlippageParams.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, advanceSlippageParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        QuoteSlippageParams quoteSlippageParams = this.OLrzqt;
        int iHashCode = quoteSlippageParams == null ? 0 : quoteSlippageParams.hashCode();
        MevSimpleParam mevSimpleParam = this.KWHzl;
        int iHashCode2 = mevSimpleParam == null ? 0 : mevSimpleParam.hashCode();
        SlippageViewParam slippageViewParam = this.AEQbTJ;
        int iHashCode3 = slippageViewParam == null ? 0 : slippageViewParam.hashCode();
        MinimumReceivedParam minimumReceivedParam = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (minimumReceivedParam != null ? minimumReceivedParam.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvanceSlippageParams(quoteSlippageParams=" + this.OLrzqt + ", mevSimpleParam=" + this.KWHzl + ", slippageViewParam=" + this.AEQbTJ + ", minimumReceivedParam=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        QuoteSlippageParams quoteSlippageParams = this.OLrzqt;
        if (quoteSlippageParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quoteSlippageParams.writeToParcel(parcel, i);
        }
        MevSimpleParam mevSimpleParam = this.KWHzl;
        if (mevSimpleParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mevSimpleParam.writeToParcel(parcel, i);
        }
        SlippageViewParam slippageViewParam = this.AEQbTJ;
        if (slippageViewParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            slippageViewParam.writeToParcel(parcel, i);
        }
        MinimumReceivedParam minimumReceivedParam = this.EZpvd;
        if (minimumReceivedParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            minimumReceivedParam.writeToParcel(parcel, i);
        }
    }

    public AdvanceSlippageParams(QuoteSlippageParams quoteSlippageParams, MevSimpleParam mevSimpleParam, SlippageViewParam slippageViewParam, MinimumReceivedParam minimumReceivedParam) {
        this.OLrzqt = quoteSlippageParams;
        this.KWHzl = mevSimpleParam;
        this.AEQbTJ = slippageViewParam;
        this.EZpvd = minimumReceivedParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams) : (r2v0 com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams))
  (wrap:com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam) : (r3v0 com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam))
  (wrap:com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam) : (r4v0 com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam))
  (wrap:com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam) : (r5v0 com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam))
 A[MD:(com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams, com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam, com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam, com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam):void (m)] (LINE:68) call: com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageParams.<init>(com.okinc.business.dexui.main.swap.setting.simple.QuoteSlippageParams, com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam, com.okinc.business.dexui.main.swap.widget.slippage.SlippageViewParam, com.okinc.business.dexui.main.swap.widget.mev.MinimumReceivedParam):void type: THIS */
    public /* synthetic */ AdvanceSlippageParams(QuoteSlippageParams quoteSlippageParams, MevSimpleParam mevSimpleParam, SlippageViewParam slippageViewParam, MinimumReceivedParam minimumReceivedParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : quoteSlippageParams, (i & 2) != 0 ? null : mevSimpleParam, (i & 4) != 0 ? null : slippageViewParam, (i & 8) != 0 ? null : minimumReceivedParam);
    }
}
