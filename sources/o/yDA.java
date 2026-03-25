package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yDA implements java.util.Collection<yDB>, InterfaceC56535yIz {
    public final short[] copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 short[]) A[MD:(short[]):void (m)] call: o.yDA.<init>(short[]):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ yDA EZpvd(short[] sArr) {
        return new yDA(sArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean EZpvd(short[] sArr, java.lang.Object obj) {
        return (obj instanceof yDA) && Intrinsics.EZpvd(sArr, ((yDA) obj).EZpvd());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static short[] KWHzl(@NotNull short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "");
        return sArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int copydefault(short[] sArr) {
        return java.util.Arrays.hashCode(sArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String gEmmrt(short[] sArr) {
        return "UShortArray(storage=" + java.util.Arrays.toString(sArr) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ short[] EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* synthetic */ boolean add(yDB ydb) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends yDB> collection) {
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
        return EZpvd(this.copydefault, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public int hashCode() {
        return copydefault(this.copydefault);
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
        return gEmmrt(this.copydefault);
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof yDB) {
            return EZpvd(((yDB) obj).EZpvd());
        }
        return false;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDA.EZpvd(short[]):o.yDA] */
    public /* synthetic */ yDA(short[] sArr) {
        this.copydefault = sArr;
    }

    public static short[] OLrzqt(int i) {
        return KWHzl(new short[i]);
    }

    public static final short OLrzqt(short[] sArr, int i) {
        return yDB.AEQbTJ(sArr[i]);
    }

    public static final void EZpvd(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    public static int OLrzqt(short[] sArr) {
        return sArr.length;
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public int size() {
        return OLrzqt(this.copydefault);
    }

    public static java.util.Iterator<yDB> AYXKKw(short[] sArr) {
        return new Activity(sArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<yDB> iterator() {
        return AYXKKw(this.copydefault);
    }

    public static final class Activity implements java.util.Iterator<yDB>, InterfaceC56535yIz {
        public final short[] AEQbTJ;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Activity(@NotNull short[] sArr) {
            Intrinsics.checkNotNullParameter(sArr, "");
            this.AEQbTJ = sArr;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* synthetic */ yDB next() {
            return yDB.EZpvd(AEQbTJ());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.copydefault < this.AEQbTJ.length;
        }

        public short AEQbTJ() {
            int i = this.copydefault;
            short[] sArr = this.AEQbTJ;
            if (i >= sArr.length) {
                throw new NoSuchElementException(java.lang.String.valueOf(this.copydefault));
            }
            this.copydefault = i + 1;
            return yDB.AEQbTJ(sArr[i]);
        }
    }

    public boolean EZpvd(short s) {
        return copydefault(this.copydefault, s);
    }

    public static boolean copydefault(short[] sArr, short s) {
        return yDV.EZpvd(sArr, s);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return EZpvd(this.copydefault, (java.util.Collection<yDB>) collection);
    }

    public static boolean EZpvd(short[] sArr, @NotNull java.util.Collection<yDB> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<yDB> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (java.lang.Object obj : collection2) {
                if (!(obj instanceof yDB) || !yDV.EZpvd(sArr, ((yDB) obj).EZpvd())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean AEQbTJ(short[] sArr) {
        return sArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AEQbTJ(this.copydefault);
    }
}
