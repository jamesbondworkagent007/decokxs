package aws.sdk.kotlin.services.cognitoidentityprovider.model;

import aws.smithy.kotlin.runtime.ServiceException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C52562wQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class UnsupportedIdentityProviderException extends CognitoIdentityProviderException {
    public static final ActionBar Companion = new ActionBar(null);
    private final String message;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedIdentityProviderException$StateListAnimator) A[MD:(aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedIdentityProviderException$StateListAnimator):void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedIdentityProviderException.<init>(aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedIdentityProviderException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UnsupportedIdentityProviderException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    private UnsupportedIdentityProviderException(StateListAnimator stateListAnimator) {
        this.message = stateListAnimator.AEQbTJ();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedIdentityProviderException.ActionBar.<init>():void type: THIS */
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
        sb.append("UnsupportedIdentityProviderException(");
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
        return obj != null && UnsupportedIdentityProviderException.class == obj.getClass() && Intrinsics.EZpvd((Object) getMessage(), (Object) ((UnsupportedIdentityProviderException) obj).getMessage());
    }

    public static /* synthetic */ UnsupportedIdentityProviderException copy$default(UnsupportedIdentityProviderException unsupportedIdentityProviderException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.services.cognitoidentityprovider.model.UnsupportedIdentityProviderException.copy.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull StateListAnimator stateListAnimator) {
                    Intrinsics.checkNotNullParameter(stateListAnimator, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(StateListAnimator stateListAnimator) {
                    invoke2(stateListAnimator);
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(unsupportedIdentityProviderException);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public final UnsupportedIdentityProviderException copy(@NotNull Function1<? super StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        function1.invoke(stateListAnimator);
        return stateListAnimator.KWHzl();
    }

    public static final class StateListAnimator {
        public String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        public final StateListAnimator EZpvd() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void copydefault(String str) {
            this.EZpvd = str;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull UnsupportedIdentityProviderException unsupportedIdentityProviderException) {
            this();
            Intrinsics.checkNotNullParameter(unsupportedIdentityProviderException, "");
            this.EZpvd = unsupportedIdentityProviderException.getMessage();
        }

        public final UnsupportedIdentityProviderException KWHzl() {
            return new UnsupportedIdentityProviderException(this, null);
        }
    }
}
