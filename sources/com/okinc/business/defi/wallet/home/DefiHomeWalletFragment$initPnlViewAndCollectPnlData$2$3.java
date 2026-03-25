package com.okinc.business.defi.wallet.home;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletPnlDataViewModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.ePI;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ WalletPnlDataViewModel $this_with;
    int label;
    final /* synthetic */ ePI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3(ePI epi, WalletPnlDataViewModel walletPnlDataViewModel, Continuation<? super DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3> continuation) {
        super(2, continuation);
        this.this$0 = epi;
        this.$this_with = walletPnlDataViewModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3(this.this$0, this.$this_with, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WalletPnlDataViewModel $this_with;
        int label;
        final /* synthetic */ ePI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WalletPnlDataViewModel walletPnlDataViewModel, ePI epi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_with = walletPnlDataViewModel;
            this.this$0 = epi;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$this_with, this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.defi.wallet.home.DefiHomeWalletFragment$initPnlViewAndCollectPnlData$2$3$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C02641 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ ePI this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02641(ePI epi, Continuation<? super C02641> continuation) {
                super(2, continuation);
                this.this$0 = epi;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C02641 c02641 = new C02641(this.this$0, continuation);
                c02641.Z$0 = ((Boolean) obj).booleanValue();
                return c02641;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function2
            public /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((C02641) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                C56442yFn.copydefault();
                if (this.label == 0) {
                    C56391yDq.AEQbTJ(obj);
                    if (this.Z$0) {
                        ePI.loadPnlTokenData$default(this.this$0, "refresh", 0, 2, null);
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
                SharedFlow<Boolean> sharedFlowKWHzl = this.$this_with.KWHzl();
                C02641 c02641 = new C02641(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlowKWHzl, c02641, this) == objCopydefault) {
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
            ePI epi = this.this$0;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_with, epi, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(epi, state, anonymousClass1, this) == objCopydefault) {
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
