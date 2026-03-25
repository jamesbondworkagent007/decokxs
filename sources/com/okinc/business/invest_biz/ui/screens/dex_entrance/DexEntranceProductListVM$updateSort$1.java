package com.okinc.business.invest_biz.ui.screens.dex_entrance;

import com.okinc.business.invest_biz.data.bean.DexEntranceCommonV2Sort;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceProductListVM$updateSort$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $property;
    final /* synthetic */ String $sortBy;
    int label;
    final /* synthetic */ DexEntranceProductListVM this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexEntranceProductListVM$updateSort$1(DexEntranceProductListVM dexEntranceProductListVM, String str, String str2, Continuation<? super DexEntranceProductListVM$updateSort$1> continuation) {
        super(2, continuation);
        this.this$0 = dexEntranceProductListVM;
        this.$property = str;
        this.$sortBy = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexEntranceProductListVM$updateSort$1(this.this$0, this.$property, this.$sortBy, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexEntranceProductListVM$updateSort$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<DexEntranceCommonV2Sort> mutableStateFlowEZpvd = this.this$0.EZpvd();
            DexEntranceCommonV2Sort dexEntranceCommonV2Sort = new DexEntranceCommonV2Sort(this.$property, this.$sortBy);
            this.label = 1;
            if (mutableStateFlowEZpvd.emit(dexEntranceCommonV2Sort, this) == objCopydefault) {
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
