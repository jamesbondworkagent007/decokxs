package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AssetsCoinTransferTarget implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetsCoinTransferTarget> CREATOR = new Creator();
    private final String available;
    private final String name;
    private final List<AssetsCoinTransferTargetItem> products;
    private final int target;

    public static final class Creator implements Parcelable.Creator<AssetsCoinTransferTarget> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsCoinTransferTarget createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(AssetsCoinTransferTargetItem.CREATOR.createFromParcel(parcel));
            }
            return new AssetsCoinTransferTarget(string, string2, i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsCoinTransferTarget[] newArray(int i) {
            return new AssetsCoinTransferTarget[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsCoinTransferTarget() {
        this(null, null, 0, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.AssetsCoinTransferTarget */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetsCoinTransferTarget copy$default(AssetsCoinTransferTarget assetsCoinTransferTarget, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetsCoinTransferTarget.available;
        }
        if ((i2 & 2) != 0) {
            str2 = assetsCoinTransferTarget.name;
        }
        if ((i2 & 4) != 0) {
            i = assetsCoinTransferTarget.target;
        }
        if ((i2 & 8) != 0) {
            list = assetsCoinTransferTarget.products;
        }
        return assetsCoinTransferTarget.copy(str, str2, i, list);
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
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetsCoinTransferTargetItem> component4() {
        return this.products;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsCoinTransferTarget copy(@NotNull String str, @NotNull String str2, int i, @NotNull List<AssetsCoinTransferTargetItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AssetsCoinTransferTarget(str, str2, i, list);
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
        if (!(obj instanceof AssetsCoinTransferTarget)) {
            return false;
        }
        AssetsCoinTransferTarget assetsCoinTransferTarget = (AssetsCoinTransferTarget) obj;
        return Intrinsics.EZpvd((Object) this.available, (Object) assetsCoinTransferTarget.available) && Intrinsics.EZpvd((Object) this.name, (Object) assetsCoinTransferTarget.name) && this.target == assetsCoinTransferTarget.target && Intrinsics.EZpvd(this.products, assetsCoinTransferTarget.products);
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
    public final List<AssetsCoinTransferTargetItem> getProducts() {
        return this.products;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTarget() {
        return this.target;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.available.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.target)) * 31) + this.products.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsCoinTransferTarget(available=" + this.available + ", name=" + this.name + ", target=" + this.target + ", products=" + this.products + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.available);
        parcel.writeString(this.name);
        parcel.writeInt(this.target);
        List<AssetsCoinTransferTargetItem> list = this.products;
        parcel.writeInt(list.size());
        Iterator<AssetsCoinTransferTargetItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public AssetsCoinTransferTarget(@NotNull String str, @NotNull String str2, int i, @NotNull List<AssetsCoinTransferTargetItem> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.available = str;
        this.name = str2;
        this.target = i;
        this.products = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r4v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0015: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:28)) : (r5v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, int, java.util.List<com.okinc.assets.backend.api.model.AssetsCoinTransferTargetItem>):void (m)] (LINE:24) call: com.okinc.assets.backend.api.model.AssetsCoinTransferTarget.<init>(java.lang.String, java.lang.String, int, java.util.List):void type: THIS */
    public /* synthetic */ AssetsCoinTransferTarget(String str, String str2, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? yDY.AhwBna() : list);
    }
}
