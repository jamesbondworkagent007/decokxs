package com.okinc.planet.biz_orbit_upgrade;

import android.graphics.drawable.Drawable;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C33070mpX;
import o.C47501trL;
import o.C55326xho;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.tAB;

/* JADX INFO: loaded from: classes10.dex */
public final class OrbitUpgradeBottomSheet$onFooterCreated$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ tAB this$0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrbitUpgradeBottomSheet$onFooterCreated$3(tAB tab, Continuation<? super OrbitUpgradeBottomSheet$onFooterCreated$3> continuation) {
        super(2, continuation);
        this.this$0 = tab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OrbitUpgradeBottomSheet$onFooterCreated$3(this.this$0, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OrbitUpgradeBottomSheet$onFooterCreated$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Boolean> stateFlowCopydefault = this.this$0.EZpvd().copydefault();
            final tAB tab = this.this$0;
            FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.planet.biz_orbit_upgrade.OrbitUpgradeBottomSheet$onFooterCreated$3.1
                /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
                    if (bool != null) {
                        tab.EZpvd().KWHzl();
                        if (bool.booleanValue()) {
                            Function1<Boolean, Unit> function1OLrzqt = tab.EZpvd().OLrzqt();
                            if (function1OLrzqt != null) {
                                function1OLrzqt.invoke(C56443yFo.KWHzl(true));
                            }
                            tab.dismissAllowingStateLoss();
                        } else {
                            C55326xho.toast$default(C33070mpX.AYXKKw(C47501trL.Fragment.fGQ), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
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
