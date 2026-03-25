package com.okinc.business.dexui.main.swap.widget.slippage;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SlippageViewParam implements Parcelable {
    public static final Parcelable.Creator<SlippageViewParam> CREATOR = new Creator();
    public final FixedParam EZpvd;
    public final TradeMode KWHzl;
    public SlippageMode OLrzqt;
    public final DynamicParam copydefault;

    public static final class Creator implements Parcelable.Creator<SlippageViewParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageViewParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SlippageViewParam(TradeMode.valueOf(parcel.readString()), SlippageMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : DynamicParam.CREATOR.createFromParcel(parcel), FixedParam.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlippageViewParam[] newArray(int i) {
            return new SlippageViewParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SlippageViewParam copy$default(SlippageViewParam slippageViewParam, TradeMode tradeMode, SlippageMode slippageMode, DynamicParam dynamicParam, FixedParam fixedParam, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeMode = slippageViewParam.KWHzl;
        }
        if ((i & 2) != 0) {
            slippageMode = slippageViewParam.OLrzqt;
        }
        if ((i & 4) != 0) {
            dynamicParam = slippageViewParam.copydefault;
        }
        if ((i & 8) != 0) {
            fixedParam = slippageViewParam.EZpvd;
        }
        return slippageViewParam.KWHzl(tradeMode, slippageMode, dynamicParam, fixedParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FixedParam EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.OLrzqt = slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageViewParam KWHzl(@NotNull TradeMode tradeMode, @NotNull SlippageMode slippageMode, DynamicParam dynamicParam, @NotNull FixedParam fixedParam) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(fixedParam, "");
        return new SlippageViewParam(tradeMode, slippageMode, dynamicParam, fixedParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeMode OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DynamicParam copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof SlippageViewParam)) {
            return false;
        }
        SlippageViewParam slippageViewParam = (SlippageViewParam) obj;
        return this.KWHzl == slippageViewParam.KWHzl && this.OLrzqt == slippageViewParam.OLrzqt && Intrinsics.EZpvd(this.copydefault, slippageViewParam.copydefault) && Intrinsics.EZpvd(this.EZpvd, slippageViewParam.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        DynamicParam dynamicParam = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (dynamicParam == null ? 0 : dynamicParam.hashCode())) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SlippageViewParam(tradeMode=" + this.KWHzl + ", slippageMode=" + this.OLrzqt + ", dynamicParam=" + this.copydefault + ", fixedParam=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.OLrzqt.name());
        DynamicParam dynamicParam = this.copydefault;
        if (dynamicParam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dynamicParam.writeToParcel(parcel, i);
        }
        this.EZpvd.writeToParcel(parcel, i);
    }

    public SlippageViewParam(@NotNull TradeMode tradeMode, @NotNull SlippageMode slippageMode, DynamicParam dynamicParam, @NotNull FixedParam fixedParam) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(fixedParam, "");
        this.KWHzl = tradeMode;
        this.OLrzqt = slippageMode;
        this.copydefault = dynamicParam;
        this.EZpvd = fixedParam;
    }
}
