package com.okinc.business.trade.features.home.tokenlist.ui;

import androidx.fragment.app.Fragment;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC28386kZm;
import o.kZJ;
import o.rVN;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenListContentFragment$addListener$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ kZJ this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenListContentFragment$addListener$2(kZJ kzj, Continuation<? super TokenListContentFragment$addListener$2> continuation) {
        super(2, continuation);
        this.this$0 = kzj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TokenListContentFragment$addListener$2(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TokenListContentFragment$addListener$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<InterfaceC28386kZm> stateFlowAEQbTJ = this.this$0.values().AEQbTJ();
            final kZJ kzj = this.this$0;
            FlowCollector<? super InterfaceC28386kZm> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.tokenlist.ui.TokenListContentFragment$addListener$2.2
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                public final Object emit(InterfaceC28386kZm interfaceC28386kZm, Continuation<? super Unit> continuation) {
                    kzj.DbNXlk();
                    if (interfaceC28386kZm instanceof InterfaceC28386kZm.Application) {
                        kzj.AhwBna().OLrzqt(((InterfaceC28386kZm.Application) interfaceC28386kZm).KWHzl());
                        kzj.AEQbTJ(false);
                        rVN.reportFullyDrawn$default((Fragment) kzj, true, (String) null, 2, (Object) null);
                    } else if (interfaceC28386kZm instanceof InterfaceC28386kZm.ActionBar) {
                        kzj.AhwBna().AEQbTJ(((InterfaceC28386kZm.ActionBar) interfaceC28386kZm).KWHzl());
                        kzj.AEQbTJ(false);
                    } else if (Intrinsics.EZpvd(interfaceC28386kZm, InterfaceC28386kZm.StateListAnimator.EZpvd)) {
                        kzj.AhwBna().AEQbTJ();
                        kzj.AEQbTJ(false);
                    } else if (Intrinsics.EZpvd(interfaceC28386kZm, InterfaceC28386kZm.Activity.EZpvd)) {
                        kzj.AEQbTJ(true);
                    } else if (Intrinsics.EZpvd(interfaceC28386kZm, InterfaceC28386kZm.TaskDescription.EZpvd)) {
                        kzj.AhwBna().copydefault();
                        kzj.AEQbTJ(false);
                    } else if (!Intrinsics.EZpvd(interfaceC28386kZm, InterfaceC28386kZm.Dialog.AEQbTJ)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
        }
        throw new KotlinNothingValueException();
    }
}
