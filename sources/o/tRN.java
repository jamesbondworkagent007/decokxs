package o;

import com.okinc.planet.ext.PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1;
import com.okinc.planet.ext.PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1;
import com.okinc.planet.ext.PlanetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1;
import com.okinc.planet.ext.PlanetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1;
import com.okinc.planet.ext.PlanetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.AbstractC46197tLk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tRN {
    public static final <T> void AEQbTJ(@NotNull MutableStateFlow<AbstractC46197tLk<T>> mutableStateFlow, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (mutableStateFlow.getValue() instanceof AbstractC46197tLk.Application) {
            AbstractC46197tLk.TaskDescription taskDescription = AbstractC46197tLk.Companion;
            AbstractC46197tLk<T> value = mutableStateFlow.getValue();
            Intrinsics.copydefault(value, "");
            mutableStateFlow.setValue(taskDescription.KWHzl(function1.invoke((java.lang.Object) ((AbstractC46197tLk.Application) value).copydefault())));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity<T> implements Flow<T> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.tRN$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1 planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1;
                if (continuation instanceof PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1) {
                    planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1 = (PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1) continuation;
                    int i = planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1 = new PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.Object objCopydefault2 = ((AbstractC46197tLk.Application) obj).copydefault();
                    planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objCopydefault2, planetViewStateExtensionKt$collectLatestSuccess$$inlined$map$1$2$1) == objCopydefault) {
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

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application<T> implements Flow<T> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.tRN$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PlanetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1 planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1;
                if (continuation instanceof PlanetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1) {
                    planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1 = (PlanetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1) continuation;
                    int i = planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1 = new PlanetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.lang.Object objCopydefault2 = ((AbstractC46197tLk.Application) obj).copydefault();
                    planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(objCopydefault2, planetViewStateExtensionKt$collectSuccess$$inlined$map$1$2$1) == objCopydefault) {
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

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class StateListAnimator<R> implements Flow<AbstractC46197tLk<? extends R>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ Function2 KWHzl;

        /* JADX INFO: renamed from: o.tRN$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;
            public final /* synthetic */ Function2 copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, Function2 function2) {
                this.OLrzqt = flowCollector;
                this.copydefault = function2;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: o.tLk$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PlanetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1 planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                FlowCollector flowCollector2;
                AbstractC46197tLk<T> abstractC46197tLkOLrzqt;
                if (continuation instanceof PlanetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1) {
                    planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1 = (PlanetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1) continuation;
                    int i = planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1 = new PlanetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = this.OLrzqt;
                    AbstractC46197tLk abstractC46197tLk = (AbstractC46197tLk) obj;
                    if (abstractC46197tLk instanceof AbstractC46197tLk.Activity) {
                        abstractC46197tLkOLrzqt = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.Activity) abstractC46197tLk).EZpvd());
                    } else if (abstractC46197tLk instanceof AbstractC46197tLk.StateListAnimator) {
                        abstractC46197tLkOLrzqt = AbstractC46197tLk.Companion.OLrzqt(((AbstractC46197tLk.StateListAnimator) abstractC46197tLk).KWHzl());
                    } else {
                        if (!(abstractC46197tLk instanceof AbstractC46197tLk.Application)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Function2 function2 = this.copydefault;
                        java.lang.Object objCopydefault2 = ((AbstractC46197tLk.Application) abstractC46197tLk).copydefault();
                        planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.L$0 = flowCollector;
                        planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.label = 1;
                        java.lang.Object objInvoke = function2.invoke(objCopydefault2, planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1);
                        if (objInvoke == objCopydefault) {
                            return objCopydefault;
                        }
                        obj2 = objInvoke;
                        flowCollector2 = flowCollector;
                    }
                    planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.L$0 = null;
                    planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.label = 2;
                    if (flowCollector.emit(abstractC46197tLkOLrzqt, planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                    return Unit.INSTANCE;
                }
                flowCollector2 = (FlowCollector) planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.L$0;
                C56391yDq.AEQbTJ(obj2);
                AbstractC46197tLk<T> abstractC46197tLkKWHzl = AbstractC46197tLk.Companion.KWHzl(obj2);
                flowCollector = flowCollector2;
                abstractC46197tLkOLrzqt = abstractC46197tLkKWHzl;
                planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.L$0 = null;
                planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(abstractC46197tLkOLrzqt, planetViewStateExtensionKt$mapViewState$$inlined$map$1$2$1) == objCopydefault) {
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class ActionBar implements Flow<java.lang.Object> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.tRN$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PlanetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1 planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1;
                if (continuation instanceof PlanetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1) {
                    planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1 = (PlanetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1) continuation;
                    int i = planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1 = new PlanetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (obj instanceof AbstractC46197tLk.Application) {
                        planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (flowCollector.emit(obj, planetViewStateExtensionKt$collectSuccess$$inlined$filterIsInstance$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Object> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskDescription implements Flow<java.lang.Object> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.tRN$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1 planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1;
                if (continuation instanceof PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1) {
                    planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1 = (PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1) continuation;
                    int i = planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1 = new PlanetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    if (obj instanceof AbstractC46197tLk.Application) {
                        planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1.label = 1;
                        if (flowCollector.emit(obj, planetViewStateExtensionKt$collectLatestSuccess$$inlined$filterIsInstance$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
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

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Object> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
