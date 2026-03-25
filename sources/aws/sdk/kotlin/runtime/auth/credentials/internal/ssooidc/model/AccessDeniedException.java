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
public final class AccessDeniedException extends SsoOidcException {
    public static final Application Companion = new Application(null);
    private final String error;
    private final String errorDescription;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AccessDeniedException$Activity) A[MD:(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AccessDeniedException$Activity):void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AccessDeniedException.<init>(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AccessDeniedException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AccessDeniedException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    private AccessDeniedException(Activity activity) {
        this.error = activity.copydefault();
        this.errorDescription = activity.OLrzqt();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AccessDeniedException.Application.<init>():void type: THIS */
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
        sb.append("AccessDeniedException(");
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
        if (obj == null || AccessDeniedException.class != obj.getClass()) {
            return false;
        }
        AccessDeniedException accessDeniedException = (AccessDeniedException) obj;
        return Intrinsics.EZpvd((Object) this.error, (Object) accessDeniedException.error) && Intrinsics.EZpvd((Object) this.errorDescription, (Object) accessDeniedException.errorDescription);
    }

    public static /* synthetic */ AccessDeniedException copy$default(AccessDeniedException accessDeniedException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.AccessDeniedException.copy.1
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
        Activity activity = new Activity(accessDeniedException);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public final AccessDeniedException copy(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(this);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public String AEQbTJ;
        public String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.AEQbTJ = str;
        }

        public final Activity KWHzl() {
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
            return this.AEQbTJ;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull AccessDeniedException accessDeniedException) {
            this();
            Intrinsics.checkNotNullParameter(accessDeniedException, "");
            this.AEQbTJ = accessDeniedException.getError();
            this.EZpvd = accessDeniedException.getErrorDescription();
        }

        public final AccessDeniedException EZpvd() {
            return new AccessDeniedException(this, null);
        }
    }
}
