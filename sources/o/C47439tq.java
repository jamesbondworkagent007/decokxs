package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C47439tq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C47439tq {
    public static final Activity copydefault = new Activity(null);
    public final C46510tX EZpvd;
    public final C46537tY KWHzl;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.tq$TaskDescription) A[MD:(o.tq$TaskDescription):void (m)] call: o.tq.<init>(o.tq$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ C47439tq(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46537tY EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46510tX OLrzqt() {
        return this.EZpvd;
    }

    public C47439tq(TaskDescription taskDescription) {
        this.KWHzl = taskDescription.KWHzl();
        this.EZpvd = taskDescription.copydefault();
    }

    /* JADX INFO: renamed from: o.tq$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tq.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ImportTerminologyResponse(");
        sb.append("auxiliaryDataLocation=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("terminologyProperties=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        C46537tY c46537tY = this.KWHzl;
        int iHashCode = c46537tY != null ? c46537tY.hashCode() : 0;
        C46510tX c46510tX = this.EZpvd;
        return (iHashCode * 31) + (c46510tX != null ? c46510tX.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C47439tq.class != obj.getClass()) {
            return false;
        }
        C47439tq c47439tq = (C47439tq) obj;
        return Intrinsics.EZpvd(this.KWHzl, c47439tq.KWHzl) && Intrinsics.EZpvd(this.EZpvd, c47439tq.EZpvd);
    }

    public static /* synthetic */ C47439tq copy$default(C47439tq c47439tq, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.ImportTerminologyResponse$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull C47439tq.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(C47439tq.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(c47439tq);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    /* JADX INFO: renamed from: o.tq$TaskDescription */
    public static final class TaskDescription {
        public C46510tX AEQbTJ;
        public C46537tY OLrzqt;

        public final TaskDescription AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46537tY KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C46510tX c46510tX) {
            this.AEQbTJ = c46510tX;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(C46537tY c46537tY) {
            this.OLrzqt = c46537tY;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C46510tX copydefault() {
            return this.AEQbTJ;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C47439tq c47439tq) {
            this();
            Intrinsics.checkNotNullParameter(c47439tq, "");
            this.OLrzqt = c47439tq.EZpvd();
            this.AEQbTJ = c47439tq.OLrzqt();
        }

        public final C47439tq OLrzqt() {
            return new C47439tq(this, null);
        }
    }
}
