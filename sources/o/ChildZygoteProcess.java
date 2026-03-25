package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ChildZygoteProcess;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ChildZygoteProcess {
    public static final Activity copydefault = new Activity(null);
    public final SynchronousResultReceiver AEQbTJ;
    public final java.util.List<LongitudinalReportingConfig> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ChildZygoteProcess$TaskDescription) A[MD:(o.ChildZygoteProcess$TaskDescription):void (m)] call: o.ChildZygoteProcess.<init>(o.ChildZygoteProcess$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ChildZygoteProcess(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SynchronousResultReceiver KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<LongitudinalReportingConfig> copydefault() {
        return this.OLrzqt;
    }

    public ChildZygoteProcess(TaskDescription taskDescription) {
        this.AEQbTJ = taskDescription.KWHzl();
        this.OLrzqt = taskDescription.AEQbTJ();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ChildZygoteProcess.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetectToxicContentRequest(");
        sb.append("languageCode=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("textSegments=*** Sensitive Data Redacted ***");
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SynchronousResultReceiver synchronousResultReceiver = this.AEQbTJ;
        int iHashCode = synchronousResultReceiver != null ? synchronousResultReceiver.hashCode() : 0;
        java.util.List<LongitudinalReportingConfig> list = this.OLrzqt;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChildZygoteProcess.class != obj.getClass()) {
            return false;
        }
        ChildZygoteProcess childZygoteProcess = (ChildZygoteProcess) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, childZygoteProcess.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, childZygoteProcess.OLrzqt);
    }

    public static /* synthetic */ ChildZygoteProcess copy$default(ChildZygoteProcess childZygoteProcess, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.DetectToxicContentRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ChildZygoteProcess.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ChildZygoteProcess.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(childZygoteProcess);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public java.util.List<LongitudinalReportingConfig> AEQbTJ;
        public SynchronousResultReceiver KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<LongitudinalReportingConfig> AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SynchronousResultReceiver KWHzl() {
            return this.KWHzl;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull ChildZygoteProcess childZygoteProcess) {
            this();
            Intrinsics.checkNotNullParameter(childZygoteProcess, "");
            this.KWHzl = childZygoteProcess.KWHzl();
            this.AEQbTJ = childZygoteProcess.copydefault();
        }

        public final ChildZygoteProcess EZpvd() {
            return new ChildZygoteProcess(this, null);
        }
    }
}
