package com.okinc.account.api.model.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.account.api.model.wallet.BindWalletDeeplinkMetadata;
import com.okinc.account.api.model.wallet.BindWalletInput;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class BindWalletInWalletAppInput implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BindWalletInWalletAppInput> CREATOR = new Creator();
    private final BindWalletInput.EntryPoint bindFlowEntryPoint;
    private final BindWalletDeeplinkMetadata.Intention intention;
    private final boolean isSkippable;
    private final String token;

    public static final class Creator implements Parcelable.Creator<BindWalletInWalletAppInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindWalletInWalletAppInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BindWalletInWalletAppInput(BindWalletDeeplinkMetadata.Intention.CREATOR.createFromParcel(parcel), parcel.readString(), BindWalletInput.EntryPoint.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BindWalletInWalletAppInput[] newArray(int i) {
            return new BindWalletInWalletAppInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BindWalletInWalletAppInput copy$default(BindWalletInWalletAppInput bindWalletInWalletAppInput, BindWalletDeeplinkMetadata.Intention intention, String str, BindWalletInput.EntryPoint entryPoint, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            intention = bindWalletInWalletAppInput.intention;
        }
        if ((i & 2) != 0) {
            str = bindWalletInWalletAppInput.token;
        }
        if ((i & 4) != 0) {
            entryPoint = bindWalletInWalletAppInput.bindFlowEntryPoint;
        }
        if ((i & 8) != 0) {
            z = bindWalletInWalletAppInput.isSkippable;
        }
        return bindWalletInWalletAppInput.copy(intention, str, entryPoint, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletDeeplinkMetadata.Intention component1() {
        return this.intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletInput.EntryPoint component3() {
        return this.bindFlowEntryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSkippable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletInWalletAppInput copy(@NotNull BindWalletDeeplinkMetadata.Intention intention, String str, @NotNull BindWalletInput.EntryPoint entryPoint, boolean z) {
        Intrinsics.checkNotNullParameter(intention, "");
        Intrinsics.checkNotNullParameter(entryPoint, "");
        return new BindWalletInWalletAppInput(intention, str, entryPoint, z);
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
        if (!(obj instanceof BindWalletInWalletAppInput)) {
            return false;
        }
        BindWalletInWalletAppInput bindWalletInWalletAppInput = (BindWalletInWalletAppInput) obj;
        return this.intention == bindWalletInWalletAppInput.intention && Intrinsics.EZpvd((Object) this.token, (Object) bindWalletInWalletAppInput.token) && this.bindFlowEntryPoint == bindWalletInWalletAppInput.bindFlowEntryPoint && this.isSkippable == bindWalletInWalletAppInput.isSkippable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletInput.EntryPoint getBindFlowEntryPoint() {
        return this.bindFlowEntryPoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BindWalletDeeplinkMetadata.Intention getIntention() {
        return this.intention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.intention.hashCode();
        String str = this.token;
        return (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.bindFlowEntryPoint.hashCode()) * 31) + Boolean.hashCode(this.isSkippable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSkippable() {
        return this.isSkippable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BindWalletInWalletAppInput(intention=" + this.intention + ", token=" + this.token + ", bindFlowEntryPoint=" + this.bindFlowEntryPoint + ", isSkippable=" + this.isSkippable + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.intention.writeToParcel(parcel, i);
        parcel.writeString(this.token);
        this.bindFlowEntryPoint.writeToParcel(parcel, i);
        parcel.writeInt(this.isSkippable ? 1 : 0);
    }

    public BindWalletInWalletAppInput(@NotNull BindWalletDeeplinkMetadata.Intention intention, String str, @NotNull BindWalletInput.EntryPoint entryPoint, boolean z) {
        Intrinsics.checkNotNullParameter(intention, "");
        Intrinsics.checkNotNullParameter(entryPoint, "");
        this.intention = intention;
        this.token = str;
        this.bindFlowEntryPoint = entryPoint;
        this.isSkippable = z;
    }
}
