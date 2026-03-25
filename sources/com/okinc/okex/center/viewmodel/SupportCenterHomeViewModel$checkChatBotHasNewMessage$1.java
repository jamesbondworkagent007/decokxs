package com.okinc.okex.center.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C45348soB;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes10.dex */
public final class SupportCenterHomeViewModel$checkChatBotHasNewMessage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportCenterHomeViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportCenterHomeViewModel$checkChatBotHasNewMessage$1(SupportCenterHomeViewModel supportCenterHomeViewModel, Continuation<? super SupportCenterHomeViewModel$checkChatBotHasNewMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = supportCenterHomeViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportCenterHomeViewModel$checkChatBotHasNewMessage$1 supportCenterHomeViewModel$checkChatBotHasNewMessage$1 = new SupportCenterHomeViewModel$checkChatBotHasNewMessage$1(this.this$0, continuation);
        supportCenterHomeViewModel$checkChatBotHasNewMessage$1.L$0 = obj;
        return supportCenterHomeViewModel$checkChatBotHasNewMessage$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportCenterHomeViewModel$checkChatBotHasNewMessage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SupportCenterHomeViewModel supportCenterHomeViewModel = this.this$0;
                Result.Application application = Result.Companion;
                C45348soB c45348soB = supportCenterHomeViewModel.valueOf;
                this.label = 1;
                obj = c45348soB.OLrzqt(this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(C56443yFo.AEQbTJ(((Number) obj).intValue()));
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        SupportCenterHomeViewModel supportCenterHomeViewModel2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            supportCenterHomeViewModel2.AEQbTJ.setValue(new C32989mnw(C56443yFo.KWHzl(((Number) objM7377constructorimpl).intValue() > 0)));
        }
        Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        return Unit.INSTANCE;
    }
}
