package com.okinc.business.defi.wallet.switchComponent.fragments;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.C17740fQn;
import o.C56391yDq;
import o.C56442yFn;
import o.fDL;
import o.fQI;
import o.rVN;

/* JADX INFO: loaded from: classes5.dex */
public final class CurrentWalletSwitchFragment$initObserver$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ fQI this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentWalletSwitchFragment$initObserver$2(fQI fqi, Continuation<? super CurrentWalletSwitchFragment$initObserver$2> continuation) {
        super(2, continuation);
        this.this$0 = fqi;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CurrentWalletSwitchFragment$initObserver$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CurrentWalletSwitchFragment$initObserver$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSwitchFragment$initObserver$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<List<? extends fDL<? extends Object>>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ fQI this$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fQI fqi, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = fqi;
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
        public final Object invoke(List<? extends fDL<? extends Object>> list, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                List<? extends fDL<? extends Object>> list = (List) this.L$0;
                if (list != null) {
                    this.this$0.copydefault().AEQbTJ(list);
                    this.this$0.copydefault().AEQbTJ(false);
                    for (fDL<? extends Object> fdl : list) {
                        if ((fdl instanceof C17740fQn) && ((C17740fQn) fdl).djBIcL()) {
                            this.this$0.copydefault().KWHzl(fdl);
                        }
                    }
                    this.this$0.copydefault().notifyDataSetChanged();
                    rVN.reportFullyDrawn$default((Fragment) this.this$0, true, (String) null, 2, (Object) null);
                    if (!this.this$0.djBIcL().valueOf()) {
                        this.this$0.djBIcL().OLrzqt(true);
                        this.this$0.EZpvd((List<? extends fDL<? extends Object>>) list);
                    }
                    return Unit.INSTANCE;
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
            StateFlow<List<fDL<? extends Object>>> stateFlowAkhnZx = this.this$0.djBIcL().AkhnZx();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(stateFlowAkhnZx, anonymousClass1, this) == objCopydefault) {
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
