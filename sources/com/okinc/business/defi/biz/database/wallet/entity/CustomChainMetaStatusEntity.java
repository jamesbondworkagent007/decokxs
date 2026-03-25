package com.okinc.business.defi.biz.database.wallet.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class CustomChainMetaStatusEntity implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CustomChainMetaStatusEntity> CREATOR = new Creator();
    private long chainId;
    private int used;

    public static final class Creator implements Parcelable.Creator<CustomChainMetaStatusEntity> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainMetaStatusEntity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CustomChainMetaStatusEntity(parcel.readLong(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomChainMetaStatusEntity[] newArray(int i) {
            return new CustomChainMetaStatusEntity[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CustomChainMetaStatusEntity() {
        this(0L, 0, 3, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CustomChainMetaStatusEntity copy$default(CustomChainMetaStatusEntity customChainMetaStatusEntity, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = customChainMetaStatusEntity.chainId;
        }
        if ((i2 & 2) != 0) {
            i = customChainMetaStatusEntity.used;
        }
        return customChainMetaStatusEntity.copy(j, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.used;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CustomChainMetaStatusEntity copy(long j, int i) {
        return new CustomChainMetaStatusEntity(j, i);
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
        if (!(obj instanceof CustomChainMetaStatusEntity)) {
            return false;
        }
        CustomChainMetaStatusEntity customChainMetaStatusEntity = (CustomChainMetaStatusEntity) obj;
        return this.chainId == customChainMetaStatusEntity.chainId && this.used == customChainMetaStatusEntity.used;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUsed() {
        return this.used;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.chainId) * 31) + Integer.hashCode(this.used);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainId(long j) {
        this.chainId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsed(int i) {
        this.used = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CustomChainMetaStatusEntity(chainId=" + this.chainId + ", used=" + this.used + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.used);
    }

    public CustomChainMetaStatusEntity(long j, int i) {
        this.chainId = j;
        this.used = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r1v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 int))
 A[MD:(long, int):void (m)] (LINE:16) call: com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaStatusEntity.<init>(long, int):void type: THIS */
    public /* synthetic */ CustomChainMetaStatusEntity(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i);
    }
}
