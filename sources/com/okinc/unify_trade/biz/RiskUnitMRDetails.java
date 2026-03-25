package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class RiskUnitMRDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<RiskUnitMRDetails> CREATOR = new Creator();
    private final String imr;
    private final String mmr;
    private final String mr1;
    private final Mr1Scenarios mr1Scenarios;
    private final String mr1pnl;
    private final String mr2;
    private final String mr3;
    private final String mr4;
    private final String mr5;
    private final String mr6;
    private final String mr7;
    private final String mr9;
    private final List<RiskScenarios> riskScenarios;
    private final String riskUnit;

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Creator implements Parcelable.Creator<RiskUnitMRDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskUnitMRDetails createFromParcel(Parcel parcel) {
            Mr1Scenarios mr1Scenarios;
            ArrayList arrayList;
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
            Mr1Scenarios mr1ScenariosCreateFromParcel = parcel.readInt() == 0 ? null : Mr1Scenarios.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
                mr1Scenarios = mr1ScenariosCreateFromParcel;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                mr1Scenarios = mr1ScenariosCreateFromParcel;
                int i2 = 0;
                while (i2 != i) {
                    arrayList2.add(RiskScenarios.CREATOR.createFromParcel(parcel));
                    i2++;
                    i = i;
                }
                arrayList = arrayList2;
            }
            return new RiskUnitMRDetails(string, string2, string3, string4, string5, string6, string7, string8, string9, string10, string11, string12, mr1Scenarios, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskUnitMRDetails[] newArray(int i) {
            return new RiskUnitMRDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RiskUnitMRDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.riskUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.mr7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.mr9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.mr1pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mr1Scenarios component13() {
        return this.mr1Scenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskScenarios> component14() {
        return this.riskScenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.mr1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.mr4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.mr5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.mr6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RiskUnitMRDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Mr1Scenarios mr1Scenarios, List<RiskScenarios> list) {
        return new RiskUnitMRDetails(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, mr1Scenarios, list);
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
        if (!(obj instanceof RiskUnitMRDetails)) {
            return false;
        }
        RiskUnitMRDetails riskUnitMRDetails = (RiskUnitMRDetails) obj;
        return Intrinsics.EZpvd((Object) this.riskUnit, (Object) riskUnitMRDetails.riskUnit) && Intrinsics.EZpvd((Object) this.mmr, (Object) riskUnitMRDetails.mmr) && Intrinsics.EZpvd((Object) this.imr, (Object) riskUnitMRDetails.imr) && Intrinsics.EZpvd((Object) this.mr1, (Object) riskUnitMRDetails.mr1) && Intrinsics.EZpvd((Object) this.mr2, (Object) riskUnitMRDetails.mr2) && Intrinsics.EZpvd((Object) this.mr3, (Object) riskUnitMRDetails.mr3) && Intrinsics.EZpvd((Object) this.mr4, (Object) riskUnitMRDetails.mr4) && Intrinsics.EZpvd((Object) this.mr5, (Object) riskUnitMRDetails.mr5) && Intrinsics.EZpvd((Object) this.mr6, (Object) riskUnitMRDetails.mr6) && Intrinsics.EZpvd((Object) this.mr7, (Object) riskUnitMRDetails.mr7) && Intrinsics.EZpvd((Object) this.mr9, (Object) riskUnitMRDetails.mr9) && Intrinsics.EZpvd((Object) this.mr1pnl, (Object) riskUnitMRDetails.mr1pnl) && Intrinsics.EZpvd(this.mr1Scenarios, riskUnitMRDetails.mr1Scenarios) && Intrinsics.EZpvd(this.riskScenarios, riskUnitMRDetails.riskScenarios);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImr() {
        return this.imr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMmr() {
        return this.mmr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr1() {
        return this.mr1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Mr1Scenarios getMr1Scenarios() {
        return this.mr1Scenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr1pnl() {
        return this.mr1pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr2() {
        return this.mr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr3() {
        return this.mr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr4() {
        return this.mr4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr5() {
        return this.mr5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr6() {
        return this.mr6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr7() {
        return this.mr7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMr9() {
        return this.mr9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<RiskScenarios> getRiskScenarios() {
        return this.riskScenarios;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskUnit() {
        return this.riskUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.riskUnit;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.mmr;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.imr;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.mr1;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.mr2;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.mr3;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.mr4;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.mr5;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.mr6;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.mr7;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.mr9;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.mr1pnl;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        Mr1Scenarios mr1Scenarios = this.mr1Scenarios;
        int iHashCode13 = mr1Scenarios == null ? 0 : mr1Scenarios.hashCode();
        List<RiskScenarios> list = this.riskScenarios;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RiskUnitMRDetails(riskUnit=" + this.riskUnit + ", mmr=" + this.mmr + ", imr=" + this.imr + ", mr1=" + this.mr1 + ", mr2=" + this.mr2 + ", mr3=" + this.mr3 + ", mr4=" + this.mr4 + ", mr5=" + this.mr5 + ", mr6=" + this.mr6 + ", mr7=" + this.mr7 + ", mr9=" + this.mr9 + ", mr1pnl=" + this.mr1pnl + ", mr1Scenarios=" + this.mr1Scenarios + ", riskScenarios=" + this.riskScenarios + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.riskUnit);
        parcel.writeString(this.mmr);
        parcel.writeString(this.imr);
        parcel.writeString(this.mr1);
        parcel.writeString(this.mr2);
        parcel.writeString(this.mr3);
        parcel.writeString(this.mr4);
        parcel.writeString(this.mr5);
        parcel.writeString(this.mr6);
        parcel.writeString(this.mr7);
        parcel.writeString(this.mr9);
        parcel.writeString(this.mr1pnl);
        Mr1Scenarios mr1Scenarios = this.mr1Scenarios;
        if (mr1Scenarios == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mr1Scenarios.writeToParcel(parcel, i);
        }
        List<RiskScenarios> list = this.riskScenarios;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<RiskScenarios> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public RiskUnitMRDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Mr1Scenarios mr1Scenarios, List<RiskScenarios> list) {
        this.riskUnit = str;
        this.mmr = str2;
        this.imr = str3;
        this.mr1 = str4;
        this.mr2 = str5;
        this.mr3 = str6;
        this.mr4 = str7;
        this.mr5 = str8;
        this.mr6 = str9;
        this.mr7 = str10;
        this.mr9 = str11;
        this.mr1pnl = str12;
        this.mr1Scenarios = mr1Scenarios;
        this.riskScenarios = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0090: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r30v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r30v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r30v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r27v0 java.lang.String))
  (wrap:com.okinc.unify_trade.biz.Mr1Scenarios:?: TERNARY null = ((wrap:int:0x0063: ARITH (r30v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.Mr1Scenarios) : (r28v0 com.okinc.unify_trade.biz.Mr1Scenarios))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x006b: ARITH (r30v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.Mr1Scenarios, java.util.List<com.okinc.unify_trade.biz.RiskScenarios>):void (m)] (LINE:1278) call: com.okinc.unify_trade.biz.RiskUnitMRDetails.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.Mr1Scenarios, java.util.List):void type: THIS */
    public /* synthetic */ RiskUnitMRDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Mr1Scenarios mr1Scenarios, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : mr1Scenarios, (i & 8192) == 0 ? list : null);
    }
}
