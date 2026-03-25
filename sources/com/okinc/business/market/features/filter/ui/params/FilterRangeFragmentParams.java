package com.okinc.business.market.features.filter.ui.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.RangeType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.ui.params.FilterRangeFragmentParams;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23272hvB;
import o.C31256lqb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FilterRangeFragmentParams implements Parcelable {
    public final String AEQbTJ;
    public final TimeIntervalType AhwBna;
    public final AdvancedFilter EZpvd;
    public final AdvancedFilter KWHzl;
    public final FilterConfig copydefault;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<FilterRangeFragmentParams> CREATOR = new Creator();

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[RangeType.values().length];
            try {
                iArr[RangeType.MARKET_CAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RangeType.LIQUIDITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RangeType.TURNOVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RangeType.TIME_CREATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RangeType.CHANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RangeType.UNIQUE_TRADER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RangeType.HOLDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[RangeType.TRANSACTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[RangeType.TIME_VOLUME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            OLrzqt = iArr;
        }
    }

    public static final class Creator implements Parcelable.Creator<FilterRangeFragmentParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterRangeFragmentParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FilterRangeFragmentParams(parcel.readInt() == 0 ? null : AdvancedFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdvancedFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FilterConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TimeIntervalType.valueOf(parcel.readString()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterRangeFragmentParams[] newArray(int i) {
            return new FilterRangeFragmentParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FilterRangeFragmentParams() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FilterRangeFragmentParams copy$default(FilterRangeFragmentParams filterRangeFragmentParams, AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, TimeIntervalType timeIntervalType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            advancedFilter = filterRangeFragmentParams.KWHzl;
        }
        if ((i & 2) != 0) {
            advancedFilter2 = filterRangeFragmentParams.EZpvd;
        }
        AdvancedFilter advancedFilter3 = advancedFilter2;
        if ((i & 4) != 0) {
            filterConfig = filterRangeFragmentParams.copydefault;
        }
        FilterConfig filterConfig2 = filterConfig;
        if ((i & 8) != 0) {
            timeIntervalType = filterRangeFragmentParams.AhwBna;
        }
        TimeIntervalType timeIntervalType2 = timeIntervalType;
        if ((i & 16) != 0) {
            str = filterRangeFragmentParams.AEQbTJ;
        }
        return filterRangeFragmentParams.copydefault(advancedFilter, advancedFilter3, filterConfig2, timeIntervalType2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType copydefault() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FilterRangeFragmentParams copydefault(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, TimeIntervalType timeIntervalType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FilterRangeFragmentParams(advancedFilter, advancedFilter2, filterConfig, timeIntervalType, str);
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
        if (!(obj instanceof FilterRangeFragmentParams)) {
            return false;
        }
        FilterRangeFragmentParams filterRangeFragmentParams = (FilterRangeFragmentParams) obj;
        return Intrinsics.EZpvd(this.KWHzl, filterRangeFragmentParams.KWHzl) && Intrinsics.EZpvd(this.EZpvd, filterRangeFragmentParams.EZpvd) && Intrinsics.EZpvd(this.copydefault, filterRangeFragmentParams.copydefault) && this.AhwBna == filterRangeFragmentParams.AhwBna && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) filterRangeFragmentParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        AdvancedFilter advancedFilter = this.KWHzl;
        int iHashCode = advancedFilter == null ? 0 : advancedFilter.hashCode();
        AdvancedFilter advancedFilter2 = this.EZpvd;
        int iHashCode2 = advancedFilter2 == null ? 0 : advancedFilter2.hashCode();
        FilterConfig filterConfig = this.copydefault;
        int iHashCode3 = filterConfig == null ? 0 : filterConfig.hashCode();
        TimeIntervalType timeIntervalType = this.AhwBna;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (timeIntervalType != null ? timeIntervalType.hashCode() : 0)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FilterRangeFragmentParams(advancedFilter=" + this.KWHzl + ", defaultAdvancedFilter=" + this.EZpvd + ", filterConfig=" + this.copydefault + ", timeIntervalType=" + this.AhwBna + ", rankingName=" + this.AEQbTJ + ")";
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
        FilterConfig filterConfig = this.copydefault;
        if (filterConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filterConfig.writeToParcel(parcel, i);
        }
        TimeIntervalType timeIntervalType = this.AhwBna;
        if (timeIntervalType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeIntervalType.name());
        }
        parcel.writeString(this.AEQbTJ);
    }

    public FilterRangeFragmentParams(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, TimeIntervalType timeIntervalType, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = advancedFilter;
        this.EZpvd = advancedFilter2;
        this.copydefault = filterConfig;
        this.AhwBna = timeIntervalType;
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0028: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.filter.domain.AdvancedFilter:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.AdvancedFilter) : (r4v0 com.okinc.business.market.features.filter.domain.AdvancedFilter))
  (wrap:com.okinc.business.market.features.filter.domain.AdvancedFilter:?: TERNARY null = ((wrap:int:0x0008: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.AdvancedFilter) : (r5v0 com.okinc.business.market.features.filter.domain.AdvancedFilter))
  (wrap:com.okinc.business.market.features.filter.ui.params.FilterConfig:?: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.ui.params.FilterConfig) : (r6v0 com.okinc.business.market.features.filter.ui.params.FilterConfig))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 com.okinc.business.market.common.constants.TimeIntervalType) : (null com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
 A[MD:(com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.ui.params.FilterConfig, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String):void (m)] (LINE:13) call: com.okinc.business.market.features.filter.ui.params.FilterRangeFragmentParams.<init>(com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.features.filter.ui.params.FilterConfig, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String):void type: THIS */
    public /* synthetic */ FilterRangeFragmentParams(AdvancedFilter advancedFilter, AdvancedFilter advancedFilter2, FilterConfig filterConfig, TimeIntervalType timeIntervalType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : advancedFilter, (i & 2) != 0 ? null : advancedFilter2, (i & 4) != 0 ? null : filterConfig, (i & 8) == 0 ? timeIntervalType : null, (i & 16) != 0 ? "" : str);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.filter.ui.params.FilterRangeFragmentParams.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final List<PriceRangeFilter> EZpvd(@NotNull RangeType rangeType) {
        List<PriceRangeFilter> listKWHzl;
        Intrinsics.checkNotNullParameter(rangeType, "");
        int i = Activity.OLrzqt[rangeType.ordinal()];
        if (i == 1) {
            FilterConfig filterConfig = this.copydefault;
            listKWHzl = filterConfig != null ? filterConfig.KWHzl() : null;
            if (listKWHzl == null) {
                return yDY.AhwBna();
            }
        } else if (i == 2) {
            FilterConfig filterConfig2 = this.copydefault;
            listKWHzl = filterConfig2 != null ? filterConfig2.EZpvd() : null;
            if (listKWHzl == null) {
                return yDY.AhwBna();
            }
        } else if (i == 3) {
            FilterConfig filterConfig3 = this.copydefault;
            listKWHzl = filterConfig3 != null ? filterConfig3.OLrzqt() : null;
            if (listKWHzl == null) {
                return yDY.AhwBna();
            }
        } else if (i == 4) {
            FilterConfig filterConfig4 = this.copydefault;
            listKWHzl = filterConfig4 != null ? filterConfig4.copydefault() : null;
            if (listKWHzl == null) {
                return yDY.AhwBna();
            }
        } else {
            return yDY.AhwBna();
        }
        return listKWHzl;
    }

    public final PriceRangeFilter AEQbTJ(@NotNull RangeType rangeType, final AdvancedFilter advancedFilter) {
        Intrinsics.checkNotNullParameter(rangeType, "");
        switch (Activity.OLrzqt[rangeType.ordinal()]) {
            case 1:
                String strAkhnZx = advancedFilter != null ? advancedFilter.AkhnZx() : null;
                String str = strAkhnZx == null ? "" : strAkhnZx;
                String strDbNXlk = advancedFilter != null ? advancedFilter.DbNXlk() : null;
                return new PriceRangeFilter(str, strDbNXlk == null ? "" : strDbNXlk, (TokenAgeType) null, (String) null, C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.AkhnZx() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVJ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.AkhnZx(advancedFilter, (java.lang.String) obj);
                    }
                }), C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.DbNXlk() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVO
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.fetchVPNInfo(advancedFilter, (java.lang.String) obj);
                    }
                }), false, 76, (DefaultConstructorMarker) null);
            case 2:
                String strValues = advancedFilter != null ? advancedFilter.values() : null;
                String str2 = strValues == null ? "" : strValues;
                String strDjBIcL = advancedFilter != null ? advancedFilter.djBIcL() : null;
                return new PriceRangeFilter(str2, strDjBIcL == null ? "" : strDjBIcL, (TokenAgeType) null, (String) null, C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.values() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVS
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.values(advancedFilter, (java.lang.String) obj);
                    }
                }), C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.djBIcL() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVQ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.isConnected(advancedFilter, (java.lang.String) obj);
                    }
                }), false, 76, (DefaultConstructorMarker) null);
            case 3:
                String strSSMYrx = advancedFilter != null ? advancedFilter.sSMYrx() : null;
                String str3 = strSSMYrx == null ? "" : strSSMYrx;
                String strAxsJAY = advancedFilter != null ? advancedFilter.AxsJAY() : null;
                return new PriceRangeFilter(str3, strAxsJAY == null ? "" : strAxsJAY, (TokenAgeType) null, (String) null, C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.sSMYrx() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVP
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.DbNXlk(advancedFilter, (java.lang.String) obj);
                    }
                }), C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.AxsJAY() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVR
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.fJNWhG(advancedFilter, (java.lang.String) obj);
                    }
                }), false, 76, (DefaultConstructorMarker) null);
            case 4:
                String strFIwbmz = advancedFilter != null ? advancedFilter.fIwbmz() : null;
                String str4 = strFIwbmz == null ? "" : strFIwbmz;
                String strAuCTel = advancedFilter != null ? advancedFilter.AuCTel() : null;
                return new PriceRangeFilter(str4, strAuCTel == null ? "" : strAuCTel, advancedFilter != null ? advancedFilter.hDKMBd() : null, (String) null, (String) null, (String) null, false, 120, (DefaultConstructorMarker) null);
            case 5:
                String strOLrzqt = advancedFilter != null ? advancedFilter.OLrzqt() : null;
                String str5 = strOLrzqt == null ? "" : strOLrzqt;
                String strKWHzl = advancedFilter != null ? advancedFilter.KWHzl() : null;
                return new PriceRangeFilter(str5, strKWHzl == null ? "" : strKWHzl, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 124, (DefaultConstructorMarker) null);
            case 6:
                String strAubY = advancedFilter != null ? advancedFilter.AubY() : null;
                String str6 = strAubY == null ? "" : strAubY;
                String strAuCTelauCTel = advancedFilter != null ? advancedFilter.AuCTelauCTel() : null;
                return new PriceRangeFilter(str6, strAuCTelauCTel == null ? "" : strAuCTelauCTel, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 124, (DefaultConstructorMarker) null);
            case 7:
                String strAhwBna = advancedFilter != null ? advancedFilter.AhwBna() : null;
                String str7 = strAhwBna == null ? "" : strAhwBna;
                String strAYXKKw = advancedFilter != null ? advancedFilter.AYXKKw() : null;
                return new PriceRangeFilter(str7, strAYXKKw == null ? "" : strAYXKKw, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 124, (DefaultConstructorMarker) null);
            case 8:
                String strZsXlph = advancedFilter != null ? advancedFilter.zsXlph() : null;
                String str8 = strZsXlph == null ? "" : strZsXlph;
                String fieldNames = advancedFilter != null ? advancedFilter.getFieldNames() : null;
                return new PriceRangeFilter(str8, fieldNames == null ? "" : fieldNames, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 124, (DefaultConstructorMarker) null);
            case 9:
                String newProxyInstance = advancedFilter != null ? advancedFilter.getNewProxyInstance() : null;
                String str9 = newProxyInstance == null ? "" : newProxyInstance;
                String strUzCIH = advancedFilter != null ? advancedFilter.uzCIH() : null;
                return new PriceRangeFilter(str9, strUzCIH == null ? "" : strUzCIH, (TokenAgeType) null, (String) null, C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.getNewProxyInstance() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.AuCTel(advancedFilter, (java.lang.String) obj);
                    }
                }), C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.uzCIH() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVW
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.ejfBZ(advancedFilter, (java.lang.String) obj);
                    }
                }), false, 76, (DefaultConstructorMarker) null);
            default:
                String strValueOf = advancedFilter != null ? advancedFilter.valueOf() : null;
                String str10 = strValueOf == null ? "" : strValueOf;
                String strGEmmrt = advancedFilter != null ? advancedFilter.gEmmrt() : null;
                return new PriceRangeFilter(str10, strGEmmrt == null ? "" : strGEmmrt, (TokenAgeType) null, (String) null, C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.valueOf() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVX
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.fARcdN(advancedFilter, (java.lang.String) obj);
                    }
                }), C31256lqb.AEQbTJ(advancedFilter != null ? advancedFilter.gEmmrt() : null, (Function1<? super String, String>) new Function1() { // from class: o.jVT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return FilterRangeFragmentParams.fIwbmz(advancedFilter, (java.lang.String) obj);
                    }
                }), false, 76, (DefaultConstructorMarker) null);
        }
    }

    public static final String AkhnZx(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strAkhnZx = advancedFilter != null ? advancedFilter.AkhnZx() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strAkhnZx != null ? strAkhnZx : "", null, 2, null);
    }

    public static final String fetchVPNInfo(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strDbNXlk = advancedFilter != null ? advancedFilter.DbNXlk() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strDbNXlk != null ? strDbNXlk : "", null, 2, null);
    }

    public static final String values(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strValues = advancedFilter != null ? advancedFilter.values() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strValues != null ? strValues : "", null, 2, null);
    }

    public static final String isConnected(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strDjBIcL = advancedFilter != null ? advancedFilter.djBIcL() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strDjBIcL != null ? strDjBIcL : "", null, 2, null);
    }

    public static final String DbNXlk(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strSSMYrx = advancedFilter != null ? advancedFilter.sSMYrx() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strSSMYrx != null ? strSSMYrx : "", null, 2, null);
    }

    public static final String fJNWhG(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strAxsJAY = advancedFilter != null ? advancedFilter.AxsJAY() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strAxsJAY != null ? strAxsJAY : "", null, 2, null);
    }

    public static final String AuCTel(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String newProxyInstance = advancedFilter != null ? advancedFilter.getNewProxyInstance() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, newProxyInstance != null ? newProxyInstance : "", null, 2, null);
    }

    public static final String ejfBZ(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strUzCIH = advancedFilter != null ? advancedFilter.uzCIH() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strUzCIH != null ? strUzCIH : "", null, 2, null);
    }

    public static final String fARcdN(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strValueOf = advancedFilter != null ? advancedFilter.valueOf() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strValueOf != null ? strValueOf : "", null, 2, null);
    }

    public static final String fIwbmz(AdvancedFilter advancedFilter, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        String strGEmmrt = advancedFilter != null ? advancedFilter.gEmmrt() : null;
        return C23272hvB.getShowOriginData$default(c23272hvB, strGEmmrt != null ? strGEmmrt : "", null, 2, null);
    }
}
