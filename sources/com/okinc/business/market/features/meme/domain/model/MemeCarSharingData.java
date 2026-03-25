package com.okinc.business.market.features.meme.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeCarSharingData implements Parcelable {
    public static final Parcelable.Creator<MemeCarSharingData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final MemeCarSharingType EZpvd;
    public final long KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<MemeCarSharingData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeCarSharingData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MemeCarSharingData(parcel.readLong(), parcel.readString(), MemeCarSharingType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MemeCarSharingData[] newArray(int i) {
            return new MemeCarSharingData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeCarSharingData() {
        this(0L, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MemeCarSharingData copy$default(MemeCarSharingData memeCarSharingData, long j, String str, MemeCarSharingType memeCarSharingType, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = memeCarSharingData.KWHzl;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = memeCarSharingData.copydefault;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            memeCarSharingType = memeCarSharingData.EZpvd;
        }
        MemeCarSharingType memeCarSharingType2 = memeCarSharingType;
        if ((i & 8) != 0) {
            str2 = memeCarSharingData.OLrzqt;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = memeCarSharingData.AEQbTJ;
        }
        return memeCarSharingData.EZpvd(j2, str4, memeCarSharingType2, str5, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeCarSharingData EZpvd(long j, @NotNull String str, @NotNull MemeCarSharingType memeCarSharingType, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeCarSharingType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new MemeCarSharingData(j, str, memeCarSharingType, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeCarSharingType copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof MemeCarSharingData)) {
            return false;
        }
        MemeCarSharingData memeCarSharingData = (MemeCarSharingData) obj;
        return this.KWHzl == memeCarSharingData.KWHzl && Intrinsics.EZpvd((Object) this.copydefault, (Object) memeCarSharingData.copydefault) && this.EZpvd == memeCarSharingData.EZpvd && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) memeCarSharingData.OLrzqt) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) memeCarSharingData.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((Long.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeCarSharingData(signalTimestamp=" + this.KWHzl + ", signalAmt=" + this.copydefault + ", signalType=" + this.EZpvd + ", sameCarNum=" + this.OLrzqt + ", followingSameCarNum=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.KWHzl);
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd.name());
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AEQbTJ);
    }

    public MemeCarSharingData(long j, @NotNull String str, @NotNull MemeCarSharingType memeCarSharingType, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(memeCarSharingType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = j;
        this.copydefault = str;
        this.EZpvd = memeCarSharingType;
        this.OLrzqt = str2;
        this.AEQbTJ = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:long:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r8v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:com.okinc.business.market.features.meme.domain.model.MemeCarSharingType:0x0016: TERNARY null = ((wrap:int:0x0010: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.market.features.meme.domain.model.MemeCarSharingType:0x0014: SGET  A[WRAPPED] (LINE:51) com.okinc.business.market.features.meme.domain.model.MemeCarSharingType.SMART_MONEY com.okinc.business.market.features.meme.domain.model.MemeCarSharingType) : (r11v0 com.okinc.business.market.features.meme.domain.model.MemeCarSharingType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
 A[MD:(long, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeCarSharingType, java.lang.String, java.lang.String):void (m)] (LINE:47) call: com.okinc.business.market.features.meme.domain.model.MemeCarSharingData.<init>(long, java.lang.String, com.okinc.business.market.features.meme.domain.model.MemeCarSharingType, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MemeCarSharingData(long j, String str, MemeCarSharingType memeCarSharingType, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? MemeCarSharingType.SMART_MONEY : memeCarSharingType, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3);
    }
}
