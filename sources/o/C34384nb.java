package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C34384nb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C34384nb {
    public static final StateListAnimator copydefault = new StateListAnimator(null);
    public final java.util.List<C34735ni> AEQbTJ;
    public final C34304nZ EZpvd;
    public final java.lang.String KWHzl;
    public final C33657nB OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nb$TaskDescription) A[MD:(o.nb$TaskDescription):void (m)] call: o.nb.<init>(o.nb$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C34384nb(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C33657nB AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C34735ni> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C34304nZ OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    public C34384nb(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.AEQbTJ();
        this.AEQbTJ = taskDescription.OLrzqt();
        this.OLrzqt = taskDescription.KWHzl();
        this.EZpvd = taskDescription.AhwBna();
    }

    /* JADX INFO: renamed from: o.nb$StateListAnimator */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nb.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnalyzeDocumentResponse(");
        sb.append("analyzeDocumentModelVersion=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("blocks=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("documentMetadata=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("humanLoopActivationOutput=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.util.List<C34735ni> list = this.AEQbTJ;
        int iHashCode2 = list != null ? list.hashCode() : 0;
        C33657nB c33657nB = this.OLrzqt;
        int iHashCode3 = c33657nB != null ? c33657nB.hashCode() : 0;
        C34304nZ c34304nZ = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c34304nZ != null ? c34304nZ.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C34384nb.class != obj.getClass()) {
            return false;
        }
        C34384nb c34384nb = (C34384nb) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c34384nb.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c34384nb.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c34384nb.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c34384nb.EZpvd);
    }

    public static /* synthetic */ C34384nb copy$default(C34384nb c34384nb, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.AnalyzeDocumentResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C34384nb.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C34384nb.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c34384nb);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.nb$TaskDescription */
    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public C33657nB AEQbTJ;
        public java.util.List<C34735ni> KWHzl;
        public java.lang.String OLrzqt;
        public C34304nZ copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C34304nZ AhwBna() {
            return this.copydefault;
        }

        public final TaskDescription EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.util.List<C34735ni> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C33657nB KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C33657nB c33657nB) {
            this.AEQbTJ = c33657nB;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C34304nZ c34304nZ) {
            this.copydefault = c34304nZ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C34735ni> OLrzqt() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C34384nb c34384nb) {
            this();
            Intrinsics.checkNotNullParameter(c34384nb, "");
            this.OLrzqt = c34384nb.copydefault();
            this.KWHzl = c34384nb.KWHzl();
            this.AEQbTJ = c34384nb.AEQbTJ();
            this.copydefault = c34384nb.OLrzqt();
        }

        public final C34384nb copydefault() {
            return new C34384nb(this, null);
        }
    }
}
