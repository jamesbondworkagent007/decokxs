package com.okinc.business.defi.wallet.tx.history.viewmodel;

import com.okinc.network.okg.response.OKServerException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.AbstractC43419rot;
import o.C13934dbu;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.Point;
import o.gEQ;

/* JADX INFO: loaded from: classes5.dex */
public final class DynamicTokenCheckViewModel$checkIfTokenIsDynamic$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $coinId;
    int label;
    final /* synthetic */ gEQ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicTokenCheckViewModel$checkIfTokenIsDynamic$1(gEQ geq, String str, Continuation<? super DynamicTokenCheckViewModel$checkIfTokenIsDynamic$1> continuation) {
        super(2, continuation);
        this.this$0 = geq;
        this.$coinId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DynamicTokenCheckViewModel$checkIfTokenIsDynamic$1(this.this$0, this.$coinId, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DynamicTokenCheckViewModel$checkIfTokenIsDynamic$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C13934dbu c13934dbu = this.this$0.OLrzqt;
            String str = this.$coinId;
            this.label = 1;
            obj = c13934dbu.AEQbTJ(str, this);
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) obj;
        gEQ geq = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.StateListAnimator) {
            geq.AEQbTJ.setValue(new Point.Application(C56443yFo.KWHzl(((Boolean) ((AbstractC43419rot.StateListAnimator) abstractC43419rot).KWHzl()).booleanValue())));
        }
        gEQ geq2 = this.this$0;
        if (abstractC43419rot instanceof AbstractC43419rot.ActionBar) {
            geq2.AEQbTJ.setValue(new Point.TaskDescription(((OKServerException) ((AbstractC43419rot.ActionBar) abstractC43419rot).KWHzl()).getMessage()));
        }
        return Unit.INSTANCE;
    }
}
