package com.okinc.business.market.features.analysis.futures.sub.overview.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CumulativePnlPo {
    public static final int $stable = 0;

    @SerializedName("cumulativePnl")
    private final String cumulativePnl;

    @SerializedName("dateTime")
    private final long dateTime;

    @SerializedName("pnl")
    private final String pnl;

    @SerializedName("timeStep")
    private final int timeStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CumulativePnlPo() {
        this(null, 0L, null, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CumulativePnlPo copy$default(CumulativePnlPo cumulativePnlPo, String str, long j, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cumulativePnlPo.cumulativePnl;
        }
        if ((i2 & 2) != 0) {
            j = cumulativePnlPo.dateTime;
        }
        long j2 = j;
        if ((i2 & 4) != 0) {
            str2 = cumulativePnlPo.pnl;
        }
        String str3 = str2;
        if ((i2 & 8) != 0) {
            i = cumulativePnlPo.timeStep;
        }
        return cumulativePnlPo.copy(str, j2, str3, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cumulativePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.timeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CumulativePnlPo copy(@NotNull String str, long j, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CumulativePnlPo(str, j, str2, i);
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
        return Intrinsics.EZpvd((Object) this.cumulativePnl, (Object) cumulativePnlPo.cumulativePnl) && this.dateTime == cumulativePnlPo.dateTime && Intrinsics.EZpvd((Object) this.pnl, (Object) cumulativePnlPo.pnl) && this.timeStep == cumulativePnlPo.timeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCumulativePnl() {
        return this.cumulativePnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDateTime() {
        return this.dateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTimeStep() {
        return this.timeStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.cumulativePnl.hashCode() * 31) + Long.hashCode(this.dateTime)) * 31) + this.pnl.hashCode()) * 31) + Integer.hashCode(this.timeStep);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CumulativePnlPo(cumulativePnl=" + this.cumulativePnl + ", dateTime=" + this.dateTime + ", pnl=" + this.pnl + ", timeStep=" + this.timeStep + ")";
    }

    public CumulativePnlPo(@NotNull String str, long j, @NotNull String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.cumulativePnl = str;
        this.dateTime = j;
        this.pnl = str2;
        this.timeStep = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:long:0x000f: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r5v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r8v0 int))
 A[MD:(java.lang.String, long, java.lang.String, int):void (m)] (LINE:82) call: com.okinc.business.market.features.analysis.futures.sub.overview.data.model.CumulativePnlPo.<init>(java.lang.String, long, java.lang.String, int):void type: THIS */
    public /* synthetic */ CumulativePnlPo(String str, long j, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0L : j, (i2 & 4) == 0 ? str2 : "", (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TimeStep {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ TimeStep[] $VALUES;
        private final int value;
        public static final TimeStep MONTH = new TimeStep("MONTH", 0, 1);
        public static final TimeStep DAY = new TimeStep("DAY", 1, 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ TimeStep[] $values() {
            return new TimeStep[]{MONTH, DAY};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<TimeStep> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getValue() {
            return this.value;
        }

        private TimeStep(String str, int i, int i2) {
            this.value = i2;
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
