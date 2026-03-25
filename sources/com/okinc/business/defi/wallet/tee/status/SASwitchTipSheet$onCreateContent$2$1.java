package com.okinc.business.defi.wallet.tee.status;

import android.content.Context;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC12782ctV;
import o.AbstractC58260yxt;
import o.C12827cuN;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTQ;
import o.fWY;

/* JADX INFO: loaded from: classes5.dex */
public final class SASwitchTipSheet$onCreateContent$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ fWY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SASwitchTipSheet$onCreateContent$2$1(fWY fwy, Continuation<? super SASwitchTipSheet$onCreateContent$2$1> continuation) {
        super(2, continuation);
        this.this$0 = fwy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SASwitchTipSheet$onCreateContent$2$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SASwitchTipSheet$onCreateContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Context context;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Context context2 = this.this$0.getContext();
            if (context2 != null) {
                AbstractC58260yxt<AbstractC12782ctV> abstractC58260yxtOLrzqt = C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).OLrzqt(this.this$0.AEQbTJ(), false);
                this.L$0 = context2;
                this.label = 1;
                Object objAwait = RxAwaitKt.await(abstractC58260yxtOLrzqt, this);
                if (objAwait == objCopydefault) {
                    return objCopydefault;
                }
                context = context2;
                obj = objAwait;
            }
            this.this$0.copydefault = false;
            this.this$0.dismiss();
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context3 = (Context) this.L$0;
        C56391yDq.AEQbTJ(obj);
        context = context3;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) obj;
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Intrinsics.copydefault(abstractC12782ctV);
        dTQ.TaskDescription.enterTeeReNewPageAndCheck$default(dtq, context, abstractC12782ctV, null, "", 4, null);
        this.this$0.copydefault = false;
        this.this$0.dismiss();
        return Unit.INSTANCE;
    }
}
