package o;

import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$$inlined$map$1$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$$inlined$map$2$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$$inlined$map$3$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$$inlined$map$4$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$$inlined$map$5$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$$inlined$map$6$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$12;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$15;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$18;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$6;
import com.okinc.trade.arch.ui.ConsumerKt$collectLatest$9;
import com.okinc.trade.arch.ui.ConsumerKt$flowInner$$inlined$map$1$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$flowInner$$inlined$map$2$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$flowInner$$inlined$map$3$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$flowInner$$inlined$map$4$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$flowInner$$inlined$map$5$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$flowInner$$inlined$map$6$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$$inlined$map$1$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$$inlined$map$2$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$$inlined$map$3$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$$inlined$map$4$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$$inlined$map$5$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$$inlined$map$6$2$1;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$11;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$3;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$5;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$7;
import com.okinc.trade.arch.ui.ConsumerKt$onEach$9;
import com.okinc.trade.arch.util.Quartet;
import com.okinc.trade.arch.util.Quintet;
import com.okinc.trade.arch.util.Sextet;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.unA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C49360unA {
    public static final <T extends InterfaceC49369unJ<T>> Flow<T> EZpvd(AbstractC49411unz<T> abstractC49411unz) {
        return abstractC49411unz.DbNXlk();
    }

    public static final <T extends InterfaceC49369unJ<T>> java.lang.Object KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(EZpvd(abstractC49411unz)), function2, continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public static final <T extends InterfaceC49369unJ<T>, A> java.lang.Object EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new TaskDescription(EZpvd(abstractC49411unz), interfaceC56560yJx)), function2, continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new StateListAnimator(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2)), new ConsumerKt$collectLatest$6(yho, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.unA$ActionBar */
    public static final class ActionBar implements Flow<PendingIntent> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$ActionBar$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4) {
                this.KWHzl = flowCollector;
                this.copydefault = interfaceC56560yJx;
                this.OLrzqt = interfaceC56560yJx2;
                this.EZpvd = interfaceC56560yJx3;
                this.AEQbTJ = interfaceC56560yJx4;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$collectLatest$$inlined$map$4$2$1 consumerKt$collectLatest$$inlined$map$4$2$1;
                if (continuation instanceof ConsumerKt$collectLatest$$inlined$map$4$2$1) {
                    consumerKt$collectLatest$$inlined$map$4$2$1 = (ConsumerKt$collectLatest$$inlined$map$4$2$1) continuation;
                    int i = consumerKt$collectLatest$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$collectLatest$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$collectLatest$$inlined$map$4$2$1 = new ConsumerKt$collectLatest$$inlined$map$4$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$collectLatest$$inlined$map$4$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$collectLatest$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    PendingIntent pendingIntent = new PendingIntent(this.copydefault, (InterfaceC49369unJ) obj, this.OLrzqt, this.EZpvd, this.AEQbTJ);
                    consumerKt$collectLatest$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(pendingIntent, consumerKt$collectLatest$$inlined$map$4$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4) {
            this.AEQbTJ = flow;
            this.EZpvd = interfaceC56560yJx;
            this.KWHzl = interfaceC56560yJx2;
            this.copydefault = interfaceC56560yJx3;
            this.OLrzqt = interfaceC56560yJx4;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super PendingIntent> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass1(flowCollector, this.EZpvd, this.KWHzl, this.copydefault, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.unA$Activity */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Activity implements Flow<Dialog> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;
        public final /* synthetic */ Flow gEmmrt;

        /* JADX INFO: renamed from: o.unA$Activity$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ FlowCollector AYXKKw;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5) {
                this.AYXKKw = flowCollector;
                this.OLrzqt = interfaceC56560yJx;
                this.copydefault = interfaceC56560yJx2;
                this.EZpvd = interfaceC56560yJx3;
                this.AEQbTJ = interfaceC56560yJx4;
                this.KWHzl = interfaceC56560yJx5;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$collectLatest$$inlined$map$5$2$1 consumerKt$collectLatest$$inlined$map$5$2$1;
                if (continuation instanceof ConsumerKt$collectLatest$$inlined$map$5$2$1) {
                    consumerKt$collectLatest$$inlined$map$5$2$1 = (ConsumerKt$collectLatest$$inlined$map$5$2$1) continuation;
                    int i = consumerKt$collectLatest$$inlined$map$5$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$collectLatest$$inlined$map$5$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$collectLatest$$inlined$map$5$2$1 = new ConsumerKt$collectLatest$$inlined$map$5$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$collectLatest$$inlined$map$5$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$collectLatest$$inlined$map$5$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AYXKKw;
                    Dialog dialog = new Dialog(this.OLrzqt, (InterfaceC49369unJ) obj, this.copydefault, this.EZpvd, this.AEQbTJ, this.KWHzl);
                    consumerKt$collectLatest$$inlined$map$5$2$1.label = 1;
                    if (flowCollector.emit(dialog, consumerKt$collectLatest$$inlined$map$5$2$1) == objCopydefault) {
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

        public Activity(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5) {
            this.gEmmrt = flow;
            this.AEQbTJ = interfaceC56560yJx;
            this.copydefault = interfaceC56560yJx2;
            this.OLrzqt = interfaceC56560yJx3;
            this.EZpvd = interfaceC56560yJx4;
            this.KWHzl = interfaceC56560yJx5;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super Dialog> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.gEmmrt.collect(new AnonymousClass4(flowCollector, this.AEQbTJ, this.copydefault, this.OLrzqt, this.EZpvd, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.unA$Application */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Application implements Flow<FragmentManager> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ Flow KWHzl;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$Application$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3) {
                this.copydefault = flowCollector;
                this.KWHzl = interfaceC56560yJx;
                this.OLrzqt = interfaceC56560yJx2;
                this.AEQbTJ = interfaceC56560yJx3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$collectLatest$$inlined$map$3$2$1 consumerKt$collectLatest$$inlined$map$3$2$1;
                if (continuation instanceof ConsumerKt$collectLatest$$inlined$map$3$2$1) {
                    consumerKt$collectLatest$$inlined$map$3$2$1 = (ConsumerKt$collectLatest$$inlined$map$3$2$1) continuation;
                    int i = consumerKt$collectLatest$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$collectLatest$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$collectLatest$$inlined$map$3$2$1 = new ConsumerKt$collectLatest$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$collectLatest$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$collectLatest$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    FragmentManager fragmentManager = new FragmentManager(this.KWHzl, (InterfaceC49369unJ) obj, this.OLrzqt, this.AEQbTJ);
                    consumerKt$collectLatest$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(fragmentManager, consumerKt$collectLatest$$inlined$map$3$2$1) == objCopydefault) {
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

        public Application(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3) {
            this.KWHzl = flow;
            this.EZpvd = interfaceC56560yJx;
            this.AEQbTJ = interfaceC56560yJx2;
            this.copydefault = interfaceC56560yJx3;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super FragmentManager> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass2(flowCollector, this.EZpvd, this.AEQbTJ, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C, D, E] */
    /* JADX INFO: renamed from: o.unA$AssistContent */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class AssistContent<A, B, C, D, E> implements Flow<Quintet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ Flow AhwBna;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$AssistContent$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;
            public final /* synthetic */ FlowCollector valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5) {
                this.valueOf = flowCollector;
                this.OLrzqt = interfaceC56560yJx;
                this.copydefault = interfaceC56560yJx2;
                this.AEQbTJ = interfaceC56560yJx3;
                this.EZpvd = interfaceC56560yJx4;
                this.KWHzl = interfaceC56560yJx5;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$flowInner$$inlined$map$5$2$1 consumerKt$flowInner$$inlined$map$5$2$1;
                if (continuation instanceof ConsumerKt$flowInner$$inlined$map$5$2$1) {
                    consumerKt$flowInner$$inlined$map$5$2$1 = (ConsumerKt$flowInner$$inlined$map$5$2$1) continuation;
                    int i = consumerKt$flowInner$$inlined$map$5$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$flowInner$$inlined$map$5$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$flowInner$$inlined$map$5$2$1 = new ConsumerKt$flowInner$$inlined$map$5$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$flowInner$$inlined$map$5$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$flowInner$$inlined$map$5$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.valueOf;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Quintet quintet = new Quintet(this.OLrzqt.get(interfaceC49369unJ), this.copydefault.get(interfaceC49369unJ), this.AEQbTJ.get(interfaceC49369unJ), this.EZpvd.get(interfaceC49369unJ), this.KWHzl.get(interfaceC49369unJ));
                    consumerKt$flowInner$$inlined$map$5$2$1.label = 1;
                    if (flowCollector.emit(quintet, consumerKt$flowInner$$inlined$map$5$2$1) == objCopydefault) {
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

        public AssistContent(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5) {
            this.AhwBna = flow;
            this.OLrzqt = interfaceC56560yJx;
            this.EZpvd = interfaceC56560yJx2;
            this.KWHzl = interfaceC56560yJx3;
            this.AEQbTJ = interfaceC56560yJx4;
            this.copydefault = interfaceC56560yJx5;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AhwBna.collect(new AnonymousClass4(flowCollector, this.OLrzqt, this.EZpvd, this.KWHzl, this.AEQbTJ, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: renamed from: o.unA$BroadcastReceiver */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class BroadcastReceiver<A, B> implements Flow<kotlin.Pair<? extends A, ? extends B>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$BroadcastReceiver$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2) {
                this.AEQbTJ = flowCollector;
                this.OLrzqt = interfaceC56560yJx;
                this.EZpvd = interfaceC56560yJx2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$onEach$$inlined$map$2$2$1 consumerKt$onEach$$inlined$map$2$2$1;
                if (continuation instanceof ConsumerKt$onEach$$inlined$map$2$2$1) {
                    consumerKt$onEach$$inlined$map$2$2$1 = (ConsumerKt$onEach$$inlined$map$2$2$1) continuation;
                    int i = consumerKt$onEach$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$onEach$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$onEach$$inlined$map$2$2$1 = new ConsumerKt$onEach$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$onEach$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$onEach$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(this.OLrzqt.get(interfaceC49369unJ), this.EZpvd.get(interfaceC49369unJ));
                    consumerKt$onEach$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, consumerKt$onEach$$inlined$map$2$2$1) == objCopydefault) {
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

        public BroadcastReceiver(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2) {
            this.EZpvd = flow;
            this.KWHzl = interfaceC56560yJx;
            this.copydefault = interfaceC56560yJx2;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.KWHzl, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A] */
    /* JADX INFO: renamed from: o.unA$ClipData */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ClipData<A> implements Flow<A> {
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$ClipData$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = interfaceC56560yJx;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$onEach$$inlined$map$1$2$1 consumerKt$onEach$$inlined$map$1$2$1;
                if (continuation instanceof ConsumerKt$onEach$$inlined$map$1$2$1) {
                    consumerKt$onEach$$inlined$map$1$2$1 = (ConsumerKt$onEach$$inlined$map$1$2$1) continuation;
                    int i = consumerKt$onEach$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$onEach$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$onEach$$inlined$map$1$2$1 = new ConsumerKt$onEach$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$onEach$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$onEach$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Object obj3 = this.AEQbTJ.get((InterfaceC49369unJ) obj);
                    consumerKt$onEach$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(obj3, consumerKt$onEach$$inlined$map$1$2$1) == objCopydefault) {
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

        public ClipData(Flow flow, InterfaceC56560yJx interfaceC56560yJx) {
            this.OLrzqt = flow;
            this.copydefault = interfaceC56560yJx;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C] */
    /* JADX INFO: renamed from: o.unA$ComponentCallbacks */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ComponentCallbacks<A, B, C> implements Flow<Triple<? extends A, ? extends B, ? extends C>> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$ComponentCallbacks$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ FlowCollector EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3) {
                this.EZpvd = flowCollector;
                this.KWHzl = interfaceC56560yJx;
                this.copydefault = interfaceC56560yJx2;
                this.AEQbTJ = interfaceC56560yJx3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$onEach$$inlined$map$3$2$1 consumerKt$onEach$$inlined$map$3$2$1;
                if (continuation instanceof ConsumerKt$onEach$$inlined$map$3$2$1) {
                    consumerKt$onEach$$inlined$map$3$2$1 = (ConsumerKt$onEach$$inlined$map$3$2$1) continuation;
                    int i = consumerKt$onEach$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$onEach$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$onEach$$inlined$map$3$2$1 = new ConsumerKt$onEach$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$onEach$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$onEach$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Triple triple = new Triple(this.KWHzl.get(interfaceC49369unJ), this.copydefault.get(interfaceC49369unJ), this.AEQbTJ.get(interfaceC49369unJ));
                    consumerKt$onEach$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(triple, consumerKt$onEach$$inlined$map$3$2$1) == objCopydefault) {
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

        public ComponentCallbacks(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3) {
            this.EZpvd = flow;
            this.copydefault = interfaceC56560yJx;
            this.AEQbTJ = interfaceC56560yJx2;
            this.KWHzl = interfaceC56560yJx3;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass2(flowCollector, this.copydefault, this.AEQbTJ, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C, D, E, F] */
    /* JADX INFO: renamed from: o.unA$ComponentCallbacks2 */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ComponentCallbacks2<A, B, C, D, E, F> implements Flow<Sextet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F>> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ Flow AYXKKw;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;
        public final /* synthetic */ InterfaceC56560yJx valueOf;

        /* JADX INFO: renamed from: o.unA$ComponentCallbacks2$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;
            public final /* synthetic */ FlowCollector djBIcL;
            public final /* synthetic */ InterfaceC56560yJx gEmmrt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6) {
                this.djBIcL = flowCollector;
                this.AEQbTJ = interfaceC56560yJx;
                this.EZpvd = interfaceC56560yJx2;
                this.OLrzqt = interfaceC56560yJx3;
                this.copydefault = interfaceC56560yJx4;
                this.KWHzl = interfaceC56560yJx5;
                this.gEmmrt = interfaceC56560yJx6;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$flowInner$$inlined$map$6$2$1 consumerKt$flowInner$$inlined$map$6$2$1;
                if (continuation instanceof ConsumerKt$flowInner$$inlined$map$6$2$1) {
                    consumerKt$flowInner$$inlined$map$6$2$1 = (ConsumerKt$flowInner$$inlined$map$6$2$1) continuation;
                    int i = consumerKt$flowInner$$inlined$map$6$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$flowInner$$inlined$map$6$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$flowInner$$inlined$map$6$2$1 = new ConsumerKt$flowInner$$inlined$map$6$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$flowInner$$inlined$map$6$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$flowInner$$inlined$map$6$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.djBIcL;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Sextet sextet = new Sextet(this.AEQbTJ.get(interfaceC49369unJ), this.EZpvd.get(interfaceC49369unJ), this.OLrzqt.get(interfaceC49369unJ), this.copydefault.get(interfaceC49369unJ), this.KWHzl.get(interfaceC49369unJ), this.gEmmrt.get(interfaceC49369unJ));
                    consumerKt$flowInner$$inlined$map$6$2$1.label = 1;
                    if (flowCollector.emit(sextet, consumerKt$flowInner$$inlined$map$6$2$1) == objCopydefault) {
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

        public ComponentCallbacks2(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6) {
            this.AYXKKw = flow;
            this.EZpvd = interfaceC56560yJx;
            this.AEQbTJ = interfaceC56560yJx2;
            this.KWHzl = interfaceC56560yJx3;
            this.copydefault = interfaceC56560yJx4;
            this.OLrzqt = interfaceC56560yJx5;
            this.valueOf = interfaceC56560yJx6;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AYXKKw.collect(new AnonymousClass3(flowCollector, this.EZpvd, this.AEQbTJ, this.KWHzl, this.copydefault, this.OLrzqt, this.valueOf), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C, D] */
    /* JADX INFO: renamed from: o.unA$ComponentName */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ComponentName<A, B, C, D> implements Flow<Quartet<? extends A, ? extends B, ? extends C, ? extends D>> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ Flow OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$ComponentName$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4) {
                this.AEQbTJ = flowCollector;
                this.copydefault = interfaceC56560yJx;
                this.OLrzqt = interfaceC56560yJx2;
                this.EZpvd = interfaceC56560yJx3;
                this.KWHzl = interfaceC56560yJx4;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$onEach$$inlined$map$4$2$1 consumerKt$onEach$$inlined$map$4$2$1;
                if (continuation instanceof ConsumerKt$onEach$$inlined$map$4$2$1) {
                    consumerKt$onEach$$inlined$map$4$2$1 = (ConsumerKt$onEach$$inlined$map$4$2$1) continuation;
                    int i = consumerKt$onEach$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$onEach$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$onEach$$inlined$map$4$2$1 = new ConsumerKt$onEach$$inlined$map$4$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$onEach$$inlined$map$4$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$onEach$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Quartet quartet = new Quartet(this.copydefault.get(interfaceC49369unJ), this.OLrzqt.get(interfaceC49369unJ), this.EZpvd.get(interfaceC49369unJ), this.KWHzl.get(interfaceC49369unJ));
                    consumerKt$onEach$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(quartet, consumerKt$onEach$$inlined$map$4$2$1) == objCopydefault) {
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

        public ComponentName(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4) {
            this.OLrzqt = flow;
            this.AEQbTJ = interfaceC56560yJx;
            this.KWHzl = interfaceC56560yJx2;
            this.copydefault = interfaceC56560yJx3;
            this.EZpvd = interfaceC56560yJx4;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector, this.AEQbTJ, this.KWHzl, this.copydefault, this.EZpvd), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C, D, E] */
    /* JADX INFO: renamed from: o.unA$ContentResolver */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class ContentResolver<A, B, C, D, E> implements Flow<Quintet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E>> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;
        public final /* synthetic */ Flow valueOf;

        /* JADX INFO: renamed from: o.unA$ContentResolver$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;
            public final /* synthetic */ FlowCollector valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5) {
                this.valueOf = flowCollector;
                this.KWHzl = interfaceC56560yJx;
                this.OLrzqt = interfaceC56560yJx2;
                this.copydefault = interfaceC56560yJx3;
                this.EZpvd = interfaceC56560yJx4;
                this.AEQbTJ = interfaceC56560yJx5;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$onEach$$inlined$map$5$2$1 consumerKt$onEach$$inlined$map$5$2$1;
                if (continuation instanceof ConsumerKt$onEach$$inlined$map$5$2$1) {
                    consumerKt$onEach$$inlined$map$5$2$1 = (ConsumerKt$onEach$$inlined$map$5$2$1) continuation;
                    int i = consumerKt$onEach$$inlined$map$5$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$onEach$$inlined$map$5$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$onEach$$inlined$map$5$2$1 = new ConsumerKt$onEach$$inlined$map$5$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$onEach$$inlined$map$5$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$onEach$$inlined$map$5$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.valueOf;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Quintet quintet = new Quintet(this.KWHzl.get(interfaceC49369unJ), this.OLrzqt.get(interfaceC49369unJ), this.copydefault.get(interfaceC49369unJ), this.EZpvd.get(interfaceC49369unJ), this.AEQbTJ.get(interfaceC49369unJ));
                    consumerKt$onEach$$inlined$map$5$2$1.label = 1;
                    if (flowCollector.emit(quintet, consumerKt$onEach$$inlined$map$5$2$1) == objCopydefault) {
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

        public ContentResolver(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5) {
            this.valueOf = flow;
            this.AEQbTJ = interfaceC56560yJx;
            this.copydefault = interfaceC56560yJx2;
            this.KWHzl = interfaceC56560yJx3;
            this.EZpvd = interfaceC56560yJx4;
            this.OLrzqt = interfaceC56560yJx5;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.valueOf.collect(new AnonymousClass3(flowCollector, this.AEQbTJ, this.copydefault, this.KWHzl, this.EZpvd, this.OLrzqt), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C, D, E, F] */
    /* JADX INFO: renamed from: o.unA$Context */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class Context<A, B, C, D, E, F> implements Flow<Sextet<? extends A, ? extends B, ? extends C, ? extends D, ? extends E, ? extends F>> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx AYXKKw;
        public final /* synthetic */ Flow AhwBna;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$Context$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;
            public final /* synthetic */ InterfaceC56560yJx gEmmrt;
            public final /* synthetic */ FlowCollector valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6) {
                this.valueOf = flowCollector;
                this.AEQbTJ = interfaceC56560yJx;
                this.OLrzqt = interfaceC56560yJx2;
                this.copydefault = interfaceC56560yJx3;
                this.EZpvd = interfaceC56560yJx4;
                this.KWHzl = interfaceC56560yJx5;
                this.gEmmrt = interfaceC56560yJx6;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$onEach$$inlined$map$6$2$1 consumerKt$onEach$$inlined$map$6$2$1;
                if (continuation instanceof ConsumerKt$onEach$$inlined$map$6$2$1) {
                    consumerKt$onEach$$inlined$map$6$2$1 = (ConsumerKt$onEach$$inlined$map$6$2$1) continuation;
                    int i = consumerKt$onEach$$inlined$map$6$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$onEach$$inlined$map$6$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$onEach$$inlined$map$6$2$1 = new ConsumerKt$onEach$$inlined$map$6$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$onEach$$inlined$map$6$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$onEach$$inlined$map$6$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.valueOf;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Sextet sextet = new Sextet(this.AEQbTJ.get(interfaceC49369unJ), this.OLrzqt.get(interfaceC49369unJ), this.copydefault.get(interfaceC49369unJ), this.EZpvd.get(interfaceC49369unJ), this.KWHzl.get(interfaceC49369unJ), this.gEmmrt.get(interfaceC49369unJ));
                    consumerKt$onEach$$inlined$map$6$2$1.label = 1;
                    if (flowCollector.emit(sextet, consumerKt$onEach$$inlined$map$6$2$1) == objCopydefault) {
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

        public Context(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6) {
            this.AhwBna = flow;
            this.OLrzqt = interfaceC56560yJx;
            this.EZpvd = interfaceC56560yJx2;
            this.copydefault = interfaceC56560yJx3;
            this.AEQbTJ = interfaceC56560yJx4;
            this.KWHzl = interfaceC56560yJx5;
            this.AYXKKw = interfaceC56560yJx6;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AhwBna.collect(new AnonymousClass4(flowCollector, this.OLrzqt, this.EZpvd, this.copydefault, this.AEQbTJ, this.KWHzl, this.AYXKKw), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.unA$LoaderManager */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class LoaderManager implements Flow<Fragment> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;
        public final /* synthetic */ Flow gEmmrt;
        public final /* synthetic */ InterfaceC56560yJx valueOf;

        /* JADX INFO: renamed from: o.unA$LoaderManager$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;
            public final /* synthetic */ FlowCollector djBIcL;
            public final /* synthetic */ InterfaceC56560yJx valueOf;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6) {
                this.djBIcL = flowCollector;
                this.OLrzqt = interfaceC56560yJx;
                this.KWHzl = interfaceC56560yJx2;
                this.EZpvd = interfaceC56560yJx3;
                this.copydefault = interfaceC56560yJx4;
                this.AEQbTJ = interfaceC56560yJx5;
                this.valueOf = interfaceC56560yJx6;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$collectLatest$$inlined$map$6$2$1 consumerKt$collectLatest$$inlined$map$6$2$1;
                if (continuation instanceof ConsumerKt$collectLatest$$inlined$map$6$2$1) {
                    consumerKt$collectLatest$$inlined$map$6$2$1 = (ConsumerKt$collectLatest$$inlined$map$6$2$1) continuation;
                    int i = consumerKt$collectLatest$$inlined$map$6$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$collectLatest$$inlined$map$6$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$collectLatest$$inlined$map$6$2$1 = new ConsumerKt$collectLatest$$inlined$map$6$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$collectLatest$$inlined$map$6$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$collectLatest$$inlined$map$6$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.djBIcL;
                    Fragment fragment = new Fragment(this.OLrzqt, (InterfaceC49369unJ) obj, this.KWHzl, this.EZpvd, this.copydefault, this.AEQbTJ, this.valueOf);
                    consumerKt$collectLatest$$inlined$map$6$2$1.label = 1;
                    if (flowCollector.emit(fragment, consumerKt$collectLatest$$inlined$map$6$2$1) == objCopydefault) {
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

        public LoaderManager(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6) {
            this.gEmmrt = flow;
            this.AEQbTJ = interfaceC56560yJx;
            this.EZpvd = interfaceC56560yJx2;
            this.copydefault = interfaceC56560yJx3;
            this.KWHzl = interfaceC56560yJx4;
            this.OLrzqt = interfaceC56560yJx5;
            this.valueOf = interfaceC56560yJx6;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super Fragment> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.gEmmrt.collect(new AnonymousClass1(flowCollector, this.AEQbTJ, this.EZpvd, this.copydefault, this.KWHzl, this.OLrzqt, this.valueOf), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C, D] */
    /* JADX INFO: renamed from: o.unA$PictureInPictureParams */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class PictureInPictureParams<A, B, C, D> implements Flow<Quartet<? extends A, ? extends B, ? extends C, ? extends D>> {
        public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.unA$PictureInPictureParams$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ FlowCollector OLrzqt;
            public final /* synthetic */ InterfaceC56560yJx copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4) {
                this.OLrzqt = flowCollector;
                this.KWHzl = interfaceC56560yJx;
                this.EZpvd = interfaceC56560yJx2;
                this.AEQbTJ = interfaceC56560yJx3;
                this.copydefault = interfaceC56560yJx4;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$flowInner$$inlined$map$4$2$1 consumerKt$flowInner$$inlined$map$4$2$1;
                if (continuation instanceof ConsumerKt$flowInner$$inlined$map$4$2$1) {
                    consumerKt$flowInner$$inlined$map$4$2$1 = (ConsumerKt$flowInner$$inlined$map$4$2$1) continuation;
                    int i = consumerKt$flowInner$$inlined$map$4$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$flowInner$$inlined$map$4$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$flowInner$$inlined$map$4$2$1 = new ConsumerKt$flowInner$$inlined$map$4$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$flowInner$$inlined$map$4$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$flowInner$$inlined$map$4$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Quartet quartet = new Quartet(this.KWHzl.get(interfaceC49369unJ), this.EZpvd.get(interfaceC49369unJ), this.AEQbTJ.get(interfaceC49369unJ), this.copydefault.get(interfaceC49369unJ));
                    consumerKt$flowInner$$inlined$map$4$2$1.label = 1;
                    if (flowCollector.emit(quartet, consumerKt$flowInner$$inlined$map$4$2$1) == objCopydefault) {
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

        public PictureInPictureParams(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4) {
            this.copydefault = flow;
            this.EZpvd = interfaceC56560yJx;
            this.OLrzqt = interfaceC56560yJx2;
            this.KWHzl = interfaceC56560yJx3;
            this.AEQbTJ = interfaceC56560yJx4;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector, this.EZpvd, this.OLrzqt, this.KWHzl, this.AEQbTJ), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B, C] */
    /* JADX INFO: renamed from: o.unA$SharedElementCallback */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class SharedElementCallback<A, B, C> implements Flow<Triple<? extends A, ? extends B, ? extends C>> {
        public final /* synthetic */ Flow AEQbTJ;
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;
        public final /* synthetic */ InterfaceC56560yJx copydefault;

        /* JADX INFO: renamed from: o.unA$SharedElementCallback$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ FlowCollector KWHzl;
            public final /* synthetic */ InterfaceC56560yJx copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3) {
                this.KWHzl = flowCollector;
                this.EZpvd = interfaceC56560yJx;
                this.AEQbTJ = interfaceC56560yJx2;
                this.copydefault = interfaceC56560yJx3;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$flowInner$$inlined$map$3$2$1 consumerKt$flowInner$$inlined$map$3$2$1;
                if (continuation instanceof ConsumerKt$flowInner$$inlined$map$3$2$1) {
                    consumerKt$flowInner$$inlined$map$3$2$1 = (ConsumerKt$flowInner$$inlined$map$3$2$1) continuation;
                    int i = consumerKt$flowInner$$inlined$map$3$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$flowInner$$inlined$map$3$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$flowInner$$inlined$map$3$2$1 = new ConsumerKt$flowInner$$inlined$map$3$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$flowInner$$inlined$map$3$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$flowInner$$inlined$map$3$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    Triple triple = new Triple(this.EZpvd.get(interfaceC49369unJ), this.AEQbTJ.get(interfaceC49369unJ), this.copydefault.get(interfaceC49369unJ));
                    consumerKt$flowInner$$inlined$map$3$2$1.label = 1;
                    if (flowCollector.emit(triple, consumerKt$flowInner$$inlined$map$3$2$1) == objCopydefault) {
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

        public SharedElementCallback(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3) {
            this.AEQbTJ = flow;
            this.OLrzqt = interfaceC56560yJx;
            this.EZpvd = interfaceC56560yJx2;
            this.copydefault = interfaceC56560yJx3;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass4(flowCollector, this.OLrzqt, this.EZpvd, this.copydefault), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: renamed from: o.unA$StateListAnimator */
    public static final class StateListAnimator<A, B> implements Flow<kotlin.Pair<? extends A, ? extends B>> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ InterfaceC56560yJx OLrzqt;

        /* JADX INFO: renamed from: o.unA$StateListAnimator$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx OLrzqt;
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2) {
                this.copydefault = flowCollector;
                this.AEQbTJ = interfaceC56560yJx;
                this.OLrzqt = interfaceC56560yJx2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$collectLatest$$inlined$map$2$2$1 consumerKt$collectLatest$$inlined$map$2$2$1;
                if (continuation instanceof ConsumerKt$collectLatest$$inlined$map$2$2$1) {
                    consumerKt$collectLatest$$inlined$map$2$2$1 = (ConsumerKt$collectLatest$$inlined$map$2$2$1) continuation;
                    int i = consumerKt$collectLatest$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$collectLatest$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$collectLatest$$inlined$map$2$2$1 = new ConsumerKt$collectLatest$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$collectLatest$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$collectLatest$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(this.AEQbTJ.get(interfaceC49369unJ), this.OLrzqt.get(interfaceC49369unJ));
                    consumerKt$collectLatest$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, consumerKt$collectLatest$$inlined$map$2$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2) {
            this.EZpvd = flow;
            this.OLrzqt = interfaceC56560yJx;
            this.KWHzl = interfaceC56560yJx2;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass3(flowCollector, this.OLrzqt, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A] */
    /* JADX INFO: renamed from: o.unA$TaskDescription */
    public static final class TaskDescription<A> implements Flow<A> {
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.unA$TaskDescription$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx EZpvd;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass2(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx) {
                this.OLrzqt = flowCollector;
                this.EZpvd = interfaceC56560yJx;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$collectLatest$$inlined$map$1$2$1 consumerKt$collectLatest$$inlined$map$1$2$1;
                if (continuation instanceof ConsumerKt$collectLatest$$inlined$map$1$2$1) {
                    consumerKt$collectLatest$$inlined$map$1$2$1 = (ConsumerKt$collectLatest$$inlined$map$1$2$1) continuation;
                    int i = consumerKt$collectLatest$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$collectLatest$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$collectLatest$$inlined$map$1$2$1 = new ConsumerKt$collectLatest$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$collectLatest$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$collectLatest$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Object obj3 = this.EZpvd.get((InterfaceC49369unJ) obj);
                    consumerKt$collectLatest$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(obj3, consumerKt$collectLatest$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow, InterfaceC56560yJx interfaceC56560yJx) {
            this.copydefault = flow;
            this.KWHzl = interfaceC56560yJx;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass2(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A, B] */
    /* JADX INFO: renamed from: o.unA$TaskStackBuilder */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class TaskStackBuilder<A, B> implements Flow<kotlin.Pair<? extends A, ? extends B>> {
        public final /* synthetic */ InterfaceC56560yJx EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.unA$TaskStackBuilder$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ InterfaceC56560yJx KWHzl;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2) {
                this.OLrzqt = flowCollector;
                this.KWHzl = interfaceC56560yJx;
                this.AEQbTJ = interfaceC56560yJx2;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$flowInner$$inlined$map$2$2$1 consumerKt$flowInner$$inlined$map$2$2$1;
                if (continuation instanceof ConsumerKt$flowInner$$inlined$map$2$2$1) {
                    consumerKt$flowInner$$inlined$map$2$2$1 = (ConsumerKt$flowInner$$inlined$map$2$2$1) continuation;
                    int i = consumerKt$flowInner$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$flowInner$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$flowInner$$inlined$map$2$2$1 = new ConsumerKt$flowInner$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$flowInner$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$flowInner$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    InterfaceC49369unJ interfaceC49369unJ = (InterfaceC49369unJ) obj;
                    kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(this.KWHzl.get(interfaceC49369unJ), this.AEQbTJ.get(interfaceC49369unJ));
                    consumerKt$flowInner$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(pairOLrzqt, consumerKt$flowInner$$inlined$map$2$2$1) == objCopydefault) {
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

        public TaskStackBuilder(Flow flow, InterfaceC56560yJx interfaceC56560yJx, InterfaceC56560yJx interfaceC56560yJx2) {
            this.copydefault = flow;
            this.EZpvd = interfaceC56560yJx;
            this.KWHzl = interfaceC56560yJx2;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass4(flowCollector, this.EZpvd, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [A] */
    /* JADX INFO: renamed from: o.unA$VoiceInteractor */
    public static final class VoiceInteractor<A> implements Flow<A> {
        public final /* synthetic */ Flow EZpvd;
        public final /* synthetic */ InterfaceC56560yJx KWHzl;

        /* JADX INFO: renamed from: o.unA$VoiceInteractor$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ InterfaceC56560yJx AEQbTJ;
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector, InterfaceC56560yJx interfaceC56560yJx) {
                this.OLrzqt = flowCollector;
                this.AEQbTJ = interfaceC56560yJx;
            }

            /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: kotlinx.coroutines.flow.FlowCollector */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ConsumerKt$flowInner$$inlined$map$1$2$1 consumerKt$flowInner$$inlined$map$1$2$1;
                if (continuation instanceof ConsumerKt$flowInner$$inlined$map$1$2$1) {
                    consumerKt$flowInner$$inlined$map$1$2$1 = (ConsumerKt$flowInner$$inlined$map$1$2$1) continuation;
                    int i = consumerKt$flowInner$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        consumerKt$flowInner$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        consumerKt$flowInner$$inlined$map$1$2$1 = new ConsumerKt$flowInner$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = consumerKt$flowInner$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = consumerKt$flowInner$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    java.lang.Object obj3 = this.AEQbTJ.get((InterfaceC49369unJ) obj);
                    consumerKt$flowInner$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(obj3, consumerKt$flowInner$$inlined$map$1$2$1) == objCopydefault) {
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

        public VoiceInteractor(Flow flow, InterfaceC56560yJx interfaceC56560yJx) {
            this.EZpvd = flow;
            this.KWHzl = interfaceC56560yJx;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector, this.KWHzl), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C> java.lang.Object EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new Application(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3)), new ConsumerKt$collectLatest$9(yht, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.unA$FragmentManager */
    public static final class FragmentManager {
        public final B EZpvd;
        public final A KWHzl;
        public final C copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final A copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: Incorrect types in method signature: (Lo/yJx<TT;+TA;>;TT;Lo/yJx<TT;+TB;>;Lo/yJx<TT;+TC;>;)V */
        /* JADX WARN: Type inference failed for: r1v1, types: [A, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [B, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [C, java.lang.Object] */
        public FragmentManager(InterfaceC56560yJx interfaceC56560yJx, InterfaceC49369unJ interfaceC49369unJ, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3) {
            this.KWHzl = interfaceC56560yJx.get(interfaceC49369unJ);
            this.EZpvd = interfaceC56560yJx2.get(interfaceC49369unJ);
            this.copydefault = interfaceC56560yJx3.get(interfaceC49369unJ);
        }
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new ActionBar(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4)), new ConsumerKt$collectLatest$12(yhs, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.unA$PendingIntent */
    public static final class PendingIntent {
        public final A EZpvd;
        public final C KWHzl;
        public final B OLrzqt;
        public final D copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final A OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final D copydefault() {
            return this.copydefault;
        }

        /* JADX WARN: Incorrect types in method signature: (Lo/yJx<TT;+TA;>;TT;Lo/yJx<TT;+TB;>;Lo/yJx<TT;+TC;>;Lo/yJx<TT;+TD;>;)V */
        /* JADX WARN: Type inference failed for: r1v1, types: [A, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [B, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [C, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4, types: [D, java.lang.Object] */
        public PendingIntent(InterfaceC56560yJx interfaceC56560yJx, InterfaceC49369unJ interfaceC49369unJ, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4) {
            this.EZpvd = interfaceC56560yJx.get(interfaceC49369unJ);
            this.OLrzqt = interfaceC56560yJx2.get(interfaceC49369unJ);
            this.KWHzl = interfaceC56560yJx3.get(interfaceC49369unJ);
            this.copydefault = interfaceC56560yJx4.get(interfaceC49369unJ);
        }
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D, E> java.lang.Object KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new Activity(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5)), new ConsumerKt$collectLatest$15(yhq, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.unA$Dialog */
    public static final class Dialog {
        public final A AEQbTJ;
        public final B EZpvd;
        public final D KWHzl;
        public final E OLrzqt;
        public final C copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final E AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final A EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final D copydefault() {
            return this.KWHzl;
        }

        /* JADX WARN: Incorrect types in method signature: (Lo/yJx<TT;+TA;>;TT;Lo/yJx<TT;+TB;>;Lo/yJx<TT;+TC;>;Lo/yJx<TT;+TD;>;Lo/yJx<TT;+TE;>;)V */
        /* JADX WARN: Type inference failed for: r1v1, types: [A, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [B, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [C, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4, types: [D, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5, types: [E, java.lang.Object] */
        public Dialog(InterfaceC56560yJx interfaceC56560yJx, InterfaceC49369unJ interfaceC49369unJ, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5) {
            this.AEQbTJ = interfaceC56560yJx.get(interfaceC49369unJ);
            this.EZpvd = interfaceC56560yJx2.get(interfaceC49369unJ);
            this.copydefault = interfaceC56560yJx3.get(interfaceC49369unJ);
            this.KWHzl = interfaceC56560yJx4.get(interfaceC49369unJ);
            this.OLrzqt = interfaceC56560yJx5.get(interfaceC49369unJ);
        }
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> java.lang.Object AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr, @NotNull Continuation<? super Unit> continuation) {
        java.lang.Object objCollectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(new LoaderManager(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6)), new ConsumerKt$collectLatest$18(yhr, null), continuation);
        return objCollectLatest == C56442yFn.copydefault() ? objCollectLatest : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.unA$Fragment */
    public static final class Fragment {
        public final B AEQbTJ;
        public final A EZpvd;
        public final D KWHzl;
        public final C OLrzqt;
        public final E copydefault;
        public final F djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final E AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final B KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final D OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final A copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final F djBIcL() {
            return this.djBIcL;
        }

        /* JADX WARN: Incorrect types in method signature: (Lo/yJx<TT;+TA;>;TT;Lo/yJx<TT;+TB;>;Lo/yJx<TT;+TC;>;Lo/yJx<TT;+TD;>;Lo/yJx<TT;+TE;>;Lo/yJx<TT;+TF;>;)V */
        /* JADX WARN: Type inference failed for: r1v1, types: [A, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v2, types: [B, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3, types: [C, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v4, types: [D, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v5, types: [E, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v6, types: [F, java.lang.Object] */
        public Fragment(InterfaceC56560yJx interfaceC56560yJx, InterfaceC49369unJ interfaceC49369unJ, InterfaceC56560yJx interfaceC56560yJx2, InterfaceC56560yJx interfaceC56560yJx3, InterfaceC56560yJx interfaceC56560yJx4, InterfaceC56560yJx interfaceC56560yJx5, InterfaceC56560yJx interfaceC56560yJx6) {
            this.EZpvd = interfaceC56560yJx.get(interfaceC49369unJ);
            this.AEQbTJ = interfaceC56560yJx2.get(interfaceC49369unJ);
            this.OLrzqt = interfaceC56560yJx3.get(interfaceC49369unJ);
            this.KWHzl = interfaceC56560yJx4.get(interfaceC49369unJ);
            this.copydefault = interfaceC56560yJx5.get(interfaceC49369unJ);
            this.djBIcL = interfaceC56560yJx6.get(interfaceC49369unJ);
        }
    }

    public static final <T extends InterfaceC49369unJ<T>> Flow<T> EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull Function2<? super T, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return FlowKt.onEach(FlowKt.distinctUntilChanged(EZpvd(abstractC49411unz)), function2);
    }

    public static final <T extends InterfaceC49369unJ<T>, A> Flow<A> KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull Function2<? super A, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(function2, "");
        return FlowKt.onEach(FlowKt.distinctUntilChanged(new ClipData(EZpvd(abstractC49411unz), interfaceC56560yJx)), function2);
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull yHO<? super A, ? super B, ? super Continuation<? super Unit>, ? extends java.lang.Object> yho) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(yho, "");
        return FlowKt.onEach(FlowKt.distinctUntilChanged(new BroadcastReceiver(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2)), new ConsumerKt$onEach$3(yho, null));
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull yHT<? super A, ? super B, ? super C, ? super Continuation<? super Unit>, ? extends java.lang.Object> yht) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        Intrinsics.checkNotNullParameter(yht, "");
        return FlowKt.onEach(FlowKt.distinctUntilChanged(new ComponentCallbacks(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3)), new ConsumerKt$onEach$5(yht, null));
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull yHS<? super A, ? super B, ? super C, ? super D, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhs) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
        Intrinsics.checkNotNullParameter(yhs, "");
        return FlowKt.onEach(FlowKt.distinctUntilChanged(new ComponentName(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4)), new ConsumerKt$onEach$7(yhs, null));
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> OLrzqt(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull yHQ<? super A, ? super B, ? super C, ? super D, ? super E, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhq) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
        Intrinsics.checkNotNullParameter(yhq, "");
        return FlowKt.onEach(FlowKt.distinctUntilChanged(new ContentResolver(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5)), new ConsumerKt$onEach$9(yhq, null));
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> EZpvd(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6, @NotNull yHR<? super A, ? super B, ? super C, ? super D, ? super E, ? super F, ? super Continuation<? super Unit>, ? extends java.lang.Object> yhr) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
        Intrinsics.checkNotNullParameter(yhr, "");
        return FlowKt.onEach(FlowKt.distinctUntilChanged(new Context(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6)), new ConsumerKt$onEach$11(yhr, null));
    }

    public static final <T extends InterfaceC49369unJ<T>> Flow<T> KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        return EZpvd(abstractC49411unz);
    }

    public static final <T extends InterfaceC49369unJ<T>, A> Flow<A> copydefault(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        return new VoiceInteractor(EZpvd(abstractC49411unz), interfaceC56560yJx);
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B> Flow<kotlin.Pair<A, B>> AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        return new TaskStackBuilder(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2);
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C> Flow<Triple<A, B, C>> KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        return new SharedElementCallback(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3);
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D> Flow<Quartet<A, B, C, D>> AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
        return new PictureInPictureParams(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4);
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D, E> Flow<Quintet<A, B, C, D, E>> KWHzl(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
        return new AssistContent(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5);
    }

    public static final <T extends InterfaceC49369unJ<T>, A, B, C, D, E, F> Flow<Sextet<A, B, C, D, E, F>> AEQbTJ(@NotNull AbstractC49411unz<T> abstractC49411unz, @NotNull InterfaceC56560yJx<T, ? extends A> interfaceC56560yJx, @NotNull InterfaceC56560yJx<T, ? extends B> interfaceC56560yJx2, @NotNull InterfaceC56560yJx<T, ? extends C> interfaceC56560yJx3, @NotNull InterfaceC56560yJx<T, ? extends D> interfaceC56560yJx4, @NotNull InterfaceC56560yJx<T, ? extends E> interfaceC56560yJx5, @NotNull InterfaceC56560yJx<T, ? extends F> interfaceC56560yJx6) {
        Intrinsics.checkNotNullParameter(abstractC49411unz, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx2, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx3, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx4, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx5, "");
        Intrinsics.checkNotNullParameter(interfaceC56560yJx6, "");
        return new ComponentCallbacks2(EZpvd(abstractC49411unz), interfaceC56560yJx, interfaceC56560yJx2, interfaceC56560yJx3, interfaceC56560yJx4, interfaceC56560yJx5, interfaceC56560yJx6);
    }
}
