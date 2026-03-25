package com.okinc.websocket.bean;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class ComparableArrayList extends ArrayList<String> implements Comparable<Double> {
    public static final int $stable = 0;

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(Double d) {
        return compareTo(d.doubleValue());
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return contains((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(String str) {
        return super.contains((Object) str);
    }

    public int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return indexOf((String) obj);
        }
        return -1;
    }

    public /* bridge */ int indexOf(String str) {
        return super.indexOf((Object) str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return lastIndexOf((String) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(String str) {
        return super.lastIndexOf((Object) str);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final String remove(int i) {
        return removeAt(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return false;
    }

    public /* bridge */ boolean remove(String str) {
        return super.remove((Object) str);
    }

    public String removeAt(int i) {
        return (String) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }

    public int compareTo(double d) {
        try {
            String str = get(0);
            Intrinsics.checkNotNullExpressionValue(str, "");
            return Double.compare(Double.parseDouble(str), d);
        } catch (Exception unused) {
            return 0;
        }
    }
}
