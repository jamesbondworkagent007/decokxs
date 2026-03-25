package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56394yDt implements java.util.Collection<C56396yDv>, InterfaceC56535yIz {
    public final long[] EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean AEQbTJ(long[] jArr, java.lang.Object obj) {
        return (obj instanceof C56394yDt) && Intrinsics.EZpvd(jArr, ((C56394yDt) obj).EZpvd());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 long[]) A[MD:(long[]):void (m)] call: o.yDt.<init>(long[]):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C56394yDt EZpvd(long[] jArr) {
        return new C56394yDt(jArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final boolean EZpvd(long[] jArr, long[] jArr2) {
        return Intrinsics.EZpvd(jArr, jArr2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int KWHzl(long[] jArr) {
        return java.util.Arrays.hashCode(jArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static long[] OLrzqt(@NotNull long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "");
        return jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String djBIcL(long[] jArr) {
        return "ULongArray(storage=" + java.util.Arrays.toString(jArr) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ long[] EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* synthetic */ boolean add(C56396yDv c56396yDv) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends C56396yDv> collection) {
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
        return AEQbTJ(this.EZpvd, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public int hashCode() {
        return KWHzl(this.EZpvd);
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
        return djBIcL(this.EZpvd);
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof C56396yDv) {
            return EZpvd(((C56396yDv) obj).OLrzqt());
        }
        return false;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDt.EZpvd(long[]):o.yDt] */
    public /* synthetic */ C56394yDt(long[] jArr) {
        this.EZpvd = jArr;
    }

    public static long[] copydefault(int i) {
        return OLrzqt(new long[i]);
    }

    public static final long copydefault(long[] jArr, int i) {
        return C56396yDv.copydefault(jArr[i]);
    }

    public static final void KWHzl(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    public static int copydefault(long[] jArr) {
        return jArr.length;
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public int size() {
        return copydefault(this.EZpvd);
    }

    public static java.util.Iterator<C56396yDv> AYXKKw(long[] jArr) {
        return new TaskDescription(jArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C56396yDv> iterator() {
        return AYXKKw(this.EZpvd);
    }

    /* JADX INFO: renamed from: o.yDt$TaskDescription */
    public static final class TaskDescription implements java.util.Iterator<C56396yDv>, InterfaceC56535yIz {
        public final long[] AEQbTJ;
        public int EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public TaskDescription(@NotNull long[] jArr) {
            Intrinsics.checkNotNullParameter(jArr, "");
            this.AEQbTJ = jArr;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* synthetic */ C56396yDv next() {
            return C56396yDv.KWHzl(EZpvd());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.EZpvd < this.AEQbTJ.length;
        }

        public long EZpvd() {
            int i = this.EZpvd;
            long[] jArr = this.AEQbTJ;
            if (i >= jArr.length) {
                throw new NoSuchElementException(java.lang.String.valueOf(this.EZpvd));
            }
            this.EZpvd = i + 1;
            return C56396yDv.copydefault(jArr[i]);
        }
    }

    public boolean EZpvd(long j) {
        return KWHzl(this.EZpvd, j);
    }

    public static boolean KWHzl(long[] jArr, long j) {
        return yDV.OLrzqt(jArr, j);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return AEQbTJ(this.EZpvd, (java.util.Collection<C56396yDv>) collection);
    }

    public static boolean AEQbTJ(long[] jArr, @NotNull java.util.Collection<C56396yDv> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<C56396yDv> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (java.lang.Object obj : collection2) {
                if (!(obj instanceof C56396yDv) || !yDV.OLrzqt(jArr, ((C56396yDv) obj).OLrzqt())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean AEQbTJ(long[] jArr) {
        return jArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AEQbTJ(this.EZpvd);
    }
}
