package com.okinc.debugbox.track.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class EventData implements Parcelable {
    public static final Parcelable.Creator<EventData> CREATOR = new Creator();
    public final int AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final Map<String, String> OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<EventData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            String string3 = parcel.readString();
            int i2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new EventData(string, string2, i, string3, linkedHashMap);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EventData[] newArray(int i) {
            return new EventData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.debugbox.track.model.EventData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventData copy$default(EventData eventData, String str, String str2, int i, String str3, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eventData.KWHzl;
        }
        if ((i2 & 2) != 0) {
            str2 = eventData.copydefault;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = eventData.AEQbTJ;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = eventData.EZpvd;
        }
        String str5 = str3;
        if ((i2 & 16) != 0) {
            map = eventData.OLrzqt;
        }
        return eventData.copydefault(str, str4, i3, str5, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventData copydefault(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        return new EventData(str, str2, i, str3, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof EventData)) {
            return false;
        }
        EventData eventData = (EventData) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) eventData.KWHzl) && Intrinsics.EZpvd((Object) this.copydefault, (Object) eventData.copydefault) && this.AEQbTJ == eventData.AEQbTJ && Intrinsics.EZpvd((Object) this.EZpvd, (Object) eventData.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, eventData.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EventData(channel=" + this.KWHzl + ", trackerInstance=" + this.copydefault + ", state=" + this.AEQbTJ + ", event=" + this.EZpvd + ", parameters=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        Map<String, String> map = this.OLrzqt;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public EventData(@NotNull String str, @NotNull String str2, int i, @NotNull String str3, @NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.KWHzl = str;
        this.copydefault = str2;
        this.AEQbTJ = i;
        this.EZpvd = str3;
        this.OLrzqt = map;
    }
}
