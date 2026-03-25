package com.okinc.business.market.features.filter.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FilterBottomSheetParams implements Parcelable {
    public final TokenFilter AEQbTJ;
    public final boolean AYXKKw;
    public final boolean AhwBna;
    public final FilterAction AkhnZx;
    public final List<TypeOptionParams> AuCTel;
    public final FilterAction DbNXlk;
    public final String OLrzqt;
    public final boolean copydefault;
    public final TokenFilter djBIcL;
    public final Integer ejfBZ;
    public final FilterSheetTrackParams fIwbmz;
    public final String fJNWhG;
    public final String fetchVPNInfo;
    public final boolean gEmmrt;
    public final String isConnected;
    public final List<PriceRangeFilter> valueOf;
    public final String values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public static final Parcelable.Creator<FilterBottomSheetParams> CREATOR = new Creator();
    public static final FilterBottomSheetParams EZpvd = new FilterBottomSheetParams(null, null, null, null, new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, 8191, null), null, null, null, null, null, null, null, null, false, false, false, false, 131055, null);

    public static final class Creator implements Parcelable.Creator<FilterBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TypeOptionParams.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(PriceRangeFilter.CREATOR.createFromParcel(parcel));
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Parcelable.Creator<TokenFilter> creator = TokenFilter.CREATOR;
            return new FilterBottomSheetParams(string, arrayList, arrayList2, numValueOf, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), FilterSheetTrackParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), (FilterAction) parcel.readParcelable(FilterBottomSheetParams.class.getClassLoader()), (FilterAction) parcel.readParcelable(FilterBottomSheetParams.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterBottomSheetParams[] newArray(int i) {
            return new FilterBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterAction AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AuCTel() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterBottomSheetParams KWHzl(@NotNull String str, @NotNull List<TypeOptionParams> list, @NotNull List<PriceRangeFilter> list2, @StringRes Integer num, @NotNull TokenFilter tokenFilter, TokenFilter tokenFilter2, @NotNull String str2, @NotNull String str3, @NotNull FilterSheetTrackParams filterSheetTrackParams, String str4, String str5, FilterAction filterAction, FilterAction filterAction2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(filterSheetTrackParams, "");
        return new FilterBottomSheetParams(str, list, list2, num, tokenFilter, tokenFilter2, str2, str3, filterSheetTrackParams, str4, str5, filterAction, filterAction2, z, z2, z3, z4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterAction djBIcL() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterBottomSheetParams)) {
            return false;
        }
        FilterBottomSheetParams filterBottomSheetParams = (FilterBottomSheetParams) obj;
        return Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) filterBottomSheetParams.fetchVPNInfo) && Intrinsics.EZpvd(this.AuCTel, filterBottomSheetParams.AuCTel) && Intrinsics.EZpvd(this.valueOf, filterBottomSheetParams.valueOf) && Intrinsics.EZpvd(this.ejfBZ, filterBottomSheetParams.ejfBZ) && Intrinsics.EZpvd(this.AEQbTJ, filterBottomSheetParams.AEQbTJ) && Intrinsics.EZpvd(this.djBIcL, filterBottomSheetParams.djBIcL) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) filterBottomSheetParams.fJNWhG) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) filterBottomSheetParams.OLrzqt) && Intrinsics.EZpvd(this.fIwbmz, filterBottomSheetParams.fIwbmz) && Intrinsics.EZpvd((Object) this.values, (Object) filterBottomSheetParams.values) && Intrinsics.EZpvd((Object) this.isConnected, (Object) filterBottomSheetParams.isConnected) && Intrinsics.EZpvd(this.DbNXlk, filterBottomSheetParams.DbNXlk) && Intrinsics.EZpvd(this.AkhnZx, filterBottomSheetParams.AkhnZx) && this.AYXKKw == filterBottomSheetParams.AYXKKw && this.copydefault == filterBottomSheetParams.copydefault && this.AhwBna == filterBottomSheetParams.AhwBna && this.gEmmrt == filterBottomSheetParams.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer fARcdN() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TypeOptionParams> fetchVPNInfo() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeFilter> gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fetchVPNInfo.hashCode();
        int iHashCode2 = this.AuCTel.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        Integer num = this.ejfBZ;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.AEQbTJ.hashCode();
        TokenFilter tokenFilter = this.djBIcL;
        int iHashCode6 = tokenFilter == null ? 0 : tokenFilter.hashCode();
        int iHashCode7 = this.fJNWhG.hashCode();
        int iHashCode8 = this.OLrzqt.hashCode();
        int iHashCode9 = this.fIwbmz.hashCode();
        String str = this.values;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.isConnected;
        int iHashCode11 = str2 == null ? 0 : str2.hashCode();
        FilterAction filterAction = this.DbNXlk;
        int iHashCode12 = filterAction == null ? 0 : filterAction.hashCode();
        FilterAction filterAction2 = this.AkhnZx;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (filterAction2 != null ? filterAction2.hashCode() : 0)) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.copydefault)) * 31) + Boolean.hashCode(this.AhwBna)) * 31) + Boolean.hashCode(this.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterSheetTrackParams isConnected() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterBottomSheetParams(title=" + this.fetchVPNInfo + ", typeOptions=" + this.AuCTel + ", priceRangeOptions=" + this.valueOf + ", typeTitle=" + this.ejfBZ + ", defaultFilter=" + this.AEQbTJ + ", presetFilter=" + this.djBIcL + ", tokenSymbol=" + this.fJNWhG + ", chainName=" + this.OLrzqt + ", trackParams=" + this.fIwbmz + ", primaryBtnTitle=" + this.values + ", secondaryBtnTitle=" + this.isConnected + ", primaryAction=" + this.DbNXlk + ", secondaryAction=" + this.AkhnZx + ", ignoreSameFilter=" + this.AYXKKw + ", autoApplyPriceSelect=" + this.copydefault + ", isFromTracker=" + this.AhwBna + ", isFromHistory=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fetchVPNInfo);
        List<TypeOptionParams> list = this.AuCTel;
        parcel.writeInt(list.size());
        Iterator<TypeOptionParams> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        List<PriceRangeFilter> list2 = this.valueOf;
        parcel.writeInt(list2.size());
        Iterator<PriceRangeFilter> it2 = list2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        Integer num = this.ejfBZ;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.AEQbTJ.writeToParcel(parcel, i);
        TokenFilter tokenFilter = this.djBIcL;
        if (tokenFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tokenFilter.writeToParcel(parcel, i);
        }
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.OLrzqt);
        this.fIwbmz.writeToParcel(parcel, i);
        parcel.writeString(this.values);
        parcel.writeString(this.isConnected);
        parcel.writeParcelable(this.DbNXlk, i);
        parcel.writeParcelable(this.AkhnZx, i);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
    }

    public FilterBottomSheetParams(@NotNull String str, @NotNull List<TypeOptionParams> list, @NotNull List<PriceRangeFilter> list2, @StringRes Integer num, @NotNull TokenFilter tokenFilter, TokenFilter tokenFilter2, @NotNull String str2, @NotNull String str3, @NotNull FilterSheetTrackParams filterSheetTrackParams, String str4, String str5, FilterAction filterAction, FilterAction filterAction2, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(filterSheetTrackParams, "");
        this.fetchVPNInfo = str;
        this.AuCTel = list;
        this.valueOf = list2;
        this.ejfBZ = num;
        this.AEQbTJ = tokenFilter;
        this.djBIcL = tokenFilter2;
        this.fJNWhG = str2;
        this.OLrzqt = str3;
        this.fIwbmz = filterSheetTrackParams;
        this.values = str4;
        this.isConnected = str5;
        this.DbNXlk = filterAction;
        this.AkhnZx = filterAction2;
        this.AYXKKw = z;
        this.copydefault = z2;
        this.AhwBna = z3;
        this.gEmmrt = z4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r39v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:38)) : (r23v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r39v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r24v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r39v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (r26v0 com.okinc.business.market.features.filter.domain.TokenFilter)
  (wrap:com.okinc.business.market.features.filter.domain.TokenFilter:?: TERNARY null = ((wrap:int:0x002d: ARITH (r39v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.TokenFilter) : (r27v0 com.okinc.business.market.features.filter.domain.TokenFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r39v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r39v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:com.okinc.business.market.features.filter.ui.FilterSheetTrackParams:?: TERNARY null = ((wrap:int:0x0045: ARITH (r39v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: CONSTRUCTOR 
  (null java.lang.String)
  (null com.okinc.business.market.features.filter.ui.CommonTrackData)
  (3 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, com.okinc.business.market.features.filter.ui.CommonTrackData, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:46) call: com.okinc.business.market.features.filter.ui.FilterSheetTrackParams.<init>(java.lang.String, com.okinc.business.market.features.filter.ui.CommonTrackData, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r30v0 com.okinc.business.market.features.filter.ui.FilterSheetTrackParams))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r39v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r39v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:com.okinc.business.market.features.filter.ui.FilterAction:?: TERNARY null = ((wrap:int:0x0063: ARITH (r39v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.ui.FilterAction) : (r33v0 com.okinc.business.market.features.filter.ui.FilterAction))
  (wrap:com.okinc.business.market.features.filter.ui.FilterAction:?: TERNARY null = ((wrap:int:0x006b: ARITH (r39v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.ui.FilterAction) : (r34v0 com.okinc.business.market.features.filter.ui.FilterAction))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0074: ARITH (r39v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r35v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007e: ARITH (r39v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008b: ARITH (32768 int) & (r39v0 int) A[WRAPPED]) != (0 int)) ? false : (r37v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0095: ARITH (r39v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.market.features.filter.ui.TypeOptionParams>, java.util.List<com.okinc.business.market.features.filter.domain.PriceRangeFilter>, java.lang.Integer, com.okinc.business.market.features.filter.domain.TokenFilter, com.okinc.business.market.features.filter.domain.TokenFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.ui.FilterSheetTrackParams, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.ui.FilterAction, com.okinc.business.market.features.filter.ui.FilterAction, boolean, boolean, boolean, boolean):void (m)] (LINE:36) call: com.okinc.business.market.features.filter.ui.FilterBottomSheetParams.<init>(java.lang.String, java.util.List, java.util.List, java.lang.Integer, com.okinc.business.market.features.filter.domain.TokenFilter, com.okinc.business.market.features.filter.domain.TokenFilter, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.ui.FilterSheetTrackParams, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.ui.FilterAction, com.okinc.business.market.features.filter.ui.FilterAction, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ FilterBottomSheetParams(String str, List list, List list2, Integer num, TokenFilter tokenFilter, TokenFilter tokenFilter2, String str2, String str3, FilterSheetTrackParams filterSheetTrackParams, String str4, String str5, FilterAction filterAction, FilterAction filterAction2, boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? null : num, tokenFilter, (i & 32) != 0 ? null : tokenFilter2, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? new FilterSheetTrackParams(null, null, 3, null) : filterSheetTrackParams, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : str5, (i & 2048) != 0 ? null : filterAction, (i & 4096) != 0 ? null : filterAction2, (i & 8192) != 0 ? true : z, (i & 16384) != 0 ? false : z2, (32768 & i) != 0 ? false : z3, (i & 65536) != 0 ? false : z4);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.filter.ui.FilterBottomSheetParams.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final FilterBottomSheetParams copydefault() {
            return FilterBottomSheetParams.EZpvd;
        }
    }
}
