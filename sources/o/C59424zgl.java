package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59098zad;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59424zgl {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.Collection<T> copydefault(java.util.Collection<? extends T> collection, @NotNull java.util.Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection2, "");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final C59387zgA<InterfaceC59098zad> KWHzl(@NotNull java.lang.Iterable<? extends InterfaceC59098zad> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        C59387zgA<InterfaceC59098zad> c59387zgA = new C59387zgA<>();
        for (InterfaceC59098zad interfaceC59098zad : iterable) {
            InterfaceC59098zad interfaceC59098zad2 = interfaceC59098zad;
            if (interfaceC59098zad2 != null && interfaceC59098zad2 != InterfaceC59098zad.ActionBar.copydefault) {
                c59387zgA.add(interfaceC59098zad);
            }
        }
        return c59387zgA;
    }
}
