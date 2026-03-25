package o;

import com.okinc.market.search.features.navigation.selection.domain.SelectedStatusMode;
import com.okinc.market.search.features.navigation.selection.domain.UpdateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.search.features.navigation.selection.domain.UpdateItemSelectedStatusUseCase$onExecute$2;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.InterfaceC41643qug;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qPX<T extends InterfaceC41643qug> extends AbstractC49400uno<Quartet<? extends Flow<? extends InterfaceC49371unL<? extends java.util.List<? extends T>>>, ? extends Flow<? extends java.util.Set<? extends BizInstrument>>, ? extends java.util.Set<? extends java.lang.String>, ? extends SelectedStatusMode>, Flow<? extends InterfaceC49371unL<? extends java.util.List<? extends T>>>> {
    public final CoroutineDispatcher copydefault;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SelectedStatusMode.values().length];
            try {
                iArr[SelectedStatusMode.ALWAYS_ENABLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedStatusMode.DISABLE_PRE_SELECTED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.copydefault;
    }

    @yCM
    public qPX(@NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = coroutineDispatcher;
    }

    public static final class Activity implements Flow<java.util.Set<? extends java.lang.String>> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.qPX$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                UpdateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1 updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof UpdateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1) {
                    updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1 = (UpdateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1 = new UpdateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.Set set = (java.util.Set) obj;
                    java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(set, 10));
                    java.util.Iterator<T> it = set.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((BizInstrument) it.next()).getInstId());
                    }
                    java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
                    updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(setOqFWZa, updateItemSelectedStatusUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.Set<? extends java.lang.String>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
    @Override // o.InterfaceC49403unr
    public java.lang.Object KWHzl(@NotNull Quartet<? extends Flow<? extends InterfaceC49371unL<? extends java.util.List<? extends T>>>, ? extends Flow<? extends java.util.Set<? extends BizInstrument>>, ? extends java.util.Set<java.lang.String>, ? extends SelectedStatusMode> quartet, @NotNull Continuation<? super Flow<? extends InterfaceC49371unL<? extends java.util.List<? extends T>>>> continuation) {
        return FlowKt.flowOn(FlowKt.combine(quartet.component1(), FlowKt.flowOn(new Activity(quartet.component2()), AEQbTJ()), new UpdateItemSelectedStatusUseCase$onExecute$2(this, quartet.component3(), quartet.component4(), null)), AEQbTJ());
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0009 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<T> OLrzqt(java.util.List<? extends T> list, java.util.Set<java.lang.String> set, java.util.Set<java.lang.String> set2, SelectedStatusMode selectedStatusMode) {
        java.lang.String instId;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object objAEQbTJ = (InterfaceC41643qug) it.next();
            boolean z = objAEQbTJ instanceof qRT;
            if (z) {
                instId = ((qRT) objAEQbTJ).values().getInstId();
            } else if (objAEQbTJ instanceof qLB) {
                instId = ((qLB) objAEQbTJ).values().getInstId();
            } else {
                if (objAEQbTJ instanceof qWC) {
                    instId = ((qWC) objAEQbTJ).copydefault().getInstId();
                }
                objAEQbTJ = null;
                if (objAEQbTJ == null) {
                    arrayList.add(objAEQbTJ);
                }
            }
            int i = StateListAnimator.copydefault[selectedStatusMode.ordinal()];
            if (i == 1) {
                boolean zContains = set.contains(instId);
                if (z) {
                    objAEQbTJ = ((qRT) objAEQbTJ).copydefault(zContains, true);
                } else if (objAEQbTJ instanceof qLB) {
                    objAEQbTJ = ((qLB) objAEQbTJ).OLrzqt(zContains, true);
                } else if (objAEQbTJ instanceof qWC) {
                    objAEQbTJ = ((qWC) objAEQbTJ).AEQbTJ(zContains, true);
                }
                if (!(objAEQbTJ instanceof InterfaceC41643qug)) {
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean z2 = !set2.contains(instId);
                boolean zContains2 = set.contains(instId);
                if (z) {
                    objAEQbTJ = ((qRT) objAEQbTJ).copydefault(zContains2, z2);
                } else if (objAEQbTJ instanceof qLB) {
                    objAEQbTJ = ((qLB) objAEQbTJ).OLrzqt(zContains2, z2);
                } else if (objAEQbTJ instanceof qWC) {
                    objAEQbTJ = ((qWC) objAEQbTJ).AEQbTJ(zContains2, z2);
                }
                if (!(objAEQbTJ instanceof InterfaceC41643qug)) {
                    objAEQbTJ = null;
                }
            }
            if (objAEQbTJ == null) {
            }
        }
        return arrayList;
    }
}
