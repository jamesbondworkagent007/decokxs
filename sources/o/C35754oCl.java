package o;

import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.usecase.banner.ObserveGroupMutedBannerUseCase$execute$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35754oCl {
    public final ObserveKeyboardInputStateUseCase EZpvd;
    public final CoroutineDispatcher copydefault;

    @yCM
    public C35754oCl(@NotNull ObserveKeyboardInputStateUseCase observeKeyboardInputStateUseCase, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(observeKeyboardInputStateUseCase, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.EZpvd = observeKeyboardInputStateUseCase;
        this.copydefault = coroutineDispatcher;
    }

    public final Flow<C36552odC> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(new TaskDescription(FlowKt.distinctUntilChanged(this.EZpvd.EZpvd(str))), this.copydefault);
    }

    /* JADX INFO: renamed from: o.oCl$TaskDescription */
    public static final class TaskDescription implements Flow<C36552odC> {
        public final /* synthetic */ Flow AEQbTJ;

        /* JADX INFO: renamed from: o.oCl$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveGroupMutedBannerUseCase$execute$$inlined$map$1$2$1 observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveGroupMutedBannerUseCase$execute$$inlined$map$1$2$1) {
                    observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1 = (ObserveGroupMutedBannerUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1 = new ObserveGroupMutedBannerUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputState = (ObserveKeyboardInputStateUseCase.KeyboardInputState) obj;
                    C36552odC c36552odC = C36552odC.EZpvd;
                    if (keyboardInputState != ObserveKeyboardInputStateUseCase.KeyboardInputState.GroupMuted) {
                        c36552odC = null;
                    }
                    observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c36552odC, observeGroupMutedBannerUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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
            this.AEQbTJ = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C36552odC> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.AEQbTJ.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
