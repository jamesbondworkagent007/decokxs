package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class UserPoolTaggingException extends CognitoIdentityProviderException {
    public static final ActionBar Companion = new ActionBar(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolTaggingException$Activity) A[MD:(aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolTaggingException$Activity):void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolTaggingException.<init>(aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolTaggingException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UserPoolTaggingException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private UserPoolTaggingException(Activity activity) {
        this.message = activity.KWHzl();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolTaggingException.ActionBar.<init>():void type: THIS */
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
        sb.append("UserPoolTaggingException(");
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
        return obj != null && UserPoolTaggingException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((UserPoolTaggingException) obj).getMessage());
    }

    public static /* synthetic */ UserPoolTaggingException copy$default(UserPoolTaggingException userPoolTaggingException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UserPoolTaggingException.copy.1
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
        Activity activity = new Activity(userPoolTaggingException);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public final UserPoolTaggingException copy(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(this);
        function1.invoke(activity);
        return activity.EZpvd();
    }

    public static final class Activity {
        public String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.AEQbTJ = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.AEQbTJ;
        }

        public final Activity OLrzqt() {
            return this;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull UserPoolTaggingException userPoolTaggingException) {
            this();
            Intrinsics.checkNotNullParameter(userPoolTaggingException, "");
            this.AEQbTJ = userPoolTaggingException.getMessage();
        }

        public final UserPoolTaggingException EZpvd() {
            return new UserPoolTaggingException(this, null);
        }
    }
}
