package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.data.model.common.ProtocolInfoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeProtocolFilterUiData implements Parcelable {
    public static final Parcelable.Creator<MemeProtocolFilterUiData> CREATOR = new Creator();
    public final List<ProtocolInfoData> AEQbTJ;
    public final List<String> EZpvd;
    public final List<String> copydefault;

    public static final class Creator implements Parcelable.Creator<MemeProtocolFilterUiData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeProtocolFilterUiData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ProtocolInfoData.CREATOR.createFromParcel(parcel));
            }
            return new MemeProtocolFilterUiData(arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeProtocolFilterUiData[] newArray(int i) {
            return new MemeProtocolFilterUiData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeProtocolFilterUiData() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemeProtocolFilterUiData copy$default(MemeProtocolFilterUiData memeProtocolFilterUiData, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = memeProtocolFilterUiData.EZpvd;
        }
        if ((i & 2) != 0) {
            list2 = memeProtocolFilterUiData.copydefault;
        }
        if ((i & 4) != 0) {
            list3 = memeProtocolFilterUiData.AEQbTJ;
        }
        return memeProtocolFilterUiData.EZpvd(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeProtocolFilterUiData EZpvd(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<ProtocolInfoData> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        return new MemeProtocolFilterUiData(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ProtocolInfoData> copydefault() {
        return this.AEQbTJ;
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
        if (!(obj instanceof MemeProtocolFilterUiData)) {
            return false;
        }
        MemeProtocolFilterUiData memeProtocolFilterUiData = (MemeProtocolFilterUiData) obj;
        return Intrinsics.EZpvd(this.EZpvd, memeProtocolFilterUiData.EZpvd) && Intrinsics.EZpvd(this.copydefault, memeProtocolFilterUiData.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, memeProtocolFilterUiData.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeProtocolFilterUiData(selectedProtocols=" + this.EZpvd + ", defaultProtocolIdList=" + this.copydefault + ", protocolList=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeStringList(this.EZpvd);
        parcel.writeStringList(this.copydefault);
        List<ProtocolInfoData> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<ProtocolInfoData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public MemeProtocolFilterUiData(@NotNull List<String> list, @NotNull List<String> list2, @NotNull List<ProtocolInfoData> list3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        this.EZpvd = list;
        this.copydefault = list2;
        this.AEQbTJ = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0018: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:188)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:189)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:190)) : (r3v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<com.okinc.business.market.data.model.common.ProtocolInfoData>):void (m)] (LINE:187) call: com.okinc.business.market.features.meme.domain.model.MemeProtocolFilterUiData.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ MemeProtocolFilterUiData(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3);
    }
}
