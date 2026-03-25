package o;

import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface kPM {
    java.lang.Object AEQbTJ(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object EZpvd(@NotNull Continuation<? super java.util.List<? extends AdvancedAutoSellStrategy>> continuation);

    java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object KWHzl(@NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object OLrzqt(boolean z, @NotNull Continuation<? super Unit> continuation);

    java.lang.Object copydefault(@NotNull java.util.List<? extends AdvancedAutoSellStrategy> list, @NotNull Continuation<? super Unit> continuation);
}
