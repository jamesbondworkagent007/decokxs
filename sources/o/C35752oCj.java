package o;

import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.usecase.banner.ObserveGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35752oCj {
    public final CoroutineDispatcher EZpvd;
    public final ObserveKeyboardInputStateUseCase KWHzl;

    @yCM
    public C35752oCj(@NotNull ObserveKeyboardInputStateUseCase observeKeyboardInputStateUseCase, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(observeKeyboardInputStateUseCase, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = observeKeyboardInputStateUseCase;
        this.EZpvd = coroutineDispatcher;
    }

    public final Flow<C36554odE> copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(new StateListAnimator(FlowKt.distinctUntilChanged(this.KWHzl.EZpvd(str))), this.EZpvd);
    }

    /* JADX INFO: renamed from: o.oCj$StateListAnimator */
    public static final class StateListAnimator implements Flow<C36554odE> {
        public final /* synthetic */ Flow KWHzl;

        /* JADX INFO: renamed from: o.oCj$StateListAnimator$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1 observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1) {
                    observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1 = (ObserveGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1 = new ObserveGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputState = (ObserveKeyboardInputStateUseCase.KeyboardInputState) obj;
                    C36554odE c36554odE = C36554odE.OLrzqt;
                    if (keyboardInputState != ObserveKeyboardInputStateUseCase.KeyboardInputState.BeingKicked) {
                        c36554odE = null;
                    }
                    observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c36554odE, observeGroupBeingKickedBannerUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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

        public StateListAnimator(Flow flow) {
            this.KWHzl = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C36554odE> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.KWHzl.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
