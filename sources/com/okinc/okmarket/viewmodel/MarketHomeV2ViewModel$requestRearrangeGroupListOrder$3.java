package com.okinc.okmarket.viewmodel;

import com.okinc.okmarket.ui.market.data.UserGroupVo;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import o.C46863tfG;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes10.dex */
public final class MarketHomeV2ViewModel$requestRearrangeGroupListOrder$3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final /* synthetic */ List<UserGroupVo> $groupList;
    int label;
    final /* synthetic */ MarketHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketHomeV2ViewModel$requestRearrangeGroupListOrder$3(MarketHomeV2ViewModel marketHomeV2ViewModel, List<UserGroupVo> list, Continuation<? super MarketHomeV2ViewModel$requestRearrangeGroupListOrder$3> continuation) {
        super(1, continuation);
        this.this$0 = marketHomeV2ViewModel;
        this.$groupList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new MarketHomeV2ViewModel$requestRearrangeGroupListOrder$3(this.this$0, this.$groupList, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((MarketHomeV2ViewModel$requestRearrangeGroupListOrder$3) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C46863tfG c46863tfG = this.this$0.valueOf;
            List<UserGroupVo> list = this.$groupList;
            this.label = 1;
            if (c46863tfG.EZpvd(list, (Continuation) this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
