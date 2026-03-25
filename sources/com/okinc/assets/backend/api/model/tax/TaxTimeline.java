package com.okinc.assets.backend.api.model.tax;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxTimeline {
    public static final int $stable = 0;
    private final String description;
    private final TaxTimelineFile file;
    private final Boolean fileExist;
    private final Integer timelineStatus;
    private final Long timestamp;
    private final String title;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaxTimeline() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TaxTimeline copy$default(TaxTimeline taxTimeline, Long l, String str, String str2, Boolean bool, Integer num, TaxTimelineFile taxTimelineFile, int i, Object obj) {
        if ((i & 1) != 0) {
            l = taxTimeline.timestamp;
        }
        if ((i & 2) != 0) {
            str = taxTimeline.title;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = taxTimeline.description;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            bool = taxTimeline.fileExist;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            num = taxTimeline.timelineStatus;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            taxTimelineFile = taxTimeline.file;
        }
        return taxTimeline.copy(l, str3, str4, bool2, num2, taxTimelineFile);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.fileExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component5() {
        return this.timelineStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxTimelineFile component6() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxTimeline copy(Long l, String str, String str2, Boolean bool, Integer num, TaxTimelineFile taxTimelineFile) {
        return new TaxTimeline(l, str, str2, bool, num, taxTimelineFile);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxTimeline)) {
            return false;
        }
        TaxTimeline taxTimeline = (TaxTimeline) obj;
        return Intrinsics.EZpvd(this.timestamp, taxTimeline.timestamp) && Intrinsics.EZpvd((Object) this.title, (Object) taxTimeline.title) && Intrinsics.EZpvd((Object) this.description, (Object) taxTimeline.description) && Intrinsics.EZpvd(this.fileExist, taxTimeline.fileExist) && Intrinsics.EZpvd(this.timelineStatus, taxTimeline.timelineStatus) && Intrinsics.EZpvd(this.file, taxTimeline.file);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxTimelineFile getFile() {
        return this.file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFileExist() {
        return this.fileExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTimelineStatus() {
        return this.timelineStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.timestamp;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.description;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.fileExist;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        Integer num = this.timelineStatus;
        int iHashCode5 = num == null ? 0 : num.hashCode();
        TaxTimelineFile taxTimelineFile = this.file;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (taxTimelineFile != null ? taxTimelineFile.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxTimeline(timestamp=" + this.timestamp + ", title=" + this.title + ", description=" + this.description + ", fileExist=" + this.fileExist + ", timelineStatus=" + this.timelineStatus + ", file=" + this.file + ")";
    }

    public TaxTimeline(Long l, String str, String str2, Boolean bool, Integer num, TaxTimelineFile taxTimelineFile) {
        this.timestamp = l;
        this.title = str;
        this.description = str2;
        this.fileExist = bool;
        this.timelineStatus = num;
        this.file = taxTimelineFile;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r9v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:com.okinc.assets.backend.api.model.tax.TaxTimelineFile:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.assets.backend.api.model.tax.TaxTimelineFile) : (r11v0 com.okinc.assets.backend.api.model.tax.TaxTimelineFile))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, com.okinc.assets.backend.api.model.tax.TaxTimelineFile):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.TaxTimeline.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Integer, com.okinc.assets.backend.api.model.tax.TaxTimelineFile):void type: THIS */
    public /* synthetic */ TaxTimeline(Long l, String str, String str2, Boolean bool, Integer num, TaxTimelineFile taxTimelineFile, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : taxTimelineFile);
    }
}
