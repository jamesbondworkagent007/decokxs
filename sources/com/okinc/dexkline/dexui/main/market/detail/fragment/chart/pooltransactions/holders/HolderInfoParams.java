package com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.dexkline.market.features.tag.domain.TagWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class HolderInfoParams implements Parcelable {
    public static final Parcelable.Creator<HolderInfoParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final List<TagWrapper> OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<HolderInfoParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderInfoParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TagWrapper.CREATOR.createFromParcel(parcel));
            }
            return new HolderInfoParams(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderInfoParams[] newArray(int i) {
            return new HolderInfoParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HolderInfoParams copy$default(HolderInfoParams holderInfoParams, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holderInfoParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str2 = holderInfoParams.copydefault;
        }
        if ((i & 4) != 0) {
            list = holderInfoParams.OLrzqt;
        }
        return holderInfoParams.OLrzqt(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TagWrapper> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderInfoParams OLrzqt(@NotNull String str, @NotNull String str2, @NotNull List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HolderInfoParams(str, str2, list);
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
        if (!(obj instanceof HolderInfoParams)) {
            return false;
        }
        HolderInfoParams holderInfoParams = (HolderInfoParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) holderInfoParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.copydefault, (Object) holderInfoParams.copydefault) && Intrinsics.EZpvd(this.OLrzqt, holderInfoParams.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderInfoParams(tokenSymbol=" + this.AEQbTJ + ", trackKey=" + this.copydefault + ", filteredTagList=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault);
        List<TagWrapper> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<TagWrapper> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public HolderInfoParams(@NotNull String str, @NotNull String str2, @NotNull List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.copydefault = str2;
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 java.lang.String)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.dexkline.market.features.tag.domain.TagWrapper>):void (m)] (LINE:30) call: com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ HolderInfoParams(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? yDY.AhwBna() : list);
    }
}
