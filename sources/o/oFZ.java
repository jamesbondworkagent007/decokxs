package o;

import com.okinc.im.usecase.pluginlist.ObserveExternalPluginListUseCase$execute$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFZ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher OLrzqt;
    public final C36600ody copydefault;

    @yCM
    public oFZ(@NotNull C36600ody c36600ody, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c36600ody, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = c36600ody;
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Flow<java.util.List<AbstractC35291nsZ>> OLrzqt() {
        return FlowKt.flowOn(new TaskDescription(this.copydefault.copydefault()), this.OLrzqt);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription implements Flow<java.util.List<? extends AbstractC35291nsZ>> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.oFZ$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveExternalPluginListUseCase$execute$$inlined$map$1$2$1 observeExternalPluginListUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveExternalPluginListUseCase$execute$$inlined$map$1$2$1) {
                    observeExternalPluginListUseCase$execute$$inlined$map$1$2$1 = (ObserveExternalPluginListUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeExternalPluginListUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeExternalPluginListUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeExternalPluginListUseCase$execute$$inlined$map$1$2$1 = new ObserveExternalPluginListUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeExternalPluginListUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeExternalPluginListUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    java.util.List listQOLQEE = C56403yEb.QOLQEE(((java.util.Map) obj).values());
                    pUU.KWHzl("ObserveExternalPluginListUseCase", "execute: " + listQOLQEE);
                    observeExternalPluginListUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(listQOLQEE, observeExternalPluginListUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        public TaskDescription(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.util.List<? extends AbstractC35291nsZ>> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
