package o;

import kotlin.jvm.internal.Intrinsics;
import o.ComponentCallbacks2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ContextWrapper<R> {
    public final ComponentCallbacks2.Application EZpvd;

    public ContextWrapper(@NotNull ComponentCallbacks2.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.EZpvd = application;
    }
}
