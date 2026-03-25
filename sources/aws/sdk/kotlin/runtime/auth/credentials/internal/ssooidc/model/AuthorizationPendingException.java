package aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AuthorizationPendingException extends SsoOidcException {
    public static final TaskDescription Companion = new TaskDescription(null);
    private final String error;
    private final String errorDescription;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AuthorizationPendingException$Application) A[MD:(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AuthorizationPendingException$Application):void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AuthorizationPendingException.<init>(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AuthorizationPendingException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AuthorizationPendingException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    private AuthorizationPendingException(Application application) {
        this.error = application.AEQbTJ();
        this.errorDescription = application.EZpvd();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AuthorizationPendingException.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AuthorizationPendingException(");
        sb.append("error=" + this.error + AbstractJsonLexerKt.COMMA);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("errorDescription=");
        sb2.append(this.errorDescription);
        sb.append(sb2.toString());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String str = this.error;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.errorDescription;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthorizationPendingException.class != obj.getClass()) {
            return false;
        }
        AuthorizationPendingException authorizationPendingException = (AuthorizationPendingException) obj;
        return Intrinsics.EZpvd((Object) this.error, (Object) authorizationPendingException.error) && Intrinsics.EZpvd((Object) this.errorDescription, (Object) authorizationPendingException.errorDescription);
    }

    public static /* synthetic */ AuthorizationPendingException copy$default(AuthorizationPendingException authorizationPendingException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AuthorizationPendingException.copy.1
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
        Application application = new Application(authorizationPendingException);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public final AuthorizationPendingException copy(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(this);
        function1.invoke(application);
        return application.OLrzqt();
    }

    public static final class Application {
        public String AEQbTJ;
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.AEQbTJ;
        }

        public final Application KWHzl() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(String str) {
            this.AEQbTJ = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull AuthorizationPendingException authorizationPendingException) {
            this();
            Intrinsics.checkNotNullParameter(authorizationPendingException, "");
            this.copydefault = authorizationPendingException.getError();
            this.AEQbTJ = authorizationPendingException.getErrorDescription();
        }

        public final AuthorizationPendingException OLrzqt() {
            return new AuthorizationPendingException(this, null);
        }
    }
}
