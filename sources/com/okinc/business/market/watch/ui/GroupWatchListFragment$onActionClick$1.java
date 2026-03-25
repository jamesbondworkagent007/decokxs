package com.okinc.business.market.watch.ui;

import com.okinc.business.market.bean.CoinQuote;
import com.okinc.business.market.watch.ui.viewmodel.GroupWatchListViewModel;
import com.okinc.market.watch.data.UserGroup;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.kKI;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupWatchListFragment$onActionClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoinQuote $actionCoinQuote;
    int label;
    final /* synthetic */ kKI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupWatchListFragment$onActionClick$1(kKI kki, CoinQuote coinQuote, Continuation<? super GroupWatchListFragment$onActionClick$1> continuation) {
        super(2, continuation);
        this.this$0 = kki;
        this.$actionCoinQuote = coinQuote;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupWatchListFragment$onActionClick$1(this.this$0, this.$actionCoinQuote, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupWatchListFragment$onActionClick$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Unit unit;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            kKI kki = this.this$0;
            CoinQuote coinQuote = this.$actionCoinQuote;
            Result.Application application2 = Result.Companion;
            UserGroup userGroupOLrzqt = kki.OLrzqt(kki.fIwbmz());
            if (userGroupOLrzqt != null) {
                GroupWatchListViewModel groupWatchListViewModelAkhnZx = kki.AkhnZx();
                String groupName = userGroupOLrzqt.getGroupName();
                this.label = 1;
                if (groupWatchListViewModelAkhnZx.KWHzl(coinQuote, groupName, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                unit = null;
                Result.m7377constructorimpl(unit);
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        unit = Unit.INSTANCE;
        Result.m7377constructorimpl(unit);
        return Unit.INSTANCE;
    }
}
