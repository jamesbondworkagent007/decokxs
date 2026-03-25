package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.pageconfig.ObservePageToolbarTagSectionUseCase$execute$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFN {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final oFJ AEQbTJ;
    public final CoroutineDispatcher KWHzl;

    @yCM
    public oFN(@NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AEQbTJ = ofj;
        this.KWHzl = coroutineDispatcher;
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final Flow<AbstractC35352nth<?>> OLrzqt(IMPageType iMPageType) {
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(FlowKt.flow(new ObservePageToolbarTagSectionUseCase$execute$1(this, iMPageType, null))), this.KWHzl);
    }
}
