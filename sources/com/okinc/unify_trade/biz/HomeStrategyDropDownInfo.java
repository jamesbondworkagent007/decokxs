package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.Serializable;
import o.xVS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class HomeStrategyDropDownInfo implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HomeStrategyDropDownInfo> CREATOR = new Creator();
    private List<String> category;
    private Map<String, List<String>> coinCaches;
    private List<String> coinList;
    private List<String> leverage;
    private final boolean localTraderFirst;
    private List<String> maxDrawdown;
    private List<String> pnlRatio;
    private List<String> runningTime;
    private List<String> userRole;

    public static final class Creator implements Parcelable.Creator<HomeStrategyDropDownInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeStrategyDropDownInfo createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList5 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                }
            }
            return new HomeStrategyDropDownInfo(arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, arrayListCreateStringArrayList4, arrayListCreateStringArrayList5, linkedHashMap, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HomeStrategyDropDownInfo[] newArray(int i) {
            return new HomeStrategyDropDownInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeStrategyDropDownInfo() {
        this(null, null, null, null, null, null, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @Serializable(with = xVS.class)
    public static /* synthetic */ void getLocalTraderFirst$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, List<String>> getCoinCaches() {
        return this.coinCaches;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCoinList() {
        return this.coinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getLeverage() {
        return this.leverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getLocalTraderFirst() {
        return this.localTraderFirst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getMaxDrawdown() {
        return this.maxDrawdown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRunningTime() {
        return this.runningTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getUserRole() {
        return this.userRole;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(List<String> list) {
        this.category = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinCaches(Map<String, List<String>> map) {
        this.coinCaches = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinList(List<String> list) {
        this.coinList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLeverage(List<String> list) {
        this.leverage = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxDrawdown(List<String> list) {
        this.maxDrawdown = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnlRatio(List<String> list) {
        this.pnlRatio = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRunningTime(List<String> list) {
        this.runningTime = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserRole(List<String> list) {
        this.userRole = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.coinList);
        parcel.writeStringList(this.runningTime);
        parcel.writeStringList(this.maxDrawdown);
        parcel.writeStringList(this.pnlRatio);
        parcel.writeStringList(this.leverage);
        Map<String, List<String>> map = this.coinCaches;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                parcel.writeStringList(entry.getValue());
            }
        }
        parcel.writeStringList(this.userRole);
        parcel.writeStringList(this.category);
        parcel.writeInt(this.localTraderFirst ? 1 : 0);
    }

    public HomeStrategyDropDownInfo(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5, Map<String, List<String>> map, List<String> list6, List<String> list7, boolean z) {
        this.coinList = list;
        this.runningTime = list2;
        this.maxDrawdown = list3;
        this.pnlRatio = list4;
        this.leverage = list5;
        this.coinCaches = map;
        this.userRole = list6;
        this.category = list7;
        this.localTraderFirst = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r12v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r13v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r14v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r16v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.util.List) : (null java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r20v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r19v0 boolean))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.Map<java.lang.String, java.util.List<java.lang.String>>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, boolean):void (m)] (LINE:2985) call: com.okinc.unify_trade.biz.HomeStrategyDropDownInfo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.List, java.util.List, boolean):void type: THIS */
    public /* synthetic */ HomeStrategyDropDownInfo(List list, List list2, List list3, List list4, List list5, Map map, List list6, List list7, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) != 0 ? null : map, (i & 64) != 0 ? null : list6, (i & 128) == 0 ? list7 : null, (i & 256) != 0 ? false : z);
    }
}
