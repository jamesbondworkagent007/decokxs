package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TeeAndEip7702Item implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<TeeAndEip7702Item> CREATOR = new Creator();
    private final String accountId;
    private final String teeId;

    public static final class Creator implements Parcelable.Creator<TeeAndEip7702Item> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAndEip7702Item createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TeeAndEip7702Item(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeAndEip7702Item[] newArray(int i) {
            return new TeeAndEip7702Item[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TeeAndEip7702Item copy$default(TeeAndEip7702Item teeAndEip7702Item, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teeAndEip7702Item.accountId;
        }
        if ((i & 2) != 0) {
            str2 = teeAndEip7702Item.teeId;
        }
        return teeAndEip7702Item.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeAndEip7702Item copy(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new TeeAndEip7702Item(str, str2);
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
        if (!(obj instanceof TeeAndEip7702Item)) {
            return false;
        }
        TeeAndEip7702Item teeAndEip7702Item = (TeeAndEip7702Item) obj;
        return Intrinsics.EZpvd((Object) this.accountId, (Object) teeAndEip7702Item.accountId) && Intrinsics.EZpvd((Object) this.teeId, (Object) teeAndEip7702Item.teeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTeeId() {
        return this.teeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.accountId.hashCode();
        String str = this.teeId;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeAndEip7702Item(accountId=" + this.accountId + ", teeId=" + this.teeId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.accountId);
        parcel.writeString(this.teeId);
    }

    public TeeAndEip7702Item(@NotNull String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.accountId = str;
        this.teeId = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:17) call: com.okinc.business.defi.biz.net.bean.TeeAndEip7702Item.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TeeAndEip7702Item(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }
}
