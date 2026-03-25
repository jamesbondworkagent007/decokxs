package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C33684nC;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C33684nC {
    public static final Activity EZpvd = new Activity(null);
    public final float AEQbTJ;
    public final float OLrzqt;
    public final float copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.nC$TaskDescription) A[MD:(o.nC$TaskDescription):void (m)] call: o.nC.<init>(o.nC$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C33684nC(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float OLrzqt() {
        return this.AEQbTJ;
    }

    public C33684nC(TaskDescription taskDescription) {
        this.copydefault = taskDescription.AEQbTJ();
        this.OLrzqt = taskDescription.OLrzqt();
        this.AEQbTJ = taskDescription.KWHzl();
    }

    /* JADX INFO: renamed from: o.nC$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nC.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EvaluationMetric(");
        sb.append("f1Score=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("precision=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("recall=");
        sb2.append(this.AEQbTJ);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        int iHashCode = java.lang.Float.hashCode(this.copydefault);
        return (((iHashCode * 31) + java.lang.Float.hashCode(this.OLrzqt)) * 31) + java.lang.Float.hashCode(this.AEQbTJ);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33684nC.class != obj.getClass()) {
            return false;
        }
        C33684nC c33684nC = (C33684nC) obj;
        return this.copydefault == c33684nC.copydefault && this.OLrzqt == c33684nC.OLrzqt && this.AEQbTJ == c33684nC.AEQbTJ;
    }

    public static /* synthetic */ C33684nC copy$default(C33684nC c33684nC, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.EvaluationMetric$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C33684nC.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C33684nC.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c33684nC);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    /* JADX INFO: renamed from: o.nC$TaskDescription */
    public static final class TaskDescription {
        public float EZpvd;
        public float OLrzqt;
        public float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final float OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(float f) {
            this.EZpvd = f;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(float f) {
            this.OLrzqt = f;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C33684nC c33684nC) {
            this();
            Intrinsics.checkNotNullParameter(c33684nC, "");
            this.EZpvd = c33684nC.KWHzl();
            this.copydefault = c33684nC.AEQbTJ();
            this.OLrzqt = c33684nC.OLrzqt();
        }

        public final C33684nC EZpvd() {
            return new C33684nC(this, null);
        }
    }
}
