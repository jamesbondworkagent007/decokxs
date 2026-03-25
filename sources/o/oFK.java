package o;

import com.okinc.im.usecase.pageconfig.ObservePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1;
import com.okinc.im.usecase.pageconfig.ObservePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFK {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final C35863oGm EZpvd;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public oFK(@NotNull C35863oGm c35863oGm, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c35863oGm, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = c35863oGm;
        this.KWHzl = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFK.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Flow<oFS> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(new Application(FlowKt.distinctUntilChanged(new ActionBar(this.EZpvd.EZpvd(str)))), this.KWHzl);
    }

    public static final class TaskDescription implements Function1<android.content.Context, android.graphics.drawable.Drawable> {
        public final /* synthetic */ C37151ooS OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(C37151ooS c37151ooS) {
            this.OLrzqt = c37151ooS;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final android.graphics.drawable.Drawable invoke(android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return this.OLrzqt.EZpvd();
        }
    }

    public static final class ActionBar implements Flow<C37151ooS> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.oFK$ActionBar$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObservePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1 observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObservePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1) {
                    observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1 = (ObservePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1 = new ObservePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    C37151ooS c37151ooSCopydefault = C35338ntT.OLrzqt.copydefault((RelationInfo) obj);
                    observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c37151ooSCopydefault, observePageToolbarSubTitleUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        public ActionBar(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C37151ooS> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Application implements Flow<oFS> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.oFK$Application$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObservePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1 observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1;
                if (continuation instanceof ObservePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1) {
                    observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1 = (ObservePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1) continuation;
                    int i = observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1 = new ObservePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    C37151ooS c37151ooS = (C37151ooS) obj;
                    oFS ofs = null;
                    if (c37151ooS != null) {
                        java.lang.CharSequence charSequenceOLrzqt = c37151ooS.OLrzqt();
                        ofs = new oFS(charSequenceOLrzqt != null ? charSequenceOLrzqt.toString() : null, new TaskDescription(c37151ooS), null);
                    }
                    observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(ofs, observePageToolbarSubTitleUseCase$execute$$inlined$map$2$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super oFS> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
