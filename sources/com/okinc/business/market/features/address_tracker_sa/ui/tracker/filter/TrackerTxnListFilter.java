package com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TokenAgeType;
import com.okinc.business.market.data.constant.AddressTrackerUserAction;
import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerTxnListFilter implements Parcelable {
    public final String AYXKKw;
    public final PriceRangeFilter AhwBna;
    public final PriceRangeFilter EZpvd;
    public final boolean KWHzl;
    public final PriceRangeFilter copydefault;
    public final PriceRangeFilter djBIcL;
    public final PriceRangeFilter fetchVPNInfo;
    public final String gEmmrt;
    public final PriceRangeFilter valueOf;
    public final List<AddressTrackerUserAction> values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<TrackerTxnListFilter> CREATOR = new Creator();
    public static final List<Pair<String, String>> AEQbTJ = yDY.gEmmrt(new Pair("100", ">100"), new Pair("1000", ">1k"), new Pair("5000", ">5k"));

    public static final class Creator implements Parcelable.Creator<TrackerTxnListFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerTxnListFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<PriceRangeFilter> creator = PriceRangeFilter.CREATOR;
            PriceRangeFilter priceRangeFilterCreateFromParcel = creator.createFromParcel(parcel);
            PriceRangeFilter priceRangeFilterCreateFromParcel2 = creator.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AddressTrackerUserAction.valueOf(parcel.readString()));
            }
            Parcelable.Creator<PriceRangeFilter> creator2 = PriceRangeFilter.CREATOR;
            return new TrackerTxnListFilter(z, string, string2, priceRangeFilterCreateFromParcel, priceRangeFilterCreateFromParcel2, arrayList, creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel), creator2.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerTxnListFilter[] newArray(int i) {
            return new TrackerTxnListFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerTxnListFilter() {
        this(false, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter AhwBna() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerTxnListFilter copydefault(boolean z, @NotNull String str, @NotNull String str2, @NotNull PriceRangeFilter priceRangeFilter, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull List<? extends AddressTrackerUserAction> list, @NotNull PriceRangeFilter priceRangeFilter3, @NotNull PriceRangeFilter priceRangeFilter4, @NotNull PriceRangeFilter priceRangeFilter5, @NotNull PriceRangeFilter priceRangeFilter6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter5, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter6, "");
        return new TrackerTxnListFilter(z, str, str2, priceRangeFilter, priceRangeFilter2, list, priceRangeFilter3, priceRangeFilter4, priceRangeFilter5, priceRangeFilter6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter copydefault() {
        return this.djBIcL;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PriceRangeFilter djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerTxnListFilter)) {
            return false;
        }
        TrackerTxnListFilter trackerTxnListFilter = (TrackerTxnListFilter) obj;
        return this.KWHzl == trackerTxnListFilter.KWHzl && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) trackerTxnListFilter.AYXKKw) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) trackerTxnListFilter.gEmmrt) && Intrinsics.EZpvd(this.EZpvd, trackerTxnListFilter.EZpvd) && Intrinsics.EZpvd(this.copydefault, trackerTxnListFilter.copydefault) && Intrinsics.EZpvd(this.values, trackerTxnListFilter.values) && Intrinsics.EZpvd(this.fetchVPNInfo, trackerTxnListFilter.fetchVPNInfo) && Intrinsics.EZpvd(this.AhwBna, trackerTxnListFilter.AhwBna) && Intrinsics.EZpvd(this.valueOf, trackerTxnListFilter.valueOf) && Intrinsics.EZpvd(this.djBIcL, trackerTxnListFilter.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.KWHzl) * 31) + this.AYXKKw.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.values.hashCode()) * 31) + this.fetchVPNInfo.hashCode()) * 31) + this.AhwBna.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerTxnListFilter(isActivityFilter=" + this.KWHzl + ", type=" + this.AYXKKw + ", network=" + this.gEmmrt + ", buyAddresses=" + this.EZpvd + ", holderRange=" + this.copydefault + ", userActions=" + this.values + ", volumeRange=" + this.fetchVPNInfo + ", tokenAgeRange=" + this.AhwBna + ", marketCapRange=" + this.valueOf + ", liquidityRange=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.gEmmrt);
        this.EZpvd.writeToParcel(parcel, i);
        this.copydefault.writeToParcel(parcel, i);
        List<AddressTrackerUserAction> list = this.values;
        parcel.writeInt(list.size());
        Iterator<AddressTrackerUserAction> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        this.fetchVPNInfo.writeToParcel(parcel, i);
        this.AhwBna.writeToParcel(parcel, i);
        this.valueOf.writeToParcel(parcel, i);
        this.djBIcL.writeToParcel(parcel, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.List<? extends com.okinc.business.market.data.constant.AddressTrackerUserAction> */
    /* JADX WARN: Multi-variable type inference failed */
    public TrackerTxnListFilter(boolean z, @NotNull String str, @NotNull String str2, @NotNull PriceRangeFilter priceRangeFilter, @NotNull PriceRangeFilter priceRangeFilter2, @NotNull List<? extends AddressTrackerUserAction> list, @NotNull PriceRangeFilter priceRangeFilter3, @NotNull PriceRangeFilter priceRangeFilter4, @NotNull PriceRangeFilter priceRangeFilter5, @NotNull PriceRangeFilter priceRangeFilter6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter2, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter3, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter4, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter5, "");
        Intrinsics.checkNotNullParameter(priceRangeFilter6, "");
        this.KWHzl = z;
        this.AYXKKw = str;
        this.gEmmrt = str2;
        this.EZpvd = priceRangeFilter;
        this.copydefault = priceRangeFilter2;
        this.values = list;
        this.fetchVPNInfo = priceRangeFilter3;
        this.AhwBna = priceRangeFilter4;
        this.valueOf = priceRangeFilter5;
        this.djBIcL = priceRangeFilter6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e1: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r21v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("all") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r31v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : ("all"))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x001b: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002c: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r24v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0032: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0043: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r25v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0049: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r26v0 java.util.List))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0054: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0066: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:16) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r27v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x006c: ARITH (r31v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x007f: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (63 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:17) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r28v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x0085: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0099: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:18) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r29v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
  (wrap:com.okinc.business.market.features.filter.domain.PriceRangeFilter:?: TERNARY null = ((wrap:int:0x009f: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x00c5: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:com.okinc.business.market.common.constants.TokenAgeType:?: CAST (com.okinc.business.market.common.constants.TokenAgeType) (null com.okinc.business.market.common.constants.TokenAgeType))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (127 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:19) call: com.okinc.business.market.features.filter.domain.PriceRangeFilter.<init>(java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r30v0 com.okinc.business.market.features.filter.domain.PriceRangeFilter))
 A[MD:(boolean, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.util.List<? extends com.okinc.business.market.data.constant.AddressTrackerUserAction>, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter):void (m)] (LINE:9) call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter.<init>(boolean, java.lang.String, java.lang.String, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, java.util.List, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter, com.okinc.business.market.features.filter.domain.PriceRangeFilter):void type: THIS */
    public /* synthetic */ TrackerTxnListFilter(boolean z, String str, String str2, PriceRangeFilter priceRangeFilter, PriceRangeFilter priceRangeFilter2, List list, PriceRangeFilter priceRangeFilter3, PriceRangeFilter priceRangeFilter4, PriceRangeFilter priceRangeFilter5, PriceRangeFilter priceRangeFilter6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "all" : str, (i & 4) == 0 ? str2 : "all", (i & 8) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter, (i & 16) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter2, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null) : priceRangeFilter3, (i & 128) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null) : priceRangeFilter4, (i & 256) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter5, (i & 512) != 0 ? new PriceRangeFilter((String) null, (String) null, (TokenAgeType) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null) : priceRangeFilter6);
    }

    public final boolean fetchVPNInfo() {
        boolean z = Intrinsics.EZpvd((Object) this.gEmmrt, (Object) "all") && this.AhwBna.gEmmrt() && this.valueOf.gEmmrt() && this.djBIcL.gEmmrt() && this.copydefault.gEmmrt();
        if (this.KWHzl) {
            if (z && this.fetchVPNInfo.gEmmrt() && Intrinsics.EZpvd((Object) this.AYXKKw, (Object) "all")) {
                return true;
            }
        } else if (z && this.EZpvd.gEmmrt()) {
            return true;
        }
        return false;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker_sa.ui.tracker.filter.TrackerTxnListFilter.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final List<Pair<String, String>> EZpvd() {
            return TrackerTxnListFilter.AEQbTJ;
        }
    }
}
