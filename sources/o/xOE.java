package o;

import com.okinc.rxutils.RxBus;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.subscribe.OpenInterestData;
import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import com.okinc.unify_trade.trade.position.TradePositionManagerV2$checkInfoInstrument$1$job$1;
import com.okinc.unify_trade.trade.position.TradePositionManagerV2$ensureInfoInstrumentSuspend$2;
import com.okinc.unify_trade.trade.position.TradePositionManagerV2$ensureInstrumentSuspend$2;
import com.okinc.unify_trade.trade.position.TradePositionManagerV2$getPositions$1$1$onResult$1;
import io.reactivex.BackpressureStrategy;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class xOE {
    public final C54582xNs AEQbTJ;
    public AbstractC55747xpl EZpvd;
    public Job KWHzl;
    public final CoroutineScope copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C54582xNs copydefault() {
        return this.AEQbTJ;
    }

    public xOE(@NotNull C54582xNs c54582xNs) {
        Intrinsics.checkNotNullParameter(c54582xNs, "");
        this.AEQbTJ = c54582xNs;
        this.copydefault = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)));
    }

    public final AbstractC58185ywX<Triple<java.lang.Boolean, java.util.List<TradePositionManager.PositionItem>, java.lang.String>> copydefault(final java.lang.String str, final java.lang.String str2, @NotNull final java.lang.String str3, final boolean z, final java.lang.String str4, final boolean z2, @NotNull final java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        AbstractC58185ywX<Triple<java.lang.Boolean, java.util.List<TradePositionManager.PositionItem>, java.lang.String>> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xOC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xOE.OLrzqt(this.KWHzl, str3, str2, str, z2, z, str4, str5, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void OLrzqt(final xOE xoe, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, boolean z2, java.lang.String str4, java.lang.String str5, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        TradePositionManager.ActionBar actionBar = TradePositionManager.Companion;
        actionBar.AEQbTJ("subscribeOnUI");
        final java.util.ArrayList<java.lang.Object> arrayListCopydefault = yDY.copydefault(new ActionBar(z2, str, str2, str3, z, xoe, interfaceC58184ywW, str4, str5, C33129mqd.gEmmrt(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
        java.lang.Object objFirstOrNull = CollectionsKt___CollectionsKt.firstOrNull(arrayListCopydefault);
        xoe.EZpvd = objFirstOrNull instanceof AbstractC55747xpl ? (AbstractC55747xpl) objFirstOrNull : null;
        actionBar.AEQbTJ("loadSourceObserver");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.copydefault(arrayListCopydefault);
        }
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.xOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                xOE.EZpvd(this.EZpvd, arrayListCopydefault);
            }
        });
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar extends AbstractC55747xpl {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final boolean EZpvd;
        public final /* synthetic */ InterfaceC58184ywW<Triple<java.lang.Boolean, java.util.List<TradePositionManager.PositionItem>, java.lang.String>> KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;
        public final /* synthetic */ xOE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC55745xpj
        public boolean copydefault() {
            return this.EZpvd;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z2, xOE xoe, InterfaceC58184ywW<Triple<java.lang.Boolean, java.util.List<TradePositionManager.PositionItem>, java.lang.String>> interfaceC58184ywW, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            super(str, str2, str3, str6, z2);
            this.copydefault = xoe;
            this.KWHzl = interfaceC58184ywW;
            this.OLrzqt = str4;
            this.AEQbTJ = str5;
            this.EZpvd = z;
        }

        @Override // o.AbstractC55747xpl
        public void EZpvd(java.util.List<TradePositionData> list, java.lang.String str, java.util.List<TradeUserPositionInfo> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(str, "");
            TradePositionManager.Companion.AEQbTJ("onResult origin:" + str);
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "http")) {
                EZpvd("pageAppear", list);
                RxBus.KWHzl("POSITION_LIST_INIT");
            }
            Job job = this.copydefault.KWHzl;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            xOE xoe = this.copydefault;
            xoe.KWHzl = BuildersKt__Builders_commonKt.launch$default(xoe.copydefault, null, null, new TradePositionManagerV2$getPositions$1$1$onResult$1(this.copydefault, list, this.KWHzl, list2, str, null), 3, null);
        }

        @Override // o.AbstractC55747xpl
        public void KWHzl(java.lang.String str, java.lang.Exception exc) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(exc, "");
            TradePositionManager.Companion.AEQbTJ("onError origin: String, exp: Exception :" + exc.getMessage());
            this.KWHzl.onNext(new Triple<>(java.lang.Boolean.FALSE, new java.util.ArrayList(), str));
        }

        @Override // o.AbstractC55747xpl
        public java.lang.String EZpvd() {
            return this.OLrzqt + "_" + this.AEQbTJ;
        }
    }

    public static final void EZpvd(xOE xoe, java.util.ArrayList arrayList) {
        xoe.EZpvd = null;
        Job job = xoe.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        TradePositionManager.Companion.AEQbTJ("unBindSourceObserver");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            interfaceC54581xNrOLrzqt.AEQbTJ((java.util.ArrayList<java.lang.Object>) arrayList);
        }
    }

    public final java.util.ArrayList<AbstractC54531xLw> AEQbTJ() {
        java.util.ArrayList<AbstractC54531xLw> arrayListAuCTel = this.AEQbTJ.AuCTel();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListAuCTel) {
            if (!AbstractC54531xLw.isInitFun$default((AbstractC54531xLw) obj, false, 1, null)) {
                arrayList.add(obj);
            }
        }
        return new java.util.ArrayList<>(arrayList);
    }

    public final java.lang.Object KWHzl(java.util.List<TradePositionData> list, Continuation<? super Unit> continuation) {
        TradePositionManager.Companion.AEQbTJ("checkInstrument start");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (java.lang.Object obj : list) {
            java.lang.String instType = ((TradePositionData) obj).getInstType();
            java.lang.Object arrayList = linkedHashMap.get(instType);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(instType, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.Set setKeySet = linkedHashMap.keySet();
        java.util.ArrayList<AbstractC54531xLw> arrayListAEQbTJ = AEQbTJ();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : arrayListAEQbTJ) {
            if (setKeySet.contains(((AbstractC54531xLw) obj2).AYXKKw())) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList2.isEmpty()) {
            TradePositionManager.Companion.AEQbTJ("needUnBizSet.isNullOrEmpty()");
            return Unit.INSTANCE;
        }
        java.lang.Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new TradePositionManagerV2$ensureInstrumentSuspend$2(arrayList2, this, null), continuation);
        return objCoroutineScope == C56442yFn.copydefault() ? objCoroutineScope : Unit.INSTANCE;
    }

    public final java.lang.Object EZpvd(OpenInterestData openInterestData, Continuation<? super Unit> continuation) {
        java.lang.Object objWithContext;
        java.lang.String instType = openInterestData.getInstType();
        java.util.ArrayList<AbstractC54531xLw> arrayListAEQbTJ = AEQbTJ();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAEQbTJ, 10));
        java.util.Iterator<T> it = arrayListAEQbTJ.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC54531xLw) it.next()).AYXKKw());
        }
        return (arrayList.contains(instType) && (objWithContext = BuildersKt.withContext(Dispatchers.getMain().getImmediate(), new TradePositionManagerV2$ensureInfoInstrumentSuspend$2(this, instType, null), continuation)) == C56442yFn.copydefault()) ? objWithContext : Unit.INSTANCE;
    }

    public final AbstractC58185ywX<OpenInterestData> KWHzl(@NotNull final OpenInterestData openInterestData) {
        Intrinsics.checkNotNullParameter(openInterestData, "");
        AbstractC58185ywX<OpenInterestData> abstractC58185ywXKWHzl = AbstractC58185ywX.KWHzl(new InterfaceC58187ywZ() { // from class: o.xOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                xOE.KWHzl(this.KWHzl, openInterestData, interfaceC58184ywW);
            }
        }, BackpressureStrategy.BUFFER);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    public static final void KWHzl(xOE xoe, OpenInterestData openInterestData, InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        final Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(xoe.copydefault, null, null, new TradePositionManagerV2$checkInfoInstrument$1$job$1(xoe, openInterestData, interfaceC58184ywW, null), 3, null);
        interfaceC58184ywW.setCancellable(new InterfaceC58225yxK() { // from class: o.xOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58225yxK
            public final void cancel() {
                xOE.KWHzl(jobLaunch$default);
            }
        });
    }

    public static final void KWHzl(Job job) {
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
    }
}
