package com.okinc.business.defi.wallet.tx.send;

import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C17742fQp;
import o.C19574gHk;
import o.C56391yDq;
import o.C56442yFn;
import o.gGY;
import o.rVN;

/* JADX INFO: loaded from: classes18.dex */
public final class WalletSelectReceiveAddressForAAFragment$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ gGY this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletSelectReceiveAddressForAAFragment$observeData$1(gGY ggy, Continuation<? super WalletSelectReceiveAddressForAAFragment$observeData$1> continuation) {
        super(2, continuation);
        this.this$0 = ggy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WalletSelectReceiveAddressForAAFragment$observeData$1(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WalletSelectReceiveAddressForAAFragment$observeData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<List<C19574gHk>> stateFlowCopydefault = this.this$0.OLrzqt().copydefault();
            final gGY ggy = this.this$0;
            FlowCollector<? super List<C19574gHk>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.tx.send.WalletSelectReceiveAddressForAAFragment$observeData$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<C19574gHk> list, Continuation<? super Unit> continuation) {
                    ggy.OLrzqt.clear();
                    gGY ggy2 = ggy;
                    for (C19574gHk c19574gHk : list) {
                        ggy2.OLrzqt.add(c19574gHk);
                        ggy2.OLrzqt.addAll(c19574gHk.copydefault());
                        ggy2.OLrzqt.add(C17742fQp.AEQbTJ);
                    }
                    ggy.KWHzl().notifyDataSetChanged();
                    rVN.reportFullyDrawn$default((Fragment) ggy, true, (String) null, 2, (Object) null);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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
