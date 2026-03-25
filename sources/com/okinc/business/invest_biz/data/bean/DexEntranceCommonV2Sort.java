package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceCommonV2Sort implements Parcelable {
    public static final int $stable = 0;
    private final String property;
    private final String sortBy;
    public static final ActionBar Companion = new ActionBar(null);
    public static final Parcelable.Creator<DexEntranceCommonV2Sort> CREATOR = new Creator();
    private static final CommonV2Filter DEFAULT = new CommonV2Filter(null, null, null, null, null, 31, null);

    public static final class Creator implements Parcelable.Creator<DexEntranceCommonV2Sort> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEntranceCommonV2Sort createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexEntranceCommonV2Sort(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEntranceCommonV2Sort[] newArray(int i) {
            return new DexEntranceCommonV2Sort[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexEntranceCommonV2Sort() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexEntranceCommonV2Sort copy$default(DexEntranceCommonV2Sort dexEntranceCommonV2Sort, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexEntranceCommonV2Sort.property;
        }
        if ((i & 2) != 0) {
            str2 = dexEntranceCommonV2Sort.sortBy;
        }
        return dexEntranceCommonV2Sort.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.sortBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexEntranceCommonV2Sort copy(String str, String str2) {
        return new DexEntranceCommonV2Sort(str, str2);
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
        if (!(obj instanceof DexEntranceCommonV2Sort)) {
            return false;
        }
        DexEntranceCommonV2Sort dexEntranceCommonV2Sort = (DexEntranceCommonV2Sort) obj;
        return Intrinsics.EZpvd((Object) this.property, (Object) dexEntranceCommonV2Sort.property) && Intrinsics.EZpvd((Object) this.sortBy, (Object) dexEntranceCommonV2Sort.sortBy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProperty() {
        return this.property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSortBy() {
        return this.sortBy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.property;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.sortBy;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexEntranceCommonV2Sort(property=" + this.property + ", sortBy=" + this.sortBy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.property);
        parcel.writeString(this.sortBy);
    }

    public DexEntranceCommonV2Sort(String str, String str2) {
        this.property = str;
        this.sortBy = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:23) call: com.okinc.business.invest_biz.data.bean.DexEntranceCommonV2Sort.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexEntranceCommonV2Sort(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.DexEntranceCommonV2Sort.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
