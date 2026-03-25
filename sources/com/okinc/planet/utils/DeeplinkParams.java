package com.okinc.planet.utils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class DeeplinkParams implements Parcelable {
    public final String AEQbTJ;
    public final Integer EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final Parcelable.Creator<DeeplinkParams> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DeeplinkParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeeplinkParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DeeplinkParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeeplinkParams[] newArray(int i) {
            return new DeeplinkParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DeeplinkParams copy$default(DeeplinkParams deeplinkParams, String str, String str2, String str3, String str4, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deeplinkParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = deeplinkParams.AEQbTJ;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = deeplinkParams.KWHzl;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = deeplinkParams.OLrzqt;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            num = deeplinkParams.EZpvd;
        }
        return deeplinkParams.copydefault(str, str5, str6, str7, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DeeplinkParams copydefault(@NotNull String str, String str2, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DeeplinkParams(str, str2, str3, str4, num);
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
        if (!(obj instanceof DeeplinkParams)) {
            return false;
        }
        DeeplinkParams deeplinkParams = (DeeplinkParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) deeplinkParams.copydefault) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) deeplinkParams.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) deeplinkParams.KWHzl) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) deeplinkParams.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, deeplinkParams.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.copydefault.hashCode();
        String str = this.AEQbTJ;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.KWHzl;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.OLrzqt;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        Integer num = this.EZpvd;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DeeplinkParams(channel=" + this.copydefault + ", channelDetails=" + this.AEQbTJ + ", activityId=" + this.KWHzl + ", cardId=" + this.OLrzqt + ", position=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt);
        Integer num = this.EZpvd;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public DeeplinkParams(@NotNull String str, String str2, String str3, String str4, Integer num) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
        this.AEQbTJ = str2;
        this.KWHzl = str3;
        this.OLrzqt = str4;
        this.EZpvd = num;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.planet.utils.DeeplinkParams.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}
