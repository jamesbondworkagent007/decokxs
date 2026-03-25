package com.okinc.business.defi.wallet.home.walletconnect.prompt;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC12782ctV;
import o.ActivityC18357fgq;
import o.C18346fgf;
import o.C56391yDq;
import o.C56442yFn;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletConnectConnectionPromptActivity$collectViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ ActivityC18357fgq this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletConnectConnectionPromptActivity$collectViewState$1(ActivityC18357fgq activityC18357fgq, Continuation<? super WalletConnectConnectionPromptActivity$collectViewState$1> continuation) {
        super(2, continuation);
        this.this$0 = activityC18357fgq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletConnectConnectionPromptActivity$collectViewState$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletConnectConnectionPromptActivity$collectViewState$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$collectViewState$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ ActivityC18357fgq this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityC18357fgq activityC18357fgq, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = activityC18357fgq;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.walletconnect.prompt.WalletConnectConnectionPromptActivity$collectViewState$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02871 extends SuspendLambda implements Function2<C18346fgf, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ ActivityC18357fgq this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02871(ActivityC18357fgq activityC18357fgq, Continuation<? super C02871> continuation) {
                super(2, continuation);
                this.this$0 = activityC18357fgq;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02871 c02871 = new C02871(this.this$0, continuation);
                c02871.L$0 = obj;
                return c02871;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(C18346fgf c18346fgf, Continuation<? super Unit> continuation) {
                return ((C02871) create(c18346fgf, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    C18346fgf c18346fgf = (C18346fgf) this.L$0;
                    Integer numKWHzl = c18346fgf.KWHzl();
                    if (numKWHzl != null && numKWHzl.intValue() == 0) {
                        ActivityC18357fgq activityC18357fgq = this.this$0;
                        String strCopydefault = c18346fgf.copydefault();
                        CharSequence charSequenceAhwBna = c18346fgf.AhwBna();
                        AbstractC12782ctV abstractC12782ctVAYXKKw = c18346fgf.AYXKKw();
                        activityC18357fgq.EZpvd(strCopydefault, charSequenceAhwBna, abstractC12782ctVAYXKKw != null ? abstractC12782ctVAYXKKw.AEQbTJ() : null, c18346fgf.OLrzqt(), c18346fgf.AEQbTJ(), c18346fgf.gEmmrt(), c18346fgf.valueOf());
                    } else if (numKWHzl != null && numKWHzl.intValue() == 1) {
                        this.this$0.copydefault(c18346fgf.AEQbTJ());
                    } else if ((numKWHzl != null && numKWHzl.intValue() == 2) || (numKWHzl != null && numKWHzl.intValue() == 6)) {
                        this.this$0.OLrzqt();
                    } else if (numKWHzl != null && numKWHzl.intValue() == 5) {
                        this.this$0.finish();
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<C18346fgf> stateFlowOLrzqt = this.this$0.copydefault().OLrzqt();
                C02871 c02871 = new C02871(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowOLrzqt, c02871, this) == objCopydefault) {
                    return objCopydefault;
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

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            ActivityC18357fgq activityC18357fgq = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(activityC18357fgq, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(activityC18357fgq, state, anonymousClass1, this) == objCopydefault) {
                return objCopydefault;
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
