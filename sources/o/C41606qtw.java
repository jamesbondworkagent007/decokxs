package o;

import com.okinc.market.quotation.domain.spot.mixin.PreloadSpotAndCoinUseCase$onExecute$$inlined$executeAsyncTasks$1;
import com.okinc.market.quotation.domain.spot.mixin.PreloadSpotAndCoinUseCase$onExecute$1;
import com.okinc.market.quotation.domain.spot.mixin.PreloadSpotAndCoinUseCase$preloadCoinTickers$1;
import com.okinc.market.quotation.domain.spot.mixin.PreloadSpotAndCoinUseCase$preloadSpotTickers$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41606qtw extends AbstractC49400uno<kotlin.Pair<? extends InterfaceC41651quo, ? extends InterfaceC41637qua>, Unit> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41409qqK EZpvd;
    public final C41604qtu KWHzl;
    public final C41439qqo OLrzqt;
    public final C41529qsY copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @yCM
    public C41606qtw(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull C41604qtu c41604qtu, @NotNull C41529qsY c41529qsY, @NotNull C41409qqK c41409qqK) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c41604qtu, "");
        Intrinsics.checkNotNullParameter(c41529qsY, "");
        Intrinsics.checkNotNullParameter(c41409qqK, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = c41439qqo;
        this.KWHzl = c41604qtu;
        this.copydefault = c41529qsY;
        this.EZpvd = c41409qqK;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends InterfaceC41651quo, ? extends InterfaceC41637qua> pair, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadSpotAndCoinUseCase$onExecute$1 preloadSpotAndCoinUseCase$onExecute$1;
        C41606qtw c41606qtw;
        if (continuation instanceof PreloadSpotAndCoinUseCase$onExecute$1) {
            preloadSpotAndCoinUseCase$onExecute$1 = (PreloadSpotAndCoinUseCase$onExecute$1) continuation;
            int i = preloadSpotAndCoinUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadSpotAndCoinUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadSpotAndCoinUseCase$onExecute$1 = new PreloadSpotAndCoinUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = preloadSpotAndCoinUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = preloadSpotAndCoinUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            Intrinsics.checkNotNullExpressionValue(runtime, "");
            if (C41359qpN.OLrzqt(runtime, 0.6666667f)) {
                C41434qqj.KWHzl.KWHzl("PreloadSpotUseCase", "System memory is below threshold, starting preload.");
                C41604qtu c41604qtu = this.KWHzl;
                preloadSpotAndCoinUseCase$onExecute$1.L$0 = this;
                preloadSpotAndCoinUseCase$onExecute$1.label = 1;
                objCopydefault = c41604qtu.EZpvd(pair, preloadSpotAndCoinUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
                c41606qtw = this;
            } else {
                C41434qqj.w$default(C41434qqj.KWHzl, "PreloadSpotUseCase", "System memory is above threshold, skipping preload.", null, 4, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objCopydefault);
                return Unit.INSTANCE;
            }
            C41606qtw c41606qtw2 = (C41606qtw) preloadSpotAndCoinUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
            c41606qtw = c41606qtw2;
        }
        C41600qtq c41600qtq = (C41600qtq) objCopydefault;
        PreloadSpotAndCoinUseCase$onExecute$$inlined$executeAsyncTasks$1 preloadSpotAndCoinUseCase$onExecute$$inlined$executeAsyncTasks$1 = new PreloadSpotAndCoinUseCase$onExecute$$inlined$executeAsyncTasks$1(null, c41606qtw, c41600qtq.AEQbTJ(), c41606qtw, c41600qtq.copydefault());
        preloadSpotAndCoinUseCase$onExecute$1.L$0 = null;
        preloadSpotAndCoinUseCase$onExecute$1.label = 2;
        if (CoroutineScopeKt.coroutineScope(preloadSpotAndCoinUseCase$onExecute$$inlined$executeAsyncTasks$1, preloadSpotAndCoinUseCase$onExecute$1) == objCopydefault2) {
            return objCopydefault2;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<? extends InterfaceC41641que> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadSpotAndCoinUseCase$preloadSpotTickers$1 preloadSpotAndCoinUseCase$preloadSpotTickers$1;
        C41606qtw c41606qtw;
        if (continuation instanceof PreloadSpotAndCoinUseCase$preloadSpotTickers$1) {
            preloadSpotAndCoinUseCase$preloadSpotTickers$1 = (PreloadSpotAndCoinUseCase$preloadSpotTickers$1) continuation;
            int i = preloadSpotAndCoinUseCase$preloadSpotTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadSpotAndCoinUseCase$preloadSpotTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadSpotAndCoinUseCase$preloadSpotTickers$1 = new PreloadSpotAndCoinUseCase$preloadSpotTickers$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = preloadSpotAndCoinUseCase$preloadSpotTickers$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = preloadSpotAndCoinUseCase$preloadSpotTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C41529qsY c41529qsY = this.copydefault;
            preloadSpotAndCoinUseCase$preloadSpotTickers$1.L$0 = this;
            preloadSpotAndCoinUseCase$preloadSpotTickers$1.label = 1;
            objCopydefault = c41529qsY.copydefault((java.lang.Object) list, (Continuation) preloadSpotAndCoinUseCase$preloadSpotTickers$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41606qtw = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41606qtw = (C41606qtw) preloadSpotAndCoinUseCase$preloadSpotTickers$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        c41606qtw.OLrzqt.OLrzqt((java.util.Map<java.lang.String, TickersData>) objCopydefault);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(java.util.List<? extends InterfaceC41583qtZ> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadSpotAndCoinUseCase$preloadCoinTickers$1 preloadSpotAndCoinUseCase$preloadCoinTickers$1;
        C41606qtw c41606qtw;
        if (continuation instanceof PreloadSpotAndCoinUseCase$preloadCoinTickers$1) {
            preloadSpotAndCoinUseCase$preloadCoinTickers$1 = (PreloadSpotAndCoinUseCase$preloadCoinTickers$1) continuation;
            int i = preloadSpotAndCoinUseCase$preloadCoinTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadSpotAndCoinUseCase$preloadCoinTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadSpotAndCoinUseCase$preloadCoinTickers$1 = new PreloadSpotAndCoinUseCase$preloadCoinTickers$1(this, continuation);
            }
        }
        java.lang.Object objAEQbTJ = preloadSpotAndCoinUseCase$preloadCoinTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preloadSpotAndCoinUseCase$preloadCoinTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objAEQbTJ);
            C41409qqK c41409qqK = this.EZpvd;
            preloadSpotAndCoinUseCase$preloadCoinTickers$1.L$0 = this;
            preloadSpotAndCoinUseCase$preloadCoinTickers$1.label = 1;
            objAEQbTJ = c41409qqK.AEQbTJ(list, preloadSpotAndCoinUseCase$preloadCoinTickers$1);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
            c41606qtw = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41606qtw = (C41606qtw) preloadSpotAndCoinUseCase$preloadCoinTickers$1.L$0;
            C56391yDq.AEQbTJ(objAEQbTJ);
        }
        c41606qtw.OLrzqt.OLrzqt((java.util.Map<java.lang.String, TickersData>) objAEQbTJ);
        return Unit.INSTANCE;
    }
}
