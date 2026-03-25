package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class NotificationSettingsChannelReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<NotificationSettingsChannelReq> CREATOR = new Creator();
    private final List<ChannelStatus> channelStatus;
    private final int msgType;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<NotificationSettingsChannelReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationSettingsChannelReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(ChannelStatus.CREATOR.createFromParcel(parcel));
            }
            return new NotificationSettingsChannelReq(i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NotificationSettingsChannelReq[] newArray(int i) {
            return new NotificationSettingsChannelReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.NotificationSettingsChannelReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NotificationSettingsChannelReq copy$default(NotificationSettingsChannelReq notificationSettingsChannelReq, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = notificationSettingsChannelReq.msgType;
        }
        if ((i2 & 2) != 0) {
            list = notificationSettingsChannelReq.channelStatus;
        }
        return notificationSettingsChannelReq.copy(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChannelStatus> component2() {
        return this.channelStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationSettingsChannelReq copy(int i, @NotNull List<ChannelStatus> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new NotificationSettingsChannelReq(i, list);
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
        if (!(obj instanceof NotificationSettingsChannelReq)) {
            return false;
        }
        NotificationSettingsChannelReq notificationSettingsChannelReq = (NotificationSettingsChannelReq) obj;
        return this.msgType == notificationSettingsChannelReq.msgType && Intrinsics.EZpvd(this.channelStatus, notificationSettingsChannelReq.channelStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ChannelStatus> getChannelStatus() {
        return this.channelStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMsgType() {
        return this.msgType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.msgType) * 31) + this.channelStatus.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NotificationSettingsChannelReq(msgType=" + this.msgType + ", channelStatus=" + this.channelStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.msgType);
        List<ChannelStatus> list = this.channelStatus;
        parcel.writeInt(list.size());
        Iterator<ChannelStatus> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public NotificationSettingsChannelReq(int i, @NotNull List<ChannelStatus> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.msgType = i;
        this.channelStatus = list;
    }
}
