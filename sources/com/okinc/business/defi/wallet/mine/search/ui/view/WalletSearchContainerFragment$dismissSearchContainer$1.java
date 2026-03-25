package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.WithLifecycleStateKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchContainerFragment$dismissSearchContainer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $immediate;
    int label;
    final /* synthetic */ WalletSearchContainerFragment this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchContainerFragment$dismissSearchContainer$1(WalletSearchContainerFragment walletSearchContainerFragment, boolean z, Continuation<? super WalletSearchContainerFragment$dismissSearchContainer$1> continuation) {
        super(2, continuation);
        this.this$0 = walletSearchContainerFragment;
        this.$immediate = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchContainerFragment$dismissSearchContainer$1(this.this$0, this.$immediate, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchContainerFragment$dismissSearchContainer$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            final WalletSearchContainerFragment walletSearchContainerFragment = this.this$0;
            final boolean z = this.$immediate;
            if (state.compareTo(Lifecycle.State.CREATED) < 0) {
                throw new IllegalArgumentException(("target state must be CREATED or greater, found " + state).toString());
            }
            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
            boolean zIsDispatchNeeded = immediate.isDispatchNeeded(getContext());
            if (!zIsDispatchNeeded) {
                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    throw new LifecycleDestroyedException();
                }
                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                    walletSearchContainerFragment.AEQbTJ(z);
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchContainerFragment$dismissSearchContainer$1$invokeSuspend$$inlined$withStateAtLeast$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Unit invoke() {
                        walletSearchContainerFragment.AEQbTJ(z);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, function0, this) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return Unit.INSTANCE;
    }
}
