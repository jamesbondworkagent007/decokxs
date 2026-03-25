package o;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xVA {
    public static final <T> T EZpvd(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        T t2 = (T) new Gson().fromJson(new Gson().toJson(t), (java.lang.Class) t.getClass());
        pUU.KWHzl("DeepCopyExt", "cost time -> " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        Intrinsics.copydefault(t2);
        return t2;
    }
}
