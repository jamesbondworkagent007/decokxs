package com.okinc.business.market.features.filter.ui.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FilterConfig implements Parcelable {
    public static final Parcelable.Creator<FilterConfig> CREATOR = new Creator();
    public final List<PriceRangeFilter> AEQbTJ;
    public final List<PriceRangeFilter> EZpvd;
    public final List<PriceRangeFilter> KWHzl;
    public final List<PriceRangeFilter> OLrzqt;

    public static final class Creator implements Parcelable.Creator<FilterConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PriceRangeFilter.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(PriceRangeFilter.CREATOR.createFromParcel(parcel));
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(PriceRangeFilter.CREATOR.createFromParcel(parcel));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(PriceRangeFilter.CREATOR.createFromParcel(parcel));
            }
            return new FilterConfig(arrayList, arrayList2, arrayList3, arrayList4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterConfig[] newArray(int i) {
            return new FilterConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterConfig() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.filter.ui.params.FilterConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FilterConfig copy$default(FilterConfig filterConfig, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filterConfig.KWHzl;
        }
        if ((i & 2) != 0) {
            list2 = filterConfig.OLrzqt;
        }
        if ((i & 4) != 0) {
            list3 = filterConfig.AEQbTJ;
        }
        if ((i & 8) != 0) {
            list4 = filterConfig.EZpvd;
        }
        return filterConfig.copydefault(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeFilter> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeFilter> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeFilter> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterConfig copydefault(@NotNull List<PriceRangeFilter> list, @NotNull List<PriceRangeFilter> list2, @NotNull List<PriceRangeFilter> list3, @NotNull List<PriceRangeFilter> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new FilterConfig(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeFilter> copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof FilterConfig)) {
            return false;
        }
        FilterConfig filterConfig = (FilterConfig) obj;
        return Intrinsics.EZpvd(this.KWHzl, filterConfig.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, filterConfig.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, filterConfig.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, filterConfig.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterConfig(liquidityConfigList=" + this.KWHzl + ", volumeConfigList=" + this.OLrzqt + ", marketCapConfigList=" + this.AEQbTJ + ", tokenAgeConfigList=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<PriceRangeFilter> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<PriceRangeFilter> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<PriceRangeFilter> list2 = this.OLrzqt;
        parcel.writeInt(list2.size());
        Iterator<PriceRangeFilter> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        List<PriceRangeFilter> list3 = this.AEQbTJ;
        parcel.writeInt(list3.size());
        Iterator<PriceRangeFilter> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<PriceRangeFilter> list4 = this.EZpvd;
        parcel.writeInt(list4.size());
        Iterator<PriceRangeFilter> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public FilterConfig(@NotNull List<PriceRangeFilter> list, @NotNull List<PriceRangeFilter> list2, @NotNull List<PriceRangeFilter> list3, @NotNull List<PriceRangeFilter> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.KWHzl = list;
        this.OLrzqt = list2;
        this.AEQbTJ = list3;
        this.EZpvd = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:29)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:30)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r4v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.filter.domain.PriceRangeFilter>, java.util.List<com.okinc.business.market.features.filter.domain.PriceRangeFilter>, java.util.List<com.okinc.business.market.features.filter.domain.PriceRangeFilter>, java.util.List<com.okinc.business.market.features.filter.domain.PriceRangeFilter>):void (m)] (LINE:28) call: com.okinc.business.market.features.filter.ui.params.FilterConfig.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ FilterConfig(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4);
    }
}
