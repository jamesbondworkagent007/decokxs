package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yDx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56398yDx implements java.util.Collection<C56393yDs>, InterfaceC56535yIz {
    public final byte[] KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static byte[] EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return bArr;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 byte[]) A[MD:(byte[]):void (m)] call: o.yDx.<init>(byte[]):void type: CONSTRUCTOR */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final /* synthetic */ C56398yDx KWHzl(byte[] bArr) {
        return new C56398yDx(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static int copydefault(byte[] bArr) {
        return java.util.Arrays.hashCode(bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static boolean copydefault(byte[] bArr, java.lang.Object obj) {
        return (obj instanceof C56398yDx) && Intrinsics.EZpvd(bArr, ((C56398yDx) obj).EZpvd());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static java.lang.String djBIcL(byte[] bArr) {
        return "UByteArray(storage=" + java.util.Arrays.toString(bArr) + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final /* synthetic */ byte[] EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.Collection
    public /* synthetic */ boolean add(C56393yDs c56393yDs) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends C56393yDs> collection) {
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
        return copydefault(this.KWHzl, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public int hashCode() {
        return copydefault(this.KWHzl);
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
        return djBIcL(this.KWHzl);
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (obj instanceof C56393yDs) {
            return AEQbTJ(((C56393yDs) obj).OLrzqt());
        }
        return false;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [o.yDx.KWHzl(byte[]):o.yDx] */
    public /* synthetic */ C56398yDx(byte[] bArr) {
        this.KWHzl = bArr;
    }

    public static byte[] OLrzqt(int i) {
        return EZpvd(new byte[i]);
    }

    public static final byte OLrzqt(byte[] bArr, int i) {
        return C56393yDs.copydefault(bArr[i]);
    }

    public static final void copydefault(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    public static int OLrzqt(byte[] bArr) {
        return bArr.length;
    }

    /* JADX DEBUG: Method merged with bridge method: size()I */
    @Override // java.util.Collection
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public int size() {
        return OLrzqt(this.KWHzl);
    }

    public static java.util.Iterator<C56393yDs> gEmmrt(byte[] bArr) {
        return new StateListAnimator(bArr);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C56393yDs> iterator() {
        return gEmmrt(this.KWHzl);
    }

    /* JADX INFO: renamed from: o.yDx$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator<C56393yDs>, InterfaceC56535yIz {
        public int KWHzl;
        public final byte[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator(@NotNull byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "");
            this.copydefault = bArr;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.Iterator
        public /* synthetic */ C56393yDs next() {
            return C56393yDs.OLrzqt(AEQbTJ());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.KWHzl < this.copydefault.length;
        }

        public byte AEQbTJ() {
            int i = this.KWHzl;
            byte[] bArr = this.copydefault;
            if (i >= bArr.length) {
                throw new NoSuchElementException(java.lang.String.valueOf(this.KWHzl));
            }
            this.KWHzl = i + 1;
            return C56393yDs.copydefault(bArr[i]);
        }
    }

    public boolean AEQbTJ(byte b) {
        return OLrzqt(this.KWHzl, b);
    }

    public static boolean OLrzqt(byte[] bArr, byte b) {
        return yDV.KWHzl(bArr, b);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return KWHzl(this.KWHzl, collection);
    }

    public static boolean KWHzl(byte[] bArr, @NotNull java.util.Collection<C56393yDs> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<C56393yDs> collection2 = collection;
        if (!collection2.isEmpty()) {
            for (java.lang.Object obj : collection2) {
                if (!(obj instanceof C56393yDs) || !yDV.KWHzl(bArr, ((C56393yDs) obj).OLrzqt())) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean AEQbTJ(byte[] bArr) {
        return bArr.length == 0;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return AEQbTJ(this.KWHzl);
    }
}
