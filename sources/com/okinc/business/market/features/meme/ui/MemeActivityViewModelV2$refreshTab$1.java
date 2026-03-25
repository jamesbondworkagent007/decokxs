package com.okinc.business.market.features.meme.ui;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C28634keV;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$refreshTab$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C28634keV $filter;
    final /* synthetic */ int $index;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$refreshTab$1(MemeActivityViewModelV2 memeActivityViewModelV2, int i, C28634keV c28634keV, Continuation<? super MemeActivityViewModelV2$refreshTab$1> continuation) {
        super(2, continuation);
        this.this$0 = memeActivityViewModelV2;
        this.$index = i;
        this.$filter = c28634keV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$refreshTab$1(this.this$0, this.$index, this.$filter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$refreshTab$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MemePumpUseCase memePumpUseCase = this.this$0.values;
            int i2 = this.$index;
            String strCopydefault = this.$filter.copydefault();
            List<String> listOLrzqt = this.$filter.AEQbTJ().OLrzqt();
            String strCopydefault2 = this.this$0.fJNWhG.copydefault();
            this.label = 1;
            if (memePumpUseCase.AEQbTJ(i2, (48 & 2) != 0 ? null : strCopydefault, (48 & 4) != 0 ? null : listOLrzqt, (48 & 8) != 0 ? null : strCopydefault2, (48 & 16) != 0 ? null : null, (48 & 32) != 0 ? false : false, this) == objCopydefault) {
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
