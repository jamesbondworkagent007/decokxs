package com.okinc.okimcore.model.biz.relationlocal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PhoneRelationGroup implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PhoneRelationGroup> CREATOR = new Creator();
    private final String contactId;
    private final String displayName;
    private final List<PhoneRelation> localRelationList;

    public static final class Creator implements Parcelable.Creator<PhoneRelationGroup> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneRelationGroup createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PhoneRelation.CREATOR.createFromParcel(parcel));
            }
            return new PhoneRelationGroup(string, string2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneRelationGroup[] newArray(int i) {
            return new PhoneRelationGroup[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okimcore.model.biz.relationlocal.PhoneRelationGroup */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PhoneRelationGroup copy$default(PhoneRelationGroup phoneRelationGroup, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneRelationGroup.contactId;
        }
        if ((i & 2) != 0) {
            str2 = phoneRelationGroup.displayName;
        }
        if ((i & 4) != 0) {
            list = phoneRelationGroup.localRelationList;
        }
        return phoneRelationGroup.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PhoneRelation> component3() {
        return this.localRelationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneRelationGroup copy(@NotNull String str, @NotNull String str2, @NotNull List<PhoneRelation> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new PhoneRelationGroup(str, str2, list);
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
        if (!(obj instanceof PhoneRelationGroup)) {
            return false;
        }
        PhoneRelationGroup phoneRelationGroup = (PhoneRelationGroup) obj;
        return Intrinsics.EZpvd((Object) this.contactId, (Object) phoneRelationGroup.contactId) && Intrinsics.EZpvd((Object) this.displayName, (Object) phoneRelationGroup.displayName) && Intrinsics.EZpvd(this.localRelationList, phoneRelationGroup.localRelationList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactId() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PhoneRelation> getLocalRelationList() {
        return this.localRelationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.contactId.hashCode() * 31) + this.displayName.hashCode()) * 31) + this.localRelationList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PhoneRelationGroup(contactId=" + this.contactId + ", displayName=" + this.displayName + ", localRelationList=" + this.localRelationList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contactId);
        parcel.writeString(this.displayName);
        List<PhoneRelation> list = this.localRelationList;
        parcel.writeInt(list.size());
        Iterator<PhoneRelation> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public PhoneRelationGroup(@NotNull String str, @NotNull String str2, @NotNull List<PhoneRelation> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.contactId = str;
        this.displayName = str2;
        this.localRelationList = list;
    }
}
