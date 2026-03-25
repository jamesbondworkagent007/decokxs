package com.okinc.business.market.features.home_token_list.ui;

import com.okinc.business.market.features.filter.domain.AdvancedFilter;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28542kcj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28519kcM;

/* JADX INFO: loaded from: classes7.dex */
public final class HomeTokenListViewModel$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdvancedFilter $filter;
    Object L$0;
    int label;
    final /* synthetic */ HomeTokenListViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTokenListViewModel$loadData$1(HomeTokenListViewModel homeTokenListViewModel, AdvancedFilter advancedFilter, Continuation<? super HomeTokenListViewModel$loadData$1> continuation) {
        super(2, continuation);
        this.this$0 = homeTokenListViewModel;
        this.$filter = advancedFilter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HomeTokenListViewModel$loadData$1(this.this$0, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HomeTokenListViewModel$loadData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objAEQbTJ;
        Object obj2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            this.this$0.EZpvd.setValue(InterfaceC28519kcM.TaskDescription.AEQbTJ);
            this.this$0.AhwBna();
            C28542kcj c28542kcj = this.this$0.OLrzqt;
            AdvancedFilter advancedFilter = this.$filter;
            this.label = 1;
            objAEQbTJ = c28542kcj.AEQbTJ(advancedFilter, this);
            if (objAEQbTJ == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objAEQbTJ = obj2;
                HomeTokenListViewModel homeTokenListViewModel = this.this$0;
                if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
                    homeTokenListViewModel.EZpvd.setValue(InterfaceC28519kcM.Activity.OLrzqt);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
            objAEQbTJ = ((Result) obj).m7386unboximpl();
        }
        HomeTokenListViewModel homeTokenListViewModel2 = this.this$0;
        AdvancedFilter advancedFilter2 = this.$filter;
        if (Result.m7384isSuccessimpl(objAEQbTJ)) {
            List list = (List) objAEQbTJ;
            if (list.isEmpty()) {
                homeTokenListViewModel2.EZpvd.setValue(InterfaceC28519kcM.StateListAnimator.EZpvd);
                return Unit.INSTANCE;
            }
            homeTokenListViewModel2.EZpvd.setValue(new InterfaceC28519kcM.ActionBar(list));
            this.L$0 = objAEQbTJ;
            this.label = 2;
            if (homeTokenListViewModel2.copydefault(advancedFilter2, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objAEQbTJ;
            objAEQbTJ = obj2;
        }
        HomeTokenListViewModel homeTokenListViewModel3 = this.this$0;
        if (Result.m7380exceptionOrNullimpl(objAEQbTJ) != null) {
        }
        return Unit.INSTANCE;
    }
}
