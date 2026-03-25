package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import com.okinc.auth.api.passkey.PasskeyAuthenticateResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapeTransactionData implements Parcelable {
    public final String AEQbTJ;
    public final PasskeyAuthenticateRequest KWHzl;
    public final PasskeyAuthenticateResponse OLrzqt;
    public static final int copydefault = PasskeyAuthenticateResponse.$stable | PasskeyAuthenticateRequest.$stable;
    public static final Parcelable.Creator<EscapeTransactionData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EscapeTransactionData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeTransactionData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeTransactionData((PasskeyAuthenticateRequest) parcel.readParcelable(EscapeTransactionData.class.getClassLoader()), parcel.readString(), (PasskeyAuthenticateResponse) parcel.readParcelable(EscapeTransactionData.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeTransactionData[] newArray(int i) {
            return new EscapeTransactionData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeTransactionData copy$default(EscapeTransactionData escapeTransactionData, PasskeyAuthenticateRequest passkeyAuthenticateRequest, String str, PasskeyAuthenticateResponse passkeyAuthenticateResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyAuthenticateRequest = escapeTransactionData.KWHzl;
        }
        if ((i & 2) != 0) {
            str = escapeTransactionData.AEQbTJ;
        }
        if ((i & 4) != 0) {
            passkeyAuthenticateResponse = escapeTransactionData.OLrzqt;
        }
        return escapeTransactionData.EZpvd(passkeyAuthenticateRequest, str, passkeyAuthenticateResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateResponse AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeTransactionData EZpvd(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull String str, PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new EscapeTransactionData(passkeyAuthenticateRequest, str, passkeyAuthenticateResponse);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
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
        if (!(obj instanceof EscapeTransactionData)) {
            return false;
        }
        EscapeTransactionData escapeTransactionData = (EscapeTransactionData) obj;
        return Intrinsics.EZpvd(this.KWHzl, escapeTransactionData.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) escapeTransactionData.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, escapeTransactionData.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.AEQbTJ.hashCode();
        PasskeyAuthenticateResponse passkeyAuthenticateResponse = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (passkeyAuthenticateResponse == null ? 0 : passkeyAuthenticateResponse.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeTransactionData(serverOption=" + this.KWHzl + ", uopHash=" + this.AEQbTJ + ", signedTx=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.KWHzl, i);
        parcel.writeString(this.AEQbTJ);
        parcel.writeParcelable(this.OLrzqt, i);
    }

    public EscapeTransactionData(@NotNull PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull String str, PasskeyAuthenticateResponse passkeyAuthenticateResponse) {
        Intrinsics.checkNotNullParameter(passkeyAuthenticateRequest, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = passkeyAuthenticateRequest;
        this.AEQbTJ = str;
        this.OLrzqt = passkeyAuthenticateResponse;
    }
}
