package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class SwitchNotificationSettingsChannelReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SwitchNotificationSettingsChannelReq> CREATOR = new Creator();
    private final int businessType;
    private final List<NotificationSettingsChannelReq> switches;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<SwitchNotificationSettingsChannelReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchNotificationSettingsChannelReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(NotificationSettingsChannelReq.CREATOR.createFromParcel(parcel));
            }
            return new SwitchNotificationSettingsChannelReq(i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwitchNotificationSettingsChannelReq[] newArray(int i) {
            return new SwitchNotificationSettingsChannelReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SwitchNotificationSettingsChannelReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SwitchNotificationSettingsChannelReq copy$default(SwitchNotificationSettingsChannelReq switchNotificationSettingsChannelReq, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = switchNotificationSettingsChannelReq.businessType;
        }
        if ((i2 & 2) != 0) {
            list = switchNotificationSettingsChannelReq.switches;
        }
        return switchNotificationSettingsChannelReq.copy(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationSettingsChannelReq> component2() {
        return this.switches;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwitchNotificationSettingsChannelReq copy(int i, @NotNull List<NotificationSettingsChannelReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SwitchNotificationSettingsChannelReq(i, list);
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
        if (!(obj instanceof SwitchNotificationSettingsChannelReq)) {
            return false;
        }
        SwitchNotificationSettingsChannelReq switchNotificationSettingsChannelReq = (SwitchNotificationSettingsChannelReq) obj;
        return this.businessType == switchNotificationSettingsChannelReq.businessType && Intrinsics.EZpvd(this.switches, switchNotificationSettingsChannelReq.switches);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBusinessType() {
        return this.businessType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<NotificationSettingsChannelReq> getSwitches() {
        return this.switches;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.businessType) * 31) + this.switches.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwitchNotificationSettingsChannelReq(businessType=" + this.businessType + ", switches=" + this.switches + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.businessType);
        List<NotificationSettingsChannelReq> list = this.switches;
        parcel.writeInt(list.size());
        Iterator<NotificationSettingsChannelReq> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public SwitchNotificationSettingsChannelReq(int i, @NotNull List<NotificationSettingsChannelReq> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.businessType = i;
        this.switches = list;
    }
}
