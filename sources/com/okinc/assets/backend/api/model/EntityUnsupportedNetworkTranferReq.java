package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class EntityUnsupportedNetworkTranferReq implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EntityUnsupportedNetworkTranferReq> CREATOR = new Creator();
    private final Long depositId;
    private final Integer subCurrencyId;

    public static final class Creator implements Parcelable.Creator<EntityUnsupportedNetworkTranferReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntityUnsupportedNetworkTranferReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EntityUnsupportedNetworkTranferReq(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EntityUnsupportedNetworkTranferReq[] newArray(int i) {
            return new EntityUnsupportedNetworkTranferReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EntityUnsupportedNetworkTranferReq copy$default(EntityUnsupportedNetworkTranferReq entityUnsupportedNetworkTranferReq, Integer num, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            num = entityUnsupportedNetworkTranferReq.subCurrencyId;
        }
        if ((i & 2) != 0) {
            l = entityUnsupportedNetworkTranferReq.depositId;
        }
        return entityUnsupportedNetworkTranferReq.copy(num, l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.depositId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EntityUnsupportedNetworkTranferReq copy(Integer num, Long l) {
        return new EntityUnsupportedNetworkTranferReq(num, l);
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
        if (!(obj instanceof EntityUnsupportedNetworkTranferReq)) {
            return false;
        }
        EntityUnsupportedNetworkTranferReq entityUnsupportedNetworkTranferReq = (EntityUnsupportedNetworkTranferReq) obj;
        return Intrinsics.EZpvd(this.subCurrencyId, entityUnsupportedNetworkTranferReq.subCurrencyId) && Intrinsics.EZpvd(this.depositId, entityUnsupportedNetworkTranferReq.depositId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getDepositId() {
        return this.depositId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.subCurrencyId;
        int iHashCode = num == null ? 0 : num.hashCode();
        Long l = this.depositId;
        return (iHashCode * 31) + (l != null ? l.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EntityUnsupportedNetworkTranferReq(subCurrencyId=" + this.subCurrencyId + ", depositId=" + this.depositId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.subCurrencyId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.depositId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
    }

    public EntityUnsupportedNetworkTranferReq(Integer num, Long l) {
        this.subCurrencyId = num;
        this.depositId = l;
    }
}
