package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcdArbRecord implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DcdArbRecord> CREATOR = new Creator();
    private final String amount;
    private final String annualPnlRatio;
    private String currency;
    private final String cycle;
    private final String dcdOptionType;
    private List<BotParamItemData> insideItems;
    private Boolean isConverted;
    private boolean isFold;
    private final String notional;
    private final String notionalCcy;
    private final String pnl;
    private final String pnlCcy;
    private final String pnlRatio;
    private final String settlePrice;
    private final String settleTime;
    private final String startTime;
    private final String strike;

    public static final class Creator implements Parcelable.Creator<DcdArbRecord> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdArbRecord createFromParcel(Parcel parcel) {
            String str;
            ArrayList arrayList;
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            if (parcel.readInt() == 0) {
                str = string13;
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                str = string13;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(BotParamItemData.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DcdArbRecord(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, str, arrayList, boolValueOf, parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DcdArbRecord[] newArray(int i) {
            return new DcdArbRecord[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DcdArbRecord() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.settlePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotParamItemData> component14() {
        return this.insideItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component15() {
        return this.isConverted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.isFold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.settleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.annualPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcdArbRecord copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<BotParamItemData> list, Boolean bool, String str14, boolean z) {
        return new DcdArbRecord(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, list, bool, str14, z);
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
        if (!(obj instanceof DcdArbRecord)) {
            return false;
        }
        DcdArbRecord dcdArbRecord = (DcdArbRecord) obj;
        return Intrinsics.EZpvd((Object) this.cycle, (Object) dcdArbRecord.cycle) && Intrinsics.EZpvd((Object) this.dcdOptionType, (Object) dcdArbRecord.dcdOptionType) && Intrinsics.EZpvd((Object) this.startTime, (Object) dcdArbRecord.startTime) && Intrinsics.EZpvd((Object) this.settleTime, (Object) dcdArbRecord.settleTime) && Intrinsics.EZpvd((Object) this.pnl, (Object) dcdArbRecord.pnl) && Intrinsics.EZpvd((Object) this.pnlRatio, (Object) dcdArbRecord.pnlRatio) && Intrinsics.EZpvd((Object) this.annualPnlRatio, (Object) dcdArbRecord.annualPnlRatio) && Intrinsics.EZpvd((Object) this.pnlCcy, (Object) dcdArbRecord.pnlCcy) && Intrinsics.EZpvd((Object) this.amount, (Object) dcdArbRecord.amount) && Intrinsics.EZpvd((Object) this.strike, (Object) dcdArbRecord.strike) && Intrinsics.EZpvd((Object) this.settlePrice, (Object) dcdArbRecord.settlePrice) && Intrinsics.EZpvd((Object) this.notional, (Object) dcdArbRecord.notional) && Intrinsics.EZpvd((Object) this.notionalCcy, (Object) dcdArbRecord.notionalCcy) && Intrinsics.EZpvd(this.insideItems, dcdArbRecord.insideItems) && Intrinsics.EZpvd(this.isConverted, dcdArbRecord.isConverted) && Intrinsics.EZpvd((Object) this.currency, (Object) dcdArbRecord.currency) && this.isFold == dcdArbRecord.isFold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAnnualPnlRatio() {
        return this.annualPnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycle() {
        return this.cycle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDcdOptionType() {
        return this.dcdOptionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BotParamItemData> getInsideItems() {
        return this.insideItems;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotional() {
        return this.notional;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNotionalCcy() {
        return this.notionalCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlCcy() {
        return this.pnlCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRatio() {
        return this.pnlRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettlePrice() {
        return this.settlePrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettleTime() {
        return this.settleTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrike() {
        return this.strike;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.cycle;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.dcdOptionType;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.startTime;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.settleTime;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.pnl;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.pnlRatio;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.annualPnlRatio;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.pnlCcy;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.amount;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.strike;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.settlePrice;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.notional;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.notionalCcy;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        List<BotParamItemData> list = this.insideItems;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        Boolean bool = this.isConverted;
        int iHashCode15 = bool == null ? 0 : bool.hashCode();
        String str14 = this.currency;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (str14 == null ? 0 : str14.hashCode())) * 31) + Boolean.hashCode(this.isFold);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isConverted() {
        return this.isConverted;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFold() {
        return this.isFold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setConverted(Boolean bool) {
        this.isConverted = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(String str) {
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFold(boolean z) {
        this.isFold = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInsideItems(List<BotParamItemData> list) {
        this.insideItems = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcdArbRecord(cycle=" + this.cycle + ", dcdOptionType=" + this.dcdOptionType + ", startTime=" + this.startTime + ", settleTime=" + this.settleTime + ", pnl=" + this.pnl + ", pnlRatio=" + this.pnlRatio + ", annualPnlRatio=" + this.annualPnlRatio + ", pnlCcy=" + this.pnlCcy + ", amount=" + this.amount + ", strike=" + this.strike + ", settlePrice=" + this.settlePrice + ", notional=" + this.notional + ", notionalCcy=" + this.notionalCcy + ", insideItems=" + this.insideItems + ", isConverted=" + this.isConverted + ", currency=" + this.currency + ", isFold=" + this.isFold + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.cycle);
        parcel.writeString(this.dcdOptionType);
        parcel.writeString(this.startTime);
        parcel.writeString(this.settleTime);
        parcel.writeString(this.pnl);
        parcel.writeString(this.pnlRatio);
        parcel.writeString(this.annualPnlRatio);
        parcel.writeString(this.pnlCcy);
        parcel.writeString(this.amount);
        parcel.writeString(this.strike);
        parcel.writeString(this.settlePrice);
        parcel.writeString(this.notional);
        parcel.writeString(this.notionalCcy);
        List<BotParamItemData> list = this.insideItems;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<BotParamItemData> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isConverted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.currency);
        parcel.writeInt(this.isFold ? 1 : 0);
    }

    public DcdArbRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List<BotParamItemData> list, Boolean bool, String str14, boolean z) {
        this.cycle = str;
        this.dcdOptionType = str2;
        this.startTime = str3;
        this.settleTime = str4;
        this.pnl = str5;
        this.pnlRatio = str6;
        this.annualPnlRatio = str7;
        this.pnlCcy = str8;
        this.amount = str9;
        this.strike = str10;
        this.settlePrice = str11;
        this.notional = str12;
        this.notionalCcy = str13;
        this.insideItems = list;
        this.isConverted = bool;
        this.currency = str14;
        this.isFold = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b4: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r32v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r33v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r34v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? true : (r35v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.bot.data.BotParamItemData>, java.lang.Boolean, java.lang.String, boolean):void (m)] (LINE:1454) call: com.okinc.unify_trade.biz.DcdArbRecord.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.Boolean, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DcdArbRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list, Boolean bool, String str14, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : list, (i & 16384) != 0 ? null : bool, (i & 32768) != 0 ? null : str14, (i & 65536) != 0 ? true : z);
    }
}
