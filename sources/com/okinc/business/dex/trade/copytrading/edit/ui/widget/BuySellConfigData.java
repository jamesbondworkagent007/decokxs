package com.okinc.business.dex.trade.copytrading.edit.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class BuySellConfigData implements Parcelable {
    public static final Parcelable.Creator<BuySellConfigData> CREATOR = new Creator();
    public String AEQbTJ;
    public SlippageMode AhwBna;
    public boolean EZpvd;
    public PriorityFeeType KWHzl;
    public PresetRouteType OLrzqt;
    public String copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<BuySellConfigData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellConfigData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellConfigData(parcel.readInt() != 0, PresetRouteType.valueOf(parcel.readString()), SlippageMode.valueOf(parcel.readString()), parcel.readString(), PriorityFeeType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellConfigData[] newArray(int i) {
            return new BuySellConfigData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellConfigData copy$default(BuySellConfigData buySellConfigData, boolean z, PresetRouteType presetRouteType, SlippageMode slippageMode, String str, PriorityFeeType priorityFeeType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buySellConfigData.EZpvd;
        }
        if ((i & 2) != 0) {
            presetRouteType = buySellConfigData.OLrzqt;
        }
        PresetRouteType presetRouteType2 = presetRouteType;
        if ((i & 4) != 0) {
            slippageMode = buySellConfigData.AhwBna;
        }
        SlippageMode slippageMode2 = slippageMode;
        if ((i & 8) != 0) {
            str = buySellConfigData.copydefault;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            priorityFeeType = buySellConfigData.KWHzl;
        }
        PriorityFeeType priorityFeeType2 = priorityFeeType;
        if ((i & 32) != 0) {
            str2 = buySellConfigData.AEQbTJ;
        }
        return buySellConfigData.AEQbTJ(z, presetRouteType2, slippageMode2, str3, priorityFeeType2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellConfigData AEQbTJ(boolean z, @NotNull PresetRouteType presetRouteType, @NotNull SlippageMode slippageMode, @NotNull String str, @NotNull PriorityFeeType priorityFeeType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priorityFeeType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BuySellConfigData(z, presetRouteType, slippageMode, str, priorityFeeType, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriorityFeeType EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof BuySellConfigData)) {
            return false;
        }
        BuySellConfigData buySellConfigData = (BuySellConfigData) obj;
        return this.EZpvd == buySellConfigData.EZpvd && this.OLrzqt == buySellConfigData.OLrzqt && this.AhwBna == buySellConfigData.AhwBna && Intrinsics.EZpvd((Object) this.copydefault, (Object) buySellConfigData.copydefault) && this.KWHzl == buySellConfigData.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) buySellConfigData.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Boolean.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellConfigData(isMevEnabled=" + this.EZpvd + ", presetRouteType=" + this.OLrzqt + ", slippageMode=" + this.AhwBna + ", slippage=" + this.copydefault + ", feeType=" + this.KWHzl + ", feeValue=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.AhwBna.name());
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl.name());
        parcel.writeString(this.AEQbTJ);
    }

    public BuySellConfigData(boolean z, @NotNull PresetRouteType presetRouteType, @NotNull SlippageMode slippageMode, @NotNull String str, @NotNull PriorityFeeType priorityFeeType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(priorityFeeType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = z;
        this.OLrzqt = presetRouteType;
        this.AhwBna = slippageMode;
        this.copydefault = str;
        this.KWHzl = priorityFeeType;
        this.AEQbTJ = str2;
    }
}
