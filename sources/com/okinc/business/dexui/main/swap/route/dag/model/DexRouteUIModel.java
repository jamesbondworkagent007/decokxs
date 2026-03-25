package com.okinc.business.dexui.main.swap.route.dag.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class DexRouteUIModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DexRouteUIModel> CREATOR = new Creator();
    private final List<DexEdgeItem> routerList;

    public static final class Creator implements Parcelable.Creator<DexRouteUIModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRouteUIModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DexEdgeItem.CREATOR.createFromParcel(parcel));
            }
            return new DexRouteUIModel(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexRouteUIModel[] newArray(int i) {
            return new DexRouteUIModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.route.dag.model.DexRouteUIModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DexRouteUIModel copy$default(DexRouteUIModel dexRouteUIModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = dexRouteUIModel.routerList;
        }
        return dexRouteUIModel.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexEdgeItem> component1() {
        return this.routerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexRouteUIModel copy(@NotNull List<DexEdgeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new DexRouteUIModel(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DexRouteUIModel) && Intrinsics.EZpvd(this.routerList, ((DexRouteUIModel) obj).routerList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexEdgeItem> getRouterList() {
        return this.routerList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.routerList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexRouteUIModel(routerList=" + this.routerList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<DexEdgeItem> list = this.routerList;
        parcel.writeInt(list.size());
        Iterator<DexEdgeItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public DexRouteUIModel(@NotNull List<DexEdgeItem> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.routerList = list;
    }
}
