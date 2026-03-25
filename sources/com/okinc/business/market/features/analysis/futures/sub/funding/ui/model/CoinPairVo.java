package com.okinc.business.market.features.analysis.futures.sub.funding.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CoinPairVo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CoinPairVo> CREATOR = new Creator();
    private final String instId;
    private final boolean isSelected;
    private final String title;

    public static final class Creator implements Parcelable.Creator<CoinPairVo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinPairVo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinPairVo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinPairVo[] newArray(int i) {
            return new CoinPairVo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinPairVo() {
        this(null, null, false, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinPairVo copy$default(CoinPairVo coinPairVo, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinPairVo.instId;
        }
        if ((i & 2) != 0) {
            str2 = coinPairVo.title;
        }
        if ((i & 4) != 0) {
            z = coinPairVo.isSelected;
        }
        return coinPairVo.copy(str, str2, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPairVo copy(String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        return new CoinPairVo(str, str2, z);
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
        if (!(obj instanceof CoinPairVo)) {
            return false;
        }
        CoinPairVo coinPairVo = (CoinPairVo) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) coinPairVo.instId) && Intrinsics.EZpvd((Object) this.title, (Object) coinPairVo.title) && this.isSelected == coinPairVo.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isSelected() {
        return this.isSelected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinPairVo(instId=" + this.instId + ", title=" + this.title + ", isSelected=" + this.isSelected + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.title);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }

    public CoinPairVo(String str, @NotNull String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str2, "");
        this.instId = str;
        this.title = str2;
        this.isSelected = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.String, java.lang.String, boolean):void (m)] (LINE:9) call: com.okinc.business.market.features.analysis.futures.sub.funding.ui.model.CoinPairVo.<init>(java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ CoinPairVo(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }
}
