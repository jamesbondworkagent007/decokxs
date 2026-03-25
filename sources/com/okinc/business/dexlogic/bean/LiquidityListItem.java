package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class LiquidityListItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LiquidityListItem> CREATOR = new Creator();
    private final String id;
    private boolean isSelected;
    private final String logo;
    private final String name;

    public static final class Creator implements Parcelable.Creator<LiquidityListItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityListItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LiquidityListItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiquidityListItem[] newArray(int i) {
            return new LiquidityListItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiquidityListItem() {
        this(null, null, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LiquidityListItem copy$default(LiquidityListItem liquidityListItem, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liquidityListItem.id;
        }
        if ((i & 2) != 0) {
            str2 = liquidityListItem.name;
        }
        if ((i & 4) != 0) {
            str3 = liquidityListItem.logo;
        }
        if ((i & 8) != 0) {
            z = liquidityListItem.isSelected;
        }
        return liquidityListItem.copy(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiquidityListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LiquidityListItem(str, str2, str3, z);
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
        if (!(obj instanceof LiquidityListItem)) {
            return false;
        }
        LiquidityListItem liquidityListItem = (LiquidityListItem) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) liquidityListItem.id) && Intrinsics.EZpvd((Object) this.name, (Object) liquidityListItem.name) && Intrinsics.EZpvd((Object) this.logo, (Object) liquidityListItem.logo) && this.isSelected == liquidityListItem.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.logo.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LiquidityListItem(id=" + this.id + ", name=" + this.name + ", logo=" + this.logo + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.logo);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public LiquidityListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.name = str2;
        this.logo = str3;
        this.isSelected = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? true : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:26) call: com.okinc.business.dexlogic.bean.LiquidityListItem.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ LiquidityListItem(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? true : z);
    }
}
