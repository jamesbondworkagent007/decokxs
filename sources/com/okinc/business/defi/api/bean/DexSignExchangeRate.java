package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class DexSignExchangeRate implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DexSignExchangeRate> CREATOR = new Creator();
    private final DexSignExchangeRateBean rate;
    private final DexSignExchangeRateBean reverseRate;

    public static final class Creator implements Parcelable.Creator<DexSignExchangeRate> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexSignExchangeRate createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Parcelable.Creator<DexSignExchangeRateBean> creator = DexSignExchangeRateBean.CREATOR;
            return new DexSignExchangeRate(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexSignExchangeRate[] newArray(int i) {
            return new DexSignExchangeRate[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexSignExchangeRate copy$default(DexSignExchangeRate dexSignExchangeRate, DexSignExchangeRateBean dexSignExchangeRateBean, DexSignExchangeRateBean dexSignExchangeRateBean2, int i, Object obj) {
        if ((i & 1) != 0) {
            dexSignExchangeRateBean = dexSignExchangeRate.rate;
        }
        if ((i & 2) != 0) {
            dexSignExchangeRateBean2 = dexSignExchangeRate.reverseRate;
        }
        return dexSignExchangeRate.copy(dexSignExchangeRateBean, dexSignExchangeRateBean2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRateBean component1() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRateBean component2() {
        return this.reverseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRate copy(@NotNull DexSignExchangeRateBean dexSignExchangeRateBean, DexSignExchangeRateBean dexSignExchangeRateBean2) {
        Intrinsics.checkNotNullParameter(dexSignExchangeRateBean, "");
        return new DexSignExchangeRate(dexSignExchangeRateBean, dexSignExchangeRateBean2);
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
        if (!(obj instanceof DexSignExchangeRate)) {
            return false;
        }
        DexSignExchangeRate dexSignExchangeRate = (DexSignExchangeRate) obj;
        return Intrinsics.EZpvd(this.rate, dexSignExchangeRate.rate) && Intrinsics.EZpvd(this.reverseRate, dexSignExchangeRate.reverseRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRateBean getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexSignExchangeRateBean getReverseRate() {
        return this.reverseRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.rate.hashCode();
        DexSignExchangeRateBean dexSignExchangeRateBean = this.reverseRate;
        return (iHashCode * 31) + (dexSignExchangeRateBean == null ? 0 : dexSignExchangeRateBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexSignExchangeRate(rate=" + this.rate + ", reverseRate=" + this.reverseRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.rate.writeToParcel(parcel, i);
        DexSignExchangeRateBean dexSignExchangeRateBean = this.reverseRate;
        if (dexSignExchangeRateBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexSignExchangeRateBean.writeToParcel(parcel, i);
        }
    }

    public DexSignExchangeRate(@NotNull DexSignExchangeRateBean dexSignExchangeRateBean, DexSignExchangeRateBean dexSignExchangeRateBean2) {
        Intrinsics.checkNotNullParameter(dexSignExchangeRateBean, "");
        this.rate = dexSignExchangeRateBean;
        this.reverseRate = dexSignExchangeRateBean2;
    }
}
