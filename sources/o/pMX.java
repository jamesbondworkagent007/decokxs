package o;

import com.okinc.modular.deeplinkv2.DeeplinkMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pMX {
    boolean AEQbTJ();

    java.lang.Object EZpvd(@NotNull DeeplinkMode deeplinkMode, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object EZpvd(boolean z, @NotNull Continuation<? super java.lang.Boolean> continuation);

    StateFlow<java.lang.Boolean> EZpvd();

    boolean EZpvd(@NotNull java.lang.String str);

    boolean KWHzl();

    Flow<Unit> OLrzqt();

    void OLrzqt(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull java.lang.String str);

    java.lang.Object copydefault(@NotNull DeeplinkMode deeplinkMode, @NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);
}
