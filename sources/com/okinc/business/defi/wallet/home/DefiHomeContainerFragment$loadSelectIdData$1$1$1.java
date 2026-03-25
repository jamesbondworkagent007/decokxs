package com.okinc.business.defi.wallet.home;

import androidx.fragment.app.Fragment;
import com.okinc.business.defi.biz.core.common.WalletSelectedChainBean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import o.C15572eNh;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeContainerFragment$loadSelectIdData$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<WalletSelectedChainBean> $walletSelectedChainBean;
    int label;
    final /* synthetic */ DefiHomeContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeContainerFragment$loadSelectIdData$1$1$1(DefiHomeContainerFragment defiHomeContainerFragment, Ref.ObjectRef<WalletSelectedChainBean> objectRef, Continuation<? super DefiHomeContainerFragment$loadSelectIdData$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = defiHomeContainerFragment;
        this.$walletSelectedChainBean = objectRef;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeContainerFragment$loadSelectIdData$1$1$1(this.this$0, this.$walletSelectedChainBean, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeContainerFragment$loadSelectIdData$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C56442yFn.copydefault();
        if (this.label == 0) {
            C56391yDq.AEQbTJ(obj);
            DefiHomeContainerFragment defiHomeContainerFragment = this.this$0;
            defiHomeContainerFragment.copydefault(defiHomeContainerFragment.isConnected);
            Fragment fragmentFindFragmentByTag = this.this$0.getChildFragmentManager().findFragmentByTag("DefiHomeFragmentNew");
            C15572eNh c15572eNh = fragmentFindFragmentByTag instanceof C15572eNh ? (C15572eNh) fragmentFindFragmentByTag : null;
            if (c15572eNh == null) {
                return null;
            }
            c15572eNh.EZpvd(this.$walletSelectedChainBean.element);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
