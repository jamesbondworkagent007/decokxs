package com.okinc.business.market.features.filter.ui.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FilterRankFragmentParams implements Parcelable {
    public final AdvancedFilter EZpvd;
    public final AdvancedFilter KWHzl;
    public final TimeIntervalType OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<FilterRankFragmentParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FilterRankFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterRankFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FilterRankFragmentParams(parcel.readInt() == 0 ? null : AdvancedFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdvancedFilter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TimeIntervalType.valueOf(parcel.readString()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterRankFragmentParams[] newArray(int i) {
            return new FilterRankFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterRankFragmentParams() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilterRankFragmentParams copy$default(FilterRankFragmentParams filterRankFragmentParams, AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, TimeIntervalType timeIntervalType, int i, Object obj) {
        if ((i & 1) != 0) {
            advancedFilter = filterRankFragmentParams.KWHzl;
        }
        if ((i & 2) != 0) {
            advancedFilter2 = filterRankFragmentParams.EZpvd;
        }
        if ((i & 4) != 0) {
            timeIntervalType = filterRankFragmentParams.OLrzqt;
        }
        return filterRankFragmentParams.copydefault(advancedFilter, advancedFilter2, timeIntervalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterRankFragmentParams copydefault(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, TimeIntervalType timeIntervalType) {
        return new FilterRankFragmentParams(advancedFilter, advancedFilter2, timeIntervalType);
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
        if (!(obj instanceof FilterRankFragmentParams)) {
            return false;
        }
        FilterRankFragmentParams filterRankFragmentParams = (FilterRankFragmentParams) obj;
        return Intrinsics.EZpvd(this.KWHzl, filterRankFragmentParams.KWHzl) && Intrinsics.EZpvd(this.EZpvd, filterRankFragmentParams.EZpvd) && this.OLrzqt == filterRankFragmentParams.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AdvancedFilter advancedFilter = this.KWHzl;
        int iHashCode = advancedFilter == null ? 0 : advancedFilter.hashCode();
        AdvancedFilter advancedFilter2 = this.EZpvd;
        int iHashCode2 = advancedFilter2 == null ? 0 : advancedFilter2.hashCode();
        TimeIntervalType timeIntervalType = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (timeIntervalType != null ? timeIntervalType.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterRankFragmentParams(advancedFilter=" + this.KWHzl + ", defaultAdvancedFilter=" + this.EZpvd + ", timeIntervalType=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AdvancedFilter advancedFilter = this.KWHzl;
        if (advancedFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advancedFilter.writeToParcel(parcel, i);
        }
        AdvancedFilter advancedFilter2 = this.EZpvd;
        if (advancedFilter2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advancedFilter2.writeToParcel(parcel, i);
        }
        TimeIntervalType timeIntervalType = this.OLrzqt;
        if (timeIntervalType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeIntervalType.name());
        }
    }

    public FilterRankFragmentParams(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, TimeIntervalType timeIntervalType) {
        this.KWHzl = advancedFilter;
        this.EZpvd = advancedFilter2;
        this.OLrzqt = timeIntervalType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.filter.domain.AdvancedFilter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.AdvancedFilter) : (r2v0 com.okinc.business.market.features.filter.domain.AdvancedFilter))
  (wrap:com.okinc.business.market.features.filter.domain.AdvancedFilter:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.AdvancedFilter) : (r3v0 com.okinc.business.market.features.filter.domain.AdvancedFilter))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.TimeIntervalType) : (r4v0 com.okinc.business.market.common.constants.TimeIntervalType))
 A[MD:(com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.common.constants.TimeIntervalType):void (m)] (LINE:9) call: com.okinc.business.market.features.filter.ui.params.FilterRankFragmentParams.<init>(com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.common.constants.TimeIntervalType):void type: THIS */
    public /* synthetic */ FilterRankFragmentParams(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, TimeIntervalType timeIntervalType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advancedFilter, (i & 2) != 0 ? null : advancedFilter2, (i & 4) != 0 ? null : timeIntervalType);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.filter.ui.params.FilterRankFragmentParams.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
