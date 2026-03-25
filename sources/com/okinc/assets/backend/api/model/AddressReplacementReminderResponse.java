package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AddressReplacementReminderResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AddressReplacementReminderResponse> CREATOR = new Creator();
    private final String addressBookReminder;
    private final String bannerContent;
    private final Boolean display;
    private final ArrayList<AddressItem> oldAddresses;
    private final String reminderContent;

    public static final class Creator implements Parcelable.Creator<AddressReplacementReminderResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressReplacementReminderResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(AddressItem.CREATOR.createFromParcel(parcel));
            }
            return new AddressReplacementReminderResponse(boolValueOf, string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressReplacementReminderResponse[] newArray(int i) {
            return new AddressReplacementReminderResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AddressReplacementReminderResponse() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.assets.backend.api.model.AddressReplacementReminderResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddressReplacementReminderResponse copy$default(AddressReplacementReminderResponse addressReplacementReminderResponse, Boolean bool, String str, String str2, String str3, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = addressReplacementReminderResponse.display;
        }
        if ((i & 2) != 0) {
            str = addressReplacementReminderResponse.bannerContent;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = addressReplacementReminderResponse.reminderContent;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = addressReplacementReminderResponse.addressBookReminder;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            arrayList = addressReplacementReminderResponse.oldAddresses;
        }
        return addressReplacementReminderResponse.copy(bool, str4, str5, str6, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.display;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.bannerContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.addressBookReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AddressItem> component5() {
        return this.oldAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AddressReplacementReminderResponse copy(Boolean bool, String str, String str2, String str3, @NotNull ArrayList<AddressItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new AddressReplacementReminderResponse(bool, str, str2, str3, arrayList);
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
        if (!(obj instanceof AddressReplacementReminderResponse)) {
            return false;
        }
        AddressReplacementReminderResponse addressReplacementReminderResponse = (AddressReplacementReminderResponse) obj;
        return Intrinsics.EZpvd(this.display, addressReplacementReminderResponse.display) && Intrinsics.EZpvd((Object) this.bannerContent, (Object) addressReplacementReminderResponse.bannerContent) && Intrinsics.EZpvd((Object) this.reminderContent, (Object) addressReplacementReminderResponse.reminderContent) && Intrinsics.EZpvd((Object) this.addressBookReminder, (Object) addressReplacementReminderResponse.addressBookReminder) && Intrinsics.EZpvd(this.oldAddresses, addressReplacementReminderResponse.oldAddresses);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressBookReminder() {
        return this.addressBookReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBannerContent() {
        return this.bannerContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDisplay() {
        return this.display;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AddressItem> getOldAddresses() {
        return this.oldAddresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReminderContent() {
        return this.reminderContent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.display;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        String str = this.bannerContent;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.reminderContent;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.addressBookReminder;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.oldAddresses.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AddressReplacementReminderResponse(display=" + this.display + ", bannerContent=" + this.bannerContent + ", reminderContent=" + this.reminderContent + ", addressBookReminder=" + this.addressBookReminder + ", oldAddresses=" + this.oldAddresses + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.os.Parcel, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.display;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.bannerContent);
        parcel.writeString(this.reminderContent);
        parcel.writeString(this.addressBookReminder);
        ArrayList<AddressItem> arrayList = this.oldAddresses;
        parcel.writeInt(arrayList.size());
        Iterator<AddressItem> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public AddressReplacementReminderResponse(Boolean bool, String str, String str2, String str3, @NotNull ArrayList<AddressItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.display = bool;
        this.bannerContent = str;
        this.reminderContent = str2;
        this.addressBookReminder = str3;
        this.oldAddresses = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (null java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x0021: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:16) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r8v0 java.util.ArrayList))
 A[MD:(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.assets.backend.api.model.AddressReplacementReminderResponse$AddressItem>):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.AddressReplacementReminderResponse.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ AddressReplacementReminderResponse(Boolean bool, String str, String str2, String str3, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.FALSE : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) == 0 ? str3 : null, (i & 16) != 0 ? new ArrayList() : arrayList);
    }

    public static final class AddressItem implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<AddressItem> CREATOR = new Creator();
        private final String address;
        private final Long id;
        private final String specialField;
        private final String specialFieldHeader;
        private final String title;

        public static final class Creator implements Parcelable.Creator<AddressItem> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new AddressItem(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final AddressItem[] newArray(int i) {
                return new AddressItem[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AddressItem() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AddressItem copy$default(AddressItem addressItem, Long l, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                l = addressItem.id;
            }
            if ((i & 2) != 0) {
                str = addressItem.address;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = addressItem.specialField;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = addressItem.specialFieldHeader;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = addressItem.title;
            }
            return addressItem.copy(l, str5, str6, str7, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.specialField;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.specialFieldHeader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AddressItem copy(Long l, String str, String str2, String str3, String str4) {
            return new AddressItem(l, str, str2, str3, str4);
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
            if (!(obj instanceof AddressItem)) {
                return false;
            }
            AddressItem addressItem = (AddressItem) obj;
            return Intrinsics.EZpvd(this.id, addressItem.id) && Intrinsics.EZpvd((Object) this.address, (Object) addressItem.address) && Intrinsics.EZpvd((Object) this.specialField, (Object) addressItem.specialField) && Intrinsics.EZpvd((Object) this.specialFieldHeader, (Object) addressItem.specialFieldHeader) && Intrinsics.EZpvd((Object) this.title, (Object) addressItem.title);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAddress() {
            return this.address;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Long getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpecialField() {
            return this.specialField;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getSpecialFieldHeader() {
            return this.specialFieldHeader;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTitle() {
            return this.title;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            Long l = this.id;
            int iHashCode = l == null ? 0 : l.hashCode();
            String str = this.address;
            int iHashCode2 = str == null ? 0 : str.hashCode();
            String str2 = this.specialField;
            int iHashCode3 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.specialFieldHeader;
            int iHashCode4 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.title;
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AddressItem(id=" + this.id + ", address=" + this.address + ", specialField=" + this.specialField + ", specialFieldHeader=" + this.specialFieldHeader + ", title=" + this.title + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            Long l = this.id;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeLong(l.longValue());
            }
            parcel.writeString(this.address);
            parcel.writeString(this.specialField);
            parcel.writeString(this.specialFieldHeader);
            parcel.writeString(this.title);
        }

        public AddressItem(Long l, String str, String str2, String str3, String str4) {
            this.id = l;
            this.address = str;
            this.specialField = str2;
            this.specialFieldHeader = str3;
            this.title = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:20) call: com.okinc.assets.backend.api.model.AddressReplacementReminderResponse.AddressItem.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ AddressItem(Long l, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? null : str4);
        }
    }
}
