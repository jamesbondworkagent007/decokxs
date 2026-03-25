package com.okinc.unify_trade.bot.data;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class InformationFragmentData {
    public static final int $stable = 8;
    private final String currentF;
    private final String currentS;
    private final ArrayList<? extends Object> dataList;
    private final ArrayList<? extends Object> detailList;
    private final String initF;
    private final String initS;
    private final String instId;
    private final String instType;
    private final String investCcy;
    private final String simpleEarnHoldingBaseSz;
    private final String simpleEarnHoldingQuoteSz;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InformationFragmentData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.simpleEarnHoldingBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.simpleEarnHoldingQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.initF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.initS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currentF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currentS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<? extends Object> component7() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<? extends Object> component9() {
        return this.detailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InformationFragmentData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ArrayList<? extends Object> arrayList, @NotNull String str7, @NotNull ArrayList<? extends Object> arrayList2, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        return new InformationFragmentData(str, str2, str3, str4, str5, str6, arrayList, str7, arrayList2, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InformationFragmentData)) {
            return false;
        }
        InformationFragmentData informationFragmentData = (InformationFragmentData) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) informationFragmentData.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) informationFragmentData.instType) && Intrinsics.EZpvd((Object) this.initF, (Object) informationFragmentData.initF) && Intrinsics.EZpvd((Object) this.initS, (Object) informationFragmentData.initS) && Intrinsics.EZpvd((Object) this.currentF, (Object) informationFragmentData.currentF) && Intrinsics.EZpvd((Object) this.currentS, (Object) informationFragmentData.currentS) && Intrinsics.EZpvd(this.dataList, informationFragmentData.dataList) && Intrinsics.EZpvd((Object) this.investCcy, (Object) informationFragmentData.investCcy) && Intrinsics.EZpvd(this.detailList, informationFragmentData.detailList) && Intrinsics.EZpvd((Object) this.simpleEarnHoldingBaseSz, (Object) informationFragmentData.simpleEarnHoldingBaseSz) && Intrinsics.EZpvd((Object) this.simpleEarnHoldingQuoteSz, (Object) informationFragmentData.simpleEarnHoldingQuoteSz);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentF() {
        return this.currentF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentS() {
        return this.currentS;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<? extends Object> getDataList() {
        return this.dataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<? extends Object> getDetailList() {
        return this.detailList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitF() {
        return this.initF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitS() {
        return this.initS;
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
    public final String getInvestCcy() {
        return this.investCcy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnHoldingBaseSz() {
        return this.simpleEarnHoldingBaseSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSimpleEarnHoldingQuoteSz() {
        return this.simpleEarnHoldingQuoteSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        int iHashCode2 = this.instType.hashCode();
        int iHashCode3 = this.initF.hashCode();
        int iHashCode4 = this.initS.hashCode();
        int iHashCode5 = this.currentF.hashCode();
        int iHashCode6 = this.currentS.hashCode();
        int iHashCode7 = this.dataList.hashCode();
        int iHashCode8 = this.investCcy.hashCode();
        int iHashCode9 = this.detailList.hashCode();
        String str = this.simpleEarnHoldingBaseSz;
        int iHashCode10 = str == null ? 0 : str.hashCode();
        String str2 = this.simpleEarnHoldingQuoteSz;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InformationFragmentData(instId=" + this.instId + ", instType=" + this.instType + ", initF=" + this.initF + ", initS=" + this.initS + ", currentF=" + this.currentF + ", currentS=" + this.currentS + ", dataList=" + this.dataList + ", investCcy=" + this.investCcy + ", detailList=" + this.detailList + ", simpleEarnHoldingBaseSz=" + this.simpleEarnHoldingBaseSz + ", simpleEarnHoldingQuoteSz=" + this.simpleEarnHoldingQuoteSz + ")";
    }

    public InformationFragmentData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull ArrayList<? extends Object> arrayList, @NotNull String str7, @NotNull ArrayList<? extends Object> arrayList2, String str8, String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        this.instId = str;
        this.instType = str2;
        this.initF = str3;
        this.initS = str4;
        this.currentF = str5;
        this.currentS = str6;
        this.dataList = arrayList;
        this.investCcy = str7;
        this.detailList = arrayList2;
        this.simpleEarnHoldingBaseSz = str8;
        this.simpleEarnHoldingQuoteSz = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0075: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0037: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1023) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r19v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r24v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0044: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:1025) call: java.util.ArrayList.<init>():void type: CONSTRUCTOR) : (r21v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<? extends java.lang.Object>, java.lang.String, java.util.ArrayList<? extends java.lang.Object>, java.lang.String, java.lang.String):void (m)] (LINE:1016) call: com.okinc.unify_trade.bot.data.InformationFragmentData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList, java.lang.String, java.util.ArrayList, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InformationFragmentData(String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList, String str7, ArrayList arrayList2, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? new ArrayList() : arrayList, (i & 128) == 0 ? str7 : "", (i & 256) != 0 ? new ArrayList() : arrayList2, (i & 512) != 0 ? null : str8, (i & 1024) == 0 ? str9 : null);
    }
}
