package com.okinc.business.invest_biz.ui.screens.home;

import com.okinc.business.invest_biz.ui.screens.home.InvestHomeV2ViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestHomeV2ViewModel$initData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceRefresh;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ InvestHomeV2ViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestHomeV2ViewModel$initData$1(boolean z, InvestHomeV2ViewModel investHomeV2ViewModel, Continuation<? super InvestHomeV2ViewModel$initData$1> continuation) {
        super(2, continuation);
        this.$forceRefresh = z;
        this.this$0 = investHomeV2ViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InvestHomeV2ViewModel$initData$1 investHomeV2ViewModel$initData$1 = new InvestHomeV2ViewModel$initData$1(this.$forceRefresh, this.this$0, continuation);
        investHomeV2ViewModel$initData$1.L$0 = obj;
        return investHomeV2ViewModel$initData$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestHomeV2ViewModel$initData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineScope coroutineScope;
        InvestHomeV2ViewModel investHomeV2ViewModel;
        boolean z;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            if (!this.$forceRefresh) {
                MutableStateFlow mutableStateFlow = this.this$0.gEmmrt;
                InvestHomeV2ViewModel.TaskDescription.Activity activity = InvestHomeV2ViewModel.TaskDescription.Activity.EZpvd;
                this.L$0 = coroutineScope;
                this.label = 1;
                if (mutableStateFlow.emit(activity, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                C56391yDq.AEQbTJ(obj);
                investHomeV2ViewModel = this.this$0;
                z = this.$forceRefresh;
                this.label = 3;
                if (investHomeV2ViewModel.EZpvd(z, (List) obj, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        CoroutineScope coroutineScope2 = coroutineScope;
        Deferred[] deferredArr = {InvestHomeV2ViewModel.getInitDataAsync$default(this.this$0, coroutineScope2, this.$forceRefresh, false, 2, null), InvestHomeV2ViewModel.getHomeTokensAsync$OKDeFi_invest_biz$default(this.this$0, coroutineScope2, this.$forceRefresh, false, 2, null), InvestHomeV2ViewModel.getTabsDataAsync$default(this.this$0, coroutineScope2, this.$forceRefresh, false, 2, null), InvestHomeV2ViewModel.getLearnDataAsync$OKDeFi_invest_biz$default(this.this$0, coroutineScope2, this.$forceRefresh, false, 2, null)};
        this.L$0 = null;
        this.label = 2;
        obj = AwaitKt.awaitAll(deferredArr, this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        investHomeV2ViewModel = this.this$0;
        z = this.$forceRefresh;
        this.label = 3;
        if (investHomeV2ViewModel.EZpvd(z, (List) obj, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
