package com.okinc.business.dexui.main.swap.route.dag.model.layout;

import android.graphics.PointF;
import android.graphics.RectF;
import com.okinc.business.dexui.main.swap.route.dag.model.PoolInfo;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteEdgeNew;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNewGraph;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeMeta;
import com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeNew;
import com.okinc.business.dexui.main.swap.route.dag.model.lane.Capsule;
import com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutConfig;
import com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutResult;
import com.okinc.business.dexui.main.swap.route.dag.model.lane.Polyline;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt__StringsKt;
import o.C23311hvo;
import o.C23313hvq;
import o.C56390yDp;
import o.C56403yEb;
import o.C56423yEv;
import o.C56548yJl;
import o.C59443zhD;
import o.yDY;
import o.yET;
import o.yEY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class LaneLayoutNew {
    public static final int $stable = 8;
    private final float chipH;
    private final float colGap;
    private LaneLayoutConfig config;
    private final Dialog dagStrategy;
    private final float firstLineYOffsetFromTrunk;
    private final float nodeHeight;
    private final float nodeOffsetFromTrunk;
    private final float nodeWidth;
    private final float paddingV;
    private final float rowGap;
    private final Dialog simpleChainStrategy;
    private final float trunkPaddingX;

    public interface Dialog {
        LaneLayoutResult OLrzqt(@NotNull RouteNewGraph routeNewGraph, Integer num);
    }

    public LaneLayoutNew(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, @NotNull LaneLayoutConfig laneLayoutConfig) {
        Intrinsics.checkNotNullParameter(laneLayoutConfig, "");
        this.nodeWidth = f;
        this.nodeHeight = f2;
        this.colGap = f3;
        this.rowGap = f4;
        this.paddingV = f5;
        this.trunkPaddingX = f6;
        this.nodeOffsetFromTrunk = f7;
        this.chipH = f8;
        this.firstLineYOffsetFromTrunk = f9;
        this.config = laneLayoutConfig;
        this.simpleChainStrategy = new Fragment();
        this.dagStrategy = new ActionBar();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0025: CONSTRUCTOR 
  (r16v0 float)
  (r17v0 float)
  (r18v0 float)
  (r19v0 float)
  (r20v0 float)
  (r21v0 float)
  (r22v0 float)
  (r23v0 float)
  (r24v0 float)
  (wrap:com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutConfig:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x000e: CONSTRUCTOR false, false, (3 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:31) call: com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutConfig.<init>(boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r25v0 com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutConfig))
 A[MD:(float, float, float, float, float, float, float, float, float, com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutConfig):void (m)] (LINE:21) call: com.okinc.business.dexui.main.swap.route.dag.model.layout.LaneLayoutNew.<init>(float, float, float, float, float, float, float, float, float, com.okinc.business.dexui.main.swap.route.dag.model.lane.LaneLayoutConfig):void type: THIS */
    public /* synthetic */ LaneLayoutNew(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, LaneLayoutConfig laneLayoutConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4, f5, f6, f7, f8, f9, (i & 512) != 0 ? new LaneLayoutConfig(false, false, 3, null) : laneLayoutConfig);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final class Fragment implements Dialog {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public Fragment() {
        }

        @Override // com.okinc.business.dexui.main.swap.route.dag.model.layout.LaneLayoutNew.Dialog
        public LaneLayoutResult OLrzqt(@NotNull RouteNewGraph routeNewGraph, Integer num) {
            Intrinsics.checkNotNullParameter(routeNewGraph, "");
            return LaneLayoutNew.this.layoutSimpleChain(routeNewGraph, num);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final class ActionBar implements Dialog {
        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ActionBar() {
        }

        @Override // com.okinc.business.dexui.main.swap.route.dag.model.layout.LaneLayoutNew.Dialog
        public LaneLayoutResult OLrzqt(@NotNull RouteNewGraph routeNewGraph, Integer num) {
            Intrinsics.checkNotNullParameter(routeNewGraph, "");
            return LaneLayoutNew.this.layoutDag(routeNewGraph, num);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        public final String AEQbTJ;
        public final int EZpvd;
        public final String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stateListAnimator.EZpvd;
            }
            if ((i2 & 2) != 0) {
                str = stateListAnimator.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                str2 = stateListAnimator.AEQbTJ;
            }
            return stateListAnimator.copydefault(i, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator copydefault(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new StateListAnimator(i, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.EZpvd == stateListAnimator.EZpvd && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) stateListAnimator.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) stateListAnimator.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((Integer.hashCode(this.EZpvd) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "DestKey(idx=" + this.EZpvd + ", addr=" + this.OLrzqt + ", sig=" + this.AEQbTJ + ")";
        }

        public StateListAnimator(int i, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.EZpvd = i;
            this.OLrzqt = str;
            this.AEQbTJ = str2;
        }
    }

    private final String poolSignatureOf(RouteEdgeNew routeEdgeNew) {
        return StringsKt__StringsKt.fARcdN((CharSequence) routeEdgeNew.getPairAddress()) ^ true ? routeEdgeNew.getPairAddress() : routeEdgeNew.getDexName();
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        public final int AEQbTJ;
        public final String EZpvd;
        public final String KWHzl;
        public final int OLrzqt;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, int i, String str, int i2, String str2, String str3, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = application.AEQbTJ;
            }
            if ((i3 & 2) != 0) {
                str = application.EZpvd;
            }
            String str4 = str;
            if ((i3 & 4) != 0) {
                i2 = application.OLrzqt;
            }
            int i4 = i2;
            if ((i3 & 8) != 0) {
                str2 = application.KWHzl;
            }
            String str5 = str2;
            if ((i3 & 16) != 0) {
                str3 = application.copydefault;
            }
            return application.copydefault(i, str4, i4, str5, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            return new Application(i, str, i2, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return this.AEQbTJ == application.AEQbTJ && Intrinsics.EZpvd((Object) this.EZpvd, (Object) application.EZpvd) && this.OLrzqt == application.OLrzqt && Intrinsics.EZpvd((Object) this.KWHzl, (Object) application.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) application.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((Integer.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode()) * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EdgeKey(fi=" + this.AEQbTJ + ", fa=" + this.EZpvd + ", ti=" + this.OLrzqt + ", ta=" + this.KWHzl + ", pct=" + this.copydefault + ")";
        }

        public Application(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.AEQbTJ = i;
            this.EZpvd = str;
            this.OLrzqt = i2;
            this.KWHzl = str2;
            this.copydefault = str3;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class FragmentManager {
        public final Set<RouteNodeKey> AEQbTJ;
        public final List<Integer> AYXKKw;
        public final List<RouteEdgeNew> EZpvd;
        public final Map<StateListAnimator, Integer> KWHzl;
        public final Map<Integer, Integer> OLrzqt;
        public final Map<RouteNodeKey, List<RouteEdgeNew>> copydefault;
        public final int djBIcL;
        public final Map<RouteNodeKey, List<RouteEdgeNew>> gEmmrt;
        public final Map<StateListAnimator, Integer> valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager AEQbTJ(int i, @NotNull List<RouteEdgeNew> list, @NotNull Set<RouteNodeKey> set, @NotNull Map<RouteNodeKey, ? extends List<RouteEdgeNew>> map, @NotNull Map<RouteNodeKey, ? extends List<RouteEdgeNew>> map2, @NotNull Map<Integer, Integer> map3, @NotNull List<Integer> list2, @NotNull Map<StateListAnimator, Integer> map4, @NotNull Map<StateListAnimator, Integer> map5) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(map3, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(map4, "");
            Intrinsics.checkNotNullParameter(map5, "");
            return new FragmentManager(i, list, set, map, map2, map3, list2, map4, map5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Integer, Integer> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Set<RouteNodeKey> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<StateListAnimator, Integer> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<RouteNodeKey, List<RouteEdgeNew>> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<RouteEdgeNew> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<RouteNodeKey, List<RouteEdgeNew>> djBIcL() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FragmentManager)) {
                return false;
            }
            FragmentManager fragmentManager = (FragmentManager) obj;
            return this.djBIcL == fragmentManager.djBIcL && Intrinsics.EZpvd(this.EZpvd, fragmentManager.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, fragmentManager.AEQbTJ) && Intrinsics.EZpvd(this.gEmmrt, fragmentManager.gEmmrt) && Intrinsics.EZpvd(this.copydefault, fragmentManager.copydefault) && Intrinsics.EZpvd(this.OLrzqt, fragmentManager.OLrzqt) && Intrinsics.EZpvd(this.AYXKKw, fragmentManager.AYXKKw) && Intrinsics.EZpvd(this.valueOf, fragmentManager.valueOf) && Intrinsics.EZpvd(this.KWHzl, fragmentManager.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<StateListAnimator, Integer> gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((((Integer.hashCode(this.djBIcL) * 31) + this.EZpvd.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.gEmmrt.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AYXKKw.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RouteAnalysis(maxCol=" + this.djBIcL + ", firstEdges=" + this.EZpvd + ", directLastKeys=" + this.AEQbTJ + ", outByNodeEarly=" + this.gEmmrt + ", inByNode=" + this.copydefault + ", extraSlotsAfterCol=" + this.OLrzqt + ", laneReserveForEachPath=" + this.AYXKKw + ", laneForTrunkDest=" + this.valueOf + ", directLaneByDest=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int valueOf() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Map<com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey, ? extends java.util.List<com.okinc.business.dexui.main.swap.route.dag.model.RouteEdgeNew>> */
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Map<com.okinc.business.dexui.main.swap.route.dag.model.RouteNodeKey, ? extends java.util.List<com.okinc.business.dexui.main.swap.route.dag.model.RouteEdgeNew>> */
        /* JADX WARN: Multi-variable type inference failed */
        public FragmentManager(int i, @NotNull List<RouteEdgeNew> list, @NotNull Set<RouteNodeKey> set, @NotNull Map<RouteNodeKey, ? extends List<RouteEdgeNew>> map, @NotNull Map<RouteNodeKey, ? extends List<RouteEdgeNew>> map2, @NotNull Map<Integer, Integer> map3, @NotNull List<Integer> list2, @NotNull Map<StateListAnimator, Integer> map4, @NotNull Map<StateListAnimator, Integer> map5) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            Intrinsics.checkNotNullParameter(map3, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(map4, "");
            Intrinsics.checkNotNullParameter(map5, "");
            this.djBIcL = i;
            this.EZpvd = list;
            this.AEQbTJ = set;
            this.gEmmrt = map;
            this.copydefault = map2;
            this.OLrzqt = map3;
            this.AYXKKw = list2;
            this.valueOf = map4;
            this.KWHzl = map5;
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Activity {
        public final Map<Integer, Float> AEQbTJ;
        public final Map<RouteNodeKey, Integer> EZpvd;
        public final float KWHzl;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.route.dag.model.layout.LaneLayoutNew$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, Map map, int i, Map map2, float f, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                map = activity.EZpvd;
            }
            if ((i2 & 2) != 0) {
                i = activity.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                map2 = activity.AEQbTJ;
            }
            if ((i2 & 8) != 0) {
                f = activity.KWHzl;
            }
            return activity.OLrzqt(map, i, map2, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Integer, Float> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<RouteNodeKey, Integer> KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull Map<RouteNodeKey, Integer> map, int i, @NotNull Map<Integer, Float> map2, float f) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            return new Activity(map, i, map2, f);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && this.OLrzqt == activity.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Float.compare(this.KWHzl, activity.KWHzl) == 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.EZpvd.hashCode() * 31) + Integer.hashCode(this.OLrzqt)) * 31) + this.AEQbTJ.hashCode()) * 31) + Float.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "BaseLaneGeometry(laneOfNode=" + this.EZpvd + ", laneCount=" + this.OLrzqt + ", laneY=" + this.AEQbTJ + ", extraTop=" + this.KWHzl + ")";
        }

        public Activity(@NotNull Map<RouteNodeKey, Integer> map, int i, @NotNull Map<Integer, Float> map2, float f) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            this.EZpvd = map;
            this.OLrzqt = i;
            this.AEQbTJ = map2;
            this.KWHzl = f;
        }
    }

    private final boolean isSplitEdges(List<RouteEdgeNew> list) {
        if (list.size() <= 1) {
            return false;
        }
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (RouteEdgeNew routeEdgeNew : list) {
            arrayList.add(new Triple(Integer.valueOf(routeEdgeNew.getToIndex()), routeEdgeNew.getToAddress(), poolSignatureOf(routeEdgeNew)));
        }
        if (CollectionsKt___CollectionsKt.OqFWZa(arrayList).size() > 1) {
            return true;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!C23313hvq.copydefault(((RouteEdgeNew) it.next()).getPercentDisplay(), "100")) {
                return true;
            }
        }
        return false;
    }

    private final boolean hasDownstreamSplit(RouteEdgeNew routeEdgeNew, int i, Map<RouteNodeKey, ? extends List<RouteEdgeNew>> map) {
        if (routeEdgeNew.getToIndex() >= i) {
            return false;
        }
        List<RouteEdgeNew> listAhwBna = map.get(new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress()));
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        return isSplitEdges(listAhwBna);
    }

    public static final class LoaderManager<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Float fFIwbmz = C59443zhD.fIwbmz(((RouteEdgeNew) t2).getPercentDisplay());
            float fFloatValue = fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f;
            Float fFIwbmz2 = C59443zhD.fIwbmz(((RouteEdgeNew) t).getPercentDisplay());
            return yET.KWHzl(Float.valueOf(fFloatValue), Float.valueOf(fFIwbmz2 != null ? fFIwbmz2.floatValue() : 0.0f));
        }
    }

    public static final class PendingIntent<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(Float.valueOf(((RouteEdgeNew) t2).getWeightSort()), Float.valueOf(((RouteEdgeNew) t).getWeightSort()));
        }
    }

    private final Activity computeBaseLanes(RouteNewGraph routeNewGraph, FragmentManager fragmentManager) {
        int iIntValue;
        Integer num;
        int iIntValue2;
        Integer num2;
        Integer num3;
        Set<RouteNodeKey> set;
        int i;
        Object next;
        Integer num4;
        Integer num5;
        fragmentManager.valueOf();
        List<RouteEdgeNew> listCopydefault = fragmentManager.copydefault();
        Map<RouteNodeKey, List<RouteEdgeNew>> mapOLrzqt = fragmentManager.OLrzqt();
        Set<RouteNodeKey> setEZpvd = fragmentManager.EZpvd();
        Map<StateListAnimator, Integer> mapGEmmrt = fragmentManager.gEmmrt();
        Map<StateListAnimator, Integer> mapKWHzl = fragmentManager.KWHzl();
        Map<RouteNodeKey, List<RouteEdgeNew>> mapDjBIcL = fragmentManager.djBIcL();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        for (Object obj : listCopydefault) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            RouteEdgeNew routeEdgeNew = (RouteEdgeNew) obj;
            RouteNodeKey routeNodeKey = new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress());
            Integer num6 = mapGEmmrt.get(new StateListAnimator(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), poolSignatureOf(routeEdgeNew)));
            int iIntValue3 = num6 != null ? num6.intValue() : i2;
            Integer num7 = (Integer) linkedHashMap.get(routeNodeKey);
            linkedHashMap.put(routeNodeKey, Integer.valueOf(Math.min(num7 != null ? num7.intValue() : Integer.MAX_VALUE, iIntValue3)));
            i2++;
        }
        boolean z = true;
        int iCopydefault = C56548yJl.copydefault(routeNewGraph.getEdges().size(), 1);
        int i3 = 0;
        while (i3 < iCopydefault) {
            for (Map.Entry<RouteNodeKey, List<RouteEdgeNew>> entry : mapOLrzqt.entrySet()) {
                RouteNodeKey key = entry.getKey();
                List<RouteEdgeNew> value = entry.getValue();
                if (key.getTokenIndex() == 0 || setEZpvd.contains(key)) {
                    set = setEZpvd;
                    i = iCopydefault;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : value) {
                        if (((RouteEdgeNew) obj2).getFromIndex() == 0) {
                            arrayList.add(obj2);
                        }
                    }
                    if (arrayList.isEmpty() ^ z) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            RouteEdgeNew routeEdgeNew2 = (RouteEdgeNew) it.next();
                            Set<RouteNodeKey> set2 = setEZpvd;
                            int i4 = iCopydefault;
                            Iterator it2 = it;
                            Integer num8 = mapKWHzl.get(new StateListAnimator(routeEdgeNew2.getToIndex(), routeEdgeNew2.getToAddress(), poolSignatureOf(routeEdgeNew2)));
                            if (num8 == null) {
                                num8 = mapGEmmrt.get(new StateListAnimator(routeEdgeNew2.getToIndex(), routeEdgeNew2.getToAddress(), poolSignatureOf(routeEdgeNew2)));
                            }
                            if (num8 != null) {
                                arrayList2.add(num8);
                            }
                            setEZpvd = set2;
                            iCopydefault = i4;
                            it = it2;
                        }
                        set = setEZpvd;
                        i = iCopydefault;
                        num4 = (Integer) CollectionsKt___CollectionsKt.fFgQHt(arrayList2);
                    } else {
                        set = setEZpvd;
                        i = iCopydefault;
                        Iterator<T> it3 = value.iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                Float fFIwbmz = C59443zhD.fIwbmz(((RouteEdgeNew) next).getPercentDisplay());
                                float fFloatValue = fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f;
                                do {
                                    Object next2 = it3.next();
                                    Float fFIwbmz2 = C59443zhD.fIwbmz(((RouteEdgeNew) next2).getPercentDisplay());
                                    float fFloatValue2 = fFIwbmz2 != null ? fFIwbmz2.floatValue() : 0.0f;
                                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                                        next = next2;
                                        fFloatValue = fFloatValue2;
                                    }
                                } while (it3.hasNext());
                            }
                        } else {
                            next = null;
                        }
                        RouteEdgeNew routeEdgeNew3 = (RouteEdgeNew) next;
                        num4 = routeEdgeNew3 != null ? (Integer) linkedHashMap.get(new RouteNodeKey(routeEdgeNew3.getFromIndex(), routeEdgeNew3.getFromAddress())) : null;
                    }
                    if (num4 != null && ((num5 = (Integer) linkedHashMap.get(key)) == null || !Intrinsics.EZpvd(num4, num5))) {
                        linkedHashMap.put(key, num4);
                    }
                }
                setEZpvd = set;
                iCopydefault = i;
                z = true;
            }
            i3++;
            z = true;
        }
        for (Map.Entry<RouteNodeKey, List<RouteEdgeNew>> entry2 : mapDjBIcL.entrySet()) {
            RouteNodeKey key2 = entry2.getKey();
            List<RouteEdgeNew> value2 = entry2.getValue();
            if (key2.getTokenIndex() != 0) {
                List<RouteEdgeNew> listAhwBna = mapOLrzqt.get(key2);
                if (listAhwBna == null) {
                    listAhwBna = yDY.AhwBna();
                }
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
                for (RouteEdgeNew routeEdgeNew4 : listAhwBna) {
                    arrayList3.add(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew4.getFromIndex()), routeEdgeNew4.getFromAddress()));
                }
                Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(value2, 10));
                for (RouteEdgeNew routeEdgeNew5 : value2) {
                    arrayList4.add(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew5.getToIndex()), routeEdgeNew5.getToAddress()));
                }
                Set setOqFWZa2 = CollectionsKt___CollectionsKt.OqFWZa(arrayList4);
                if (setOqFWZa.size() >= 2 && setOqFWZa2.size() >= 2) {
                    ArrayList arrayList5 = new ArrayList();
                    for (RouteEdgeNew routeEdgeNew6 : listAhwBna) {
                        if (routeEdgeNew6.getFromIndex() == 0) {
                            num3 = mapGEmmrt.get(new StateListAnimator(routeEdgeNew6.getToIndex(), routeEdgeNew6.getToAddress(), poolSignatureOf(routeEdgeNew6)));
                        } else {
                            num3 = (Integer) linkedHashMap.get(new RouteNodeKey(routeEdgeNew6.getFromIndex(), routeEdgeNew6.getFromAddress()));
                        }
                        if (num3 != null) {
                            arrayList5.add(num3);
                        }
                    }
                    Integer num9 = (Integer) CollectionsKt___CollectionsKt.UeEOUB(arrayList5);
                    if (num9 != null && ((num2 = (Integer) linkedHashMap.get(key2)) == null || !Intrinsics.EZpvd(num9, num2))) {
                        linkedHashMap.put(key2, num9);
                    }
                }
            }
        }
        Integer num10 = (Integer) CollectionsKt___CollectionsKt.UeEOUB(mapGEmmrt.values());
        int iIntValue4 = num10 != null ? num10.intValue() : 0;
        Iterator<T> it4 = mapDjBIcL.entrySet().iterator();
        if (it4.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it4.next();
            RouteNodeKey routeNodeKey2 = (RouteNodeKey) entry3.getKey();
            List<RouteEdgeNew> list = (List) entry3.getValue();
            if (routeNodeKey2.getTokenIndex() == 0) {
                iIntValue = 0;
            } else {
                Integer num11 = (Integer) linkedHashMap.get(routeNodeKey2);
                iIntValue = num11 != null ? num11.intValue() : 0;
                if (isSplitEdges(list)) {
                    iIntValue += list.size() - 1;
                }
            }
            Integer numValueOf = Integer.valueOf(iIntValue);
            loop11: while (true) {
                num = numValueOf;
                while (it4.hasNext()) {
                    Map.Entry entry4 = (Map.Entry) it4.next();
                    RouteNodeKey routeNodeKey3 = (RouteNodeKey) entry4.getKey();
                    List<RouteEdgeNew> list2 = (List) entry4.getValue();
                    if (routeNodeKey3.getTokenIndex() == 0) {
                        iIntValue2 = 0;
                    } else {
                        Integer num12 = (Integer) linkedHashMap.get(routeNodeKey3);
                        iIntValue2 = num12 != null ? num12.intValue() : 0;
                        if (isSplitEdges(list2)) {
                            iIntValue2 += list2.size() - 1;
                        }
                    }
                    numValueOf = Integer.valueOf(iIntValue2);
                    if (num.compareTo(numValueOf) < 0) {
                        break;
                    }
                }
            }
        } else {
            num = null;
        }
        int iIntValue5 = num != null ? num.intValue() : 0;
        Integer num13 = (Integer) CollectionsKt___CollectionsKt.UeEOUB(linkedHashMap.values());
        int iAEQbTJ = yEY.AEQbTJ((num13 != null ? num13.intValue() : 0) + 1, listCopydefault.size(), iIntValue4 + 1, iIntValue5 + 1, 1);
        float fMax = Math.max(0.0f, this.firstLineYOffsetFromTrunk - (this.nodeHeight / 2.0f));
        IntRange intRangeAhwBna = C56548yJl.AhwBna(0, iAEQbTJ);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(intRangeAhwBna, 10)), 16));
        Iterator<Integer> it5 = intRangeAhwBna.iterator();
        while (it5.hasNext()) {
            linkedHashMap2.put(it5.next(), Float.valueOf(this.paddingV + fMax + (r5.intValue() * (this.nodeHeight + this.rowGap))));
        }
        return new Activity(linkedHashMap, iAEQbTJ, linkedHashMap2, fMax);
    }

    private final boolean isSimpleChain(RouteNewGraph routeNewGraph) {
        List<RouteEdgeNew> edges = routeNewGraph.getEdges();
        if (edges.isEmpty()) {
            return false;
        }
        if (!edges.isEmpty()) {
            Iterator<T> it = edges.iterator();
            while (it.hasNext()) {
                if (!C23313hvq.copydefault(((RouteEdgeNew) it.next()).getPercentDisplay(), "100")) {
                    return false;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : edges) {
            if (((RouteEdgeNew) obj).getFromIndex() == 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 1) {
            return false;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : edges) {
            RouteEdgeNew routeEdgeNew = (RouteEdgeNew) obj2;
            Pair pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew.getFromIndex()), routeEdgeNew.getFromAddress());
            Object arrayList2 = linkedHashMap.get(pairOLrzqt);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(pairOLrzqt, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        if (!linkedHashMap.isEmpty()) {
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                if (((List) ((Map.Entry) it2.next()).getValue()).size() > 1) {
                    return false;
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : edges) {
            RouteEdgeNew routeEdgeNew2 = (RouteEdgeNew) obj3;
            Pair pairOLrzqt2 = C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew2.getToIndex()), routeEdgeNew2.getToAddress());
            Object arrayList3 = linkedHashMap2.get(pairOLrzqt2);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap2.put(pairOLrzqt2, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        if (!linkedHashMap2.isEmpty()) {
            Iterator it3 = linkedHashMap2.entrySet().iterator();
            while (it3.hasNext()) {
                if (((List) ((Map.Entry) it3.next()).getValue()).size() > 1) {
                    return false;
                }
            }
        }
        RouteEdgeNew routeEdgeNew3 = (RouteEdgeNew) CollectionsKt___CollectionsKt.AuCTelauCTel(arrayList);
        int maxIndex = routeNewGraph.getMaxIndex();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(edges, 10)), 16));
        for (Object obj4 : edges) {
            RouteEdgeNew routeEdgeNew4 = (RouteEdgeNew) obj4;
            linkedHashMap3.put(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew4.getFromIndex()), routeEdgeNew4.getFromAddress()), obj4);
        }
        int i = 0;
        do {
            i++;
            if (routeEdgeNew3.getToIndex() == maxIndex) {
                return i == edges.size();
            }
            routeEdgeNew3 = (RouteEdgeNew) linkedHashMap3.get(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew3.getToIndex()), routeEdgeNew3.getToAddress()));
            if (routeEdgeNew3 == null) {
                return false;
            }
        } while (i <= edges.size());
        return false;
    }

    public static /* synthetic */ LaneLayoutResult layoutSimpleChain$default(LaneLayoutNew laneLayoutNew, RouteNewGraph routeNewGraph, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return laneLayoutNew.layoutSimpleChain(routeNewGraph, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaneLayoutResult layoutSimpleChain(RouteNewGraph routeNewGraph, Integer num) {
        float fMax;
        float fLayoutSimpleChain$xForCol;
        int maxIndex = routeNewGraph.getMaxIndex();
        IntRange intRangeAhwBna = C56548yJl.AhwBna(0, 1);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(intRangeAhwBna, 10)), 16));
        Iterator<Integer> it = intRangeAhwBna.iterator();
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Float.valueOf((r7.intValue() * (this.nodeHeight + this.rowGap)) + 0.0f));
        }
        float f = this.nodeHeight;
        float f2 = 0.25862068f * f;
        float f3 = f * 0.552f;
        float f4 = f3 / 2.0f;
        if (maxIndex + 3 > 5) {
            return layoutDag(routeNewGraph, num);
        }
        float f5 = ((maxIndex + 1) * this.nodeWidth) + f3 + f3;
        float f6 = maxIndex + 2;
        float f7 = this.colGap;
        float f8 = 2;
        float f9 = f2 * f8;
        if (num == null || f9 + f5 + (f7 * f6) > num.intValue()) {
            fMax = this.colGap;
        } else {
            Intrinsics.copydefault(num);
            fMax = Math.max(((num.intValue() - f9) - f5) / f6, this.colGap);
        }
        float f10 = f2 + f4;
        float f11 = f3 + f2 + fMax;
        float fLayoutSimpleChain$xForCol2 = layoutSimpleChain$xForCol(f11, this, fMax, maxIndex) + this.nodeWidth + fMax + f4;
        Float f12 = (Float) linkedHashMap.get(0);
        float fFloatValue = (this.nodeHeight / 2.0f) + (f12 != null ? f12.floatValue() : 0.0f);
        float f13 = fFloatValue + f4;
        Float f14 = (Float) linkedHashMap.get(0);
        float fFloatValue2 = f14 != null ? f14.floatValue() : 0.0f;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        Iterator<Map.Entry<Integer, List<RouteNodeNew>>> it2 = routeNewGraph.getColumns().entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Integer, List<RouteNodeNew>> next = it2.next();
            int iIntValue = next.getKey().intValue();
            for (RouteNodeNew routeNodeNew : next.getValue()) {
                float fLayoutSimpleChain$xForCol3 = layoutSimpleChain$xForCol(f11, this, fMax, iIntValue);
                linkedHashMap2.put(routeNodeNew.getKey(), new RectF(fLayoutSimpleChain$xForCol3, fFloatValue2, this.nodeWidth + fLayoutSimpleChain$xForCol3, this.nodeHeight + fFloatValue2));
                linkedHashMap3.put(routeNodeNew.getKey(), routeNodeNew.getMeta());
                iIntValue = iIntValue;
                it2 = it2;
                f2 = f2;
            }
        }
        float f15 = f2;
        ArrayList arrayList = new ArrayList();
        float f16 = this.chipH / f8;
        arrayList.add(new Capsule("100%", new RectF(f11, fFloatValue - f16, this.nodeWidth + f11, f16 + fFloatValue)));
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = routeNewGraph.getEdges().iterator();
        while (it3.hasNext()) {
            RouteEdgeNew routeEdgeNew = (RouteEdgeNew) it3.next();
            if (routeEdgeNew.getFromIndex() == 0) {
                fLayoutSimpleChain$xForCol = f10;
            } else {
                RectF rectF = (RectF) linkedHashMap2.get(new RouteNodeKey(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress()));
                fLayoutSimpleChain$xForCol = rectF != null ? rectF.right : layoutSimpleChain$xForCol(f11, this, fMax, routeEdgeNew.getFromIndex()) + this.nodeWidth;
            }
            Iterator it4 = it3;
            RectF rectF2 = (RectF) linkedHashMap2.get(new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress()));
            arrayList2.add(new Polyline(yDY.gEmmrt(new PointF(fLayoutSimpleChain$xForCol, fFloatValue), new PointF(rectF2 != null ? rectF2.left : layoutSimpleChain$xForCol(f11, this, fMax, routeEdgeNew.getToIndex()), fFloatValue)), false, false));
            it3 = it4;
        }
        arrayList2.add(new Polyline(yDY.gEmmrt(new PointF(layoutSimpleChain$xForCol(f11, this, fMax, maxIndex) + this.nodeWidth, fFloatValue), new PointF(fLayoutSimpleChain$xForCol2, fFloatValue)), false, false));
        int i = (int) (this.paddingV + 0.0f + 0.0f + (1 * this.nodeHeight) + (0 * this.rowGap));
        RouteNodeMeta startMeta = routeNewGraph.getStartMeta();
        RouteNodeMeta endMeta = routeNewGraph.getEndMeta();
        float f17 = this.nodeHeight;
        return new LaneLayoutResult(linkedHashMap2, linkedHashMap3, arrayList, arrayList2, startMeta, endMeta, f10, fLayoutSimpleChain$xForCol2, f13, f13, f13, fFloatValue, f17 + this.rowGap, f17, (int) (f4 + fLayoutSimpleChain$xForCol2 + f15), i);
    }

    private static final float layoutSimpleChain$xForCol(float f, LaneLayoutNew laneLayoutNew, float f2, int i) {
        return f + (i * (laneLayoutNew.nodeWidth + f2));
    }

    public static /* synthetic */ LaneLayoutResult layout$default(LaneLayoutNew laneLayoutNew, RouteNewGraph routeNewGraph, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return laneLayoutNew.layout(routeNewGraph, num);
    }

    public final LaneLayoutResult layout(@NotNull RouteNewGraph routeNewGraph, Integer num) {
        Intrinsics.checkNotNullParameter(routeNewGraph, "");
        return (isSimpleChain(routeNewGraph) ? this.simpleChainStrategy : this.dagStrategy).OLrzqt(routeNewGraph, num);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public final class TaskDescription {
        public final Map<Application, RectF> AEQbTJ;
        public final RouteNewGraph AYXKKw;
        public final List<RouteEdgeNew> AhwBna;
        public final Set<Application> AkhnZx;
        public final int AuCTel;
        public int DbNXlk;
        public float EZpvd;
        public final FragmentManager KWHzl;
        public final List<Capsule> OLrzqt;
        public final Activity copydefault;
        public float djBIcL;
        public final Map<RouteNodeKey, RectF> ejfBZ;
        public final Set<Integer> fARcdN;
        public final Map<RouteNodeKey, RouteNodeMeta> fIwbmz;
        public float fJNWhG;
        public final Map<Integer, Float> fetchVPNInfo;
        public final float gEmmrt;
        public final List<Polyline> getFieldNames;
        public float getNewProxyInstance;
        public Map<Integer, Integer> hDKMBd;
        public final Map<RouteNodeKey, Integer> isConnected;
        public final /* synthetic */ LaneLayoutNew iwGUEr;
        public float uzCIH;
        public final Map<Application, Integer> valueOf;
        public final Map<Integer, Pair<RouteNodeKey, RectF>> values;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(float f) {
            this.EZpvd = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(int i) {
            this.DbNXlk = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<RouteEdgeNew> AhwBna() {
            return this.AhwBna;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AkhnZx() {
            return this.DbNXlk;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<RouteNodeKey, RouteNodeMeta> AuCTel() {
            return this.fIwbmz;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Set<Application> DbNXlk() {
            return this.AkhnZx;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Capsule> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(float f) {
            this.uzCIH = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(@NotNull Map<Integer, Integer> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.hDKMBd = map;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Application, RectF> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(float f) {
            this.getNewProxyInstance = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(float f) {
            this.djBIcL = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FragmentManager copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(float f) {
            this.fJNWhG = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RouteNewGraph djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Integer, Pair<RouteNodeKey, RectF>> ejfBZ() {
            return this.values;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int fARcdN() {
            return this.AuCTel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<RouteNodeKey, RectF> fIwbmz() {
            return this.ejfBZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float fJNWhG() {
            return this.fJNWhG;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Application, Integer> gEmmrt() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Set<Integer> getFieldNames() {
            return this.fARcdN;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<Integer, Float> isConnected() {
            return this.fetchVPNInfo;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float iwGUEr() {
            return this.getNewProxyInstance;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final List<Polyline> uzCIH() {
            return this.getFieldNames;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float valueOf() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<RouteNodeKey, Integer> values() {
            return this.isConnected;
        }

        public TaskDescription(@NotNull LaneLayoutNew laneLayoutNew, RouteNewGraph routeNewGraph, @NotNull int i, @NotNull List<RouteEdgeNew> list, @NotNull FragmentManager fragmentManager, Activity activity) {
            Intrinsics.checkNotNullParameter(routeNewGraph, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(activity, "");
            this.iwGUEr = laneLayoutNew;
            this.AYXKKw = routeNewGraph;
            this.AuCTel = i;
            this.AhwBna = list;
            this.KWHzl = fragmentManager;
            this.copydefault = activity;
            this.isConnected = activity.KWHzl();
            this.DbNXlk = activity.OLrzqt();
            this.fetchVPNInfo = activity.EZpvd();
            this.gEmmrt = activity.AEQbTJ();
            this.valueOf = new LinkedHashMap();
            this.ejfBZ = new LinkedHashMap();
            this.fIwbmz = new LinkedHashMap();
            this.OLrzqt = new ArrayList();
            this.AEQbTJ = new LinkedHashMap();
            this.AkhnZx = new LinkedHashSet();
            this.fARcdN = new LinkedHashSet();
            this.values = new LinkedHashMap();
            this.getFieldNames = new ArrayList();
        }

        public final Map<Integer, Integer> getNewProxyInstance() {
            Map<Integer, Integer> map = this.hDKMBd;
            if (map != null) {
                return map;
            }
            Intrinsics.gEmmrt("");
            return null;
        }

        public final Map<RouteNodeKey, List<RouteEdgeNew>> AYXKKw() {
            return this.KWHzl.OLrzqt();
        }

        public final Set<RouteNodeKey> OLrzqt() {
            return this.KWHzl.EZpvd();
        }

        public final Map<StateListAnimator, Integer> fetchVPNInfo() {
            return this.KWHzl.gEmmrt();
        }

        public final Map<RouteNodeKey, List<RouteEdgeNew>> hDKMBd() {
            return this.KWHzl.djBIcL();
        }

        public final float copydefault(int i) {
            Integer num = getNewProxyInstance().get(Integer.valueOf(i));
            int iIntValue = num != null ? num.intValue() : 0;
            float f = this.djBIcL;
            float f2 = this.uzCIH;
            return f + (i * f2) + (iIntValue * f2);
        }

        public final float EZpvd(int i) {
            return this.EZpvd + (i * (this.iwGUEr.nodeHeight + this.iwGUEr.rowGap));
        }
    }

    private final void initializeXCoordinates(TaskDescription taskDescription) {
        taskDescription.copydefault(this.trunkPaddingX);
        taskDescription.OLrzqt(taskDescription.fJNWhG() + this.nodeOffsetFromTrunk);
        taskDescription.EZpvd(this.nodeWidth + this.colGap);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int iFARcdN = taskDescription.fARcdN();
        if (iFARcdN >= 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                Integer num = taskDescription.copydefault().AEQbTJ().get(Integer.valueOf(i));
                int iIntValue = num != null ? num.intValue() : 0;
                linkedHashMap.put(Integer.valueOf(i), Integer.valueOf(i2));
                i2 += iIntValue;
                if (i == iFARcdN) {
                    break;
                } else {
                    i++;
                }
            }
        }
        taskDescription.EZpvd(linkedHashMap);
        taskDescription.KWHzl(taskDescription.copydefault(taskDescription.fARcdN()) + this.nodeWidth + this.nodeOffsetFromTrunk);
    }

    private final void createInitialNodeRects(TaskDescription taskDescription) {
        for (Map.Entry<Integer, List<RouteNodeNew>> entry : taskDescription.djBIcL().getColumns().entrySet()) {
            int iIntValue = entry.getKey().intValue();
            List<RouteNodeNew> value = entry.getValue();
            if (iIntValue != taskDescription.fARcdN()) {
                for (RouteNodeNew routeNodeNew : value) {
                    Integer num = taskDescription.values().get(routeNodeNew.getKey());
                    Float f = taskDescription.isConnected().get(Integer.valueOf(num != null ? num.intValue() : 0));
                    float fFloatValue = f != null ? f.floatValue() : this.paddingV;
                    float fCopydefault = taskDescription.copydefault(routeNodeNew.getKey().getTokenIndex());
                    taskDescription.fIwbmz().put(routeNodeNew.getKey(), new RectF(fCopydefault, fFloatValue, this.nodeWidth + fCopydefault, this.nodeHeight + fFloatValue));
                    taskDescription.AuCTel().put(routeNodeNew.getKey(), routeNodeNew.getMeta());
                }
            }
        }
        Float f2 = taskDescription.isConnected().get(0);
        taskDescription.AEQbTJ((f2 != null ? f2.floatValue() : this.paddingV) + (this.nodeHeight / 2.0f));
    }

    private final void createTrunkCapsules(TaskDescription taskDescription) {
        TaskDescription taskDescription2;
        int iIntValue;
        int i = 0;
        for (Object obj : taskDescription.AhwBna()) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            RouteEdgeNew routeEdgeNew = (RouteEdgeNew) obj;
            Integer num = taskDescription.fetchVPNInfo().get(new StateListAnimator(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), poolSignatureOf(routeEdgeNew)));
            if (num != null) {
                iIntValue = num.intValue();
                taskDescription2 = taskDescription;
            } else {
                taskDescription2 = taskDescription;
                iIntValue = i;
            }
            float fEZpvd = taskDescription2.EZpvd(iIntValue);
            float f = 2;
            taskDescription.EZpvd().add(new Capsule(C23311hvo.formatPercent$default(routeEdgeNew.getPercentDisplay(), false, 0, 0, null, null, 30, null), new RectF(taskDescription.fJNWhG() + this.nodeOffsetFromTrunk, fEZpvd - (this.chipH / f), taskDescription.fJNWhG() + this.nodeOffsetFromTrunk + this.nodeWidth, fEZpvd + (this.chipH / f))));
            i++;
        }
        List<RouteEdgeNew> listAhwBna = taskDescription.AhwBna();
        ArrayList<RouteEdgeNew> arrayList = new ArrayList();
        for (Object obj2 : listAhwBna) {
            if (((RouteEdgeNew) obj2).getToIndex() == taskDescription.fARcdN()) {
                arrayList.add(obj2);
            }
        }
        for (RouteEdgeNew routeEdgeNew2 : arrayList) {
            Integer num2 = taskDescription.fetchVPNInfo().get(new StateListAnimator(routeEdgeNew2.getToIndex(), routeEdgeNew2.getToAddress(), poolSignatureOf(routeEdgeNew2)));
            taskDescription.getFieldNames().add(Integer.valueOf(num2 != null ? num2.intValue() : 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void processSplitBranchEdge(TaskDescription taskDescription, RouteEdgeNew routeEdgeNew, RouteNodeKey routeNodeKey, RectF rectF, int i, int i2, RouteEdgeNew routeEdgeNew2) {
        int iIntValue;
        Integer num;
        if (routeEdgeNew.getToIndex() == taskDescription.fARcdN()) {
            while (taskDescription.getFieldNames().contains(Integer.valueOf(i2))) {
                i2++;
            }
            taskDescription.getFieldNames().add(Integer.valueOf(i2));
            if (Intrinsics.EZpvd(routeEdgeNew, routeEdgeNew2)) {
                taskDescription.DbNXlk().add(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()));
            }
        }
        if (routeEdgeNew.getToIndex() < taskDescription.fARcdN()) {
            RouteNodeKey routeNodeKey2 = new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress());
            List<RouteEdgeNew> listAhwBna = taskDescription.AYXKKw().get(routeNodeKey2);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
            for (RouteEdgeNew routeEdgeNew3 : listAhwBna) {
                arrayList.add(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew3.getFromIndex()), routeEdgeNew3.getFromAddress()));
            }
            int size = CollectionsKt___CollectionsKt.OqFWZa(arrayList).size();
            List<RouteEdgeNew> edges = taskDescription.djBIcL().getEdges();
            ArrayList<RouteEdgeNew> arrayList2 = new ArrayList();
            for (Object obj : edges) {
                RouteEdgeNew routeEdgeNew4 = (RouteEdgeNew) obj;
                if (routeEdgeNew4.getToIndex() == routeNodeKey2.getTokenIndex() && Intrinsics.EZpvd((Object) routeEdgeNew4.getToAddress(), (Object) routeNodeKey2.getTokenAddress())) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
            for (RouteEdgeNew routeEdgeNew5 : arrayList2) {
                arrayList3.add(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew5.getFromIndex()), routeEdgeNew5.getFromAddress()));
            }
            boolean z = CollectionsKt___CollectionsKt.OqFWZa(arrayList3).size() > 1;
            if (size == 1 && !z) {
                taskDescription.values().put(routeNodeKey2, Integer.valueOf(i2));
                float fEZpvd = taskDescription.EZpvd(i2) - (this.nodeHeight / 2.0f);
                float fCopydefault = taskDescription.copydefault(routeNodeKey2.getTokenIndex());
                taskDescription.fIwbmz().put(routeNodeKey2, new RectF(fCopydefault, fEZpvd, this.nodeWidth + fCopydefault, this.nodeHeight + fEZpvd));
            } else if (!taskDescription.fIwbmz().containsKey(routeNodeKey2)) {
                Map<Integer, Float> mapIsConnected = taskDescription.isConnected();
                Integer num2 = taskDescription.values().get(routeNodeKey2);
                Float f = mapIsConnected.get(Integer.valueOf(num2 != null ? num2.intValue() : 0));
                float fFloatValue = f != null ? f.floatValue() : this.paddingV;
                float fCopydefault2 = taskDescription.copydefault(routeNodeKey2.getTokenIndex());
                taskDescription.fIwbmz().put(routeNodeKey2, new RectF(fCopydefault2, fFloatValue, this.nodeWidth + fCopydefault2, this.nodeHeight + fFloatValue));
            }
        }
        if (routeEdgeNew.getToIndex() < taskDescription.fARcdN()) {
            Integer num3 = taskDescription.values().get(new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress()));
            iIntValue = num3 != null ? num3.intValue() : i2;
        }
        taskDescription.gEmmrt().put(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()), Integer.valueOf(iIntValue));
        if (routeEdgeNew.getToIndex() < taskDescription.fARcdN()) {
            RouteNodeKey routeNodeKey3 = new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress());
            List<RouteEdgeNew> listAhwBna2 = taskDescription.AYXKKw().get(routeNodeKey3);
            if (listAhwBna2 == null) {
                listAhwBna2 = yDY.AhwBna();
            }
            ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(listAhwBna2, 10));
            for (RouteEdgeNew routeEdgeNew6 : listAhwBna2) {
                arrayList4.add(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew6.getFromIndex()), routeEdgeNew6.getFromAddress()));
            }
            if (CollectionsKt___CollectionsKt.OqFWZa(arrayList4).size() <= 1 && (num = taskDescription.values().get(routeNodeKey3)) != null) {
                i2 = num.intValue();
            }
        }
        float fEZpvd2 = taskDescription.EZpvd(i2);
        float f2 = rectF.right + this.colGap;
        float f3 = this.chipH / 2;
        RectF rectF2 = new RectF(f2, fEZpvd2 - f3, this.nodeWidth + f2, fEZpvd2 + f3);
        taskDescription.EZpvd().add(new Capsule(C23311hvo.formatPercent$default(routeEdgeNew.getPercentDisplay(), false, 0, 0, null, null, 30, null), rectF2));
        taskDescription.KWHzl().put(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()), rectF2);
    }

    private final void processSplitBranches(TaskDescription taskDescription) {
        for (Map.Entry<RouteNodeKey, List<RouteEdgeNew>> entry : taskDescription.hDKMBd().entrySet()) {
            RouteNodeKey key = entry.getKey();
            List<RouteEdgeNew> value = entry.getValue();
            if (key.getTokenIndex() != 0 && isSplitEdges(value)) {
                RouteEdgeNew routeEdgeNewDetermineKeepStraightEdge = determineKeepStraightEdge(value, taskDescription.fARcdN(), taskDescription.hDKMBd());
                RectF rectF = taskDescription.fIwbmz().get(key);
                if (rectF != null) {
                    Integer num = taskDescription.values().get(key);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Iterator it = CollectionsKt___CollectionsKt.EZpvd(value, new LoaderManager()).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        processSplitBranchEdge(taskDescription, (RouteEdgeNew) it.next(), key, rectF, iIntValue, iIntValue + 1 + i, routeEdgeNewDetermineKeepStraightEdge);
                        i++;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0139 A[EDGE_INSN: B:119:0x0139->B:48:0x0139 BREAK  A[LOOP:5: B:38:0x00d2->B:121:0x00d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void propagateLanes(TaskDescription taskDescription) {
        boolean z;
        ArrayList arrayList;
        Iterator<T> it;
        Pair pairOLrzqt;
        Integer num;
        Integer num2;
        for (int i = 0; i < 2; i++) {
            for (Map.Entry<RouteNodeKey, List<RouteEdgeNew>> entry : taskDescription.AYXKKw().entrySet()) {
                RouteNodeKey key = entry.getKey();
                List<RouteEdgeNew> value = entry.getValue();
                if (key.getTokenIndex() != 0 && !taskDescription.OLrzqt().contains(key)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : value) {
                        if (((RouteEdgeNew) obj).getFromIndex() == 0) {
                            arrayList2.add(obj);
                        }
                    }
                    ArrayList<RouteEdgeNew> arrayList3 = new ArrayList();
                    for (Object obj2 : value) {
                        if (((RouteEdgeNew) obj2).getFromIndex() != 0) {
                            arrayList3.add(obj2);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        z = false;
                        if ((!arrayList2.isEmpty()) || z) {
                            arrayList = new ArrayList();
                            it = value.iterator();
                            while (true) {
                                Pair pairOLrzqt2 = null;
                                if (it.hasNext()) {
                                    break;
                                }
                                RouteEdgeNew routeEdgeNew = (RouteEdgeNew) it.next();
                                Integer num3 = taskDescription.gEmmrt().get(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), key.getTokenIndex(), key.getTokenAddress(), routeEdgeNew.getPercentDisplay()));
                                if (num3 != null) {
                                    pairOLrzqt2 = C56390yDp.OLrzqt(num3, Boolean.TRUE);
                                } else {
                                    Integer num4 = taskDescription.values().get(new RouteNodeKey(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress()));
                                    if (num4 != null) {
                                        pairOLrzqt2 = C56390yDp.OLrzqt(Integer.valueOf(num4.intValue()), Boolean.FALSE);
                                    }
                                }
                                if (pairOLrzqt2 != null) {
                                    arrayList.add(pairOLrzqt2);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                pairOLrzqt = C56390yDp.OLrzqt(null, Boolean.FALSE);
                            } else {
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj3 : arrayList) {
                                    if (((Boolean) ((Pair) obj3).getSecond()).booleanValue()) {
                                        arrayList4.add(obj3);
                                    }
                                }
                                ArrayList arrayList5 = new ArrayList(C56403yEb.AYXKKw(arrayList4, 10));
                                Iterator it2 = arrayList4.iterator();
                                while (it2.hasNext()) {
                                    arrayList5.add(Integer.valueOf(((Number) ((Pair) it2.next()).getFirst()).intValue()));
                                }
                                if (!arrayList5.isEmpty()) {
                                    Integer num5 = (Integer) CollectionsKt___CollectionsKt.fFgQHt(arrayList5);
                                    pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(num5 != null ? num5.intValue() : 0), Boolean.TRUE);
                                } else {
                                    ArrayList arrayList6 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                                    Iterator it3 = arrayList.iterator();
                                    while (it3.hasNext()) {
                                        arrayList6.add(Integer.valueOf(((Number) ((Pair) it3.next()).getFirst()).intValue()));
                                    }
                                    Integer num6 = (Integer) CollectionsKt___CollectionsKt.fFgQHt(arrayList6);
                                    pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(num6 != null ? num6.intValue() : 0), Boolean.FALSE);
                                }
                            }
                            num = (Integer) pairOLrzqt.component1();
                            if (num == null && ((num2 = taskDescription.values().get(key)) == null || !Intrinsics.EZpvd(num, num2))) {
                                taskDescription.values().put(key, num);
                                if (key.getTokenIndex() < taskDescription.fARcdN()) {
                                    float fEZpvd = taskDescription.EZpvd(num.intValue()) - (this.nodeHeight / 2.0f);
                                    float fCopydefault = taskDescription.copydefault(key.getTokenIndex());
                                    taskDescription.fIwbmz().put(key, new RectF(fCopydefault, fEZpvd, this.nodeWidth + fCopydefault, this.nodeHeight + fEZpvd));
                                }
                            }
                        }
                    } else {
                        for (RouteEdgeNew routeEdgeNew2 : arrayList3) {
                            if (taskDescription.gEmmrt().containsKey(new Application(routeEdgeNew2.getFromIndex(), routeEdgeNew2.getFromAddress(), key.getTokenIndex(), key.getTokenAddress(), routeEdgeNew2.getPercentDisplay()))) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        if (!arrayList2.isEmpty()) {
                        }
                        arrayList = new ArrayList();
                        it = value.iterator();
                        while (true) {
                            Pair pairOLrzqt22 = null;
                            if (it.hasNext()) {
                            }
                        }
                        if (!arrayList.isEmpty()) {
                        }
                        num = (Integer) pairOLrzqt.component1();
                        if (num == null) {
                        }
                    }
                }
            }
        }
    }

    private final List<PoolInfo> collectPoolsForLane(TaskDescription taskDescription, int i) {
        List<RouteEdgeNew> edges = taskDescription.djBIcL().getEdges();
        ArrayList<RouteEdgeNew> arrayList = new ArrayList();
        for (Object obj : edges) {
            RouteEdgeNew routeEdgeNew = (RouteEdgeNew) obj;
            Integer num = taskDescription.gEmmrt().get(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()));
            if (num == null) {
                if (routeEdgeNew.getFromIndex() == 0) {
                    num = taskDescription.fetchVPNInfo().get(new StateListAnimator(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), poolSignatureOf(routeEdgeNew)));
                } else {
                    num = taskDescription.values().get(new RouteNodeKey(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress()));
                }
            }
            if (routeEdgeNew.getToIndex() == taskDescription.fARcdN()) {
                if ((num != null ? num.intValue() : 0) == i) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (RouteEdgeNew routeEdgeNew2 : arrayList) {
            arrayList2.add(new PoolInfo(routeEdgeNew2.getDexName(), routeEdgeNew2.getPercentDisplay(), routeEdgeNew2.getOkLinkUrl(), routeEdgeNew2.getPairAddress()));
        }
        return arrayList2;
    }

    private final void synthesizeEndNodes(TaskDescription taskDescription) {
        Integer num;
        int iIntValue;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<RouteEdgeNew> edges = taskDescription.djBIcL().getEdges();
        ArrayList<RouteEdgeNew> arrayList = new ArrayList();
        for (Object obj : edges) {
            if (((RouteEdgeNew) obj).getToIndex() == taskDescription.fARcdN()) {
                arrayList.add(obj);
            }
        }
        for (RouteEdgeNew routeEdgeNew : arrayList) {
            Integer num2 = taskDescription.gEmmrt().get(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()));
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                if (routeEdgeNew.getFromIndex() == 0) {
                    num = taskDescription.fetchVPNInfo().get(new StateListAnimator(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), poolSignatureOf(routeEdgeNew)));
                } else {
                    num = taskDescription.values().get(new RouteNodeKey(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress()));
                }
                iIntValue = num != null ? num.intValue() : 0;
            }
            linkedHashSet.add(Integer.valueOf(iIntValue));
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            int iIntValue2 = ((Number) it.next()).intValue();
            float fEZpvd = taskDescription.EZpvd(iIntValue2) - (this.nodeHeight / 2.0f);
            float fCopydefault = taskDescription.copydefault(taskDescription.fARcdN());
            RouteNodeKey routeNodeKey = new RouteNodeKey(taskDescription.fARcdN(), "__end_lane_" + iIntValue2);
            RectF rectF = new RectF(fCopydefault, fEZpvd, this.nodeWidth + fCopydefault, this.nodeHeight + fEZpvd);
            taskDescription.ejfBZ().put(Integer.valueOf(iIntValue2), C56390yDp.OLrzqt(routeNodeKey, rectF));
            taskDescription.fIwbmz().put(routeNodeKey, rectF);
            taskDescription.AuCTel().put(routeNodeKey, RouteNodeMeta.copy$default(taskDescription.djBIcL().getEndMeta(), null, null, collectPoolsForLane(taskDescription, iIntValue2), 3, null));
        }
    }

    private final Pair<Float, Float> calculateEdgeStartPosition(TaskDescription taskDescription, RouteEdgeNew routeEdgeNew, RectF rectF, int i, int i2, boolean z, boolean z2) {
        float fCopydefault;
        float fFloatValue;
        float f;
        float fCenterY;
        if (routeEdgeNew.getFromIndex() == 0) {
            fCopydefault = taskDescription.fJNWhG();
        } else if (z2 && rectF != null) {
            fCopydefault = rectF.centerX();
        } else {
            fCopydefault = rectF != null ? rectF.right : taskDescription.copydefault(routeEdgeNew.getFromIndex()) + this.nodeWidth;
            if (z && rectF != null) {
                fCopydefault = rectF.centerX();
            }
        }
        if (routeEdgeNew.getFromIndex() == 0) {
            fCenterY = taskDescription.EZpvd(i2);
        } else {
            if ((z2 || z) && rectF != null) {
                Float f2 = taskDescription.isConnected().get(Integer.valueOf(i));
                fFloatValue = f2 != null ? f2.floatValue() : this.paddingV;
                f = this.nodeHeight;
            } else if (rectF != null) {
                fCenterY = rectF.centerY();
            } else {
                Float f3 = taskDescription.isConnected().get(Integer.valueOf(i));
                fFloatValue = f3 != null ? f3.floatValue() : this.paddingV;
                f = this.nodeHeight / 2;
            }
            fCenterY = fFloatValue + f;
        }
        return C56390yDp.OLrzqt(Float.valueOf(fCopydefault), Float.valueOf(fCenterY));
    }

    private final Pair<RouteNodeKey, RectF> getOrSynthesizeEndNodePair(TaskDescription taskDescription, RouteEdgeNew routeEdgeNew, int i, boolean z, boolean z2, RouteNodeKey routeNodeKey) {
        if (routeEdgeNew.getToIndex() != taskDescription.fARcdN()) {
            return null;
        }
        Pair<RouteNodeKey, RectF> pair = taskDescription.ejfBZ().get(Integer.valueOf(i));
        if (z && routeEdgeNew.getFromIndex() > 0 && !z2) {
            Integer num = taskDescription.values().get(routeNodeKey);
            pair = taskDescription.ejfBZ().get(Integer.valueOf(num != null ? num.intValue() : i));
        }
        if (pair != null) {
            return pair;
        }
        float fEZpvd = taskDescription.EZpvd(i) - (this.nodeHeight / 2.0f);
        float fCopydefault = taskDescription.copydefault(taskDescription.fARcdN());
        RouteNodeKey routeNodeKey2 = new RouteNodeKey(taskDescription.fARcdN(), "__end_lane_" + i);
        RectF rectF = new RectF(fCopydefault, fEZpvd, this.nodeWidth + fCopydefault, this.nodeHeight + fEZpvd);
        taskDescription.ejfBZ().put(Integer.valueOf(i), C56390yDp.OLrzqt(routeNodeKey2, rectF));
        taskDescription.fIwbmz().put(routeNodeKey2, rectF);
        taskDescription.AuCTel().put(routeNodeKey2, RouteNodeMeta.copy$default(taskDescription.djBIcL().getEndMeta(), null, null, collectPoolsForLane(taskDescription, i), 3, null));
        return C56390yDp.OLrzqt(routeNodeKey2, rectF);
    }

    private final float calculateBendX(TaskDescription taskDescription, RouteEdgeNew routeEdgeNew, float f, float f2, RectF rectF, boolean z, boolean z2, boolean z3) {
        Integer num;
        if (z2 && rectF != null) {
            return rectF.centerX();
        }
        if (z3 && routeEdgeNew.getToIndex() == taskDescription.fARcdN() && routeEdgeNew.getFromIndex() > 0) {
            return f2;
        }
        if (z && routeEdgeNew.getFromIndex() > 0) {
            return rectF != null ? rectF.centerX() : f;
        }
        Float fValueOf = (routeEdgeNew.getFromIndex() <= 0 || (num = taskDescription.copydefault().AEQbTJ().get(Integer.valueOf(routeEdgeNew.getFromIndex()))) == null || num.intValue() <= 0 || rectF == null) ? null : Float.valueOf(rectF.right + this.colGap + (this.nodeWidth / 2.0f));
        if (routeEdgeNew.getToIndex() == taskDescription.fARcdN() && routeEdgeNew.getFromIndex() > 0) {
            return Math.max(((f2 - f) * 0.35f) + f, f + this.colGap);
        }
        if (!z || fValueOf == null) {
            return z ? Math.max(((f2 - f) * 0.35f) + f, f + this.colGap) : f2 + (this.nodeWidth / 2.0f);
        }
        return fValueOf.floatValue();
    }

    private final List<PointF> buildPolylinePoints(TaskDescription taskDescription, RouteEdgeNew routeEdgeNew, float f, float f2, float f3, float f4, float f5, boolean z) {
        if (z) {
            RectF rectF = taskDescription.KWHzl().get(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()));
            if (rectF != null) {
                float fCenterY = rectF.centerY();
                float f6 = rectF.right;
                return yDY.gEmmrt(new PointF(f, f2), new PointF(f5, fCenterY), new PointF(f6, fCenterY), new PointF(f6, f4), new PointF(f3, f4));
            }
            return yDY.gEmmrt(new PointF(f, f2), new PointF(f5, f2), new PointF(f5, f4), new PointF(f3, f4));
        }
        return yDY.gEmmrt(new PointF(f, f2), new PointF(f5, f2), new PointF(f5, f4), new PointF(f3, f4));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void generatePolylines(TaskDescription taskDescription) {
        Integer num;
        int iIntValue;
        int i;
        float fCopydefault;
        RectF rectF;
        float f;
        float fCenterY;
        for (RouteEdgeNew routeEdgeNew : taskDescription.djBIcL().getEdges()) {
            RouteNodeKey routeNodeKey = new RouteNodeKey(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress());
            RouteNodeKey routeNodeKey2 = new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress());
            Integer num2 = taskDescription.gEmmrt().get(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()));
            if (num2 != null) {
                iIntValue = num2.intValue();
            } else {
                if (routeEdgeNew.getFromIndex() == 0) {
                    num = taskDescription.fetchVPNInfo().get(new StateListAnimator(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), poolSignatureOf(routeEdgeNew)));
                } else {
                    num = taskDescription.values().get(routeNodeKey);
                }
                if (num != null || (num = taskDescription.values().get(routeNodeKey2)) != null) {
                    iIntValue = num.intValue();
                } else {
                    i = 0;
                    RectF rectF2 = taskDescription.fIwbmz().get(routeNodeKey);
                    Integer num3 = taskDescription.values().get(routeNodeKey);
                    int iIntValue2 = num3 == null ? num3.intValue() : i;
                    boolean z = iIntValue2 == i;
                    boolean z2 = num2 == null && routeEdgeNew.getFromIndex() > 0;
                    boolean zContains = taskDescription.DbNXlk().contains(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()));
                    Pair<Float, Float> pairCalculateEdgeStartPosition = calculateEdgeStartPosition(taskDescription, routeEdgeNew, rectF2, iIntValue2, i, z, z2);
                    float fFloatValue = pairCalculateEdgeStartPosition.component1().floatValue();
                    float fFloatValue2 = pairCalculateEdgeStartPosition.component2().floatValue();
                    Pair<RouteNodeKey, RectF> orSynthesizeEndNodePair = getOrSynthesizeEndNodePair(taskDescription, routeEdgeNew, i, zContains, z2, routeNodeKey);
                    if (routeEdgeNew.getToIndex() != taskDescription.fARcdN() && orSynthesizeEndNodePair != null) {
                        fCopydefault = orSynthesizeEndNodePair.getSecond().left;
                    } else {
                        RectF rectF3 = taskDescription.fIwbmz().get(routeNodeKey2);
                        fCopydefault = rectF3 == null ? rectF3.left : taskDescription.copydefault(routeNodeKey2.getTokenIndex());
                    }
                    float f2 = fCopydefault;
                    if (routeEdgeNew.getToIndex() != taskDescription.fARcdN() && orSynthesizeEndNodePair != null) {
                        fCenterY = orSynthesizeEndNodePair.getSecond().centerY();
                    } else {
                        rectF = taskDescription.fIwbmz().get(routeNodeKey2);
                        if (rectF == null) {
                            fCenterY = rectF.centerY();
                        } else {
                            f = fFloatValue2;
                            taskDescription.uzCIH().add(new Polyline(buildPolylinePoints(taskDescription, routeEdgeNew, fFloatValue, fFloatValue2, f2, f, calculateBendX(taskDescription, routeEdgeNew, fFloatValue, f2, rectF2, z, z2, zContains), z2), false, false));
                        }
                    }
                    f = fCenterY;
                    taskDescription.uzCIH().add(new Polyline(buildPolylinePoints(taskDescription, routeEdgeNew, fFloatValue, fFloatValue2, f2, f, calculateBendX(taskDescription, routeEdgeNew, fFloatValue, f2, rectF2, z, z2, zContains), z2), false, false));
                }
            }
            i = iIntValue;
            RectF rectF22 = taskDescription.fIwbmz().get(routeNodeKey);
            Integer num32 = taskDescription.values().get(routeNodeKey);
            if (num32 == null) {
            }
            if (iIntValue2 == i) {
            }
            if (num2 == null) {
            }
            boolean zContains2 = taskDescription.DbNXlk().contains(new Application(routeEdgeNew.getFromIndex(), routeEdgeNew.getFromAddress(), routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress(), routeEdgeNew.getPercentDisplay()));
            Pair<Float, Float> pairCalculateEdgeStartPosition2 = calculateEdgeStartPosition(taskDescription, routeEdgeNew, rectF22, iIntValue2, i, z, z2);
            float fFloatValue3 = pairCalculateEdgeStartPosition2.component1().floatValue();
            float fFloatValue22 = pairCalculateEdgeStartPosition2.component2().floatValue();
            Pair<RouteNodeKey, RectF> orSynthesizeEndNodePair2 = getOrSynthesizeEndNodePair(taskDescription, routeEdgeNew, i, zContains2, z2, routeNodeKey);
            if (routeEdgeNew.getToIndex() != taskDescription.fARcdN()) {
                RectF rectF32 = taskDescription.fIwbmz().get(routeNodeKey2);
                if (rectF32 == null) {
                }
            }
            float f22 = fCopydefault;
            if (routeEdgeNew.getToIndex() != taskDescription.fARcdN()) {
                rectF = taskDescription.fIwbmz().get(routeNodeKey2);
                if (rectF == null) {
                }
            }
            taskDescription.uzCIH().add(new Polyline(buildPolylinePoints(taskDescription, routeEdgeNew, fFloatValue3, fFloatValue22, f22, f, calculateBendX(taskDescription, routeEdgeNew, fFloatValue3, f22, rectF22, z, z2, zContains2), z2), false, false));
        }
        for (Map.Entry<Integer, Pair<RouteNodeKey, RectF>> entry : taskDescription.ejfBZ().entrySet()) {
            int iIntValue3 = entry.getKey().intValue();
            RectF second = entry.getValue().getSecond();
            float fEZpvd = taskDescription.EZpvd(iIntValue3);
            float f3 = second.right;
            float fIwGUEr = taskDescription.iwGUEr();
            float f4 = this.colGap;
            taskDescription.uzCIH().add(new Polyline(yDY.gEmmrt(new PointF(f3, fEZpvd), new PointF(Math.max(f3 + f4, fIwGUEr - f4), fEZpvd), new PointF(fIwGUEr, fEZpvd)), false, false));
        }
    }

    private final LaneLayoutResult computeFinalDimensions(TaskDescription taskDescription) {
        boolean z;
        if (taskDescription.AhwBna().size() > 1) {
            z = true;
            break;
        }
        Map<RouteNodeKey, List<RouteEdgeNew>> mapHDKMBd = taskDescription.hDKMBd();
        if (!mapHDKMBd.isEmpty()) {
            for (Map.Entry<RouteNodeKey, List<RouteEdgeNew>> entry : mapHDKMBd.entrySet()) {
                RouteNodeKey key = entry.getKey();
                List<RouteEdgeNew> value = entry.getValue();
                if (key.getTokenIndex() != 0) {
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(value, 10));
                    for (RouteEdgeNew routeEdgeNew : value) {
                        arrayList.add(C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew.getToIndex()), routeEdgeNew.getToAddress()));
                    }
                    if (CollectionsKt___CollectionsKt.OqFWZa(arrayList).size() > 1) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(taskDescription.values().values());
        linkedHashSet.addAll(taskDescription.fetchVPNInfo().values());
        linkedHashSet.addAll(taskDescription.gEmmrt().values());
        Integer num = (Integer) CollectionsKt___CollectionsKt.UeEOUB(linkedHashSet);
        int iIntValue = (num != null ? num.intValue() : taskDescription.AkhnZx() - 1) + 1;
        if (iIntValue > taskDescription.AkhnZx()) {
            taskDescription.AEQbTJ(iIntValue);
        }
        float fEZpvd = taskDescription.EZpvd(0);
        float f = fEZpvd - this.firstLineYOffsetFromTrunk;
        Integer num2 = (Integer) CollectionsKt___CollectionsKt.UeEOUB(taskDescription.fetchVPNInfo().values());
        float fEZpvd2 = z ? taskDescription.EZpvd(num2 != null ? num2.intValue() : 0) : fEZpvd;
        Integer num3 = (Integer) CollectionsKt___CollectionsKt.UeEOUB(taskDescription.ejfBZ().keySet());
        int iIntValue2 = num3 != null ? num3.intValue() : 0;
        if (z) {
            fEZpvd = taskDescription.EZpvd(iIntValue2);
        }
        float f2 = fEZpvd2 < f ? f : fEZpvd2;
        float f3 = fEZpvd < f ? f : fEZpvd;
        int iIwGUEr = (int) (taskDescription.iwGUEr() + this.trunkPaddingX);
        int iValueOf = (int) ((this.paddingV * 2) + taskDescription.valueOf() + (taskDescription.AkhnZx() * this.nodeHeight) + ((taskDescription.AkhnZx() - 1) * this.rowGap));
        Map<RouteNodeKey, RectF> mapFIwbmz = taskDescription.fIwbmz();
        Map<RouteNodeKey, RouteNodeMeta> mapAuCTel = taskDescription.AuCTel();
        List<Capsule> listEZpvd = taskDescription.EZpvd();
        List<Polyline> listUzCIH = taskDescription.uzCIH();
        RouteNodeMeta startMeta = taskDescription.djBIcL().getStartMeta();
        RouteNodeMeta endMeta = taskDescription.djBIcL().getEndMeta();
        float fFJNWhG = taskDescription.fJNWhG();
        float fIwGUEr = taskDescription.iwGUEr();
        float fAEQbTJ = taskDescription.AEQbTJ();
        float f4 = this.nodeHeight;
        return new LaneLayoutResult(mapFIwbmz, mapAuCTel, listEZpvd, listUzCIH, startMeta, endMeta, fFJNWhG, fIwGUEr, f, f2, f3, fAEQbTJ, f4 + this.rowGap, f4, iIwGUEr, iValueOf);
    }

    public static /* synthetic */ LaneLayoutResult layoutDag$default(LaneLayoutNew laneLayoutNew, RouteNewGraph routeNewGraph, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return laneLayoutNew.layoutDag(routeNewGraph, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LaneLayoutResult layoutDag(RouteNewGraph routeNewGraph, Integer num) {
        int maxIndex = routeNewGraph.getMaxIndex();
        List<RouteEdgeNew> edges = routeNewGraph.getEdges();
        ArrayList arrayList = new ArrayList();
        for (Object obj : edges) {
            if (((RouteEdgeNew) obj).getFromIndex() == 0) {
                arrayList.add(obj);
            }
        }
        List<RouteEdgeNew> listEZpvd = this.config.getSortFirstByWeight() ? CollectionsKt___CollectionsKt.EZpvd(arrayList, new PendingIntent()) : arrayList;
        FragmentManager fragmentManagerAnalyzeRoute = analyzeRoute(routeNewGraph, maxIndex, listEZpvd);
        TaskDescription taskDescription = new TaskDescription(this, routeNewGraph, maxIndex, listEZpvd, fragmentManagerAnalyzeRoute, computeBaseLanes(routeNewGraph, fragmentManagerAnalyzeRoute));
        initializeXCoordinates(taskDescription);
        createInitialNodeRects(taskDescription);
        createTrunkCapsules(taskDescription);
        processSplitBranches(taskDescription);
        propagateLanes(taskDescription);
        synthesizeEndNodes(taskDescription);
        generatePolylines(taskDescription);
        return computeFinalDimensions(taskDescription);
    }

    private final FragmentManager analyzeRoute(RouteNewGraph routeNewGraph, int i, List<RouteEdgeNew> list) {
        ArrayList<RouteEdgeNew> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((RouteEdgeNew) obj).getToIndex() == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        for (RouteEdgeNew routeEdgeNew : arrayList) {
            arrayList2.add(new RouteNodeKey(routeEdgeNew.getToIndex(), routeEdgeNew.getToAddress()));
        }
        Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList2);
        List<RouteEdgeNew> edges = routeNewGraph.getEdges();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : edges) {
            RouteEdgeNew routeEdgeNew2 = (RouteEdgeNew) obj2;
            RouteNodeKey routeNodeKey = new RouteNodeKey(routeEdgeNew2.getFromIndex(), routeEdgeNew2.getFromAddress());
            Object arrayList3 = linkedHashMap.get(routeNodeKey);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(routeNodeKey, arrayList3);
            }
            ((List) arrayList3).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            RouteNodeKey routeNodeKey2 = (RouteNodeKey) entry.getKey();
            List<RouteEdgeNew> list2 = (List) entry.getValue();
            if (routeNodeKey2.getTokenIndex() != 0 && isSplitEdges(list2)) {
                Integer num = (Integer) linkedHashMap2.get(Integer.valueOf(routeNodeKey2.getTokenIndex()));
                linkedHashMap2.put(Integer.valueOf(routeNodeKey2.getTokenIndex()), Integer.valueOf(Math.max(num != null ? num.intValue() : 0, 1)));
            }
        }
        ArrayList arrayList4 = new ArrayList();
        int i2 = 0;
        int size = 0;
        for (Object obj3 : list) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            RouteEdgeNew routeEdgeNew3 = (RouteEdgeNew) obj3;
            if (i2 == 0) {
                size = 0;
            }
            arrayList4.add(Integer.valueOf(size));
            List<RouteEdgeNew> listAhwBna = (List) linkedHashMap.get(new RouteNodeKey(routeEdgeNew3.getToIndex(), routeEdgeNew3.getToAddress()));
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            if ((!listAhwBna.isEmpty()) && isSplitEdges(listAhwBna)) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj4 : listAhwBna) {
                    RouteEdgeNew routeEdgeNew4 = (RouteEdgeNew) obj4;
                    Pair pairOLrzqt = C56390yDp.OLrzqt(Integer.valueOf(routeEdgeNew4.getToIndex()), routeEdgeNew4.getToAddress());
                    Object arrayList5 = linkedHashMap3.get(pairOLrzqt);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap3.put(pairOLrzqt, arrayList5);
                    }
                    ((List) arrayList5).add(obj4);
                }
                size = size + linkedHashMap3.size() + 1;
            } else {
                size = i2 > 0 ? size + 1 : 1;
            }
            i2++;
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        int i3 = 0;
        for (Object obj5 : list) {
            if (i3 < 0) {
                yDY.AYXKKw();
            }
            RouteEdgeNew routeEdgeNew5 = (RouteEdgeNew) obj5;
            linkedHashMap4.put(new StateListAnimator(routeEdgeNew5.getToIndex(), routeEdgeNew5.getToAddress(), poolSignatureOf(routeEdgeNew5)), Integer.valueOf(((Number) arrayList4.get(i3)).intValue()));
            i3++;
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        for (RouteEdgeNew routeEdgeNew6 : list) {
            if (routeEdgeNew6.getToIndex() == i) {
                StateListAnimator stateListAnimator = new StateListAnimator(routeEdgeNew6.getToIndex(), routeEdgeNew6.getToAddress(), poolSignatureOf(routeEdgeNew6));
                StateListAnimator stateListAnimator2 = new StateListAnimator(i, routeEdgeNew6.getToAddress(), poolSignatureOf(routeEdgeNew6));
                Integer num2 = (Integer) linkedHashMap4.get(stateListAnimator);
                linkedHashMap5.put(stateListAnimator2, Integer.valueOf(num2 != null ? num2.intValue() : 0));
            }
        }
        List<RouteEdgeNew> edges2 = routeNewGraph.getEdges();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        for (Object obj6 : edges2) {
            RouteEdgeNew routeEdgeNew7 = (RouteEdgeNew) obj6;
            RouteNodeKey routeNodeKey3 = new RouteNodeKey(routeEdgeNew7.getToIndex(), routeEdgeNew7.getToAddress());
            Object arrayList6 = linkedHashMap6.get(routeNodeKey3);
            if (arrayList6 == null) {
                arrayList6 = new ArrayList();
                linkedHashMap6.put(routeNodeKey3, arrayList6);
            }
            ((List) arrayList6).add(obj6);
        }
        return new FragmentManager(i, list, setOqFWZa, linkedHashMap, linkedHashMap6, linkedHashMap2, arrayList4, linkedHashMap4, linkedHashMap5);
    }

    private final RouteEdgeNew determineKeepStraightEdge(List<RouteEdgeNew> list, int i, Map<RouteNodeKey, ? extends List<RouteEdgeNew>> map) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!hasDownstreamSplit((RouteEdgeNew) obj, i, map)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(list, 10));
        for (RouteEdgeNew routeEdgeNew : list) {
            arrayList2.add(new Triple(Integer.valueOf(routeEdgeNew.getToIndex()), routeEdgeNew.getToAddress(), poolSignatureOf(routeEdgeNew)));
        }
        Object next = null;
        if (CollectionsKt___CollectionsKt.OqFWZa(arrayList2).size() == 1) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    Float fFIwbmz = C59443zhD.fIwbmz(((RouteEdgeNew) next).getPercentDisplay());
                    float fFloatValue = fFIwbmz != null ? fFIwbmz.floatValue() : 0.0f;
                    do {
                        Object next2 = it.next();
                        Float fFIwbmz2 = C59443zhD.fIwbmz(((RouteEdgeNew) next2).getPercentDisplay());
                        float fFloatValue2 = fFIwbmz2 != null ? fFIwbmz2.floatValue() : 0.0f;
                        if (Float.compare(fFloatValue, fFloatValue2) > 0) {
                            next = next2;
                            fFloatValue = fFloatValue2;
                        }
                    } while (it.hasNext());
                }
            }
            return (RouteEdgeNew) next;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                if (((RouteEdgeNew) it2.next()).getToIndex() != i) {
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (it3.hasNext()) {
                                Float fFIwbmz3 = C59443zhD.fIwbmz(((RouteEdgeNew) next).getPercentDisplay());
                                float fFloatValue3 = fFIwbmz3 != null ? fFIwbmz3.floatValue() : 0.0f;
                                do {
                                    Object next3 = it3.next();
                                    Float fFIwbmz4 = C59443zhD.fIwbmz(((RouteEdgeNew) next3).getPercentDisplay());
                                    float fFloatValue4 = fFIwbmz4 != null ? fFIwbmz4.floatValue() : 0.0f;
                                    if (Float.compare(fFloatValue3, fFloatValue4) < 0) {
                                        next = next3;
                                        fFloatValue3 = fFloatValue4;
                                    }
                                } while (it3.hasNext());
                            }
                        }
                        return (RouteEdgeNew) next;
                    }
                    Iterator<T> it4 = list.iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            Float fFIwbmz5 = C59443zhD.fIwbmz(((RouteEdgeNew) next).getPercentDisplay());
                            float fFloatValue5 = fFIwbmz5 != null ? fFIwbmz5.floatValue() : 0.0f;
                            do {
                                Object next4 = it4.next();
                                Float fFIwbmz6 = C59443zhD.fIwbmz(((RouteEdgeNew) next4).getPercentDisplay());
                                float fFloatValue6 = fFIwbmz6 != null ? fFIwbmz6.floatValue() : 0.0f;
                                if (Float.compare(fFloatValue5, fFloatValue6) < 0) {
                                    next = next4;
                                    fFloatValue5 = fFloatValue6;
                                }
                            } while (it4.hasNext());
                        }
                    }
                    return (RouteEdgeNew) next;
                }
            }
        }
        Iterator<T> it5 = list.iterator();
        if (it5.hasNext()) {
            next = it5.next();
            if (it5.hasNext()) {
                Float fFIwbmz7 = C59443zhD.fIwbmz(((RouteEdgeNew) next).getPercentDisplay());
                float fFloatValue7 = fFIwbmz7 != null ? fFIwbmz7.floatValue() : 0.0f;
                do {
                    Object next5 = it5.next();
                    Float fFIwbmz8 = C59443zhD.fIwbmz(((RouteEdgeNew) next5).getPercentDisplay());
                    float fFloatValue8 = fFIwbmz8 != null ? fFIwbmz8.floatValue() : 0.0f;
                    if (Float.compare(fFloatValue7, fFloatValue8) > 0) {
                        next = next5;
                        fFloatValue7 = fFloatValue8;
                    }
                } while (it5.hasNext());
            }
        }
        return (RouteEdgeNew) next;
    }
}
