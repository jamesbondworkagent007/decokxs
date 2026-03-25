package com.okinc.okmarket.ui.dialog;

import com.okinc.okmarket.ui.market.data.UserGroupVo;
import com.okinc.okmarket.viewmodel.MarketHomeV2ViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C46665tbU;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketFavSwitchBottomSheet$setupRecyclerView$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserGroupVo $item;
    int label;
    final /* synthetic */ C46665tbU this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketFavSwitchBottomSheet$setupRecyclerView$1$1$1(C46665tbU c46665tbU, UserGroupVo userGroupVo, Continuation<? super MarketFavSwitchBottomSheet$setupRecyclerView$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c46665tbU;
        this.$item = userGroupVo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarketFavSwitchBottomSheet$setupRecyclerView$1$1$1(this.this$0, this.$item, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarketFavSwitchBottomSheet$setupRecyclerView$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MarketHomeV2ViewModel marketHomeV2ViewModelCopydefault = this.this$0.copydefault();
            UserGroupVo userGroupVo = this.$item;
            this.label = 1;
            if (marketHomeV2ViewModelCopydefault.OLrzqt(userGroupVo, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        this.this$0.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }
}
