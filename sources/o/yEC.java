package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yEC<T> extends yDG<T> implements java.util.RandomAccess {
    public final java.lang.Object[] AEQbTJ;
    public int EZpvd;
    public int OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yDG, o.AbstractC56400yDz
    public int getSize() {
        return this.EZpvd;
    }

    public yEC(@NotNull java.lang.Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "");
        this.AEQbTJ = objArr;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
        }
        if (i > objArr.length) {
            throw new java.lang.IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        this.copydefault = objArr.length;
        this.EZpvd = i;
    }

    public yEC(int i) {
        this(new java.lang.Object[i], 0);
    }

    @Override // o.yDG, java.util.List
    public T get(int i) {
        yDG.Companion.AEQbTJ(i, size());
        return (T) this.AEQbTJ[(this.OLrzqt + i) % this.copydefault];
    }

    public final boolean OLrzqt() {
        return size() == this.copydefault;
    }

    public static final class StateListAnimator extends yDH<T> {
        public final /* synthetic */ yEC<T> EZpvd;
        public int OLrzqt;
        public int copydefault;

        public StateListAnimator(yEC<T> yec) {
            this.EZpvd = yec;
            this.OLrzqt = yec.size();
            this.copydefault = yec.OLrzqt;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yEC$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.yDH
        public void copydefault() {
            if (this.OLrzqt != 0) {
                copydefault(this.EZpvd.AEQbTJ[this.copydefault]);
                this.copydefault = (this.copydefault + 1) % this.EZpvd.copydefault;
                this.OLrzqt--;
                return;
            }
            KWHzl();
        }
    }

    @Override // o.yDG, o.AbstractC56400yDz, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<T> iterator() {
        return new StateListAnimator(this);
    }

    @Override // o.AbstractC56400yDz, java.util.Collection
    public <T> T[] toArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        int length = tArr.length;
        java.lang.Object[] objArr = tArr;
        if (length < size()) {
            java.lang.Object[] objArr2 = (T[]) java.util.Arrays.copyOf(tArr, size());
            Intrinsics.checkNotNullExpressionValue(objArr2, "");
            objArr = objArr2;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.OLrzqt; i2 < size && i3 < this.copydefault; i3++) {
            objArr[i2] = this.AEQbTJ[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.AEQbTJ[i];
            i2++;
            i++;
        }
        return (T[]) C56402yEa.AEQbTJ(size, objArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.yEC<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56400yDz, java.util.Collection
    public java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[size()]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.yEC<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public final yEC<T> copydefault(int i) {
        java.lang.Object[] array;
        int i2 = this.copydefault;
        int iValueOf = C56548yJl.valueOf(i2 + (i2 >> 1) + 1, i);
        if (this.OLrzqt == 0) {
            array = java.util.Arrays.copyOf(this.AEQbTJ, iValueOf);
            Intrinsics.checkNotNullExpressionValue(array, "");
        } else {
            array = toArray(new java.lang.Object[iValueOf]);
        }
        return new yEC<>(array, size());
    }

    public final void KWHzl(T t) {
        if (OLrzqt()) {
            throw new java.lang.IllegalStateException("ring buffer is full");
        }
        this.AEQbTJ[(this.OLrzqt + size()) % this.copydefault] = t;
        this.EZpvd = size() + 1;
    }

    public final void OLrzqt(int i) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
        if (i > size()) {
            throw new java.lang.IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        if (i > 0) {
            int i2 = this.OLrzqt;
            int i3 = (i2 + i) % this.copydefault;
            if (i2 > i3) {
                yDT.copydefault(this.AEQbTJ, (java.lang.Object) null, i2, this.copydefault);
                yDT.copydefault(this.AEQbTJ, (java.lang.Object) null, 0, i3);
            } else {
                yDT.copydefault(this.AEQbTJ, (java.lang.Object) null, i2, i3);
            }
            this.OLrzqt = i3;
            this.EZpvd = size() - i;
        }
    }
}
