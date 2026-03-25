package com.okinc.business.market.features.address_tracker.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class AddTrackerParams implements Parcelable {
    public static final Parcelable.Creator<AddTrackerParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final List<CommonGroupUiModel> KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<AddTrackerParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddTrackerParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(CommonGroupUiModel.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new AddTrackerParams(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddTrackerParams[] newArray(int i) {
            return new AddTrackerParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddTrackerParams() {
        this(null, false, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.address_tracker.ui.AddTrackerParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddTrackerParams copy$default(AddTrackerParams addTrackerParams, List list, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = addTrackerParams.KWHzl;
        }
        if ((i & 2) != 0) {
            z = addTrackerParams.OLrzqt;
        }
        if ((i & 4) != 0) {
            str = addTrackerParams.copydefault;
        }
        if ((i & 8) != 0) {
            str2 = addTrackerParams.AEQbTJ;
        }
        return addTrackerParams.KWHzl(list, z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddTrackerParams KWHzl(List<CommonGroupUiModel> list, boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AddTrackerParams(list, z, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommonGroupUiModel> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof AddTrackerParams)) {
            return false;
        }
        AddTrackerParams addTrackerParams = (AddTrackerParams) obj;
        return Intrinsics.EZpvd(this.KWHzl, addTrackerParams.KWHzl) && this.OLrzqt == addTrackerParams.OLrzqt && Intrinsics.EZpvd((Object) this.copydefault, (Object) addTrackerParams.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) addTrackerParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<CommonGroupUiModel> list = this.KWHzl;
        return ((((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddTrackerParams(selectedGroups=" + this.KWHzl + ", canAddGroups=" + this.OLrzqt + ", address=" + this.copydefault + ", alias=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<CommonGroupUiModel> list = this.KWHzl;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<CommonGroupUiModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
    }

    public AddTrackerParams(List<CommonGroupUiModel> list, boolean z, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.KWHzl = list;
        this.OLrzqt = z;
        this.copydefault = str;
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0005: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.util.List<com.okinc.business.market.features.group.domain.CommonGroupUiModel>, boolean, java.lang.String, java.lang.String):void (m)] (LINE:8) call: com.okinc.business.market.features.address_tracker.ui.AddTrackerParams.<init>(java.util.List, boolean, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AddTrackerParams(List list, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2);
    }
}
