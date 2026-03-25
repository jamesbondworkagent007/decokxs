package com.okinc.business.market.features.address_tracker.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.group.domain.CommonGroupUiModel;
import com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackerGroupSelectionParams implements Parcelable {
    public final boolean AEQbTJ;
    public final boolean AYXKKw;
    public final String EZpvd;
    public final String KWHzl;
    public final List<CommonGroupUiModel> copydefault;
    public final GroupSelectionMode djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<TrackerGroupSelectionParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TrackerGroupSelectionParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerGroupSelectionParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            GroupSelectionMode groupSelectionModeValueOf = GroupSelectionMode.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CommonGroupUiModel.CREATOR.createFromParcel(parcel));
            }
            return new TrackerGroupSelectionParams(groupSelectionModeValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackerGroupSelectionParams[] newArray(int i) {
            return new TrackerGroupSelectionParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackerGroupSelectionParams() {
        this(null, null, null, null, false, false, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrackerGroupSelectionParams copy$default(TrackerGroupSelectionParams trackerGroupSelectionParams, GroupSelectionMode groupSelectionMode, List list, String str, String str2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            groupSelectionMode = trackerGroupSelectionParams.djBIcL;
        }
        if ((i & 2) != 0) {
            list = trackerGroupSelectionParams.copydefault;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str = trackerGroupSelectionParams.EZpvd;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = trackerGroupSelectionParams.KWHzl;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z = trackerGroupSelectionParams.AYXKKw;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            z2 = trackerGroupSelectionParams.AEQbTJ;
        }
        return trackerGroupSelectionParams.OLrzqt(groupSelectionMode, list2, str3, str4, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CommonGroupUiModel> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupSelectionMode KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackerGroupSelectionParams OLrzqt(@NotNull GroupSelectionMode groupSelectionMode, @NotNull List<CommonGroupUiModel> list, @NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(groupSelectionMode, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new TrackerGroupSelectionParams(groupSelectionMode, list, str, str2, z, z2);
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
        if (!(obj instanceof TrackerGroupSelectionParams)) {
            return false;
        }
        TrackerGroupSelectionParams trackerGroupSelectionParams = (TrackerGroupSelectionParams) obj;
        return this.djBIcL == trackerGroupSelectionParams.djBIcL && Intrinsics.EZpvd(this.copydefault, trackerGroupSelectionParams.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) trackerGroupSelectionParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) trackerGroupSelectionParams.KWHzl) && this.AYXKKw == trackerGroupSelectionParams.AYXKKw && this.AEQbTJ == trackerGroupSelectionParams.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.djBIcL.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AYXKKw)) * 31) + Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackerGroupSelectionParams(type=" + this.djBIcL + ", groupList=" + this.copydefault + ", holderAddress=" + this.EZpvd + ", addressAlias=" + this.KWHzl + ", isFollowing=" + this.AYXKKw + ", canAddGroups=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.djBIcL.name());
        List<CommonGroupUiModel> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<CommonGroupUiModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.AYXKKw ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
    }

    public TrackerGroupSelectionParams(@NotNull GroupSelectionMode groupSelectionMode, @NotNull List<CommonGroupUiModel> list, @NotNull String str, @NotNull String str2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(groupSelectionMode, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.djBIcL = groupSelectionMode;
        this.copydefault = list;
        this.EZpvd = str;
        this.KWHzl = str2;
        this.AYXKKw = z;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode:0x0004: SGET  A[WRAPPED] (LINE:57) com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode.INDIVIDUAL com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode) : (r5v0 com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:59)) : (r6v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r11v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
 A[MD:(com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode, java.util.List<com.okinc.business.market.features.group.domain.CommonGroupUiModel>, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:56) call: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionParams.<init>(com.okinc.business.market.features.watch_list_groups.ui.models.GroupSelectionMode, java.util.List, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ TrackerGroupSelectionParams(GroupSelectionMode groupSelectionMode, List list, String str, String str2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GroupSelectionMode.INDIVIDUAL : groupSelectionMode, (i & 2) != 0 ? yDY.AhwBna() : list, (i & 4) != 0 ? "" : str, (i & 8) == 0 ? str2 : "", (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker.ui.TrackerGroupSelectionParams.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }
}
