package o;

import com.okinc.im.config.page.IMPageType;
import com.okinc.im.usecase.pageconfig.ObserveMessageListBottomSlotOneFragmentUseCase$execute$1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class oFF {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final CoroutineDispatcher OLrzqt;
    public final oFJ copydefault;

    @yCM
    public oFF(@NotNull oFJ ofj, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(ofj, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = ofj;
        this.OLrzqt = coroutineDispatcher;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.oFF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final Flow<AbstractC35278nsM<?>> OLrzqt(IMPageType iMPageType) {
        return FlowKt.flowOn(FlowKt.flow(new ObserveMessageListBottomSlotOneFragmentUseCase$execute$1(this, iMPageType, null)), this.OLrzqt);
    }
}
