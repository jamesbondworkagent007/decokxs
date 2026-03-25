package com.okinc.business.trade.features.home.ui.cefi;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import o.C30607leO;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC30619lea;
import o.kRM;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainFragment$trackEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ kRM $bean;
    final /* synthetic */ InterfaceC30619lea $event;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AdvancedMainFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedMainFragment$trackEvent$1(AdvancedMainFragment advancedMainFragment, InterfaceC30619lea interfaceC30619lea, kRM krm, Continuation<? super AdvancedMainFragment$trackEvent$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedMainFragment;
        this.$event = interfaceC30619lea;
        this.$bean = krm;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdvancedMainFragment$trackEvent$1(this.this$0, this.$event, this.$bean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AdvancedMainFragment$trackEvent$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C30607leO c30607leOUzCIH;
        InterfaceC30619lea interfaceC30619lea;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            c30607leOUzCIH = this.this$0.uzCIH();
            InterfaceC30619lea interfaceC30619lea2 = this.$event;
            AdvancedMainFragment advancedMainFragment = this.this$0;
            kRM krm = this.$bean;
            this.L$0 = c30607leOUzCIH;
            this.L$1 = interfaceC30619lea2;
            this.label = 1;
            Object objOLrzqt = advancedMainFragment.OLrzqt(krm, (Continuation<? super kRM>) this);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            interfaceC30619lea = interfaceC30619lea2;
            obj = objOLrzqt;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC30619lea = (InterfaceC30619lea) this.L$1;
            c30607leOUzCIH = (C30607leO) this.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        c30607leOUzCIH.KWHzl(interfaceC30619lea, (kRM) obj);
        return Unit.INSTANCE;
    }
}
