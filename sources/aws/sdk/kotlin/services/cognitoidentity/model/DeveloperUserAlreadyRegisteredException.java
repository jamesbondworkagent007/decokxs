package aws.sdk.kotlin.services.cognitoidentity.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class DeveloperUserAlreadyRegisteredException extends CognitoIdentityException {
    public static final Activity Companion = new Activity(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException$Application) A[MD:(aws.sdk.kotlin.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException$Application):void (m)] call: aws.sdk.kotlin.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException.<init>(aws.sdk.kotlin.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException$Application):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DeveloperUserAlreadyRegisteredException(Application application, DefaultConstructorMarker defaultConstructorMarker) {
        this(application);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private DeveloperUserAlreadyRegisteredException(Application application) {
        this.message = application.EZpvd();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException.Activity.<init>():void type: THIS */
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
        sb.append("DeveloperUserAlreadyRegisteredException(");
        sb.append("message=" + getMessage());
        sb.append(")");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            return message.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && DeveloperUserAlreadyRegisteredException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((DeveloperUserAlreadyRegisteredException) obj).getMessage());
    }

    public static /* synthetic */ DeveloperUserAlreadyRegisteredException copy$default(DeveloperUserAlreadyRegisteredException developerUserAlreadyRegisteredException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Application, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException.copy.1
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
        Application application = new Application(developerUserAlreadyRegisteredException);
        function1.invoke(application);
        return application.KWHzl();
    }

    public final DeveloperUserAlreadyRegisteredException copy(@NotNull Function1<? super Application, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Application application = new Application(this);
        function1.invoke(application);
        return application.KWHzl();
    }

    public static final class Application {
        public String KWHzl;

        public final Application AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void OLrzqt(String str) {
            this.KWHzl = str;
        }

        public Application() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DeveloperUserAlreadyRegisteredException developerUserAlreadyRegisteredException) {
            this();
            Intrinsics.checkNotNullParameter(developerUserAlreadyRegisteredException, "");
            this.KWHzl = developerUserAlreadyRegisteredException.getMessage();
        }

        public final DeveloperUserAlreadyRegisteredException KWHzl() {
            return new DeveloperUserAlreadyRegisteredException(this, null);
        }
    }
}
