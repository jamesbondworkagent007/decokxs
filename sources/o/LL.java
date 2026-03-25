package o;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class LL {
    public static final void OLrzqt(@NotNull LI li, @NotNull HttpUrl httpUrl) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
        Intrinsics.checkNotNullParameter(li, "");
        Intrinsics.checkNotNullParameter(httpUrl, "");
        java.lang.reflect.Field declaredField = li.getClass().getDeclaredField("serverUrl");
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        declaredField.setAccessible(true);
        declaredField.set(li, httpUrl);
    }

    public static final HttpUrl AEQbTJ(@NotNull LI li) throws java.lang.NoSuchFieldException {
        Intrinsics.checkNotNullParameter(li, "");
        java.lang.reflect.Field declaredField = li.getClass().getDeclaredField("serverUrl");
        Intrinsics.checkNotNullExpressionValue(declaredField, "");
        declaredField.setAccessible(true);
        return (HttpUrl) declaredField.get(li);
    }
}
