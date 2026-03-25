package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.UrlQuerySanitizer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class UrlQuerySanitizer {
    public static final Activity copydefault = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.util.List<PrinterDiscoverySession> AhwBna;
    public final ValidationProbeEvent EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final IpConnectivityLog gEmmrt;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.UrlQuerySanitizer$TaskDescription) A[MD:(o.UrlQuerySanitizer$TaskDescription):void (m)] call: o.UrlQuerySanitizer.<init>(o.UrlQuerySanitizer$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UrlQuerySanitizer(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ValidationProbeEvent AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IpConnectivityLog AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<PrinterDiscoverySession> gEmmrt() {
        return this.AhwBna;
    }

    public UrlQuerySanitizer(TaskDescription taskDescription) {
        this.OLrzqt = taskDescription.AEQbTJ();
        this.KWHzl = taskDescription.EZpvd();
        this.EZpvd = taskDescription.copydefault();
        this.AEQbTJ = taskDescription.OLrzqt();
        this.valueOf = taskDescription.AYXKKw();
        this.gEmmrt = taskDescription.AhwBna();
        this.AhwBna = taskDescription.gEmmrt();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.UrlQuerySanitizer.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateDatasetRequest(");
        sb.append("clientRequestToken=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        sb.append("datasetName=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        sb.append("datasetType=" + this.EZpvd + AbstractJsonLexerKt.COMMA);
        sb.append("description=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("flywheelArn=" + this.valueOf + AbstractJsonLexerKt.COMMA);
        sb.append("inputDataConfig=" + this.gEmmrt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("tags=");
        sb2.append(this.AhwBna);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        ValidationProbeEvent validationProbeEvent = this.EZpvd;
        int iHashCode3 = validationProbeEvent != null ? validationProbeEvent.hashCode() : 0;
        java.lang.String str3 = this.AEQbTJ;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        java.lang.String str4 = this.valueOf;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        IpConnectivityLog ipConnectivityLog = this.gEmmrt;
        int iHashCode6 = ipConnectivityLog != null ? ipConnectivityLog.hashCode() : 0;
        java.util.List<PrinterDiscoverySession> list = this.AhwBna;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlQuerySanitizer.class != obj.getClass()) {
            return false;
        }
        UrlQuerySanitizer urlQuerySanitizer = (UrlQuerySanitizer) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) urlQuerySanitizer.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) urlQuerySanitizer.KWHzl) && Intrinsics.EZpvd(this.EZpvd, urlQuerySanitizer.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) urlQuerySanitizer.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.valueOf, (java.lang.Object) urlQuerySanitizer.valueOf) && Intrinsics.EZpvd(this.gEmmrt, urlQuerySanitizer.gEmmrt) && Intrinsics.EZpvd(this.AhwBna, urlQuerySanitizer.AhwBna);
    }

    public static /* synthetic */ UrlQuerySanitizer copy$default(UrlQuerySanitizer urlQuerySanitizer, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.CreateDatasetRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull UrlQuerySanitizer.TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(UrlQuerySanitizer.TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(urlQuerySanitizer);
        function1.invoke(taskDescription);
        return taskDescription.KWHzl();
    }

    public static final class TaskDescription {
        public java.lang.String AEQbTJ;
        public java.util.List<PrinterDiscoverySession> AhwBna;
        public java.lang.String EZpvd;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;
        public ValidationProbeEvent copydefault;
        public IpConnectivityLog djBIcL;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final IpConnectivityLog AhwBna() {
            return this.djBIcL;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ValidationProbeEvent copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PrinterDiscoverySession> gEmmrt() {
            return this.AhwBna;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull UrlQuerySanitizer urlQuerySanitizer) {
            this();
            Intrinsics.checkNotNullParameter(urlQuerySanitizer, "");
            this.KWHzl = urlQuerySanitizer.OLrzqt();
            this.AEQbTJ = urlQuerySanitizer.KWHzl();
            this.copydefault = urlQuerySanitizer.AEQbTJ();
            this.OLrzqt = urlQuerySanitizer.copydefault();
            this.EZpvd = urlQuerySanitizer.EZpvd();
            this.djBIcL = urlQuerySanitizer.AYXKKw();
            this.AhwBna = urlQuerySanitizer.gEmmrt();
        }

        public final UrlQuerySanitizer KWHzl() {
            return new UrlQuerySanitizer(this, null);
        }
    }
}
