package com.okinc.coroutine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import o.C43296rmc;

/* JADX INFO: loaded from: classes23.dex */
public final class CoroutineScopeComposite extends ArrayList<Job> {
    public static final int $stable = 0;

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Job) {
            return contains((Job) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(Job job) {
        return super.contains((Object) job);
    }

    public int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Job) {
            return indexOf((Job) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(Job job) {
        return super.indexOf((Object) job);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Job) {
            return lastIndexOf((Job) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(Job job) {
        return super.lastIndexOf((Object) job);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Job remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Job) {
            return remove((Job) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(Job job) {
        return super.remove((Object) job);
    }

    public Job removeAt(int i) {
        return (Job) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        try {
            Iterator<Job> it = iterator();
            while (it.hasNext()) {
                Job.DefaultImpls.cancel$default(it.next(), (CancellationException) null, 1, (Object) null);
            }
        } catch (Exception e) {
            C43296rmc.KWHzl("CoroutineScopeComposite", C43296rmc.copydefault(e));
        }
        super.clear();
    }
}
