package com.okinc.business.defi.wallet.passkey.common.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.auth.api.passkey.PasskeyAuthenticateRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class InternalTransactionInput implements Parcelable {
    public final PasskeyAuthenticateRequest AEQbTJ;
    public final String KWHzl;
    public static final int EZpvd = PasskeyAuthenticateRequest.$stable;
    public static final Parcelable.Creator<InternalTransactionInput> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<InternalTransactionInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalTransactionInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InternalTransactionInput((PasskeyAuthenticateRequest) parcel.readParcelable(InternalTransactionInput.class.getClassLoader()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InternalTransactionInput[] newArray(int i) {
            return new InternalTransactionInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InternalTransactionInput copy$default(InternalTransactionInput internalTransactionInput, PasskeyAuthenticateRequest passkeyAuthenticateRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            passkeyAuthenticateRequest = internalTransactionInput.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = internalTransactionInput.KWHzl;
        }
        return internalTransactionInput.KWHzl(passkeyAuthenticateRequest, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InternalTransactionInput KWHzl(PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new InternalTransactionInput(passkeyAuthenticateRequest, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyAuthenticateRequest OLrzqt() {
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
        if (!(obj instanceof InternalTransactionInput)) {
            return false;
        }
        InternalTransactionInput internalTransactionInput = (InternalTransactionInput) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, internalTransactionInput.AEQbTJ) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) internalTransactionInput.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PasskeyAuthenticateRequest passkeyAuthenticateRequest = this.AEQbTJ;
        return ((passkeyAuthenticateRequest == null ? 0 : passkeyAuthenticateRequest.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InternalTransactionInput(serverOption=" + this.AEQbTJ + ", chainIndex=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.AEQbTJ, i);
        parcel.writeString(this.KWHzl);
    }

    public InternalTransactionInput(PasskeyAuthenticateRequest passkeyAuthenticateRequest, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = passkeyAuthenticateRequest;
        this.KWHzl = str;
    }
}
