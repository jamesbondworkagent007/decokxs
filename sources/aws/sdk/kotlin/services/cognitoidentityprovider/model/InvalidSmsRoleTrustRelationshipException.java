package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidSmsRoleTrustRelationshipException extends CognitoIdentityProviderException {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException$ActionBar) A[MD:(aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException$ActionBar):void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException.<init>(aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException$ActionBar):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InvalidSmsRoleTrustRelationshipException(ActionBar actionBar, DefaultConstructorMarker defaultConstructorMarker) {
        this(actionBar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private InvalidSmsRoleTrustRelationshipException(ActionBar actionBar) {
        this.message = actionBar.EZpvd();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException.StateListAnimator.<init>():void type: THIS */
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
        sb.append("InvalidSmsRoleTrustRelationshipException(");
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
        return obj != null && InvalidSmsRoleTrustRelationshipException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((InvalidSmsRoleTrustRelationshipException) obj).getMessage());
    }

    public static /* synthetic */ InvalidSmsRoleTrustRelationshipException copy$default(InvalidSmsRoleTrustRelationshipException invalidSmsRoleTrustRelationshipException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<ActionBar, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidSmsRoleTrustRelationshipException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ActionBar actionBar) {
                    Intrinsics.checkNotNullParameter(actionBar, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ActionBar actionBar) {
                    invoke2(actionBar);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(invalidSmsRoleTrustRelationshipException);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public final InvalidSmsRoleTrustRelationshipException copy(@NotNull Function1<? super ActionBar, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        ActionBar actionBar = new ActionBar(this);
        function1.invoke(actionBar);
        return actionBar.OLrzqt();
    }

    public static final class ActionBar {
        public String KWHzl;

        public final ActionBar AEQbTJ() {
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

        public ActionBar() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InvalidSmsRoleTrustRelationshipException invalidSmsRoleTrustRelationshipException) {
            this();
            Intrinsics.checkNotNullParameter(invalidSmsRoleTrustRelationshipException, "");
            this.KWHzl = invalidSmsRoleTrustRelationshipException.getMessage();
        }

        public final InvalidSmsRoleTrustRelationshipException OLrzqt() {
            return new InvalidSmsRoleTrustRelationshipException(this, null);
        }
    }
}
