package com.okinc.business.dexui.main.swap.widget.mev.simple;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MevSimpleParam implements Parcelable {
    public static final Parcelable.Creator<MevSimpleParam> CREATOR = new Creator();
    public TradeMode AEQbTJ;
    public final boolean EZpvd;
    public final MevInfoParam OLrzqt;
    public final boolean copydefault;

    public static final class Creator implements Parcelable.Creator<MevSimpleParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevSimpleParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MevSimpleParam(TradeMode.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : MevInfoParam.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MevSimpleParam[] newArray(int i) {
            return new MevSimpleParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MevSimpleParam copy$default(MevSimpleParam mevSimpleParam, TradeMode tradeMode, boolean z, boolean z2, MevInfoParam mevInfoParam, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeMode = mevSimpleParam.AEQbTJ;
        }
        if ((i & 2) != 0) {
            z = mevSimpleParam.copydefault;
        }
        if ((i & 4) != 0) {
            z2 = mevSimpleParam.EZpvd;
        }
        if ((i & 8) != 0) {
            mevInfoParam = mevSimpleParam.OLrzqt;
        }
        return mevSimpleParam.EZpvd(tradeMode, z, z2, mevInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevSimpleParam EZpvd(@NotNull TradeMode tradeMode, boolean z, boolean z2, MevInfoParam mevInfoParam) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        return new MevSimpleParam(tradeMode, z, z2, mevInfoParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevInfoParam copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof MevSimpleParam)) {
            return false;
        }
        MevSimpleParam mevSimpleParam = (MevSimpleParam) obj;
        return this.AEQbTJ == mevSimpleParam.AEQbTJ && this.copydefault == mevSimpleParam.copydefault && this.EZpvd == mevSimpleParam.EZpvd && Intrinsics.EZpvd(this.OLrzqt, mevSimpleParam.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = Boolean.hashCode(this.copydefault);
        int iHashCode3 = Boolean.hashCode(this.EZpvd);
        MevInfoParam mevInfoParam = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (mevInfoParam == null ? 0 : mevInfoParam.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MevSimpleParam(tradeMode=" + this.AEQbTJ + ", supportMev=" + this.copydefault + ", isMevOpen=" + this.EZpvd + ", mevInfoParam=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.EZpvd ? 1 : 0);
        MevInfoParam mevInfoParam = this.OLrzqt;
        if (mevInfoParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mevInfoParam.writeToParcel(parcel, i);
        }
    }

    public MevSimpleParam(@NotNull TradeMode tradeMode, boolean z, boolean z2, MevInfoParam mevInfoParam) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        this.AEQbTJ = tradeMode;
        this.copydefault = z;
        this.EZpvd = z2;
        this.OLrzqt = mevInfoParam;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.business.dexui.main.shared.model.TradeMode)
  (r2v0 boolean)
  (r3v0 boolean)
  (wrap:com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam) : (r4v0 com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam))
 A[MD:(com.okinc.business.dexui.main.shared.model.TradeMode, boolean, boolean, com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam):void (m)] (LINE:76) call: com.okinc.business.dexui.main.swap.widget.mev.simple.MevSimpleParam.<init>(com.okinc.business.dexui.main.shared.model.TradeMode, boolean, boolean, com.okinc.business.dexui.main.swap.widget.mev.simple.MevInfoParam):void type: THIS */
    public /* synthetic */ MevSimpleParam(TradeMode tradeMode, boolean z, boolean z2, MevInfoParam mevInfoParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(tradeMode, z, z2, (i & 8) != 0 ? null : mevInfoParam);
    }
}
