package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C36443ob;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C36443ob {
    public static final Application KWHzl = new Application(null);
    public final AbstractC36549od AEQbTJ;
    public final java.util.List<C36867oj> AhwBna;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final C33657nB copydefault;
    public final java.lang.String djBIcL;
    public final java.util.List<C36336oY> gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ob$TaskDescription) A[MD:(o.ob$TaskDescription):void (m)] call: o.ob.<init>(o.ob$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C36443ob(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36336oY> AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36867oj> OLrzqt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC36549od copydefault() {
        return this.AEQbTJ;
    }

    public C36443ob(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.copydefault();
        this.copydefault = taskDescription.EZpvd();
        this.AEQbTJ = taskDescription.OLrzqt();
        this.EZpvd = taskDescription.gEmmrt();
        this.AhwBna = taskDescription.valueOf();
        this.djBIcL = taskDescription.djBIcL();
        this.gEmmrt = taskDescription.AYXKKw();
    }

    /* JADX INFO: renamed from: o.ob$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ob.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetLendingAnalysisResponse(");
        sb.append("analyzeLendingModelVersion=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("documentMetadata=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("results=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.djBIcL + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("warnings=");
        sb2.append(this.gEmmrt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        C33657nB c33657nB = this.copydefault;
        int iHashCode2 = c33657nB != null ? c33657nB.hashCode() : 0;
        AbstractC36549od abstractC36549od = this.AEQbTJ;
        int iHashCode3 = abstractC36549od != null ? abstractC36549od.hashCode() : 0;
        java.lang.String str2 = this.EZpvd;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        java.util.List<C36867oj> list = this.AhwBna;
        int iHashCode5 = list != null ? list.hashCode() : 0;
        java.lang.String str3 = this.djBIcL;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        java.util.List<C36336oY> list2 = this.gEmmrt;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C36443ob.class != obj.getClass()) {
            return false;
        }
        C36443ob c36443ob = (C36443ob) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c36443ob.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c36443ob.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, c36443ob.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c36443ob.EZpvd) && Intrinsics.EZpvd(this.AhwBna, c36443ob.AhwBna) && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c36443ob.djBIcL) && Intrinsics.EZpvd(this.gEmmrt, c36443ob.gEmmrt);
    }

    public static /* synthetic */ C36443ob copy$default(C36443ob c36443ob, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.GetLendingAnalysisResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C36443ob.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C36443ob.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c36443ob);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    /* JADX INFO: renamed from: o.ob$TaskDescription */
    public static final class TaskDescription {
        public AbstractC36549od AEQbTJ;
        public java.lang.String AYXKKw;
        public C33657nB EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<C36867oj> copydefault;
        public java.util.List<C36336oY> gEmmrt;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.util.List<C36336oY> list) {
            this.gEmmrt = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(AbstractC36549od abstractC36549od) {
            this.AEQbTJ = abstractC36549od;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36336oY> AYXKKw() {
            return this.gEmmrt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.AYXKKw = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<C36867oj> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC36549od OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C33657nB c33657nB) {
            this.EZpvd = c33657nB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String djBIcL() {
            return this.AYXKKw;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36867oj> valueOf() {
            return this.copydefault;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C36443ob c36443ob) {
            this();
            Intrinsics.checkNotNullParameter(c36443ob, "");
            this.OLrzqt = c36443ob.KWHzl();
            this.EZpvd = c36443ob.EZpvd();
            this.AEQbTJ = c36443ob.copydefault();
            this.KWHzl = c36443ob.AEQbTJ();
            this.copydefault = c36443ob.OLrzqt();
            this.AYXKKw = c36443ob.AhwBna();
            this.gEmmrt = c36443ob.AYXKKw();
        }

        public final C36443ob KWHzl() {
            return new C36443ob(this, null);
        }
    }
}
