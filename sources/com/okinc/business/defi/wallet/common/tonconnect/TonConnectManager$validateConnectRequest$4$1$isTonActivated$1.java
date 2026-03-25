package com.okinc.business.defi.wallet.common.tonconnect;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import o.C16058eck;
import o.C56391yDq;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import o.InterfaceC54829xWw;

/* JADX INFO: loaded from: classes4.dex */
public final class TonConnectManager$validateConnectRequest$4$1$isTonActivated$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ FragmentActivity $fragmentActivity;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ C16058eck this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TonConnectManager$validateConnectRequest$4$1$isTonActivated$1(C16058eck c16058eck, FragmentActivity fragmentActivity, Continuation<? super TonConnectManager$validateConnectRequest$4$1$isTonActivated$1> continuation) {
        super(2, continuation);
        this.this$0 = c16058eck;
        this.$fragmentActivity = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TonConnectManager$validateConnectRequest$4$1$isTonActivated$1(this.this$0, this.$fragmentActivity, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((TonConnectManager$validateConnectRequest$4$1$isTonActivated$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            C16058eck c16058eck = this.this$0;
            FragmentActivity fragmentActivity = this.$fragmentActivity;
            this.L$0 = c16058eck;
            this.L$1 = fragmentActivity;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(C56441yFm.OLrzqt(this), 1);
            cancellableContinuationImpl.initCancellability();
            InterfaceC54829xWw interfaceC54829xWw = c16058eck.gEmmrt;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            interfaceC54829xWw.copydefault(607L, supportFragmentManager, new StateListAnimator(cancellableContinuationImpl));
            obj = cancellableContinuationImpl.getResult();
            if (obj == C56442yFn.copydefault()) {
                C56447yFs.copydefault(this);
            }
            if (obj == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        return obj;
    }

    public static final class StateListAnimator implements Function1<Boolean, Unit> {
        public final /* synthetic */ CancellableContinuation<Boolean> EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(CancellableContinuation<? super Boolean> cancellableContinuation) {
            this.EZpvd = cancellableContinuation;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(Boolean bool) {
            EZpvd(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void EZpvd(boolean z) {
            if (this.EZpvd.isActive()) {
                CancellableContinuation<Boolean> cancellableContinuation = this.EZpvd;
                Result.Application application = Result.Companion;
                cancellableContinuation.resumeWith(Result.m7377constructorimpl(Boolean.valueOf(z)));
            }
        }
    }
}
