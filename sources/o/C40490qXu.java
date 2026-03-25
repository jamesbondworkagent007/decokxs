package o;

import com.okinc.market.watch.data.MarketUserFavorite;
import com.okinc.market.watch.usecase.WatchListAddUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.InterfaceC40459qWq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40490qXu extends AbstractC49400uno<WatchListData, Unit> {
    public static final int AEQbTJ = 8;
    public final qWQ EZpvd;
    public final CoroutineDispatcher copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public C40490qXu(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = qwq;
        this.copydefault = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull WatchListData watchListData, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        WatchListAddUseCase$onExecute$1 watchListAddUseCase$onExecute$1;
        if (continuation instanceof WatchListAddUseCase$onExecute$1) {
            watchListAddUseCase$onExecute$1 = (WatchListAddUseCase$onExecute$1) continuation;
            int i = watchListAddUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchListAddUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchListAddUseCase$onExecute$1 = new WatchListAddUseCase$onExecute$1(this, continuation);
            }
        }
        WatchListAddUseCase$onExecute$1 watchListAddUseCase$onExecute$12 = watchListAddUseCase$onExecute$1;
        java.lang.Object obj = watchListAddUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchListAddUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qWQ qwq = this.EZpvd;
            MarketUserFavorite marketUserFavoriteConvertToUserFavorite$default = qWJ.convertToUserFavorite$default(watchListData, null, 1, null);
            watchListAddUseCase$onExecute$12.label = 1;
            if (InterfaceC40459qWq.ActionBar.insertUserFavorite$default(qwq, marketUserFavoriteConvertToUserFavorite$default, null, true, watchListAddUseCase$onExecute$12, 2, null) == objCopydefault) {
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
