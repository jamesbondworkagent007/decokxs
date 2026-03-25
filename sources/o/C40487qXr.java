package o;

import com.okinc.market.watch.usecase.WatchListRemoveUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC40459qWq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40487qXr extends AbstractC49400uno<WatchListData, Unit> {
    public static final int OLrzqt = 8;
    public final qWQ AEQbTJ;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C40487qXr(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = qwq;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qWJ.convertToUserFavorite$default(com.okinc.unify_trade.biz.subscribe.WatchListData, java.lang.String, int, java.lang.Object):com.okinc.market.watch.data.MarketUserFavorite */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchListRemoveUseCase$onExecute$1 watchListRemoveUseCase$onExecute$1;
        if (continuation instanceof WatchListRemoveUseCase$onExecute$1) {
            watchListRemoveUseCase$onExecute$1 = (WatchListRemoveUseCase$onExecute$1) continuation;
            int i = watchListRemoveUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListRemoveUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListRemoveUseCase$onExecute$1 = new WatchListRemoveUseCase$onExecute$1(this, continuation);
            }
        }
        WatchListRemoveUseCase$onExecute$1 watchListRemoveUseCase$onExecute$12 = watchListRemoveUseCase$onExecute$1;
        java.lang.Object obj = watchListRemoveUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListRemoveUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qWQ qwq = this.AEQbTJ;
            java.util.List listEZpvd = C56402yEa.EZpvd(qWJ.convertToUserFavorite$default(watchListData, null, 1, null));
            watchListRemoveUseCase$onExecute$12.label = 1;
            if (InterfaceC40459qWq.ActionBar.deleteUserFavorite$default(qwq, listEZpvd, null, watchListRemoveUseCase$onExecute$12, 2, null) == objCopydefault) {
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
