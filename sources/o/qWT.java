package o;

import com.okinc.market.watch.usecase.GroupWatchReRangeUseCase$onExecute$1;
import com.okinc.unify_trade.biz.subscribe.WatchListData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qWT extends AbstractC49400uno<kotlin.Pair<? extends java.util.List<? extends WatchListData>, ? extends java.lang.String>, Unit> {
    public final qWQ AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    @yCM
    public qWT(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = qwq;
        this.KWHzl = coroutineDispatcher;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // o.InterfaceC49403unr
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(@NotNull kotlin.Pair<? extends java.util.List<WatchListData>, java.lang.String> pair, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        GroupWatchReRangeUseCase$onExecute$1 groupWatchReRangeUseCase$onExecute$1;
        if (continuation instanceof GroupWatchReRangeUseCase$onExecute$1) {
            groupWatchReRangeUseCase$onExecute$1 = (GroupWatchReRangeUseCase$onExecute$1) continuation;
            int i = groupWatchReRangeUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                groupWatchReRangeUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                groupWatchReRangeUseCase$onExecute$1 = new GroupWatchReRangeUseCase$onExecute$1(this, continuation);
            }
        }
        GroupWatchReRangeUseCase$onExecute$1 groupWatchReRangeUseCase$onExecute$12 = groupWatchReRangeUseCase$onExecute$1;
        java.lang.Object obj = groupWatchReRangeUseCase$onExecute$12.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = groupWatchReRangeUseCase$onExecute$12.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            qWQ qwq = this.AEQbTJ;
            java.lang.String strKWHzl = C55686xod.KWHzl();
            java.util.List<WatchListData> first = pair.getFirst();
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(first, 10));
            java.util.Iterator<T> it = first.iterator();
            while (it.hasNext()) {
                arrayList.add(qWJ.convertToUserFavorite$default((WatchListData) it.next(), null, 1, null));
            }
            java.lang.String second = pair.getSecond();
            groupWatchReRangeUseCase$onExecute$12.label = 1;
            if (qwq.AEQbTJ(strKWHzl, arrayList, second, true, groupWatchReRangeUseCase$onExecute$12) == objCopydefault) {
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
