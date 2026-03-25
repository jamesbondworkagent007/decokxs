package o;

import com.okinc.market.quotation.domain.dex.PreloadDexUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41502qry extends AbstractC49400uno<Unit, Unit> {
    public final C41489qrl AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super Unit>) continuation);
    }

    @yCM
    public C41502qry(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41489qrl c41489qrl) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41489qrl, "");
        this.KWHzl = coroutineDispatcher;
        this.AEQbTJ = c41489qrl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        PreloadDexUseCase$onExecute$1 preloadDexUseCase$onExecute$1;
        if (continuation instanceof PreloadDexUseCase$onExecute$1) {
            preloadDexUseCase$onExecute$1 = (PreloadDexUseCase$onExecute$1) continuation;
            int i = preloadDexUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preloadDexUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                preloadDexUseCase$onExecute$1 = new PreloadDexUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = preloadDexUseCase$onExecute$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = preloadDexUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
            Intrinsics.checkNotNullExpressionValue(runtime, "");
            if (C41359qpN.OLrzqt(runtime, 0.6666667f)) {
                C41434qqj.KWHzl.KWHzl("PreloadDexUseCase", "System memory below 2/3 threshold, initiating preload");
                C41489qrl c41489qrl = this.AEQbTJ;
                preloadDexUseCase$onExecute$1.label = 1;
                objCopydefault = c41489qrl.copydefault(unit, preloadDexUseCase$onExecute$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            } else {
                C41434qqj.w$default(C41434qqj.KWHzl, "PreloadDexUseCase", "System memory above 2/3 threshold, skipping preload to preserve performance", null, 4, null);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(objCopydefault);
        }
        C41434qqj.KWHzl.KWHzl("PreloadDexUseCase", "Successfully preloaded " + ((java.util.List) objCopydefault).size() + " chain groups");
        return Unit.INSTANCE;
    }
}
