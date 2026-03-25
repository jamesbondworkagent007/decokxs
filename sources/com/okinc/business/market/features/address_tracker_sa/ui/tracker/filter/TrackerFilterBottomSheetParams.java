package com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.ui.FilterSheetTrackParams;
import com.okinc.business.market.features.filter.ui.NetworkOptionParams;
import com.okinc.business.market.features.filter.ui.TypeOptionParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerFilterBottomSheetParams implements Parcelable {
    public static final TrackerFilterBottomSheetParams EZpvd = new TrackerFilterBottomSheetParams(null, null, null, new TrackerTxnListFilter(false, null, null, null, null, null, null, null, null, null, 1023, null), null, null, 55, null);
    public final TrackerTxnListFilter AEQbTJ;
    public final List<PriceRangeFilter> AYXKKw;
    public final List<NetworkOptionParams> KWHzl;
    public final TrackerTxnListFilter OLrzqt;
    public final List<TypeOptionParams> gEmmrt;
    public final FilterSheetTrackParams valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<TrackerFilterBottomSheetParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TrackerFilterBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerFilterBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TypeOptionParams.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(NetworkOptionParams.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(PriceRangeFilter.CREATOR.createFromParcel(parcel));
            }
            Parcelable.Creator<TrackerTxnListFilter> creator = TrackerTxnListFilter.CREATOR;
            return new TrackerFilterBottomSheetParams(arrayList, arrayList2, arrayList3, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), FilterSheetTrackParams.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerFilterBottomSheetParams[] newArray(int i) {
            return new TrackerFilterBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheetParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackerFilterBottomSheetParams copy$default(TrackerFilterBottomSheetParams trackerFilterBottomSheetParams, List list, List list2, List list3, TrackerTxnListFilter trackerTxnListFilter, TrackerTxnListFilter trackerTxnListFilter2, FilterSheetTrackParams filterSheetTrackParams, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trackerFilterBottomSheetParams.gEmmrt;
        }
        if ((i & 2) != 0) {
            list2 = trackerFilterBottomSheetParams.KWHzl;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            list3 = trackerFilterBottomSheetParams.AYXKKw;
        }
        List list5 = list3;
        if ((i & 8) != 0) {
            trackerTxnListFilter = trackerFilterBottomSheetParams.OLrzqt;
        }
        TrackerTxnListFilter trackerTxnListFilter3 = trackerTxnListFilter;
        if ((i & 16) != 0) {
            trackerTxnListFilter2 = trackerFilterBottomSheetParams.AEQbTJ;
        }
        TrackerTxnListFilter trackerTxnListFilter4 = trackerTxnListFilter2;
        if ((i & 32) != 0) {
            filterSheetTrackParams = trackerFilterBottomSheetParams.valueOf;
        }
        return trackerFilterBottomSheetParams.copydefault(list, list4, list5, trackerTxnListFilter3, trackerTxnListFilter4, filterSheetTrackParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTxnListFilter AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TypeOptionParams> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeFilter> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NetworkOptionParams> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerFilterBottomSheetParams copydefault(@NotNull List<TypeOptionParams> list, @NotNull List<NetworkOptionParams> list2, @NotNull List<PriceRangeFilter> list3, @NotNull TrackerTxnListFilter trackerTxnListFilter, TrackerTxnListFilter trackerTxnListFilter2, @NotNull FilterSheetTrackParams filterSheetTrackParams) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(trackerTxnListFilter, "");
        Intrinsics.checkNotNullParameter(filterSheetTrackParams, "");
        return new TrackerFilterBottomSheetParams(list, list2, list3, trackerTxnListFilter, trackerTxnListFilter2, filterSheetTrackParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTxnListFilter copydefault() {
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
        if (!(obj instanceof TrackerFilterBottomSheetParams)) {
            return false;
        }
        TrackerFilterBottomSheetParams trackerFilterBottomSheetParams = (TrackerFilterBottomSheetParams) obj;
        return Intrinsics.EZpvd(this.gEmmrt, trackerFilterBottomSheetParams.gEmmrt) && Intrinsics.EZpvd(this.KWHzl, trackerFilterBottomSheetParams.KWHzl) && Intrinsics.EZpvd(this.AYXKKw, trackerFilterBottomSheetParams.AYXKKw) && Intrinsics.EZpvd(this.OLrzqt, trackerFilterBottomSheetParams.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, trackerFilterBottomSheetParams.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, trackerFilterBottomSheetParams.valueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.AYXKKw.hashCode();
        int iHashCode4 = this.OLrzqt.hashCode();
        TrackerTxnListFilter trackerTxnListFilter = this.AEQbTJ;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (trackerTxnListFilter == null ? 0 : trackerTxnListFilter.hashCode())) * 31) + this.valueOf.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerFilterBottomSheetParams(typeOptions=" + this.gEmmrt + ", networkOptions=" + this.KWHzl + ", priceRangeOptions=" + this.AYXKKw + ", defaultFilter=" + this.OLrzqt + ", presetFilter=" + this.AEQbTJ + ", trackParams=" + this.valueOf + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TypeOptionParams> list = this.gEmmrt;
        parcel.writeInt(list.size());
        Iterator<TypeOptionParams> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<NetworkOptionParams> list2 = this.KWHzl;
        parcel.writeInt(list2.size());
        Iterator<NetworkOptionParams> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<PriceRangeFilter> list3 = this.AYXKKw;
        parcel.writeInt(list3.size());
        Iterator<PriceRangeFilter> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        this.OLrzqt.writeToParcel(parcel, i);
        TrackerTxnListFilter trackerTxnListFilter = this.AEQbTJ;
        if (trackerTxnListFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            trackerTxnListFilter.writeToParcel(parcel, i);
        }
        this.valueOf.writeToParcel(parcel, i);
    }

    public TrackerFilterBottomSheetParams(@NotNull List<TypeOptionParams> list, @NotNull List<NetworkOptionParams> list2, @NotNull List<PriceRangeFilter> list3, @NotNull TrackerTxnListFilter trackerTxnListFilter, TrackerTxnListFilter trackerTxnListFilter2, @NotNull FilterSheetTrackParams filterSheetTrackParams) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(trackerTxnListFilter, "");
        Intrinsics.checkNotNullParameter(filterSheetTrackParams, "");
        this.gEmmrt = list;
        this.KWHzl = list2;
        this.AYXKKw = list3;
        this.OLrzqt = trackerTxnListFilter;
        this.AEQbTJ = trackerTxnListFilter2;
        this.valueOf = filterSheetTrackParams;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.util.List:0x0008: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r8v0 java.util.List))
  (wrap:java.util.List:0x0011: TERNARY null = ((wrap:int:0x0009: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r9v0 java.util.List))
  (wrap:java.util.List:0x001a: TERNARY null = ((wrap:int:0x0012: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0016: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r10v0 java.util.List))
  (r11v0 com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter)
  (wrap:com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter:?: TERNARY null = ((wrap:int:0x001b: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter) : (r12v0 com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter))
  (wrap:com.okinc.business.market.features.filter.ui.FilterSheetTrackParams:?: TERNARY null = ((wrap:int:0x0023: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.filter.ui.FilterSheetTrackParams:0x002a: CONSTRUCTOR 
  (null java.lang.String)
  (null com.okinc.business.market.features.filter.ui.CommonTrackData)
  (3 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, com.okinc.business.market.features.filter.ui.CommonTrackData, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:17) call: com.okinc.business.market.features.filter.ui.FilterSheetTrackParams.<init>(java.lang.String, com.okinc.business.market.features.filter.ui.CommonTrackData, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r13v0 com.okinc.business.market.features.filter.ui.FilterSheetTrackParams))
 A[MD:(java.util.List<com.okinc.business.market.features.filter.ui.TypeOptionParams>, java.util.List<com.okinc.business.market.features.filter.ui.NetworkOptionParams>, java.util.List<com.okinc.business.market.features.filter.domain.PriceRangeFilter>, com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter, com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter, com.okinc.business.market.features.filter.ui.FilterSheetTrackParams):void (m)] (LINE:11) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheetParams.<init>(java.util.List, java.util.List, java.util.List, com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter, com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter, com.okinc.business.market.features.filter.ui.FilterSheetTrackParams):void type: THIS */
    public /* synthetic */ TrackerFilterBottomSheetParams(List list, List list2, List list3, TrackerTxnListFilter trackerTxnListFilter, TrackerTxnListFilter trackerTxnListFilter2, FilterSheetTrackParams filterSheetTrackParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, trackerTxnListFilter, (i & 16) != 0 ? null : trackerTxnListFilter2, (i & 32) != 0 ? new FilterSheetTrackParams(null, null, 3, null) : filterSheetTrackParams);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerFilterBottomSheetParams.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final TrackerFilterBottomSheetParams OLrzqt() {
            return TrackerFilterBottomSheetParams.EZpvd;
        }
    }
}
