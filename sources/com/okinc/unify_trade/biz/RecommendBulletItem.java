package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RecommendBulletItem implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RecommendBulletItem> CREATOR = new Creator();
    private final String amount;
    private final String bulletChatType;
    private final String nickName;
    private final String portrait;
    private String sectorId;
    private String sectorName;
    private String symbol;
    private String targetId;
    private final String underlyingId;

    public static final class Creator implements Parcelable.Creator<RecommendBulletItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendBulletItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecommendBulletItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendBulletItem[] newArray(int i) {
            return new RecommendBulletItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendBulletItem() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.underlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bulletChatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sectorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sectorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendBulletItem copy(String str, String str2, String str3, String str4, String str5, @NotNull String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str6, "");
        return new RecommendBulletItem(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof RecommendBulletItem)) {
            return false;
        }
        RecommendBulletItem recommendBulletItem = (RecommendBulletItem) obj;
        return Intrinsics.EZpvd((Object) this.underlyingId, (Object) recommendBulletItem.underlyingId) && Intrinsics.EZpvd((Object) this.nickName, (Object) recommendBulletItem.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) recommendBulletItem.portrait) && Intrinsics.EZpvd((Object) this.bulletChatType, (Object) recommendBulletItem.bulletChatType) && Intrinsics.EZpvd((Object) this.amount, (Object) recommendBulletItem.amount) && Intrinsics.EZpvd((Object) this.sectorId, (Object) recommendBulletItem.sectorId) && Intrinsics.EZpvd((Object) this.sectorName, (Object) recommendBulletItem.sectorName) && Intrinsics.EZpvd((Object) this.targetId, (Object) recommendBulletItem.targetId) && Intrinsics.EZpvd((Object) this.symbol, (Object) recommendBulletItem.symbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBulletChatType() {
        return this.bulletChatType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPortrait() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectorId() {
        return this.sectorId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSectorName() {
        return this.sectorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnderlyingId() {
        return this.underlyingId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.underlyingId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.nickName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.portrait;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bulletChatType;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.amount;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        int iHashCode6 = this.sectorId.hashCode();
        String str6 = this.sectorName;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.targetId;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.symbol;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSectorId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sectorId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSectorName(String str) {
        this.sectorName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetId(String str) {
        this.targetId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendBulletItem(underlyingId=" + this.underlyingId + ", nickName=" + this.nickName + ", portrait=" + this.portrait + ", bulletChatType=" + this.bulletChatType + ", amount=" + this.amount + ", sectorId=" + this.sectorId + ", sectorName=" + this.sectorName + ", targetId=" + this.targetId + ", symbol=" + this.symbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.underlyingId);
        parcel.writeString(this.nickName);
        parcel.writeString(this.portrait);
        parcel.writeString(this.bulletChatType);
        parcel.writeString(this.amount);
        parcel.writeString(this.sectorId);
        parcel.writeString(this.sectorName);
        parcel.writeString(this.targetId);
        parcel.writeString(this.symbol);
    }

    public RecommendBulletItem(String str, String str2, String str3, String str4, String str5, @NotNull String str6, String str7, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str6, "");
        this.underlyingId = str;
        this.nickName = str2;
        this.portrait = str3;
        this.bulletChatType = str4;
        this.amount = str5;
        this.sectorId = str6;
        this.sectorName = str7;
        this.targetId = str8;
        this.symbol = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003f: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1499) call: com.okinc.unify_trade.biz.RecommendBulletItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecommendBulletItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
