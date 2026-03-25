package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yDX extends C56403yEb {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class Activity<T> implements java.util.Iterator<T>, InterfaceC56535yIz {
        public final /* synthetic */ java.util.Enumeration<T> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Activity(java.util.Enumeration<T> enumeration) {
            this.OLrzqt = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.OLrzqt.nextElement();
        }
    }

    public static <T> java.util.Iterator<T> AEQbTJ(@NotNull java.util.Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "");
        return new Activity(enumeration);
    }
}
