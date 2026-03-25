package com.okinc.business.web3pay.lib.features.paytransaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.web3pay.lib.core.model.ProjectId;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PrepareClaimParams implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PrepareClaimParams> CREATOR = new Creator();
    private final String orderId;
    private final ProjectId projectId;

    public static final class Creator implements Parcelable.Creator<PrepareClaimParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrepareClaimParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PrepareClaimParams(parcel.readString(), ProjectId.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PrepareClaimParams[] newArray(int i) {
            return new PrepareClaimParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PrepareClaimParams copy$default(PrepareClaimParams prepareClaimParams, String str, ProjectId projectId, int i, Object obj) {
        if ((i & 1) != 0) {
            str = prepareClaimParams.orderId;
        }
        if ((i & 2) != 0) {
            projectId = prepareClaimParams.projectId;
        }
        return prepareClaimParams.copy(str, projectId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectId component2() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrepareClaimParams copy(@NotNull String str, @NotNull ProjectId projectId) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        return new PrepareClaimParams(str, projectId);
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
        if (!(obj instanceof PrepareClaimParams)) {
            return false;
        }
        PrepareClaimParams prepareClaimParams = (PrepareClaimParams) obj;
        return Intrinsics.EZpvd((Object) this.orderId, (Object) prepareClaimParams.orderId) && this.projectId == prepareClaimParams.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProjectId getProjectId() {
        return this.projectId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.orderId.hashCode() * 31) + this.projectId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PrepareClaimParams(orderId=" + this.orderId + ", projectId=" + this.projectId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.orderId);
        parcel.writeString(this.projectId.name());
    }

    public PrepareClaimParams(@NotNull String str, @NotNull ProjectId projectId) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(projectId, "");
        this.orderId = str;
        this.projectId = projectId;
    }
}
