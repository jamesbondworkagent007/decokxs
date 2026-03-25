package com.okinc.business.market.features.smart_money.ranking.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.RankingSortType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RankingSortModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RankingSortModel> CREATOR = new Creator();
    private final String filterId;
    private final String filterLabel;
    private final boolean isSelected;
    private final RankingSortType type;

    public static final class Creator implements Parcelable.Creator<RankingSortModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RankingSortModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RankingSortModel(parcel.readString(), parcel.readString(), parcel.readInt() != 0, RankingSortType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RankingSortModel[] newArray(int i) {
            return new RankingSortModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RankingSortModel() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RankingSortModel copy$default(RankingSortModel rankingSortModel, String str, String str2, boolean z, RankingSortType rankingSortType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rankingSortModel.filterId;
        }
        if ((i & 2) != 0) {
            str2 = rankingSortModel.filterLabel;
        }
        if ((i & 4) != 0) {
            z = rankingSortModel.isSelected;
        }
        if ((i & 8) != 0) {
            rankingSortType = rankingSortModel.type;
        }
        return rankingSortModel.copy(str, str2, z, rankingSortType);
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
    public final boolean component3() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingSortType component4() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RankingSortModel copy(@NotNull String str, @NotNull String str2, boolean z, @NotNull RankingSortType rankingSortType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(rankingSortType, "");
        return new RankingSortModel(str, str2, z, rankingSortType);
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
        if (!(obj instanceof RankingSortModel)) {
            return false;
        }
        RankingSortModel rankingSortModel = (RankingSortModel) obj;
        return Intrinsics.EZpvd((Object) this.filterId, (Object) rankingSortModel.filterId) && Intrinsics.EZpvd((Object) this.filterLabel, (Object) rankingSortModel.filterLabel) && this.isSelected == rankingSortModel.isSelected && this.type == rankingSortModel.type;
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
    public final RankingSortType getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.filterId.hashCode() * 31) + this.filterLabel.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RankingSortModel(filterId=" + this.filterId + ", filterLabel=" + this.filterLabel + ", isSelected=" + this.isSelected + ", type=" + this.type + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.filterId);
        parcel.writeString(this.filterLabel);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.type.name());
    }

    public RankingSortModel(@NotNull String str, @NotNull String str2, boolean z, @NotNull RankingSortType rankingSortType) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(rankingSortType, "");
        this.filterId = str;
        this.filterLabel = str2;
        this.isSelected = z;
        this.type = rankingSortType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
  (wrap:com.okinc.business.market.common.constants.RankingSortType:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.common.constants.RankingSortType:0x0015: SGET  A[WRAPPED] (LINE:14) com.okinc.business.market.common.constants.RankingSortType.CATEGORY com.okinc.business.market.common.constants.RankingSortType) : (r5v0 com.okinc.business.market.common.constants.RankingSortType))
 A[MD:(java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingSortType):void (m)] (LINE:10) call: com.okinc.business.market.features.smart_money.ranking.ui.model.RankingSortModel.<init>(java.lang.String, java.lang.String, boolean, com.okinc.business.market.common.constants.RankingSortType):void type: THIS */
    public /* synthetic */ RankingSortModel(String str, String str2, boolean z, RankingSortType rankingSortType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? RankingSortType.CATEGORY : rankingSortType);
    }
}
