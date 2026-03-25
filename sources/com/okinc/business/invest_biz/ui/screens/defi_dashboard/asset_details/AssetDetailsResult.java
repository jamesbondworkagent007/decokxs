package com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class AssetDetailsResult implements Parcelable {
    public static final Parcelable.Creator<AssetDetailsResult> CREATOR = new Creator();
    public final long AEQbTJ;
    public final long EZpvd;
    public final AssetDetailsResultType KWHzl;
    public final String OLrzqt;

    public static final class Creator implements Parcelable.Creator<AssetDetailsResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDetailsResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetDetailsResult(AssetDetailsResultType.valueOf(parcel.readString()), parcel.readLong(), parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetDetailsResult[] newArray(int i) {
            return new AssetDetailsResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AssetDetailsResult copy$default(AssetDetailsResult assetDetailsResult, AssetDetailsResultType assetDetailsResultType, long j, long j2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            assetDetailsResultType = assetDetailsResult.KWHzl;
        }
        if ((i & 2) != 0) {
            j = assetDetailsResult.AEQbTJ;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = assetDetailsResult.EZpvd;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            str = assetDetailsResult.OLrzqt;
        }
        return assetDetailsResult.EZpvd(assetDetailsResultType, j3, j4, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetDetailsResult EZpvd(@NotNull AssetDetailsResultType assetDetailsResultType, long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(assetDetailsResultType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new AssetDetailsResult(assetDetailsResultType, j, j2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetDetailsResultType copydefault() {
        return this.KWHzl;
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
        if (!(obj instanceof AssetDetailsResult)) {
            return false;
        }
        AssetDetailsResult assetDetailsResult = (AssetDetailsResult) obj;
        return this.KWHzl == assetDetailsResult.KWHzl && this.AEQbTJ == assetDetailsResult.AEQbTJ && this.EZpvd == assetDetailsResult.EZpvd && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) assetDetailsResult.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + Long.hashCode(this.AEQbTJ)) * 31) + Long.hashCode(this.EZpvd)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetDetailsResult(action=" + this.KWHzl + ", chainId=" + this.AEQbTJ + ", investmentId=" + this.EZpvd + ", tokenId=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl.name());
        parcel.writeLong(this.AEQbTJ);
        parcel.writeLong(this.EZpvd);
        parcel.writeString(this.OLrzqt);
    }

    public AssetDetailsResult(@NotNull AssetDetailsResultType assetDetailsResultType, long j, long j2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(assetDetailsResultType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = assetDetailsResultType;
        this.AEQbTJ = j;
        this.EZpvd = j2;
        this.OLrzqt = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (r6v0 com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResultType)
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r7v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r9v0 long) : (0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResultType, long, long, java.lang.String):void (m)] (LINE:143) call: com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResult.<init>(com.okinc.business.invest_biz.ui.screens.defi_dashboard.asset_details.AssetDetailsResultType, long, long, java.lang.String):void type: THIS */
    public /* synthetic */ AssetDetailsResult(AssetDetailsResultType assetDetailsResultType, long j, long j2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(assetDetailsResultType, (i & 2) != 0 ? 0L : j, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? "" : str);
    }
}
