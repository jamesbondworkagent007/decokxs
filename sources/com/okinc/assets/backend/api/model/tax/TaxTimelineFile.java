package com.okinc.assets.backend.api.model.tax;

import com.okinc.assets.backend.api.model.tax.TaxDocumentInfo;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxTimelineFile {
    public static final int $stable = 0;
    private final String description;
    private final String displayName;
    private final String fileName;
    private final String filePath;
    private final String fileType;
    private final String formType;
    private final String remark;
    private final String year;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TaxTimelineFile() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.formType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.year;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.fileType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxTimelineFile copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new TaxTimelineFile(str, str2, str3, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxTimelineFile)) {
            return false;
        }
        TaxTimelineFile taxTimelineFile = (TaxTimelineFile) obj;
        return Intrinsics.EZpvd((Object) this.formType, (Object) taxTimelineFile.formType) && Intrinsics.EZpvd((Object) this.filePath, (Object) taxTimelineFile.filePath) && Intrinsics.EZpvd((Object) this.fileName, (Object) taxTimelineFile.fileName) && Intrinsics.EZpvd((Object) this.displayName, (Object) taxTimelineFile.displayName) && Intrinsics.EZpvd((Object) this.description, (Object) taxTimelineFile.description) && Intrinsics.EZpvd((Object) this.remark, (Object) taxTimelineFile.remark) && Intrinsics.EZpvd((Object) this.year, (Object) taxTimelineFile.year) && Intrinsics.EZpvd((Object) this.fileType, (Object) taxTimelineFile.fileType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDescription() {
        return this.description;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileName() {
        return this.fileName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFileType() {
        return this.fileType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormType() {
        return this.formType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRemark() {
        return this.remark;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getYear() {
        return this.year;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.formType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.filePath;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fileName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.displayName;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.description;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.remark;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.year;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.fileType;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxTimelineFile(formType=" + this.formType + ", filePath=" + this.filePath + ", fileName=" + this.fileName + ", displayName=" + this.displayName + ", description=" + this.description + ", remark=" + this.remark + ", year=" + this.year + ", fileType=" + this.fileType + ")";
    }

    public TaxTimelineFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.formType = str;
        this.filePath = str2;
        this.fileName = str3;
        this.displayName = str4;
        this.description = str5;
        this.remark = str6;
        this.year = str7;
        this.fileType = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0048: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r18v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r18v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:54) call: com.okinc.assets.backend.api.model.tax.TaxTimelineFile.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TaxTimelineFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null);
    }

    public final TaxDocumentInfo.FileType getFileTypeEnum() {
        TaxDocumentInfo.FileType.StateListAnimator stateListAnimator = TaxDocumentInfo.FileType.Companion;
        String str = this.fileType;
        if (str == null) {
            str = "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return stateListAnimator.copydefault(lowerCase);
    }
}
