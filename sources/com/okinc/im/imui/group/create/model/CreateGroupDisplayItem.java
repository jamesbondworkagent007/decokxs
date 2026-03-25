package com.okinc.im.imui.group.create.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.RelationInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public abstract class CreateGroupDisplayItem implements Parcelable {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.im.imui.group.create.model.CreateGroupDisplayItem.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CreateGroupDisplayItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CreateGroupDisplayItem() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OptionKey {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ OptionKey[] $VALUES;
        public static final OptionKey PUBLIC_GROUP = new OptionKey("PUBLIC_GROUP", 0);
        public static final OptionKey RESTRICTED_GROUP = new OptionKey("RESTRICTED_GROUP", 1);
        public static final OptionKey INVITE_PERMISSIONS = new OptionKey("INVITE_PERMISSIONS", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ OptionKey[] $values() {
            return new OptionKey[]{PUBLIC_GROUP, RESTRICTED_GROUP, INVITE_PERMISSIONS};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<OptionKey> getEntries() {
            return $ENTRIES;
        }

        private OptionKey(String str, int i) {
        }

        static {
            OptionKey[] optionKeyArr$values = $values();
            $VALUES = optionKeyArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(optionKeyArr$values);
        }

        public static OptionKey valueOf(String str) {
            return (OptionKey) Enum.valueOf(OptionKey.class, str);
        }

        public static OptionKey[] values() {
            return (OptionKey[]) $VALUES.clone();
        }
    }

    public static final class GroupProfileHeader extends CreateGroupDisplayItem {
        public static final Parcelable.Creator<GroupProfileHeader> CREATOR = new Creator();
        public final String OLrzqt;
        public final String copydefault;

        public static final class Creator implements Parcelable.Creator<GroupProfileHeader> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupProfileHeader createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new GroupProfileHeader(parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final GroupProfileHeader[] newArray(int i) {
                return new GroupProfileHeader[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ GroupProfileHeader copy$default(GroupProfileHeader groupProfileHeader, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = groupProfileHeader.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = groupProfileHeader.copydefault;
            }
            return groupProfileHeader.copydefault(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GroupProfileHeader copydefault(String str, String str2) {
            return new GroupProfileHeader(str, str2);
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
            if (!(obj instanceof GroupProfileHeader)) {
                return false;
            }
            GroupProfileHeader groupProfileHeader = (GroupProfileHeader) obj;
            return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) groupProfileHeader.OLrzqt) && Intrinsics.EZpvd((Object) this.copydefault, (Object) groupProfileHeader.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.copydefault;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "GroupProfileHeader(profileImage=" + this.OLrzqt + ", groupName=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt);
            parcel.writeString(this.copydefault);
        }

        public GroupProfileHeader(String str, String str2) {
            super(null);
            this.OLrzqt = str;
            this.copydefault = str2;
        }
    }

    public static final class Description extends CreateGroupDisplayItem {
        public static final Parcelable.Creator<Description> CREATOR = new Creator();
        public final String AEQbTJ;
        public final boolean copydefault;

        public static final class Creator implements Parcelable.Creator<Description> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Description createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new Description(parcel.readString(), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Description[] newArray(int i) {
                return new Description[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Description copy$default(Description description, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = description.AEQbTJ;
            }
            if ((i & 2) != 0) {
                z = description.copydefault;
            }
            return description.OLrzqt(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Description OLrzqt(String str, boolean z) {
            return new Description(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
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
            if (!(obj instanceof Description)) {
                return false;
            }
            Description description = (Description) obj;
            return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) description.AEQbTJ) && this.copydefault == description.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.AEQbTJ;
            return ((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Description(desc=" + this.AEQbTJ + ", isPublicGroup=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.AEQbTJ);
            parcel.writeInt(this.copydefault ? 1 : 0);
        }

        public Description(String str, boolean z) {
            super(null);
            this.AEQbTJ = str;
            this.copydefault = z;
        }
    }

    public static final class SwitchOption extends CreateGroupDisplayItem {
        public static final Parcelable.Creator<SwitchOption> CREATOR = new Creator();
        public final boolean KWHzl;
        public final OptionKey OLrzqt;

        public static final class Creator implements Parcelable.Creator<SwitchOption> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchOption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SwitchOption(OptionKey.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwitchOption[] newArray(int i) {
                return new SwitchOption[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SwitchOption copy$default(SwitchOption switchOption, OptionKey optionKey, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                optionKey = switchOption.OLrzqt;
            }
            if ((i & 2) != 0) {
                z = switchOption.KWHzl;
            }
            return switchOption.KWHzl(optionKey, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OptionKey AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SwitchOption KWHzl(@NotNull OptionKey optionKey, boolean z) {
            Intrinsics.checkNotNullParameter(optionKey, "");
            return new SwitchOption(optionKey, z);
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
            if (!(obj instanceof SwitchOption)) {
                return false;
            }
            SwitchOption switchOption = (SwitchOption) obj;
            return this.OLrzqt == switchOption.OLrzqt && this.KWHzl == switchOption.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.OLrzqt.hashCode() * 31) + Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SwitchOption(key=" + this.OLrzqt + ", isChecked=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.OLrzqt.name());
            parcel.writeInt(this.KWHzl ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchOption(@NotNull OptionKey optionKey, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(optionKey, "");
            this.OLrzqt = optionKey;
            this.KWHzl = z;
        }
    }

    public static final class ActionOption extends CreateGroupDisplayItem {
        public static final Parcelable.Creator<ActionOption> CREATOR = new Creator();
        public final OptionKey copydefault;

        public static final class Creator implements Parcelable.Creator<ActionOption> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActionOption createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new ActionOption(OptionKey.valueOf(parcel.readString()));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ActionOption[] newArray(int i) {
                return new ActionOption[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionOption copy$default(ActionOption actionOption, OptionKey optionKey, int i, Object obj) {
            if ((i & 1) != 0) {
                optionKey = actionOption.copydefault;
            }
            return actionOption.copydefault(optionKey);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OptionKey OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionOption copydefault(@NotNull OptionKey optionKey) {
            Intrinsics.checkNotNullParameter(optionKey, "");
            return new ActionOption(optionKey);
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
            return (obj instanceof ActionOption) && this.copydefault == ((ActionOption) obj).copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ActionOption(key=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(this.copydefault.name());
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionOption(@NotNull OptionKey optionKey) {
            super(null);
            Intrinsics.checkNotNullParameter(optionKey, "");
            this.copydefault = optionKey;
        }
    }

    public static final class MemberCount extends CreateGroupDisplayItem {
        public static final Parcelable.Creator<MemberCount> CREATOR = new Creator();
        public final int OLrzqt;

        public static final class Creator implements Parcelable.Creator<MemberCount> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MemberCount createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new MemberCount(parcel.readInt());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MemberCount[] newArray(int i) {
                return new MemberCount[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MemberCount copy$default(MemberCount memberCount, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = memberCount.OLrzqt;
            }
            return memberCount.AEQbTJ(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemberCount AEQbTJ(int i) {
            return new MemberCount(i);
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
            return (obj instanceof MemberCount) && this.OLrzqt == ((MemberCount) obj).OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Integer.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MemberCount(count=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
        }

        public MemberCount(int i) {
            super(null);
            this.OLrzqt = i;
        }
    }

    public static final class MemberItem extends CreateGroupDisplayItem {
        public final String KWHzl;
        public final String OLrzqt;
        public final RelationInfo copydefault;
        public static final int EZpvd = RelationInfo.$stable;
        public static final Parcelable.Creator<MemberItem> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<MemberItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MemberItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new MemberItem((RelationInfo) parcel.readParcelable(MemberItem.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MemberItem[] newArray(int i) {
                return new MemberItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MemberItem copy$default(MemberItem memberItem, RelationInfo relationInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                relationInfo = memberItem.copydefault;
            }
            if ((i & 2) != 0) {
                str = memberItem.KWHzl;
            }
            if ((i & 4) != 0) {
                str2 = memberItem.OLrzqt;
            }
            return memberItem.AEQbTJ(relationInfo, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MemberItem AEQbTJ(@NotNull RelationInfo relationInfo, @NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(relationInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new MemberItem(relationInfo, str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RelationInfo OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
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
            if (!(obj instanceof MemberItem)) {
                return false;
            }
            MemberItem memberItem = (MemberItem) obj;
            return Intrinsics.EZpvd(this.copydefault, memberItem.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) memberItem.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) memberItem.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MemberItem(memberInfo=" + this.copydefault + ", memberDisplayName=" + this.KWHzl + ", savedPhonebookName=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeParcelable(this.copydefault, i);
            parcel.writeString(this.KWHzl);
            parcel.writeString(this.OLrzqt);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MemberItem(@NotNull RelationInfo relationInfo, @NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(relationInfo, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.copydefault = relationInfo;
            this.KWHzl = str;
            this.OLrzqt = str2;
        }
    }
}
