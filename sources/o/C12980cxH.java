package o;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cxH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12980cxH {
    public static final <T> java.lang.Object KWHzl(@NotNull java.util.Collection<C12979cxG<T>> collection, @NotNull Continuation<? super Unit> continuation) {
        java.util.Collection<C12979cxG<T>> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(collection2, 10));
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C12979cxG) it.next()).KWHzl());
        }
        java.lang.Object objAwaitAll = AwaitKt.awaitAll(arrayList, continuation);
        return objAwaitAll == C56442yFn.copydefault() ? objAwaitAll : Unit.INSTANCE;
    }
}
