package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class StatementMonthInfo {
    public static final int $stable = 0;
    public static final Application Companion = new Application(null);
    public static final int DATA_NOT_READY = 1;
    public static final int DATA_READY_AND_URL_PRESENT = 2;
    public static final int GENERATE_STATEMENT_FAILED = 3;
    private final String name;
    private final String recordDate;
    private final Integer status;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public StatementMonthInfo() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ StatementMonthInfo copy$default(StatementMonthInfo statementMonthInfo, String str, String str2, Integer num, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statementMonthInfo.recordDate;
        }
        if ((i & 2) != 0) {
            str2 = statementMonthInfo.name;
        }
        if ((i & 4) != 0) {
            num = statementMonthInfo.status;
        }
        if ((i & 8) != 0) {
            str3 = statementMonthInfo.url;
        }
        return statementMonthInfo.copy(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.recordDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatementMonthInfo copy(String str, String str2, Integer num, String str3) {
        return new StatementMonthInfo(str, str2, num, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatementMonthInfo)) {
            return false;
        }
        StatementMonthInfo statementMonthInfo = (StatementMonthInfo) obj;
        return Intrinsics.EZpvd((Object) this.recordDate, (Object) statementMonthInfo.recordDate) && Intrinsics.EZpvd((Object) this.name, (Object) statementMonthInfo.name) && Intrinsics.EZpvd(this.status, statementMonthInfo.status) && Intrinsics.EZpvd((Object) this.url, (Object) statementMonthInfo.url);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRecordDate() {
        return this.recordDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.recordDate;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.name;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Integer num = this.status;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str3 = this.url;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "StatementMonthInfo(recordDate=" + this.recordDate + ", name=" + this.name + ", status=" + this.status + ", url=" + this.url + ")";
    }

    public StatementMonthInfo(String str, String str2, Integer num, String str3) {
        this.recordDate = str;
        this.name = str2;
        this.status = num;
        this.url = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void (m)] (LINE:6) call: com.okinc.assets.backend.api.model.StatementMonthInfo.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ StatementMonthInfo(String str, String str2, Integer num, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.StatementMonthInfo.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}
