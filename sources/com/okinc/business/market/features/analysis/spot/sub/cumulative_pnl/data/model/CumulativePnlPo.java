package com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX INFO: loaded from: classes15.dex */
public final class CumulativePnlPo {
    public static final int $stable = 8;

    @SerializedName("everyTimeStepPnlList")
    private List<EveryTimeStepPnlList> everyTimeStepPnlList;

    @SerializedName("pnl")
    private String pnl;

    @SerializedName("todayPnl")
    private String todayPnl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CumulativePnlPo() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CumulativePnlPo copy$default(CumulativePnlPo cumulativePnlPo, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cumulativePnlPo.todayPnl;
        }
        if ((i & 2) != 0) {
            str2 = cumulativePnlPo.pnl;
        }
        if ((i & 4) != 0) {
            list = cumulativePnlPo.everyTimeStepPnlList;
        }
        return cumulativePnlPo.copy(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.todayPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EveryTimeStepPnlList> component3() {
        return this.everyTimeStepPnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CumulativePnlPo copy(String str, String str2, List<EveryTimeStepPnlList> list) {
        return new CumulativePnlPo(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CumulativePnlPo)) {
            return false;
        }
        CumulativePnlPo cumulativePnlPo = (CumulativePnlPo) obj;
        return Intrinsics.EZpvd((Object) this.todayPnl, (Object) cumulativePnlPo.todayPnl) && Intrinsics.EZpvd((Object) this.pnl, (Object) cumulativePnlPo.pnl) && Intrinsics.EZpvd(this.everyTimeStepPnlList, cumulativePnlPo.everyTimeStepPnlList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EveryTimeStepPnlList> getEveryTimeStepPnlList() {
        return this.everyTimeStepPnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTodayPnl() {
        return this.todayPnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.todayPnl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pnl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        List<EveryTimeStepPnlList> list = this.everyTimeStepPnlList;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEveryTimeStepPnlList(List<EveryTimeStepPnlList> list) {
        this.everyTimeStepPnlList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPnl(String str) {
        this.pnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTodayPnl(String str) {
        this.todayPnl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CumulativePnlPo(todayPnl=" + this.todayPnl + ", pnl=" + this.pnl + ", everyTimeStepPnlList=" + this.everyTimeStepPnlList + ")";
    }

    public CumulativePnlPo(String str, String str2, List<EveryTimeStepPnlList> list) {
        this.todayPnl = str;
        this.pnl = str2;
        this.everyTimeStepPnlList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo$EveryTimeStepPnlList>):void (m)] (LINE:7) call: com.okinc.business.market.features.analysis.spot.sub.cumulative_pnl.data.model.CumulativePnlPo.<init>(java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ CumulativePnlPo(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class EveryTimeStepPnlList {
        public static final int $stable = 8;

        @SerializedName("dateTime")
        private String dateTime;

        @SerializedName("pnl")
        private String pnl;

        @SerializedName("timeStep")
        private String timeStep;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EveryTimeStepPnlList copy$default(EveryTimeStepPnlList everyTimeStepPnlList, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = everyTimeStepPnlList.dateTime;
            }
            if ((i & 2) != 0) {
                str2 = everyTimeStepPnlList.pnl;
            }
            if ((i & 4) != 0) {
                str3 = everyTimeStepPnlList.timeStep;
            }
            return everyTimeStepPnlList.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.dateTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.pnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.timeStep;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EveryTimeStepPnlList copy(String str, String str2, String str3) {
            return new EveryTimeStepPnlList(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EveryTimeStepPnlList)) {
                return false;
            }
            EveryTimeStepPnlList everyTimeStepPnlList = (EveryTimeStepPnlList) obj;
            return Intrinsics.EZpvd((Object) this.dateTime, (Object) everyTimeStepPnlList.dateTime) && Intrinsics.EZpvd((Object) this.pnl, (Object) everyTimeStepPnlList.pnl) && Intrinsics.EZpvd((Object) this.timeStep, (Object) everyTimeStepPnlList.timeStep);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getDateTime() {
            return this.dateTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnl() {
            return this.pnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTimeStep() {
            return this.timeStep;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.dateTime;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.pnl;
            int iHashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.timeStep;
            return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setDateTime(String str) {
            this.dateTime = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPnl(String str) {
            this.pnl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTimeStep(String str) {
            this.timeStep = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EveryTimeStepPnlList(dateTime=" + this.dateTime + ", pnl=" + this.pnl + ", timeStep=" + this.timeStep + ")";
        }

        public EveryTimeStepPnlList(String str, String str2, String str3) {
            this.dateTime = str;
            this.pnl = str2;
            this.timeStep = str3;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class TimeStep {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TimeStep[] $VALUES;
        private final String value;
        public static final TimeStep MONTH = new TimeStep("MONTH", 0, "1");
        public static final TimeStep DAY = new TimeStep("DAY", 1, "2");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TimeStep[] $values() {
            return new TimeStep[]{MONTH, DAY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TimeStep> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private TimeStep(String str, int i, String str2) {
            this.value = str2;
        }

        static {
            TimeStep[] timeStepArr$values = $values();
            $VALUES = timeStepArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(timeStepArr$values);
        }

        public static TimeStep valueOf(String str) {
            return (TimeStep) Enum.valueOf(TimeStep.class, str);
        }

        public static TimeStep[] values() {
            return (TimeStep[]) $VALUES.clone();
        }
    }
}
