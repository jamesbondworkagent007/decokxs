package o;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5179Ht {
    public static final CoroutineName copydefault(@NotNull CoroutineContext coroutineContext, @NotNull java.lang.String str) {
        java.lang.String name;
        Intrinsics.checkNotNullParameter(coroutineContext, "");
        Intrinsics.checkNotNullParameter(str, "");
        CoroutineName coroutineName = (CoroutineName) coroutineContext.get(CoroutineName.Key);
        if (coroutineName == null || (name = coroutineName.getName()) == null) {
            return new CoroutineName(str);
        }
        return new CoroutineName(name + AbstractJsonLexerKt.COLON + str);
    }
}
