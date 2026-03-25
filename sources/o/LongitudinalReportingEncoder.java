package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.LongitudinalReportingEncoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class LongitudinalReportingEncoder {
    public static final StateListAnimator OLrzqt = new StateListAnimator(null);
    public final java.lang.String AEQbTJ;
    public final C5173Hn EZpvd;
    public final C5173Hn KWHzl;
    public final StatsDimensionsValue copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.LongitudinalReportingEncoder$TaskDescription) A[MD:(o.LongitudinalReportingEncoder$TaskDescription):void (m)] call: o.LongitudinalReportingEncoder.<init>(o.LongitudinalReportingEncoder$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LongitudinalReportingEncoder(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5173Hn OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsDimensionsValue copydefault() {
        return this.copydefault;
    }

    public LongitudinalReportingEncoder(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.AEQbTJ();
        this.copydefault = taskDescription.EZpvd();
        this.KWHzl = taskDescription.KWHzl();
        this.EZpvd = taskDescription.OLrzqt();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.LongitudinalReportingEncoder.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopicsDetectionJobFilter(");
        sb.append("jobName=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobStatus=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("submitTimeAfter=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("submitTimeBefore=");
        sb2.append(this.EZpvd);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        StatsDimensionsValue statsDimensionsValue = this.copydefault;
        int iHashCode2 = statsDimensionsValue != null ? statsDimensionsValue.hashCode() : 0;
        C5173Hn c5173Hn = this.KWHzl;
        int iHashCode3 = c5173Hn != null ? c5173Hn.hashCode() : 0;
        C5173Hn c5173Hn2 = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c5173Hn2 != null ? c5173Hn2.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LongitudinalReportingEncoder.class != obj.getClass()) {
            return false;
        }
        LongitudinalReportingEncoder longitudinalReportingEncoder = (LongitudinalReportingEncoder) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) longitudinalReportingEncoder.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, longitudinalReportingEncoder.copydefault) && Intrinsics.EZpvd(this.KWHzl, longitudinalReportingEncoder.KWHzl) && Intrinsics.EZpvd(this.EZpvd, longitudinalReportingEncoder.EZpvd);
    }

    public static /* synthetic */ LongitudinalReportingEncoder copy$default(LongitudinalReportingEncoder longitudinalReportingEncoder, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.TopicsDetectionJobFilter$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull LongitudinalReportingEncoder.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(LongitudinalReportingEncoder.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(longitudinalReportingEncoder);
        function1.invoke(taskDescription);
        return taskDescription.copydefault();
    }

    public static final class TaskDescription {
        public StatsDimensionsValue AEQbTJ;
        public C5173Hn EZpvd;
        public java.lang.String OLrzqt;
        public C5173Hn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsDimensionsValue EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C5173Hn OLrzqt() {
            return this.EZpvd;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull LongitudinalReportingEncoder longitudinalReportingEncoder) {
            this();
            Intrinsics.checkNotNullParameter(longitudinalReportingEncoder, "");
            this.OLrzqt = longitudinalReportingEncoder.EZpvd();
            this.AEQbTJ = longitudinalReportingEncoder.copydefault();
            this.copydefault = longitudinalReportingEncoder.KWHzl();
            this.EZpvd = longitudinalReportingEncoder.OLrzqt();
        }

        public final LongitudinalReportingEncoder copydefault() {
            return new LongitudinalReportingEncoder(this, null);
        }
    }
}
