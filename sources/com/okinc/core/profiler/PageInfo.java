package com.okinc.core.profiler;

import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C33129mqd;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PageInfo extends ArrayList<Integer> implements Cloneable, Comparable<PageInfo> {
    public static final int $stable = 8;
    private float averageTime;
    private String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PageInfo copy$default(PageInfo pageInfo, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pageInfo.name;
        }
        return pageInfo.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PageInfo copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PageInfo(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PageInfo) && Intrinsics.EZpvd((Object) this.name, (Object) ((PageInfo) obj).name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getAverageTime() {
        return this.averageTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.name.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.AbstractCollection
    public String toString() {
        return "PageInfo(name=" + this.name + ")";
    }

    public PageInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public /* synthetic */ void add(int i, Object obj) {
        add(i, ((Number) obj).intValue());
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* synthetic */ boolean add(Object obj) {
        return add(((Number) obj).intValue());
    }

    public /* bridge */ boolean contains(Integer num) {
        return super.contains((Object) num);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Integer) {
            return contains((Integer) obj);
        }
        return false;
    }

    public int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(Integer num) {
        return super.indexOf((Object) num);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Integer) {
            return indexOf((Integer) obj);
        }
        return -1;
    }

    public /* bridge */ int lastIndexOf(Integer num) {
        return super.lastIndexOf((Object) num);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            return lastIndexOf((Integer) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Integer remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(Integer num) {
        return super.remove((Object) num);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof Integer)) {
            return remove((Integer) obj);
        }
        return false;
    }

    public Integer removeAt(int i) {
        return (Integer) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return getSize();
    }

    public final String getSimpleName() {
        String str = this.name;
        String strSubstring = str.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, JwtUtilsKt.JWT_DELIMITER, 0, false, 6, (Object) null), this.name.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public boolean add(int i) {
        boolean zAdd = super.add(Integer.valueOf(i));
        this.averageTime = averageTime();
        return zAdd;
    }

    public void add(int i, int i2) {
        super.add(i, Integer.valueOf(i2));
        this.averageTime = averageTime();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        boolean zAddAll = super.addAll(collection);
        this.averageTime = averageTime();
        return zAddAll;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, @NotNull Collection<? extends Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        boolean zAddAll = super.addAll(i, collection);
        this.averageTime = averageTime();
        return zAddAll;
    }

    @Override // java.util.ArrayList
    public Object clone() {
        Object objClone = super.clone();
        Intrinsics.copydefault(objClone, "");
        PageInfo pageInfo = (PageInfo) objClone;
        pageInfo.name = this.name;
        return pageInfo;
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    public int compareTo(@NotNull PageInfo pageInfo) {
        Intrinsics.checkNotNullParameter(pageInfo, "");
        if (getAverageTime() == pageInfo.getAverageTime()) {
            return 0;
        }
        return getAverageTime() - pageInfo.getAverageTime() > 0.0f ? -1 : 1;
    }

    private final float averageTime() {
        Iterator<Integer> it = iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return C33129mqd.djBIcL(Integer.valueOf(iIntValue)) / size();
    }
}
