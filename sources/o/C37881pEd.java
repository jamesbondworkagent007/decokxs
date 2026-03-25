package o;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C37881pEd {
    public static final <T> T copydefault(@NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        T t2 = (T) new Gson().fromJson(new Gson().toJson(t), (java.lang.Class) t.getClass());
        pUU.KWHzl("KlineDeepCopy", "cost time -> " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis));
        Intrinsics.copydefault(t2);
        return t2;
    }
}
