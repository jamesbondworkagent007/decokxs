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
public final class UnsupportedLanguagePairException extends TranslateException {
    public static final Application Companion = new Application(null);
    private final String message;
    private final String sourceLanguageCode;
    private final String targetLanguageCode;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.translate.model.UnsupportedLanguagePairException$Activity) A[MD:(aws.sdk.kotlin.services.translate.model.UnsupportedLanguagePairException$Activity):void (m)] call: aws.sdk.kotlin.services.translate.model.UnsupportedLanguagePairException.<init>(aws.sdk.kotlin.services.translate.model.UnsupportedLanguagePairException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UnsupportedLanguagePairException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceLanguageCode() {
        return this.sourceLanguageCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTargetLanguageCode() {
        return this.targetLanguageCode;
    }

    private UnsupportedLanguagePairException(Activity activity) {
        this.message = activity.OLrzqt();
        this.sourceLanguageCode = activity.KWHzl();
        this.targetLanguageCode = activity.AEQbTJ();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.translate.model.UnsupportedLanguagePairException.Application.<init>():void type: THIS */
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
        sb.append("UnsupportedLanguagePairException(");
        sb.append("message=" + getMessage() + AbstractJsonLexerKt.COMMA);
        sb.append("sourceLanguageCode=" + this.sourceLanguageCode + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("targetLanguageCode=");
        sb2.append(this.targetLanguageCode);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String message = getMessage();
        int iHashCode = message != null ? message.hashCode() : 0;
        String str = this.sourceLanguageCode;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.targetLanguageCode;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UnsupportedLanguagePairException.class != obj.getClass()) {
            return false;
        }
        UnsupportedLanguagePairException unsupportedLanguagePairException = (UnsupportedLanguagePairException) obj;
        return Intrinsics.EZpvd((Object) getMessage(), (Object) unsupportedLanguagePairException.getMessage()) && Intrinsics.EZpvd((Object) this.sourceLanguageCode, (Object) unsupportedLanguagePairException.sourceLanguageCode) && Intrinsics.EZpvd((Object) this.targetLanguageCode, (Object) unsupportedLanguagePairException.targetLanguageCode);
    }

    public static /* synthetic */ UnsupportedLanguagePairException copy$default(UnsupportedLanguagePairException unsupportedLanguagePairException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.UnsupportedLanguagePairException.copy.1
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
        Activity activity = new Activity(unsupportedLanguagePairException);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public final UnsupportedLanguagePairException copy(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(this);
        function1.invoke(activity);
        return activity.copydefault();
    }

    public static final class Activity {
        public String EZpvd;
        public String KWHzl;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.OLrzqt = str;
        }

        public final Activity EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.EZpvd = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.EZpvd;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull UnsupportedLanguagePairException unsupportedLanguagePairException) {
            this();
            Intrinsics.checkNotNullParameter(unsupportedLanguagePairException, "");
            this.EZpvd = unsupportedLanguagePairException.getMessage();
            this.OLrzqt = unsupportedLanguagePairException.getSourceLanguageCode();
            this.KWHzl = unsupportedLanguagePairException.getTargetLanguageCode();
        }

        public final UnsupportedLanguagePairException copydefault() {
            return new UnsupportedLanguagePairException(this, null);
        }
    }
}
