package com.okinc.tradingbot.impl.strategy.itembinder;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class TacticsContentThumbnailData implements Parcelable {
    public static final Parcelable.Creator<TacticsContentThumbnailData> CREATOR = new Creator();
    public boolean AEQbTJ;
    public String EZpvd;
    public final String KWHzl;
    public String OLrzqt;

    public static final class Creator implements Parcelable.Creator<TacticsContentThumbnailData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsContentThumbnailData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TacticsContentThumbnailData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TacticsContentThumbnailData[] newArray(int i) {
            return new TacticsContentThumbnailData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TacticsContentThumbnailData() {
        this(null, null, null, false, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TacticsContentThumbnailData copy$default(TacticsContentThumbnailData tacticsContentThumbnailData, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tacticsContentThumbnailData.EZpvd;
        }
        if ((i & 2) != 0) {
            str2 = tacticsContentThumbnailData.OLrzqt;
        }
        if ((i & 4) != 0) {
            str3 = tacticsContentThumbnailData.KWHzl;
        }
        if ((i & 8) != 0) {
            z = tacticsContentThumbnailData.AEQbTJ;
        }
        return tacticsContentThumbnailData.AEQbTJ(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TacticsContentThumbnailData AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TacticsContentThumbnailData(str, str2, str3, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof TacticsContentThumbnailData)) {
            return false;
        }
        TacticsContentThumbnailData tacticsContentThumbnailData = (TacticsContentThumbnailData) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) tacticsContentThumbnailData.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) tacticsContentThumbnailData.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) tacticsContentThumbnailData.KWHzl) && this.AEQbTJ == tacticsContentThumbnailData.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TacticsContentThumbnailData(title=" + this.EZpvd + ", text=" + this.OLrzqt + ", thumbnailText=" + this.KWHzl + ", isNeedShowThumbnail=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeInt(this.AEQbTJ ? 1 : 0);
    }

    public TacticsContentThumbnailData(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.EZpvd = str;
        this.OLrzqt = str2;
        this.KWHzl = str3;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r5v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:349) call: com.okinc.tradingbot.impl.strategy.itembinder.TacticsContentThumbnailData.<init>(java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ TacticsContentThumbnailData(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
    }
}
