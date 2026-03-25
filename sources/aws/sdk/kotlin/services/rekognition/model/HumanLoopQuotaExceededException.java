package aws.sdk.kotlin.services.rekognition.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class HumanLoopQuotaExceededException extends RekognitionException {
    public static final Activity Companion = new Activity(null);
    private final String code;
    private final String logref;
    private final String message;
    private final String quotaCode;
    private final String resourceType;
    private final String serviceCode;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.rekognition.model.HumanLoopQuotaExceededException$Application) A[MD:(aws.sdk.kotlin.services.rekognition.model.HumanLoopQuotaExceededException$Application):void (m)] call: aws.sdk.kotlin.services.rekognition.model.HumanLoopQuotaExceededException.<init>(aws.sdk.kotlin.services.rekognition.model.HumanLoopQuotaExceededException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HumanLoopQuotaExceededException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogref() {
        return this.logref;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuotaCode() {
        return this.quotaCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getResourceType() {
        return this.resourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceCode() {
        return this.serviceCode;
    }

    private HumanLoopQuotaExceededException(Application application) {
        this.code = application.EZpvd();
        this.logref = application.KWHzl();
        this.message = application.AEQbTJ();
        this.quotaCode = application.AhwBna();
        this.resourceType = application.AYXKKw();
        this.serviceCode = application.valueOf();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.rekognition.model.HumanLoopQuotaExceededException.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HumanLoopQuotaExceededException(");
        sb.append("code=" + this.code + AbstractJsonLexerKt.COMMA);
        sb.append("logref=" + this.logref + AbstractJsonLexerKt.COMMA);
        sb.append("message=" + getMessage() + AbstractJsonLexerKt.COMMA);
        sb.append("quotaCode=" + this.quotaCode + AbstractJsonLexerKt.COMMA);
        sb.append("resourceType=" + this.resourceType + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("serviceCode=");
        sb2.append(this.serviceCode);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String str = this.code;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.logref;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String message = getMessage();
        int iHashCode3 = message != null ? message.hashCode() : 0;
        String str3 = this.quotaCode;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.resourceType;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.serviceCode;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || HumanLoopQuotaExceededException.class != obj.getClass()) {
            return false;
        }
        HumanLoopQuotaExceededException humanLoopQuotaExceededException = (HumanLoopQuotaExceededException) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) humanLoopQuotaExceededException.code) && Intrinsics.EZpvd((Object) this.logref, (Object) humanLoopQuotaExceededException.logref) && Intrinsics.EZpvd((Object) getMessage(), (Object) humanLoopQuotaExceededException.getMessage()) && Intrinsics.EZpvd((Object) this.quotaCode, (Object) humanLoopQuotaExceededException.quotaCode) && Intrinsics.EZpvd((Object) this.resourceType, (Object) humanLoopQuotaExceededException.resourceType) && Intrinsics.EZpvd((Object) this.serviceCode, (Object) humanLoopQuotaExceededException.serviceCode);
    }

    public static /* synthetic */ HumanLoopQuotaExceededException copy$default(HumanLoopQuotaExceededException humanLoopQuotaExceededException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.rekognition.model.HumanLoopQuotaExceededException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Application application) {
                    Intrinsics.checkNotNullParameter(application, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Application application) {
                    invoke2(application);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(humanLoopQuotaExceededException);
        function1.invoke(application);
        return application.copydefault();
    }

    public final HumanLoopQuotaExceededException copy(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(this);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public String AEQbTJ;
        public String EZpvd;
        public String KWHzl;
        public String OLrzqt;
        public String copydefault;
        public String valueOf;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AYXKKw() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AYXKKw(String str) {
            this.valueOf = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AhwBna() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.OLrzqt = str;
        }

        public final Application OLrzqt() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String valueOf() {
            return this.valueOf;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull HumanLoopQuotaExceededException humanLoopQuotaExceededException) {
            this();
            Intrinsics.checkNotNullParameter(humanLoopQuotaExceededException, "");
            this.copydefault = humanLoopQuotaExceededException.getCode();
            this.KWHzl = humanLoopQuotaExceededException.getLogref();
            this.EZpvd = humanLoopQuotaExceededException.getMessage();
            this.OLrzqt = humanLoopQuotaExceededException.getQuotaCode();
            this.AEQbTJ = humanLoopQuotaExceededException.getResourceType();
            this.valueOf = humanLoopQuotaExceededException.getServiceCode();
        }

        public final HumanLoopQuotaExceededException copydefault() {
            return new HumanLoopQuotaExceededException(this, null);
        }
    }
}
