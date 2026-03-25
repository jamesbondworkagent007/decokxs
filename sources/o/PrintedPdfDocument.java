package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PrintedPdfDocument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class PrintedPdfDocument {
    public static final Activity KWHzl = new Activity(null);
    public final java.lang.Integer AEQbTJ;
    public final java.lang.Integer EZpvd;
    public final StorageManager OLrzqt;
    public final java.lang.String copydefault;
    public final java.lang.Integer djBIcL;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PrintedPdfDocument$TaskDescription) A[MD:(o.PrintedPdfDocument$TaskDescription):void (m)] call: o.PrintedPdfDocument.<init>(o.PrintedPdfDocument$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PrintedPdfDocument(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StorageManager AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.AEQbTJ;
    }

    public PrintedPdfDocument(TaskDescription taskDescription) {
        this.EZpvd = taskDescription.copydefault();
        this.AEQbTJ = taskDescription.EZpvd();
        this.OLrzqt = taskDescription.KWHzl();
        this.copydefault = taskDescription.djBIcL();
        this.djBIcL = taskDescription.valueOf();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PrintedPdfDocument.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SyntaxToken(");
        sb.append("beginOffset=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endOffset=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("partOfSpeech=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("text=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tokenId=");
        sb2.append(this.djBIcL);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.EZpvd;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.Integer num2 = this.AEQbTJ;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        StorageManager storageManager = this.OLrzqt;
        int iHashCode = storageManager != null ? storageManager.hashCode() : 0;
        java.lang.String str = this.copydefault;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        java.lang.Integer num3 = this.djBIcL;
        return (((((((iIntValue * 31) + iIntValue2) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (num3 != null ? num3.intValue() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrintedPdfDocument.class != obj.getClass()) {
            return false;
        }
        PrintedPdfDocument printedPdfDocument = (PrintedPdfDocument) obj;
        return Intrinsics.EZpvd(this.EZpvd, printedPdfDocument.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, printedPdfDocument.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, printedPdfDocument.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) printedPdfDocument.copydefault) && Intrinsics.EZpvd(this.djBIcL, printedPdfDocument.djBIcL);
    }

    public static /* synthetic */ PrintedPdfDocument copy$default(PrintedPdfDocument printedPdfDocument, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.SyntaxToken$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PrintedPdfDocument.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PrintedPdfDocument.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(printedPdfDocument);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.lang.Integer EZpvd;
        public StorageManager KWHzl;
        public java.lang.Integer OLrzqt;
        public java.lang.Integer copydefault;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(StorageManager storageManager) {
            this.KWHzl = storageManager;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.copydefault = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StorageManager KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Integer num) {
            this.EZpvd = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer valueOf() {
            return this.EZpvd;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull PrintedPdfDocument printedPdfDocument) {
            this();
            Intrinsics.checkNotNullParameter(printedPdfDocument, "");
            this.copydefault = printedPdfDocument.OLrzqt();
            this.OLrzqt = printedPdfDocument.copydefault();
            this.KWHzl = printedPdfDocument.AEQbTJ();
            this.AEQbTJ = printedPdfDocument.EZpvd();
            this.EZpvd = printedPdfDocument.KWHzl();
        }

        public final PrintedPdfDocument OLrzqt() {
            return new PrintedPdfDocument(this, null);
        }
    }
}
