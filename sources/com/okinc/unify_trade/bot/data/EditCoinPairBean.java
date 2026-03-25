package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class EditCoinPairBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditCoinPairBean> CREATOR = new Creator();
    private final List<String> addInstIds;
    private final TacticsData data;
    private final List<String> deleteInstIds;
    private final List<String> selectedInstIds;

    public static final class Creator implements Parcelable.Creator<EditCoinPairBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCoinPairBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EditCoinPairBean(parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : TacticsData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditCoinPairBean[] newArray(int i) {
            return new EditCoinPairBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EditCoinPairBean() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.data.EditCoinPairBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditCoinPairBean copy$default(EditCoinPairBean editCoinPairBean, List list, List list2, List list3, TacticsData tacticsData, int i, Object obj) {
        if ((i & 1) != 0) {
            list = editCoinPairBean.selectedInstIds;
        }
        if ((i & 2) != 0) {
            list2 = editCoinPairBean.addInstIds;
        }
        if ((i & 4) != 0) {
            list3 = editCoinPairBean.deleteInstIds;
        }
        if ((i & 8) != 0) {
            tacticsData = editCoinPairBean.data;
        }
        return editCoinPairBean.copy(list, list2, list3, tacticsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component1() {
        return this.selectedInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component2() {
        return this.addInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.deleteInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData component4() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditCoinPairBean copy(List<String> list, List<String> list2, List<String> list3, TacticsData tacticsData) {
        return new EditCoinPairBean(list, list2, list3, tacticsData);
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
        if (!(obj instanceof EditCoinPairBean)) {
            return false;
        }
        EditCoinPairBean editCoinPairBean = (EditCoinPairBean) obj;
        return Intrinsics.EZpvd(this.selectedInstIds, editCoinPairBean.selectedInstIds) && Intrinsics.EZpvd(this.addInstIds, editCoinPairBean.addInstIds) && Intrinsics.EZpvd(this.deleteInstIds, editCoinPairBean.deleteInstIds) && Intrinsics.EZpvd(this.data, editCoinPairBean.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAddInstIds() {
        return this.addInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getDeleteInstIds() {
        return this.deleteInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSelectedInstIds() {
        return this.selectedInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<String> list = this.selectedInstIds;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<String> list2 = this.addInstIds;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.deleteInstIds;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        TacticsData tacticsData = this.data;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (tacticsData != null ? tacticsData.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditCoinPairBean(selectedInstIds=" + this.selectedInstIds + ", addInstIds=" + this.addInstIds + ", deleteInstIds=" + this.deleteInstIds + ", data=" + this.data + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.selectedInstIds);
        parcel.writeStringList(this.addInstIds);
        parcel.writeStringList(this.deleteInstIds);
        TacticsData tacticsData = this.data;
        if (tacticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsData.writeToParcel(parcel, i);
        }
    }

    public EditCoinPairBean(List<String> list, List<String> list2, List<String> list3, TacticsData tacticsData) {
        this.selectedInstIds = list;
        this.addInstIds = list2;
        this.deleteInstIds = list3;
        this.data = tacticsData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:com.okinc.unify_trade.bot.data.TacticsData:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.data.TacticsData) : (r5v0 com.okinc.unify_trade.bot.data.TacticsData))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, com.okinc.unify_trade.bot.data.TacticsData):void (m)] (LINE:744) call: com.okinc.unify_trade.bot.data.EditCoinPairBean.<init>(java.util.List, java.util.List, java.util.List, com.okinc.unify_trade.bot.data.TacticsData):void type: THIS */
    public /* synthetic */ EditCoinPairBean(List list, List list2, List list3, TacticsData tacticsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : tacticsData);
    }
}
