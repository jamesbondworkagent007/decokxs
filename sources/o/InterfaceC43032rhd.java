package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rhd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC43032rhd {
    java.lang.Object AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super java.util.List<kotlin.Pair<java.lang.String, TickersData>>> continuation);

    java.lang.Object OLrzqt(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, @NotNull Continuation<? super Flow<? extends java.util.List<kotlin.Pair<java.lang.String, TickersData>>>> continuation);
}
