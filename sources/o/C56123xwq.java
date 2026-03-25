package o;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.okinc.unify_trade.core.base.FlowBus$observe$3;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xwq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56123xwq {
    public static final C56123xwq copydefault = new C56123xwq();
    public static final java.util.Map<java.lang.String, MutableSharedFlow<java.lang.Object>> OLrzqt = new LinkedHashMap();
    public static final int AEQbTJ = 8;

    private C56123xwq() {
    }

    public final <T> void OLrzqt(@NotNull Flow<? extends T> flow, @NotNull LifecycleOwner lifecycleOwner, @NotNull Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(flow, "");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        Intrinsics.checkNotNullParameter(function1, "");
        LifecycleOwnerKt.getLifecycleScope(lifecycleOwner).launchWhenStarted(new FlowBus$observe$3(flow, function1, null));
    }
}
