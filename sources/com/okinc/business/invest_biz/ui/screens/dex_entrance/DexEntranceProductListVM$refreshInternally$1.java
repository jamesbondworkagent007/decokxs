package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import com.okinc.business.invest_biz.data.bean.DexEntranceCommonV2Sort;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceProductListVM$refreshInternally$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DexEntranceCommonV2Sort $sortBean;
    int label;
    final /* synthetic */ DexEntranceProductListVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexEntranceProductListVM$refreshInternally$1(DexEntranceProductListVM dexEntranceProductListVM, DexEntranceCommonV2Sort dexEntranceCommonV2Sort, Continuation<? super DexEntranceProductListVM$refreshInternally$1> continuation) {
        super(2, continuation);
        this.this$0 = dexEntranceProductListVM;
        this.$sortBean = dexEntranceCommonV2Sort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexEntranceProductListVM$refreshInternally$1(this.this$0, this.$sortBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexEntranceProductListVM$refreshInternally$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            DexEntranceProductListVM dexEntranceProductListVM = this.this$0;
            DexEntranceCommonV2Sort dexEntranceCommonV2Sort = this.$sortBean;
            this.label = 1;
            if (dexEntranceProductListVM.copydefault(dexEntranceCommonV2Sort, 1, this) == objCopydefault) {
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
