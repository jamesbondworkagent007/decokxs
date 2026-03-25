package com.okinc.business.defi.wallet.home;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.WithLifecycleStateKt;
import com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initView$11;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C15572eNh;
import o.C16592emo;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C57656ymY;
import o.dTK;
import o.dTL;
import o.dTQ;
import o.fVE;
import o.pUU;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$initView$11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$initView$11(C15572eNh c15572eNh, Continuation<? super DefiHomeFragmentNew$initView$11> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$initView$11(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$initView$11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initView$11$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<dTK, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ C15572eNh this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C15572eNh c15572eNh, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = c15572eNh;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(dTK dtk, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(dtk, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0088 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:5:0x000d, B:11:0x0023, B:14:0x0033, B:16:0x0052, B:18:0x005a, B:20:0x0064, B:22:0x006a, B:24:0x006f, B:25:0x0082, B:26:0x0087, B:27:0x0088, B:30:0x0097), top: B:36:0x0009 }] */
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
                    final dTK dtk = (dTK) this.L$0;
                    if (dtk != null) {
                        C16592emo c16592emo = null;
                        if (dTQ.TaskDescription.walletSupportTEE2Account$default((dTQ) C43251rlk.copydefault(dTQ.class), null, 1, null)) {
                            Lifecycle lifecycle = this.this$0.getLifecycle();
                            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
                            final C15572eNh c15572eNh = this.this$0;
                            Lifecycle.State state = Lifecycle.State.RESUMED;
                            MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                            boolean zIsDispatchNeeded = immediate.isDispatchNeeded(getContext());
                            if (!zIsDispatchNeeded) {
                                if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                                    throw new LifecycleDestroyedException();
                                }
                                if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                                    C16592emo c16592emo2 = c15572eNh.getNewProxyInstance;
                                    if (c16592emo2 == null) {
                                        Intrinsics.gEmmrt("");
                                    } else {
                                        c16592emo = c16592emo2;
                                    }
                                    C56443yFo.KWHzl(c16592emo.getRoot().postDelayed(new Activity(dtk), 100L));
                                }
                            } else {
                                Function0<Boolean> function0 = new Function0<Boolean>() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initView$11$1$invokeSuspend$$inlined$withResumed$1
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        C16592emo c16592emo3 = c15572eNh.getNewProxyInstance;
                                        if (c16592emo3 == null) {
                                            Intrinsics.gEmmrt("");
                                            c16592emo3 = null;
                                        }
                                        return Boolean.valueOf(c16592emo3.getRoot().postDelayed(new DefiHomeFragmentNew$initView$11.AnonymousClass1.Activity(dtk), 100L));
                                    }
                                };
                                this.label = 1;
                                if (WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, function0, this) == objCopydefault) {
                                    return objCopydefault;
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            } catch (Exception e) {
                pUU.copydefault(this.this$0.getTAG(), "collect mainWalletModeState error: " + e.getMessage());
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$initView$11$1$Activity */
        public static final class Activity implements Runnable {
            public final /* synthetic */ dTK EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(dTK dtk) {
                this.EZpvd = dtk;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dTK dtk = this.EZpvd;
                if (dtk instanceof dTK.Fragment) {
                    pUU.OLrzqt("fcj post WalletModel ");
                    C57656ymY.OLrzqt.valueOf();
                    fVE.Companion.EZpvd().EZpvd();
                } else if (dtk instanceof dTK.Application) {
                    pUU.OLrzqt("fcj post DexModel ");
                    C57656ymY.OLrzqt.valueOf();
                    fVE.Companion.EZpvd().copydefault();
                }
                dTL dtl = (dTL) C43251rlk.OLrzqt(dTL.class);
                if (dtl != null) {
                    dtl.OLrzqt();
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        StateFlow<dTK> stateFlowEZpvd;
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            dTL dtl = (dTL) C43251rlk.OLrzqt(dTL.class);
            if (dtl != null && (stateFlowEZpvd = dtl.EZpvd()) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowEZpvd, anonymousClass1, this) == objCopydefault) {
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
