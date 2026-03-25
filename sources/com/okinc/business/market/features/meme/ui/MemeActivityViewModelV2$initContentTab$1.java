package com.okinc.business.market.features.meme.ui;

import com.okinc.business.market.features.meme.filter.domain.MemeFilter;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeActivityViewModelV2$initContentTab$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $showLoading;
    final /* synthetic */ int $tabIndex;
    int label;
    final /* synthetic */ MemeActivityViewModelV2 this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemeActivityViewModelV2$initContentTab$1(MemeActivityViewModelV2 memeActivityViewModelV2, int i, boolean z, Continuation<? super MemeActivityViewModelV2$initContentTab$1> continuation) {
        super(2, continuation);
        this.this$0 = memeActivityViewModelV2;
        this.$tabIndex = i;
        this.$showLoading = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MemeActivityViewModelV2$initContentTab$1(this.this$0, this.$tabIndex, this.$showLoading, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MemeActivityViewModelV2$initContentTab$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            String strCopydefault = this.this$0.AEQbTJ(0).copydefault();
            List<String> listOLrzqt = this.this$0.AEQbTJ(this.$tabIndex).AEQbTJ().OLrzqt();
            String strCopydefault2 = this.this$0.fJNWhG.copydefault();
            MemePumpUseCase memePumpUseCase = this.this$0.values;
            MemeFilter memeFilterKWHzl = this.this$0.AEQbTJ(this.$tabIndex).KWHzl();
            int i2 = this.$tabIndex;
            boolean z = this.$showLoading;
            this.label = 1;
            if (memePumpUseCase.EZpvd(strCopydefault, strCopydefault2, listOLrzqt, memeFilterKWHzl, i2, z, this) == objCopydefault) {
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
