package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.TimeInterpolator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class TimeInterpolator {
    public static final TaskDescription KWHzl = new TaskDescription(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.TimeInterpolator$Application) A[MD:(o.TimeInterpolator$Application):void (m)] call: o.TimeInterpolator.<init>(o.TimeInterpolator$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ TimeInterpolator(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.copydefault;
    }

    public TimeInterpolator(Application application) {
        this.AEQbTJ = application.copydefault();
        this.OLrzqt = application.EZpvd();
        this.copydefault = application.KWHzl();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.TimeInterpolator.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateUserImportJobRequest(");
        sb.append("cloudWatchLogsRoleArn=" + this.AEQbTJ + AbstractJsonLexerKt.COMMA);
        sb.append("jobName=" + this.OLrzqt + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("userPoolId=");
        sb2.append(this.copydefault);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        int iHashCode = str != null ? str.hashCode() : 0;
        java.lang.String str2 = this.OLrzqt;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        java.lang.String str3 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TimeInterpolator.class != obj.getClass()) {
            return false;
        }
        TimeInterpolator timeInterpolator = (TimeInterpolator) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) timeInterpolator.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) timeInterpolator.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) timeInterpolator.copydefault);
    }

    public static /* synthetic */ TimeInterpolator copy$default(TimeInterpolator timeInterpolator, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.CreateUserImportJobRequest$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TimeInterpolator.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TimeInterpolator.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(timeInterpolator);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public static final class Application {
        public java.lang.String AEQbTJ;
        public java.lang.String KWHzl;
        public java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull TimeInterpolator timeInterpolator) {
            this();
            Intrinsics.checkNotNullParameter(timeInterpolator, "");
            this.AEQbTJ = timeInterpolator.EZpvd();
            this.OLrzqt = timeInterpolator.AEQbTJ();
            this.KWHzl = timeInterpolator.OLrzqt();
        }

        public final TimeInterpolator OLrzqt() {
            return new TimeInterpolator(this, null);
        }
    }
}
