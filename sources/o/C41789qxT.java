package o;

import com.okinc.market.search.features.favorite.domain.usecase.FavoriteGetInstrumentTickerUseCase$invoke$1;
import com.okinc.market.search.features.favorite.domain.usecase.FavoriteGetInstrumentTickerUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qxT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41789qxT extends AbstractC49400uno<Unit, java.util.Map<java.lang.String, ? extends TickersData>> {
    private static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public final InterfaceC49497upf AEQbTJ;
    public final qGE EZpvd;
    public final CoroutineDispatcher OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super java.util.Map<java.lang.String, TickersData>>) continuation);
    }

    @yCM
    public C41789qxT(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC49497upf interfaceC49497upf, @NotNull qGE qge) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qge, "");
        this.OLrzqt = coroutineDispatcher;
        this.AEQbTJ = interfaceC49497upf;
        this.EZpvd = qge;
    }

    /* JADX INFO: renamed from: o.qxT$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qxT.TaskDescription.<init>():void type: THIS */
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
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        FavoriteGetInstrumentTickerUseCase$invoke$1 favoriteGetInstrumentTickerUseCase$invoke$1;
        long j;
        if (continuation instanceof FavoriteGetInstrumentTickerUseCase$invoke$1) {
            favoriteGetInstrumentTickerUseCase$invoke$1 = (FavoriteGetInstrumentTickerUseCase$invoke$1) continuation;
            int i = favoriteGetInstrumentTickerUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteGetInstrumentTickerUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteGetInstrumentTickerUseCase$invoke$1 = new FavoriteGetInstrumentTickerUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = favoriteGetInstrumentTickerUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteGetInstrumentTickerUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            favoriteGetInstrumentTickerUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            favoriteGetInstrumentTickerUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(unit, favoriteGetInstrumentTickerUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = favoriteGetInstrumentTickerUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.Map) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("FavoriteGetInstrumentTickerUseCase", "FavoriteGetInstrumentTickerUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.Map<java.lang.String, TickersData>> continuation) throws java.lang.Throwable {
        FavoriteGetInstrumentTickerUseCase$onExecute$1 favoriteGetInstrumentTickerUseCase$onExecute$1;
        long j;
        java.lang.Boolean boolDbNXlk;
        java.lang.Boolean boolAhwBna;
        java.lang.Boolean boolDbNXlk2;
        TickersData tickersData;
        TickersData tickersData2;
        if (continuation instanceof FavoriteGetInstrumentTickerUseCase$onExecute$1) {
            favoriteGetInstrumentTickerUseCase$onExecute$1 = (FavoriteGetInstrumentTickerUseCase$onExecute$1) continuation;
            int i = favoriteGetInstrumentTickerUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                favoriteGetInstrumentTickerUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                favoriteGetInstrumentTickerUseCase$onExecute$1 = new FavoriteGetInstrumentTickerUseCase$onExecute$1(this, continuation);
            }
        }
        FavoriteGetInstrumentTickerUseCase$onExecute$1 favoriteGetInstrumentTickerUseCase$onExecute$12 = favoriteGetInstrumentTickerUseCase$onExecute$1;
        java.lang.Object objKWHzl = favoriteGetInstrumentTickerUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = favoriteGetInstrumentTickerUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objKWHzl);
            InterfaceC49497upf interfaceC49497upf = this.AEQbTJ;
            xND xndAEQbTJ = interfaceC49497upf != null ? interfaceC49497upf.AEQbTJ() : null;
            boolean zBooleanValue = (xndAEQbTJ == null || (boolDbNXlk2 = xndAEQbTJ.DbNXlk()) == null) ? false : boolDbNXlk2.booleanValue();
            boolean zBooleanValue2 = (xndAEQbTJ == null || (boolAhwBna = xndAEQbTJ.AhwBna()) == null) ? false : boolAhwBna.booleanValue();
            boolean zBooleanValue3 = (xndAEQbTJ == null || (boolDbNXlk = xndAEQbTJ.DbNXlk()) == null) ? false : boolDbNXlk.booleanValue();
            C40375qTn.AEQbTJ.copydefault("FavoriteGetInstrumentTickerUseCase", "configs [isSupportSwap: " + zBooleanValue + ", isSupportFuture: " + zBooleanValue2 + ", isSupportOption: " + zBooleanValue3 + "]");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            qGE qge = this.EZpvd;
            favoriteGetInstrumentTickerUseCase$onExecute$12.J$0 = jCurrentTimeMillis;
            favoriteGetInstrumentTickerUseCase$onExecute$12.label = 1;
            objKWHzl = qge.KWHzl(zBooleanValue, zBooleanValue2, zBooleanValue3, true, favoriteGetInstrumentTickerUseCase$onExecute$12);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = favoriteGetInstrumentTickerUseCase$onExecute$12.J$0;
            C56391yDq.AEQbTJ(objKWHzl);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) objKWHzl, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("FavoriteGetInstrumentTickerUseCase", "getAllInstrumentTickersData [cost: " + pairOLrzqt.getSecond() + "ms]");
        java.util.List<java.util.List> list = (java.util.List) pairOLrzqt.component1();
        for (java.util.List<TickersData> list2 : list) {
            java.lang.String instId = (list2 == null || (tickersData2 = (TickersData) CollectionsKt___CollectionsKt.AkhnZx(list2, 0)) == null) ? null : tickersData2.getInstId();
            if (instId == null || instId.length() == 0) {
                java.lang.String instType = (list2 == null || (tickersData = (TickersData) CollectionsKt___CollectionsKt.AkhnZx(list2, 0)) == null) ? null : tickersData.getInstType();
                if (instType == null || instType.length() == 0) {
                    if (list2 != null) {
                        for (TickersData tickersData3 : list2) {
                            tickersData3.setInstId(tickersData3.getCcy());
                            tickersData3.setInstType("COIN");
                        }
                    }
                }
            }
        }
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.List listQOLQEE = C56403yEb.QOLQEE(CollectionsKt___CollectionsKt.QfsBiF(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listQOLQEE, 10)), 16));
        for (java.lang.Object obj : listQOLQEE) {
            linkedHashMap.put(((TickersData) obj).getInstId(), obj);
        }
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(linkedHashMap, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
        C40375qTn.AEQbTJ.copydefault("FavoriteGetInstrumentTickerUseCase", "toInstrumentTickerVo total [cost: " + pairOLrzqt2.getSecond() + "ms]");
        return (java.util.Map) pairOLrzqt2.component1();
    }
}
