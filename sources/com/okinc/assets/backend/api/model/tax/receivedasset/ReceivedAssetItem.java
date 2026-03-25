package com.okinc.assets.backend.api.model.tax.receivedasset;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class ReceivedAssetItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ReceivedAssetItem> CREATOR = new Creator();
    private final String currency;
    private final String fullName;
    private final String icon;

    public static final class Creator implements Parcelable.Creator<ReceivedAssetItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReceivedAssetItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReceivedAssetItem(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReceivedAssetItem[] newArray(int i) {
            return new ReceivedAssetItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ReceivedAssetItem() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReceivedAssetItem copy$default(ReceivedAssetItem receivedAssetItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = receivedAssetItem.fullName;
        }
        if ((i & 2) != 0) {
            str2 = receivedAssetItem.currency;
        }
        if ((i & 4) != 0) {
            str3 = receivedAssetItem.icon;
        }
        return receivedAssetItem.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReceivedAssetItem copy(String str, String str2, String str3) {
        return new ReceivedAssetItem(str, str2, str3);
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
        if (!(obj instanceof ReceivedAssetItem)) {
            return false;
        }
        ReceivedAssetItem receivedAssetItem = (ReceivedAssetItem) obj;
        return Intrinsics.EZpvd((Object) this.fullName, (Object) receivedAssetItem.fullName) && Intrinsics.EZpvd((Object) this.currency, (Object) receivedAssetItem.currency) && Intrinsics.EZpvd((Object) this.icon, (Object) receivedAssetItem.icon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.fullName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currency;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.icon;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReceivedAssetItem(fullName=" + this.fullName + ", currency=" + this.currency + ", icon=" + this.icon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.fullName);
        parcel.writeString(this.currency);
        parcel.writeString(this.icon);
    }

    public ReceivedAssetItem(String str, String str2, String str3) {
        this.fullName = str;
        this.currency = str2;
        this.icon = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:13) call: com.okinc.assets.backend.api.model.tax.receivedasset.ReceivedAssetItem.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ ReceivedAssetItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
