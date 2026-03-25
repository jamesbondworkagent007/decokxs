package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public interface KO {
    void AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(@NotNull java.lang.String str, @NotNull JSONArray jSONArray);

    java.lang.Object EZpvd(@NotNull java.lang.Object obj, @NotNull Continuation<? super java.lang.String> continuation);

    boolean EZpvd(@NotNull java.lang.String str);

    java.lang.Object KWHzl(@NotNull Continuation<? super Unit> continuation);

    java.util.List<java.lang.Object> OLrzqt();

    yHO<C5242Ke, java.lang.Integer, java.lang.String, Unit> OLrzqt(@NotNull java.lang.String str);

    void copydefault(@NotNull java.lang.String str);
}
