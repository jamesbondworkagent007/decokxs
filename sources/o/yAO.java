package o;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes13.dex */
public final class yAO<T> implements InterfaceC58299yyf<T> {
    public long AhwBna;
    public final int EZpvd;
    public AtomicReferenceArray<java.lang.Object> OLrzqt;
    public final int djBIcL;
    public AtomicReferenceArray<java.lang.Object> gEmmrt;
    public int valueOf;
    public static final int KWHzl = java.lang.Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final java.lang.Object AEQbTJ = new java.lang.Object();
    public final AtomicLong AYXKKw = new AtomicLong();
    public final AtomicLong copydefault = new AtomicLong();

    public static int AEQbTJ(int i) {
        return i;
    }

    public yAO(int i) {
        int iAEQbTJ = C56343yBw.AEQbTJ(java.lang.Math.max(8, i));
        int i2 = iAEQbTJ - 1;
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray = new AtomicReferenceArray<>(iAEQbTJ + 1);
        this.gEmmrt = atomicReferenceArray;
        this.djBIcL = i2;
        OLrzqt(iAEQbTJ);
        this.OLrzqt = atomicReferenceArray;
        this.EZpvd = i2;
        this.AhwBna = iAEQbTJ - 2;
        AEQbTJ(0L);
    }

    @Override // o.InterfaceC58305yyl
    public boolean offer(T t) {
        if (t == null) {
            throw new java.lang.NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.gEmmrt;
        long jKWHzl = KWHzl();
        int i = this.djBIcL;
        int iEZpvd = EZpvd(jKWHzl, i);
        if (jKWHzl < this.AhwBna) {
            return AEQbTJ(atomicReferenceArray, t, jKWHzl, iEZpvd);
        }
        long j = ((long) this.valueOf) + jKWHzl;
        if (KWHzl(atomicReferenceArray, EZpvd(j, i)) == null) {
            this.AhwBna = j - 1;
            return AEQbTJ(atomicReferenceArray, t, jKWHzl, iEZpvd);
        }
        if (KWHzl(atomicReferenceArray, EZpvd(1 + jKWHzl, i)) == null) {
            return AEQbTJ(atomicReferenceArray, t, jKWHzl, iEZpvd);
        }
        AEQbTJ(atomicReferenceArray, jKWHzl, iEZpvd, t, i);
        return true;
    }

    public final boolean AEQbTJ(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, T t, long j, int i) {
        EZpvd(atomicReferenceArray, i, t);
        AEQbTJ(j + 1);
        return true;
    }

    public final void AEQbTJ(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.gEmmrt = atomicReferenceArray2;
        this.AhwBna = (j2 + j) - 1;
        EZpvd(atomicReferenceArray2, i, t);
        EZpvd(atomicReferenceArray, atomicReferenceArray2);
        EZpvd(atomicReferenceArray, i, AEQbTJ);
        AEQbTJ(j + 1);
    }

    public final void EZpvd(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, AtomicReferenceArray<java.lang.Object> atomicReferenceArray2) {
        EZpvd(atomicReferenceArray, AEQbTJ(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    public final AtomicReferenceArray<java.lang.Object> OLrzqt(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, int i) {
        int iAEQbTJ = AEQbTJ(i);
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = (AtomicReferenceArray) KWHzl(atomicReferenceArray, iAEQbTJ);
        EZpvd(atomicReferenceArray, iAEQbTJ, null);
        return atomicReferenceArray2;
    }

    @Override // o.InterfaceC58299yyf, o.InterfaceC58305yyl
    public T poll() {
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.OLrzqt;
        long jOLrzqt = OLrzqt();
        int i = this.EZpvd;
        int iEZpvd = EZpvd(jOLrzqt, i);
        T t = (T) KWHzl(atomicReferenceArray, iEZpvd);
        boolean z = t == AEQbTJ;
        if (t == null || z) {
            if (z) {
                return OLrzqt(OLrzqt(atomicReferenceArray, i + 1), jOLrzqt, i);
            }
            return null;
        }
        EZpvd(atomicReferenceArray, iEZpvd, null);
        copydefault(jOLrzqt + 1);
        return t;
    }

    public final T OLrzqt(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, long j, int i) {
        this.OLrzqt = atomicReferenceArray;
        int iEZpvd = EZpvd(j, i);
        T t = (T) KWHzl(atomicReferenceArray, iEZpvd);
        if (t != null) {
            EZpvd(atomicReferenceArray, iEZpvd, null);
            copydefault(j + 1);
        }
        return t;
    }

    public T EZpvd() {
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.OLrzqt;
        long jOLrzqt = OLrzqt();
        int i = this.EZpvd;
        T t = (T) KWHzl(atomicReferenceArray, EZpvd(jOLrzqt, i));
        return t == AEQbTJ ? copydefault(OLrzqt(atomicReferenceArray, i + 1), jOLrzqt, i) : t;
    }

    public final T copydefault(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, long j, int i) {
        this.OLrzqt = atomicReferenceArray;
        return (T) KWHzl(atomicReferenceArray, EZpvd(j, i));
    }

    @Override // o.InterfaceC58305yyl
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public int gEmmrt() {
        long jCopydefault = copydefault();
        while (true) {
            long jAEQbTJ = AEQbTJ();
            long jCopydefault2 = copydefault();
            if (jCopydefault == jCopydefault2) {
                return (int) (jAEQbTJ - jCopydefault2);
            }
            jCopydefault = jCopydefault2;
        }
    }

    @Override // o.InterfaceC58305yyl
    public boolean isEmpty() {
        return AEQbTJ() == copydefault();
    }

    public final void OLrzqt(int i) {
        this.valueOf = java.lang.Math.min(i / 4, KWHzl);
    }

    public final long AEQbTJ() {
        return this.AYXKKw.get();
    }

    public final long copydefault() {
        return this.copydefault.get();
    }

    public final long KWHzl() {
        return this.AYXKKw.get();
    }

    public final long OLrzqt() {
        return this.copydefault.get();
    }

    private void AEQbTJ(long j) {
        this.AYXKKw.lazySet(j);
    }

    private void copydefault(long j) {
        this.copydefault.lazySet(j);
    }

    public static int EZpvd(long j, int i) {
        return AEQbTJ(((int) j) & i);
    }

    public static void EZpvd(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, int i, java.lang.Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public static <E> java.lang.Object KWHzl(AtomicReferenceArray<java.lang.Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public boolean copydefault(T t, T t2) {
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray = this.gEmmrt;
        long jAEQbTJ = AEQbTJ();
        int i = this.djBIcL;
        long j = 2 + jAEQbTJ;
        if (KWHzl(atomicReferenceArray, EZpvd(j, i)) == null) {
            int iEZpvd = EZpvd(jAEQbTJ, i);
            EZpvd(atomicReferenceArray, iEZpvd + 1, t2);
            EZpvd(atomicReferenceArray, iEZpvd, t);
            AEQbTJ(j);
            return true;
        }
        AtomicReferenceArray<java.lang.Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.gEmmrt = atomicReferenceArray2;
        int iEZpvd2 = EZpvd(jAEQbTJ, i);
        EZpvd(atomicReferenceArray2, iEZpvd2 + 1, t2);
        EZpvd(atomicReferenceArray2, iEZpvd2, t);
        EZpvd(atomicReferenceArray, atomicReferenceArray2);
        EZpvd(atomicReferenceArray, iEZpvd2, AEQbTJ);
        AEQbTJ(j);
        return true;
    }
}
