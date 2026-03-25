package o;

import com.okinc.modular.deeplinkv2.LinkSource;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pLE {
    java.lang.Object AEQbTJ(@NotNull java.lang.String str, @NotNull Continuation<? super AbstractC43238rlX> continuation);

    boolean EZpvd(@NotNull java.lang.String str);

    java.lang.Object KWHzl(@NotNull java.lang.String str, @NotNull Continuation<? super java.lang.Boolean> continuation);

    java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z);

    void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull LinkSource linkSource, boolean z, @NotNull Function1<? super AbstractC43238rlX, Unit> function1);
}
