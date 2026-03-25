package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yDQ<E> extends yDJ<E> {
    public static final Application AEQbTJ = new Application(null);
    public static final java.lang.Object[] KWHzl = new java.lang.Object[0];
    public int EZpvd;
    public java.lang.Object[] OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ() {
        ((java.util.AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yDJ
    public int getSize() {
        return this.copydefault;
    }

    public yDQ(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = KWHzl;
        } else if (i > 0) {
            objArr = new java.lang.Object[i];
        } else {
            throw new java.lang.IllegalArgumentException("Illegal Capacity: " + i);
        }
        this.OLrzqt = objArr;
    }

    public yDQ() {
        this.OLrzqt = KWHzl;
    }

    private final void djBIcL(int i) {
        if (i < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.OLrzqt;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == KWHzl) {
            this.OLrzqt = new java.lang.Object[C56548yJl.copydefault(i, 10)];
        } else {
            KWHzl(yDG.Companion.OLrzqt(objArr.length, i));
        }
    }

    public final void KWHzl(int i) {
        java.lang.Object[] objArr = new java.lang.Object[i];
        java.lang.Object[] objArr2 = this.OLrzqt;
        yDT.AEQbTJ(objArr2, objArr, 0, this.EZpvd, objArr2.length);
        java.lang.Object[] objArr3 = this.OLrzqt;
        int length = objArr3.length;
        int i2 = this.EZpvd;
        yDT.AEQbTJ(objArr3, objArr, length - i2, 0, i2);
        this.EZpvd = 0;
        this.OLrzqt = objArr;
    }

    public final int copydefault(int i) {
        java.lang.Object[] objArr = this.OLrzqt;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final int OLrzqt(int i) {
        return i < 0 ? i + this.OLrzqt.length : i;
    }

    public final int EZpvd(int i) {
        if (i == yDV.zLjUOn(this.OLrzqt)) {
            return 0;
        }
        return i + 1;
    }

    public final int AEQbTJ(int i) {
        return i == 0 ? yDV.zLjUOn(this.OLrzqt) : i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E KWHzl() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.OLrzqt[this.EZpvd];
    }

    public final E copydefault() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.OLrzqt[this.EZpvd];
    }

    public final E OLrzqt() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.OLrzqt[copydefault(this.EZpvd + yDY.AuCTel(this))];
    }

    public final E EZpvd() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.OLrzqt[copydefault(this.EZpvd + yDY.AuCTel(this))];
    }

    public final void addFirst(E e) {
        AEQbTJ();
        djBIcL(size() + 1);
        int iAEQbTJ = AEQbTJ(this.EZpvd);
        this.EZpvd = iAEQbTJ;
        this.OLrzqt[iAEQbTJ] = e;
        this.copydefault = size() + 1;
    }

    public final void addLast(E e) {
        AEQbTJ();
        djBIcL(size() + 1);
        this.OLrzqt[copydefault(this.EZpvd + size())] = e;
        this.copydefault = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        AEQbTJ();
        java.lang.Object[] objArr = this.OLrzqt;
        int i = this.EZpvd;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.EZpvd = EZpvd(i);
        this.copydefault = size() - 1;
        return e;
    }

    public final E AYXKKw() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        AEQbTJ();
        int iCopydefault = copydefault(this.EZpvd + yDY.AuCTel(this));
        java.lang.Object[] objArr = this.OLrzqt;
        E e = (E) objArr[iCopydefault];
        objArr[iCopydefault] = null;
        this.copydefault = size() - 1;
        return e;
    }

    public final E djBIcL() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        addLast(e);
        return true;
    }

    @Override // o.yDJ, java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        yDG.Companion.copydefault(i, size());
        if (i == size()) {
            addLast(e);
            return;
        }
        if (i == 0) {
            addFirst(e);
            return;
        }
        AEQbTJ();
        djBIcL(size() + 1);
        int iCopydefault = copydefault(this.EZpvd + i);
        if (i < ((size() + 1) >> 1)) {
            int iAEQbTJ = AEQbTJ(iCopydefault);
            int iAEQbTJ2 = AEQbTJ(this.EZpvd);
            int i2 = this.EZpvd;
            if (iAEQbTJ >= i2) {
                java.lang.Object[] objArr = this.OLrzqt;
                objArr[iAEQbTJ2] = objArr[i2];
                yDT.AEQbTJ(objArr, objArr, i2, i2 + 1, iAEQbTJ + 1);
            } else {
                java.lang.Object[] objArr2 = this.OLrzqt;
                yDT.AEQbTJ(objArr2, objArr2, i2 - 1, i2, objArr2.length);
                java.lang.Object[] objArr3 = this.OLrzqt;
                objArr3[objArr3.length - 1] = objArr3[0];
                yDT.AEQbTJ(objArr3, objArr3, 0, 1, iAEQbTJ + 1);
            }
            this.OLrzqt[iAEQbTJ] = e;
            this.EZpvd = iAEQbTJ2;
        } else {
            int iCopydefault2 = copydefault(this.EZpvd + size());
            if (iCopydefault < iCopydefault2) {
                java.lang.Object[] objArr4 = this.OLrzqt;
                yDT.AEQbTJ(objArr4, objArr4, iCopydefault + 1, iCopydefault, iCopydefault2);
            } else {
                java.lang.Object[] objArr5 = this.OLrzqt;
                yDT.AEQbTJ(objArr5, objArr5, 1, 0, iCopydefault2);
                java.lang.Object[] objArr6 = this.OLrzqt;
                objArr6[0] = objArr6[objArr6.length - 1];
                yDT.AEQbTJ(objArr6, objArr6, iCopydefault + 1, iCopydefault, objArr6.length - 1);
            }
            this.OLrzqt[iCopydefault] = e;
        }
        this.copydefault = size() + 1;
    }

    public final void copydefault(int i, java.util.Collection<? extends E> collection) {
        java.util.Iterator<? extends E> it = collection.iterator();
        int length = this.OLrzqt.length;
        while (i < length && it.hasNext()) {
            this.OLrzqt[i] = it.next();
            i++;
        }
        int i2 = this.EZpvd;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.OLrzqt[i3] = it.next();
        }
        this.copydefault = size() + collection.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull java.util.Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        if (collection.isEmpty()) {
            return false;
        }
        AEQbTJ();
        djBIcL(size() + collection.size());
        copydefault(copydefault(this.EZpvd + size()), collection);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull java.util.Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        yDG.Companion.copydefault(i, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i == size()) {
            return addAll(collection);
        }
        AEQbTJ();
        djBIcL(size() + collection.size());
        int iCopydefault = copydefault(this.EZpvd + size());
        int iCopydefault2 = copydefault(this.EZpvd + i);
        int size = collection.size();
        if (i < ((size() + 1) >> 1)) {
            int i2 = this.EZpvd;
            int length = i2 - size;
            if (iCopydefault2 < i2) {
                java.lang.Object[] objArr = this.OLrzqt;
                yDT.AEQbTJ(objArr, objArr, length, i2, objArr.length);
                if (size >= iCopydefault2) {
                    java.lang.Object[] objArr2 = this.OLrzqt;
                    yDT.AEQbTJ(objArr2, objArr2, objArr2.length - size, 0, iCopydefault2);
                } else {
                    java.lang.Object[] objArr3 = this.OLrzqt;
                    yDT.AEQbTJ(objArr3, objArr3, objArr3.length - size, 0, size);
                    java.lang.Object[] objArr4 = this.OLrzqt;
                    yDT.AEQbTJ(objArr4, objArr4, 0, size, iCopydefault2);
                }
            } else if (length >= 0) {
                java.lang.Object[] objArr5 = this.OLrzqt;
                yDT.AEQbTJ(objArr5, objArr5, length, i2, iCopydefault2);
            } else {
                java.lang.Object[] objArr6 = this.OLrzqt;
                length += objArr6.length;
                int length2 = objArr6.length - length;
                if (length2 >= iCopydefault2 - i2) {
                    yDT.AEQbTJ(objArr6, objArr6, length, i2, iCopydefault2);
                } else {
                    yDT.AEQbTJ(objArr6, objArr6, length, i2, i2 + length2);
                    java.lang.Object[] objArr7 = this.OLrzqt;
                    yDT.AEQbTJ(objArr7, objArr7, 0, this.EZpvd + length2, iCopydefault2);
                }
            }
            this.EZpvd = length;
            copydefault(OLrzqt(iCopydefault2 - size), collection);
        } else {
            int i3 = iCopydefault2 + size;
            if (iCopydefault2 < iCopydefault) {
                int i4 = size + iCopydefault;
                java.lang.Object[] objArr8 = this.OLrzqt;
                if (i4 <= objArr8.length) {
                    yDT.AEQbTJ(objArr8, objArr8, i3, iCopydefault2, iCopydefault);
                } else if (i3 >= objArr8.length) {
                    yDT.AEQbTJ(objArr8, objArr8, i3 - objArr8.length, iCopydefault2, iCopydefault);
                } else {
                    int length3 = iCopydefault - (i4 - objArr8.length);
                    yDT.AEQbTJ(objArr8, objArr8, 0, length3, iCopydefault);
                    java.lang.Object[] objArr9 = this.OLrzqt;
                    yDT.AEQbTJ(objArr9, objArr9, i3, iCopydefault2, length3);
                }
            } else {
                java.lang.Object[] objArr10 = this.OLrzqt;
                yDT.AEQbTJ(objArr10, objArr10, size, 0, iCopydefault);
                java.lang.Object[] objArr11 = this.OLrzqt;
                if (i3 >= objArr11.length) {
                    yDT.AEQbTJ(objArr11, objArr11, i3 - objArr11.length, iCopydefault2, objArr11.length);
                } else {
                    yDT.AEQbTJ(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    java.lang.Object[] objArr12 = this.OLrzqt;
                    yDT.AEQbTJ(objArr12, objArr12, i3, iCopydefault2, objArr12.length - size);
                }
            }
            copydefault(iCopydefault2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        yDG.Companion.AEQbTJ(i, size());
        return (E) this.OLrzqt[copydefault(this.EZpvd + i)];
    }

    @Override // o.yDJ, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        yDG.Companion.AEQbTJ(i, size());
        int iCopydefault = copydefault(this.EZpvd + i);
        java.lang.Object[] objArr = this.OLrzqt;
        E e2 = (E) objArr[iCopydefault];
        objArr[iCopydefault] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(java.lang.Object obj) {
        int i;
        int iCopydefault = copydefault(this.EZpvd + size());
        int length = this.EZpvd;
        if (length < iCopydefault) {
            while (length < iCopydefault) {
                if (Intrinsics.EZpvd(obj, this.OLrzqt[length])) {
                    i = this.EZpvd;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iCopydefault) {
            return -1;
        }
        int length2 = this.OLrzqt.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iCopydefault; i2++) {
                    if (Intrinsics.EZpvd(obj, this.OLrzqt[i2])) {
                        length = i2 + this.OLrzqt.length;
                        i = this.EZpvd;
                    }
                }
                return -1;
            }
            if (Intrinsics.EZpvd(obj, this.OLrzqt[length])) {
                i = this.EZpvd;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        int iZLjUOn;
        int i;
        int iCopydefault = copydefault(this.EZpvd + size());
        int i2 = this.EZpvd;
        if (i2 < iCopydefault) {
            iZLjUOn = iCopydefault - 1;
            if (i2 <= iZLjUOn) {
                while (!Intrinsics.EZpvd(obj, this.OLrzqt[iZLjUOn])) {
                    if (iZLjUOn != i2) {
                        iZLjUOn--;
                    }
                }
                i = this.EZpvd;
                return iZLjUOn - i;
            }
            return -1;
        }
        if (i2 > iCopydefault) {
            int i3 = iCopydefault - 1;
            while (true) {
                if (-1 < i3) {
                    if (Intrinsics.EZpvd(obj, this.OLrzqt[i3])) {
                        iZLjUOn = i3 + this.OLrzqt.length;
                        i = this.EZpvd;
                        break;
                    }
                    i3--;
                } else {
                    iZLjUOn = yDV.zLjUOn(this.OLrzqt);
                    int i4 = this.EZpvd;
                    if (i4 <= iZLjUOn) {
                        while (!Intrinsics.EZpvd(obj, this.OLrzqt[iZLjUOn])) {
                            if (iZLjUOn != i4) {
                                iZLjUOn--;
                            }
                        }
                        i = this.EZpvd;
                    }
                }
            }
            return iZLjUOn - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(java.lang.Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // o.yDJ
    public E removeAt(int i) {
        yDG.Companion.AEQbTJ(i, size());
        if (i == yDY.AuCTel(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        AEQbTJ();
        int iCopydefault = copydefault(this.EZpvd + i);
        E e = (E) this.OLrzqt[iCopydefault];
        if (i < (size() >> 1)) {
            int i2 = this.EZpvd;
            if (iCopydefault >= i2) {
                java.lang.Object[] objArr = this.OLrzqt;
                yDT.AEQbTJ(objArr, objArr, i2 + 1, i2, iCopydefault);
            } else {
                java.lang.Object[] objArr2 = this.OLrzqt;
                yDT.AEQbTJ(objArr2, objArr2, 1, 0, iCopydefault);
                java.lang.Object[] objArr3 = this.OLrzqt;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i3 = this.EZpvd;
                yDT.AEQbTJ(objArr3, objArr3, i3 + 1, i3, objArr3.length - 1);
            }
            java.lang.Object[] objArr4 = this.OLrzqt;
            int i4 = this.EZpvd;
            objArr4[i4] = null;
            this.EZpvd = EZpvd(i4);
        } else {
            int iCopydefault2 = copydefault(this.EZpvd + yDY.AuCTel(this));
            if (iCopydefault <= iCopydefault2) {
                java.lang.Object[] objArr5 = this.OLrzqt;
                yDT.AEQbTJ(objArr5, objArr5, iCopydefault, iCopydefault + 1, iCopydefault2 + 1);
            } else {
                java.lang.Object[] objArr6 = this.OLrzqt;
                yDT.AEQbTJ(objArr6, objArr6, iCopydefault, iCopydefault + 1, objArr6.length);
                java.lang.Object[] objArr7 = this.OLrzqt;
                objArr7[objArr7.length - 1] = objArr7[0];
                yDT.AEQbTJ(objArr7, objArr7, 0, 1, iCopydefault2 + 1);
            }
            this.OLrzqt[iCopydefault2] = null;
        }
        this.copydefault = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            AEQbTJ();
            AEQbTJ(this.EZpvd, copydefault(this.EZpvd + size()));
        }
        this.EZpvd = 0;
        this.copydefault = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        if (tArr.length < size()) {
            tArr = (T[]) yDO.AEQbTJ(tArr, size());
        }
        int iCopydefault = copydefault(this.EZpvd + size());
        int i = this.EZpvd;
        if (i < iCopydefault) {
            yDT.copyInto$default(this.OLrzqt, tArr, 0, i, iCopydefault, 2, (java.lang.Object) null);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr = this.OLrzqt;
            yDT.AEQbTJ(objArr, tArr, 0, this.EZpvd, objArr.length);
            java.lang.Object[] objArr2 = this.OLrzqt;
            yDT.AEQbTJ(objArr2, tArr, objArr2.length - this.EZpvd, 0, iCopydefault);
        }
        return (T[]) C56402yEa.AEQbTJ(size(), tArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[size()]);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        yDG.Companion.copydefault(i, i2, size());
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == size()) {
            clear();
            return;
        }
        if (i3 == 1) {
            remove(i);
            return;
        }
        AEQbTJ();
        if (i < size() - i2) {
            EZpvd(i, i2);
            int iCopydefault = copydefault(this.EZpvd + i3);
            AEQbTJ(this.EZpvd, iCopydefault);
            this.EZpvd = iCopydefault;
        } else {
            KWHzl(i, i2);
            int iCopydefault2 = copydefault(this.EZpvd + size());
            AEQbTJ(OLrzqt(iCopydefault2 - i3), iCopydefault2);
        }
        this.copydefault = size() - i3;
    }

    public final void EZpvd(int i, int i2) {
        int iCopydefault = copydefault(this.EZpvd + (i - 1));
        int iCopydefault2 = copydefault(this.EZpvd + (i2 - 1));
        while (i > 0) {
            int i3 = iCopydefault + 1;
            int iMin = java.lang.Math.min(i, java.lang.Math.min(i3, iCopydefault2 + 1));
            java.lang.Object[] objArr = this.OLrzqt;
            int i4 = iCopydefault2 - iMin;
            int i5 = iCopydefault - iMin;
            yDT.AEQbTJ(objArr, objArr, i4 + 1, i5 + 1, i3);
            iCopydefault = OLrzqt(i5);
            iCopydefault2 = OLrzqt(i4);
            i -= iMin;
        }
    }

    public final void KWHzl(int i, int i2) {
        int iCopydefault = copydefault(this.EZpvd + i2);
        int iCopydefault2 = copydefault(this.EZpvd + i);
        int size = size();
        while (true) {
            size -= i2;
            if (size <= 0) {
                return;
            }
            java.lang.Object[] objArr = this.OLrzqt;
            i2 = java.lang.Math.min(size, java.lang.Math.min(objArr.length - iCopydefault, objArr.length - iCopydefault2));
            java.lang.Object[] objArr2 = this.OLrzqt;
            int i3 = iCopydefault + i2;
            yDT.AEQbTJ(objArr2, objArr2, iCopydefault2, iCopydefault, i3);
            iCopydefault = copydefault(i3);
            iCopydefault2 = copydefault(iCopydefault2 + i2);
        }
    }

    public final void AEQbTJ(int i, int i2) {
        if (i < i2) {
            yDT.copydefault(this.OLrzqt, (java.lang.Object) null, i, i2);
            return;
        }
        java.lang.Object[] objArr = this.OLrzqt;
        yDT.copydefault(objArr, (java.lang.Object) null, i, objArr.length);
        yDT.copydefault(this.OLrzqt, (java.lang.Object) null, 0, i2);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yDQ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OLrzqt.length != 0) {
            int iCopydefault2 = copydefault(this.EZpvd + size());
            int i = this.EZpvd;
            if (i < iCopydefault2) {
                iCopydefault = i;
                while (i < iCopydefault2) {
                    java.lang.Object obj = this.OLrzqt[i];
                    if (!collection.contains(obj)) {
                        this.OLrzqt[iCopydefault] = obj;
                        iCopydefault++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                yDT.copydefault(this.OLrzqt, (java.lang.Object) null, iCopydefault, iCopydefault2);
            } else {
                int length = this.OLrzqt.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr = this.OLrzqt;
                    java.lang.Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.OLrzqt[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iCopydefault = copydefault(i2);
                for (int i3 = 0; i3 < iCopydefault2; i3++) {
                    java.lang.Object[] objArr2 = this.OLrzqt;
                    java.lang.Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.OLrzqt[iCopydefault] = obj3;
                        iCopydefault = EZpvd(iCopydefault);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                AEQbTJ();
                this.copydefault = OLrzqt(iCopydefault - this.EZpvd);
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(collection, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.OLrzqt.length != 0) {
            int iCopydefault2 = copydefault(this.EZpvd + size());
            int i = this.EZpvd;
            if (i < iCopydefault2) {
                iCopydefault = i;
                while (i < iCopydefault2) {
                    java.lang.Object obj = this.OLrzqt[i];
                    if (collection.contains(obj)) {
                        this.OLrzqt[iCopydefault] = obj;
                        iCopydefault++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                yDT.copydefault(this.OLrzqt, (java.lang.Object) null, iCopydefault, iCopydefault2);
            } else {
                int length = this.OLrzqt.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr = this.OLrzqt;
                    java.lang.Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.OLrzqt[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iCopydefault = copydefault(i2);
                for (int i3 = 0; i3 < iCopydefault2; i3++) {
                    java.lang.Object[] objArr2 = this.OLrzqt;
                    java.lang.Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.OLrzqt[iCopydefault] = obj3;
                        iCopydefault = EZpvd(iCopydefault);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                AEQbTJ();
                this.copydefault = OLrzqt(iCopydefault - this.EZpvd);
            }
        }
        return z;
    }
}
