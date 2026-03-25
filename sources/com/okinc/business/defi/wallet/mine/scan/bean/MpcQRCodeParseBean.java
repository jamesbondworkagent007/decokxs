package com.okinc.business.defi.wallet.mine.scan.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MpcQRCodeParseBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MpcQRCodeParseBean> CREATOR = new Creator();
    private final String publicKey;
    private final long time;
    private final String uId;

    public static final class Creator implements Parcelable.Creator<MpcQRCodeParseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcQRCodeParseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MpcQRCodeParseBean(parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MpcQRCodeParseBean[] newArray(int i) {
            return new MpcQRCodeParseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MpcQRCodeParseBean copy$default(MpcQRCodeParseBean mpcQRCodeParseBean, String str, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mpcQRCodeParseBean.publicKey;
        }
        if ((i & 2) != 0) {
            str2 = mpcQRCodeParseBean.uId;
        }
        if ((i & 4) != 0) {
            j = mpcQRCodeParseBean.time;
        }
        return mpcQRCodeParseBean.copy(str, str2, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MpcQRCodeParseBean copy(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new MpcQRCodeParseBean(str, str2, j);
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
        if (!(obj instanceof MpcQRCodeParseBean)) {
            return false;
        }
        MpcQRCodeParseBean mpcQRCodeParseBean = (MpcQRCodeParseBean) obj;
        return Intrinsics.EZpvd((Object) this.publicKey, (Object) mpcQRCodeParseBean.publicKey) && Intrinsics.EZpvd((Object) this.uId, (Object) mpcQRCodeParseBean.uId) && this.time == mpcQRCodeParseBean.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPublicKey() {
        return this.publicKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUId() {
        return this.uId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.publicKey.hashCode() * 31) + this.uId.hashCode()) * 31) + Long.hashCode(this.time);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MpcQRCodeParseBean(publicKey=" + this.publicKey + ", uId=" + this.uId + ", time=" + this.time + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.publicKey);
        parcel.writeString(this.uId);
        parcel.writeLong(this.time);
    }

    public MpcQRCodeParseBean(@NotNull String str, @NotNull String str2, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.publicKey = str;
        this.uId = str2;
        this.time = j;
    }
}
