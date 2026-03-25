package aws.sdk.kotlin.services.comprehend.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import o.ServiceSpecificException;
import o.StatsLogEventWrapper;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class InvalidRequestException extends ComprehendException {
    public static final Application Companion = new Application(null);
    private final ServiceSpecificException detail;
    private final String message;
    private final StatsLogEventWrapper reason;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.comprehend.model.InvalidRequestException$Activity) A[MD:(aws.sdk.kotlin.services.comprehend.model.InvalidRequestException$Activity):void (m)] call: aws.sdk.kotlin.services.comprehend.model.InvalidRequestException.<init>(aws.sdk.kotlin.services.comprehend.model.InvalidRequestException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InvalidRequestException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ServiceSpecificException getDetail() {
        return this.detail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StatsLogEventWrapper getReason() {
        return this.reason;
    }

    private InvalidRequestException(Activity activity) {
        this.detail = activity.AEQbTJ();
        this.message = activity.OLrzqt();
        this.reason = activity.KWHzl();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.comprehend.model.InvalidRequestException.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidRequestException(");
        sb.append("detail=" + this.detail + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + getMessage() + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("reason=");
        sb2.append(this.reason);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        ServiceSpecificException serviceSpecificException = this.detail;
        int iHashCode = serviceSpecificException != null ? serviceSpecificException.hashCode() : 0;
        String message = getMessage();
        int iHashCode2 = message != null ? message.hashCode() : 0;
        StatsLogEventWrapper statsLogEventWrapper = this.reason;
        return (((iHashCode * 31) + iHashCode2) * 31) + (statsLogEventWrapper != null ? statsLogEventWrapper.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InvalidRequestException.class != obj.getClass()) {
            return false;
        }
        InvalidRequestException invalidRequestException = (InvalidRequestException) obj;
        return Intrinsics.EZpvd(this.detail, invalidRequestException.detail) && Intrinsics.EZpvd((Object) getMessage(), (Object) invalidRequestException.getMessage()) && Intrinsics.EZpvd(this.reason, invalidRequestException.reason);
    }

    public static /* synthetic */ InvalidRequestException copy$default(InvalidRequestException invalidRequestException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.comprehend.model.InvalidRequestException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Activity activity) {
                    Intrinsics.checkNotNullParameter(activity, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Activity activity) {
                    invoke2(activity);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(invalidRequestException);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public final InvalidRequestException copy(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(this);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public String AEQbTJ;
        public ServiceSpecificException KWHzl;
        public StatsLogEventWrapper OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ServiceSpecificException AEQbTJ() {
            return this.KWHzl;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(ServiceSpecificException serviceSpecificException) {
            this.KWHzl = serviceSpecificException;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StatsLogEventWrapper KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(StatsLogEventWrapper statsLogEventWrapper) {
            this.OLrzqt = statsLogEventWrapper;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InvalidRequestException invalidRequestException) {
            this();
            Intrinsics.checkNotNullParameter(invalidRequestException, "");
            this.KWHzl = invalidRequestException.getDetail();
            this.AEQbTJ = invalidRequestException.getMessage();
            this.OLrzqt = invalidRequestException.getReason();
        }

        public final InvalidRequestException copydefault() {
            return new InvalidRequestException(this, null);
        }
    }
}
