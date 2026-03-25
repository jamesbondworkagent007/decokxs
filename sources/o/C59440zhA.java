package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59440zhA {
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void copydefault(@NotNull java.lang.Appendable appendable, T t, Function1<? super T, ? extends java.lang.CharSequence> function1) {
        Intrinsics.checkNotNullParameter(appendable, "");
        if (function1 != null) {
            appendable.append(function1.invoke(t));
            return;
        }
        if (t == 0 || (t instanceof java.lang.CharSequence)) {
            appendable.append((java.lang.CharSequence) t);
        } else if (t instanceof java.lang.Character) {
            appendable.append(((java.lang.Character) t).charValue());
        } else {
            appendable.append(t.toString());
        }
    }
}
