package o;

import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1$2$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$1$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOne$$inlined$map$1$2$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOne$1$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneNotNull$1$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrDefault$1$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$$inlined$map$1$2$1;
import app.cash.sqldelight.coroutines.FlowQuery$mapToOneOrNull$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ServiceConnection {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class ActionBar<T> implements Flow<T> {
        public final /* synthetic */ CoroutineContext OLrzqt;
        public final /* synthetic */ Flow copydefault;

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.ServiceConnection$ActionBar$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ CoroutineContext OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, CoroutineContext coroutineContext) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = coroutineContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                FlowQuery$mapToOne$$inlined$map$1$2$1 flowQuery$mapToOne$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof FlowQuery$mapToOne$$inlined$map$1$2$1) {
                    flowQuery$mapToOne$$inlined$map$1$2$1 = (FlowQuery$mapToOne$$inlined$map$1$2$1) continuation;
                    int i = flowQuery$mapToOne$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowQuery$mapToOne$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowQuery$mapToOne$$inlined$map$1$2$1 = new FlowQuery$mapToOne$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = flowQuery$mapToOne$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = flowQuery$mapToOne$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.AEQbTJ;
                    CoroutineContext coroutineContext = this.OLrzqt;
                    FlowQuery$mapToOne$1$1 flowQuery$mapToOne$1$1 = new FlowQuery$mapToOne$1$1((AssistContent) obj, null);
                    flowQuery$mapToOne$$inlined$map$1$2$1.L$0 = flowCollector2;
                    flowQuery$mapToOne$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objWithContext = BuildersKt.withContext(coroutineContext, flowQuery$mapToOne$1$1, flowQuery$mapToOne$$inlined$map$1$2$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objWithContext;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) flowQuery$mapToOne$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                flowQuery$mapToOne$$inlined$map$1$2$1.L$0 = null;
                flowQuery$mapToOne$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, flowQuery$mapToOne$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class Activity<T> implements Flow<T> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ CoroutineContext EZpvd;

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.ServiceConnection$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ CoroutineContext OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, CoroutineContext coroutineContext) {
                this.copydefault = flowCollector;
                this.OLrzqt = coroutineContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1) {
                    flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 = (FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1) continuation;
                    int i = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1 = new FlowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.copydefault;
                    CoroutineContext coroutineContext = this.OLrzqt;
                    FlowQuery$mapToOneNotNull$1$1 flowQuery$mapToOneNotNull$1$1 = new FlowQuery$mapToOneNotNull$1$1((AssistContent) obj, null);
                    flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.L$0 = flowCollector2;
                    flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label = 1;
                    java.lang.Object objWithContext = BuildersKt.withContext(coroutineContext, flowQuery$mapToOneNotNull$1$1, flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objWithContext;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                if (obj2 != null) {
                    flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.L$0 = null;
                    flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1.label = 2;
                    if (flowCollector.emit(obj2, flowQuery$mapToOneNotNull$$inlined$mapNotNull$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class Application<T> implements Flow<java.util.List<? extends T>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ CoroutineContext KWHzl;

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass2(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.ServiceConnection$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ CoroutineContext KWHzl;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, CoroutineContext coroutineContext) {
                this.copydefault = flowCollector;
                this.KWHzl = coroutineContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                FlowQuery$mapToList$$inlined$map$1$2$1 flowQuery$mapToList$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof FlowQuery$mapToList$$inlined$map$1$2$1) {
                    flowQuery$mapToList$$inlined$map$1$2$1 = (FlowQuery$mapToList$$inlined$map$1$2$1) continuation;
                    int i = flowQuery$mapToList$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowQuery$mapToList$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowQuery$mapToList$$inlined$map$1$2$1 = new FlowQuery$mapToList$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = flowQuery$mapToList$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = flowQuery$mapToList$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.copydefault;
                    CoroutineContext coroutineContext = this.KWHzl;
                    FlowQuery$mapToList$1$1 flowQuery$mapToList$1$1 = new FlowQuery$mapToList$1$1((AssistContent) obj, null);
                    flowQuery$mapToList$$inlined$map$1$2$1.L$0 = flowCollector2;
                    flowQuery$mapToList$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objWithContext = BuildersKt.withContext(coroutineContext, flowQuery$mapToList$1$1, flowQuery$mapToList$$inlined$map$1$2$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objWithContext;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) flowQuery$mapToList$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                flowQuery$mapToList$$inlined$map$1$2$1.L$0 = null;
                flowQuery$mapToList$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, flowQuery$mapToList$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class StateListAnimator<T> implements Flow<T> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ CoroutineContext EZpvd;

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass5(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.ServiceConnection$StateListAnimator$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ CoroutineContext AEQbTJ;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector, CoroutineContext coroutineContext) {
                this.copydefault = flowCollector;
                this.AEQbTJ = coroutineContext;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                FlowQuery$mapToOneOrNull$$inlined$map$1$2$1 flowQuery$mapToOneOrNull$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof FlowQuery$mapToOneOrNull$$inlined$map$1$2$1) {
                    flowQuery$mapToOneOrNull$$inlined$map$1$2$1 = (FlowQuery$mapToOneOrNull$$inlined$map$1$2$1) continuation;
                    int i = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowQuery$mapToOneOrNull$$inlined$map$1$2$1 = new FlowQuery$mapToOneOrNull$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.copydefault;
                    CoroutineContext coroutineContext = this.AEQbTJ;
                    FlowQuery$mapToOneOrNull$1$1 flowQuery$mapToOneOrNull$1$1 = new FlowQuery$mapToOneOrNull$1$1((AssistContent) obj, null);
                    flowQuery$mapToOneOrNull$$inlined$map$1$2$1.L$0 = flowCollector2;
                    flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objWithContext = BuildersKt.withContext(coroutineContext, flowQuery$mapToOneOrNull$1$1, flowQuery$mapToOneOrNull$$inlined$map$1$2$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objWithContext;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) flowQuery$mapToOneOrNull$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                flowQuery$mapToOneOrNull$$inlined$map$1$2$1.L$0 = null;
                flowQuery$mapToOneOrNull$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, flowQuery$mapToOneOrNull$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class TaskDescription<T> implements Flow<T> {
        public final /* synthetic */ CoroutineContext EZpvd;
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ java.lang.Object copydefault;

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector, this.EZpvd, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: o.ServiceConnection$TaskDescription$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ CoroutineContext KWHzl;
            public final /* synthetic */ java.lang.Object OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, CoroutineContext coroutineContext, java.lang.Object obj) {
                this.copydefault = flowCollector;
                this.KWHzl = coroutineContext;
                this.OLrzqt = obj;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, @NotNull Continuation continuation) throws java.lang.Throwable {
                FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1 flowQuery$mapToOneOrDefault$$inlined$map$1$2$1;
                FlowCollector flowCollector;
                if (continuation instanceof FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1) {
                    flowQuery$mapToOneOrDefault$$inlined$map$1$2$1 = (FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1) continuation;
                    int i = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowQuery$mapToOneOrDefault$$inlined$map$1$2$1 = new FlowQuery$mapToOneOrDefault$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector2 = this.copydefault;
                    CoroutineContext coroutineContext = this.KWHzl;
                    FlowQuery$mapToOneOrDefault$1$1 flowQuery$mapToOneOrDefault$1$1 = new FlowQuery$mapToOneOrDefault$1$1((AssistContent) obj, this.OLrzqt, null);
                    flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.L$0 = flowCollector2;
                    flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label = 1;
                    java.lang.Object objWithContext = BuildersKt.withContext(coroutineContext, flowQuery$mapToOneOrDefault$1$1, flowQuery$mapToOneOrDefault$$inlined$map$1$2$1);
                    if (objWithContext == objCopydefault) {
                        return objCopydefault;
                    }
                    obj2 = objWithContext;
                    flowCollector = flowCollector2;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C56391yDq.AEQbTJ(obj2);
                        return Unit.INSTANCE;
                    }
                    FlowCollector flowCollector3 = (FlowCollector) flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.L$0;
                    C56391yDq.AEQbTJ(obj2);
                    flowCollector = flowCollector3;
                }
                flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.L$0 = null;
                flowQuery$mapToOneOrDefault$$inlined$map$1$2$1.label = 2;
                if (flowCollector.emit(obj2, flowQuery$mapToOneOrDefault$$inlined$map$1$2$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        }
    }
}
