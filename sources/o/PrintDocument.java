package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.PrintDocument;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PrintDocument {
    public static final Application OLrzqt = new Application(null);
    public final C5173Hn AEQbTJ;
    public final StatsDimensionsValue EZpvd;
    public final C5173Hn KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.PrintDocument$ActionBar) A[MD:(o.PrintDocument$ActionBar):void (m)] call: o.PrintDocument.<init>(o.PrintDocument$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ PrintDocument(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue OLrzqt() {
        return this.EZpvd;
    }

    public PrintDocument(ActionBar actionBar) {
        this.copydefault = actionBar.AEQbTJ();
        this.EZpvd = actionBar.EZpvd();
        this.KWHzl = actionBar.KWHzl();
        this.AEQbTJ = actionBar.OLrzqt();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.PrintDocument.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TargetedSentimentDetectionJobFilter(");
        sb.append("jobName=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("submitTimeAfter=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTimeBefore=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.EZpvd;
        int iHashCode2 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrintDocument.class != obj.getClass()) {
            return false;
        }
        PrintDocument printDocument = (PrintDocument) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) printDocument.copydefault) && Intrinsics.EZpvd(this.EZpvd, printDocument.EZpvd) && Intrinsics.EZpvd(this.KWHzl, printDocument.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, printDocument.AEQbTJ);
    }

    public static /* synthetic */ PrintDocument copy$default(PrintDocument printDocument, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.TargetedSentimentDetectionJobFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull PrintDocument.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PrintDocument.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(printDocument);
        function1.invoke(actionBar);
        return actionBar.copydefault();
    }

    public static final class ActionBar {
        public C5173Hn EZpvd;
        public java.lang.String KWHzl;
        public C5173Hn OLrzqt;
        public StatsDimensionsValue copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.EZpvd;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull PrintDocument printDocument) {
            this();
            Intrinsics.checkNotNullParameter(printDocument, "");
            this.KWHzl = printDocument.EZpvd();
            this.copydefault = printDocument.OLrzqt();
            this.OLrzqt = printDocument.AEQbTJ();
            this.EZpvd = printDocument.KWHzl();
        }

        public final PrintDocument copydefault() {
            return new PrintDocument(this, null);
        }
    }
}
