package com.okinc.business.web3pay.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class RedPacketParams implements Parcelable {
    public static final Parcelable.Creator<RedPacketParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final int AYXKKw;
    public final String AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final int valueOf;

    public static final class Creator implements Parcelable.Creator<RedPacketParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedPacketParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RedPacketParams(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RedPacketParams[] newArray(int i) {
            return new RedPacketParams[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.valueOf);
        parcel.writeString(this.AEQbTJ);
        parcel.writeInt(this.AYXKKw);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
    }

    public RedPacketParams(@NotNull String str, int i, @NotNull String str2, int i2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.OLrzqt = str;
        this.valueOf = i;
        this.AEQbTJ = str2;
        this.AYXKKw = i2;
        this.AhwBna = str3;
        this.copydefault = str4;
        this.EZpvd = str5;
        this.KWHzl = str6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.EZpvd(RedPacketParams.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.copydefault(obj, "");
        RedPacketParams redPacketParams = (RedPacketParams) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) redPacketParams.OLrzqt) && this.valueOf == redPacketParams.valueOf && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) redPacketParams.AEQbTJ) && this.AYXKKw == redPacketParams.AYXKKw && Intrinsics.EZpvd((Object) this.AhwBna, (Object) redPacketParams.AhwBna) && Intrinsics.EZpvd((Object) this.copydefault, (Object) redPacketParams.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) redPacketParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) redPacketParams.KWHzl);
    }

    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        int i = this.valueOf;
        int iHashCode2 = this.AEQbTJ.hashCode();
        int i2 = this.AYXKKw;
        int iHashCode3 = this.AhwBna.hashCode();
        String str = this.copydefault;
        return (((((((((((((iHashCode * 31) + i) * 31) + iHashCode2) * 31) + i2) * 31) + iHashCode3) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    public String toString() {
        return "RedPacketParams(chainIndex='" + this.OLrzqt + "', type=" + this.valueOf + ", amount='" + this.AEQbTJ + "', quantity=" + this.AYXKKw + ", tokenCoinTypeNo='" + this.AhwBna + "', message=" + this.copydefault + ", externalGiftId='" + this.EZpvd + "', groupId='" + this.KWHzl + "')";
    }
}
