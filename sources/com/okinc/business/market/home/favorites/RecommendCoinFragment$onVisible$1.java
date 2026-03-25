package com.okinc.business.market.home.favorites;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C27831kEy;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC54581xNr;
import o.pWO;

/* JADX INFO: loaded from: classes7.dex */
public final class RecommendCoinFragment$onVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C27831kEy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecommendCoinFragment$onVisible$1(C27831kEy c27831kEy, Continuation<? super RecommendCoinFragment$onVisible$1> continuation) {
        super(2, continuation);
        this.this$0 = c27831kEy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecommendCoinFragment$onVisible$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecommendCoinFragment$onVisible$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C27831kEy c27831kEy;
        C27831kEy c27831kEy2;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Throwable th) {
            Result.Application application = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c27831kEy = this.this$0;
            Result.Application application2 = Result.Companion;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = pWO.KWHzl().OLrzqt();
            if (interfaceC54581xNrOLrzqt != null) {
                this.L$0 = c27831kEy;
                this.label = 1;
                Object objEZpvd = interfaceC54581xNrOLrzqt.EZpvd("SPOT", this);
                if (objEZpvd == objCopydefault) {
                    return objCopydefault;
                }
                c27831kEy2 = c27831kEy;
                obj = objEZpvd;
            }
            Result.m7377constructorimpl(C56443yFo.KWHzl(c27831kEy.isConnected.copydefault()));
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c27831kEy2 = (C27831kEy) this.L$0;
        C56391yDq.AEQbTJ(obj);
        c27831kEy = c27831kEy2;
        Result.m7377constructorimpl(C56443yFo.KWHzl(c27831kEy.isConnected.copydefault()));
        return Unit.INSTANCE;
    }
}
