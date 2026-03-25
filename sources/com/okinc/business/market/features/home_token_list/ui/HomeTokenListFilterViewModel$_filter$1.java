package com.okinc.business.market.features.home_token_list.ui;

import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28548kcp;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeTokenListFilterViewModel$_filter$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AdvancedFilter>, Object> {
    int label;
    final /* synthetic */ HomeTokenListFilterViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTokenListFilterViewModel$_filter$1(HomeTokenListFilterViewModel homeTokenListFilterViewModel, Continuation<? super HomeTokenListFilterViewModel$_filter$1> continuation) {
        super(2, continuation);
        this.this$0 = homeTokenListFilterViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeTokenListFilterViewModel$_filter$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super AdvancedFilter> continuation) {
        return ((HomeTokenListFilterViewModel$_filter$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C28548kcp c28548kcp = this.this$0.copydefault;
            String strAEQbTJ = this.this$0.AEQbTJ();
            AdvancedFilter advancedFilterAEQbTJ = this.this$0.djBIcL.AEQbTJ();
            this.label = 1;
            obj = c28548kcp.EZpvd(strAEQbTJ, advancedFilterAEQbTJ, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }
}
