package com.okinc.business.dexlogic.liquiditypools.network;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class LiquidityPoolChangeHistoryModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LiquidityPoolChangeHistoryModel> CREATOR = new Creator();
    private final List<ChangeVO> changeVOList;

    public static final class Creator implements Parcelable.Creator<LiquidityPoolChangeHistoryModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPoolChangeHistoryModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ChangeVO.CREATOR.createFromParcel(parcel));
            }
            return new LiquidityPoolChangeHistoryModel(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityPoolChangeHistoryModel[] newArray(int i) {
            return new LiquidityPoolChangeHistoryModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexlogic.liquiditypools.network.LiquidityPoolChangeHistoryModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiquidityPoolChangeHistoryModel copy$default(LiquidityPoolChangeHistoryModel liquidityPoolChangeHistoryModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liquidityPoolChangeHistoryModel.changeVOList;
        }
        return liquidityPoolChangeHistoryModel.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChangeVO> component1() {
        return this.changeVOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityPoolChangeHistoryModel copy(@NotNull List<ChangeVO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new LiquidityPoolChangeHistoryModel(list);
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
        return (obj instanceof LiquidityPoolChangeHistoryModel) && Intrinsics.EZpvd(this.changeVOList, ((LiquidityPoolChangeHistoryModel) obj).changeVOList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChangeVO> getChangeVOList() {
        return this.changeVOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.changeVOList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityPoolChangeHistoryModel(changeVOList=" + this.changeVOList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ChangeVO> list = this.changeVOList;
        parcel.writeInt(list.size());
        Iterator<ChangeVO> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public LiquidityPoolChangeHistoryModel(@NotNull List<ChangeVO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.changeVOList = list;
    }
}
