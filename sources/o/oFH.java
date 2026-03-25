package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.pageconfig.ObserveMessageListTopSlotOneFragmentUseCase$execute$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFH {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final oFJ AEQbTJ;
    public final CoroutineDispatcher EZpvd;

    @yCM
    public oFH(@NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = ofj;
        this.EZpvd = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFH.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Flow<AbstractC35278nsM<?>> copydefault(IMPageType iMPageType) {
        return FlowKt.flowOn(FlowKt.flow(new ObserveMessageListTopSlotOneFragmentUseCase$execute$1(this, iMPageType, null)), this.EZpvd);
    }
}
