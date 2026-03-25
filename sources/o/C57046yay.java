package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57046yay {
    public static final java.lang.String KWHzl(@NotNull java.util.List<java.lang.Long> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return "m/" + CollectionsKt___CollectionsKt.joinToString$default(list, "/", null, null, 0, null, new Function1() { // from class: o.yax
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C57046yay.KWHzl(((java.lang.Long) obj).longValue());
            }
        }, 30, null);
    }

    public static final java.lang.CharSequence KWHzl(long j) {
        if ((2147483648L & j) != 0) {
            return (j & (-2147483649L)) + "'";
        }
        return java.lang.String.valueOf(j);
    }
}
