package o;

import com.okinc.market.search.features.main.recommend.hot.domain.CombineWatchingAndTickerUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qDo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39944qDo extends AbstractC49400uno<C39940qDk, java.util.List<? extends C39994qFk>> {
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher EZpvd;
    public final C39937qDh OLrzqt;
    public final C39939qDj copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C39940qDk) obj, (Continuation<? super java.util.List<C39994qFk>>) continuation);
    }

    @yCM
    public C39944qDo(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C39937qDh c39937qDh, @NotNull C39939qDj c39939qDj) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c39937qDh, "");
        Intrinsics.checkNotNullParameter(c39939qDj, "");
        this.EZpvd = coroutineDispatcher;
        this.OLrzqt = c39937qDh;
        this.copydefault = c39939qDj;
    }

    /* JADX INFO: renamed from: o.qDo$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qDo.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C39940qDk c39940qDk, @NotNull Continuation<? super java.util.List<C39994qFk>> continuation) throws java.lang.Throwable {
        CombineWatchingAndTickerUseCase$onExecute$1 combineWatchingAndTickerUseCase$onExecute$1;
        java.util.Map<java.lang.String, C41787qxR> mapOLrzqt;
        C39944qDo c39944qDo;
        java.util.List list;
        if (continuation instanceof CombineWatchingAndTickerUseCase$onExecute$1) {
            combineWatchingAndTickerUseCase$onExecute$1 = (CombineWatchingAndTickerUseCase$onExecute$1) continuation;
            int i = combineWatchingAndTickerUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                combineWatchingAndTickerUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                combineWatchingAndTickerUseCase$onExecute$1 = new CombineWatchingAndTickerUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = combineWatchingAndTickerUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = combineWatchingAndTickerUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            java.util.List<C39994qFk> listEZpvd = c39940qDk.EZpvd();
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, BizInstrument>> mapAEQbTJ = c39940qDk.AEQbTJ();
            mapOLrzqt = c39940qDk.OLrzqt();
            C39937qDh c39937qDh = this.OLrzqt;
            kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, ? extends java.util.Map<java.lang.String, ? extends BizInstrument>>> pair = new kotlin.Pair<>(listEZpvd, mapAEQbTJ);
            combineWatchingAndTickerUseCase$onExecute$1.L$0 = this;
            combineWatchingAndTickerUseCase$onExecute$1.L$1 = mapOLrzqt;
            combineWatchingAndTickerUseCase$onExecute$1.label = 1;
            objAEQbTJ = c39937qDh.EZpvd(pair, combineWatchingAndTickerUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c39944qDo = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objAEQbTJ);
                list = (java.util.List) objAEQbTJ;
                C40375qTn.AEQbTJ.KWHzl("CombineWatchingAndTickerUseCase", "CombineWatchingAndTickerUseCase completed, result size: " + list.size());
                return list;
            }
            mapOLrzqt = (java.util.Map) combineWatchingAndTickerUseCase$onExecute$1.L$1;
            c39944qDo = (C39944qDo) combineWatchingAndTickerUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        list = (java.util.List) objAEQbTJ;
        if (mapOLrzqt != null) {
            C39939qDj c39939qDj = c39944qDo.copydefault;
            kotlin.Pair<? extends java.util.List<C39994qFk>, ? extends java.util.Map<java.lang.String, C41787qxR>> pair2 = new kotlin.Pair<>(list, mapOLrzqt);
            combineWatchingAndTickerUseCase$onExecute$1.L$0 = null;
            combineWatchingAndTickerUseCase$onExecute$1.L$1 = null;
            combineWatchingAndTickerUseCase$onExecute$1.label = 2;
            objAEQbTJ = c39939qDj.EZpvd(pair2, combineWatchingAndTickerUseCase$onExecute$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            list = (java.util.List) objAEQbTJ;
        }
        C40375qTn.AEQbTJ.KWHzl("CombineWatchingAndTickerUseCase", "CombineWatchingAndTickerUseCase completed, result size: " + list.size());
        return list;
    }
}
