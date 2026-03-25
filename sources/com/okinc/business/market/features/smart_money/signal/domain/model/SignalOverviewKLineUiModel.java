package com.okinc.business.market.features.smart_money.signal.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalOverviewKLineUiModel implements Parcelable {
    public static final Parcelable.Creator<SignalOverviewKLineUiModel> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final List<DataPoint> EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final TimeIntervalSelector gEmmrt;

    public static final class Creator implements Parcelable.Creator<SignalOverviewKLineUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalOverviewKLineUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            TimeIntervalSelector timeIntervalSelectorValueOf = TimeIntervalSelector.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DataPoint.CREATOR.createFromParcel(parcel));
            }
            return new SignalOverviewKLineUiModel(timeIntervalSelectorValueOf, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalOverviewKLineUiModel[] newArray(int i) {
            return new SignalOverviewKLineUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalOverviewKLineUiModel() {
        this(null, null, false, false, false, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalOverviewKLineUiModel copy$default(SignalOverviewKLineUiModel signalOverviewKLineUiModel, TimeIntervalSelector timeIntervalSelector, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            timeIntervalSelector = signalOverviewKLineUiModel.gEmmrt;
        }
        if ((i & 2) != 0) {
            list = signalOverviewKLineUiModel.EZpvd;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            z = signalOverviewKLineUiModel.KWHzl;
        }
        boolean z5 = z;
        if ((i & 8) != 0) {
            z2 = signalOverviewKLineUiModel.OLrzqt;
        }
        boolean z6 = z2;
        if ((i & 16) != 0) {
            z3 = signalOverviewKLineUiModel.copydefault;
        }
        boolean z7 = z3;
        if ((i & 32) != 0) {
            z4 = signalOverviewKLineUiModel.AEQbTJ;
        }
        return signalOverviewKLineUiModel.AEQbTJ(timeIntervalSelector, list2, z5, z6, z7, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalOverviewKLineUiModel AEQbTJ(@NotNull TimeIntervalSelector timeIntervalSelector, @NotNull List<DataPoint> list, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalOverviewKLineUiModel(timeIntervalSelector, list, z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalSelector AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DataPoint> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
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
        if (!(obj instanceof SignalOverviewKLineUiModel)) {
            return false;
        }
        SignalOverviewKLineUiModel signalOverviewKLineUiModel = (SignalOverviewKLineUiModel) obj;
        return this.gEmmrt == signalOverviewKLineUiModel.gEmmrt && Intrinsics.EZpvd(this.EZpvd, signalOverviewKLineUiModel.EZpvd) && this.KWHzl == signalOverviewKLineUiModel.KWHzl && this.OLrzqt == signalOverviewKLineUiModel.OLrzqt && this.copydefault == signalOverviewKLineUiModel.copydefault && this.AEQbTJ == signalOverviewKLineUiModel.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.gEmmrt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalOverviewKLineUiModel(timeIntervalSelector=" + this.gEmmrt + ", dataPoints=" + this.EZpvd + ", isFetchingKline=" + this.KWHzl + ", isFetchKlineError=" + this.OLrzqt + ", needLoadMore=" + this.copydefault + ", isLoadMoreDone=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gEmmrt.name());
        List<DataPoint> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<DataPoint> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
    }

    public SignalOverviewKLineUiModel(@NotNull TimeIntervalSelector timeIntervalSelector, @NotNull List<DataPoint> list, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(timeIntervalSelector, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.gEmmrt = timeIntervalSelector;
        this.EZpvd = list;
        this.KWHzl = z;
        this.OLrzqt = z2;
        this.copydefault = z3;
        this.AEQbTJ = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector:0x0004: SGET  A[WRAPPED] (LINE:117) com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector.FOUR_HOURS com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector) : (r5v0 com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:118)) : (r6v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0017: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? true : (r10v0 boolean))
 A[MD:(com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector, java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel$DataPoint>, boolean, boolean, boolean, boolean):void (m)] (LINE:116) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalOverviewKLineUiModel.<init>(com.okinc.business.market.features.smart_money.signal.ui.overview.chart.TimeIntervalSelector, java.util.List, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ SignalOverviewKLineUiModel(TimeIntervalSelector timeIntervalSelector, List list, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? TimeIntervalSelector.FOUR_HOURS : timeIntervalSelector, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) == 0 ? z3 : false, (i & 32) != 0 ? true : z4);
    }

    public static final class DataPoint implements Parcelable {
        public static final Parcelable.Creator<DataPoint> CREATOR = new Creator();
        public final long EZpvd;
        public final float copydefault;

        public static final class Creator implements Parcelable.Creator<DataPoint> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataPoint createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new DataPoint(parcel.readLong(), parcel.readFloat());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final DataPoint[] newArray(int i) {
                return new DataPoint[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ DataPoint copy$default(DataPoint dataPoint, long j, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                j = dataPoint.EZpvd;
            }
            if ((i & 2) != 0) {
                f = dataPoint.copydefault;
            }
            return dataPoint.KWHzl(j, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DataPoint KWHzl(long j, float f) {
            return new DataPoint(j, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
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
            if (!(obj instanceof DataPoint)) {
                return false;
            }
            DataPoint dataPoint = (DataPoint) obj;
            return this.EZpvd == dataPoint.EZpvd && Float.compare(this.copydefault, dataPoint.copydefault) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (Long.hashCode(this.EZpvd) * 31) + Float.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DataPoint(timestampInMillis=" + this.EZpvd + ", price=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeLong(this.EZpvd);
            parcel.writeFloat(this.copydefault);
        }

        public DataPoint(long j, float f) {
            this.EZpvd = j;
            this.copydefault = f;
        }
    }
}
