package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface LoaderManager<T, S> {
    T decode(S s);

    S encode(@NotNull T t);
}
