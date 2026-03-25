package com.okinc.assets.backend.api.model.tax;

import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class TaxDocumentInfo {
    public static final int $stable = 8;
    private final List<TaxDocument> document;
    private final String msg;
    private final Boolean showBanner;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.assets.backend.api.model.tax.TaxDocumentInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxDocumentInfo copy$default(TaxDocumentInfo taxDocumentInfo, String str, Boolean bool, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxDocumentInfo.msg;
        }
        if ((i & 2) != 0) {
            bool = taxDocumentInfo.showBanner;
        }
        if ((i & 4) != 0) {
            list = taxDocumentInfo.document;
        }
        return taxDocumentInfo.copy(str, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.showBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TaxDocument> component3() {
        return this.document;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TaxDocumentInfo copy(String str, Boolean bool, @NotNull List<TaxDocument> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new TaxDocumentInfo(str, bool, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaxDocumentInfo)) {
            return false;
        }
        TaxDocumentInfo taxDocumentInfo = (TaxDocumentInfo) obj;
        return Intrinsics.EZpvd((Object) this.msg, (Object) taxDocumentInfo.msg) && Intrinsics.EZpvd(this.showBanner, taxDocumentInfo.showBanner) && Intrinsics.EZpvd(this.document, taxDocumentInfo.document);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TaxDocument> getDocument() {
        return this.document;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.msg;
        int iHashCode = str == null ? 0 : str.hashCode();
        Boolean bool = this.showBanner;
        return (((iHashCode * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.document.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TaxDocumentInfo(msg=" + this.msg + ", showBanner=" + this.showBanner + ", document=" + this.document + ")";
    }

    public TaxDocumentInfo(String str, Boolean bool, @NotNull List<TaxDocument> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.msg = str;
        this.showBanner = bool;
        this.document = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x0004: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:15)) : (r3v0 java.util.List))
 A[MD:(java.lang.String, java.lang.Boolean, java.util.List<com.okinc.assets.backend.api.model.tax.TaxDocumentInfo$TaxDocument>):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.tax.TaxDocumentInfo.<init>(java.lang.String, java.lang.Boolean, java.util.List):void type: THIS */
    public /* synthetic */ TaxDocumentInfo(String str, Boolean bool, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? yDY.AhwBna() : list);
    }

    public static final class TaxDocument {
        public static final int $stable = 0;
        private final String description;
        private final String displayName;
        private final String fileName;
        private final String filePath;
        private final String fileType;
        private final String formType;
        private final Boolean isIrsForm;
        private final Boolean isTurbotaxCompatible;
        private final String remark;
        private final String year;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaxDocument() {
            this(null, null, null, null, null, null, null, null, null, null, 1023, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.formType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component10() {
            return this.isIrsForm;
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
            return this.year;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component5() {
            return this.displayName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component6() {
            return this.description;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.remark;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.fileType;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean component9() {
            return this.isTurbotaxCompatible;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaxDocument copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2) {
            return new TaxDocument(str, str2, str3, str4, str5, str6, str7, str8, bool, bool2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaxDocument)) {
                return false;
            }
            TaxDocument taxDocument = (TaxDocument) obj;
            return Intrinsics.EZpvd((Object) this.formType, (Object) taxDocument.formType) && Intrinsics.EZpvd((Object) this.filePath, (Object) taxDocument.filePath) && Intrinsics.EZpvd((Object) this.fileName, (Object) taxDocument.fileName) && Intrinsics.EZpvd((Object) this.year, (Object) taxDocument.year) && Intrinsics.EZpvd((Object) this.displayName, (Object) taxDocument.displayName) && Intrinsics.EZpvd((Object) this.description, (Object) taxDocument.description) && Intrinsics.EZpvd((Object) this.remark, (Object) taxDocument.remark) && Intrinsics.EZpvd((Object) this.fileType, (Object) taxDocument.fileType) && Intrinsics.EZpvd(this.isTurbotaxCompatible, taxDocument.isTurbotaxCompatible) && Intrinsics.EZpvd(this.isIrsForm, taxDocument.isIrsForm);
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
            String str4 = this.year;
            int iHashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.displayName;
            int iHashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.description;
            int iHashCode6 = str6 == null ? 0 : str6.hashCode();
            String str7 = this.remark;
            int iHashCode7 = str7 == null ? 0 : str7.hashCode();
            String str8 = this.fileType;
            int iHashCode8 = str8 == null ? 0 : str8.hashCode();
            Boolean bool = this.isTurbotaxCompatible;
            int iHashCode9 = bool == null ? 0 : bool.hashCode();
            Boolean bool2 = this.isIrsForm;
            return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (bool2 != null ? bool2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isIrsForm() {
            return this.isIrsForm;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Boolean isTurbotaxCompatible() {
            return this.isTurbotaxCompatible;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TaxDocument(formType=" + this.formType + ", filePath=" + this.filePath + ", fileName=" + this.fileName + ", year=" + this.year + ", displayName=" + this.displayName + ", description=" + this.description + ", remark=" + this.remark + ", fileType=" + this.fileType + ", isTurbotaxCompatible=" + this.isTurbotaxCompatible + ", isIrsForm=" + this.isIrsForm + ")";
        }

        public TaxDocument(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2) {
            this.formType = str;
            this.filePath = str2;
            this.fileName = str3;
            this.year = str4;
            this.displayName = str5;
            this.description = str6;
            this.remark = str7;
            this.fileType = str8;
            this.isTurbotaxCompatible = bool;
            this.isIrsForm = bool2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0060: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r21v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r21v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r21v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r21v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r21v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r21v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r21v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r21v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r21v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r19v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r21v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:22) call: com.okinc.assets.backend.api.model.tax.TaxDocumentInfo.TaxDocument.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean):void type: THIS */
        public /* synthetic */ TaxDocument(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) == 0 ? str8 : null, (i & 256) != 0 ? Boolean.FALSE : bool, (i & 512) != 0 ? Boolean.FALSE : bool2);
        }

        public final FileType getFileTypeEnum() {
            FileType.StateListAnimator stateListAnimator = FileType.Companion;
            String str = this.fileType;
            if (str == null) {
                str = "";
            }
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return stateListAnimator.copydefault(lowerCase);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FileType {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ FileType[] $VALUES;
        public static final StateListAnimator Companion;
        private final String type;
        private final String value;
        public static final FileType Pdf = new FileType("Pdf", 0, "pdf", "application/pdf");
        public static final FileType Csv = new FileType("Csv", 1, "csv", "text/csv");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{Pdf, Csv};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<FileType> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getType() {
            return this.type;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValue() {
            return this.value;
        }

        private FileType(String str, int i, String str2, String str3) {
            this.value = str2;
            this.type = str3;
        }

        static {
            FileType[] fileTypeArr$values = $values();
            $VALUES = fileTypeArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(fileTypeArr$values);
            Companion = new StateListAnimator(null);
        }

        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.tax.TaxDocumentInfo.FileType.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }

            public final FileType copydefault(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                FileType fileType = FileType.Pdf;
                if (Intrinsics.EZpvd((Object) str, (Object) fileType.getValue())) {
                    return fileType;
                }
                FileType fileType2 = FileType.Csv;
                if (Intrinsics.EZpvd((Object) str, (Object) fileType2.getValue())) {
                    return fileType2;
                }
                return null;
            }
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }
    }
}
