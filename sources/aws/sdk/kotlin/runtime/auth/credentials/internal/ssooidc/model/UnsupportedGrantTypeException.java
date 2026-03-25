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
public final class UnsupportedGrantTypeException extends SsoOidcException {
    public static final TaskDescription Companion = new TaskDescription(null);
    private final String error;
    private final String errorDescription;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException$StateListAnimator) A[MD:(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException$StateListAnimator):void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException.<init>(aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException$StateListAnimator):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ UnsupportedGrantTypeException(StateListAnimator stateListAnimator, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateListAnimator);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorDescription() {
        return this.errorDescription;
    }

    private UnsupportedGrantTypeException(StateListAnimator stateListAnimator) {
        this.error = stateListAnimator.copydefault();
        this.errorDescription = stateListAnimator.KWHzl();
        getSdkErrorMetadata().OLrzqt().OLrzqt(C52562wQ.EZpvd.copydefault(), ServiceException.ErrorType.Client);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException.TaskDescription.<init>():void type: THIS */
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
        sb.append("UnsupportedGrantTypeException(");
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
        if (obj == null || UnsupportedGrantTypeException.class != obj.getClass()) {
            return false;
        }
        UnsupportedGrantTypeException unsupportedGrantTypeException = (UnsupportedGrantTypeException) obj;
        return Intrinsics.EZpvd((Object) this.error, (Object) unsupportedGrantTypeException.error) && Intrinsics.EZpvd((Object) this.errorDescription, (Object) unsupportedGrantTypeException.errorDescription);
    }

    public static /* synthetic */ UnsupportedGrantTypeException copy$default(UnsupportedGrantTypeException unsupportedGrantTypeException, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1<StateListAnimator, Unit>() { // from class: aws.sdk.kotlin.runtime.auth.credentials.internal.ssooidc.model.UnsupportedGrantTypeException.copy.1
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
        StateListAnimator stateListAnimator = new StateListAnimator(unsupportedGrantTypeException);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public final UnsupportedGrantTypeException copy(@NotNull Function1<? super StateListAnimator, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        function1.invoke(stateListAnimator);
        return stateListAnimator.EZpvd();
    }

    public static final class StateListAnimator {
        public String KWHzl;
        public String copydefault;

        public final StateListAnimator AEQbTJ() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void AEQbTJ(String str) {
            this.KWHzl = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void EZpvd(String str) {
            this.copydefault = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String copydefault() {
            return this.KWHzl;
        }

        public StateListAnimator() {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull UnsupportedGrantTypeException unsupportedGrantTypeException) {
            this();
            Intrinsics.checkNotNullParameter(unsupportedGrantTypeException, "");
            this.KWHzl = unsupportedGrantTypeException.getError();
            this.copydefault = unsupportedGrantTypeException.getErrorDescription();
        }

        public final UnsupportedGrantTypeException EZpvd() {
            return new UnsupportedGrantTypeException(this, null);
        }
    }
}
