package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class NotificationAdvancedSettings implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationAdvancedSettings> CREATOR = new Creator();
    private final String categoryDetail;
    private final String categoryName;
    private final String darkIconLink;
    private final List<NotificationSettingChannel> items;
    private final String lightIconLink;
    private final Boolean showItemsUnderCategory;

    public static final class Creator implements Parcelable.Creator<NotificationAdvancedSettings> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationAdvancedSettings createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(NotificationSettingChannel.CREATOR.createFromParcel(parcel));
                }
            }
            return new NotificationAdvancedSettings(string, string2, string3, string4, boolValueOf, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationAdvancedSettings[] newArray(int i) {
            return new NotificationAdvancedSettings[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationAdvancedSettings() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationAdvancedSettings copy$default(NotificationAdvancedSettings notificationAdvancedSettings, String str, String str2, String str3, String str4, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = notificationAdvancedSettings.categoryName;
        }
        if ((i & 2) != 0) {
            str2 = notificationAdvancedSettings.categoryDetail;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = notificationAdvancedSettings.lightIconLink;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = notificationAdvancedSettings.darkIconLink;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            bool = notificationAdvancedSettings.showItemsUnderCategory;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            list = notificationAdvancedSettings.items;
        }
        return notificationAdvancedSettings.copy(str, str5, str6, str7, bool2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.categoryDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.showItemsUnderCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationSettingChannel> component6() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationAdvancedSettings copy(String str, String str2, String str3, String str4, Boolean bool, List<NotificationSettingChannel> list) {
        return new NotificationAdvancedSettings(str, str2, str3, str4, bool, list);
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
        if (!(obj instanceof NotificationAdvancedSettings)) {
            return false;
        }
        NotificationAdvancedSettings notificationAdvancedSettings = (NotificationAdvancedSettings) obj;
        return Intrinsics.EZpvd((Object) this.categoryName, (Object) notificationAdvancedSettings.categoryName) && Intrinsics.EZpvd((Object) this.categoryDetail, (Object) notificationAdvancedSettings.categoryDetail) && Intrinsics.EZpvd((Object) this.lightIconLink, (Object) notificationAdvancedSettings.lightIconLink) && Intrinsics.EZpvd((Object) this.darkIconLink, (Object) notificationAdvancedSettings.darkIconLink) && Intrinsics.EZpvd(this.showItemsUnderCategory, notificationAdvancedSettings.showItemsUnderCategory) && Intrinsics.EZpvd(this.items, notificationAdvancedSettings.items);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryDetail() {
        return this.categoryDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDarkIconLink() {
        return this.darkIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationSettingChannel> getItems() {
        return this.items;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLightIconLink() {
        return this.lightIconLink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowItemsUnderCategory() {
        return this.showItemsUnderCategory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.categoryName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.categoryDetail;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lightIconLink;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.darkIconLink;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.showItemsUnderCategory;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        List<NotificationSettingChannel> list = this.items;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationAdvancedSettings(categoryName=" + this.categoryName + ", categoryDetail=" + this.categoryDetail + ", lightIconLink=" + this.lightIconLink + ", darkIconLink=" + this.darkIconLink + ", showItemsUnderCategory=" + this.showItemsUnderCategory + ", items=" + this.items + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.categoryName);
        parcel.writeString(this.categoryDetail);
        parcel.writeString(this.lightIconLink);
        parcel.writeString(this.darkIconLink);
        Boolean bool = this.showItemsUnderCategory;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        List<NotificationSettingChannel> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<NotificationSettingChannel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public NotificationAdvancedSettings(String str, String str2, String str3, String str4, Boolean bool, List<NotificationSettingChannel> list) {
        this.categoryName = str;
        this.categoryDetail = str2;
        this.lightIconLink = str3;
        this.darkIconLink = str4;
        this.showItemsUnderCategory = bool;
        this.items = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List<com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel>):void (m)] (LINE:9) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationAdvancedSettings.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ NotificationAdvancedSettings(String str, String str2, String str3, String str4, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : list);
    }
}
