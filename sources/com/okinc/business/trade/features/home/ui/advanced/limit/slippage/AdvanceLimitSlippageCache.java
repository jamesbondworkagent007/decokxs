package com.okinc.business.trade.features.home.ui.advanced.limit.slippage;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvanceLimitSlippageCache implements Parcelable {
    public static final Parcelable.Creator<AdvanceLimitSlippageCache> CREATOR = new Creator();
    public final SlippageFeeType AEQbTJ;
    public final String EZpvd;
    public final SlippageMode OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<AdvanceLimitSlippageCache> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvanceLimitSlippageCache createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdvanceLimitSlippageCache(parcel.readString(), SlippageMode.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : SlippageFeeType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvanceLimitSlippageCache[] newArray(int i) {
            return new AdvanceLimitSlippageCache[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvanceLimitSlippageCache copy$default(AdvanceLimitSlippageCache advanceLimitSlippageCache, String str, SlippageMode slippageMode, String str2, SlippageFeeType slippageFeeType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advanceLimitSlippageCache.copydefault;
        }
        if ((i & 2) != 0) {
            slippageMode = advanceLimitSlippageCache.OLrzqt;
        }
        if ((i & 4) != 0) {
            str2 = advanceLimitSlippageCache.EZpvd;
        }
        if ((i & 8) != 0) {
            slippageFeeType = advanceLimitSlippageCache.AEQbTJ;
        }
        return advanceLimitSlippageCache.OLrzqt(str, slippageMode, str2, slippageFeeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageFeeType KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvanceLimitSlippageCache OLrzqt(@NotNull String str, @NotNull SlippageMode slippageMode, @NotNull String str2, SlippageFeeType slippageFeeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AdvanceLimitSlippageCache(str, slippageMode, str2, slippageFeeType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode copydefault() {
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
        if (!(obj instanceof AdvanceLimitSlippageCache)) {
            return false;
        }
        AdvanceLimitSlippageCache advanceLimitSlippageCache = (AdvanceLimitSlippageCache) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) advanceLimitSlippageCache.copydefault) && this.OLrzqt == advanceLimitSlippageCache.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) advanceLimitSlippageCache.EZpvd) && this.AEQbTJ == advanceLimitSlippageCache.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        SlippageFeeType slippageFeeType = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (slippageFeeType == null ? 0 : slippageFeeType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvanceLimitSlippageCache(slippage=" + this.copydefault + ", slippageMode=" + this.OLrzqt + ", maxSlippage=" + this.EZpvd + ", slippageFeeType=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.EZpvd);
        SlippageFeeType slippageFeeType = this.AEQbTJ;
        if (slippageFeeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(slippageFeeType.name());
        }
    }

    public AdvanceLimitSlippageCache(@NotNull String str, @NotNull SlippageMode slippageMode, @NotNull String str2, SlippageFeeType slippageFeeType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.copydefault = str;
        this.OLrzqt = slippageMode;
        this.EZpvd = str2;
        this.AEQbTJ = slippageFeeType;
    }
}
