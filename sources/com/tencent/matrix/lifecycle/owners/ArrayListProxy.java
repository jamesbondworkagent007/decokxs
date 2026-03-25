package com.tencent.matrix.lifecycle.owners;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import o.C58013ytK;

/* JADX INFO: loaded from: classes12.dex */
public class ArrayListProxy<T> extends ArrayList<T> {
    private static final String TAG = "Matrix.ArrayListProxy";
    private final Activity mListener;
    private final ArrayList<T> mOrigin;

    public interface Activity {
        void EZpvd(Object obj);

        void KWHzl(Object obj);
    }

    public ArrayListProxy(ArrayList<T> arrayList, Activity activity) {
        this.mOrigin = arrayList;
        this.mListener = activity;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.mOrigin.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.mOrigin.isEmpty();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(@Nullable Object obj) {
        return this.mOrigin.contains(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return this.mOrigin.iterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.mOrigin.toArray();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T1> T1[] toArray(@NonNull T1[] t1Arr) {
        return (T1[]) this.mOrigin.toArray(t1Arr);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(T t) {
        boolean zAdd = this.mOrigin.add(t);
        try {
            this.mListener.KWHzl(t);
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th, "", new Object[0]);
        }
        return zAdd;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(@Nullable Object obj) {
        boolean zRemove = this.mOrigin.remove(obj);
        try {
            this.mListener.EZpvd(obj);
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th, "", new Object[0]);
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.mOrigin.containsAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NonNull Collection<? extends T> collection) {
        boolean zAddAll = this.mOrigin.addAll(collection);
        try {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                this.mListener.KWHzl(it.next());
            }
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th, "", new Object[0]);
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NonNull Collection<? extends T> collection) {
        boolean zAddAll = this.mOrigin.addAll(i, collection);
        try {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                this.mListener.KWHzl(it.next());
            }
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th, "", new Object[0]);
        }
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NonNull Collection<?> collection) {
        boolean zRemoveAll = this.mOrigin.removeAll(collection);
        try {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                this.mListener.EZpvd(it.next());
            }
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th, "", new Object[0]);
        }
        return zRemoveAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NonNull Collection<?> collection) {
        return this.mOrigin.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.mOrigin.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.mOrigin.get(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        return this.mOrigin.set(i, t);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        this.mOrigin.add(i, t);
        try {
            this.mListener.KWHzl(t);
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th, "", new Object[0]);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T remove(int i) {
        T tRemove = this.mOrigin.remove(i);
        try {
            this.mListener.EZpvd(tRemove);
        } catch (Throwable th) {
            C58013ytK.OLrzqt(TAG, th, "", new Object[0]);
        }
        return tRemove;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int indexOf(@Nullable Object obj) {
        return this.mOrigin.indexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public int lastIndexOf(@Nullable Object obj) {
        return this.mOrigin.lastIndexOf(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator() {
        return this.mOrigin.listIterator();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public ListIterator<T> listIterator(int i) {
        return this.mOrigin.listIterator(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public List<T> subList(int i, int i2) {
        return this.mOrigin.subList(i, i2);
    }
}
