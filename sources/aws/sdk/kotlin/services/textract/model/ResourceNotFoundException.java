package aws.sdk.kotlin.services.textract.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ResourceNotFoundException extends TextractException {
    public static final Activity Companion = new Activity(null);
    private final String code;
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.textract.model.ResourceNotFoundException$Application) A[MD:(aws.sdk.kotlin.services.textract.model.ResourceNotFoundException$Application):void (m)] call: aws.sdk.kotlin.services.textract.model.ResourceNotFoundException.<init>(aws.sdk.kotlin.services.textract.model.ResourceNotFoundException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ResourceNotFoundException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private ResourceNotFoundException(Application application) {
        this.code = application.EZpvd();
        this.message = application.OLrzqt();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.textract.model.ResourceNotFoundException.Activity.<init>():void type: THIS */
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
        sb.append("ResourceNotFoundException(");
        sb.append("code=" + this.code + AbstractJsonLexerKt.COMMA);
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
        String str = this.code;
        int iHashCode = str != null ? str.hashCode() : 0;
        String message = getMessage();
        return (iHashCode * 31) + (message != null ? message.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ResourceNotFoundException.class != obj.getClass()) {
            return false;
        }
        ResourceNotFoundException resourceNotFoundException = (ResourceNotFoundException) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) resourceNotFoundException.code) && Intrinsics.EZpvd((Object) getMessage(), (Object) resourceNotFoundException.getMessage());
    }

    public static /* synthetic */ ResourceNotFoundException copy$default(ResourceNotFoundException resourceNotFoundException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.textract.model.ResourceNotFoundException.copy.1
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
        Application application = new Application(resourceNotFoundException);
        function1.invoke(application);
        return application.copydefault();
    }

    public final ResourceNotFoundException copy(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(this);
        function1.invoke(application);
        return application.copydefault();
    }

    public static final class Application {
        public String AEQbTJ;
        public String KWHzl;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String OLrzqt() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(String str) {
            this.AEQbTJ = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ResourceNotFoundException resourceNotFoundException) {
            this();
            Intrinsics.checkNotNullParameter(resourceNotFoundException, "");
            this.KWHzl = resourceNotFoundException.getCode();
            this.AEQbTJ = resourceNotFoundException.getMessage();
        }

        public final ResourceNotFoundException copydefault() {
            return new ResourceNotFoundException(this, null);
        }
    }
}
