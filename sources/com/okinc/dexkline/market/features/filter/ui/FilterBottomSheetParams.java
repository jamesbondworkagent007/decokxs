package com.okinc.dexkline.market.features.filter.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.StringRes;
import com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter;
import com.okinc.dexkline.market.features.filter.domain.TokenFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class FilterBottomSheetParams implements Parcelable {
    public final boolean AEQbTJ;
    public final TokenFilter AYXKKw;
    public final boolean AhwBna;
    public final FilterAction AkhnZx;
    public final FilterSheetTrackParams AuCTel;
    public final String DbNXlk;
    public final String EZpvd;
    public final TokenFilter OLrzqt;
    public final boolean djBIcL;
    public final String ejfBZ;
    public final String fARcdN;
    public final List<TypeOptionParams> fIwbmz;
    public final Integer fJNWhG;
    public final FilterAction fetchVPNInfo;
    public final boolean gEmmrt;
    public final String isConnected;
    public final List<PriceRangeFilter> valueOf;
    public final boolean values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final Parcelable.Creator<FilterBottomSheetParams> CREATOR = new Creator();
    public static final FilterBottomSheetParams KWHzl = new FilterBottomSheetParams(null, null, null, null, new TokenFilter(null, null, null, null, null, false, false, null, false, false, null, null, null, null, 16383, null), null, null, null, null, false, null, null, null, null, false, false, false, false, 262127, null);

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
            return new FilterBottomSheetParams(string, arrayList, arrayList2, numValueOf, creator.createFromParcel(parcel), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), FilterSheetTrackParams.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString(), parcel.readString(), (FilterAction) parcel.readParcelable(FilterBottomSheetParams.class.getClassLoader()), (FilterAction) parcel.readParcelable(FilterBottomSheetParams.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
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
    public final boolean AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterAction AYXKKw() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TypeOptionParams> DbNXlk() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterBottomSheetParams EZpvd(@NotNull String str, @NotNull List<TypeOptionParams> list, @NotNull List<PriceRangeFilter> list2, @StringRes Integer num, @NotNull TokenFilter tokenFilter, TokenFilter tokenFilter2, @NotNull String str2, @NotNull String str3, @NotNull FilterSheetTrackParams filterSheetTrackParams, boolean z, String str4, String str5, FilterAction filterAction, FilterAction filterAction2, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(filterSheetTrackParams, "");
        return new FilterBottomSheetParams(str, list, list2, num, tokenFilter, tokenFilter2, str2, str3, filterSheetTrackParams, z, str4, str5, filterAction, filterAction2, z2, z3, z4, z5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenFilter OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PriceRangeFilter> djBIcL() {
        return this.valueOf;
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
        return Intrinsics.EZpvd((Object) this.fARcdN, (Object) filterBottomSheetParams.fARcdN) && Intrinsics.EZpvd(this.fIwbmz, filterBottomSheetParams.fIwbmz) && Intrinsics.EZpvd(this.valueOf, filterBottomSheetParams.valueOf) && Intrinsics.EZpvd(this.fJNWhG, filterBottomSheetParams.fJNWhG) && Intrinsics.EZpvd(this.OLrzqt, filterBottomSheetParams.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, filterBottomSheetParams.AYXKKw) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) filterBottomSheetParams.ejfBZ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) filterBottomSheetParams.EZpvd) && Intrinsics.EZpvd(this.AuCTel, filterBottomSheetParams.AuCTel) && this.values == filterBottomSheetParams.values && Intrinsics.EZpvd((Object) this.isConnected, (Object) filterBottomSheetParams.isConnected) && Intrinsics.EZpvd((Object) this.DbNXlk, (Object) filterBottomSheetParams.DbNXlk) && Intrinsics.EZpvd(this.fetchVPNInfo, filterBottomSheetParams.fetchVPNInfo) && Intrinsics.EZpvd(this.AkhnZx, filterBottomSheetParams.AkhnZx) && this.gEmmrt == filterBottomSheetParams.gEmmrt && this.AEQbTJ == filterBottomSheetParams.AEQbTJ && this.djBIcL == filterBottomSheetParams.djBIcL && this.AhwBna == filterBottomSheetParams.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fIwbmz() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterAction gEmmrt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.fARcdN.hashCode();
        int iHashCode2 = this.fIwbmz.hashCode();
        int iHashCode3 = this.valueOf.hashCode();
        Integer num = this.fJNWhG;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.OLrzqt.hashCode();
        TokenFilter tokenFilter = this.AYXKKw;
        int iHashCode6 = tokenFilter == null ? 0 : tokenFilter.hashCode();
        int iHashCode7 = this.ejfBZ.hashCode();
        int iHashCode8 = this.EZpvd.hashCode();
        int iHashCode9 = this.AuCTel.hashCode();
        int iHashCode10 = Boolean.hashCode(this.values);
        String str = this.isConnected;
        int iHashCode11 = str == null ? 0 : str.hashCode();
        String str2 = this.DbNXlk;
        int iHashCode12 = str2 == null ? 0 : str2.hashCode();
        FilterAction filterAction = this.fetchVPNInfo;
        int iHashCode13 = filterAction == null ? 0 : filterAction.hashCode();
        FilterAction filterAction2 = this.AkhnZx;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (filterAction2 != null ? filterAction2.hashCode() : 0)) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConnected() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterBottomSheetParams(title=" + this.fARcdN + ", typeOptions=" + this.fIwbmz + ", priceRangeOptions=" + this.valueOf + ", typeTitle=" + this.fJNWhG + ", defaultFilter=" + this.OLrzqt + ", presetFilter=" + this.AYXKKw + ", tokenSymbol=" + this.ejfBZ + ", chainName=" + this.EZpvd + ", trackParams=" + this.AuCTel + ", showTitleBackView=" + this.values + ", primaryBtnTitle=" + this.isConnected + ", secondaryBtnTitle=" + this.DbNXlk + ", primaryAction=" + this.fetchVPNInfo + ", secondaryAction=" + this.AkhnZx + ", ignoreSameFilter=" + this.gEmmrt + ", autoApplyPriceSelect=" + this.AEQbTJ + ", isFromTracker=" + this.djBIcL + ", isFromHistory=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterSheetTrackParams values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fARcdN);
        List<TypeOptionParams> list = this.fIwbmz;
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
        Integer num = this.fJNWhG;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.OLrzqt.writeToParcel(parcel, i);
        TokenFilter tokenFilter = this.AYXKKw;
        if (tokenFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tokenFilter.writeToParcel(parcel, i);
        }
        parcel.writeString(this.ejfBZ);
        parcel.writeString(this.EZpvd);
        this.AuCTel.writeToParcel(parcel, i);
        parcel.writeInt(this.values ? 1 : 0);
        parcel.writeString(this.isConnected);
        parcel.writeString(this.DbNXlk);
        parcel.writeParcelable(this.fetchVPNInfo, i);
        parcel.writeParcelable(this.AkhnZx, i);
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeInt(this.AhwBna ? 1 : 0);
    }

    public FilterBottomSheetParams(@NotNull String str, @NotNull List<TypeOptionParams> list, @NotNull List<PriceRangeFilter> list2, @StringRes Integer num, @NotNull TokenFilter tokenFilter, TokenFilter tokenFilter2, @NotNull String str2, @NotNull String str3, @NotNull FilterSheetTrackParams filterSheetTrackParams, boolean z, String str4, String str5, FilterAction filterAction, FilterAction filterAction2, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(tokenFilter, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(filterSheetTrackParams, "");
        this.fARcdN = str;
        this.fIwbmz = list;
        this.valueOf = list2;
        this.fJNWhG = num;
        this.OLrzqt = tokenFilter;
        this.AYXKKw = tokenFilter2;
        this.ejfBZ = str2;
        this.EZpvd = str3;
        this.AuCTel = filterSheetTrackParams;
        this.values = z;
        this.isConnected = str4;
        this.DbNXlk = str5;
        this.fetchVPNInfo = filterAction;
        this.AkhnZx = filterAction2;
        this.gEmmrt = z2;
        this.AEQbTJ = z3;
        this.djBIcL = z4;
        this.AhwBna = z5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ab: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000c: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:31)) : (r24v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:32)) : (r25v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0024: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (r27v0 com.okinc.dexkline.market.features.filter.domain.TokenFilter)
  (wrap:com.okinc.dexkline.market.features.filter.domain.TokenFilter:?: TERNARY null = ((wrap:int:0x002d: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.features.filter.domain.TokenFilter) : (r28v0 com.okinc.dexkline.market.features.filter.domain.TokenFilter))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.features.filter.ui.FilterSheetTrackParams:?: TERNARY null = ((wrap:int:0x0045: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004f: CONSTRUCTOR 
  (null java.lang.String)
  (null com.okinc.dexkline.market.features.filter.ui.CommonTrackData)
  (3 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, com.okinc.dexkline.market.features.filter.ui.CommonTrackData, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:39) call: com.okinc.dexkline.market.features.filter.ui.FilterSheetTrackParams.<init>(java.lang.String, com.okinc.dexkline.market.features.filter.ui.CommonTrackData, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r31v0 com.okinc.dexkline.market.features.filter.ui.FilterSheetTrackParams))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:com.okinc.dexkline.market.features.filter.ui.FilterAction:?: TERNARY null = ((wrap:int:0x006c: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.features.filter.ui.FilterAction) : (r35v0 com.okinc.dexkline.market.features.filter.ui.FilterAction))
  (wrap:com.okinc.dexkline.market.features.filter.ui.FilterAction:?: TERNARY null = ((wrap:int:0x0075: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.dexkline.market.features.filter.ui.FilterAction) : (r36v0 com.okinc.dexkline.market.features.filter.ui.FilterAction))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007e: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? true : (r37v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008b: ARITH (32768 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? false : (r38v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0095: ARITH (65536 int) & (r41v0 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x009f: ARITH (r41v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
 A[MD:(java.lang.String, java.util.List<com.okinc.dexkline.market.features.filter.ui.TypeOptionParams>, java.util.List<com.okinc.dexkline.market.features.filter.domain.PriceRangeFilter>, java.lang.Integer, com.okinc.dexkline.market.features.filter.domain.TokenFilter, com.okinc.dexkline.market.features.filter.domain.TokenFilter, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.filter.ui.FilterSheetTrackParams, boolean, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.filter.ui.FilterAction, com.okinc.dexkline.market.features.filter.ui.FilterAction, boolean, boolean, boolean, boolean):void (m)] (LINE:29) call: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheetParams.<init>(java.lang.String, java.util.List, java.util.List, java.lang.Integer, com.okinc.dexkline.market.features.filter.domain.TokenFilter, com.okinc.dexkline.market.features.filter.domain.TokenFilter, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.filter.ui.FilterSheetTrackParams, boolean, java.lang.String, java.lang.String, com.okinc.dexkline.market.features.filter.ui.FilterAction, com.okinc.dexkline.market.features.filter.ui.FilterAction, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ FilterBottomSheetParams(String str, List list, List list2, Integer num, TokenFilter tokenFilter, TokenFilter tokenFilter2, String str2, String str3, FilterSheetTrackParams filterSheetTrackParams, boolean z, String str4, String str5, FilterAction filterAction, FilterAction filterAction2, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2, (i & 8) != 0 ? null : num, tokenFilter, (i & 32) != 0 ? null : tokenFilter2, (i & 64) != 0 ? "" : str2, (i & 128) != 0 ? "" : str3, (i & 256) != 0 ? new FilterSheetTrackParams(null, null, 3, null) : filterSheetTrackParams, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : str4, (i & 2048) != 0 ? null : str5, (i & 4096) != 0 ? null : filterAction, (i & 8192) != 0 ? null : filterAction2, (i & 16384) != 0 ? true : z2, (32768 & i) != 0 ? false : z3, (65536 & i) != 0 ? false : z4, (i & 131072) != 0 ? false : z5);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.features.filter.ui.FilterBottomSheetParams.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final FilterBottomSheetParams EZpvd() {
            return FilterBottomSheetParams.KWHzl;
        }
    }
}
