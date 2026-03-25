package com.okinc.business.market.features.address_tracker_sa.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardContentUIModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LeaderBoardContentUIModel> CREATOR = new Creator();
    private final List<LeaderBoardCardUIModel> leaderBoardCardUIModel;
    private final int rankEnd;
    private final int rankStart;
    private final int totalCount;

    public static final class Creator implements Parcelable.Creator<LeaderBoardContentUIModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardContentUIModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 != i4; i5++) {
                arrayList.add(LeaderBoardCardUIModel.CREATOR.createFromParcel(parcel));
            }
            return new LeaderBoardContentUIModel(i, i2, i3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardContentUIModel[] newArray(int i) {
            return new LeaderBoardContentUIModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeaderBoardContentUIModel() {
        this(0, 0, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardContentUIModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LeaderBoardContentUIModel copy$default(LeaderBoardContentUIModel leaderBoardContentUIModel, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = leaderBoardContentUIModel.rankStart;
        }
        if ((i4 & 2) != 0) {
            i2 = leaderBoardContentUIModel.rankEnd;
        }
        if ((i4 & 4) != 0) {
            i3 = leaderBoardContentUIModel.totalCount;
        }
        if ((i4 & 8) != 0) {
            list = leaderBoardContentUIModel.leaderBoardCardUIModel;
        }
        return leaderBoardContentUIModel.copy(i, i2, i3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.rankStart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.rankEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LeaderBoardCardUIModel> component4() {
        return this.leaderBoardCardUIModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardContentUIModel copy(int i, int i2, int i3, @NotNull List<LeaderBoardCardUIModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new LeaderBoardContentUIModel(i, i2, i3, list);
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
        if (!(obj instanceof LeaderBoardContentUIModel)) {
            return false;
        }
        LeaderBoardContentUIModel leaderBoardContentUIModel = (LeaderBoardContentUIModel) obj;
        return this.rankStart == leaderBoardContentUIModel.rankStart && this.rankEnd == leaderBoardContentUIModel.rankEnd && this.totalCount == leaderBoardContentUIModel.totalCount && Intrinsics.EZpvd(this.leaderBoardCardUIModel, leaderBoardContentUIModel.leaderBoardCardUIModel);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<LeaderBoardCardUIModel> getLeaderBoardCardUIModel() {
        return this.leaderBoardCardUIModel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRankEnd() {
        return this.rankEnd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRankStart() {
        return this.rankStart;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTotalCount() {
        return this.totalCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.rankStart) * 31) + Integer.hashCode(this.rankEnd)) * 31) + Integer.hashCode(this.totalCount)) * 31) + this.leaderBoardCardUIModel.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeaderBoardContentUIModel(rankStart=" + this.rankStart + ", rankEnd=" + this.rankEnd + ", totalCount=" + this.totalCount + ", leaderBoardCardUIModel=" + this.leaderBoardCardUIModel + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.rankStart);
        parcel.writeInt(this.rankEnd);
        parcel.writeInt(this.totalCount);
        List<LeaderBoardCardUIModel> list = this.leaderBoardCardUIModel;
        parcel.writeInt(list.size());
        Iterator<LeaderBoardCardUIModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public LeaderBoardContentUIModel(int i, int i2, int i3, @NotNull List<LeaderBoardCardUIModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.rankStart = i;
        this.rankEnd = i2;
        this.totalCount = i3;
        this.leaderBoardCardUIModel = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r5v0 java.util.List))
 A[MD:(int, int, int, java.util.List<com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardCardUIModel>):void (m)] (LINE:10) call: com.okinc.business.market.features.address_tracker_sa.ui.model.LeaderBoardContentUIModel.<init>(int, int, int, java.util.List):void type: THIS */
    public /* synthetic */ LeaderBoardContentUIModel(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? yDY.AhwBna() : list);
    }
}
