package com.okinc.im.imui.conversationlist.viewmodel;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C33842nHw;
import o.C56391yDq;
import o.C56442yFn;
import o.nHG;

/* JADX INFO: loaded from: classes18.dex */
public final class ConvoListBottomSheetMenuViewModel$markAllAsRead$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nHG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConvoListBottomSheetMenuViewModel$markAllAsRead$1(nHG nhg, Continuation<? super ConvoListBottomSheetMenuViewModel$markAllAsRead$1> continuation) {
        super(2, continuation);
        this.this$0 = nhg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConvoListBottomSheetMenuViewModel$markAllAsRead$1 convoListBottomSheetMenuViewModel$markAllAsRead$1 = new ConvoListBottomSheetMenuViewModel$markAllAsRead$1(this.this$0, continuation);
        convoListBottomSheetMenuViewModel$markAllAsRead$1.L$0 = obj;
        return convoListBottomSheetMenuViewModel$markAllAsRead$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConvoListBottomSheetMenuViewModel$markAllAsRead$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        nHG nhg;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.OLrzqt.setValue(new C32989mnw(new nHG.Application.Activity(true)));
                nHG nhg2 = this.this$0;
                Result.Application application = Result.Companion;
                C33842nHw c33842nHw = nhg2.copydefault;
                this.L$0 = nhg2;
                this.label = 1;
                Object objOLrzqt = c33842nHw.OLrzqt(this);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                nhg = nhg2;
                obj = objOLrzqt;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nhg = (nHG) this.L$0;
                C56391yDq.AEQbTJ(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            nhg.OLrzqt.setValue(new C32989mnw(new nHG.Application.Activity(false)));
            nhg.OLrzqt.setValue(new C32989mnw(new nHG.Application.C0889Application(zBooleanValue)));
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        nHG nhg3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            nhg3.OLrzqt.setValue(new C32989mnw(new nHG.Application.Activity(true)));
            String message = thM7380exceptionOrNullimpl.getMessage();
            if (message != null) {
                nhg3.OLrzqt.setValue(new C32989mnw(new nHG.Application.TaskDescription(message)));
            }
        }
        return Unit.INSTANCE;
    }
}
