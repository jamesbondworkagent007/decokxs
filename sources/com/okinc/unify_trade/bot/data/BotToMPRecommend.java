package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class BotToMPRecommend implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<BotToMPRecommend> CREATOR = new Creator();
    private final String backtestedArp;
    private final String instId;
    private final String instType;
    private final String sectorName;
    private final String underlyingId;
    private final String underlyingName;

    public static final class Creator implements Parcelable.Creator<BotToMPRecommend> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotToMPRecommend createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BotToMPRecommend(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BotToMPRecommend[] newArray(int i) {
            return new BotToMPRecommend[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotToMPRecommend() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotToMPRecommend copy$default(BotToMPRecommend botToMPRecommend, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botToMPRecommend.underlyingId;
        }
        if ((i & 2) != 0) {
            str2 = botToMPRecommend.underlyingName;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = botToMPRecommend.sectorName;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = botToMPRecommend.instId;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = botToMPRecommend.instType;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = botToMPRecommend.backtestedArp;
        }
        return botToMPRecommend.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.underlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.underlyingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.sectorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.backtestedArp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotToMPRecommend copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new BotToMPRecommend(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof BotToMPRecommend)) {
            return false;
        }
        BotToMPRecommend botToMPRecommend = (BotToMPRecommend) obj;
        return Intrinsics.EZpvd((Object) this.underlyingId, (Object) botToMPRecommend.underlyingId) && Intrinsics.EZpvd((Object) this.underlyingName, (Object) botToMPRecommend.underlyingName) && Intrinsics.EZpvd((Object) this.sectorName, (Object) botToMPRecommend.sectorName) && Intrinsics.EZpvd((Object) this.instId, (Object) botToMPRecommend.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) botToMPRecommend.instType) && Intrinsics.EZpvd((Object) this.backtestedArp, (Object) botToMPRecommend.backtestedArp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBacktestedArp() {
        return this.backtestedArp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectorName() {
        return this.sectorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingId() {
        return this.underlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingName() {
        return this.underlyingName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.underlyingId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.underlyingName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.sectorName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.instId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.instType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.backtestedArp;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotToMPRecommend(underlyingId=" + this.underlyingId + ", underlyingName=" + this.underlyingName + ", sectorName=" + this.sectorName + ", instId=" + this.instId + ", instType=" + this.instType + ", backtestedArp=" + this.backtestedArp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.underlyingId);
        parcel.writeString(this.underlyingName);
        parcel.writeString(this.sectorName);
        parcel.writeString(this.instId);
        parcel.writeString(this.instType);
        parcel.writeString(this.backtestedArp);
    }

    public BotToMPRecommend(String str, String str2, String str3, String str4, String str5, String str6) {
        this.underlyingId = str;
        this.underlyingName = str2;
        this.sectorName = str3;
        this.instId = str4;
        this.instType = str5;
        this.backtestedArp = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1426) call: com.okinc.unify_trade.bot.data.BotToMPRecommend.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BotToMPRecommend(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
