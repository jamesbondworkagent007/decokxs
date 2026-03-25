package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yEK {
    public static long[] AEQbTJ(@NotNull java.util.Collection<C56396yDv> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        long[] jArrCopydefault = C56394yDt.copydefault(collection.size());
        java.util.Iterator<C56396yDv> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            C56394yDt.KWHzl(jArrCopydefault, i, it.next().OLrzqt());
            i++;
        }
        return jArrCopydefault;
    }

    public static long EZpvd(@NotNull java.lang.Iterable<C56396yDv> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        java.util.Iterator<C56396yDv> it = iterable.iterator();
        long jCopydefault = 0;
        while (it.hasNext()) {
            jCopydefault = C56396yDv.copydefault(jCopydefault + it.next().OLrzqt());
        }
        return jCopydefault;
    }
}
