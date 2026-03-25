package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.IncidentReportArgs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class IncidentReportArgs {
    public static final TaskDescription OLrzqt = new TaskDescription(null);
    public final java.lang.Float AEQbTJ;
    public final PerformanceCollector AYXKKw;
    public final java.util.List<ProxyInfo> EZpvd;
    public final java.lang.Integer KWHzl;
    public final java.lang.Integer copydefault;
    public final java.lang.String gEmmrt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.IncidentReportArgs$Activity) A[MD:(o.IncidentReportArgs$Activity):void (m)] call: o.IncidentReportArgs.<init>(o.IncidentReportArgs$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ IncidentReportArgs(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<ProxyInfo> AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Float copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PerformanceCollector gEmmrt() {
        return this.AYXKKw;
    }

    public IncidentReportArgs(Activity activity) {
        this.copydefault = activity.copydefault();
        this.EZpvd = activity.AEQbTJ();
        this.KWHzl = activity.EZpvd();
        this.AEQbTJ = activity.AhwBna();
        this.gEmmrt = activity.gEmmrt();
        this.AYXKKw = activity.valueOf();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.IncidentReportArgs.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Entity(");
        sb.append("beginOffset=" + this.copydefault + AbstractJsonLexerKt.COMMA);
        sb.append("blockReferences=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("endOffset=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("score=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("text=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("type=");
        sb2.append(this.AYXKKw);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.Integer num = this.copydefault;
        int iIntValue = num != null ? num.intValue() : 0;
        java.util.List<ProxyInfo> list = this.EZpvd;
        int iHashCode = list != null ? list.hashCode() : 0;
        java.lang.Integer num2 = this.KWHzl;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        java.lang.Float f = this.AEQbTJ;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        java.lang.String str = this.gEmmrt;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        PerformanceCollector performanceCollector = this.AYXKKw;
        return (((((((((iIntValue * 31) + iHashCode) * 31) + iIntValue2) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (performanceCollector != null ? performanceCollector.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || IncidentReportArgs.class != obj.getClass()) {
            return false;
        }
        IncidentReportArgs incidentReportArgs = (IncidentReportArgs) obj;
        return Intrinsics.EZpvd(this.copydefault, incidentReportArgs.copydefault) && Intrinsics.EZpvd(this.EZpvd, incidentReportArgs.EZpvd) && Intrinsics.EZpvd(this.KWHzl, incidentReportArgs.KWHzl) && Intrinsics.copydefault(this.AEQbTJ, incidentReportArgs.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.gEmmrt, (java.lang.Object) incidentReportArgs.gEmmrt) && Intrinsics.EZpvd(this.AYXKKw, incidentReportArgs.AYXKKw);
    }

    public static /* synthetic */ IncidentReportArgs copy$default(IncidentReportArgs incidentReportArgs, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.Entity$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull IncidentReportArgs.Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(IncidentReportArgs.Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(incidentReportArgs);
        function1.invoke(activity);
        return activity.OLrzqt();
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Activity {
        public java.lang.String AEQbTJ;
        public PerformanceCollector AhwBna;
        public java.lang.Integer EZpvd;
        public java.util.List<ProxyInfo> KWHzl;
        public java.lang.Integer OLrzqt;
        public java.lang.Float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<ProxyInfo> AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Float AhwBna() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(java.lang.Integer num) {
            this.EZpvd = num;
        }

        public final Activity KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.lang.Float f) {
            this.copydefault = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<ProxyInfo> list) {
            this.KWHzl = list;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(PerformanceCollector performanceCollector) {
            this.AhwBna = performanceCollector;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(java.lang.String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Integer copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(java.lang.Integer num) {
            this.OLrzqt = num;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String gEmmrt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PerformanceCollector valueOf() {
            return this.AhwBna;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull IncidentReportArgs incidentReportArgs) {
            this();
            Intrinsics.checkNotNullParameter(incidentReportArgs, "");
            this.OLrzqt = incidentReportArgs.EZpvd();
            this.KWHzl = incidentReportArgs.AEQbTJ();
            this.EZpvd = incidentReportArgs.KWHzl();
            this.copydefault = incidentReportArgs.copydefault();
            this.AEQbTJ = incidentReportArgs.OLrzqt();
            this.AhwBna = incidentReportArgs.gEmmrt();
        }

        public final IncidentReportArgs OLrzqt() {
            return new IncidentReportArgs(this, null);
        }
    }
}
