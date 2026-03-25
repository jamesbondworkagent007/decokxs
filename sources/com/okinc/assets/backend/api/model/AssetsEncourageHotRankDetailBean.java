package com.okinc.assets.backend.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class AssetsEncourageHotRankDetailBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<AssetsEncourageHotRankDetailBean> CREATOR = new Creator();
    private String currency;
    private Integer currencyId;
    private String high24h;
    private String idxPx;
    private String instId;
    private String low24h;
    private String open24h;
    private String sodUtc0;
    private String sodUtc8;
    private String ts;

    public static final class Creator implements Parcelable.Creator<AssetsEncourageHotRankDetailBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsEncourageHotRankDetailBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AssetsEncourageHotRankDetailBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssetsEncourageHotRankDetailBean[] newArray(int i) {
            return new AssetsEncourageHotRankDetailBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsEncourageHotRankDetailBean() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.idxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.high24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsEncourageHotRankDetailBean copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9) {
        return new AssetsEncourageHotRankDetailBean(str, str2, str3, str4, str5, str6, str7, str8, num, str9);
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
        if (!(obj instanceof AssetsEncourageHotRankDetailBean)) {
            return false;
        }
        AssetsEncourageHotRankDetailBean assetsEncourageHotRankDetailBean = (AssetsEncourageHotRankDetailBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) assetsEncourageHotRankDetailBean.instId) && Intrinsics.EZpvd((Object) this.idxPx, (Object) assetsEncourageHotRankDetailBean.idxPx) && Intrinsics.EZpvd((Object) this.high24h, (Object) assetsEncourageHotRankDetailBean.high24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) assetsEncourageHotRankDetailBean.sodUtc0) && Intrinsics.EZpvd((Object) this.open24h, (Object) assetsEncourageHotRankDetailBean.open24h) && Intrinsics.EZpvd((Object) this.low24h, (Object) assetsEncourageHotRankDetailBean.low24h) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) assetsEncourageHotRankDetailBean.sodUtc8) && Intrinsics.EZpvd((Object) this.ts, (Object) assetsEncourageHotRankDetailBean.ts) && Intrinsics.EZpvd(this.currencyId, assetsEncourageHotRankDetailBean.currencyId) && Intrinsics.EZpvd((Object) this.currency, (Object) assetsEncourageHotRankDetailBean.currency);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHigh24h() {
        return this.high24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIdxPx() {
        return this.idxPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLow24h() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.instId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.idxPx;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.high24h;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.sodUtc0;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.open24h;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.low24h;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.sodUtc8;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.ts;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        Integer num = this.currencyId;
        int iHashCode9 = num == null ? 0 : num.hashCode();
        String str9 = this.currency;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHigh24h(String str) {
        this.high24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIdxPx(String str) {
        this.idxPx = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(String str) {
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLow24h(String str) {
        this.low24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpen24h(String str) {
        this.open24h = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSodUtc0(String str) {
        this.sodUtc0 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSodUtc8(String str) {
        this.sodUtc8 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(String str) {
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsEncourageHotRankDetailBean(instId=" + this.instId + ", idxPx=" + this.idxPx + ", high24h=" + this.high24h + ", sodUtc0=" + this.sodUtc0 + ", open24h=" + this.open24h + ", low24h=" + this.low24h + ", sodUtc8=" + this.sodUtc8 + ", ts=" + this.ts + ", currencyId=" + this.currencyId + ", currency=" + this.currency + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.idxPx);
        parcel.writeString(this.high24h);
        parcel.writeString(this.sodUtc0);
        parcel.writeString(this.open24h);
        parcel.writeString(this.low24h);
        parcel.writeString(this.sodUtc8);
        parcel.writeString(this.ts);
        Integer num = this.currencyId;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.currency);
    }

    public AssetsEncourageHotRankDetailBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9) {
        this.instId = str;
        this.idxPx = str2;
        this.high24h = str3;
        this.sodUtc0 = str4;
        this.open24h = str5;
        this.low24h = str6;
        this.sodUtc8 = str7;
        this.ts = str8;
        this.currencyId = num;
        this.currency = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0064: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003f: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r20v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r22v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:9) call: com.okinc.assets.backend.api.model.AssetsEncourageHotRankDetailBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ AssetsEncourageHotRankDetailBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Integer num, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? -1 : num, (i & 512) == 0 ? str9 : null);
    }
}
