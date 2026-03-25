package o;

import com.okinc.core.livelistener.OKIncomingData;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.biz.FutureInstrument;
import com.okinc.unify_trade.biz.subscribe.TickerCupReq;
import com.okinc.unify_trade.biz.subscribe.TickerInstReq;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import com.okinc.unify_trade.trade.source.task.WatchSourceTask$createCountDownListener$1;
import com.okinc.unify_trade.trade.source.task.WatchSourceTask$createTickerListeners$1$1;
import com.okinc.unify_trade.trade.source.task.WatchSourceTask$createTickerListeners$2$1;
import com.okinc.unify_trade.trade.source.task.WatchSourceTask$createTickerListeners$3$1;
import com.okinc.websocket.v5config.WsArgV5;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import o.C54401xHa;
import o.C54407xHg;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xTG {
    public final long AEQbTJ;
    public final xTK AYXKKw;
    public boolean AhwBna;
    public AbstractC57556yke AkhnZx;
    public final boolean AuCTel;
    public final ConcurrentHashMap<java.lang.String, TickersData> DbNXlk;
    public InterfaceC58217yxC EZpvd;
    public final java.lang.String KWHzl;
    public boolean OLrzqt;
    public Job copydefault;
    public boolean djBIcL;
    public final ConcurrentHashMap<java.lang.String, TickersData> ejfBZ;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> fARcdN;
    public final ConcurrentHashMap<java.lang.String, TickersData> fIwbmz;
    public final java.util.HashMap<java.lang.String, java.lang.String> fJNWhG;
    public AbstractC57556yke fetchVPNInfo;
    public volatile boolean gEmmrt;
    public final CoroutineScope getFieldNames;
    public final java.util.HashMap<java.lang.String, TickersData> getNewProxyInstance;
    public final java.util.List<WatchListData> hDKMBd;
    public final C58216yxB isConnected;
    public final java.util.HashMap<java.lang.String, TickersData> uzCIH;
    public C56131xwy valueOf;
    public AbstractC57556yke values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, TickersData> AEQbTJ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, TickersData> EZpvd() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<WatchListData> KWHzl() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AhwBna;
    }

    public static final class Activity extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ xTG EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(CoroutineExceptionHandler.Key key, xTG xtg) {
            super(key);
            this.EZpvd = xtg;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            C43296rmc.copydefault(this.EZpvd.KWHzl, "CoroutineExceptionHandler", th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public xTG(@NotNull java.util.List<WatchListData> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, xTK xtk, @NotNull java.util.HashMap<java.lang.String, TickersData> map, @NotNull java.util.HashMap<java.lang.String, TickersData> map2, boolean z) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.hDKMBd = list;
        this.fARcdN = function2;
        this.AYXKKw = xtk;
        this.getNewProxyInstance = map;
        this.uzCIH = map2;
        this.AuCTel = z;
        this.AEQbTJ = 3500L;
        this.KWHzl = "WatchSourceTask";
        this.AhwBna = true;
        this.fJNWhG = new java.util.HashMap<>();
        this.valueOf = new C56131xwy();
        this.isConnected = new C58216yxB();
        this.fIwbmz = new ConcurrentHashMap<>(map);
        this.ejfBZ = new ConcurrentHashMap<>();
        this.DbNXlk = new ConcurrentHashMap<>(map2);
        this.getFieldNames = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null).plus(Dispatchers.getDefault()).plus(new Activity(CoroutineExceptionHandler.Key, this)));
        gEmmrt();
        EZpvd(list);
        djBIcL();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(@NotNull java.util.List<WatchListData> list) {
        BizInstrument minSuggestedInstrument$default;
        CountDownInfo countDownInfoAEQbTJ;
        CountDownInfo countDownInfo;
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(list, "");
        pUU.EZpvd(this.KWHzl, "createInstIds() called with: list ");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap map = new java.util.HashMap();
        java.util.List<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> arrayList3 = new java.util.ArrayList<>();
        java.util.List<Triple<java.lang.Long, java.lang.String, java.lang.String>> arrayList4 = new java.util.ArrayList<>();
        for (WatchListData watchListData : list) {
            java.lang.String instType = watchListData.getInstType();
            int iHashCode = instType.hashCode();
            if (iHashCode != -1956807563) {
                if (iHashCode != 2074257) {
                    if (iHashCode == 214415088 && instType.equals("FUTURES")) {
                        java.lang.String strCopydefault = copydefault(watchListData.getInstId(), watchListData.getAlias());
                        arrayList.add(strCopydefault);
                        java.lang.String strKWHzl = KWHzl(strCopydefault, "FUTURES");
                        if (strKWHzl == null) {
                            strKWHzl = "";
                        }
                        java.lang.String strOLrzqt = OLrzqt(strCopydefault, "FUTURES");
                        if (strOLrzqt == null) {
                            strOLrzqt = "";
                        }
                        map.put(strKWHzl, strKWHzl);
                        map.put(strOLrzqt, strOLrzqt);
                        arrayList3.add(new kotlin.Pair<>(strCopydefault, watchListData.getInstType()));
                        arrayList3.add(new kotlin.Pair<>(strKWHzl, "COIN"));
                    } else {
                        java.lang.String strKWHzl2 = KWHzl(watchListData.getInstId(), watchListData.getInstType());
                        java.lang.String str = strKWHzl2 == null ? "" : strKWHzl2;
                        java.lang.String strOLrzqt2 = OLrzqt(watchListData.getInstId(), watchListData.getInstType());
                        java.lang.String str2 = strOLrzqt2 == null ? "" : strOLrzqt2;
                        InterfaceC54581xNr interfaceC54581xNrCopydefault = pWO.KWHzl().copydefault();
                        minSuggestedInstrument$default = interfaceC54581xNrCopydefault != null ? InterfaceC54581xNr.TaskDescription.getMinSuggestedInstrument$default(interfaceC54581xNrCopydefault, watchListData.getInstId(), watchListData.getInstType(), null, null, 12, null) : null;
                        if (minSuggestedInstrument$default != null && (countDownInfoAEQbTJ = xUD.AEQbTJ(minSuggestedInstrument$default.getInstId(), minSuggestedInstrument$default.getInstType())) != null) {
                            countDownInfo = countDownInfoAEQbTJ.countDownTimeExpire() ? countDownInfoAEQbTJ : null;
                            if (countDownInfo != null) {
                                try {
                                    Result.Application application = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Boolean.valueOf(arrayList4.add(new Triple<>(java.lang.Long.valueOf(C33129mqd.valueOf(countDownInfo.getOnlineTime()) - java.lang.System.currentTimeMillis()), str, watchListData.getInstId()))));
                                } catch (java.lang.Throwable th) {
                                    Result.Application application2 = Result.Companion;
                                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                                }
                                Result.m7376boximpl(objM7377constructorimpl);
                            }
                        }
                        map.put(str, str);
                        map.put(str2, str2);
                        arrayList.add(watchListData.getInstId());
                        arrayList3.add(new kotlin.Pair<>(watchListData.getInstId(), watchListData.getInstType()));
                        arrayList3.add(new kotlin.Pair<>(str, "COIN"));
                        EZpvd(arrayList3, str2, "COIN");
                    }
                } else if (instType.equals("COIN")) {
                    this.OLrzqt = true;
                    map.put(watchListData.getInstId(), watchListData.getInstId());
                    arrayList3.add(new kotlin.Pair<>(watchListData.getInstId(), watchListData.getInstType()));
                } else {
                    java.lang.String strKWHzl22 = KWHzl(watchListData.getInstId(), watchListData.getInstType());
                    if (strKWHzl22 == null) {
                    }
                    java.lang.String strOLrzqt22 = OLrzqt(watchListData.getInstId(), watchListData.getInstType());
                    if (strOLrzqt22 == null) {
                    }
                    InterfaceC54581xNr interfaceC54581xNrCopydefault2 = pWO.KWHzl().copydefault();
                    if (interfaceC54581xNrCopydefault2 != null) {
                    }
                    if (minSuggestedInstrument$default != null) {
                        if (countDownInfoAEQbTJ.countDownTimeExpire()) {
                        }
                        if (countDownInfo != null) {
                        }
                    }
                    map.put(str, str);
                    map.put(str2, str2);
                    arrayList.add(watchListData.getInstId());
                    arrayList3.add(new kotlin.Pair<>(watchListData.getInstId(), watchListData.getInstType()));
                    arrayList3.add(new kotlin.Pair<>(str, "COIN"));
                    EZpvd(arrayList3, str2, "COIN");
                }
            } else if (instType.equals("OPTION")) {
                java.lang.String strKWHzl3 = KWHzl(watchListData.getInstId(), "OPTION");
                if (strKWHzl3 == null) {
                    strKWHzl3 = "";
                }
                map.put(strKWHzl3, strKWHzl3);
                arrayList2.add(watchListData.getInstId());
                arrayList.add(watchListData.getInstId());
                arrayList3.add(new kotlin.Pair<>(watchListData.getInstId(), watchListData.getInstType()));
                arrayList3.add(new kotlin.Pair<>(strKWHzl3, "COIN"));
            } else {
                java.lang.String strKWHzl222 = KWHzl(watchListData.getInstId(), watchListData.getInstType());
                if (strKWHzl222 == null) {
                }
                java.lang.String strOLrzqt222 = OLrzqt(watchListData.getInstId(), watchListData.getInstType());
                if (strOLrzqt222 == null) {
                }
                InterfaceC54581xNr interfaceC54581xNrCopydefault22 = pWO.KWHzl().copydefault();
                if (interfaceC54581xNrCopydefault22 != null) {
                }
                if (minSuggestedInstrument$default != null) {
                }
                map.put(str, str);
                map.put(str2, str2);
                arrayList.add(watchListData.getInstId());
                arrayList3.add(new kotlin.Pair<>(watchListData.getInstId(), watchListData.getInstType()));
                arrayList3.add(new kotlin.Pair<>(str, "COIN"));
                EZpvd(arrayList3, str2, "COIN");
            }
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            atomicInteger.incrementAndGet();
            pUU.KWHzl(this.KWHzl, "batchMarketTickers: start");
            this.isConnected.AEQbTJ(qTN.EZpvd(new TickerInstReq(arrayList), new ActionBar(atomicInteger)));
        }
        if (C33129mqd.KWHzl((java.util.Collection) arrayList2)) {
            atomicInteger.incrementAndGet();
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(arrayList2.size()), 50)) {
                arrayList2 = CollectionsKt___CollectionsKt.copydefault((java.util.List) arrayList2, new kotlin.ranges.IntRange(0, 49));
            }
            copydefault(arrayList2, atomicInteger);
        }
        if (map.size() > 0) {
            atomicInteger.incrementAndGet();
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList5.add(((Map.Entry) it.next()).getKey());
            }
            if (arrayList5.size() > 50) {
                this.isConnected.AEQbTJ(qTN.EZpvd(new Application(atomicInteger)));
            } else {
                InterfaceC58217yxC interfaceC58217yxCKWHzl = KWHzl(arrayList5, atomicInteger);
                if (interfaceC58217yxCKWHzl != null) {
                    this.isConnected.AEQbTJ(interfaceC58217yxCKWHzl);
                }
            }
        }
        try {
            Result.Application application3 = Result.Companion;
            if (atomicInteger.get() == 0) {
                this.djBIcL = true;
                valueOf();
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th2) {
            Result.Application application4 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th2));
        }
        KWHzl(arrayList3);
        copydefault(arrayList4);
        pUU.EZpvd(this.KWHzl, "createInstIds() called with: list end ");
    }

    public static final class ActionBar implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ AtomicInteger copydefault;

        public ActionBar(AtomicInteger atomicInteger) {
            this.copydefault = atomicInteger;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (z) {
                xTG.this.AYXKKw(list);
                xTG.this.EZpvd(this.copydefault);
                pUU.KWHzl(xTG.this.KWHzl, "batchMarketTickers: end");
            }
        }
    }

    public static final class Application implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ AtomicInteger copydefault;

        public Application(AtomicInteger atomicInteger) {
            this.copydefault = atomicInteger;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            if (z) {
                xTG.this.AEQbTJ(list);
                xTG.this.EZpvd(this.copydefault);
            }
        }
    }

    public final void copydefault(java.util.List<Triple<java.lang.Long, java.lang.String, java.lang.String>> list) {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.copydefault = BuildersKt__Builders_commonKt.launch$default(this.getFieldNames, null, null, new WatchSourceTask$createCountDownListener$1(list, this, null), 3, null);
    }

    public static final class TaskDescription implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ AtomicInteger EZpvd;

        public TaskDescription(AtomicInteger atomicInteger) {
            this.EZpvd = atomicInteger;
        }

        /* JADX DEBUG: Method merged with bridge method: EZpvd(ZLjava/lang/Object;Ljava/lang/Exception;)V */
        @Override // o.InterfaceC55701xos
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void EZpvd(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            xVP.OLrzqt.OLrzqt(xTG.this.KWHzl, " WatchList Option Ticker Http result isSuccess:" + z + ",exp:" + (exc != null ? exc.getMessage() : null));
            if (z) {
                xTG.this.OLrzqt(list);
                AtomicInteger atomicInteger = this.EZpvd;
                if (atomicInteger == null) {
                    xTG.this.valueOf();
                } else {
                    xTG.this.EZpvd(atomicInteger);
                }
            }
        }
    }

    public final void copydefault(java.util.List<java.lang.String> list, AtomicInteger atomicInteger) {
        InterfaceC58217yxC interfaceC58217yxCCopydefault;
        if (this.isConnected.isDisposed() || (interfaceC58217yxCCopydefault = this.valueOf.copydefault(list, new TaskDescription(atomicInteger))) == null) {
            return;
        }
        this.isConnected.AEQbTJ(interfaceC58217yxCCopydefault);
    }

    public final InterfaceC58217yxC KWHzl(java.util.List<java.lang.String> list, AtomicInteger atomicInteger) {
        pUU.KWHzl(this.KWHzl, "batchCupTickers: start");
        if (this.isConnected.isDisposed()) {
            return null;
        }
        return qTN.copydefault(new TickerCupReq(list), new StateListAnimator(atomicInteger));
    }

    public static final class StateListAnimator implements InterfaceC55701xos<java.util.List<? extends TickersData>> {
        public final /* synthetic */ AtomicInteger OLrzqt;

        public StateListAnimator(AtomicInteger atomicInteger) {
            this.OLrzqt = atomicInteger;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [boolean, java.lang.Object, java.lang.Exception] */
        @Override // o.InterfaceC55701xos
        public /* bridge */ /* synthetic */ void EZpvd(boolean z, java.util.List<? extends TickersData> list, java.lang.Exception exc) {
            EZpvd2(z, (java.util.List<TickersData>) list, exc);
        }

        /* JADX INFO: renamed from: EZpvd, reason: avoid collision after fix types in other method */
        public void EZpvd2(boolean z, java.util.List<TickersData> list, java.lang.Exception exc) {
            pUU.KWHzl(xTG.this.KWHzl, "batchCupTickers: end");
            if (z) {
                xTG.this.AEQbTJ(list);
                AtomicInteger atomicInteger = this.OLrzqt;
                if (atomicInteger == null) {
                    xTG.this.valueOf();
                } else {
                    xTG.this.EZpvd(atomicInteger);
                }
            }
        }
    }

    public final void EZpvd(AtomicInteger atomicInteger) {
        synchronized (this) {
            if (atomicInteger.decrementAndGet() == 0) {
                this.djBIcL = true;
                this.fARcdN.invoke(java.lang.Boolean.TRUE, null);
            }
        }
    }

    public final void valueOf() {
        synchronized (this) {
            this.fARcdN.invoke(java.lang.Boolean.TRUE, null);
        }
    }

    public final void KWHzl(java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list) {
        if (this.AuCTel) {
            C57567ykp v5Connection$default = C54401xHa.TaskDescription.getV5Connection$default(C54401xHa.Companion, null, false, false, false, false, null, 63, null);
            java.util.ArrayList<? extends InterfaceC57559ykh> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList<? extends InterfaceC57559ykh> arrayList2 = new java.util.ArrayList<>();
            java.util.ArrayList<? extends InterfaceC57559ykh> arrayList3 = new java.util.ArrayList<>();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (kotlin.Pair<java.lang.String, java.lang.String> pair : list) {
                if (!Intrinsics.EZpvd((java.lang.Object) pair.getSecond(), (java.lang.Object) "COIN") && !Intrinsics.EZpvd((java.lang.Object) pair.getSecond(), (java.lang.Object) "OPTION")) {
                    if (!arrayList4.contains(pair.getFirst())) {
                        arrayList.add(new WsArgV5("tickers-3s", pair.getFirst(), null, null, null, null, null, null, 252, null));
                        arrayList4.add(pair.getFirst());
                    }
                } else if (Intrinsics.EZpvd((java.lang.Object) pair.getSecond(), (java.lang.Object) "OPTION")) {
                    if (!arrayList4.contains(pair.getFirst())) {
                        arrayList2.add(new WsArgV5("mp-tickers-3s", pair.getFirst(), null, null, null, null, null, null, 252, null));
                        arrayList4.add(pair.getFirst());
                    }
                } else if (!arrayList4.contains(pair.getFirst())) {
                    arrayList3.add(new WsArgV5("cup-tickers-3s", null, null, null, pair.getFirst(), null, null, null, 238, null));
                    arrayList4.add(pair.getFirst());
                }
            }
            C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
            AbstractC57556yke abstractC57556ykeAEQbTJ = stateListAnimator.AEQbTJ("tickers-3s", v5Connection$default, arrayList, new Function2() { // from class: o.xTF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xTG.copydefault(this.EZpvd, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            this.fetchVPNInfo = abstractC57556ykeAEQbTJ;
            if (abstractC57556ykeAEQbTJ != null) {
                abstractC57556ykeAEQbTJ.AhwBna();
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ2 = stateListAnimator.AEQbTJ("mp-tickers-3s", v5Connection$default, arrayList2, new Function2() { // from class: o.xTL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xTG.EZpvd(this.KWHzl, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            this.AkhnZx = abstractC57556ykeAEQbTJ2;
            if (abstractC57556ykeAEQbTJ2 != null) {
                abstractC57556ykeAEQbTJ2.AhwBna();
            }
            AbstractC57556yke abstractC57556ykeAEQbTJ3 = stateListAnimator.AEQbTJ("cup-tickers-3s", v5Connection$default, arrayList3, new Function2() { // from class: o.xTO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return xTG.AYXKKw(this.EZpvd, (AbstractC33132mqg) obj, (OKIncomingData) obj2);
                }
            });
            this.values = abstractC57556ykeAEQbTJ3;
            if (abstractC57556ykeAEQbTJ3 != null) {
                abstractC57556ykeAEQbTJ3.AhwBna();
            }
        }
    }

    public static final Unit copydefault(xTG xtg, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        pVZ.safeLaunch$default(xtg.getFieldNames, null, null, new WatchSourceTask$createTickerListeners$1$1(xtg, oKIncomingData, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(xTG xtg, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        pVZ.safeLaunch$default(xtg.getFieldNames, null, null, new WatchSourceTask$createTickerListeners$2$1(xtg, oKIncomingData, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(xTG xtg, AbstractC33132mqg abstractC33132mqg, OKIncomingData oKIncomingData) {
        Intrinsics.checkNotNullParameter(abstractC33132mqg, "");
        Intrinsics.checkNotNullParameter(oKIncomingData, "");
        pVZ.safeLaunch$default(xtg.getFieldNames, null, null, new WatchSourceTask$createTickerListeners$3$1(xtg, oKIncomingData, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void djBIcL() {
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        AbstractC58247yxg<java.lang.Long> abstractC58247yxgInterval = AbstractC58247yxg.interval(this.AEQbTJ, 2000L, java.util.concurrent.TimeUnit.MILLISECONDS, C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.xTI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return xTG.OLrzqt(this.copydefault, (java.lang.Long) obj);
            }
        };
        this.EZpvd = abstractC58247yxgInterval.subscribe(new InterfaceC58227yxM() { // from class: o.xTJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                xTG.OLrzqt(function1, obj);
            }
        });
    }

    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(xTG xtg, java.lang.Long l) {
        C43296rmc.AEQbTJ(xtg.KWHzl, "------------------WatchSourceTask> check update");
        xTK xtk = xtg.AYXKKw;
        if (xtk != null && !xtk.KWHzl()) {
            xtg.AYXKKw();
        }
        C43296rmc.AEQbTJ(xtg.KWHzl, "------------------WatchSourceTask> check update still alive");
        if (xtg.gEmmrt) {
            C43296rmc.AEQbTJ(xtg.KWHzl, "------------------WatchSourceTask>update");
            xtg.gEmmrt = false;
            xtg.fARcdN.invoke(java.lang.Boolean.TRUE, null);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void parseTickers$default(xTG xtg, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        xtg.AEQbTJ(str, z, z2);
    }

    public final void AEQbTJ(java.lang.String str, boolean z, boolean z2) {
        TickersData tickersDataOLrzqt = TickersData.Companion.OLrzqt(str);
        if (tickersDataOLrzqt != null) {
            if (z) {
                if (this.fJNWhG.get(tickersDataOLrzqt.getCcy()) != null) {
                    this.gEmmrt = true;
                }
                EZpvd(tickersDataOLrzqt);
            } else {
                if (z2) {
                    OLrzqt(tickersDataOLrzqt);
                } else {
                    AEQbTJ(tickersDataOLrzqt);
                }
                this.gEmmrt = true;
            }
        }
    }

    public final java.lang.String copydefault(java.lang.String str, java.lang.String str2) {
        java.util.Collection collectionAhwBna;
        java.util.List<BizInstrument> listAhwBna;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        AbstractC54531xLw abstractC54531xLwKWHzl = xUD.KWHzl("FUTURES");
        if (abstractC54531xLwKWHzl == null || (collectionAhwBna = abstractC54531xLwKWHzl.EZpvd()) == null) {
            collectionAhwBna = yDY.AhwBna();
        }
        arrayList.addAll(collectionAhwBna);
        if (abstractC54531xLwKWHzl == null || (listAhwBna = abstractC54531xLwKWHzl.uzCIH()) == null) {
            listAhwBna = yDY.AhwBna();
        }
        arrayList.addAll(listAhwBna);
        if (C33129mqd.KWHzl((java.util.Collection) arrayList)) {
            java.util.Iterator it = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                BizInstrument bizInstrument = (BizInstrument) it.next();
                if (bizInstrument instanceof FutureInstrument) {
                    FutureInstrument futureInstrument = (FutureInstrument) bizInstrument;
                    if (Intrinsics.EZpvd((java.lang.Object) futureInstrument.getInstFly(), (java.lang.Object) str) && Intrinsics.EZpvd((java.lang.Object) futureInstrument.getAlias(), (java.lang.Object) str2)) {
                        break;
                    }
                }
                i++;
            }
            if (i != -1) {
                return ((BizInstrument) arrayList.get(i)).getInstId();
            }
        }
        return "";
    }

    public final java.lang.String KWHzl(java.lang.String str, java.lang.String str2) {
        BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
        if (watchMarketInstrument$default != null) {
            return watchMarketInstrument$default.getTradeSymbol();
        }
        return null;
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2) {
        BizInstrument watchMarketInstrument$default = xUD.getWatchMarketInstrument$default(str2, str, null, null, false, 28, null);
        if (watchMarketInstrument$default != null) {
            return watchMarketInstrument$default.getQuoteSymbol();
        }
        return null;
    }

    public final void AhwBna() {
        AbstractC57556yke abstractC57556yke = this.fetchVPNInfo;
        if (abstractC57556yke != null) {
            abstractC57556yke.djBIcL();
        }
        AbstractC57556yke abstractC57556yke2 = this.AkhnZx;
        if (abstractC57556yke2 != null) {
            abstractC57556yke2.djBIcL();
        }
        AbstractC57556yke abstractC57556yke3 = this.values;
        if (abstractC57556yke3 != null) {
            abstractC57556yke3.djBIcL();
        }
        C54407xHg.StateListAnimator stateListAnimator = C54407xHg.Companion;
        stateListAnimator.EZpvd("tickers-3s", this.fetchVPNInfo);
        stateListAnimator.EZpvd("mp-tickers-3s", this.AkhnZx);
        stateListAnimator.EZpvd("cup-tickers-3s", this.values);
        C43296rmc.AEQbTJ("datasource", "------------------WatchSourceTask>destroy");
    }

    public final void AYXKKw() {
        this.AhwBna = false;
        AhwBna();
        InterfaceC58217yxC interfaceC58217yxC = this.EZpvd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.isConnected.OLrzqt();
        CoroutineScopeKt.cancel$default(this.getFieldNames, null, 1, null);
    }

    public final void AEQbTJ(TickersData tickersData) {
        this.fIwbmz.put(tickersData.getInstId(), tickersData);
    }

    public final void OLrzqt(TickersData tickersData) {
        this.ejfBZ.put(tickersData.getInstId(), tickersData);
    }

    public final void EZpvd(TickersData tickersData) {
        this.DbNXlk.put(tickersData.getCcy(), tickersData);
    }

    public final TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fIwbmz.get(str);
    }

    public final TickersData AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TickersData tickersData = this.fIwbmz.get(str);
        TickersData tickersData2 = this.ejfBZ.get(str);
        if (tickersData == null || tickersData2 == null) {
            return tickersData2 == null ? tickersData : tickersData2;
        }
        return tickersData.copy((123131 & 1) != 0 ? tickersData.instType : null, (123131 & 2) != 0 ? tickersData.instId : null, (123131 & 4) != 0 ? tickersData.last : tickersData2.getLast(), (123131 & 8) != 0 ? tickersData.lastSz : null, (123131 & 16) != 0 ? tickersData.askPx : null, (123131 & 32) != 0 ? tickersData.askSz : null, (123131 & 64) != 0 ? tickersData.bidPx : null, (123131 & 128) != 0 ? tickersData.bidSz : null, (123131 & 256) != 0 ? tickersData.open24h : tickersData2.getOpen24h(), (123131 & 512) != 0 ? tickersData.sodUtc0 : tickersData2.getSodUtc0(), (123131 & 1024) != 0 ? tickersData.sodUtc8 : tickersData2.getSodUtc8(), (123131 & 2048) != 0 ? tickersData.high24h : tickersData2.getHigh24h(), (123131 & 4096) != 0 ? tickersData.low24h : tickersData2.getLow24h(), (123131 & 8192) != 0 ? tickersData.volCcy24h : null, (123131 & 16384) != 0 ? tickersData.vol24h : null, (123131 & 32768) != 0 ? tickersData.ccy : null, (123131 & 65536) != 0 ? tickersData.ts : null);
    }

    public final TickersData KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TickersData tickersData = this.DbNXlk.get(str);
        return (tickersData == null && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USD")) ? qTI.Companion.KWHzl() : tickersData;
    }

    public final void EZpvd(java.util.ArrayList<kotlin.Pair<java.lang.String, java.lang.String>> arrayList, java.lang.String str, java.lang.String str2) {
        int i = 0;
        for (java.lang.Object obj : arrayList) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            if (((java.lang.String) ((kotlin.Pair) obj).getFirst()).equals(str)) {
                return;
            } else {
                i++;
            }
        }
        arrayList.add(new kotlin.Pair<>(str, str2));
    }

    public final void gEmmrt() {
        for (WatchListData watchListData : this.hDKMBd) {
            if (Intrinsics.EZpvd((java.lang.Object) watchListData.getInstType(), (java.lang.Object) "COIN")) {
                this.fJNWhG.put(watchListData.getInstId(), watchListData.getInstId());
            }
        }
    }

    public final void AYXKKw(java.util.List<TickersData> list) {
        if (list != null) {
            for (TickersData tickersData : list) {
                this.fIwbmz.put(tickersData.getInstId(), tickersData);
            }
        }
    }

    public final void OLrzqt(java.util.List<TickersData> list) {
        if (list != null) {
            for (TickersData tickersData : list) {
                this.ejfBZ.put(tickersData.getInstId(), tickersData);
            }
        }
    }

    public final void AEQbTJ(java.util.List<TickersData> list) {
        if (list != null) {
            for (TickersData tickersData : list) {
                this.DbNXlk.put(tickersData.getCcy(), tickersData);
            }
        }
    }
}
