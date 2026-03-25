package o;

import com.okinc.market.search.features.main.recommend.history.domain.usecase.ClearSearchHistoryUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qCE extends AbstractC49400uno<Unit, java.util.List<? extends qCU>> {
    public final CoroutineDispatcher AEQbTJ;
    public final C39928qCz OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((Unit) obj, (Continuation<? super java.util.List<qCU>>) continuation);
    }

    @yCM
    public qCE(@NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C39928qCz c39928qCz) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c39928qCz, "");
        this.AEQbTJ = coroutineDispatcher;
        this.OLrzqt = c39928qCz;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull Unit unit, @NotNull Continuation<? super java.util.List<qCU>> continuation) throws java.lang.Throwable {
        ClearSearchHistoryUseCase$onExecute$1 clearSearchHistoryUseCase$onExecute$1;
        if (continuation instanceof ClearSearchHistoryUseCase$onExecute$1) {
            clearSearchHistoryUseCase$onExecute$1 = (ClearSearchHistoryUseCase$onExecute$1) continuation;
            int i = clearSearchHistoryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                clearSearchHistoryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                clearSearchHistoryUseCase$onExecute$1 = new ClearSearchHistoryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object obj = clearSearchHistoryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = clearSearchHistoryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C39928qCz c39928qCz = this.OLrzqt;
            clearSearchHistoryUseCase$onExecute$1.label = 1;
            if (c39928qCz.AEQbTJ(clearSearchHistoryUseCase$onExecute$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return yDY.AhwBna();
    }
}
