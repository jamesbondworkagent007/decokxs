package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDI<E> extends AbstractC56400yDz<E> implements java.util.Set<E> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC56400yDz, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            return Companion.OLrzqt(this, (java.util.Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Companion.AEQbTJ(this);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDI.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final int AEQbTJ(@NotNull java.util.Collection<?> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            java.util.Iterator<?> it = collection.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                iHashCode += next != null ? next.hashCode() : 0;
            }
            return iHashCode;
        }

        public final boolean OLrzqt(@NotNull java.util.Set<?> set, @NotNull java.util.Set<?> set2) {
            Intrinsics.checkNotNullParameter(set, "");
            Intrinsics.checkNotNullParameter(set2, "");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }
    }
}
