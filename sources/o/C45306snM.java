package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import retrofit2.Invocation;

/* JADX INFO: renamed from: o.snM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C45306snM {
    public static final <T extends java.lang.annotation.Annotation> T AEQbTJ(@NotNull Request request, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(request, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Invocation invocation = (Invocation) request.tag(Invocation.class);
        if (invocation != null) {
            return (T) invocation.method().getAnnotation(cls);
        }
        return null;
    }
}
