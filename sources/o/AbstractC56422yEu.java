package o;

/* JADX INFO: renamed from: o.yEu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC56422yEu implements java.util.Iterator<java.lang.Long>, InterfaceC56535yIz {
    public abstract long nextLong();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Long next() {
        return java.lang.Long.valueOf(nextLong());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public final java.lang.Long next() {
        return java.lang.Long.valueOf(nextLong());
    }
}
