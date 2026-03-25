package com.okinc.business.market.features.scanner.surge.trending.ui.filter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.business.market.features.scanner.surge.trending.domain.model.TrendingProtocolUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TrendingFilterBottomSheetParams implements Parcelable {
    public final TrendingFilter AEQbTJ;
    public final List<TrendingProtocolUiModel> AhwBna;
    public final String EZpvd;
    public final List<ProtocolFilterInfo> KWHzl;
    public final List<ProtocolInfo> copydefault;
    public final String gEmmrt;
    public final List<RankTypeFilter> valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<TrendingFilterBottomSheetParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TrendingFilterBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingFilterBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TrendingProtocolUiModel.CREATOR.createFromParcel(parcel));
            }
            TrendingFilter trendingFilterCreateFromParcel = TrendingFilter.CREATOR.createFromParcel(parcel);
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(RankTypeFilter.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(ProtocolFilterInfo.CREATOR.createFromParcel(parcel));
            }
            int i7 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i7);
            for (int i8 = 0; i8 != i7; i8++) {
                arrayList4.add(ProtocolInfo.CREATOR.createFromParcel(parcel));
            }
            return new TrendingFilterBottomSheetParams(arrayList, trendingFilterCreateFromParcel, arrayList2, string, string2, arrayList3, arrayList4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingFilterBottomSheetParams[] newArray(int i) {
            return new TrendingFilterBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendingFilterBottomSheetParams() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingFilterBottomSheetParams copy$default(TrendingFilterBottomSheetParams trendingFilterBottomSheetParams, List list, TrendingFilter trendingFilter, List list2, String str, String str2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = trendingFilterBottomSheetParams.AhwBna;
        }
        if ((i & 2) != 0) {
            trendingFilter = trendingFilterBottomSheetParams.AEQbTJ;
        }
        TrendingFilter trendingFilter2 = trendingFilter;
        if ((i & 4) != 0) {
            list2 = trendingFilterBottomSheetParams.valueOf;
        }
        List list5 = list2;
        if ((i & 8) != 0) {
            str = trendingFilterBottomSheetParams.gEmmrt;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            str2 = trendingFilterBottomSheetParams.EZpvd;
        }
        String str4 = str2;
        if ((i & 32) != 0) {
            list3 = trendingFilterBottomSheetParams.KWHzl;
        }
        List list6 = list3;
        if ((i & 64) != 0) {
            list4 = trendingFilterBottomSheetParams.copydefault;
        }
        return trendingFilterBottomSheetParams.AEQbTJ(list, trendingFilter2, list5, str3, str4, list6, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingFilter AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingFilterBottomSheetParams AEQbTJ(@NotNull List<TrendingProtocolUiModel> list, @NotNull TrendingFilter trendingFilter, @NotNull List<RankTypeFilter> list2, @NotNull String str, @NotNull String str2, @NotNull List<ProtocolFilterInfo> list3, @NotNull List<ProtocolInfo> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(trendingFilter, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new TrendingFilterBottomSheetParams(list, trendingFilter, list2, str, str2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TrendingProtocolUiModel> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RankTypeFilter> copydefault() {
        return this.valueOf;
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
        if (!(obj instanceof TrendingFilterBottomSheetParams)) {
            return false;
        }
        TrendingFilterBottomSheetParams trendingFilterBottomSheetParams = (TrendingFilterBottomSheetParams) obj;
        return Intrinsics.EZpvd(this.AhwBna, trendingFilterBottomSheetParams.AhwBna) && Intrinsics.EZpvd(this.AEQbTJ, trendingFilterBottomSheetParams.AEQbTJ) && Intrinsics.EZpvd(this.valueOf, trendingFilterBottomSheetParams.valueOf) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) trendingFilterBottomSheetParams.gEmmrt) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) trendingFilterBottomSheetParams.EZpvd) && Intrinsics.EZpvd(this.KWHzl, trendingFilterBottomSheetParams.KWHzl) && Intrinsics.EZpvd(this.copydefault, trendingFilterBottomSheetParams.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.AhwBna.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendingFilterBottomSheetParams(protocols=" + this.AhwBna + ", filter=" + this.AEQbTJ + ", rankTypes=" + this.valueOf + ", selectedRankType=" + this.gEmmrt + ", chainId=" + this.EZpvd + ", allProtocolFilterInfos=" + this.KWHzl + ", allProtocolInfos=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TrendingProtocolUiModel> list = this.AhwBna;
        parcel.writeInt(list.size());
        Iterator<TrendingProtocolUiModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        this.AEQbTJ.writeToParcel(parcel, i);
        List<RankTypeFilter> list2 = this.valueOf;
        parcel.writeInt(list2.size());
        Iterator<RankTypeFilter> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.EZpvd);
        List<ProtocolFilterInfo> list3 = this.KWHzl;
        parcel.writeInt(list3.size());
        Iterator<ProtocolFilterInfo> it3 = list3.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i);
        }
        List<ProtocolInfo> list4 = this.copydefault;
        parcel.writeInt(list4.size());
        Iterator<ProtocolInfo> it4 = list4.iterator();
        while (it4.hasNext()) {
            it4.next().writeToParcel(parcel, i);
        }
    }

    public TrendingFilterBottomSheetParams(@NotNull List<TrendingProtocolUiModel> list, @NotNull TrendingFilter trendingFilter, @NotNull List<RankTypeFilter> list2, @NotNull String str, @NotNull String str2, @NotNull List<ProtocolFilterInfo> list3, @NotNull List<ProtocolInfo> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(trendingFilter, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.AhwBna = list;
        this.AEQbTJ = trendingFilter;
        this.valueOf = list2;
        this.gEmmrt = str;
        this.EZpvd = str2;
        this.KWHzl = list3;
        this.copydefault = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r15v0 java.util.List))
  (wrap:com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001d: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.features.meme.filter.domain.TokenAgeType)
  (null java.lang.String)
  false
  (wrap:int:SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.features.meme.filter.domain.TokenAgeType, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r16v0 com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0023: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0027: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r17v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r22v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:22)) : (r20v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004a: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:23)) : (r21v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.scanner.surge.trending.domain.model.TrendingProtocolUiModel>, com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter, java.util.List<com.okinc.business.market.features.scanner.surge.trending.ui.filter.RankTypeFilter>, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.scanner.surge.trending.ui.filter.ProtocolFilterInfo>, java.util.List<com.okinc.business.market.features.scanner.surge.trending.ui.filter.ProtocolInfo>):void (m)] (LINE:16) call: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetParams.<init>(java.util.List, com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilter, java.util.List, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TrendingFilterBottomSheetParams(List list, TrendingFilter trendingFilter, List list2, String str, String str2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? new TrendingFilter(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null) : trendingFilter, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? "" : str, (i & 16) == 0 ? str2 : "", (i & 32) != 0 ? yDY.AhwBna() : list3, (i & 64) != 0 ? yDY.AhwBna() : list4);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.scanner.surge.trending.ui.filter.TrendingFilterBottomSheetParams.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
