package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zeF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59286zeF {
    public static final yNN<C59296zeP<AbstractC59362zfc>> copydefault = new yNN<>("KotlinTypeRefiner");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final yNN<C59296zeP<AbstractC59362zfc>> EZpvd() {
        return copydefault;
    }

    public static final java.util.List<AbstractC59233zdF> KWHzl(@NotNull AbstractC59287zeG abstractC59287zeG, @NotNull java.lang.Iterable<? extends AbstractC59233zdF> iterable) {
        Intrinsics.checkNotNullParameter(abstractC59287zeG, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(iterable, 10));
        java.util.Iterator<? extends AbstractC59233zdF> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(abstractC59287zeG.AEQbTJ(it.next()));
        }
        return arrayList;
    }
}
