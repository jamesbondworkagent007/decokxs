package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.WatchAddUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC40459qWq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40482qXm extends AbstractC49400uno<BizInstrument, Unit> {
    public static final int OLrzqt = 8;
    public final qWQ KWHzl;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.InterfaceC49403unr
    public /* bridge */ /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl((BizInstrument) obj, (Continuation<? super Unit>) continuation);
    }

    @yCM
    public C40482qXm(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = qwq;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchAddUseCase$onExecute$1 watchAddUseCase$onExecute$1;
        if (continuation instanceof WatchAddUseCase$onExecute$1) {
            watchAddUseCase$onExecute$1 = (WatchAddUseCase$onExecute$1) continuation;
            int i = watchAddUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchAddUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchAddUseCase$onExecute$1 = new WatchAddUseCase$onExecute$1(this, continuation);
            }
        }
        WatchAddUseCase$onExecute$1 watchAddUseCase$onExecute$12 = watchAddUseCase$onExecute$1;
        java.lang.Object obj = watchAddUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchAddUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qWQ qwq = this.KWHzl;
            MarketUserFavorite marketUserFavoriteConvertToUserFavorite$default = qWJ.convertToUserFavorite$default(qWJ.OLrzqt(bizInstrument), null, 1, null);
            watchAddUseCase$onExecute$12.label = 1;
            if (InterfaceC40459qWq.ActionBar.insertUserFavorite$default(qwq, marketUserFavoriteConvertToUserFavorite$default, null, true, watchAddUseCase$onExecute$12, 2, null) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
