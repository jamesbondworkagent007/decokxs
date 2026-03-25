package com.okinc.im.imui.chatsettings.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class ChatSettingsResult implements Parcelable {
    public static final Parcelable.Creator<ChatSettingsResult> CREATOR = new Creator();
    public final boolean AEQbTJ;
    public final Boolean EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ChatSettingsResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatSettingsResult createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ChatSettingsResult(z, z2, z3, z4, boolValueOf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChatSettingsResult[] newArray(int i) {
            return new ChatSettingsResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ChatSettingsResult copy$default(ChatSettingsResult chatSettingsResult, boolean z, boolean z2, boolean z3, boolean z4, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatSettingsResult.KWHzl;
        }
        if ((i & 2) != 0) {
            z2 = chatSettingsResult.copydefault;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = chatSettingsResult.AEQbTJ;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = chatSettingsResult.OLrzqt;
        }
        boolean z7 = z4;
        if ((i & 16) != 0) {
            bool = chatSettingsResult.EZpvd;
        }
        return chatSettingsResult.AEQbTJ(z, z5, z6, z7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChatSettingsResult AEQbTJ(boolean z, boolean z2, boolean z3, boolean z4, Boolean bool) {
        return new ChatSettingsResult(z, z2, z3, z4, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
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
        if (!(obj instanceof ChatSettingsResult)) {
            return false;
        }
        ChatSettingsResult chatSettingsResult = (ChatSettingsResult) obj;
        return this.KWHzl == chatSettingsResult.KWHzl && this.copydefault == chatSettingsResult.copydefault && this.AEQbTJ == chatSettingsResult.AEQbTJ && this.OLrzqt == chatSettingsResult.OLrzqt && Intrinsics.EZpvd(this.EZpvd, chatSettingsResult.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.KWHzl);
        int iHashCode2 = Boolean.hashCode(this.copydefault);
        int iHashCode3 = Boolean.hashCode(this.AEQbTJ);
        int iHashCode4 = Boolean.hashCode(this.OLrzqt);
        Boolean bool = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChatSettingsResult(isAllowContactDiscovery=" + this.KWHzl + ", isAllowQRCodeSearchAdd=" + this.copydefault + ", isAllowGroupSearchAdd=" + this.AEQbTJ + ", isAllowInAppNotification=" + this.OLrzqt + ", isAllowChatViaProfile=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeInt(this.copydefault ? 1 : 0);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
        parcel.writeInt(this.OLrzqt ? 1 : 0);
        Boolean bool = this.EZpvd;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
    }

    public ChatSettingsResult(boolean z, boolean z2, boolean z3, boolean z4, Boolean bool) {
        this.KWHzl = z;
        this.copydefault = z2;
        this.AEQbTJ = z3;
        this.OLrzqt = z4;
        this.EZpvd = bool;
    }
}
