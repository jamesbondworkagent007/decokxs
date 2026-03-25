package com.okinc.business.defi.wallet.home.fragment;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C18013faQ;
import o.C56391yDq;
import o.C56442yFn;
import o.Point;

/* JADX INFO: loaded from: classes18.dex */
public final class ChooseNetworkContainerViewModel$fetchMainWallet$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C18013faQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseNetworkContainerViewModel$fetchMainWallet$2(C18013faQ c18013faQ, Continuation<? super ChooseNetworkContainerViewModel$fetchMainWallet$2> continuation) {
        super(2, continuation);
        this.this$0 = c18013faQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChooseNetworkContainerViewModel$fetchMainWallet$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChooseNetworkContainerViewModel$fetchMainWallet$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7377constructorimpl;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                C18013faQ c18013faQ = this.this$0;
                Result.Application application = Result.Companion;
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtCopydefault = c18013faQ.EZpvd.copydefault(false);
                this.label = 1;
                obj = RxAwaitKt.await(abstractC58260yxtCopydefault, this);
                if (obj == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            objM7377constructorimpl = Result.m7377constructorimpl((AbstractC12782ctV) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C18013faQ c18013faQ2 = this.this$0;
        if (Result.m7384isSuccessimpl(objM7377constructorimpl)) {
            c18013faQ2.OLrzqt.setValue(new Point.Application((AbstractC12782ctV) objM7377constructorimpl));
        }
        C18013faQ c18013faQ3 = this.this$0;
        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            c18013faQ3.OLrzqt.setValue(new Point.TaskDescription(thM7380exceptionOrNullimpl.getMessage()));
        }
        return Unit.INSTANCE;
    }
}
