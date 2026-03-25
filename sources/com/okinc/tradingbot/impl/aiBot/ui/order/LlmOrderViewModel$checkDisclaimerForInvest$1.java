package com.okinc.tradingbot.impl.aiBot.ui.order;

import com.okinc.tradingbot.impl.aiBot.dto.LlmDisclaimerInfoDto;
import com.okinc.tradingbot.impl.aiBot.ui.order.LlmOrderViewModel;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C43422row;
import o.C56391yDq;
import o.C56442yFn;
import o.uCP;

/* JADX INFO: loaded from: classes11.dex */
public final class LlmOrderViewModel$checkDisclaimerForInvest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LlmOrderViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LlmOrderViewModel$checkDisclaimerForInvest$1(LlmOrderViewModel llmOrderViewModel, Continuation<? super LlmOrderViewModel$checkDisclaimerForInvest$1> continuation) {
        super(2, continuation);
        this.this$0 = llmOrderViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LlmOrderViewModel$checkDisclaimerForInvest$1 llmOrderViewModel$checkDisclaimerForInvest$1 = new LlmOrderViewModel$checkDisclaimerForInvest$1(this.this$0, continuation);
        llmOrderViewModel$checkDisclaimerForInvest$1.L$0 = obj;
        return llmOrderViewModel$checkDisclaimerForInvest$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LlmOrderViewModel$checkDisclaimerForInvest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        LlmOrderViewModel llmOrderViewModel;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LlmOrderViewModel llmOrderViewModel2 = this.this$0;
                Result.Application application = Result.Companion;
                uCP ucp = llmOrderViewModel2.AkhnZx;
                this.L$0 = llmOrderViewModel2;
                this.label = 1;
                Object objKWHzl = ucp.KWHzl("ai_bot_create", this);
                if (objKWHzl == objCopydefault) {
                    return objCopydefault;
                }
                llmOrderViewModel = llmOrderViewModel2;
                obj = objKWHzl;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                llmOrderViewModel = (LlmOrderViewModel) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            List list = (List) obj;
            if (!list.isEmpty()) {
                llmOrderViewModel.EZpvd(new LlmOrderViewModel.Application.C0636Application((LlmDisclaimerInfoDto) CollectionsKt___CollectionsKt.AuCTelauCTel(list)));
            } else {
                llmOrderViewModel.EZpvd(LlmOrderViewModel.Application.TaskDescription.EZpvd);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        LlmOrderViewModel llmOrderViewModel3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = C43422row.OLrzqt();
            }
            llmOrderViewModel3.EZpvd(new LlmOrderViewModel.Application.ActionBar(message));
        }
        return Unit.INSTANCE;
    }
}
