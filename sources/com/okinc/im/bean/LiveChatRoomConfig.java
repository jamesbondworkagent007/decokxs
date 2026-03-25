package com.okinc.im.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class LiveChatRoomConfig implements Parcelable {
    public static final Parcelable.Creator<LiveChatRoomConfig> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final String AhwBna;
    public final int EZpvd;
    public final long KWHzl;
    public final boolean OLrzqt;
    public final String copydefault;
    public final String gEmmrt;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<LiveChatRoomConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveChatRoomConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LiveChatRoomConfig(parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiveChatRoomConfig[] newArray(int i) {
            return new LiveChatRoomConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AYXKKw() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AhwBna() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveChatRoomConfig copydefault(@NotNull String str, int i, long j, boolean z, boolean z2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LiveChatRoomConfig(str, i, j, z, z2, str2, str3);
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
        if (!(obj instanceof LiveChatRoomConfig)) {
            return false;
        }
        LiveChatRoomConfig liveChatRoomConfig = (LiveChatRoomConfig) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) liveChatRoomConfig.copydefault) && this.EZpvd == liveChatRoomConfig.EZpvd && this.KWHzl == liveChatRoomConfig.KWHzl && this.AEQbTJ == liveChatRoomConfig.AEQbTJ && this.OLrzqt == liveChatRoomConfig.OLrzqt && Intrinsics.EZpvd((Object) this.AhwBna, (Object) liveChatRoomConfig.AhwBna) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) liveChatRoomConfig.gEmmrt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.copydefault.hashCode() * 31) + Integer.hashCode(this.EZpvd)) * 31) + Long.hashCode(this.KWHzl)) * 31) + Boolean.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.OLrzqt)) * 31) + this.AhwBna.hashCode()) * 31) + this.gEmmrt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiveChatRoomConfig(channelId=" + this.copydefault + ", maxCharacterLimit=" + this.EZpvd + ", rateLimitingInMS=" + this.KWHzl + ", isMuted=" + this.AEQbTJ + ", isLive=" + this.OLrzqt + ", shareCode=" + this.AhwBna + ", watchSessionId=" + this.gEmmrt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.EZpvd);
        parcel.writeLong(this.KWHzl);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.gEmmrt);
    }

    public LiveChatRoomConfig(@NotNull String str, int i, long j, boolean z, boolean z2, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.EZpvd = i;
        this.KWHzl = j;
        this.AEQbTJ = z;
        this.OLrzqt = z2;
        this.AhwBna = str2;
        this.gEmmrt = str3;
    }
}
