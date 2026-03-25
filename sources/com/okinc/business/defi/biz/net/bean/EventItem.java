package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EventItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EventItem> CREATOR = new Creator();
    private final long eventId;
    private final String eventMessage;
    private final long eventTimestamp;
    private final int eventType;

    public static final class Creator implements Parcelable.Creator<EventItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EventItem(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventItem[] newArray(int i) {
            return new EventItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EventItem copy$default(EventItem eventItem, long j, String str, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = eventItem.eventId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            str = eventItem.eventMessage;
        }
        String str2 = str;
        if ((i2 & 4) != 0) {
            i = eventItem.eventType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j2 = eventItem.eventTimestamp;
        }
        return eventItem.copy(j3, str2, i3, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.eventMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.eventTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventItem copy(long j, @NotNull String str, int i, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new EventItem(j, str, i, j2);
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
        if (!(obj instanceof EventItem)) {
            return false;
        }
        EventItem eventItem = (EventItem) obj;
        return this.eventId == eventItem.eventId && Intrinsics.EZpvd((Object) this.eventMessage, (Object) eventItem.eventMessage) && this.eventType == eventItem.eventType && this.eventTimestamp == eventItem.eventTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventId() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventMessage() {
        return this.eventMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventTimestamp() {
        return this.eventTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEventType() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Long.hashCode(this.eventId) * 31) + this.eventMessage.hashCode()) * 31) + Integer.hashCode(this.eventType)) * 31) + Long.hashCode(this.eventTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EventItem(eventId=" + this.eventId + ", eventMessage=" + this.eventMessage + ", eventType=" + this.eventType + ", eventTimestamp=" + this.eventTimestamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.eventId);
        parcel.writeString(this.eventMessage);
        parcel.writeInt(this.eventType);
        parcel.writeLong(this.eventTimestamp);
    }

    public EventItem(long j, @NotNull String str, int i, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventId = j;
        this.eventMessage = str;
        this.eventType = i;
        this.eventTimestamp = j2;
    }
}
