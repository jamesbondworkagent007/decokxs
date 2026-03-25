package o;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yDZ implements java.util.Iterator<java.lang.Character>, InterfaceC56535yIz {
    public abstract char copydefault();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public /* synthetic */ java.lang.Character next() {
        return java.lang.Character.valueOf(copydefault());
    }
}
