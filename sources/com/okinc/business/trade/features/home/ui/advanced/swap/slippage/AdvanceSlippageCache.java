package com.okinc.business.trade.features.home.ui.advanced.swap.slippage;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvanceSlippageCache implements Parcelable {
    public static final Parcelable.Creator<AdvanceSlippageCache> CREATOR = new Creator();
    public final SlippageFeeType AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final SlippageMode OLrzqt;
    public final CacheStatus copydefault;

    public static final class Creator implements Parcelable.Creator<AdvanceSlippageCache> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvanceSlippageCache createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdvanceSlippageCache(CacheStatus.valueOf(parcel.readString()), parcel.readString(), SlippageMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : SlippageFeeType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvanceSlippageCache[] newArray(int i) {
            return new AdvanceSlippageCache[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvanceSlippageCache copy$default(AdvanceSlippageCache advanceSlippageCache, CacheStatus cacheStatus, String str, SlippageMode slippageMode, SlippageFeeType slippageFeeType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheStatus = advanceSlippageCache.copydefault;
        }
        if ((i & 2) != 0) {
            str = advanceSlippageCache.EZpvd;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            slippageMode = advanceSlippageCache.OLrzqt;
        }
        SlippageMode slippageMode2 = slippageMode;
        if ((i & 8) != 0) {
            slippageFeeType = advanceSlippageCache.AEQbTJ;
        }
        SlippageFeeType slippageFeeType2 = slippageFeeType;
        if ((i & 16) != 0) {
            str2 = advanceSlippageCache.KWHzl;
        }
        return advanceSlippageCache.OLrzqt(cacheStatus, str3, slippageMode2, slippageFeeType2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageMode AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CacheStatus OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvanceSlippageCache OLrzqt(@NotNull CacheStatus cacheStatus, @NotNull String str, @NotNull SlippageMode slippageMode, SlippageFeeType slippageFeeType, String str2) {
        Intrinsics.checkNotNullParameter(cacheStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        return new AdvanceSlippageCache(cacheStatus, str, slippageMode, slippageFeeType, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SlippageFeeType copydefault() {
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
        if (!(obj instanceof AdvanceSlippageCache)) {
            return false;
        }
        AdvanceSlippageCache advanceSlippageCache = (AdvanceSlippageCache) obj;
        return this.copydefault == advanceSlippageCache.copydefault && Intrinsics.EZpvd((Object) this.EZpvd, (Object) advanceSlippageCache.EZpvd) && this.OLrzqt == advanceSlippageCache.OLrzqt && this.AEQbTJ == advanceSlippageCache.AEQbTJ && Intrinsics.EZpvd((Object) this.KWHzl, (Object) advanceSlippageCache.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        int iHashCode2 = this.EZpvd.hashCode();
        int iHashCode3 = this.OLrzqt.hashCode();
        SlippageFeeType slippageFeeType = this.AEQbTJ;
        int iHashCode4 = slippageFeeType == null ? 0 : slippageFeeType.hashCode();
        String str = this.KWHzl;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvanceSlippageCache(currentMode=" + this.copydefault + ", slippage=" + this.EZpvd + ", slippageMode=" + this.OLrzqt + ", slippageFeeType=" + this.AEQbTJ + ", maxSlippage=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault.name());
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt.name());
        SlippageFeeType slippageFeeType = this.AEQbTJ;
        if (slippageFeeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(slippageFeeType.name());
        }
        parcel.writeString(this.KWHzl);
    }

    public AdvanceSlippageCache(@NotNull CacheStatus cacheStatus, @NotNull String str, @NotNull SlippageMode slippageMode, SlippageFeeType slippageFeeType, String str2) {
        Intrinsics.checkNotNullParameter(cacheStatus, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.copydefault = cacheStatus;
        this.EZpvd = str;
        this.OLrzqt = slippageMode;
        this.AEQbTJ = slippageFeeType;
        this.KWHzl = str2;
    }
}
