package com.beloo.widget.chipslayoutmanager.cache;

import android.graphics.Rect;
import android.os.Parcelable;
import android.util.Pair;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes21.dex */
class ViewCacheStorage implements IViewCacheStorage {
    private static final int SIZE_MAX_CACHE = 1000;
    private static final String TAG = "ViewCacheStorage";
    private RecyclerView.LayoutManager layoutManager;
    private NavigableSet<Integer> startsRow = new TreeSet();
    private NavigableSet<Integer> endsRow = new TreeSet();
    private int maxCacheSize = 1000;
    private boolean isCachingEnabled = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public boolean isCachingEnabled() {
        return this.isCachingEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public void setCachingEnabled(boolean z) {
        if (this.isCachingEnabled == z) {
            return;
        }
        this.isCachingEnabled = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void setMaxCacheSize(int i) {
        this.maxCacheSize = i;
    }

    public ViewCacheStorage(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public int getStartOfRow(int i) {
        Integer numFloor = this.startsRow.floor(Integer.valueOf(i));
        if (numFloor == null) {
            numFloor = Integer.valueOf(i);
        }
        return numFloor.intValue();
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public boolean isPositionEndsRow(int i) {
        return this.endsRow.contains(Integer.valueOf(i));
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public boolean isPositionStartsRow(int i) {
        return this.startsRow.contains(Integer.valueOf(i));
    }

    private void checkCacheSizeReached() {
        if (this.startsRow.size() > this.maxCacheSize) {
            NavigableSet<Integer> navigableSet = this.startsRow;
            navigableSet.remove(navigableSet.first());
        }
        if (this.endsRow.size() > this.maxCacheSize) {
            NavigableSet<Integer> navigableSet2 = this.endsRow;
            navigableSet2.remove(navigableSet2.first());
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public void storeRow(List<Pair<Rect, View>> list) {
        if (!this.isCachingEnabled || list.isEmpty()) {
            return;
        }
        Pair<Rect, View> pair = list.get(0);
        Pair<Rect, View> pair2 = list.get(list.size() - 1);
        int position = this.layoutManager.getPosition((View) pair.second);
        int position2 = this.layoutManager.getPosition((View) pair2.second);
        checkCacheSizeReached();
        this.startsRow.add(Integer.valueOf(position));
        this.endsRow.add(Integer.valueOf(position2));
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public boolean isInCache(int i) {
        return (this.startsRow.ceiling(Integer.valueOf(i)) == null && this.endsRow.ceiling(Integer.valueOf(i)) == null) ? false : true;
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public void purge() {
        this.startsRow.clear();
        this.endsRow.clear();
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public void purgeCacheToPosition(int i) {
        if (isCacheEmpty()) {
            return;
        }
        Iterator<Integer> it = this.startsRow.headSet(Integer.valueOf(i)).iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        Iterator<Integer> it2 = this.endsRow.headSet(Integer.valueOf(i)).iterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public Integer getLastCachePosition() {
        if (isCacheEmpty()) {
            return null;
        }
        return this.endsRow.last();
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public boolean isCacheEmpty() {
        return this.endsRow.isEmpty();
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public void purgeCacheFromPosition(int i) {
        if (isCacheEmpty()) {
            return;
        }
        Iterator<Integer> it = this.startsRow.tailSet(Integer.valueOf(i), true).iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        Integer numLower = this.startsRow.lower(Integer.valueOf(i));
        if (numLower != null) {
            i = numLower.intValue();
        }
        Iterator<Integer> it2 = this.endsRow.tailSet(Integer.valueOf(i), true).iterator();
        while (it2.hasNext()) {
            it2.next();
            it2.remove();
        }
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public Parcelable onSaveInstanceState() {
        return new CacheParcelableContainer(this.startsRow, this.endsRow);
    }

    @Override // com.beloo.widget.chipslayoutmanager.cache.IViewCacheStorage
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (parcelable == null) {
            return;
        }
        if (!(parcelable instanceof CacheParcelableContainer)) {
            throw new IllegalStateException("wrong parcelable passed");
        }
        CacheParcelableContainer cacheParcelableContainer = (CacheParcelableContainer) parcelable;
        this.startsRow = cacheParcelableContainer.getStartsRow();
        this.endsRow = cacheParcelableContainer.getEndsRow();
    }
}
