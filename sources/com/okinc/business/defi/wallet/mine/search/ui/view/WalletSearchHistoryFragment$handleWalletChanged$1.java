package com.okinc.business.defi.wallet.mine.search.ui.view;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.WithLifecycleStateKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o.C19080fuY;
import o.C56391yDq;
import o.C56442yFn;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchHistoryFragment$handleWalletChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C19080fuY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSearchHistoryFragment$handleWalletChanged$1(C19080fuY c19080fuY, Continuation<? super WalletSearchHistoryFragment$handleWalletChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = c19080fuY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSearchHistoryFragment$handleWalletChanged$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSearchHistoryFragment$handleWalletChanged$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:5:0x000b, B:10:0x001b, B:12:0x0031, B:14:0x0043, B:16:0x004b, B:18:0x0055, B:19:0x005b, B:20:0x0060, B:21:0x0061, B:24:0x0070, B:25:0x008a), top: B:30:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                Lifecycle lifecycle = this.this$0.getViewLifecycleOwner().getLifecycle();
                Lifecycle.State state = Lifecycle.State.RESUMED;
                final C19080fuY c19080fuY = this.this$0;
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
                        c19080fuY.copydefault();
                        Unit unit = Unit.INSTANCE;
                    }
                } else {
                    Function0<Unit> function0 = new Function0<Unit>() { // from class: com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$handleWalletChanged$1$invokeSuspend$$inlined$withStateAtLeast$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Unit invoke() {
                            c19080fuY.copydefault();
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
        } catch (Exception e) {
            pUU.AEQbTJ(this.this$0.getTAG(), "Error waiting to pop after wallet change: " + e.getMessage(), e);
        }
        return Unit.INSTANCE;
    }
}
