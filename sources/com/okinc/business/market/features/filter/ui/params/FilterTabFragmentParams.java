package com.okinc.business.market.features.filter.ui.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FilterTabFragmentParams implements Parcelable {
    public final AdvancedFilter AEQbTJ;
    public final TabPosition AhwBna;
    public final AdvancedFilter EZpvd;
    public final String OLrzqt;
    public final FilterConfig copydefault;
    public final String gEmmrt;
    public final TimeIntervalType valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final Parcelable.Creator<FilterTabFragmentParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FilterTabFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterTabFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FilterTabFragmentParams(parcel.readInt() == 0 ? null : AdvancedFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdvancedFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FilterConfig.CREATOR.createFromParcel(parcel), TabPosition.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0 ? TimeIntervalType.valueOf(parcel.readString()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterTabFragmentParams[] newArray(int i) {
            return new FilterTabFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterTabFragmentParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilterTabFragmentParams copy$default(FilterTabFragmentParams filterTabFragmentParams, AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, TabPosition tabPosition, String str, TimeIntervalType timeIntervalType, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            advancedFilter = filterTabFragmentParams.EZpvd;
        }
        if ((i & 2) != 0) {
            advancedFilter2 = filterTabFragmentParams.AEQbTJ;
        }
        AdvancedFilter advancedFilter3 = advancedFilter2;
        if ((i & 4) != 0) {
            filterConfig = filterTabFragmentParams.copydefault;
        }
        FilterConfig filterConfig2 = filterConfig;
        if ((i & 8) != 0) {
            tabPosition = filterTabFragmentParams.AhwBna;
        }
        TabPosition tabPosition2 = tabPosition;
        if ((i & 16) != 0) {
            str = filterTabFragmentParams.gEmmrt;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            timeIntervalType = filterTabFragmentParams.valueOf;
        }
        TimeIntervalType timeIntervalType2 = timeIntervalType;
        if ((i & 64) != 0) {
            str2 = filterTabFragmentParams.OLrzqt;
        }
        return filterTabFragmentParams.AEQbTJ(advancedFilter, advancedFilter3, filterConfig2, tabPosition2, str3, timeIntervalType2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterTabFragmentParams AEQbTJ(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, @NotNull TabPosition tabPosition, @NotNull String str, TimeIntervalType timeIntervalType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tabPosition, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FilterTabFragmentParams(advancedFilter, advancedFilter2, filterConfig, tabPosition, str, timeIntervalType, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterConfig KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.gEmmrt;
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
        if (!(obj instanceof FilterTabFragmentParams)) {
            return false;
        }
        FilterTabFragmentParams filterTabFragmentParams = (FilterTabFragmentParams) obj;
        return Intrinsics.EZpvd(this.EZpvd, filterTabFragmentParams.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, filterTabFragmentParams.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, filterTabFragmentParams.copydefault) && this.AhwBna == filterTabFragmentParams.AhwBna && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) filterTabFragmentParams.gEmmrt) && this.valueOf == filterTabFragmentParams.valueOf && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) filterTabFragmentParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AdvancedFilter advancedFilter = this.EZpvd;
        int iHashCode = advancedFilter == null ? 0 : advancedFilter.hashCode();
        AdvancedFilter advancedFilter2 = this.AEQbTJ;
        int iHashCode2 = advancedFilter2 == null ? 0 : advancedFilter2.hashCode();
        FilterConfig filterConfig = this.copydefault;
        int iHashCode3 = filterConfig == null ? 0 : filterConfig.hashCode();
        int iHashCode4 = this.AhwBna.hashCode();
        int iHashCode5 = this.gEmmrt.hashCode();
        TimeIntervalType timeIntervalType = this.valueOf;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (timeIntervalType != null ? timeIntervalType.hashCode() : 0)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterTabFragmentParams(advancedFilter=" + this.EZpvd + ", defaultAdvancedFilter=" + this.AEQbTJ + ", filterConfig=" + this.copydefault + ", selectTabPosition=" + this.AhwBna + ", rankingName=" + this.gEmmrt + ", timeIntervalType=" + this.valueOf + ", listKey=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TabPosition valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        AdvancedFilter advancedFilter = this.EZpvd;
        if (advancedFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advancedFilter.writeToParcel(parcel, i);
        }
        AdvancedFilter advancedFilter2 = this.AEQbTJ;
        if (advancedFilter2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advancedFilter2.writeToParcel(parcel, i);
        }
        FilterConfig filterConfig = this.copydefault;
        if (filterConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filterConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.AhwBna.name());
        parcel.writeString(this.gEmmrt);
        TimeIntervalType timeIntervalType = this.valueOf;
        if (timeIntervalType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeIntervalType.name());
        }
        parcel.writeString(this.OLrzqt);
    }

    public FilterTabFragmentParams(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, @NotNull TabPosition tabPosition, @NotNull String str, TimeIntervalType timeIntervalType, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tabPosition, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.EZpvd = advancedFilter;
        this.AEQbTJ = advancedFilter2;
        this.copydefault = filterConfig;
        this.AhwBna = tabPosition;
        this.gEmmrt = str;
        this.valueOf = timeIntervalType;
        this.OLrzqt = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.filter.domain.AdvancedFilter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.AdvancedFilter) : (r6v0 com.okinc.business.market.features.filter.domain.AdvancedFilter))
  (wrap:com.okinc.business.market.features.filter.domain.AdvancedFilter:?: TERNARY null = ((wrap:int:0x0008: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.AdvancedFilter) : (r7v0 com.okinc.business.market.features.filter.domain.AdvancedFilter))
  (wrap:com.okinc.business.market.features.filter.ui.params.FilterConfig:?: TERNARY null = ((wrap:int:0x000f: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.ui.params.FilterConfig) : (r8v0 com.okinc.business.market.features.filter.ui.params.FilterConfig))
  (wrap:com.okinc.business.market.features.filter.ui.params.TabPosition:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.filter.ui.params.TabPosition:0x001a: SGET  A[WRAPPED] (LINE:15) com.okinc.business.market.features.filter.ui.params.TabPosition.RankTab com.okinc.business.market.features.filter.ui.params.TabPosition) : (r9v0 com.okinc.business.market.features.filter.ui.params.TabPosition))
  (wrap:java.lang.String:0x0023: TERNARY null = ((wrap:int:0x001d: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 com.okinc.business.market.common.constants.TimeIntervalType) : (null com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("market_trending") : (r12v0 java.lang.String))
 A[MD:(com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.ui.params.FilterConfig, com.okinc.business.market.features.filter.ui.params.TabPosition, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.market.features.filter.ui.params.FilterTabFragmentParams.<init>(com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.ui.params.FilterConfig, com.okinc.business.market.features.filter.ui.params.TabPosition, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String):void type: THIS */
    public /* synthetic */ FilterTabFragmentParams(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, TabPosition tabPosition, String str, TimeIntervalType timeIntervalType, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advancedFilter, (i & 2) != 0 ? null : advancedFilter2, (i & 4) != 0 ? null : filterConfig, (i & 8) != 0 ? TabPosition.RankTab : tabPosition, (i & 16) != 0 ? "" : str, (i & 32) == 0 ? timeIntervalType : null, (i & 64) != 0 ? "market_trending" : str2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.filter.ui.params.FilterTabFragmentParams.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
