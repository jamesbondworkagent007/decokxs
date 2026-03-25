package com.okinc.business.dexui.app;

import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C26233jWw;
import o.C56391yDq;
import o.C56442yFn;
import o.InterfaceC33171mrS;

/* JADX INFO: loaded from: classes6.dex */
public final class DexApplicationDelegate$initAppModeListener$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC33171mrS $okAppService;
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DexApplicationDelegate$initAppModeListener$1(InterfaceC33171mrS interfaceC33171mrS, Continuation<? super DexApplicationDelegate$initAppModeListener$1> continuation) {
        super(2, continuation);
        this.$okAppService = interfaceC33171mrS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexApplicationDelegate$initAppModeListener$1(this.$okAppService, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexApplicationDelegate$initAppModeListener$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            StateFlow<Integer> stateFlowIsConnected = this.$okAppService.isConnected();
            FlowCollector<? super Integer> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.app.DexApplicationDelegate$initAppModeListener$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return KWHzl(((Number) obj2).intValue(), continuation);
                }

                public final Object KWHzl(int i2, Continuation<? super Unit> continuation) {
                    if (i2 == 3) {
                        if (!C26233jWw.copydefault.OLrzqt()) {
                            DexFloatWindowManager.copydefault.uzCIH();
                        }
                    } else {
                        DexFloatWindowManager.copydefault.iwGUEr();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (stateFlowIsConnected.collect(flowCollector, this) == objCopydefault) {
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
