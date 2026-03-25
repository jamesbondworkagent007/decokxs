package com.okinc.business.defi.wallet;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C17922fXg;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.dTK;
import o.dTL;

/* JADX INFO: loaded from: classes18.dex */
public final class DefiWalletMainActivity$handleInitViewData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ DefiWalletMainActivity this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiWalletMainActivity$handleInitViewData$2(DefiWalletMainActivity defiWalletMainActivity, Continuation<? super DefiWalletMainActivity$handleInitViewData$2> continuation) {
        super(2, continuation);
        this.this$0 = defiWalletMainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiWalletMainActivity$handleInitViewData$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiWalletMainActivity$handleInitViewData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.DefiWalletMainActivity$handleInitViewData$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<dTK, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefiWalletMainActivity this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefiWalletMainActivity defiWalletMainActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = defiWalletMainActivity;
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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                dTK dtk = (dTK) this.L$0;
                if (dtk != null) {
                    if (dtk instanceof dTK.Fragment) {
                        if (DefiWalletMainActivity.AuCTelauCTel(this.this$0) == 0) {
                            return Unit.INSTANCE;
                        }
                        DefiWalletMainActivity.copydefault(this.this$0, 0);
                        DefiWalletMainActivity defiWalletMainActivity = this.this$0;
                        DefiWalletMainActivity.copydefault(defiWalletMainActivity, DefiWalletMainActivity.AxsJAY(defiWalletMainActivity));
                        C17922fXg.EZpvd(((dTK.Fragment) dtk).OLrzqt());
                    } else {
                        if (DefiWalletMainActivity.AuCTelauCTel(this.this$0) == 1) {
                            return Unit.INSTANCE;
                        }
                        DefiWalletMainActivity.copydefault(this.this$0, 1);
                        DefiWalletMainActivity defiWalletMainActivity2 = this.this$0;
                        DefiWalletMainActivity.copydefault(defiWalletMainActivity2, DefiWalletMainActivity.zuBGHE(defiWalletMainActivity2));
                        C17922fXg.EZpvd(dtk.OLrzqt());
                    }
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
            StateFlow<dTK> stateFlowAEQbTJ = ((dTL) C43251rlk.copydefault(dTL.class)).AEQbTJ();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAEQbTJ, anonymousClass1, this) == objCopydefault) {
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
