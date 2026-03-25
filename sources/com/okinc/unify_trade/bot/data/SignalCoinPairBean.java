package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.biz.FetchMultiInstsResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SignalCoinPairBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignalCoinPairBean> CREATOR = new Creator();
    private final TacticsData data;
    private final ArrayList<SignalMultiCoinPairSelectItemData> dataList;
    private final ArrayList<FetchMultiInstsResult> lastSelectedList;

    public static final class Creator implements Parcelable.Creator<SignalCoinPairBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCoinPairBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalMultiCoinPairSelectItemData.CREATOR.createFromParcel(parcel));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(FetchMultiInstsResult.CREATOR.createFromParcel(parcel));
            }
            return new SignalCoinPairBean(arrayList, arrayList2, parcel.readInt() == 0 ? null : TacticsData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalCoinPairBean[] newArray(int i) {
            return new SignalCoinPairBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalCoinPairBean() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.unify_trade.bot.data.SignalCoinPairBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalCoinPairBean copy$default(SignalCoinPairBean signalCoinPairBean, ArrayList arrayList, ArrayList arrayList2, TacticsData tacticsData, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = signalCoinPairBean.dataList;
        }
        if ((i & 2) != 0) {
            arrayList2 = signalCoinPairBean.lastSelectedList;
        }
        if ((i & 4) != 0) {
            tacticsData = signalCoinPairBean.data;
        }
        return signalCoinPairBean.copy(arrayList, arrayList2, tacticsData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalMultiCoinPairSelectItemData> component1() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FetchMultiInstsResult> component2() {
        return this.lastSelectedList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData component3() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalCoinPairBean copy(@NotNull ArrayList<SignalMultiCoinPairSelectItemData> arrayList, @NotNull ArrayList<FetchMultiInstsResult> arrayList2, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new SignalCoinPairBean(arrayList, arrayList2, tacticsData);
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
        if (!(obj instanceof SignalCoinPairBean)) {
            return false;
        }
        SignalCoinPairBean signalCoinPairBean = (SignalCoinPairBean) obj;
        return Intrinsics.EZpvd(this.dataList, signalCoinPairBean.dataList) && Intrinsics.EZpvd(this.lastSelectedList, signalCoinPairBean.lastSelectedList) && Intrinsics.EZpvd(this.data, signalCoinPairBean.data);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsData getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<SignalMultiCoinPairSelectItemData> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<FetchMultiInstsResult> getLastSelectedList() {
        return this.lastSelectedList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.dataList.hashCode();
        int iHashCode2 = this.lastSelectedList.hashCode();
        TacticsData tacticsData = this.data;
        return (((iHashCode * 31) + iHashCode2) * 31) + (tacticsData == null ? 0 : tacticsData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalCoinPairBean(dataList=" + this.dataList + ", lastSelectedList=" + this.lastSelectedList + ", data=" + this.data + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<SignalMultiCoinPairSelectItemData> arrayList = this.dataList;
        parcel.writeInt(arrayList.size());
        Iterator<SignalMultiCoinPairSelectItemData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        ArrayList<FetchMultiInstsResult> arrayList2 = this.lastSelectedList;
        parcel.writeInt(arrayList2.size());
        Iterator<FetchMultiInstsResult> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            it2.next().writeToParcel(parcel, i);
        }
        TacticsData tacticsData = this.data;
        if (tacticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            tacticsData.writeToParcel(parcel, i);
        }
    }

    public SignalCoinPairBean(@NotNull ArrayList<SignalMultiCoinPairSelectItemData> arrayList, @NotNull ArrayList<FetchMultiInstsResult> arrayList2, TacticsData tacticsData) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.dataList = arrayList;
        this.lastSelectedList = arrayList2;
        this.data = tacticsData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:736) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r1v0 java.util.ArrayList))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0009: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000f: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:737) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.ArrayList))
  (wrap:com.okinc.unify_trade.bot.data.TacticsData:?: TERNARY null = ((wrap:int:0x0012: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.bot.data.TacticsData) : (r3v0 com.okinc.unify_trade.bot.data.TacticsData))
 A[MD:(java.util.ArrayList<com.okinc.unify_trade.bot.data.SignalMultiCoinPairSelectItemData>, java.util.ArrayList<com.okinc.unify_trade.biz.FetchMultiInstsResult>, com.okinc.unify_trade.bot.data.TacticsData):void (m)] (LINE:735) call: com.okinc.unify_trade.bot.data.SignalCoinPairBean.<init>(java.util.ArrayList, java.util.ArrayList, com.okinc.unify_trade.bot.data.TacticsData):void type: THIS */
    public /* synthetic */ SignalCoinPairBean(ArrayList arrayList, ArrayList arrayList2, TacticsData tacticsData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? new ArrayList() : arrayList2, (i & 4) != 0 ? null : tacticsData);
    }
}
