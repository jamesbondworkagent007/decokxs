package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.pageconfig.ObservePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1;
import com.okinc.im.usecase.pageconfig.ObservePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1;
import com.okinc.im.usecase.pageconfig.ObservePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1;
import com.okinc.im.usecase.pageconfig.ObservePageToolbarTitleUseCase$invoke$2;
import com.okinc.okimcore.model.im.OKConversation;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFL {
    public final oFJ EZpvd;
    public final CoroutineDispatcher OLrzqt;
    public final oCI copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[IMPageType.values().length];
            try {
                iArr[IMPageType.NORMAL_IM.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            EZpvd = iArr;
        }
    }

    @yCM
    public oFL(@NotNull oFJ ofj, @NotNull oCI oci, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = ofj;
        this.copydefault = oci;
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFL.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Flow<java.lang.String> AEQbTJ(@NotNull java.lang.String str, IMPageType iMPageType) {
        Intrinsics.checkNotNullParameter(str, "");
        Flow actionBar = new ActionBar(this.copydefault.KWHzl(str));
        int i = iMPageType == null ? -1 : Application.EZpvd[iMPageType.ordinal()];
        if (i != -1 && i != 1) {
            actionBar = FlowKt.transformLatest(this.EZpvd.KWHzl(iMPageType).fetchVPNInfo(), new ObservePageToolbarTitleUseCase$invoke$$inlined$flatMapLatest$1(null, actionBar));
        }
        return FlowKt.flowOn(FlowKt.onEach(FlowKt.distinctUntilChanged(new Activity(FlowKt.filterNotNull(actionBar))), new ObservePageToolbarTitleUseCase$invoke$2(null)), this.OLrzqt);
    }

    public static final class ActionBar implements Flow<java.lang.String> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.oFL$ActionBar$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObservePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1 observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1;
                if (continuation instanceof ObservePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1) {
                    observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1 = (ObservePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1) continuation;
                    int i = observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1 = new ObservePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    OKConversation oKConversation = (OKConversation) obj;
                    java.lang.String conversationTitle = oKConversation != null ? oKConversation.getConversationTitle() : null;
                    observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(conversationTitle, observePageToolbarTitleUseCase$invoke$$inlined$map$1$2$1) == objCopydefault) {
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
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public static final class Activity implements Flow<java.lang.String> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.oFL$Activity$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(FlowCollector flowCollector) {
                this.KWHzl = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObservePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1 observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1;
                if (continuation instanceof ObservePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1) {
                    observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1 = (ObservePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1) continuation;
                    int i = observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1 = new ObservePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.KWHzl;
                    java.lang.String string = StringsKt__StringsKt.hDKMBd((java.lang.CharSequence) obj).toString();
                    observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1.label = 1;
                    if (flowCollector.emit(string, observePageToolbarTitleUseCase$invoke$$inlined$map$2$2$1) == objCopydefault) {
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
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass5(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
