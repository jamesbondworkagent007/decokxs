package com.okinc.business.defi.biz.walletconnect;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ShowWCAuthRequestArgs implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ShowWCAuthRequestArgs> CREATOR = new Creator();
    private final long generalChainId;
    private final String issuer;
    private final WCEthereumSignMessage message;
    private final long requestId;
    private final String url;
    private final String walletId;

    public static final class Creator implements Parcelable.Creator<ShowWCAuthRequestArgs> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowWCAuthRequestArgs createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ShowWCAuthRequestArgs(parcel.readLong(), parcel.readString(), WCEthereumSignMessage.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShowWCAuthRequestArgs[] newArray(int i) {
            return new ShowWCAuthRequestArgs[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCEthereumSignMessage component3() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShowWCAuthRequestArgs copy(long j, @NotNull String str, @NotNull WCEthereumSignMessage wCEthereumSignMessage, @NotNull String str2, long j2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wCEthereumSignMessage, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ShowWCAuthRequestArgs(j, str, wCEthereumSignMessage, str2, j2, str3);
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
        if (!(obj instanceof ShowWCAuthRequestArgs)) {
            return false;
        }
        ShowWCAuthRequestArgs showWCAuthRequestArgs = (ShowWCAuthRequestArgs) obj;
        return this.requestId == showWCAuthRequestArgs.requestId && Intrinsics.EZpvd((Object) this.issuer, (Object) showWCAuthRequestArgs.issuer) && Intrinsics.EZpvd(this.message, showWCAuthRequestArgs.message) && Intrinsics.EZpvd((Object) this.walletId, (Object) showWCAuthRequestArgs.walletId) && this.generalChainId == showWCAuthRequestArgs.generalChainId && Intrinsics.EZpvd((Object) this.url, (Object) showWCAuthRequestArgs.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getGeneralChainId() {
        return this.generalChainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WCEthereumSignMessage getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRequestId() {
        return this.requestId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((Long.hashCode(this.requestId) * 31) + this.issuer.hashCode()) * 31) + this.message.hashCode()) * 31) + this.walletId.hashCode()) * 31) + Long.hashCode(this.generalChainId)) * 31) + this.url.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ShowWCAuthRequestArgs(requestId=" + this.requestId + ", issuer=" + this.issuer + ", message=" + this.message + ", walletId=" + this.walletId + ", generalChainId=" + this.generalChainId + ", url=" + this.url + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.requestId);
        parcel.writeString(this.issuer);
        this.message.writeToParcel(parcel, i);
        parcel.writeString(this.walletId);
        parcel.writeLong(this.generalChainId);
        parcel.writeString(this.url);
    }

    public ShowWCAuthRequestArgs(long j, @NotNull String str, @NotNull WCEthereumSignMessage wCEthereumSignMessage, @NotNull String str2, long j2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(wCEthereumSignMessage, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.requestId = j;
        this.issuer = str;
        this.message = wCEthereumSignMessage;
        this.walletId = str2;
        this.generalChainId = j2;
        this.url = str3;
    }
}
