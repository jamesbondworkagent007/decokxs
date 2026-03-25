package o;

import com.okinc.im.usecase.ObserveKeyboardInputStateUseCase;
import com.okinc.im.usecase.banner.ObserveGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oCi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35751oCi {
    public final CoroutineDispatcher KWHzl;
    public final ObserveKeyboardInputStateUseCase copydefault;

    @yCM
    public C35751oCi(@NotNull ObserveKeyboardInputStateUseCase observeKeyboardInputStateUseCase, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(observeKeyboardInputStateUseCase, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = observeKeyboardInputStateUseCase;
        this.KWHzl = coroutineDispatcher;
    }

    public final Flow<C36553odD> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(new Activity(FlowKt.distinctUntilChanged(this.copydefault.EZpvd(str))), this.KWHzl);
    }

    /* JADX INFO: renamed from: o.oCi$Activity */
    public static final class Activity implements Flow<C36553odD> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: o.oCi$Activity$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                ObserveGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1 observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1;
                if (continuation instanceof ObserveGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1) {
                    observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1 = (ObserveGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1) continuation;
                    int i = observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1 = new ObserveGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    ObserveKeyboardInputStateUseCase.KeyboardInputState keyboardInputState = (ObserveKeyboardInputStateUseCase.KeyboardInputState) obj;
                    C36553odD c36553odD = C36553odD.KWHzl;
                    if (keyboardInputState != ObserveKeyboardInputStateUseCase.KeyboardInputState.GroupDisbanded) {
                        c36553odD = null;
                    }
                    observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(c36553odD, observeGroupDisbandedBannerUseCase$execute$$inlined$map$1$2$1) == objCopydefault) {
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
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super C36553odD> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }
}
