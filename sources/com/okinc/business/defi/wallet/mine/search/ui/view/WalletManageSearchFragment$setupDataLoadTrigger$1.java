package com.okinc.business.defi.wallet.mine.search.ui.view;

import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC19261fxu;
import o.C19095fun;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletManageSearchFragment$setupDataLoadTrigger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19095fun this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletManageSearchFragment$setupDataLoadTrigger$1(C19095fun c19095fun, Continuation<? super WalletManageSearchFragment$setupDataLoadTrigger$1> continuation) {
        super(2, continuation);
        this.this$0 = c19095fun;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletManageSearchFragment$setupDataLoadTrigger$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletManageSearchFragment$setupDataLoadTrigger$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<AbstractC19261fxu> stateFlowAEQbTJ = this.this$0.djBIcL().AEQbTJ();
            final C19095fun c19095fun = this.this$0;
            FlowCollector<? super AbstractC19261fxu> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletManageSearchFragment$setupDataLoadTrigger$1.3
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                public final Object emit(AbstractC19261fxu abstractC19261fxu, Continuation<? super Unit> continuation) {
                    if ((abstractC19261fxu instanceof AbstractC19261fxu.ActionBar) && !((AbstractC19261fxu.ActionBar) abstractC19261fxu).AEQbTJ()) {
                        c19095fun.EZpvd(true);
                        c19095fun.djBIcL().copydefault(true);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
