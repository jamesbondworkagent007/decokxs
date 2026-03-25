package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56397yDw implements java.util.Collection<C56395yDu>, InterfaceC56535yIz {
    public final int[] AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int[] AEQbTJ(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        return iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int OLrzqt(int[] iArr) {
        return java.util.Arrays.hashCode(iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean OLrzqt(int[] iArr, int[] iArr2) {
        return Intrinsics.EZpvd(iArr, iArr2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 int[]) A[MD:(int[]):void (m)] call: o.yDw.<init>(int[]):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C56397yDw copydefault(int[] iArr) {
        return new C56397yDw(iArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault(int[] iArr, java.lang.Object obj) {
        return (obj instanceof C56397yDw) && Intrinsics.EZpvd(iArr, ((C56397yDw) obj).AEQbTJ());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String djBIcL(int[] iArr) {
        return "UIntArray(storage=" + java.util.Arrays.toString(iArr) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ int[] AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* synthetic */ boolean add(C56395yDu c56395yDu) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends C56395yDu> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean equals(java.lang.Object obj) {
        return copydefault(this.AEQbTJ, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public int hashCode() {
        return OLrzqt(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public java.lang.Object[] toArray() {
        return C56511yIb.AEQbTJ(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) C56511yIb.EZpvd(this, tArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return djBIcL(this.AEQbTJ);
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof C56395yDu) {
            return KWHzl(((C56395yDu) obj).copydefault());
        }
        return false;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDw.copydefault(int[]):o.yDw] */
    public /* synthetic */ C56397yDw(int[] iArr) {
        this.AEQbTJ = iArr;
    }

    public static int[] EZpvd(int i) {
        return AEQbTJ(new int[i]);
    }

    public static final int KWHzl(int[] iArr, int i) {
        return C56395yDu.EZpvd(iArr[i]);
    }

    public static final void KWHzl(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    public static int KWHzl(int[] iArr) {
        return iArr.length;
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int size() {
        return KWHzl(this.AEQbTJ);
    }

    public static java.util.Iterator<C56395yDu> AYXKKw(int[] iArr) {
        return new Application(iArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C56395yDu> iterator() {
        return AYXKKw(this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.yDw$Application */
    public static final class Application implements java.util.Iterator<C56395yDu>, InterfaceC56535yIz {
        public int EZpvd;
        public final int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Application(@NotNull int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "");
            this.OLrzqt = iArr;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* synthetic */ C56395yDu next() {
            return C56395yDu.AEQbTJ(AEQbTJ());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.EZpvd < this.OLrzqt.length;
        }

        public int AEQbTJ() {
            int i = this.EZpvd;
            int[] iArr = this.OLrzqt;
            if (i >= iArr.length) {
                throw new NoSuchElementException(java.lang.String.valueOf(this.EZpvd));
            }
            this.EZpvd = i + 1;
            return C56395yDu.EZpvd(iArr[i]);
        }
    }

    public boolean KWHzl(int i) {
        return copydefault(this.AEQbTJ, i);
    }

    public static boolean copydefault(int[] iArr, int i) {
        return yDV.AYXKKw(iArr, i);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return AEQbTJ(this.AEQbTJ, collection);
    }

    public static boolean AEQbTJ(int[] iArr, @NotNull java.util.Collection<C56395yDu> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<C56395yDu> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (java.lang.Object obj : collection2) {
                if (!(obj instanceof C56395yDu) || !yDV.AYXKKw(iArr, ((C56395yDu) obj).copydefault())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean EZpvd(int[] iArr) {
        return iArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return EZpvd(this.AEQbTJ);
    }
}
