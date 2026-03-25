package com.okinc.business.defi.wallet.home;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C15572eNh;
import o.C16973ety;
import o.C17122ewo;
import o.C18138fcj;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC18139fck;

/* JADX INFO: loaded from: classes5.dex */
public final class DefiHomeFragmentNew$setupNftCollections$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ C18138fcj $adapter;
    int label;
    final /* synthetic */ C15572eNh this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefiHomeFragmentNew$setupNftCollections$1(C15572eNh c15572eNh, C18138fcj c18138fcj, Continuation<? super DefiHomeFragmentNew$setupNftCollections$1> continuation) {
        super(2, continuation);
        this.this$0 = c15572eNh;
        this.$adapter = c18138fcj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefiHomeFragmentNew$setupNftCollections$1(this.this$0, this.$adapter, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefiHomeFragmentNew$setupNftCollections$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<List<InterfaceC18139fck>> stateFlowKWHzl = this.this$0.ORxRYg().KWHzl();
            final C15572eNh c15572eNh = this.this$0;
            final C18138fcj c18138fcj = this.$adapter;
            FlowCollector<? super List<InterfaceC18139fck>> flowCollector = new FlowCollector() { // from class: com.okinc.business.defi.wallet.home.DefiHomeFragmentNew$setupNftCollections$1.5
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<? extends InterfaceC18139fck> list, Continuation<? super Unit> continuation) {
                    C17122ewo c17122ewo;
                    TextView textView;
                    C17122ewo c17122ewo2;
                    RecyclerView recyclerView;
                    if (list.isEmpty()) {
                        C16973ety c16973ety = c15572eNh.hUfVAv;
                        if (c16973ety != null && (c17122ewo2 = c16973ety.copydefault) != null && (recyclerView = c17122ewo2.copydefault) != null) {
                            recyclerView.setVisibility(8);
                        }
                        C16973ety c16973ety2 = c15572eNh.hUfVAv;
                        if (c16973ety2 != null && (c17122ewo = c16973ety2.copydefault) != null && (textView = c17122ewo.OLrzqt) != null) {
                            textView.setVisibility(8);
                        }
                    } else {
                        c18138fcj.setItems(list);
                        c18138fcj.notifyDataSetChanged();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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
