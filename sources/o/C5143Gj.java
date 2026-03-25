package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5143Gj {
    public static final FW EZpvd(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        C5140Gg c5140Gg = (C5140Gg) coroutineContext.get(C5140Gg.EZpvd);
        if (c5140Gg != null) {
            return c5140Gg.OLrzqt();
        }
        return null;
    }
}
