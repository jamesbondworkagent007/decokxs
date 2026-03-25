package o;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59388zgB<T> extends yDM<T> {
    public static final Activity AEQbTJ = new Activity(null);
    public int EZpvd;
    public java.lang.Object copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zgB.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C59388zgB(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final <T> C59388zgB<T> copydefault() {
        return AEQbTJ.OLrzqt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd(int i) {
        this.EZpvd = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yDM
    public int getSize() {
        return this.EZpvd;
    }

    /* JADX INFO: renamed from: o.zgB$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zgB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final <T> C59388zgB<T> OLrzqt() {
            return new C59388zgB<>(null);
        }

        public final <T> C59388zgB<T> copydefault(@NotNull java.util.Collection<? extends T> collection) {
            Intrinsics.checkNotNullParameter(collection, "");
            C59388zgB<T> c59388zgB = new C59388zgB<>(null);
            c59388zgB.addAll(collection);
            return c59388zgB;
        }
    }

    private C59388zgB() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<T> iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new TaskDescription(this.copydefault);
        }
        if (size() < 5) {
            java.lang.Object obj = this.copydefault;
            Intrinsics.copydefault(obj, "");
            return new ActionBar((java.lang.Object[]) obj);
        }
        java.lang.Object obj2 = this.copydefault;
        Intrinsics.copydefault(obj2, "");
        return C56532yIw.valueOf(obj2).iterator();
    }

    @Override // o.yDM, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(T t) {
        java.lang.Object obj;
        if (size() == 0) {
            this.copydefault = t;
        } else if (size() == 1) {
            if (Intrinsics.EZpvd(this.copydefault, t)) {
                return false;
            }
            this.copydefault = new java.lang.Object[]{this.copydefault, t};
        } else if (size() < 5) {
            java.lang.Object obj2 = this.copydefault;
            Intrinsics.copydefault(obj2, "");
            java.lang.Object[] objArr = (java.lang.Object[]) obj2;
            if (yDV.valueOf(objArr, t)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetValueOf = yEE.valueOf(java.util.Arrays.copyOf(objArr, objArr.length));
                linkedHashSetValueOf.add(t);
                obj = linkedHashSetValueOf;
            } else {
                java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(objArr, size() + 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                objArrCopyOf[objArrCopyOf.length - 1] = t;
                obj = objArrCopyOf;
            }
            this.copydefault = obj;
        } else {
            java.lang.Object obj3 = this.copydefault;
            Intrinsics.copydefault(obj3, "");
            if (!C56532yIw.valueOf(obj3).add(t)) {
                return false;
            }
        }
        EZpvd(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.copydefault = null;
        EZpvd(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.EZpvd(this.copydefault, obj);
        }
        if (size() < 5) {
            java.lang.Object obj2 = this.copydefault;
            Intrinsics.copydefault(obj2, "");
            return yDV.valueOf((java.lang.Object[]) obj2, obj);
        }
        java.lang.Object obj3 = this.copydefault;
        Intrinsics.copydefault(obj3, "");
        return ((java.util.Set) obj3).contains(obj);
    }

    /* JADX INFO: renamed from: o.zgB$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Iterator<T>, yIB {
        public final T AEQbTJ;
        public boolean OLrzqt = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt;
        }

        public TaskDescription(T t) {
            this.AEQbTJ = t;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.OLrzqt) {
                throw new NoSuchElementException();
            }
            this.OLrzqt = false;
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Method merged with bridge method: remove()V */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public java.lang.Void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: o.zgB$ActionBar */
    public static final class ActionBar<T> implements java.util.Iterator<T>, yIB {
        public final java.util.Iterator<T> AEQbTJ;

        public ActionBar(@NotNull T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "");
            this.AEQbTJ = yHX.EZpvd(tArr);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.AEQbTJ.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.AEQbTJ.next();
        }

        /* JADX DEBUG: Method merged with bridge method: remove()V */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public java.lang.Void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
}
