package o;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59390zgD {
    public static final ConcurrentHashMap<Function0<?>, java.lang.Object> AEQbTJ = new ConcurrentHashMap<>();

    public static /* synthetic */ java.lang.Void shouldNotBeCalled$default(java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "should not be called";
        }
        return KWHzl(str);
    }

    public static final java.lang.Void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        throw new java.lang.IllegalStateException(str.toString());
    }
}
