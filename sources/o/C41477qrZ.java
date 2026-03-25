package o;

import com.okinc.market.quotation.domain.futures.PreloadFuturesUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qrZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41477qrZ extends AbstractC49400uno<C41468qrQ, Unit> {
    public final CoroutineDispatcher AEQbTJ;
    public final C41466qrO EZpvd;
    public final C41475qrX KWHzl;
    public final C41439qqo copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((C41468qrQ) obj, (Continuation<? super Unit>) continuation);
    }

    @yCM
    public C41477qrZ(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41439qqo c41439qqo, @NotNull C41466qrO c41466qrO, @NotNull C41475qrX c41475qrX) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41439qqo, "");
        Intrinsics.checkNotNullParameter(c41466qrO, "");
        Intrinsics.checkNotNullParameter(c41475qrX, "");
        this.AEQbTJ = coroutineDispatcher;
        this.copydefault = c41439qqo;
        this.EZpvd = c41466qrO;
        this.KWHzl = c41475qrX;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull C41468qrQ c41468qrQ, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadFuturesUseCase$onExecute$1 preloadFuturesUseCase$onExecute$1;
        C41477qrZ c41477qrZ;
        if (continuation instanceof PreloadFuturesUseCase$onExecute$1) {
            preloadFuturesUseCase$onExecute$1 = (PreloadFuturesUseCase$onExecute$1) continuation;
            int i = preloadFuturesUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadFuturesUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadFuturesUseCase$onExecute$1 = new PreloadFuturesUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objEZpvd2 = preloadFuturesUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = preloadFuturesUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objEZpvd2);
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            Intrinsics.checkNotNullExpressionValue(runtime, "");
            if (C41359qpN.OLrzqt(runtime, 0.6666667f)) {
                C41434qqj.KWHzl.KWHzl("PreloadFuturesUseCase", "System memory is below threshold, starting preload.");
                C41466qrO c41466qrO = this.EZpvd;
                preloadFuturesUseCase$onExecute$1.L$0 = this;
                preloadFuturesUseCase$onExecute$1.label = 1;
                objEZpvd2 = c41466qrO.EZpvd(c41468qrQ, (Continuation<? super C41467qrP>) preloadFuturesUseCase$onExecute$1);
                if (objEZpvd2 == objCopydefault) {
                    return objCopydefault;
                }
                c41477qrZ = this;
            } else {
                C41434qqj.w$default(C41434qqj.KWHzl, "PreloadFuturesUseCase", "System memory is above threshold, skipping preload.", null, 4, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c41477qrZ = (C41477qrZ) preloadFuturesUseCase$onExecute$1.L$0;
                C56391yDq.AEQbTJ(objEZpvd2);
                c41477qrZ.copydefault.OLrzqt((java.util.Map<java.lang.String, TickersData>) objEZpvd2);
                return Unit.INSTANCE;
            }
            c41477qrZ = (C41477qrZ) preloadFuturesUseCase$onExecute$1.L$0;
            C56391yDq.AEQbTJ(objEZpvd2);
        }
        C41467qrP c41467qrP = (C41467qrP) objEZpvd2;
        java.util.List<InterfaceC41638qub> listCopydefault = c41467qrP.copydefault();
        java.util.List<InterfaceC41638qub> listAEQbTJ = c41467qrP.AEQbTJ();
        java.util.List<InterfaceC41638qub> listKWHzl = c41467qrP.KWHzl();
        if (listCopydefault == null) {
            listCopydefault = yDY.AhwBna();
        }
        if (listAEQbTJ == null) {
            listAEQbTJ = yDY.AhwBna();
        }
        java.util.List listDjBIcL = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listCopydefault, (java.lang.Iterable) listAEQbTJ);
        if (listKWHzl == null) {
            listKWHzl = yDY.AhwBna();
        }
        java.util.List listDjBIcL2 = CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listDjBIcL, (java.lang.Iterable) listKWHzl);
        C41475qrX c41475qrX = c41477qrZ.KWHzl;
        preloadFuturesUseCase$onExecute$1.L$0 = c41477qrZ;
        preloadFuturesUseCase$onExecute$1.label = 2;
        objEZpvd2 = c41475qrX.copydefault(listDjBIcL2, preloadFuturesUseCase$onExecute$1);
        if (objEZpvd2 == objCopydefault) {
            return objCopydefault;
        }
        c41477qrZ.copydefault.OLrzqt((java.util.Map<java.lang.String, TickersData>) objEZpvd2);
        return Unit.INSTANCE;
    }
}
