package com.okinc.tradingbot.impl.aiBot.ui.preview;

import com.okinc.tradingbot.impl.aiBot.dto.PreviewAiStrategyResponseDto;
import com.okinc.tradingbot.impl.aiBot.ui.preview.PreviewAiStrategyViewModel;
import com.okinc.unify_trade.biz.AiOrderReq;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56442yFn;
import o.uCS;

/* JADX INFO: loaded from: classes11.dex */
public final class PreviewAiStrategyViewModel$previewStrategy$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AiOrderReq $orderReq;
    int label;
    final /* synthetic */ PreviewAiStrategyViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAiStrategyViewModel$previewStrategy$2(PreviewAiStrategyViewModel previewAiStrategyViewModel, AiOrderReq aiOrderReq, Continuation<? super PreviewAiStrategyViewModel$previewStrategy$2> continuation) {
        super(2, continuation);
        this.this$0 = previewAiStrategyViewModel;
        this.$orderReq = aiOrderReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreviewAiStrategyViewModel$previewStrategy$2(this.this$0, this.$orderReq, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreviewAiStrategyViewModel$previewStrategy$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PreviewAiStrategyViewModel previewAiStrategyViewModel;
        PreviewAiStrategyViewModel.StateListAnimator.Application application;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            PreviewAiStrategyViewModel previewAiStrategyViewModel2 = this.this$0;
            PreviewAiStrategyViewModel.StateListAnimator.TaskDescription taskDescription = PreviewAiStrategyViewModel.StateListAnimator.TaskDescription.OLrzqt;
            this.label = 1;
            if (previewAiStrategyViewModel2.OLrzqt(taskDescription, this) == objCopydefault) {
                return objCopydefault;
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
                previewAiStrategyViewModel = this.this$0;
                application = new PreviewAiStrategyViewModel.StateListAnimator.Application((PreviewAiStrategyResponseDto) obj);
                this.label = 3;
                if (previewAiStrategyViewModel.OLrzqt(application, this) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        uCS ucs = this.this$0.OLrzqt;
        AiOrderReq aiOrderReq = this.$orderReq;
        this.label = 2;
        obj = ucs.KWHzl(aiOrderReq, (Continuation) this);
        if (obj == objCopydefault) {
            return objCopydefault;
        }
        previewAiStrategyViewModel = this.this$0;
        application = new PreviewAiStrategyViewModel.StateListAnimator.Application((PreviewAiStrategyResponseDto) obj);
        this.label = 3;
        if (previewAiStrategyViewModel.OLrzqt(application, this) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }
}
