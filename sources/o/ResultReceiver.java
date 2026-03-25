package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.ResultReceiver;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ResultReceiver {
    public static final Activity EZpvd = new Activity(null);
    public final SntpClient KWHzl;
    public final java.util.List<FileUriExposedViolation> OLrzqt;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 o.ResultReceiver$Application) A[MD:(o.ResultReceiver$Application):void (m)] call: o.ResultReceiver.<init>(o.ResultReceiver$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ResultReceiver(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SntpClient AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<FileUriExposedViolation> copydefault() {
        return this.OLrzqt;
    }

    public ResultReceiver(Application application) {
        this.KWHzl = application.KWHzl();
        this.OLrzqt = application.AEQbTJ();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ResultReceiver.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Geometry(");
        sb.append("boundingBox=" + this.KWHzl + AbstractJsonLexerKt.COMMA);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append("polygon=");
        sb2.append(this.OLrzqt);
        sb.append(sb2.toString());
        sb.append(")");
        java.lang.String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        SntpClient sntpClient = this.KWHzl;
        int iHashCode = sntpClient != null ? sntpClient.hashCode() : 0;
        java.util.List<FileUriExposedViolation> list = this.OLrzqt;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResultReceiver.class != obj.getClass()) {
            return false;
        }
        ResultReceiver resultReceiver = (ResultReceiver) obj;
        return Intrinsics.EZpvd(this.KWHzl, resultReceiver.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, resultReceiver.OLrzqt);
    }

    public static /* synthetic */ ResultReceiver copy$default(ResultReceiver resultReceiver, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.Geometry$copy$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ResultReceiver.Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ResultReceiver.Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(resultReceiver);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public static final class Application {
        public java.util.List<FileUriExposedViolation> EZpvd;
        public SntpClient OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<FileUriExposedViolation> AEQbTJ() {
            return this.EZpvd;
        }

        public final Application EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(SntpClient sntpClient) {
            this.OLrzqt = sntpClient;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SntpClient KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(java.util.List<FileUriExposedViolation> list) {
            this.EZpvd = list;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ResultReceiver resultReceiver) {
            this();
            Intrinsics.checkNotNullParameter(resultReceiver, "");
            this.OLrzqt = resultReceiver.AEQbTJ();
            this.EZpvd = resultReceiver.copydefault();
        }

        public final ResultReceiver OLrzqt() {
            return new ResultReceiver(this, null);
        }
    }
}
