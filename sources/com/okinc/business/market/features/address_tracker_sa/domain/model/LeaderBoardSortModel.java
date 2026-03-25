package com.okinc.business.market.features.address_tracker_sa.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.RankingSortType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LeaderBoardSortModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<LeaderBoardSortModel> CREATOR = new Creator();
    private final String filterId;
    private final String filterLabel;
    private final boolean isSelected;
    private final String labelAliasName;
    private final RankingSortType type;

    public static final class Creator implements Parcelable.Creator<LeaderBoardSortModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardSortModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LeaderBoardSortModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, RankingSortType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LeaderBoardSortModel[] newArray(int i) {
            return new LeaderBoardSortModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LeaderBoardSortModel() {
        this(null, null, null, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LeaderBoardSortModel copy$default(LeaderBoardSortModel leaderBoardSortModel, String str, String str2, String str3, boolean z, RankingSortType rankingSortType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = leaderBoardSortModel.filterId;
        }
        if ((i & 2) != 0) {
            str2 = leaderBoardSortModel.filterLabel;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = leaderBoardSortModel.labelAliasName;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = leaderBoardSortModel.isSelected;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            rankingSortType = leaderBoardSortModel.type;
        }
        return leaderBoardSortModel.copy(str, str4, str5, z2, rankingSortType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.filterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.filterLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.labelAliasName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingSortType component5() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeaderBoardSortModel copy(@NotNull String str, @NotNull String str2, String str3, boolean z, @NotNull RankingSortType rankingSortType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(rankingSortType, "");
        return new LeaderBoardSortModel(str, str2, str3, z, rankingSortType);
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
        if (!(obj instanceof LeaderBoardSortModel)) {
            return false;
        }
        LeaderBoardSortModel leaderBoardSortModel = (LeaderBoardSortModel) obj;
        return Intrinsics.EZpvd((Object) this.filterId, (Object) leaderBoardSortModel.filterId) && Intrinsics.EZpvd((Object) this.filterLabel, (Object) leaderBoardSortModel.filterLabel) && Intrinsics.EZpvd((Object) this.labelAliasName, (Object) leaderBoardSortModel.labelAliasName) && this.isSelected == leaderBoardSortModel.isSelected && this.type == leaderBoardSortModel.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterId() {
        return this.filterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterLabel() {
        return this.filterLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLabelAliasName() {
        return this.labelAliasName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingSortType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.filterId.hashCode();
        int iHashCode2 = this.filterLabel.hashCode();
        String str = this.labelAliasName;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LeaderBoardSortModel(filterId=" + this.filterId + ", filterLabel=" + this.filterLabel + ", labelAliasName=" + this.labelAliasName + ", isSelected=" + this.isSelected + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.filterId);
        parcel.writeString(this.filterLabel);
        parcel.writeString(this.labelAliasName);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.type.name());
    }

    public LeaderBoardSortModel(@NotNull String str, @NotNull String str2, String str3, boolean z, @NotNull RankingSortType rankingSortType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(rankingSortType, "");
        this.filterId = str;
        this.filterLabel = str2;
        this.labelAliasName = str3;
        this.isSelected = z;
        this.type = rankingSortType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) == (0 int)) ? (r5v0 java.lang.String) : (""))
  (wrap:java.lang.String:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:boolean:0x001a: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:com.okinc.business.market.common.constants.RankingSortType:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.RankingSortType:0x001f: SGET  A[WRAPPED] (LINE:15) com.okinc.business.market.common.constants.RankingSortType.CATEGORY com.okinc.business.market.common.constants.RankingSortType) : (r8v0 com.okinc.business.market.common.constants.RankingSortType))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingSortType):void (m)] (LINE:10) call: com.okinc.business.market.features.address_tracker_sa.domain.model.LeaderBoardSortModel.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingSortType):void type: THIS */
    public /* synthetic */ LeaderBoardSortModel(String str, String str2, String str3, boolean z, RankingSortType rankingSortType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) == 0 ? str2 : "", (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? RankingSortType.CATEGORY : rankingSortType);
    }
}
