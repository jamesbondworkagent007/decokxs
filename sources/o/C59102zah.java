package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59102zah {
    public static final java.util.Set<C56935yXu> copydefault(@NotNull java.lang.Iterable<? extends InterfaceC59098zad> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<? extends InterfaceC59098zad> it = iterable.iterator();
        while (it.hasNext()) {
            java.util.Set<C56935yXu> setEZpvd = it.next().EZpvd();
            if (setEZpvd == null) {
                return null;
            }
            C56406yEe.KWHzl(hashSet, setEZpvd);
        }
        return hashSet;
    }
}
