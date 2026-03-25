package com.okinc.tradingbot.impl.market_place.bot_copy.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class CopyBotReqParam implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CopyBotReqParam> CREATOR = new Creator();
    private String actualMarginSz;
    private String autoMarginReloadMaxAmount;
    private boolean autoMarginReloadSwitch;
    private Boolean autoReserve;
    private final String baseSz;
    private String extraMarginSz;
    private String openPosSlippage;
    private final String quoteSz;
    private boolean reinvest;
    private final String safeOrdSz;

    public static final class Creator implements Parcelable.Creator<CopyBotReqParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CopyBotReqParam createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CopyBotReqParam(string, string2, string3, z, string4, boolValueOf, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CopyBotReqParam[] newArray(int i) {
            return new CopyBotReqParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CopyBotReqParam() {
        this(null, null, null, false, null, null, null, null, false, null, 1023, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.safeOrdSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.reinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CopyBotReqParam copy(String str, String str2, String str3, boolean z, String str4, Boolean bool, String str5, String str6, boolean z2, String str7) {
        return new CopyBotReqParam(str, str2, str3, z, str4, bool, str5, str6, z2, str7);
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
        if (!(obj instanceof CopyBotReqParam)) {
            return false;
        }
        CopyBotReqParam copyBotReqParam = (CopyBotReqParam) obj;
        return Intrinsics.EZpvd((Object) this.baseSz, (Object) copyBotReqParam.baseSz) && Intrinsics.EZpvd((Object) this.quoteSz, (Object) copyBotReqParam.quoteSz) && Intrinsics.EZpvd((Object) this.safeOrdSz, (Object) copyBotReqParam.safeOrdSz) && this.autoMarginReloadSwitch == copyBotReqParam.autoMarginReloadSwitch && Intrinsics.EZpvd((Object) this.autoMarginReloadMaxAmount, (Object) copyBotReqParam.autoMarginReloadMaxAmount) && Intrinsics.EZpvd(this.autoReserve, copyBotReqParam.autoReserve) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) copyBotReqParam.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) copyBotReqParam.extraMarginSz) && this.reinvest == copyBotReqParam.reinvest && Intrinsics.EZpvd((Object) this.openPosSlippage, (Object) copyBotReqParam.openPosSlippage);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAutoMarginReloadMaxAmount() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAutoMarginReloadSwitch() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoReserve() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseSz() {
        return this.baseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpenPosSlippage() {
        return this.openPosSlippage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSz() {
        return this.quoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getReinvest() {
        return this.reinvest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSafeOrdSz() {
        return this.safeOrdSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.baseSz;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.quoteSz;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.safeOrdSz;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = Boolean.hashCode(this.autoMarginReloadSwitch);
        String str4 = this.autoMarginReloadMaxAmount;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.autoReserve;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        String str5 = this.actualMarginSz;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.extraMarginSz;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        int iHashCode9 = Boolean.hashCode(this.reinvest);
        String str7 = this.openPosSlippage;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(String str) {
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoMarginReloadMaxAmount(String str) {
        this.autoMarginReloadMaxAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoMarginReloadSwitch(boolean z) {
        this.autoMarginReloadSwitch = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoReserve(Boolean bool) {
        this.autoReserve = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(String str) {
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOpenPosSlippage(String str) {
        this.openPosSlippage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvest(boolean z) {
        this.reinvest = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CopyBotReqParam(baseSz=" + this.baseSz + ", quoteSz=" + this.quoteSz + ", safeOrdSz=" + this.safeOrdSz + ", autoMarginReloadSwitch=" + this.autoMarginReloadSwitch + ", autoMarginReloadMaxAmount=" + this.autoMarginReloadMaxAmount + ", autoReserve=" + this.autoReserve + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", reinvest=" + this.reinvest + ", openPosSlippage=" + this.openPosSlippage + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseSz);
        parcel.writeString(this.quoteSz);
        parcel.writeString(this.safeOrdSz);
        parcel.writeInt(this.autoMarginReloadSwitch ? 1 : 0);
        parcel.writeString(this.autoMarginReloadMaxAmount);
        Boolean bool = this.autoReserve;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeString(this.actualMarginSz);
        parcel.writeString(this.extraMarginSz);
        parcel.writeInt(this.reinvest ? 1 : 0);
        parcel.writeString(this.openPosSlippage);
    }

    public CopyBotReqParam(String str, String str2, String str3, boolean z, String str4, Boolean bool, String str5, String str6, boolean z2, String str7) {
        this.baseSz = str;
        this.quoteSz = str2;
        this.safeOrdSz = str3;
        this.autoMarginReloadSwitch = z;
        this.autoMarginReloadMaxAmount = str4;
        this.autoReserve = bool;
        this.actualMarginSz = str5;
        this.extraMarginSz = str6;
        this.reinvest = z2;
        this.openPosSlippage = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0063: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r16v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r18v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0042: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r21v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r23v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:26) call: com.okinc.tradingbot.impl.market_place.bot_copy.bean.CopyBotReqParam.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ CopyBotReqParam(String str, String str2, String str3, boolean z, String str4, Boolean bool, String str5, String str6, boolean z2, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? Boolean.TRUE : bool, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) == 0 ? z2 : false, (i & 512) == 0 ? str7 : null);
    }
}
