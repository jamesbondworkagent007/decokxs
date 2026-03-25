package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleSubmitTxReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleSubmitTxReq> CREATOR = new Creator();
    private long coinId;
    private String fromAdr;
    private String signedTx;
    private String txHash;
    private int txSource;

    public static final class Creator implements Parcelable.Creator<SimpleSubmitTxReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleSubmitTxReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleSubmitTxReq(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleSubmitTxReq[] newArray(int i) {
            return new SimpleSubmitTxReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleSubmitTxReq copy$default(SimpleSubmitTxReq simpleSubmitTxReq, String str, String str2, String str3, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = simpleSubmitTxReq.txHash;
        }
        if ((i2 & 2) != 0) {
            str2 = simpleSubmitTxReq.signedTx;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = simpleSubmitTxReq.fromAdr;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            j = simpleSubmitTxReq.coinId;
        }
        long j2 = j;
        if ((i2 & 16) != 0) {
            i = simpleSubmitTxReq.txSource;
        }
        return simpleSubmitTxReq.copy(str, str4, str5, j2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fromAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleSubmitTxReq copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SimpleSubmitTxReq(str, str2, str3, j, i);
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
        if (!(obj instanceof SimpleSubmitTxReq)) {
            return false;
        }
        SimpleSubmitTxReq simpleSubmitTxReq = (SimpleSubmitTxReq) obj;
        return Intrinsics.EZpvd((Object) this.txHash, (Object) simpleSubmitTxReq.txHash) && Intrinsics.EZpvd((Object) this.signedTx, (Object) simpleSubmitTxReq.signedTx) && Intrinsics.EZpvd((Object) this.fromAdr, (Object) simpleSubmitTxReq.fromAdr) && this.coinId == simpleSubmitTxReq.coinId && this.txSource == simpleSubmitTxReq.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFromAdr() {
        return this.fromAdr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignedTx() {
        return this.signedTx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxHash() {
        return this.txHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTxSource() {
        return this.txSource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.txHash.hashCode() * 31) + this.signedTx.hashCode()) * 31) + this.fromAdr.hashCode()) * 31) + Long.hashCode(this.coinId)) * 31) + Integer.hashCode(this.txSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAdr(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fromAdr = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignedTx(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signedTx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.txHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxSource(int i) {
        this.txSource = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleSubmitTxReq(txHash=" + this.txHash + ", signedTx=" + this.signedTx + ", fromAdr=" + this.fromAdr + ", coinId=" + this.coinId + ", txSource=" + this.txSource + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.txHash);
        parcel.writeString(this.signedTx);
        parcel.writeString(this.fromAdr);
        parcel.writeLong(this.coinId);
        parcel.writeInt(this.txSource);
    }

    public SimpleSubmitTxReq(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.txHash = str;
        this.signedTx = str2;
        this.fromAdr = str3;
        this.coinId = j;
        this.txSource = i;
    }
}
