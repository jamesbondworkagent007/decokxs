package com.okinc.business.market.features.watch_list_groups.ui.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C33070mpX;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchListFilterParams implements Parcelable {
    public final List<TimeIntervalType> AEQbTJ;
    public final boolean EZpvd;
    public final HomeFavoriteListFilter KWHzl;
    public final String OLrzqt;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<WatchListFilterParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<WatchListFilterParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchListFilterParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TimeIntervalType.valueOf(parcel.readString()));
            }
            return new WatchListFilterParams(string, arrayList, HomeFavoriteListFilter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WatchListFilterParams[] newArray(int i) {
            return new WatchListFilterParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public WatchListFilterParams() {
        this(null, null, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WatchListFilterParams copy$default(WatchListFilterParams watchListFilterParams, String str, List list, HomeFavoriteListFilter homeFavoriteListFilter, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = watchListFilterParams.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = watchListFilterParams.AEQbTJ;
        }
        if ((i & 4) != 0) {
            homeFavoriteListFilter = watchListFilterParams.KWHzl;
        }
        if ((i & 8) != 0) {
            z = watchListFilterParams.EZpvd;
        }
        return watchListFilterParams.KWHzl(str, list, homeFavoriteListFilter, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WatchListFilterParams KWHzl(@NotNull String str, @NotNull List<? extends TimeIntervalType> list, @NotNull HomeFavoriteListFilter homeFavoriteListFilter, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(homeFavoriteListFilter, "");
        return new WatchListFilterParams(str, list, homeFavoriteListFilter, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TimeIntervalType> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeFavoriteListFilter copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof WatchListFilterParams)) {
            return false;
        }
        WatchListFilterParams watchListFilterParams = (WatchListFilterParams) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) watchListFilterParams.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, watchListFilterParams.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, watchListFilterParams.KWHzl) && this.EZpvd == watchListFilterParams.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WatchListFilterParams(title=" + this.OLrzqt + ", options=" + this.AEQbTJ + ", filter=" + this.KWHzl + ", isSmartAccount=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        List<TimeIntervalType> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<TimeIntervalType> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        this.KWHzl.writeToParcel(parcel, i);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.market.common.constants.TimeIntervalType> */
    /* JADX WARN: Multi-variable type inference failed */
    public WatchListFilterParams(@NotNull String str, @NotNull List<? extends TimeIntervalType> list, @NotNull HomeFavoriteListFilter homeFavoriteListFilter, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(homeFavoriteListFilter, "");
        this.OLrzqt = str;
        this.AEQbTJ = list;
        this.KWHzl = homeFavoriteListFilter;
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0006: INVOKE (wrap:int:0x0004: SGET  A[WRAPPED] o.hvD.Fragment.onTrimMemory int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:12)) : (r1v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:13)) : (r2v0 java.util.List))
  (wrap:com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter:?: TERNARY null = ((wrap:int:0x0012: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter:0x0018: INVOKE 
  (wrap:com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter$Activity:0x0016: SGET  A[WRAPPED] (LINE:14) com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter.Companion com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter$Activity)
 VIRTUAL call: com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter.Activity.KWHzl():com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter A[MD:():com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter (m), WRAPPED] (LINE:14)) : (r3v0 com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.String, java.util.List<? extends com.okinc.business.market.common.constants.TimeIntervalType>, com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter, boolean):void (m)] (LINE:11) call: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterParams.<init>(java.lang.String, java.util.List, com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter, boolean):void type: THIS */
    public /* synthetic */ WatchListFilterParams(String str, List list, HomeFavoriteListFilter homeFavoriteListFilter, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C33070mpX.AYXKKw(C23274hvD.Fragment.onTrimMemory) : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? HomeFavoriteListFilter.Companion.KWHzl() : homeFavoriteListFilter, (i & 8) != 0 ? false : z);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterParams.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
