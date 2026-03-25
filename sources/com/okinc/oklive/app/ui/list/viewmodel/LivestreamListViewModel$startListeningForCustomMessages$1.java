package com.okinc.oklive.app.ui.list.viewmodel;

import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC44569sUu;
import o.C56391yDq;
import o.C56442yFn;
import o.sUN;

/* JADX INFO: loaded from: classes19.dex */
public final class LivestreamListViewModel$startListeningForCustomMessages$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LifecycleOwner $lifecycleOwner;
    int label;
    final /* synthetic */ sUN this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivestreamListViewModel$startListeningForCustomMessages$1(sUN sun, LifecycleOwner lifecycleOwner, Continuation<? super LivestreamListViewModel$startListeningForCustomMessages$1> continuation) {
        super(2, continuation);
        this.this$0 = sun;
        this.$lifecycleOwner = lifecycleOwner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LivestreamListViewModel$startListeningForCustomMessages$1(this.this$0, this.$lifecycleOwner, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LivestreamListViewModel$startListeningForCustomMessages$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow mutableStateFlow = this.this$0.OLrzqt;
            final sUN sun = this.this$0;
            final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.okinc.oklive.app.ui.list.viewmodel.LivestreamListViewModel$startListeningForCustomMessages$1.4
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                public final Object emit(List<? extends AbstractC44569sUu> list, Continuation<? super Unit> continuation) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : list) {
                        if (t instanceof AbstractC44569sUu.Activity) {
                            arrayList.add(t);
                        }
                    }
                    AbstractC44569sUu.Activity activity = (AbstractC44569sUu.Activity) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
                    String strCopydefault = activity != null ? activity.copydefault() : null;
                    if (Intrinsics.EZpvd((Object) strCopydefault, (Object) sun.AhwBna)) {
                        return Unit.INSTANCE;
                    }
                    sun.KWHzl();
                    sun.AhwBna = strCopydefault;
                    sun.hDKMBd = strCopydefault;
                    if (strCopydefault != null) {
                        sun.EZpvd(strCopydefault, lifecycleOwner);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (mutableStateFlow.collect(flowCollector, this) == objCopydefault) {
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
