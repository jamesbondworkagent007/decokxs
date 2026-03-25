package o;

import com.okinc.market.watch.data.UserGroup;
import com.okinc.market.watch.usecase.WatchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1;
import com.okinc.market.watch.usecase.WatchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1;
import com.okinc.market.watch.usecase.WatchGroupsQueryUseCase$onExecute$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qXn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@yCR
public final class C40483qXn extends AbstractC49400uno<java.lang.Boolean, Flow<? extends java.util.List<? extends UserGroup>>> {
    public static final int copydefault = 8;
    public final boolean AEQbTJ;
    public final qWQ EZpvd;
    public final CoroutineDispatcher KWHzl;
    public final C41607qtx OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49400uno
    public CoroutineDispatcher AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final qWQ OLrzqt() {
        return this.EZpvd;
    }

    @Override // o.InterfaceC49403unr
    public /* synthetic */ java.lang.Object KWHzl(java.lang.Object obj, Continuation continuation) {
        return KWHzl(((java.lang.Boolean) obj).booleanValue(), (Continuation<? super Flow<? extends java.util.List<UserGroup>>>) continuation);
    }

    @yCM
    public C40483qXn(@NotNull qWQ qwq, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C41607qtx c41607qtx) {
        Intrinsics.checkNotNullParameter(qwq, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c41607qtx, "");
        this.EZpvd = qwq;
        this.KWHzl = coroutineDispatcher;
        this.OLrzqt = c41607qtx;
        this.AEQbTJ = c41607qtx.AEQbTJ(Unit.INSTANCE).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object KWHzl(boolean z, @NotNull Continuation<? super Flow<? extends java.util.List<UserGroup>>> continuation) throws java.lang.Throwable {
        WatchGroupsQueryUseCase$onExecute$1 watchGroupsQueryUseCase$onExecute$1;
        Flow application;
        if (continuation instanceof WatchGroupsQueryUseCase$onExecute$1) {
            watchGroupsQueryUseCase$onExecute$1 = (WatchGroupsQueryUseCase$onExecute$1) continuation;
            int i = watchGroupsQueryUseCase$onExecute$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                watchGroupsQueryUseCase$onExecute$1.label = i - Integer.MIN_VALUE;
            } else {
                watchGroupsQueryUseCase$onExecute$1 = new WatchGroupsQueryUseCase$onExecute$1(this, continuation);
            }
        }
        java.lang.Object objOLrzqt = watchGroupsQueryUseCase$onExecute$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = watchGroupsQueryUseCase$onExecute$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            if (!this.AEQbTJ) {
                qWQ qwq = this.EZpvd;
                java.lang.String strKWHzl = C55686xod.KWHzl();
                watchGroupsQueryUseCase$onExecute$1.Z$0 = z;
                watchGroupsQueryUseCase$onExecute$1.label = 1;
                objOLrzqt = qwq.OLrzqt(strKWHzl, watchGroupsQueryUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                application = new Application((Flow) objOLrzqt);
            } else {
                qWQ qwq2 = this.EZpvd;
                java.lang.String strKWHzl2 = C55686xod.KWHzl();
                watchGroupsQueryUseCase$onExecute$1.Z$0 = z;
                watchGroupsQueryUseCase$onExecute$1.label = 2;
                objOLrzqt = qwq2.OLrzqt(strKWHzl2, watchGroupsQueryUseCase$onExecute$1);
                if (objOLrzqt == objCopydefault) {
                    return objCopydefault;
                }
                application = (Flow) objOLrzqt;
            }
        } else if (i2 == 1) {
            z = watchGroupsQueryUseCase$onExecute$1.Z$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            application = new Application((Flow) objOLrzqt);
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = watchGroupsQueryUseCase$onExecute$1.Z$0;
            C56391yDq.AEQbTJ(objOLrzqt);
            application = (Flow) objOLrzqt;
        }
        return new StateListAnimator(application, z);
    }

    /* JADX INFO: renamed from: o.qXn$Application */
    public static final class Application implements Flow<java.util.List<? extends UserGroup>> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.qXn$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1 watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1;
                if (continuation instanceof WatchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1) {
                    watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1 = (WatchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1) continuation;
                    int i = watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1 = new WatchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        if (!Intrinsics.EZpvd((java.lang.Object) ((UserGroup) t).getGroupName(), (java.lang.Object) "CEDEFI")) {
                            arrayList.add(t);
                        }
                    }
                    watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchGroupsQueryUseCase$onExecute$$inlined$map$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends UserGroup>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.qXn$StateListAnimator */
    public static final class StateListAnimator implements Flow<java.util.List<? extends UserGroup>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ boolean EZpvd;

        /* JADX INFO: renamed from: o.qXn$StateListAnimator$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ boolean copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, boolean z) {
                this.KWHzl = flowCollector;
                this.copydefault = z;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                WatchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1 watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1;
                if (continuation instanceof WatchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1) {
                    watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1 = (WatchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1) continuation;
                    int i = watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1 = new WatchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (T t : (java.util.List) obj) {
                        UserGroup userGroup = (UserGroup) t;
                        if (!this.copydefault || userGroup.isPreset()) {
                            arrayList.add(t);
                        }
                    }
                    watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(arrayList, watchGroupsQueryUseCase$onExecute$$inlined$map$2$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, boolean z) {
            this.AEQbTJ = flow;
            this.EZpvd = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends UserGroup>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
