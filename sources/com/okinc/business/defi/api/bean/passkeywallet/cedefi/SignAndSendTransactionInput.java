package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class SignAndSendTransactionInput implements Parcelable {
    public static final Parcelable.Creator<SignAndSendTransactionInput> CREATOR = new Creator();
    public final SignAndSendTransactionSource AEQbTJ;
    public final String OLrzqt;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<SignAndSendTransactionInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignAndSendTransactionInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignAndSendTransactionInput(SignAndSendTransactionSource.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignAndSendTransactionInput[] newArray(int i) {
            return new SignAndSendTransactionInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignAndSendTransactionInput copy$default(SignAndSendTransactionInput signAndSendTransactionInput, SignAndSendTransactionSource signAndSendTransactionSource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            signAndSendTransactionSource = signAndSendTransactionInput.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = signAndSendTransactionInput.OLrzqt;
        }
        return signAndSendTransactionInput.EZpvd(signAndSendTransactionSource, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAndSendTransactionInput EZpvd(@NotNull SignAndSendTransactionSource signAndSendTransactionSource, @NotNull String str) {
        Intrinsics.checkNotNullParameter(signAndSendTransactionSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new SignAndSendTransactionInput(signAndSendTransactionSource, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignAndSendTransactionSource KWHzl() {
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
        if (!(obj instanceof SignAndSendTransactionInput)) {
            return false;
        }
        SignAndSendTransactionInput signAndSendTransactionInput = (SignAndSendTransactionInput) obj;
        return this.AEQbTJ == signAndSendTransactionInput.AEQbTJ && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) signAndSendTransactionInput.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignAndSendTransactionInput(source=" + this.AEQbTJ + ", orderId=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ.name());
        parcel.writeString(this.OLrzqt);
    }

    public SignAndSendTransactionInput(@NotNull SignAndSendTransactionSource signAndSendTransactionSource, @NotNull String str) {
        Intrinsics.checkNotNullParameter(signAndSendTransactionSource, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = signAndSendTransactionSource;
        this.OLrzqt = str;
    }
}
