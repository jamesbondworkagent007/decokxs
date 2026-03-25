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
public final class NotificationSettingChannel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationSettingChannel> CREATOR = new Creator();
    private final List<SettingsChannel> channelStatus;
    private final String msgDetail;
    private SystemNotificationExample msgExample;
    private final String msgName;
    private final Integer msgType;
    private List<NotificationSettingChannel> subItems;

    public static final class Creator implements Parcelable.Creator<NotificationSettingChannel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationSettingChannel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Intrinsics.checkNotNullParameter(parcel, "");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(SettingsChannel.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(NotificationSettingChannel.CREATOR.createFromParcel(parcel));
                }
            }
            return new NotificationSettingChannel(numValueOf, string, string2, arrayList, arrayList2, parcel.readInt() != 0 ? SystemNotificationExample.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationSettingChannel[] newArray(int i) {
            return new NotificationSettingChannel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NotificationSettingChannel() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationSettingChannel copy$default(NotificationSettingChannel notificationSettingChannel, Integer num, String str, String str2, List list, List list2, SystemNotificationExample systemNotificationExample, int i, Object obj) {
        if ((i & 1) != 0) {
            num = notificationSettingChannel.msgType;
        }
        if ((i & 2) != 0) {
            str = notificationSettingChannel.msgName;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = notificationSettingChannel.msgDetail;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            list = notificationSettingChannel.channelStatus;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            list2 = notificationSettingChannel.subItems;
        }
        List list4 = list2;
        if ((i & 32) != 0) {
            systemNotificationExample = notificationSettingChannel.msgExample;
        }
        return notificationSettingChannel.copy(num, str3, str4, list3, list4, systemNotificationExample);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.msgName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.msgDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SettingsChannel> component4() {
        return this.channelStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationSettingChannel> component5() {
        return this.subItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemNotificationExample component6() {
        return this.msgExample;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationSettingChannel copy(Integer num, String str, String str2, List<SettingsChannel> list, List<NotificationSettingChannel> list2, SystemNotificationExample systemNotificationExample) {
        return new NotificationSettingChannel(num, str, str2, list, list2, systemNotificationExample);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SettingsChannel> getChannelStatus() {
        return this.channelStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgDetail() {
        return this.msgDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SystemNotificationExample getMsgExample() {
        return this.msgExample;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsgName() {
        return this.msgName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getMsgType() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationSettingChannel> getSubItems() {
        return this.subItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.msgType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.msgName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.msgDetail;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        List<SettingsChannel> list = this.channelStatus;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<NotificationSettingChannel> list2 = this.subItems;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        SystemNotificationExample systemNotificationExample = this.msgExample;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (systemNotificationExample != null ? systemNotificationExample.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsgExample(SystemNotificationExample systemNotificationExample) {
        this.msgExample = systemNotificationExample;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubItems(List<NotificationSettingChannel> list) {
        this.subItems = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationSettingChannel(msgType=" + this.msgType + ", msgName=" + this.msgName + ", msgDetail=" + this.msgDetail + ", channelStatus=" + this.channelStatus + ", subItems=" + this.subItems + ", msgExample=" + this.msgExample + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.msgType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.msgName);
        parcel.writeString(this.msgDetail);
        List<SettingsChannel> list = this.channelStatus;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<SettingsChannel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        List<NotificationSettingChannel> list2 = this.subItems;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<NotificationSettingChannel> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(parcel, i);
            }
        }
        SystemNotificationExample systemNotificationExample = this.msgExample;
        if (systemNotificationExample == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            systemNotificationExample.writeToParcel(parcel, i);
        }
    }

    public NotificationSettingChannel(Integer num, String str, String str2, List<SettingsChannel> list, List<NotificationSettingChannel> list2, SystemNotificationExample systemNotificationExample) {
        this.msgType = num;
        this.msgName = str;
        this.msgDetail = str2;
        this.channelStatus = list;
        this.subItems = list2;
        this.msgExample = systemNotificationExample;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r9v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r10v0 java.util.List))
  (wrap:com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample) : (r11v0 com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.util.List<com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SettingsChannel>, java.util.List<com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel>, com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample):void (m)] (LINE:20) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingChannel.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.util.List, com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SystemNotificationExample):void type: THIS */
    public /* synthetic */ NotificationSettingChannel(Integer num, String str, String str2, List list, List list2, SystemNotificationExample systemNotificationExample, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : systemNotificationExample);
    }
}
