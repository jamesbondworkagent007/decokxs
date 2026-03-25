package com.okinc.im.imui.contacts.viewmodel;

import androidx.lifecycle.MutableLiveData;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C32989mnw;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.nAG;

/* JADX INFO: loaded from: classes18.dex */
public final class RemoveContactViewModel$removeContactOps$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $contactId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nAG this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveContactViewModel$removeContactOps$1(nAG nag, String str, Continuation<? super RemoveContactViewModel$removeContactOps$1> continuation) {
        super(2, continuation);
        this.this$0 = nag;
        this.$contactId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RemoveContactViewModel$removeContactOps$1 removeContactViewModel$removeContactOps$1 = new RemoveContactViewModel$removeContactOps$1(this.this$0, this.$contactId, continuation);
        removeContactViewModel$removeContactOps$1.L$0 = obj;
        return removeContactViewModel$removeContactOps$1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RemoveContactViewModel$removeContactOps$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                this.this$0.AEQbTJ.setValue(C56443yFo.KWHzl(true));
                nAG nag = this.this$0;
                String str = this.$contactId;
                Result.Application application = Result.Companion;
                this.label = 1;
                if (nag.KWHzl(str, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        nAG nag2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            nag2.OLrzqt.setValue(new C32989mnw(Unit.INSTANCE));
        }
        nAG nag3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            MutableLiveData mutableLiveData = nag3.EZpvd;
            Throwable cause = thM7380exceptionOrNullimpl.getCause();
            if (cause != null) {
                thM7380exceptionOrNullimpl = cause;
            }
            mutableLiveData.setValue(new C32989mnw(thM7380exceptionOrNullimpl));
        }
        this.this$0.AEQbTJ.setValue(C56443yFo.KWHzl(false));
        return Unit.INSTANCE;
    }
}
