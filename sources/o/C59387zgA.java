package o;

import com.bytedance.applog.encryptor.IEncryptorType;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59387zgA<E> extends java.util.AbstractList<E> implements java.util.RandomAccess {
    public java.lang.Object AEQbTJ;
    public int KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ void AEQbTJ(int i) {
        java.lang.String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = IEncryptorType.DEFAULT_ENCRYPTOR;
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.AEQbTJ = null;
        this.KWHzl = 0;
        ((java.util.AbstractList) this).modCount++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.KWHzl;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.KWHzl)) {
            return i2 == 1 ? (E) this.AEQbTJ : (E) ((java.lang.Object[]) this.AEQbTJ)[i];
        }
        throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.KWHzl);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
        int i = this.KWHzl;
        if (i == 0) {
            this.AEQbTJ = e;
        } else if (i == 1) {
            this.AEQbTJ = new java.lang.Object[]{this.AEQbTJ, e};
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.AEQbTJ;
            int length = objArr.length;
            if (i >= length) {
                int i2 = ((length * 3) / 2) + 1;
                int i3 = i + 1;
                if (i2 < i3) {
                    i2 = i3;
                }
                java.lang.Object[] objArr2 = new java.lang.Object[i2];
                this.AEQbTJ = objArr2;
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.KWHzl] = e;
        }
        this.KWHzl++;
        ((java.util.AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        if (i < 0 || i > (i2 = this.KWHzl)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.KWHzl);
        }
        if (i2 == 0) {
            this.AEQbTJ = e;
        } else if (i2 == 1 && i == 0) {
            this.AEQbTJ = new java.lang.Object[]{e, this.AEQbTJ};
        } else {
            java.lang.Object[] objArr = new java.lang.Object[i2 + 1];
            if (i2 == 1) {
                objArr[0] = this.AEQbTJ;
            } else {
                java.lang.Object[] objArr2 = (java.lang.Object[]) this.AEQbTJ;
                java.lang.System.arraycopy(objArr2, 0, objArr, 0, i);
                java.lang.System.arraycopy(objArr2, i, objArr, i + 1, this.KWHzl - i);
            }
            objArr[i] = e;
            this.AEQbTJ = objArr;
        }
        this.KWHzl++;
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        int i2;
        if (i < 0 || i >= (i2 = this.KWHzl)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.KWHzl);
        }
        if (i2 == 1) {
            E e2 = (E) this.AEQbTJ;
            this.AEQbTJ = e;
            return e2;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) this.AEQbTJ;
        E e3 = (E) objArr[i];
        objArr[i] = e;
        return e3;
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        E e;
        if (i < 0 || i >= (i2 = this.KWHzl)) {
            throw new java.lang.IndexOutOfBoundsException("Index: " + i + ", Size: " + this.KWHzl);
        }
        if (i2 == 1) {
            e = (E) this.AEQbTJ;
            this.AEQbTJ = null;
        } else {
            java.lang.Object[] objArr = (java.lang.Object[]) this.AEQbTJ;
            java.lang.Object obj = objArr[i];
            if (i2 == 2) {
                this.AEQbTJ = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    java.lang.System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.KWHzl - 1] = null;
            }
            e = (E) obj;
        }
        this.KWHzl--;
        ((java.util.AbstractList) this).modCount++;
        return e;
    }

    /* JADX INFO: renamed from: o.zgA$TaskDescription */
    public static class TaskDescription<T> implements java.util.Iterator<T> {
        public static final TaskDescription copydefault = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static <T> TaskDescription<T> AEQbTJ() {
            return copydefault;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        private TaskDescription() {
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.IllegalStateException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<E> iterator() {
        int i = this.KWHzl;
        if (i == 0) {
            TaskDescription taskDescriptionAEQbTJ = TaskDescription.AEQbTJ();
            if (taskDescriptionAEQbTJ == null) {
                AEQbTJ(2);
            }
            return taskDescriptionAEQbTJ;
        }
        if (i == 1) {
            return new StateListAnimator();
        }
        java.util.Iterator<E> it = super.iterator();
        if (it == null) {
            AEQbTJ(3);
        }
        return it;
    }

    /* JADX INFO: renamed from: o.zgA$Activity */
    public static abstract class Activity<T> implements java.util.Iterator<T> {
        public boolean EZpvd;

        public abstract T EZpvd();

        public abstract void copydefault();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public final boolean hasNext() {
            return !this.EZpvd;
        }

        private Activity() {
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.EZpvd) {
                throw new NoSuchElementException();
            }
            this.EZpvd = true;
            copydefault();
            return EZpvd();
        }
    }

    /* JADX INFO: renamed from: o.zgA$StateListAnimator */
    public class StateListAnimator extends Activity<E> {
        public final int KWHzl;

        public StateListAnimator() {
            super();
            this.KWHzl = ((java.util.AbstractList) C59387zgA.this).modCount;
        }

        @Override // o.C59387zgA.Activity
        public E EZpvd() {
            return (E) C59387zgA.this.AEQbTJ;
        }

        @Override // o.C59387zgA.Activity
        public void copydefault() {
            if (((java.util.AbstractList) C59387zgA.this).modCount == this.KWHzl) {
                return;
            }
            throw new ConcurrentModificationException("ModCount: " + ((java.util.AbstractList) C59387zgA.this).modCount + "; expected: " + this.KWHzl);
        }

        @Override // java.util.Iterator
        public void remove() {
            copydefault();
            C59387zgA.this.clear();
        }
    }

    @Override // java.util.List
    public void sort(java.util.Comparator<? super E> comparator) {
        int i = this.KWHzl;
        if (i >= 2) {
            java.util.Arrays.sort((java.lang.Object[]) this.AEQbTJ, 0, i, comparator);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(@NotNull T[] tArr) {
        if (tArr == 0) {
            AEQbTJ(4);
        }
        int length = tArr.length;
        int i = this.KWHzl;
        if (i == 1) {
            if (length != 0) {
                tArr[0] = this.AEQbTJ;
            } else {
                T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), 1));
                tArr2[0] = this.AEQbTJ;
                return tArr2;
            }
        } else {
            if (length < i) {
                T[] tArr3 = (T[]) java.util.Arrays.copyOf((java.lang.Object[]) this.AEQbTJ, i, tArr.getClass());
                if (tArr3 == null) {
                    AEQbTJ(6);
                }
                return tArr3;
            }
            if (i != 0) {
                java.lang.System.arraycopy(this.AEQbTJ, 0, tArr, 0, i);
            }
        }
        int i2 = this.KWHzl;
        if (length > i2) {
            tArr[i2] = 0;
        }
        return tArr;
    }
}
