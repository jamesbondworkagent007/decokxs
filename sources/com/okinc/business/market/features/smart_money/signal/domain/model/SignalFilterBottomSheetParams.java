package com.okinc.business.market.features.smart_money.signal.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalFilterBottomSheetParams implements Parcelable {
    public final SignalsFilter AEQbTJ;
    public final List<SignalMultiSelectUiModel> OLrzqt;
    public final SignalMetricsFilter copydefault;
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public static final Parcelable.Creator<SignalFilterBottomSheetParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SignalFilterBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalFilterBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalMultiSelectUiModel.CREATOR.createFromParcel(parcel));
            }
            return new SignalFilterBottomSheetParams(arrayList, SignalMetricsFilter.CREATOR.createFromParcel(parcel), SignalsFilter.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalFilterBottomSheetParams[] newArray(int i) {
            return new SignalFilterBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalFilterBottomSheetParams() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilterBottomSheetParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalFilterBottomSheetParams copy$default(SignalFilterBottomSheetParams signalFilterBottomSheetParams, List list, SignalMetricsFilter signalMetricsFilter, SignalsFilter signalsFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalFilterBottomSheetParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            signalMetricsFilter = signalFilterBottomSheetParams.copydefault;
        }
        if ((i & 4) != 0) {
            signalsFilter = signalFilterBottomSheetParams.AEQbTJ;
        }
        return signalFilterBottomSheetParams.copydefault(list, signalMetricsFilter, signalsFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalMultiSelectUiModel> KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMetricsFilter OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalFilterBottomSheetParams copydefault(@NotNull List<SignalMultiSelectUiModel> list, @NotNull SignalMetricsFilter signalMetricsFilter, @NotNull SignalsFilter signalsFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilter, "");
        Intrinsics.checkNotNullParameter(signalsFilter, "");
        return new SignalFilterBottomSheetParams(list, signalMetricsFilter, signalsFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalsFilter copydefault() {
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
        if (!(obj instanceof SignalFilterBottomSheetParams)) {
            return false;
        }
        SignalFilterBottomSheetParams signalFilterBottomSheetParams = (SignalFilterBottomSheetParams) obj;
        return Intrinsics.EZpvd(this.OLrzqt, signalFilterBottomSheetParams.OLrzqt) && Intrinsics.EZpvd(this.copydefault, signalFilterBottomSheetParams.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, signalFilterBottomSheetParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalFilterBottomSheetParams(protocols=" + this.OLrzqt + ", metricsFilter=" + this.copydefault + ", signalsFilter=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SignalMultiSelectUiModel> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<SignalMultiSelectUiModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.copydefault.writeToParcel(parcel, i);
        this.AEQbTJ.writeToParcel(parcel, i);
    }

    public SignalFilterBottomSheetParams(@NotNull List<SignalMultiSelectUiModel> list, @NotNull SignalMetricsFilter signalMetricsFilter, @NotNull SignalsFilter signalsFilter) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(signalMetricsFilter, "");
        Intrinsics.checkNotNullParameter(signalsFilter, "");
        this.OLrzqt = list;
        this.copydefault = signalMetricsFilter;
        this.AEQbTJ = signalsFilter;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:34)) : (r15v0 java.util.List))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR 
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.features.meme.filter.domain.TokenAgeType)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (wrap:int:0x0019: SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:35) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter.<init>(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter))
  (wrap:com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter:?: TERNARY null = ((wrap:int:0x0023: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0031: CONSTRUCTOR 
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (null com.okinc.business.market.features.filter.domain.PriceRangeFilter)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:36) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter.<init>(com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r17v0 com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter))
 A[MD:(java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>, com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter, com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter):void (m)] (LINE:33) call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilterBottomSheetParams.<init>(java.util.List, com.okinc.business.market.features.smart_money.signal.domain.model.SignalMetricsFilter, com.okinc.business.market.features.smart_money.signal.domain.model.SignalsFilter):void type: THIS */
    public /* synthetic */ SignalFilterBottomSheetParams(List list, SignalMetricsFilter signalMetricsFilter, SignalsFilter signalsFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? new SignalMetricsFilter(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null) : signalMetricsFilter, (i & 4) != 0 ? new SignalsFilter(null, null, null, null, 15, null) : signalsFilter);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.smart_money.signal.domain.model.SignalFilterBottomSheetParams.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
