package com.okinc.business.defi.common.view;

import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import o.AbstractC14702dqT;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes4.dex */
public final class DefiBaseCreateWalletLoadingDFragment$showFragment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fm;
    final /* synthetic */ long $showDelay;
    final /* synthetic */ String $tag;
    int label;
    final /* synthetic */ AbstractC14702dqT this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiBaseCreateWalletLoadingDFragment$showFragment$1(long j, AbstractC14702dqT abstractC14702dqT, FragmentManager fragmentManager, String str, Continuation<? super DefiBaseCreateWalletLoadingDFragment$showFragment$1> continuation) {
        super(2, continuation);
        this.$showDelay = j;
        this.this$0 = abstractC14702dqT;
        this.$fm = fragmentManager;
        this.$tag = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiBaseCreateWalletLoadingDFragment$showFragment$1(this.$showDelay, this.this$0, this.$fm, this.$tag, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiBaseCreateWalletLoadingDFragment$showFragment$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("DefiCreateWalletLoadingDFragment", "showFragment: before delay");
            long j = this.$showDelay;
            this.label = 1;
            if (DelayKt.delay(j, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        pUU.EZpvd("DefiCreateWalletLoadingDFragment", "showFragment: after 250ms delay");
        this.this$0.show(this.$fm, this.$tag);
        return Unit.INSTANCE;
    }
}
