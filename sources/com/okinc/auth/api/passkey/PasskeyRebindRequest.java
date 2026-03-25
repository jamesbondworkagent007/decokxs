package com.okinc.auth.api.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PasskeyRebindRequest implements Parcelable {
    public static final Parcelable.Creator<PasskeyRebindRequest> CREATOR = new Creator();
    public final PasskeyPromotionAuthenticator AEQbTJ;
    public final String KWHzl;
    public final PasskeyScenario copydefault;

    /* JADX INFO: loaded from: classes17.dex */
    public static final class Creator implements Parcelable.Creator<PasskeyRebindRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRebindRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PasskeyRebindRequest(parcel.readString(), (PasskeyPromotionAuthenticator) parcel.readParcelable(PasskeyRebindRequest.class.getClassLoader()), (PasskeyScenario) parcel.readParcelable(PasskeyRebindRequest.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PasskeyRebindRequest[] newArray(int i) {
            return new PasskeyRebindRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PasskeyRebindRequest copy$default(PasskeyRebindRequest passkeyRebindRequest, String str, PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, PasskeyScenario passkeyScenario, int i, Object obj) {
        if ((i & 1) != 0) {
            str = passkeyRebindRequest.KWHzl;
        }
        if ((i & 2) != 0) {
            passkeyPromotionAuthenticator = passkeyRebindRequest.AEQbTJ;
        }
        if ((i & 4) != 0) {
            passkeyScenario = passkeyRebindRequest.copydefault;
        }
        return passkeyRebindRequest.AEQbTJ(str, passkeyPromotionAuthenticator, passkeyScenario);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyRebindRequest AEQbTJ(@NotNull String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyScenario passkeyScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        return new PasskeyRebindRequest(str, passkeyPromotionAuthenticator, passkeyScenario);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyScenario AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PasskeyPromotionAuthenticator copydefault() {
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
        if (!(obj instanceof PasskeyRebindRequest)) {
            return false;
        }
        PasskeyRebindRequest passkeyRebindRequest = (PasskeyRebindRequest) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) passkeyRebindRequest.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, passkeyRebindRequest.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, passkeyRebindRequest.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PasskeyRebindRequest(workFlowToken=" + this.KWHzl + ", authenticator=" + this.AEQbTJ + ", passkeyScenario=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeParcelable(this.AEQbTJ, i);
        parcel.writeParcelable(this.copydefault, i);
    }

    public PasskeyRebindRequest(@NotNull String str, @NotNull PasskeyPromotionAuthenticator passkeyPromotionAuthenticator, @NotNull PasskeyScenario passkeyScenario) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(passkeyPromotionAuthenticator, "");
        Intrinsics.checkNotNullParameter(passkeyScenario, "");
        this.KWHzl = str;
        this.AEQbTJ = passkeyPromotionAuthenticator;
        this.copydefault = passkeyScenario;
    }
}
