package com.beloo.widget.chipslayoutmanager.cache;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedList;
import java.util.NavigableSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes21.dex */
public final class CacheParcelableContainer implements Parcelable {
    public static final Parcelable.Creator<CacheParcelableContainer> CREATOR = new Parcelable.Creator<CacheParcelableContainer>() { // from class: com.beloo.widget.chipslayoutmanager.cache.CacheParcelableContainer.1
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CacheParcelableContainer createFromParcel(Parcel parcel) {
            return new CacheParcelableContainer(parcel);
        }

        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CacheParcelableContainer[] newArray(int i) {
            return new CacheParcelableContainer[i];
        }
    };
    private NavigableSet<Integer> endsRow;
    private NavigableSet<Integer> startsRow;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NavigableSet<Integer> getEndsRow() {
        return this.endsRow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NavigableSet<Integer> getStartsRow() {
        return this.startsRow;
    }

    public CacheParcelableContainer(NavigableSet<Integer> navigableSet, NavigableSet<Integer> navigableSet2) {
        this.startsRow = new TreeSet();
        new TreeSet();
        this.startsRow = navigableSet;
        this.endsRow = navigableSet2;
    }

    private CacheParcelableContainer(Parcel parcel) {
        this.startsRow = new TreeSet();
        this.endsRow = new TreeSet();
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        parcel.readList(linkedList, Integer.class.getClassLoader());
        parcel.readList(linkedList2, Integer.class.getClassLoader());
        this.startsRow = new TreeSet(linkedList);
        this.endsRow = new TreeSet(linkedList2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        LinkedList linkedList = new LinkedList(this.startsRow);
        LinkedList linkedList2 = new LinkedList(this.endsRow);
        parcel.writeList(linkedList);
        parcel.writeList(linkedList2);
    }
}
