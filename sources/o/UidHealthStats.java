package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.UidHealthStats;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class UidHealthStats {
    public static final Application AEQbTJ = new Application(null);
    public final java.lang.Integer KWHzl;
    public final LongitudinalReportingEncoder OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.UidHealthStats$TaskDescription) A[MD:(o.UidHealthStats$TaskDescription):void (m)] call: o.UidHealthStats.<init>(o.UidHealthStats$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UidHealthStats(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LongitudinalReportingEncoder EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer copydefault() {
        return this.KWHzl;
    }

    public UidHealthStats(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.KWHzl();
        this.KWHzl = taskDescription.copydefault();
        this.copydefault = taskDescription.EZpvd();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UidHealthStats.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final UidHealthStats EZpvd(@NotNull Function1<? super TaskDescription, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            TaskDescription taskDescription = new TaskDescription();
            function1.invoke(taskDescription);
            return taskDescription.AEQbTJ();
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ListTopicsDetectionJobsRequest(");
        sb.append("filter=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("maxResults=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("nextToken=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        LongitudinalReportingEncoder longitudinalReportingEncoder = this.OLrzqt;
        int iHashCode = longitudinalReportingEncoder != null ? longitudinalReportingEncoder.hashCode() : 0;
        java.lang.Integer num = this.KWHzl;
        int iIntValue = num != null ? num.intValue() : 0;
        java.lang.String str = this.copydefault;
        return (((iHashCode * 31) + iIntValue) * 31) + (str != null ? str.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UidHealthStats.class != obj.getClass()) {
            return false;
        }
        UidHealthStats uidHealthStats = (UidHealthStats) obj;
        return Intrinsics.EZpvd(this.OLrzqt, uidHealthStats.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, uidHealthStats.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) uidHealthStats.copydefault);
    }

    public static /* synthetic */ UidHealthStats copy$default(UidHealthStats uidHealthStats, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.ListTopicsDetectionJobsRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UidHealthStats.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UidHealthStats.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(uidHealthStats);
        function1.invoke(taskDescription);
        return taskDescription.AEQbTJ();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        public java.lang.String EZpvd;
        public java.lang.Integer OLrzqt;
        public LongitudinalReportingEncoder copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LongitudinalReportingEncoder KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.OLrzqt;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull UidHealthStats uidHealthStats) {
            this();
            Intrinsics.checkNotNullParameter(uidHealthStats, "");
            this.copydefault = uidHealthStats.EZpvd();
            this.OLrzqt = uidHealthStats.copydefault();
            this.EZpvd = uidHealthStats.AEQbTJ();
        }

        public final UidHealthStats AEQbTJ() {
            return new UidHealthStats(this, null);
        }
    }
}
