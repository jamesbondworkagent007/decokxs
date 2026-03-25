package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidSmsRoleAccessPolicyException extends CognitoIdentityProviderException {
    public static final ActionBar Companion = new ActionBar(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException$TaskDescription) A[MD:(aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException$TaskDescription):void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException.<init>(aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException$TaskDescription):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InvalidSmsRoleAccessPolicyException(TaskDescription taskDescription, DefaultConstructorMarker defaultConstructorMarker) {
        this(taskDescription);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private InvalidSmsRoleAccessPolicyException(TaskDescription taskDescription) {
        this.message = taskDescription.KWHzl();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException.ActionBar.<init>():void type: THIS */
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
        sb.append("InvalidSmsRoleAccessPolicyException(");
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
        return obj != null && InvalidSmsRoleAccessPolicyException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((InvalidSmsRoleAccessPolicyException) obj).getMessage());
    }

    public static /* synthetic */ InvalidSmsRoleAccessPolicyException copy$default(InvalidSmsRoleAccessPolicyException invalidSmsRoleAccessPolicyException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<TaskDescription, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleAccessPolicyException.copy.1
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
        TaskDescription taskDescription = new TaskDescription(invalidSmsRoleAccessPolicyException);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public final InvalidSmsRoleAccessPolicyException copy(@NotNull Function1<? super TaskDescription, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        TaskDescription taskDescription = new TaskDescription(this);
        function1.invoke(taskDescription);
        return taskDescription.EZpvd();
    }

    public static final class TaskDescription {
        public String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        public final TaskDescription OLrzqt() {
            return this;
        }

        public TaskDescription() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull InvalidSmsRoleAccessPolicyException invalidSmsRoleAccessPolicyException) {
            this();
            Intrinsics.checkNotNullParameter(invalidSmsRoleAccessPolicyException, "");
            this.copydefault = invalidSmsRoleAccessPolicyException.getMessage();
        }

        public final InvalidSmsRoleAccessPolicyException EZpvd() {
            return new InvalidSmsRoleAccessPolicyException(this, null);
        }
    }
}
