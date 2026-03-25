package com.okinc.business.dexlogic.main.market.detail;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class TrackingAddressParams implements Parcelable {
    public static final Parcelable.Creator<TrackingAddressParams> CREATOR = new Creator();
    public final String EZpvd;
    public final String KWHzl;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<TrackingAddressParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackingAddressParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TrackingAddressParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackingAddressParams[] newArray(int i) {
            return new TrackingAddressParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrackingAddressParams() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TrackingAddressParams copy$default(TrackingAddressParams trackingAddressParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackingAddressParams.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = trackingAddressParams.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = trackingAddressParams.KWHzl;
        }
        return trackingAddressParams.KWHzl(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrackingAddressParams KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TrackingAddressParams(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
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
        if (!(obj instanceof TrackingAddressParams)) {
            return false;
        }
        TrackingAddressParams trackingAddressParams = (TrackingAddressParams) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) trackingAddressParams.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) trackingAddressParams.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) trackingAddressParams.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrackingAddressParams(chainId=" + this.copydefault + ", tokenContractAddress=" + this.EZpvd + ", tokenSymbol=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
    }

    public TrackingAddressParams(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:30) call: com.okinc.business.dexlogic.main.market.detail.TrackingAddressParams.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TrackingAddressParams(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
