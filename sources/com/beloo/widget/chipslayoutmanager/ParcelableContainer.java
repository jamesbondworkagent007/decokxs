package com.beloo.widget.chipslayoutmanager;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.beloo.widget.chipslayoutmanager.anchor.AnchorViewState;
import com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer;

/* JADX INFO: loaded from: classes21.dex */
class ParcelableContainer implements Parcelable {
    public static final Parcelable.Creator<ParcelableContainer> CREATOR = new Parcelable.Creator<ParcelableContainer>() { // from class: com.beloo.widget.chipslayoutmanager.ParcelableContainer.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableContainer createFromParcel(Parcel parcel) {
            return new ParcelableContainer(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ParcelableContainer[] newArray(int i) {
            return new ParcelableContainer[i];
        }
    };
    private AnchorViewState anchorViewState;
    private SparseArray<Object> cacheNormalizationPositionMap;
    private int orientation;
    private SparseArray<Object> orientationCacheMap;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AnchorViewState getAnchorViewState() {
        return this.anchorViewState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int getOrientation() {
        return this.orientation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void putAnchorViewState(AnchorViewState anchorViewState) {
        this.anchorViewState = anchorViewState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void putOrientation(int i) {
        this.orientation = i;
    }

    public ParcelableContainer() {
        this.orientationCacheMap = new SparseArray<>();
        SparseArray<Object> sparseArray = new SparseArray<>();
        this.cacheNormalizationPositionMap = sparseArray;
        sparseArray.put(1, 0);
        this.cacheNormalizationPositionMap.put(2, 0);
    }

    private ParcelableContainer(Parcel parcel) {
        this.orientationCacheMap = new SparseArray<>();
        this.cacheNormalizationPositionMap = new SparseArray<>();
        this.anchorViewState = AnchorViewState.CREATOR.createFromParcel(parcel);
        this.orientationCacheMap = parcel.readSparseArray(CacheParcelableContainer.class.getClassLoader());
        this.cacheNormalizationPositionMap = parcel.readSparseArray(Integer.class.getClassLoader());
        this.orientation = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.anchorViewState.writeToParcel(parcel, i);
        parcel.writeSparseArray(this.orientationCacheMap);
        parcel.writeSparseArray(this.cacheNormalizationPositionMap);
        parcel.writeInt(this.orientation);
    }

    public void putPositionsCache(int i, Parcelable parcelable) {
        this.orientationCacheMap.put(i, parcelable);
    }

    public void putNormalizationPosition(int i, @Nullable Integer num) {
        this.cacheNormalizationPositionMap.put(i, num);
    }

    public Parcelable getPositionsCache(int i) {
        return (Parcelable) this.orientationCacheMap.get(i);
    }

    public Integer getNormalizationPosition(int i) {
        return (Integer) this.cacheNormalizationPositionMap.get(i);
    }
}
