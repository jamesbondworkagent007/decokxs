package com.okinc.business.market.features.watch_list_groups;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class GroupEditParams implements Parcelable {
    public static final Parcelable.Creator<GroupEditParams> CREATOR = new Creator();
    public final GroupType EZpvd;
    public final boolean OLrzqt;

    public static final class Creator implements Parcelable.Creator<GroupEditParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupEditParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GroupEditParams(GroupType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupEditParams[] newArray(int i) {
            return new GroupEditParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public GroupEditParams() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GroupEditParams copy$default(GroupEditParams groupEditParams, GroupType groupType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            groupType = groupEditParams.EZpvd;
        }
        if ((i & 2) != 0) {
            z = groupEditParams.OLrzqt;
        }
        return groupEditParams.AEQbTJ(groupType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupEditParams AEQbTJ(@NotNull GroupType groupType, boolean z) {
        Intrinsics.checkNotNullParameter(groupType, "");
        return new GroupEditParams(groupType, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GroupType copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof GroupEditParams)) {
            return false;
        }
        GroupEditParams groupEditParams = (GroupEditParams) obj;
        return this.EZpvd == groupEditParams.EZpvd && this.OLrzqt == groupEditParams.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GroupEditParams(type=" + this.EZpvd + ", smartAccount=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.EZpvd.writeToParcel(parcel, i);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
    }

    public GroupEditParams(@NotNull GroupType groupType, boolean z) {
        Intrinsics.checkNotNullParameter(groupType, "");
        this.EZpvd = groupType;
        this.OLrzqt = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.market.features.watch_list_groups.GroupType:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.watch_list_groups.GroupType:0x0004: SGET  A[WRAPPED] (LINE:72) com.okinc.business.market.features.watch_list_groups.GroupType.FAVOURITE com.okinc.business.market.features.watch_list_groups.GroupType) : (r1v0 com.okinc.business.market.features.watch_list_groups.GroupType))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(com.okinc.business.market.features.watch_list_groups.GroupType, boolean):void (m)] (LINE:71) call: com.okinc.business.market.features.watch_list_groups.GroupEditParams.<init>(com.okinc.business.market.features.watch_list_groups.GroupType, boolean):void type: THIS */
    public /* synthetic */ GroupEditParams(GroupType groupType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GroupType.FAVOURITE : groupType, (i & 2) != 0 ? false : z);
    }
}
