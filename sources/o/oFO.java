package o;

import androidx.core.view.MenuProvider;
import com.okinc.im.usecase.pageconfig.ObservePageMenuProviderUseCase$execute$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public final CoroutineDispatcher AEQbTJ;
    public final oCI KWHzl;
    public final oDI OLrzqt;

    @yCM
    public oFO(@NotNull oCI oci, @NotNull oDI odi, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(oci, "");
        Intrinsics.checkNotNullParameter(odi, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.KWHzl = oci;
        this.OLrzqt = odi;
        this.AEQbTJ = coroutineDispatcher;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFO.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final Flow<MenuProvider> EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return FlowKt.flowOn(FlowKt.flow(new ObservePageMenuProviderUseCase$execute$1(this, str, null)), this.AEQbTJ);
    }
}
