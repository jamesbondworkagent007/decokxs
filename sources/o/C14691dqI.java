package o;

import com.okinc.business.defi.common.utils.WhileSubscribedOrRetained$command$1;
import com.okinc.business.defi.common.utils.WhileSubscribedOrRetained$command$2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dqI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C14691dqI implements SharingStarted {
    public static final C14691dqI EZpvd = new C14691dqI();
    public static final android.os.Handler copydefault = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final int KWHzl = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WhileSubscribedOrRetained";
    }

    private C14691dqI() {
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(@NotNull StateFlow<java.lang.Integer> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(stateFlow, new WhileSubscribedOrRetained$command$1(null)), new WhileSubscribedOrRetained$command$2(null)));
    }
}
