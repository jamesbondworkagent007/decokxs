package o;

import com.okinc.market.quotation.domain.spot.PreloadSpotUseCase$onExecute$1;
import com.okinc.market.quotation.domain.spot.PreloadSpotUseCase$preloadSpotTickers$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41588qte extends AbstractC49400uno<InterfaceC41651quo, Unit> {
    public final C41529qsY AEQbTJ;
    public final C41525qsU EZpvd;
    public final C41439qqo KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C41588qte(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull C41525qsU c41525qsU, @NotNull C41529qsY c41529qsY) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c41525qsU, "");
        Intrinsics.checkNotNullParameter(c41529qsY, "");
        this.copydefault = coroutineDispatcher;
        this.KWHzl = c41439qqo;
        this.EZpvd = c41525qsU;
        this.AEQbTJ = c41529qsY;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull InterfaceC41651quo interfaceC41651quo, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadSpotUseCase$onExecute$1 preloadSpotUseCase$onExecute$1;
        C41588qte c41588qte;
        if (continuation instanceof PreloadSpotUseCase$onExecute$1) {
            preloadSpotUseCase$onExecute$1 = (PreloadSpotUseCase$onExecute$1) continuation;
            int i = preloadSpotUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadSpotUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadSpotUseCase$onExecute$1 = new PreloadSpotUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd = preloadSpotUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preloadSpotUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd);
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            Intrinsics.checkNotNullExpressionValue(runtime, "");
            if (C41359qpN.OLrzqt(runtime, 0.6666667f)) {
                C41434qqj.KWHzl.KWHzl("PreloadSpotUseCase", "System memory is below threshold, starting preload.");
                C41525qsU c41525qsU = this.EZpvd;
                C41526qsV c41526qsV = new C41526qsV(interfaceC41651quo, null, 2, null);
                preloadSpotUseCase$onExecute$1.L$0 = this;
                preloadSpotUseCase$onExecute$1.label = 1;
                objEZpvd = c41525qsU.EZpvd(c41526qsV, preloadSpotUseCase$onExecute$1);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c41588qte = this;
            } else {
                C41434qqj.KWHzl.KWHzl("PreloadSpotUseCase", "System memory is above threshold, skipping preload.");
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(objEZpvd);
                return Unit.INSTANCE;
            }
            c41588qte = (C41588qte) preloadSpotUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd);
        }
        java.util.List<? extends InterfaceC41641que> list = (java.util.List) ((Triple) objEZpvd).component1();
        preloadSpotUseCase$onExecute$1.L$0 = null;
        preloadSpotUseCase$onExecute$1.label = 2;
        if (c41588qte.copydefault(list, preloadSpotUseCase$onExecute$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.util.List<? extends InterfaceC41641que> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadSpotUseCase$preloadSpotTickers$1 preloadSpotUseCase$preloadSpotTickers$1;
        C41588qte c41588qte;
        if (continuation instanceof PreloadSpotUseCase$preloadSpotTickers$1) {
            preloadSpotUseCase$preloadSpotTickers$1 = (PreloadSpotUseCase$preloadSpotTickers$1) continuation;
            int i = preloadSpotUseCase$preloadSpotTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadSpotUseCase$preloadSpotTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadSpotUseCase$preloadSpotTickers$1 = new PreloadSpotUseCase$preloadSpotTickers$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = preloadSpotUseCase$preloadSpotTickers$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = preloadSpotUseCase$preloadSpotTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C41529qsY c41529qsY = this.AEQbTJ;
            preloadSpotUseCase$preloadSpotTickers$1.L$0 = this;
            preloadSpotUseCase$preloadSpotTickers$1.label = 1;
            objCopydefault = c41529qsY.copydefault((java.lang.Object) list, (Continuation) preloadSpotUseCase$preloadSpotTickers$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
            c41588qte = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c41588qte = (C41588qte) preloadSpotUseCase$preloadSpotTickers$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        c41588qte.KWHzl.OLrzqt((java.util.Map<java.lang.String, TickersData>) objCopydefault);
        return Unit.INSTANCE;
    }
}
