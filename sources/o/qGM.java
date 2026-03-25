package o;

import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.market.search.features.main.root.domain.usecase.ApplySearchTickersAndWatchingUseCase$invoke$1;
import com.okinc.market.search.features.main.root.domain.usecase.ApplySearchTickersAndWatchingUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGM extends AbstractC49400uno<Triple<? extends C40078qIn, ? extends java.util.Map<java.lang.String, ? extends C41787qxR>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>>, C40078qIn> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC54577xNn KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public qGM(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC54577xNn interfaceC54577xNn) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = interfaceC54577xNn;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGM.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Triple<C40078qIn, ? extends java.util.Map<java.lang.String, C41787qxR>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> triple, @NotNull Continuation<? super C40078qIn> continuation) throws java.lang.Throwable {
        ApplySearchTickersAndWatchingUseCase$invoke$1 applySearchTickersAndWatchingUseCase$invoke$1;
        long j;
        if (continuation instanceof ApplySearchTickersAndWatchingUseCase$invoke$1) {
            applySearchTickersAndWatchingUseCase$invoke$1 = (ApplySearchTickersAndWatchingUseCase$invoke$1) continuation;
            int i = applySearchTickersAndWatchingUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applySearchTickersAndWatchingUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                applySearchTickersAndWatchingUseCase$invoke$1 = new ApplySearchTickersAndWatchingUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = applySearchTickersAndWatchingUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applySearchTickersAndWatchingUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            applySearchTickersAndWatchingUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            applySearchTickersAndWatchingUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(triple, applySearchTickersAndWatchingUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = applySearchTickersAndWatchingUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((C40078qIn) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("ApplySearchTickersAndWatchingUseCase", "ApplySearchTickersAndWatchingUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Triple<C40078qIn, ? extends java.util.Map<java.lang.String, C41787qxR>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> triple, @NotNull Continuation<? super C40078qIn> continuation) throws java.lang.Throwable {
        ApplySearchTickersAndWatchingUseCase$onExecute$1 applySearchTickersAndWatchingUseCase$onExecute$1;
        C40078qIn c40078qInComponent1;
        java.util.Map<java.lang.String, C41787qxR> mapComponent2;
        java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>> mapComponent3;
        long jCurrentTimeMillis;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        java.util.Iterator it;
        qGM qgm;
        TreeMap treeMap;
        AbstractC54531xLw abstractC54531xLwDjBIcL;
        if (continuation instanceof ApplySearchTickersAndWatchingUseCase$onExecute$1) {
            applySearchTickersAndWatchingUseCase$onExecute$1 = (ApplySearchTickersAndWatchingUseCase$onExecute$1) continuation;
            int i = applySearchTickersAndWatchingUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                applySearchTickersAndWatchingUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                applySearchTickersAndWatchingUseCase$onExecute$1 = new ApplySearchTickersAndWatchingUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = applySearchTickersAndWatchingUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = applySearchTickersAndWatchingUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            c40078qInComponent1 = triple.component1();
            mapComponent2 = triple.component2();
            mapComponent3 = triple.component3();
            if (c40078qInComponent1 == null || c40078qInComponent1.fIwbmz()) {
                C40375qTn.w$default(C40375qTn.AEQbTJ, "ApplySearchTickersAndWatchingUseCase", "searchResult is null or empty, skip.", null, 4, null);
                return c40078qInComponent1;
            }
            C40375qTn.AEQbTJ.copydefault("ApplySearchTickersAndWatchingUseCase", "start applying tickers&watching [searchResult: " + c40078qInComponent1 + "]");
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            InterfaceC54577xNn interfaceC54577xNn = this.KWHzl;
            interfaceC54581xNrOLrzqt = interfaceC54577xNn != null ? interfaceC54577xNn.OLrzqt() : null;
            if (interfaceC54581xNrOLrzqt != null) {
                interfaceC54581xNrOLrzqt.AxsJAY();
            }
            it = yDY.gEmmrt("SPOT", "MARGIN", "SWAP", "FUTURES", "OPTION").iterator();
            qgm = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = applySearchTickersAndWatchingUseCase$onExecute$1.J$0;
            it = (java.util.Iterator) applySearchTickersAndWatchingUseCase$onExecute$1.L$5;
            interfaceC54581xNrOLrzqt = (InterfaceC54581xNr) applySearchTickersAndWatchingUseCase$onExecute$1.L$4;
            mapComponent3 = (java.util.Map) applySearchTickersAndWatchingUseCase$onExecute$1.L$3;
            mapComponent2 = (java.util.Map) applySearchTickersAndWatchingUseCase$onExecute$1.L$2;
            c40078qInComponent1 = (C40078qIn) applySearchTickersAndWatchingUseCase$onExecute$1.L$1;
            qgm = (qGM) applySearchTickersAndWatchingUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwDjBIcL = interfaceC54581xNrOLrzqt.djBIcL(str)) != null) {
                applySearchTickersAndWatchingUseCase$onExecute$1.L$0 = qgm;
                applySearchTickersAndWatchingUseCase$onExecute$1.L$1 = c40078qInComponent1;
                applySearchTickersAndWatchingUseCase$onExecute$1.L$2 = mapComponent2;
                applySearchTickersAndWatchingUseCase$onExecute$1.L$3 = mapComponent3;
                applySearchTickersAndWatchingUseCase$onExecute$1.L$4 = interfaceC54581xNrOLrzqt;
                applySearchTickersAndWatchingUseCase$onExecute$1.L$5 = it;
                applySearchTickersAndWatchingUseCase$onExecute$1.J$0 = jCurrentTimeMillis;
                applySearchTickersAndWatchingUseCase$onExecute$1.label = 1;
                if (C55608xnE.copydefault(abstractC54531xLwDjBIcL, applySearchTickersAndWatchingUseCase$onExecute$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        }
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        C40375qTn.AEQbTJ.copydefault("ApplySearchTickersAndWatchingUseCase", "init all trade biz cost: " + (jCurrentTimeMillis2 - jCurrentTimeMillis) + " ms");
        java.util.List<C39994qFk> listAkhnZx = c40078qInComponent1.AkhnZx();
        java.util.List listKWHzl = listAkhnZx != null ? qgm.KWHzl(listAkhnZx, "spot", mapComponent2, mapComponent3) : null;
        java.util.List<C39994qFk> listAhwBna = c40078qInComponent1.AhwBna();
        java.util.List listKWHzl2 = listAhwBna != null ? qgm.KWHzl(listAhwBna, "futures", mapComponent2, mapComponent3) : null;
        if (c40078qInComponent1.DbNXlk() != null) {
            TreeMap treeMap2 = new TreeMap();
            for (Map.Entry<java.lang.Long, java.util.List<C40005qFv>> entry : c40078qInComponent1.DbNXlk().entrySet()) {
                java.lang.Long key = entry.getKey();
                java.util.List<C40005qFv> value = entry.getValue();
                Intrinsics.copydefault(value);
                Intrinsics.copydefault(key);
                treeMap2.put(key, qgm.KWHzl(value, "options/" + pTA.formatDate$default(new Date(key.longValue()), OKDateEnum.DATE_FORMAT_SIMPLE, null, null, 6, null), mapComponent2, mapComponent3));
            }
            treeMap = treeMap2;
        } else {
            treeMap = null;
        }
        return c40078qInComponent1.EZpvd((32739 & 1) != 0 ? c40078qInComponent1.valueOf : null, (32739 & 2) != 0 ? c40078qInComponent1.AEQbTJ : null, (32739 & 4) != 0 ? c40078qInComponent1.values : listKWHzl, (32739 & 8) != 0 ? c40078qInComponent1.AYXKKw : listKWHzl2, (32739 & 16) != 0 ? c40078qInComponent1.AkhnZx : treeMap, (32739 & 32) != 0 ? c40078qInComponent1.djBIcL : null, (32739 & 64) != 0 ? c40078qInComponent1.isConnected : null, (32739 & 128) != 0 ? c40078qInComponent1.OLrzqt : null, (32739 & 256) != 0 ? c40078qInComponent1.AhwBna : null, (32739 & 512) != 0 ? c40078qInComponent1.DbNXlk : null, (32739 & 1024) != 0 ? c40078qInComponent1.KWHzl : null, (32739 & 2048) != 0 ? c40078qInComponent1.copydefault : null, (32739 & 4096) != 0 ? c40078qInComponent1.EZpvd : null, (32739 & 8192) != 0 ? c40078qInComponent1.gEmmrt : null, (32739 & 16384) != 0 ? c40078qInComponent1.fetchVPNInfo : null);
    }

    public final <T extends InterfaceC41791qxV<T>> java.util.List<T> KWHzl(java.util.List<? extends T> list, java.lang.String str, java.util.Map<java.lang.String, C41787qxR> map, java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>> map2) {
        java.util.List<T> listAEQbTJ;
        java.util.List<T> listOLrzqt = C40376qTo.OLrzqt(list, map2);
        if (!(true ^ (map == null || map.isEmpty()))) {
            map = null;
        }
        return (map == null || (listAEQbTJ = C40376qTo.AEQbTJ(listOLrzqt, map)) == null) ? listOLrzqt : listAEQbTJ;
    }
}
