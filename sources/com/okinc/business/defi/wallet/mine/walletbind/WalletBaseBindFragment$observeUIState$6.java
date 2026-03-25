package com.okinc.business.defi.wallet.mine.walletbind;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.okinc.wallet.api.bean.WalletInfo;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC19318fyy;
import o.C19339fzS;
import o.C43251rlk;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC54824xWr;
import o.InterfaceC54857xXx;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletBaseBindFragment$observeUIState$6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ AbstractC19318fyy this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletBaseBindFragment$observeUIState$6(AbstractC19318fyy abstractC19318fyy, Continuation<? super WalletBaseBindFragment$observeUIState$6> continuation) {
        super(2, continuation);
        this.this$0 = abstractC19318fyy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletBaseBindFragment$observeUIState$6(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletBaseBindFragment$observeUIState$6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment$observeUIState$6$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AbstractC19318fyy this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC19318fyy abstractC19318fyy, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = abstractC19318fyy;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                InterfaceC54824xWr interfaceC54824xWr = (InterfaceC54824xWr) C43251rlk.copydefault(InterfaceC54824xWr.class);
                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                final AbstractC19318fyy abstractC19318fyy = this.this$0;
                interfaceC54824xWr.copydefault(childFragmentManager, null, null, new InterfaceC54857xXx() { // from class: com.okinc.business.defi.wallet.mine.walletbind.WalletBaseBindFragment.observeUIState.6.1.4
                    @Override // o.InterfaceC54857xXx
                    public void OLrzqt(WalletInfo walletInfo) {
                        Object objM7377constructorimpl;
                        Intrinsics.checkNotNullParameter(walletInfo, "");
                        AbstractC19318fyy abstractC19318fyy2 = abstractC19318fyy;
                        try {
                            Result.Application application = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(abstractC19318fyy2.values().KWHzl(walletInfo));
                        } catch (Throwable th) {
                            Result.Application application2 = Result.Companion;
                            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                        }
                        Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
                        if (thM7380exceptionOrNullimpl != null) {
                            C19339fzS.EZpvd.OLrzqt("[Wallet APP-Bind Wallet]", "onBindWalletSelected error:" + thM7380exceptionOrNullimpl.getMessage());
                        }
                    }
                });
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
            SharedFlow<Unit> sharedFlowGEmmrt = this.this$0.values().gEmmrt();
            Lifecycle lifecycle = this.this$0.getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            Flow flowFlowWithLifecycle$default = FlowExtKt.flowWithLifecycle$default(sharedFlowGEmmrt, lifecycle, null, 2, null);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFlowWithLifecycle$default, anonymousClass1, this) == objCopydefault) {
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
