package com.okinc.business.defi.wallet.mine.viewmodel;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwaitKt;
import o.AbstractC58260yxt;
import o.C19304fyk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletBatchCreateAccountMode$getAvailableCount$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ C19304fyk this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletBatchCreateAccountMode$getAvailableCount$1$1$1(C19304fyk c19304fyk, Continuation<? super DefiWalletBatchCreateAccountMode$getAvailableCount$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = c19304fyk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletBatchCreateAccountMode$getAvailableCount$1$1$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletBatchCreateAccountMode$getAvailableCount$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Integer num;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            AbstractC58260yxt<Integer> abstractC58260yxtAkhnZx = this.this$0.AYXKKw.AkhnZx();
            this.label = 1;
            obj = RxAwaitKt.await(abstractC58260yxtAkhnZx, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) this.L$0;
                C56391yDq.AEQbTJ(obj);
                Integer num2 = (Integer) obj;
                int iIntValue = num.intValue();
                Intrinsics.copydefault(num2);
                int iIntValue2 = num2.intValue();
                C19304fyk c19304fyk = this.this$0;
                c19304fyk.AEQbTJ(c19304fyk.gEmmrt - (iIntValue - iIntValue2));
                this.this$0.KWHzl().postValue(C56443yFo.AEQbTJ(this.this$0.OLrzqt()));
                return Unit.INSTANCE;
            }
            C56391yDq.AEQbTJ(obj);
        }
        Integer num3 = (Integer) obj;
        AbstractC58260yxt<Integer> abstractC58260yxtValues = this.this$0.AYXKKw.values();
        this.L$0 = num3;
        this.label = 2;
        Object objAwait = RxAwaitKt.await(abstractC58260yxtValues, this);
        if (objAwait == objCopydefault) {
            return objCopydefault;
        }
        num = num3;
        obj = objAwait;
        Integer num22 = (Integer) obj;
        int iIntValue3 = num.intValue();
        Intrinsics.copydefault(num22);
        int iIntValue22 = num22.intValue();
        C19304fyk c19304fyk2 = this.this$0;
        c19304fyk2.AEQbTJ(c19304fyk2.gEmmrt - (iIntValue3 - iIntValue22));
        this.this$0.KWHzl().postValue(C56443yFo.AEQbTJ(this.this$0.OLrzqt()));
        return Unit.INSTANCE;
    }
}
