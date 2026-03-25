package o;

import com.okinc.market.search.features.main.root.domain.usecase.GetInstrumentTickerUseCase$invoke$1;
import com.okinc.market.search.features.main.root.domain.usecase.GetInstrumentTickerUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qGS extends AbstractC49400uno<Unit, java.util.Map<java.lang.String, ? extends C41787qxR>> {
    public final qGE KWHzl;
    public final InterfaceC49497upf OLrzqt;
    public final CoroutineDispatcher copydefault;
    private static final Application Companion = new Application(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super java.util.Map<java.lang.String, C41787qxR>>) continuation);
    }

    @yCM
    public qGS(@NotNull CoroutineDispatcher coroutineDispatcher, InterfaceC49497upf interfaceC49497upf, @NotNull qGE qge) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(qge, "");
        this.copydefault = coroutineDispatcher;
        this.OLrzqt = interfaceC49497upf;
        this.KWHzl = qge;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qGS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.AbstractC49400uno
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object EZpvd(@NotNull Unit unit, @NotNull Continuation<? super java.util.Map<java.lang.String, C41787qxR>> continuation) throws java.lang.Throwable {
        GetInstrumentTickerUseCase$invoke$1 getInstrumentTickerUseCase$invoke$1;
        long j;
        if (continuation instanceof GetInstrumentTickerUseCase$invoke$1) {
            getInstrumentTickerUseCase$invoke$1 = (GetInstrumentTickerUseCase$invoke$1) continuation;
            int i = getInstrumentTickerUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getInstrumentTickerUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                getInstrumentTickerUseCase$invoke$1 = new GetInstrumentTickerUseCase$invoke$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = getInstrumentTickerUseCase$invoke$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getInstrumentTickerUseCase$invoke$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            getInstrumentTickerUseCase$invoke$1.J$0 = jCurrentTimeMillis;
            getInstrumentTickerUseCase$invoke$1.label = 1;
            objEZpvd = super.EZpvd(unit, getInstrumentTickerUseCase$invoke$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = getInstrumentTickerUseCase$invoke$1.J$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.Map) objEZpvd, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("GetInstrumentTickerUseCase", "GetInstrumentTickerUseCase total [cost: " + pairOLrzqt.getSecond() + "ms]");
        return pairOLrzqt.getFirst();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.Map<java.lang.String, C41787qxR>> continuation) throws java.lang.Throwable {
        GetInstrumentTickerUseCase$onExecute$1 getInstrumentTickerUseCase$onExecute$1;
        long j;
        java.lang.Boolean boolDbNXlk;
        java.lang.Boolean boolAhwBna;
        java.lang.Boolean boolDbNXlk2;
        if (continuation instanceof GetInstrumentTickerUseCase$onExecute$1) {
            getInstrumentTickerUseCase$onExecute$1 = (GetInstrumentTickerUseCase$onExecute$1) continuation;
            int i = getInstrumentTickerUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                getInstrumentTickerUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                getInstrumentTickerUseCase$onExecute$1 = new GetInstrumentTickerUseCase$onExecute$1(this, continuation);
            }
        }
        GetInstrumentTickerUseCase$onExecute$1 getInstrumentTickerUseCase$onExecute$12 = getInstrumentTickerUseCase$onExecute$1;
        java.lang.Object allInstrumentTickersData$default = getInstrumentTickerUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = getInstrumentTickerUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(allInstrumentTickersData$default);
            InterfaceC49497upf interfaceC49497upf = this.OLrzqt;
            xND xndAEQbTJ = interfaceC49497upf != null ? interfaceC49497upf.AEQbTJ() : null;
            boolean zBooleanValue = (xndAEQbTJ == null || (boolDbNXlk2 = xndAEQbTJ.DbNXlk()) == null) ? false : boolDbNXlk2.booleanValue();
            boolean zBooleanValue2 = (xndAEQbTJ == null || (boolAhwBna = xndAEQbTJ.AhwBna()) == null) ? false : boolAhwBna.booleanValue();
            boolean zBooleanValue3 = (xndAEQbTJ == null || (boolDbNXlk = xndAEQbTJ.DbNXlk()) == null) ? false : boolDbNXlk.booleanValue();
            C40375qTn.AEQbTJ.copydefault("GetInstrumentTickerUseCase", "configs [isSupportSwap: " + zBooleanValue + ", isSupportFuture: " + zBooleanValue2 + ", isSupportOption: " + zBooleanValue3 + "]");
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            qGE qge = this.KWHzl;
            getInstrumentTickerUseCase$onExecute$12.J$0 = jCurrentTimeMillis;
            getInstrumentTickerUseCase$onExecute$12.label = 1;
            allInstrumentTickersData$default = qGE.getAllInstrumentTickersData$default(qge, zBooleanValue, zBooleanValue2, zBooleanValue3, false, getInstrumentTickerUseCase$onExecute$12, 8, null);
            if (allInstrumentTickersData$default == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = getInstrumentTickerUseCase$onExecute$12.J$0;
            C56391yDq.AEQbTJ(allInstrumentTickersData$default);
        }
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt((java.util.List) allInstrumentTickersData$default, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - j));
        C40375qTn.AEQbTJ.copydefault("GetInstrumentTickerUseCase", "getAllInstrumentTickersData [cost: " + pairOLrzqt.getSecond() + "ms]");
        java.util.List list = (java.util.List) pairOLrzqt.component1();
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.List listQOLQEE = C56403yEb.QOLQEE(CollectionsKt___CollectionsKt.QfsBiF(list));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(listQOLQEE, 10)), 16));
        for (java.lang.Object obj : listQOLQEE) {
            linkedHashMap.put(((TickersData) obj).getInstId(), obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C56423yEv.copydefault(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), C40378qTq.OLrzqt((TickersData) entry.getValue()));
        }
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(linkedHashMap2, C56443yFo.KWHzl(java.lang.System.currentTimeMillis() - jCurrentTimeMillis2));
        C40375qTn.AEQbTJ.copydefault("GetInstrumentTickerUseCase", "toInstrumentTickerVo total [cost: " + pairOLrzqt2.getSecond() + "ms]");
        return (java.util.Map) pairOLrzqt2.component1();
    }
}
