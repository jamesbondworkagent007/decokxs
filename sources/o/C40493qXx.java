package o;

import com.okinc.market.watch.usecase.WatchRemoveUseCase$onExecute$1;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC40459qWq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40493qXx extends AbstractC49400uno<BizInstrument, Unit> {
    public static final int KWHzl = 8;
    public final CoroutineDispatcher OLrzqt;
    public final qWQ copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.OLrzqt;
    }

    @yCM
    public C40493qXx(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = qwq;
        this.OLrzqt = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull BizInstrument bizInstrument, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchRemoveUseCase$onExecute$1 watchRemoveUseCase$onExecute$1;
        if (continuation instanceof WatchRemoveUseCase$onExecute$1) {
            watchRemoveUseCase$onExecute$1 = (WatchRemoveUseCase$onExecute$1) continuation;
            int i = watchRemoveUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchRemoveUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchRemoveUseCase$onExecute$1 = new WatchRemoveUseCase$onExecute$1(this, continuation);
            }
        }
        WatchRemoveUseCase$onExecute$1 watchRemoveUseCase$onExecute$12 = watchRemoveUseCase$onExecute$1;
        java.lang.Object obj = watchRemoveUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchRemoveUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qWQ qwq = this.copydefault;
            java.util.List listEZpvd = C56402yEa.EZpvd(qWJ.convertToUserFavorite$default(qWJ.OLrzqt(bizInstrument), null, 1, null));
            watchRemoveUseCase$onExecute$12.label = 1;
            if (InterfaceC40459qWq.ActionBar.deleteUserFavorite$default(qwq, listEZpvd, null, watchRemoveUseCase$onExecute$12, 2, null) == objCopydefault) {
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
