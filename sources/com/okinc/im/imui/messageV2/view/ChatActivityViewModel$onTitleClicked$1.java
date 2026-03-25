package com.okinc.im.imui.messageV2.view;

import androidx.lifecycle.MutableLiveData;
import com.okinc.im.config.serviceprovider.GeneralAction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C36588odm;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes8.dex */
public final class ChatActivityViewModel$onTitleClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Continuation<? super GeneralAction>, Object> $pageConfigClickAction;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChatActivityViewModel this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.okinc.im.config.serviceprovider.GeneralAction>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatActivityViewModel$onTitleClicked$1(Function1<? super Continuation<? super GeneralAction>, ? extends Object> function1, ChatActivityViewModel chatActivityViewModel, Continuation<? super ChatActivityViewModel$onTitleClicked$1> continuation) {
        super(2, continuation);
        this.$pageConfigClickAction = function1;
        this.this$0 = chatActivityViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatActivityViewModel$onTitleClicked$1 chatActivityViewModel$onTitleClicked$1 = new ChatActivityViewModel$onTitleClicked$1(this.$pageConfigClickAction, this.this$0, continuation);
        chatActivityViewModel$onTitleClicked$1.L$0 = obj;
        return chatActivityViewModel$onTitleClicked$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatActivityViewModel$onTitleClicked$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        GeneralAction generalAction;
        Object obj2;
        Throwable thM7380exceptionOrNullimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Function1<Continuation<? super GeneralAction>, Object> function1 = this.$pageConfigClickAction;
            Result.Application application2 = Result.Companion;
            this.label = 1;
            obj = function1.invoke(this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                C56391yDq.AEQbTJ(obj);
                objM7377constructorimpl = obj2;
                thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                if (thM7380exceptionOrNullimpl != null) {
                    pUU.AEQbTJ("ChatActivityViewModel", "onTitleClicked pageConfigClickAction error", thM7380exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        objM7377constructorimpl = Result.m7377constructorimpl((GeneralAction) obj);
        ChatActivityViewModel chatActivityViewModel = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl) && (generalAction = (GeneralAction) objM7377constructorimpl) != null) {
            MutableLiveData mutableLiveData = chatActivityViewModel.OLrzqt;
            C32989mnw c32989mnw = new C32989mnw(generalAction);
            this.L$0 = objM7377constructorimpl;
            this.label = 2;
            if (C36588odm.KWHzl(mutableLiveData, c32989mnw, this) == objCopydefault) {
                return objCopydefault;
            }
            obj2 = objM7377constructorimpl;
            objM7377constructorimpl = obj2;
        }
        thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }
}
