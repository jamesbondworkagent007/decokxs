package aws.sdk.kotlin.services.cognitoidentity.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidParameterException extends CognitoIdentityException {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.cognitoidentity.model.InvalidParameterException$Activity) A[MD:(aws.sdk.kotlin.services.cognitoidentity.model.InvalidParameterException$Activity):void (m)] call: aws.sdk.kotlin.services.cognitoidentity.model.InvalidParameterException.<init>(aws.sdk.kotlin.services.cognitoidentity.model.InvalidParameterException$Activity):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InvalidParameterException(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private InvalidParameterException(Activity activity) {
        this.message = activity.KWHzl();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.cognitoidentity.model.InvalidParameterException.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InvalidParameterException(");
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
        return obj != null && InvalidParameterException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((InvalidParameterException) obj).getMessage());
    }

    public static /* synthetic */ InvalidParameterException copy$default(InvalidParameterException invalidParameterException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<Activity, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentity.model.InvalidParameterException.copy.1
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
        Activity activity = new Activity(invalidParameterException);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public final InvalidParameterException copy(@NotNull Function1<? super Activity, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        Activity activity = new Activity(this);
        function1.invoke(activity);
        return activity.AEQbTJ();
    }

    public static final class Activity {
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        public final Activity copydefault() {
            return this;
        }

        public Activity() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull InvalidParameterException invalidParameterException) {
            this();
            Intrinsics.checkNotNullParameter(invalidParameterException, "");
            this.copydefault = invalidParameterException.getMessage();
        }

        public final InvalidParameterException AEQbTJ() {
            return new InvalidParameterException(this, null);
        }
    }
}
