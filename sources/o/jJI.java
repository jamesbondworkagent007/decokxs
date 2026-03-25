package o;

import com.okinc.assets.api.model.ValuationCurrency;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class jJI extends C40512qYp {
    public jJI(@NotNull StateFlow<ValuationCurrency> stateFlow) {
        Intrinsics.checkNotNullParameter(stateFlow, "");
        register(C25908jKv.class, new jJJ(stateFlow));
    }
}
