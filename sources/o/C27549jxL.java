package o;

import com.okinc.business.invest_biz.utils.WhileSubscribedOrRetained$command$1;
import com.okinc.business.invest_biz.utils.WhileSubscribedOrRetained$command$2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingCommand;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27549jxL implements SharingStarted {
    public static final C27549jxL AEQbTJ = new C27549jxL();
    public static final android.os.Handler copydefault = new android.os.Handler(android.os.Looper.getMainLooper());
    public static final int OLrzqt = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WhileSubscribedOrRetained";
    }

    private C27549jxL() {
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(@NotNull StateFlow<java.lang.Integer> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        return FlowKt.distinctUntilChanged(FlowKt.dropWhile(FlowKt.transformLatest(stateFlow, new WhileSubscribedOrRetained$command$1(null)), new WhileSubscribedOrRetained$command$2(null)));
    }
}
