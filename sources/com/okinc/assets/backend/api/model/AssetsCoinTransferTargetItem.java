package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AssetsCoinTransferTargetItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AssetsCoinTransferTargetItem> CREATOR = new Creator();
    private final String available;
    private final String name;
    private final int productId;

    public static final class Creator implements Parcelable.Creator<AssetsCoinTransferTargetItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsCoinTransferTargetItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetsCoinTransferTargetItem(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsCoinTransferTargetItem[] newArray(int i) {
            return new AssetsCoinTransferTargetItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsCoinTransferTargetItem() {
        this(null, null, 0, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetsCoinTransferTargetItem copy$default(AssetsCoinTransferTargetItem assetsCoinTransferTargetItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetsCoinTransferTargetItem.available;
        }
        if ((i2 & 2) != 0) {
            str2 = assetsCoinTransferTargetItem.name;
        }
        if ((i2 & 4) != 0) {
            i = assetsCoinTransferTargetItem.productId;
        }
        return assetsCoinTransferTargetItem.copy(str, str2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsCoinTransferTargetItem copy(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AssetsCoinTransferTargetItem(str, str2, i);
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
        if (!(obj instanceof AssetsCoinTransferTargetItem)) {
            return false;
        }
        AssetsCoinTransferTargetItem assetsCoinTransferTargetItem = (AssetsCoinTransferTargetItem) obj;
        return Intrinsics.EZpvd((Object) this.available, (Object) assetsCoinTransferTargetItem.available) && Intrinsics.EZpvd((Object) this.name, (Object) assetsCoinTransferTargetItem.name) && this.productId == assetsCoinTransferTargetItem.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailable() {
        return this.available;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProductId() {
        return this.productId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.available.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.productId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsCoinTransferTargetItem(available=" + this.available + ", name=" + this.name + ", productId=" + this.productId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.available);
        parcel.writeString(this.name);
        parcel.writeInt(this.productId);
    }

    public AssetsCoinTransferTargetItem(@NotNull String str, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.available = str;
        this.name = str2;
        this.productId = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
 A[MD:(java.lang.String, java.lang.String, int):void (m)] (LINE:33) call: com.okinc.assets.backend.api.model.AssetsCoinTransferTargetItem.<init>(java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ AssetsCoinTransferTargetItem(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i);
    }
}
