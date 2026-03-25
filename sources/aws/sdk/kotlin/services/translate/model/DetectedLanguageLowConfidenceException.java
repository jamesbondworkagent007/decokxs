package aws.sdk.kotlin.services.translate.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class DetectedLanguageLowConfidenceException extends TranslateException {
    public static final ActionBar Companion = new ActionBar(null);
    private final String detectedLanguageCode;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.translate.model.DetectedLanguageLowConfidenceException$Application) A[MD:(aws.sdk.kotlin.services.translate.model.DetectedLanguageLowConfidenceException$Application):void (m)] call: aws.sdk.kotlin.services.translate.model.DetectedLanguageLowConfidenceException.<init>(aws.sdk.kotlin.services.translate.model.DetectedLanguageLowConfidenceException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DetectedLanguageLowConfidenceException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectedLanguageCode() {
        return this.detectedLanguageCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private DetectedLanguageLowConfidenceException(Application application) {
        this.detectedLanguageCode = application.OLrzqt();
        this.message = application.copydefault();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.translate.model.DetectedLanguageLowConfidenceException.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DetectedLanguageLowConfidenceException(");
        sb.append("detectedLanguageCode=" + this.detectedLanguageCode + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("message=");
        sb2.append(getMessage());
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String str = this.detectedLanguageCode;
        int iHashCode = str != null ? str.hashCode() : 0;
        String message = getMessage();
        return (iHashCode * 31) + (message != null ? message.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DetectedLanguageLowConfidenceException.class != obj.getClass()) {
            return false;
        }
        DetectedLanguageLowConfidenceException detectedLanguageLowConfidenceException = (DetectedLanguageLowConfidenceException) obj;
        return Intrinsics.EZpvd((Object) this.detectedLanguageCode, (Object) detectedLanguageLowConfidenceException.detectedLanguageCode) && Intrinsics.EZpvd((Object) getMessage(), (Object) detectedLanguageLowConfidenceException.getMessage());
    }

    public static /* synthetic */ DetectedLanguageLowConfidenceException copy$default(DetectedLanguageLowConfidenceException detectedLanguageLowConfidenceException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.DetectedLanguageLowConfidenceException.copy.1
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
        Application application = new Application(detectedLanguageLowConfidenceException);
        function1.invoke(application);
        return application.KWHzl();
    }

    public final DetectedLanguageLowConfidenceException copy(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(this);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public String EZpvd;
        public String KWHzl;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(String str) {
            this.KWHzl = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DetectedLanguageLowConfidenceException detectedLanguageLowConfidenceException) {
            this();
            Intrinsics.checkNotNullParameter(detectedLanguageLowConfidenceException, "");
            this.EZpvd = detectedLanguageLowConfidenceException.getDetectedLanguageCode();
            this.KWHzl = detectedLanguageLowConfidenceException.getMessage();
        }

        public final DetectedLanguageLowConfidenceException KWHzl() {
            return new DetectedLanguageLowConfidenceException(this, null);
        }
    }
}
