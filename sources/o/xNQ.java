package o;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.tradeapi.bean.TradeGroupData;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.exception.BizSystemException;
import com.okinc.unify_trade.trade.core.init.CoinInfoProvider$loadHttp$1$1$1;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.xKK;
import o.xNQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xNQ extends xNW {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final xBN AEQbTJ = new xBN();
    public final xBS AYXKKw = new xBS();
    public volatile java.util.List<TradeGroupData> AhwBna;
    public final MutableStateFlow<Application> KWHzl;
    public Job OLrzqt;
    public final StateFlow<Application> copydefault;

    @Override // o.xNW
    public boolean AhwBna() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.xNW
    public java.lang.String EZpvd() {
        return "CoinInfoProvider";
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xNQ.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public xNQ() {
        MutableStateFlow<Application> MutableStateFlow = StateFlowKt.MutableStateFlow(new Application(null, null, null, 7, null));
        this.KWHzl = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        this.AhwBna = yDY.AhwBna();
    }

    public static final class Application {
        public final java.util.Map<java.lang.String, TradeCoinInfo> EZpvd;
        public final java.util.List<TradeCoinInfo> OLrzqt;
        public final java.util.List<TradeCoinInfo> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xNQ$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.Map map, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                map = application.EZpvd;
            }
            if ((i & 2) != 0) {
                list = application.copydefault;
            }
            if ((i & 4) != 0) {
                list2 = application.OLrzqt;
            }
            return application.AEQbTJ(map, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.util.Map<java.lang.String, TradeCoinInfo> map, @NotNull java.util.List<TradeCoinInfo> list, @NotNull java.util.List<TradeCoinInfo> list2) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            return new Application(map, list, list2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TradeCoinInfo> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<TradeCoinInfo> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, TradeCoinInfo> copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd(this.EZpvd, application.EZpvd) && Intrinsics.EZpvd(this.copydefault, application.copydefault) && Intrinsics.EZpvd(this.OLrzqt, application.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CoinInfoState(coinsMap=" + this.EZpvd + ", originCoinsList=" + this.copydefault + ", coinList=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.util.Map<java.lang.String, TradeCoinInfo> map, @NotNull java.util.List<TradeCoinInfo> list, @NotNull java.util.List<TradeCoinInfo> list2) {
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            this.EZpvd = map;
            this.copydefault = list;
            this.OLrzqt = list2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:35)) : (r1v0 java.util.Map))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:37)) : (r3v0 java.util.List))
 A[MD:(java.util.Map<java.lang.String, com.okinc.unify_trade.biz.TradeCoinInfo>, java.util.List<com.okinc.unify_trade.biz.TradeCoinInfo>, java.util.List<com.okinc.unify_trade.biz.TradeCoinInfo>):void (m)] (LINE:34) call: o.xNQ.Application.<init>(java.util.Map, java.util.List, java.util.List):void type: THIS */
        public /* synthetic */ Application(java.util.Map map, java.util.List list, java.util.List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C56424yEw.KWHzl() : map, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? yDY.AhwBna() : list2);
        }
    }

    private final xKL<java.util.ArrayList<TradeCoinInfo>> iwGUEr() {
        return hDKMBd() ? this.AEQbTJ : this.AYXKKw;
    }

    @Override // o.xNW
    public void gEmmrt() {
        final xKL<java.util.ArrayList<TradeCoinInfo>> xklIwGUEr = iwGUEr();
        xklIwGUEr.AYXKKw();
        xklIwGUEr.KWHzl(new Function1() { // from class: o.xNN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xNQ.OLrzqt(this.EZpvd, xklIwGUEr, (ResponseData) obj);
            }
        });
        xKK.Activity.execute$default(xklIwGUEr, 0L, 1, null);
    }

    public static final Unit OLrzqt(xNQ xnq, xKL xkl, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        java.lang.String strFJNWhG = xnq.fJNWhG();
        java.lang.String strEZpvd = xnq.EZpvd();
        boolean z = responseData.getCode() == 0 && responseData.getData() != null;
        java.lang.String msg = (responseData.getCode() != 0 || responseData.getData() == null) ? responseData.getMsg() : "";
        pUU.KWHzl(strFJNWhG, "task " + strEZpvd + " loadHttp requestCoinsInfo:" + z + ";" + msg + "; costTime: " + (java.lang.System.currentTimeMillis() - xnq.AuCTel()));
        if (responseData.getCode() == 0 && responseData.getData() != null) {
            Job job = xnq.OLrzqt;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            xnq.OLrzqt = BuildersKt__Builders_commonKt.launch$default(C54585xNv.KWHzl.AhwBna(), null, null, new CoinInfoProvider$loadHttp$1$1$1(xnq, responseData, null), 3, null);
        } else {
            java.lang.Exception value = xkl.AhwBna().getValue();
            BizSystemException bizSystemException = value instanceof BizSystemException ? (BizSystemException) value : null;
            if (bizSystemException != null) {
                C6777aVl.Companion.EZpvd(bizSystemException);
            }
            xnq.AEQbTJ(false, responseData.getMsg());
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription {

        public static final class ActionBar<T> implements java.util.Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                TradeCoinInfo tradeCoinInfo = (TradeCoinInfo) t;
                java.lang.String sort = tradeCoinInfo.getSort();
                long jValueOf = Long.MAX_VALUE;
                long jValueOf2 = (sort == null || sort.length() == 0) ? Long.MAX_VALUE : C33129mqd.valueOf(tradeCoinInfo.getSort());
                TradeCoinInfo tradeCoinInfo2 = (TradeCoinInfo) t2;
                java.lang.String sort2 = tradeCoinInfo2.getSort();
                if (sort2 != null && sort2.length() != 0) {
                    jValueOf = C33129mqd.valueOf(tradeCoinInfo2.getSort());
                }
                return yET.KWHzl(java.lang.Long.valueOf(jValueOf2), java.lang.Long.valueOf(jValueOf));
            }
        }

        public final Activity OLrzqt(@NotNull java.util.ArrayList<TradeCoinInfo> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
            if (arrayList2.size() > 1) {
                C56407yEf.copydefault(arrayList2, new ActionBar());
            }
            java.util.stream.Stream streamParallelStream = arrayList2.parallelStream();
            final Function1 function1 = new Function1() { // from class: o.xNO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(xNQ.TaskDescription.copydefault((TradeCoinInfo) obj));
                }
            };
            java.util.stream.Stream streamFilter = streamParallelStream.filter(new java.util.function.Predicate() { // from class: o.xNM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return xNQ.TaskDescription.OLrzqt(function1, obj);
                }
            });
            final Function1 function12 = new Function1() { // from class: o.xNR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return xNQ.TaskDescription.KWHzl((TradeCoinInfo) obj);
                }
            };
            streamFilter.forEach(new java.util.function.Consumer() { // from class: o.xNV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    xNQ.TaskDescription.copydefault(function12, obj);
                }
            });
            return new Activity(arrayList, arrayList2);
        }

        public static final boolean OLrzqt(Function1 function1, java.lang.Object obj) {
            return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
        }

        public static final void copydefault(Function1 function1, java.lang.Object obj) {
            function1.invoke(obj);
        }

        public static final boolean copydefault(TradeCoinInfo tradeCoinInfo) {
            return C33129mqd.OLrzqt((java.lang.CharSequence) tradeCoinInfo.getUrl());
        }

        public static final Unit KWHzl(TradeCoinInfo tradeCoinInfo) {
            java.lang.String strKWHzl = C55297xhL.KWHzl(tradeCoinInfo.getUrl(), 192, 192);
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            tradeCoinInfo.setUrl(strKWHzl);
            return Unit.INSTANCE;
        }
    }

    public final java.util.ArrayList<TradeCoinInfo> KWHzl() {
        return new java.util.ArrayList<>(this.copydefault.getValue().OLrzqt());
    }

    public final java.util.ArrayList<TradeCoinInfo> AEQbTJ() {
        return new java.util.ArrayList<>(this.copydefault.getValue().EZpvd());
    }

    public final java.util.HashMap<java.lang.String, TradeCoinInfo> copydefault() {
        return new java.util.HashMap<>(this.copydefault.getValue().copydefault());
    }

    public final java.util.ArrayList<TradeGroupData> OLrzqt() {
        return new java.util.ArrayList<>(this.AhwBna);
    }

    public final void copydefault(java.util.List<TradeGroupData> list) {
        if (list != null) {
            this.AhwBna = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(list);
        }
    }

    @Override // o.xNW
    public void valueOf() {
        super.valueOf();
        Job job = this.OLrzqt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // o.xNW
    public java.util.List<xKK> djBIcL() {
        if (hDKMBd()) {
            return yDY.copydefault(this.AEQbTJ);
        }
        return yDY.copydefault(this.AYXKKw);
    }

    public static final class Activity {
        public final java.util.ArrayList<TradeCoinInfo> AEQbTJ;
        public final java.util.ArrayList<TradeCoinInfo> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.xNQ$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                arrayList = activity.copydefault;
            }
            if ((i & 2) != 0) {
                arrayList2 = activity.AEQbTJ;
            }
            return activity.AEQbTJ(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<TradeCoinInfo> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(@NotNull java.util.ArrayList<TradeCoinInfo> arrayList, @NotNull java.util.ArrayList<TradeCoinInfo> arrayList2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            return new Activity(arrayList, arrayList2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.ArrayList<TradeCoinInfo> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TradeCoinsWrapper(originCoinsInfoList=" + this.copydefault + ", coinInfoList=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.util.ArrayList<TradeCoinInfo> arrayList, @NotNull java.util.ArrayList<TradeCoinInfo> arrayList2) {
            Intrinsics.checkNotNullParameter(arrayList, "");
            Intrinsics.checkNotNullParameter(arrayList2, "");
            this.copydefault = arrayList;
            this.AEQbTJ = arrayList2;
        }
    }

    public final java.util.Map<java.lang.String, TradeCoinInfo> KWHzl(java.util.List<TradeCoinInfo> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
        for (java.lang.Object obj : list) {
            linkedHashMap.put(((TradeCoinInfo) obj).getSymbol(), obj);
        }
        return linkedHashMap;
    }

    public final void AEQbTJ(@NotNull java.util.List<TradeCoinInfo> list) {
        Application value;
        Intrinsics.checkNotNullParameter(list, "");
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, Application.copy$default(value, KWHzl(list), null, list, 2, null)));
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Application value;
        Intrinsics.checkNotNullParameter(activity, "");
        MutableStateFlow<Application> mutableStateFlow = this.KWHzl;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, value.AEQbTJ(KWHzl(activity.AEQbTJ()), activity.OLrzqt(), activity.AEQbTJ())));
    }
}
