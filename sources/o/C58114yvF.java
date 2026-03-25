package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yvF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C58114yvF {
    public static final C58114yvF EZpvd = new C58114yvF();

    private C58114yvF() {
    }

    public static final <T> T OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) C58113yvE.copydefault(C58124yvP.EZpvd(context.getApplicationContext()), cls);
    }

    public static final <T> T KWHzl(@NotNull android.app.Activity activity, @NotNull java.lang.Class<T> cls) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(cls, "");
        return (T) C58113yvE.copydefault(activity, cls);
    }
}
