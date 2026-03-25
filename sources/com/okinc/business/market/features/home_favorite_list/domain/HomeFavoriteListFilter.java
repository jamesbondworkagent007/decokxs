package com.okinc.business.market.features.home_favorite_list.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C33070mpX;
import o.C52761wXj;
import o.C56392yDr;
import o.InterfaceC56387yDm;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeFavoriteListFilter implements Parcelable {
    public final List<HomeChainFilterUiModel> AhwBna;
    public final TimeIntervalType EZpvd;
    public final MarketChainBean KWHzl;
    public final String OLrzqt;
    public final RankingType djBIcL;
    public final boolean gEmmrt;
    public final int valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;
    public static final Parcelable.Creator<HomeFavoriteListFilter> CREATOR = new Creator();
    public static final InterfaceC56387yDm<HomeFavoriteListFilter> copydefault = C56392yDr.copydefault(new Function0() { // from class: o.kaK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return HomeFavoriteListFilter.KWHzl();
        }
    });

    public static final class Creator implements Parcelable.Creator<HomeFavoriteListFilter> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeFavoriteListFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            TimeIntervalType timeIntervalTypeValueOf = TimeIntervalType.valueOf(parcel.readString());
            RankingType rankingTypeValueOf = RankingType.valueOf(parcel.readString());
            boolean z = parcel.readInt() != 0;
            MarketChainBean marketChainBeanCreateFromParcel = MarketChainBean.CREATOR.createFromParcel(parcel);
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(HomeChainFilterUiModel.CREATOR.createFromParcel(parcel));
            }
            return new HomeFavoriteListFilter(string, i, timeIntervalTypeValueOf, rankingTypeValueOf, z, marketChainBeanCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeFavoriteListFilter[] newArray(int i) {
            return new HomeFavoriteListFilter[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeFavoriteListFilter() {
        this(null, 0, null, null, false, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeFavoriteListFilter copy$default(HomeFavoriteListFilter homeFavoriteListFilter, String str, int i, TimeIntervalType timeIntervalType, RankingType rankingType, boolean z, MarketChainBean marketChainBean, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = homeFavoriteListFilter.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = homeFavoriteListFilter.valueOf;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            timeIntervalType = homeFavoriteListFilter.EZpvd;
        }
        TimeIntervalType timeIntervalType2 = timeIntervalType;
        if ((i2 & 8) != 0) {
            rankingType = homeFavoriteListFilter.djBIcL;
        }
        RankingType rankingType2 = rankingType;
        if ((i2 & 16) != 0) {
            z = homeFavoriteListFilter.gEmmrt;
        }
        boolean z2 = z;
        if ((i2 & 32) != 0) {
            marketChainBean = homeFavoriteListFilter.KWHzl;
        }
        MarketChainBean marketChainBean2 = marketChainBean;
        if ((i2 & 64) != 0) {
            list = homeFavoriteListFilter.AhwBna;
        }
        return homeFavoriteListFilter.KWHzl(str, i3, timeIntervalType2, rankingType2, z2, marketChainBean2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<HomeChainFilterUiModel> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeFavoriteListFilter KWHzl(@NotNull String str, int i, @NotNull TimeIntervalType timeIntervalType, @NotNull RankingType rankingType, boolean z, @NotNull MarketChainBean marketChainBean, @NotNull List<HomeChainFilterUiModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeFavoriteListFilter(str, i, timeIntervalType, rankingType, z, marketChainBean, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketChainBean copydefault() {
        return this.KWHzl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType djBIcL() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeFavoriteListFilter)) {
            return false;
        }
        HomeFavoriteListFilter homeFavoriteListFilter = (HomeFavoriteListFilter) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) homeFavoriteListFilter.OLrzqt) && this.valueOf == homeFavoriteListFilter.valueOf && this.EZpvd == homeFavoriteListFilter.EZpvd && this.djBIcL == homeFavoriteListFilter.djBIcL && this.gEmmrt == homeFavoriteListFilter.gEmmrt && Intrinsics.EZpvd(this.KWHzl, homeFavoriteListFilter.KWHzl) && Intrinsics.EZpvd(this.AhwBna, homeFavoriteListFilter.AhwBna);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.OLrzqt.hashCode() * 31) + Integer.hashCode(this.valueOf)) * 31) + this.EZpvd.hashCode()) * 31) + this.djBIcL.hashCode()) * 31) + Boolean.hashCode(this.gEmmrt)) * 31) + this.KWHzl.hashCode()) * 31) + this.AhwBna.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeFavoriteListFilter(chainId=" + this.OLrzqt + ", selectedGroupId=" + this.valueOf + ", interval=" + this.EZpvd + ", rankingType=" + this.djBIcL + ", isDesc=" + this.gEmmrt + ", displayChain=" + this.KWHzl + ", quickPickGroupOptions=" + this.AhwBna + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingType valueOf() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.valueOf);
        parcel.writeString(this.EZpvd.name());
        parcel.writeString(this.djBIcL.name());
        parcel.writeInt(this.gEmmrt ? 1 : 0);
        this.KWHzl.writeToParcel(parcel, i);
        List<HomeChainFilterUiModel> list = this.AhwBna;
        parcel.writeInt(list.size());
        Iterator<HomeChainFilterUiModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public HomeFavoriteListFilter(@NotNull String str, int i, @NotNull TimeIntervalType timeIntervalType, @NotNull RankingType rankingType, boolean z, @NotNull MarketChainBean marketChainBean, @NotNull List<HomeChainFilterUiModel> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(rankingType, "");
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = str;
        this.valueOf = i;
        this.EZpvd = timeIntervalType;
        this.djBIcL = rankingType;
        this.gEmmrt = z;
        this.KWHzl = marketChainBean;
        this.AhwBna = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0069: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r27v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("-100") : (r20v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0009: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r21v0 int))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0011: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] (LINE:17) com.okinc.business.market.common.constants.TimeIntervalType.TWENTY_FOUR_HOUR com.okinc.business.market.common.constants.TimeIntervalType) : (r22v0 com.okinc.business.market.common.constants.TimeIntervalType))
  (wrap:com.okinc.business.market.common.constants.RankingType:?: TERNARY null = ((wrap:int:0x001a: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001e: SGET  A[WRAPPED] (LINE:18) com.okinc.business.market.common.constants.RankingType.DEFAULT com.okinc.business.market.common.constants.RankingType) : (r23v0 com.okinc.business.market.common.constants.RankingType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r24v0 boolean))
  (wrap:com.okinc.business.dexlogic.main.market.chain.MarketChainBean:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0048: CONSTRUCTOR 
  ("-100")
  (wrap:java.lang.String:0x0031: INVOKE (wrap:int:0x002f: SGET  A[WRAPPED] (LINE:20) o.hvD.Fragment.RKcVTr int) STATIC call: o.mpX.AYXKKw(int):java.lang.String A[MD:(int):java.lang.String (m), WRAPPED] (LINE:22))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:int:0x0035: SGET  A[WRAPPED] o.wXj.TaskDescription.cancel int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (892 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:20) call: com.okinc.business.dexlogic.main.market.chain.MarketChainBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r25v0 com.okinc.business.dexlogic.main.market.chain.MarketChainBean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x004e: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0052: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:25)) : (r26v0 java.util.List))
 A[MD:(java.lang.String, int, com.okinc.business.market.common.constants.TimeIntervalType, com.okinc.business.market.common.constants.RankingType, boolean, com.okinc.business.dexlogic.main.market.chain.MarketChainBean, java.util.List<com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel>):void (m)] (LINE:14) call: com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter.<init>(java.lang.String, int, com.okinc.business.market.common.constants.TimeIntervalType, com.okinc.business.market.common.constants.RankingType, boolean, com.okinc.business.dexlogic.main.market.chain.MarketChainBean, java.util.List):void type: THIS */
    public /* synthetic */ HomeFavoriteListFilter(String str, int i, TimeIntervalType timeIntervalType, RankingType rankingType, boolean z, MarketChainBean marketChainBean, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "-100" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? TimeIntervalType.TWENTY_FOUR_HOUR : timeIntervalType, (i2 & 8) != 0 ? RankingType.DEFAULT : rankingType, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? new MarketChainBean("-100", C33070mpX.AYXKKw(C23274hvD.Fragment.RKcVTr), (String) null, (String) null, (String) null, false, (String) null, C52761wXj.TaskDescription.cancel, (String) null, false, 892, (DefaultConstructorMarker) null) : marketChainBean, (i2 & 64) != 0 ? yDY.AhwBna() : list);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final HomeFavoriteListFilter KWHzl() {
            return (HomeFavoriteListFilter) HomeFavoriteListFilter.copydefault.getValue();
        }

        public final boolean EZpvd(@NotNull HomeFavoriteListFilter homeFavoriteListFilter) {
            Intrinsics.checkNotNullParameter(homeFavoriteListFilter, "");
            return Intrinsics.EZpvd((Object) homeFavoriteListFilter.OLrzqt(), (Object) KWHzl().OLrzqt()) && homeFavoriteListFilter.djBIcL() == TimeIntervalType.TWENTY_FOUR_HOUR;
        }

        public final boolean copydefault(@NotNull HomeFavoriteListFilter homeFavoriteListFilter) {
            Intrinsics.checkNotNullParameter(homeFavoriteListFilter, "");
            return Intrinsics.EZpvd((Object) homeFavoriteListFilter.OLrzqt(), (Object) KWHzl().OLrzqt());
        }
    }

    public static final HomeFavoriteListFilter KWHzl() {
        return new HomeFavoriteListFilter(null, 0, null, null, false, null, null, 127, null);
    }
}
