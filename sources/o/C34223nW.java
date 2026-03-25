package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34223nW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C34223nW {
    public static final TaskDescription EZpvd = new TaskDescription(null);
    public final AbstractC36549od AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String AhwBna;
    public final C33657nB KWHzl;
    public final java.util.List<C33711nD> OLrzqt;
    public final java.lang.String copydefault;
    public final java.util.List<C36336oY> valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nW$ActionBar) A[MD:(o.nW$ActionBar):void (m)] call: o.nW.<init>(o.nW$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34223nW(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C33711nD> AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C36336oY> AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC36549od EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.AhwBna;
    }

    public C34223nW(ActionBar actionBar) {
        this.copydefault = actionBar.copydefault();
        this.KWHzl = actionBar.EZpvd();
        this.OLrzqt = actionBar.OLrzqt();
        this.AEQbTJ = actionBar.djBIcL();
        this.AYXKKw = actionBar.AYXKKw();
        this.AhwBna = actionBar.valueOf();
        this.valueOf = actionBar.AhwBna();
    }

    /* JADX INFO: renamed from: o.nW$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nW.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("GetExpenseAnalysisResponse(");
        sb.append("analyzeExpenseModelVersion=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("documentMetadata=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("expenseDocuments=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("nextToken=" + this.AYXKKw + AbstractJsonLexerKt.COMMA);
        sb.append("statusMessage=" + this.AhwBna + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("warnings=");
        sb2.append(this.valueOf);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str != null ? str.hashCode() : 0;
        C33657nB c33657nB = this.KWHzl;
        int iHashCode2 = c33657nB != null ? c33657nB.hashCode() : 0;
        java.util.List<C33711nD> list = this.OLrzqt;
        int iHashCode3 = list != null ? list.hashCode() : 0;
        AbstractC36549od abstractC36549od = this.AEQbTJ;
        int iHashCode4 = abstractC36549od != null ? abstractC36549od.hashCode() : 0;
        java.lang.String str2 = this.AYXKKw;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.AhwBna;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        java.util.List<C36336oY> list2 = this.valueOf;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34223nW.class != obj.getClass()) {
            return false;
        }
        C34223nW c34223nW = (C34223nW) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c34223nW.copydefault) && Intrinsics.EZpvd(this.KWHzl, c34223nW.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c34223nW.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c34223nW.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c34223nW.AYXKKw) && Intrinsics.EZpvd((java.lang.Object) this.AhwBna, (java.lang.Object) c34223nW.AhwBna) && Intrinsics.EZpvd(this.valueOf, c34223nW.valueOf);
    }

    public static /* synthetic */ C34223nW copy$default(C34223nW c34223nW, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.GetExpenseAnalysisResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34223nW.ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34223nW.ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(c34223nW);
        function1.invoke(actionBar);
        return actionBar.KWHzl();
    }

    /* JADX INFO: renamed from: o.nW$ActionBar */
    public static final class ActionBar {
        public AbstractC36549od AEQbTJ;
        public C33657nB EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public java.util.List<C33711nD> copydefault;
        public java.lang.String gEmmrt;
        public java.util.List<C36336oY> valueOf;

        public final ActionBar AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(java.lang.String str) {
            this.gEmmrt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C36336oY> AhwBna() {
            return this.valueOf;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C33711nD> list) {
            this.copydefault = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(AbstractC36549od abstractC36549od) {
            this.AEQbTJ = abstractC36549od;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C33711nD> OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.util.List<C36336oY> list) {
            this.valueOf = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(C33657nB c33657nB) {
            this.EZpvd = c33657nB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC36549od djBIcL() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String valueOf() {
            return this.gEmmrt;
        }

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C34223nW c34223nW) {
            this();
            Intrinsics.checkNotNullParameter(c34223nW, "");
            this.KWHzl = c34223nW.copydefault();
            this.EZpvd = c34223nW.KWHzl();
            this.copydefault = c34223nW.AEQbTJ();
            this.AEQbTJ = c34223nW.EZpvd();
            this.OLrzqt = c34223nW.OLrzqt();
            this.gEmmrt = c34223nW.valueOf();
            this.valueOf = c34223nW.AYXKKw();
        }

        public final C34223nW KWHzl() {
            return new C34223nW(this, null);
        }
    }
}
