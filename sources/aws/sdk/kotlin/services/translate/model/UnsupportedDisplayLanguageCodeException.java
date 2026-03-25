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
public final class UnsupportedDisplayLanguageCodeException extends TranslateException {
    public static final Application Companion = new Application(null);
    private final String displayLanguageCode;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.translate.model.UnsupportedDisplayLanguageCodeException$TaskDescription) A[MD:(aws.sdk.kotlin.services.translate.model.UnsupportedDisplayLanguageCodeException$TaskDescription):void (m)] call: aws.sdk.kotlin.services.translate.model.UnsupportedDisplayLanguageCodeException.<init>(aws.sdk.kotlin.services.translate.model.UnsupportedDisplayLanguageCodeException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UnsupportedDisplayLanguageCodeException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayLanguageCode() {
        return this.displayLanguageCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private UnsupportedDisplayLanguageCodeException(TaskDescription taskDescription) {
        this.displayLanguageCode = taskDescription.AEQbTJ();
        this.message = taskDescription.EZpvd();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.translate.model.UnsupportedDisplayLanguageCodeException.Application.<init>():void type: THIS */
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
        sb.append("UnsupportedDisplayLanguageCodeException(");
        sb.append("displayLanguageCode=" + this.displayLanguageCode + AbstractJsonLexerKt.COMMA);
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
        String str = this.displayLanguageCode;
        int iHashCode = str != null ? str.hashCode() : 0;
        String message = getMessage();
        return (iHashCode * 31) + (message != null ? message.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UnsupportedDisplayLanguageCodeException.class != obj.getClass()) {
            return false;
        }
        UnsupportedDisplayLanguageCodeException unsupportedDisplayLanguageCodeException = (UnsupportedDisplayLanguageCodeException) obj;
        return Intrinsics.EZpvd((Object) this.displayLanguageCode, (Object) unsupportedDisplayLanguageCodeException.displayLanguageCode) && Intrinsics.EZpvd((Object) getMessage(), (Object) unsupportedDisplayLanguageCodeException.getMessage());
    }

    public static /* synthetic */ UnsupportedDisplayLanguageCodeException copy$default(UnsupportedDisplayLanguageCodeException unsupportedDisplayLanguageCodeException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.translate.model.UnsupportedDisplayLanguageCodeException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull TaskDescription taskDescription) {
                    Intrinsics.checkNotNullParameter(taskDescription, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(TaskDescription taskDescription) {
                    invoke2(taskDescription);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(unsupportedDisplayLanguageCodeException);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public final UnsupportedDisplayLanguageCodeException copy(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(this);
        function1.invoke(taskDescription);
        return taskDescription.OLrzqt();
    }

    public static final class TaskDescription {
        public String KWHzl;
        public String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.OLrzqt = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void KWHzl(String str) {
            this.KWHzl = str;
        }

        public final TaskDescription copydefault() {
            return this;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull UnsupportedDisplayLanguageCodeException unsupportedDisplayLanguageCodeException) {
            this();
            Intrinsics.checkNotNullParameter(unsupportedDisplayLanguageCodeException, "");
            this.KWHzl = unsupportedDisplayLanguageCodeException.getDisplayLanguageCode();
            this.OLrzqt = unsupportedDisplayLanguageCodeException.getMessage();
        }

        public final UnsupportedDisplayLanguageCodeException OLrzqt() {
            return new UnsupportedDisplayLanguageCodeException(this, null);
        }
    }
}
