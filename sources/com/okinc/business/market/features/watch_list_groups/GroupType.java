package com.okinc.business.market.features.watch_list_groups;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class GroupType implements Parcelable {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ GroupType[] $VALUES;
    public static final Parcelable.Creator<GroupType> CREATOR;
    public static final GroupType TRACKER = new GroupType("TRACKER", 0);
    public static final GroupType FAVOURITE = new GroupType("FAVOURITE", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ GroupType[] $values() {
        return new GroupType[]{TRACKER, FAVOURITE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<GroupType> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }

    private GroupType(String str, int i) {
    }

    static {
        GroupType[] groupTypeArr$values = $values();
        $VALUES = groupTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(groupTypeArr$values);
        CREATOR = new Parcelable.Creator<GroupType>() { // from class: com.okinc.business.market.features.watch_list_groups.GroupType.Creator
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupType createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return GroupType.valueOf(parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupType[] newArray(int i) {
                return new GroupType[i];
            }
        };
    }

    public static GroupType valueOf(String str) {
        return (GroupType) Enum.valueOf(GroupType.class, str);
    }

    public static GroupType[] values() {
        return (GroupType[]) $VALUES.clone();
    }
}
