package com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class SettingsChannel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SettingsChannel> CREATOR = new Creator();
    private final String channelName;
    private final Integer channelRequired;
    private final Integer channelSwitch;
    private final Integer channelType;

    public static final class Creator implements Parcelable.Creator<SettingsChannel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsChannel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SettingsChannel(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SettingsChannel[] newArray(int i) {
            return new SettingsChannel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SettingsChannel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SettingsChannel copy$default(SettingsChannel settingsChannel, Integer num, String str, Integer num2, Integer num3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = settingsChannel.channelType;
        }
        if ((i & 2) != 0) {
            str = settingsChannel.channelName;
        }
        if ((i & 4) != 0) {
            num2 = settingsChannel.channelSwitch;
        }
        if ((i & 8) != 0) {
            num3 = settingsChannel.channelRequired;
        }
        return settingsChannel.copy(num, str, num2, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.channelSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.channelRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SettingsChannel copy(Integer num, String str, Integer num2, Integer num3) {
        return new SettingsChannel(num, str, num2, num3);
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
        if (!(obj instanceof SettingsChannel)) {
            return false;
        }
        SettingsChannel settingsChannel = (SettingsChannel) obj;
        return Intrinsics.EZpvd(this.channelType, settingsChannel.channelType) && Intrinsics.EZpvd((Object) this.channelName, (Object) settingsChannel.channelName) && Intrinsics.EZpvd(this.channelSwitch, settingsChannel.channelSwitch) && Intrinsics.EZpvd(this.channelRequired, settingsChannel.channelRequired);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChannelName() {
        return this.channelName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChannelRequired() {
        return this.channelRequired;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChannelSwitch() {
        return this.channelSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getChannelType() {
        return this.channelType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.channelType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.channelName;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num2 = this.channelSwitch;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.channelRequired;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num3 != null ? num3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SettingsChannel(channelType=" + this.channelType + ", channelName=" + this.channelName + ", channelSwitch=" + this.channelSwitch + ", channelRequired=" + this.channelRequired + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.channelType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.channelName);
        Integer num2 = this.channelSwitch;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.channelRequired;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public SettingsChannel(Integer num, String str, Integer num2, Integer num3) {
        this.channelType = num;
        this.channelName = str;
        this.channelSwitch = num2;
        this.channelRequired = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r2v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r5v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer):void (m)] (LINE:33) call: com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.advancedsettings.model.SettingsChannel.<init>(java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ SettingsChannel(Integer num, String str, Integer num2, Integer num3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3);
    }
}
