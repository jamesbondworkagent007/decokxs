package com.okinc.business.market.features.floatwindow;

import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.business.market.features.floatwindow.ui.FloatWindowViewModel;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.C56391yDq;
import o.C56442yFn;
import o.jWO;
import o.pUU;

/* JADX INFO: loaded from: classes7.dex */
public final class DexFloatWindowManager$startDataObservation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexFloatWindowManager$startDataObservation$1(Continuation<? super DexFloatWindowManager$startDataObservation$1> continuation) {
        super(2, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DexFloatWindowManager$startDataObservation$1(continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DexFloatWindowManager$startDataObservation$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objCopydefault = C56442yFn.copydefault();
        int i = this.label;
        try {
        } catch (Exception e) {
            pUU.AEQbTJ(DexFloatWindowManager.EZpvd, "Flow collection crashed: " + e.getMessage(), e);
        }
        if (i == 0) {
            C56391yDq.AEQbTJ(obj);
            FloatWindowViewModel floatWindowViewModel = DexFloatWindowManager.hDKMBd;
            StateFlow<jWO> stateFlowAEQbTJ = floatWindowViewModel != null ? floatWindowViewModel.AEQbTJ() : null;
            if (stateFlowAEQbTJ != null) {
                FlowCollector<? super jWO> flowCollector = new FlowCollector() { // from class: com.okinc.business.market.features.floatwindow.DexFloatWindowManager$startDataObservation$1.5

                    /* JADX INFO: renamed from: com.okinc.business.market.features.floatwindow.DexFloatWindowManager$startDataObservation$1$5$StateListAnimator */
                    public final /* synthetic */ class StateListAnimator {
                        public static final /* synthetic */ int[] OLrzqt;

                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        static {
                            int[] iArr = new int[DexFloatWindowManager.DexFloatWindowMode.values().length];
                            try {
                                iArr[DexFloatWindowManager.DexFloatWindowMode.MINIMIZE.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[DexFloatWindowManager.DexFloatWindowMode.MEDIUM.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[DexFloatWindowManager.DexFloatWindowMode.LARGE.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            OLrzqt = iArr;
                        }
                    }

                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(jWO jwo, Continuation<? super Unit> continuation) {
                        DexFloatWindowManager dexFloatWindowManager = DexFloatWindowManager.copydefault;
                        if (dexFloatWindowManager.getNewProxyInstance()) {
                            int i2 = StateListAnimator.OLrzqt[DexFloatWindowManager.AhwBna.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    dexFloatWindowManager.AEQbTJ(jwo, false);
                                } else if (i2 == 3) {
                                    dexFloatWindowManager.AEQbTJ(jwo, true);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                pUU.copydefault(DexFloatWindowManager.EZpvd, "Flow collection ended unexpectedly");
                return Unit.INSTANCE;
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
