package com.okinc.business.market.features.home.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.data.model.DefaultChainFilter;
import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import com.okinc.business.market.features.filter.domain.QuickFilterConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeTab implements Parcelable {
    public final DefaultChainFilter AEQbTJ;
    public final QuickFilterConfig AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final AdvancedFilter copydefault;
    public final String djBIcL;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<HomeTab> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HomeTab> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeTab createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HomeTab(parcel.readString(), parcel.readString(), AdvancedFilter.CREATOR.createFromParcel(parcel), DefaultChainFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : QuickFilterConfig.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeTab[] newArray(int i) {
            return new HomeTab[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTab() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HomeTab copy$default(HomeTab homeTab, String str, String str2, AdvancedFilter advancedFilter, DefaultChainFilter defaultChainFilter, QuickFilterConfig quickFilterConfig, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = homeTab.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = homeTab.KWHzl;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            advancedFilter = homeTab.copydefault;
        }
        AdvancedFilter advancedFilter2 = advancedFilter;
        if ((i & 8) != 0) {
            defaultChainFilter = homeTab.AEQbTJ;
        }
        DefaultChainFilter defaultChainFilter2 = defaultChainFilter;
        if ((i & 16) != 0) {
            quickFilterConfig = homeTab.AhwBna;
        }
        QuickFilterConfig quickFilterConfig2 = quickFilterConfig;
        if ((i & 32) != 0) {
            str3 = homeTab.djBIcL;
        }
        return homeTab.KWHzl(str, str4, advancedFilter2, defaultChainFilter2, quickFilterConfig2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedFilter AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuickFilterConfig AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTab KWHzl(@NotNull String str, @NotNull String str2, @NotNull AdvancedFilter advancedFilter, @NotNull DefaultChainFilter defaultChainFilter, QuickFilterConfig quickFilterConfig, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        Intrinsics.checkNotNullParameter(defaultChainFilter, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HomeTab(str, str2, advancedFilter, defaultChainFilter, quickFilterConfig, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefaultChainFilter copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof HomeTab)) {
            return false;
        }
        HomeTab homeTab = (HomeTab) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) homeTab.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) homeTab.KWHzl) && Intrinsics.EZpvd(this.copydefault, homeTab.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, homeTab.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, homeTab.AhwBna) && Intrinsics.EZpvd((Object) this.djBIcL, (Object) homeTab.djBIcL);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.EZpvd.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = this.copydefault.hashCode();
        int iHashCode4 = this.AEQbTJ.hashCode();
        QuickFilterConfig quickFilterConfig = this.AhwBna;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (quickFilterConfig == null ? 0 : quickFilterConfig.hashCode())) * 31) + this.djBIcL.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTab(key=" + this.EZpvd + ", name=" + this.KWHzl + ", defaultFilter=" + this.copydefault + ", defaultChainFilter=" + this.AEQbTJ + ", quickFilterConfig=" + this.AhwBna + ", pageFrom=" + this.djBIcL + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        this.copydefault.writeToParcel(parcel, i);
        this.AEQbTJ.writeToParcel(parcel, i);
        QuickFilterConfig quickFilterConfig = this.AhwBna;
        if (quickFilterConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            quickFilterConfig.writeToParcel(parcel, i);
        }
        parcel.writeString(this.djBIcL);
    }

    public HomeTab(@NotNull String str, @NotNull String str2, @NotNull AdvancedFilter advancedFilter, @NotNull DefaultChainFilter defaultChainFilter, QuickFilterConfig quickFilterConfig, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(advancedFilter, "");
        Intrinsics.checkNotNullParameter(defaultChainFilter, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.KWHzl = str2;
        this.copydefault = advancedFilter;
        this.AEQbTJ = defaultChainFilter;
        this.AhwBna = quickFilterConfig;
        this.djBIcL = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r49v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r49v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:com.okinc.business.market.features.filter.domain.AdvancedFilter:?: TERNARY null = ((wrap:int:0x0012: ARITH (r49v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0058: CONSTRUCTOR 
  (null com.okinc.business.market.common.constants.TimeIntervalType)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.common.constants.TimeIntervalType)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.common.constants.TimeIntervalType)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.common.constants.TimeIntervalType)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.common.constants.TimeIntervalType)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null com.okinc.business.market.common.constants.TokenAgeType)
  (null java.lang.String)
  (null java.lang.String)
  (0 int)
  false
  (null java.lang.String)
  (null java.lang.String)
  false
  (null com.okinc.business.market.common.constants.RankingType)
  (null com.okinc.business.market.common.constants.TimeIntervalType)
  false
  (null java.util.List)
  false
  (-1 int)
  (3 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingType, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:13) call: com.okinc.business.market.features.filter.domain.AdvancedFilter.<init>(com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TimeIntervalType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.TokenAgeType, java.lang.String, java.lang.String, int, boolean, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingType, com.okinc.business.market.common.constants.TimeIntervalType, boolean, java.util.List, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r45v0 com.okinc.business.market.features.filter.domain.AdvancedFilter))
  (wrap:com.okinc.business.market.data.model.DefaultChainFilter:?: TERNARY null = ((wrap:int:0x005e: ARITH (r49v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: CAST (com.okinc.business.market.common.constants.TimeIntervalType) (null com.okinc.business.market.common.constants.TimeIntervalType))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, boolean, com.okinc.business.market.common.constants.TimeIntervalType, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:14) call: com.okinc.business.market.data.model.DefaultChainFilter.<init>(java.lang.String, boolean, com.okinc.business.market.common.constants.TimeIntervalType, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r46v0 com.okinc.business.market.data.model.DefaultChainFilter))
  (wrap:com.okinc.business.market.features.filter.domain.QuickFilterConfig:?: TERNARY null = ((wrap:int:0x0070: ARITH (r49v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.features.filter.domain.QuickFilterConfig) : (r47v0 com.okinc.business.market.features.filter.domain.QuickFilterConfig))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0078: ARITH (r49v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r48v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.data.model.DefaultChainFilter, com.okinc.business.market.features.filter.domain.QuickFilterConfig, java.lang.String):void (m)] (LINE:10) call: com.okinc.business.market.features.home.domain.HomeTab.<init>(java.lang.String, java.lang.String, com.okinc.business.market.features.filter.domain.AdvancedFilter, com.okinc.business.market.data.model.DefaultChainFilter, com.okinc.business.market.features.filter.domain.QuickFilterConfig, java.lang.String):void type: THIS */
    public /* synthetic */ HomeTab(String str, String str2, AdvancedFilter advancedFilter, DefaultChainFilter defaultChainFilter, QuickFilterConfig quickFilterConfig, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new AdvancedFilter(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, false, null, null, false, null, null, false, null, false, -1, 3, null) : advancedFilter, (i & 8) != 0 ? new DefaultChainFilter((String) null, false, (TimeIntervalType) null, 7, (DefaultConstructorMarker) null) : defaultChainFilter, (i & 16) != 0 ? null : quickFilterConfig, (i & 32) == 0 ? str3 : "");
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.home.domain.HomeTab.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
