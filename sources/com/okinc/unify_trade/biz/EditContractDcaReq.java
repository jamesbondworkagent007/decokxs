package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class EditContractDcaReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EditContractDcaReq> CREATOR = new Creator();
    private String algoId;
    private String amt;
    private String autoMarginReloadMaxAmount;
    private boolean autoMarginReloadSwitch;
    private String diffAmt;
    private String editStrategyType;
    private String ordId;
    private String ordType;
    private String px;
    private String reinvestment;
    private String targetSlPrice;
    private String targetTpPrice;
    private List<DcaTriggerParam> triggerParams;

    public static final class Creator implements Parcelable.Creator<EditContractDcaReq> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditContractDcaReq createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(DcaTriggerParam.CREATOR.createFromParcel(parcel));
                }
            }
            return new EditContractDcaReq(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EditContractDcaReq[] newArray(int i) {
            return new EditContractDcaReq[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EditContractDcaReq() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.editStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.autoMarginReloadSwitch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.autoMarginReloadMaxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> component2() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.targetTpPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.targetSlPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.amt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.diffAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EditContractDcaReq copy(String str, List<DcaTriggerParam> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        return new EditContractDcaReq(str, list, str2, str3, str4, str5, str6, str7, str8, str9, str10, z, str11);
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
        if (!(obj instanceof EditContractDcaReq)) {
            return false;
        }
        EditContractDcaReq editContractDcaReq = (EditContractDcaReq) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) editContractDcaReq.algoId) && Intrinsics.EZpvd(this.triggerParams, editContractDcaReq.triggerParams) && Intrinsics.EZpvd((Object) this.targetTpPrice, (Object) editContractDcaReq.targetTpPrice) && Intrinsics.EZpvd((Object) this.targetSlPrice, (Object) editContractDcaReq.targetSlPrice) && Intrinsics.EZpvd((Object) this.px, (Object) editContractDcaReq.px) && Intrinsics.EZpvd((Object) this.amt, (Object) editContractDcaReq.amt) && Intrinsics.EZpvd((Object) this.diffAmt, (Object) editContractDcaReq.diffAmt) && Intrinsics.EZpvd((Object) this.ordId, (Object) editContractDcaReq.ordId) && Intrinsics.EZpvd((Object) this.ordType, (Object) editContractDcaReq.ordType) && Intrinsics.EZpvd((Object) this.reinvestment, (Object) editContractDcaReq.reinvestment) && Intrinsics.EZpvd((Object) this.editStrategyType, (Object) editContractDcaReq.editStrategyType) && this.autoMarginReloadSwitch == editContractDcaReq.autoMarginReloadSwitch && Intrinsics.EZpvd((Object) this.autoMarginReloadMaxAmount, (Object) editContractDcaReq.autoMarginReloadMaxAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmt() {
        return this.amt;
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
    public final String getDiffAmt() {
        return this.diffAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEditStrategyType() {
        return this.editStrategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdId() {
        return this.ordId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrdType() {
        return this.ordType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPx() {
        return this.px;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getReinvestment() {
        return this.reinvestment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetSlPrice() {
        return this.targetSlPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetTpPrice() {
        return this.targetTpPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DcaTriggerParam> getTriggerParams() {
        return this.triggerParams;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.algoId;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<DcaTriggerParam> list = this.triggerParams;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        String str2 = this.targetTpPrice;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.targetSlPrice;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.px;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.amt;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.diffAmt;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.ordId;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.ordType;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.reinvestment;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.editStrategyType;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        int iHashCode12 = Boolean.hashCode(this.autoMarginReloadSwitch);
        String str11 = this.autoMarginReloadMaxAmount;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str11 != null ? str11.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(String str) {
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmt(String str) {
        this.amt = str;
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
    public final void setDiffAmt(String str) {
        this.diffAmt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEditStrategyType(String str) {
        this.editStrategyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdId(String str) {
        this.ordId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrdType(String str) {
        this.ordType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPx(String str) {
        this.px = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setReinvestment(String str) {
        this.reinvestment = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetSlPrice(String str) {
        this.targetSlPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTargetTpPrice(String str) {
        this.targetTpPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTriggerParams(List<DcaTriggerParam> list) {
        this.triggerParams = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EditContractDcaReq(algoId=" + this.algoId + ", triggerParams=" + this.triggerParams + ", targetTpPrice=" + this.targetTpPrice + ", targetSlPrice=" + this.targetSlPrice + ", px=" + this.px + ", amt=" + this.amt + ", diffAmt=" + this.diffAmt + ", ordId=" + this.ordId + ", ordType=" + this.ordType + ", reinvestment=" + this.reinvestment + ", editStrategyType=" + this.editStrategyType + ", autoMarginReloadSwitch=" + this.autoMarginReloadSwitch + ", autoMarginReloadMaxAmount=" + this.autoMarginReloadMaxAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        List<DcaTriggerParam> list = this.triggerParams;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<DcaTriggerParam> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.targetTpPrice);
        parcel.writeString(this.targetSlPrice);
        parcel.writeString(this.px);
        parcel.writeString(this.amt);
        parcel.writeString(this.diffAmt);
        parcel.writeString(this.ordId);
        parcel.writeString(this.ordType);
        parcel.writeString(this.reinvestment);
        parcel.writeString(this.editStrategyType);
        parcel.writeInt(this.autoMarginReloadSwitch ? 1 : 0);
        parcel.writeString(this.autoMarginReloadMaxAmount);
    }

    public EditContractDcaReq(String str, List<DcaTriggerParam> list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11) {
        this.algoId = str;
        this.triggerParams = list;
        this.targetTpPrice = str2;
        this.targetSlPrice = str3;
        this.px = str4;
        this.amt = str5;
        this.diffAmt = str6;
        this.ordId = str7;
        this.ordType = str8;
        this.reinvestment = str9;
        this.editStrategyType = str10;
        this.autoMarginReloadSwitch = z;
        this.autoMarginReloadMaxAmount = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r16v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("false") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.DcaTriggerParam>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void (m)] (LINE:704) call: com.okinc.unify_trade.biz.EditContractDcaReq.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ EditContractDcaReq(String str, List list, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? "false" : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? false : z, (i & 4096) == 0 ? str11 : null);
    }
}
