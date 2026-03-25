package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class RecommendInvestItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RecommendInvestItem> CREATOR = new Creator();
    private final String amount;
    private final String investmentDuration;
    private final String nickName;
    private final String portrait;
    private final String symbol;
    private final String targetId;

    public static final class Creator implements Parcelable.Creator<RecommendInvestItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendInvestItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecommendInvestItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendInvestItem[] newArray(int i) {
            return new RecommendInvestItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RecommendInvestItem() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecommendInvestItem copy$default(RecommendInvestItem recommendInvestItem, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recommendInvestItem.nickName;
        }
        if ((i & 2) != 0) {
            str2 = recommendInvestItem.portrait;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = recommendInvestItem.amount;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = recommendInvestItem.investmentDuration;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = recommendInvestItem.targetId;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = recommendInvestItem.symbol;
        }
        return recommendInvestItem.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nickName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.portrait;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.investmentDuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecommendInvestItem copy(String str, String str2, String str3, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        return new RecommendInvestItem(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof RecommendInvestItem)) {
            return false;
        }
        RecommendInvestItem recommendInvestItem = (RecommendInvestItem) obj;
        return Intrinsics.EZpvd((Object) this.nickName, (Object) recommendInvestItem.nickName) && Intrinsics.EZpvd((Object) this.portrait, (Object) recommendInvestItem.portrait) && Intrinsics.EZpvd((Object) this.amount, (Object) recommendInvestItem.amount) && Intrinsics.EZpvd((Object) this.investmentDuration, (Object) recommendInvestItem.investmentDuration) && Intrinsics.EZpvd((Object) this.targetId, (Object) recommendInvestItem.targetId) && Intrinsics.EZpvd((Object) this.symbol, (Object) recommendInvestItem.symbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestmentDuration() {
        return this.investmentDuration;
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
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetId() {
        return this.targetId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.nickName;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.portrait;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.amount;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.investmentDuration.hashCode();
        String str4 = this.targetId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.symbol;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecommendInvestItem(nickName=" + this.nickName + ", portrait=" + this.portrait + ", amount=" + this.amount + ", investmentDuration=" + this.investmentDuration + ", targetId=" + this.targetId + ", symbol=" + this.symbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nickName);
        parcel.writeString(this.portrait);
        parcel.writeString(this.amount);
        parcel.writeString(this.investmentDuration);
        parcel.writeString(this.targetId);
        parcel.writeString(this.symbol);
    }

    public RecommendInvestItem(String str, String str2, String str3, @NotNull String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str4, "");
        this.nickName = str;
        this.portrait = str2;
        this.amount = str3;
        this.investmentDuration = str4;
        this.targetId = str5;
        this.symbol = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1513) call: com.okinc.unify_trade.biz.RecommendInvestItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ RecommendInvestItem(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}
